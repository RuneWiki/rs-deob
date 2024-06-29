import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nka")
public class class36 extends class606 {
   @OriginalMember(
      owner = "client!nka",
      name = "I",
      descriptor = "[I"
   )
   private int[] field526 = new int[257];
   @OriginalMember(
      owner = "client!nka",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field538 = new String[]{method417(method416("s~[wf5")), method417(method416("f;\u0014wY")), method417(method416("s`V5")), method417(method416("s~[wn5")), method417(method416("T{L8Htq\u001a>V|qS<Ji5J+AnpN")), method417(method416("s~[wa5")), method417(method416("s~[wg5")), method417(method416("s~[we5")), method417(method416("s~[wc5")), method417(method416("s~[wo5")), method417(method416("n/V+")), method417(method416("s~[wm5"))};
   @OriginalMember(
      owner = "client!nka",
      name = "H",
      descriptor = "I"
   )
   public static int field527 = 0;
   @OriginalMember(
      owner = "client!nka",
      name = "O",
      descriptor = "I"
   )
   public static int field528;
   @OriginalMember(
      owner = "client!nka",
      name = "G",
      descriptor = "I"
   )
   public static int field529;
   @OriginalMember(
      owner = "client!nka",
      name = "N",
      descriptor = "I"
   )
   public static int field530;
   @OriginalMember(
      owner = "client!nka",
      name = "L",
      descriptor = "I"
   )
   public static int field531;
   @OriginalMember(
      owner = "client!nka",
      name = "M",
      descriptor = "I"
   )
   public static int field532;
   @OriginalMember(
      owner = "client!nka",
      name = "J",
      descriptor = "I"
   )
   public static int field533;
   @OriginalMember(
      owner = "client!nka",
      name = "P",
      descriptor = "I"
   )
   public static int field534;
   @OriginalMember(
      owner = "client!nka",
      name = "E",
      descriptor = "I"
   )
   public static int field535;
   @OriginalMember(
      owner = "client!nka",
      name = "D",
      descriptor = "I"
   )
   public static int field536;
   @OriginalMember(
      owner = "client!nka",
      name = "F",
      descriptor = "[[I"
   )
   private int[][] field537;

   @OriginalMember(
      owner = "client!nka",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         if (this.field537 == null) {
            this.method412(-67, 1);
         }

         ++field531;
         if (arg0 <= 118) {
            this.field526 = null;
         }

         this.method411(0);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field538[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "f",
      descriptor = "(I)V"
   )
   private final void method411(int arg0) {
      boolean var2 = client.field10022;

      try {
         ++field533;
         if (arg0 == 0) {
            int var3 = this.field537.length;
            if (~var3 < -1) {
               int var4 = 0;
               if (var2 || var4 < 257) {
                  do {
                     int var5;
                     int var6;
                     int var10000;
                     int var10001;
                     label96: {
                        var5 = 0;
                        var6 = var4 << 4;
                        int var7 = 0;
                        if (var2) {
                           var10000 = this.field537[var7][0];
                           var10001 = var6;
                        } else if (var7 >= var3) {
                           var10000 = var3;
                           var10001 = var5;
                           if (!var2) {
                              break label96;
                           }
                        } else {
                           var10000 = this.field537[var7][0];
                           var10001 = var6;
                        }

                        label95:
                        while(true) {
                           while(var10000 > var10001) {
                              var10000 = var3;
                              var10001 = var5;
                              if (!var2) {
                                 break label95;
                              }
                           }

                           ++var5;
                           ++var7;
                           if (var7 >= var3) {
                              var10000 = var3;
                              var10001 = var5;
                              if (!var2) {
                                 break;
                              }
                           } else {
                              var10000 = this.field537[var7][0];
                              var10001 = var6;
                           }
                        }
                     }

                     int var9;
                     int var10;
                     int var11;
                     label103: {
                        if (var10000 > var10001) {
                           int[] var8 = this.field537[var5];
                           if (~var5 >= -1) {
                              var9 = var8[3];
                              var10 = var8[2];
                              var11 = var8[1];
                              if (!var2) {
                                 break label103;
                              }
                           }

                           int[] var12 = this.field537[var5 + -1];
                           int var13 = (-var12[0] + var6 << 12) / (var8[0] + -var12[0]);
                           int var14 = 4096 - var13;
                           var11 = var8[1] * var13 + var12[1] * var14 >> 12;
                           var9 = var8[3] * var13 + var12[3] * var14 >> 12;
                           var10 = var8[2] * var13 + var12[2] * var14 >> 12;
                           if (!var2) {
                              break label103;
                           }
                        }

                        int[] var15 = this.field537[var3 + -1];
                        var9 = var15[3];
                        var10 = var15[2];
                        var11 = var15[1];
                     }

                     int var16 = var9 >> 4;
                     int var17 = var10 >> 4;
                     int var18 = var11 >> 4;
                     if (~var18 <= -1) {
                        if (~var18 < -256) {
                           var18 = 255;
                           if (var2) {
                              var18 = 0;
                           }
                        }
                     } else {
                        var18 = 0;
                     }

                     if (~var17 <= -1) {
                        if (~var17 < -256) {
                           var17 = 255;
                           if (var2) {
                              var17 = 0;
                           }
                        }
                     } else {
                        var17 = 0;
                     }

                     if (~var16 <= -1) {
                        if (var16 > 255) {
                           var16 = 255;
                           if (var2) {
                              var16 = 0;
                           }
                        }
                     } else {
                        var16 = 0;
                     }

                     this.field526[var4] = class91.method932(var16, class91.method932(var18 << 16, var17 << 8));
                     ++var4;
                  } while(var4 < 257);

               }
            }
         }
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field538[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "<init>",
      descriptor = "()V"
   )
   public class36() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         if (arg2 > -6) {
            field530 = -125;
         }

         if (arg1 == 0) {
            label46: {
               int var5 = arg0.method665(false);
               if (~var5 != -1) {
                  this.method412(-41, var5);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field537 = new int[arg0.method665(false)][4];
               int var6 = 0;
               if (var4 || var6 < this.field537.length) {
                  do {
                     this.field537[var6][0] = arg0.method685(-2);
                     this.field537[var6][1] = arg0.method665(false) << 4;
                     this.field537[var6][2] = arg0.method665(false) << 4;
                     this.field537[var6][3] = arg0.method665(false) << 4;
                     ++var6;
                  } while(var6 < this.field537.length);
               }
            }
         }

         ++field532;
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field538[7] + (arg0 != null ? field538[1] : field538[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field529;
         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (arg0 != 373) {
            return null;
         } else {
            if (super.field8649.field11043) {
               int[] var5 = this.method4463(arg1, arg0 + 12691, 0);
               int[] var6 = var4[0];
               int[] var7 = var4[1];
               int[] var8 = var4[2];
               int var9 = 0;
               if (var3 || class563.field8014 > var9) {
                  do {
                     int var10 = var5[var9] >> 4;
                     if (~var10 > -1) {
                        var10 = 0;
                     }

                     if (~var10 < -257) {
                        var10 = 256;
                     }

                     int var11 = this.field526[var10];
                     var6[var9] = class697.method5101(4080, var11 >> 12);
                     var7[var9] = class697.method5101(var11 >> 4, 4080);
                     var8[var9] = class697.method5101(255, var11) << 4;
                     ++var9;
                  } while(class563.field8014 > var9);
               }
            }

            return var4;
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field538[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "c",
      descriptor = "(II)V"
   )
   private final void method412(int arg0, int arg1) {
      try {
         ++field535;
         if (arg0 >= -20) {
            this.method8((class65)null, -8, 86);
         }

         if (arg1 != 0) {
            if (arg1 != 1) {
               if (~arg1 == -3) {
                  this.field537 = new int[8][4];
                  this.field537[0][1] = 2650;
                  this.field537[0][3] = 2361;
                  this.field537[0][0] = 0;
                  this.field537[0][2] = 2602;
                  this.field537[1][1] = 2313;
                  this.field537[1][0] = 2867;
                  this.field537[1][3] = 1558;
                  this.field537[1][2] = 1799;
                  this.field537[2][1] = 2618;
                  this.field537[2][3] = 1413;
                  this.field537[2][0] = 3072;
                  this.field537[2][2] = 1734;
                  this.field537[3][1] = 2296;
                  this.field537[3][0] = 3276;
                  this.field537[3][2] = 1220;
                  this.field537[3][3] = 947;
                  this.field537[4][0] = 3481;
                  this.field537[4][1] = 2072;
                  this.field537[4][3] = 722;
                  this.field537[4][2] = 963;
                  this.field537[5][0] = 3686;
                  this.field537[5][2] = 2152;
                  this.field537[5][3] = 1766;
                  this.field537[5][1] = 2730;
                  this.field537[6][3] = 915;
                  this.field537[6][2] = 1060;
                  this.field537[6][1] = 2232;
                  this.field537[6][0] = 3891;
                  this.field537[7][3] = 1140;
                  this.field537[7][2] = 1413;
                  this.field537[7][0] = 4096;
                  this.field537[7][1] = 1686;
                  return;
               }

               if (~arg1 == -4) {
                  this.field537 = new int[7][4];
                  this.field537[0][0] = 0;
                  this.field537[0][2] = 0;
                  this.field537[0][3] = 4096;
                  this.field537[0][1] = 0;
                  this.field537[1][1] = 0;
                  this.field537[1][0] = 663;
                  this.field537[1][3] = 4096;
                  this.field537[1][2] = 4096;
                  this.field537[2][1] = 0;
                  this.field537[2][0] = 1363;
                  this.field537[2][3] = 0;
                  this.field537[2][2] = 4096;
                  this.field537[3][1] = 4096;
                  this.field537[3][3] = 0;
                  this.field537[3][2] = 4096;
                  this.field537[3][0] = 2048;
                  this.field537[4][1] = 4096;
                  this.field537[4][0] = 2727;
                  this.field537[4][3] = 0;
                  this.field537[4][2] = 0;
                  this.field537[5][3] = 4096;
                  this.field537[5][1] = 4096;
                  this.field537[5][0] = 3411;
                  this.field537[5][2] = 0;
                  this.field537[6][2] = 0;
                  this.field537[6][3] = 4096;
                  this.field537[6][0] = 4096;
                  this.field537[6][1] = 0;
                  return;
               }

               if (~arg1 == -5) {
                  this.field537 = new int[6][4];
                  this.field537[0][1] = 0;
                  this.field537[0][3] = 0;
                  this.field537[0][2] = 0;
                  this.field537[0][0] = 0;
                  this.field537[1][3] = 1493;
                  this.field537[1][0] = 1843;
                  this.field537[1][1] = 0;
                  this.field537[1][2] = 0;
                  this.field537[2][1] = 0;
                  this.field537[2][0] = 2457;
                  this.field537[2][3] = 2939;
                  this.field537[2][2] = 0;
                  this.field537[3][2] = 1124;
                  this.field537[3][1] = 0;
                  this.field537[3][3] = 3565;
                  this.field537[3][0] = 2781;
                  this.field537[4][3] = 4031;
                  this.field537[4][0] = 3481;
                  this.field537[4][2] = 3084;
                  this.field537[4][1] = 546;
                  this.field537[5][1] = 4096;
                  this.field537[5][0] = 4096;
                  this.field537[5][3] = 4096;
                  this.field537[5][2] = 4096;
                  return;
               }

               if (~arg1 == -6) {
                  this.field537 = new int[16][4];
                  this.field537[0][2] = 192;
                  this.field537[0][3] = 321;
                  this.field537[0][1] = 80;
                  this.field537[0][0] = 0;
                  this.field537[1][3] = 562;
                  this.field537[1][2] = 449;
                  this.field537[1][0] = 155;
                  this.field537[1][1] = 321;
                  this.field537[2][2] = 690;
                  this.field537[2][1] = 578;
                  this.field537[2][3] = 803;
                  this.field537[2][0] = 389;
                  this.field537[3][2] = 995;
                  this.field537[3][1] = 947;
                  this.field537[3][0] = 671;
                  this.field537[3][3] = 1140;
                  this.field537[4][0] = 897;
                  this.field537[4][3] = 1509;
                  this.field537[4][1] = 1285;
                  this.field537[4][2] = 1397;
                  this.field537[5][0] = 1175;
                  this.field537[5][1] = 1525;
                  this.field537[5][2] = 1429;
                  this.field537[5][3] = 1413;
                  this.field537[6][2] = 1461;
                  this.field537[6][3] = 1333;
                  this.field537[6][1] = 1734;
                  this.field537[6][0] = 1368;
                  this.field537[7][3] = 1702;
                  this.field537[7][2] = 1525;
                  this.field537[7][1] = 1413;
                  this.field537[7][0] = 1507;
                  this.field537[8][3] = 2056;
                  this.field537[8][2] = 1590;
                  this.field537[8][1] = 1108;
                  this.field537[8][0] = 1736;
                  this.field537[9][1] = 1766;
                  this.field537[9][2] = 2056;
                  this.field537[9][3] = 2666;
                  this.field537[9][0] = 2088;
                  this.field537[10][3] = 3276;
                  this.field537[10][0] = 2355;
                  this.field537[10][2] = 2586;
                  this.field537[10][1] = 2409;
                  this.field537[11][0] = 2691;
                  this.field537[11][1] = 3116;
                  this.field537[11][2] = 3148;
                  this.field537[11][3] = 3228;
                  this.field537[12][3] = 3196;
                  this.field537[12][2] = 3710;
                  this.field537[12][1] = 3806;
                  this.field537[12][0] = 3031;
                  this.field537[13][1] = 3437;
                  this.field537[13][2] = 3421;
                  this.field537[13][3] = 3019;
                  this.field537[13][0] = 3522;
                  this.field537[14][0] = 3727;
                  this.field537[14][1] = 3116;
                  this.field537[14][3] = 3228;
                  this.field537[14][2] = 3148;
                  this.field537[15][3] = 2746;
                  this.field537[15][0] = 4096;
                  this.field537[15][2] = 2505;
                  this.field537[15][1] = 2377;
                  return;
               }

               if (~arg1 != -7) {
                  throw new RuntimeException(field538[4]);
               }

               if (!client.field10022) {
                  this.field537 = new int[4][4];
                  this.field537[0][3] = 0;
                  this.field537[0][0] = 2048;
                  this.field537[0][1] = 0;
                  this.field537[0][2] = 4096;
                  this.field537[1][0] = 2867;
                  this.field537[1][3] = 0;
                  this.field537[1][2] = 4096;
                  this.field537[1][1] = 4096;
                  this.field537[2][0] = 3276;
                  this.field537[2][1] = 4096;
                  this.field537[2][2] = 4096;
                  this.field537[2][3] = 0;
                  this.field537[3][3] = 0;
                  this.field537[3][0] = 4096;
                  this.field537[3][2] = 0;
                  this.field537[3][1] = 4096;
                  return;
               }
            }

            this.field537 = new int[2][4];
            this.field537[0][3] = 0;
            this.field537[0][2] = 0;
            this.field537[0][1] = 0;
            this.field537[0][0] = 0;
            this.field537[1][1] = 4096;
            this.field537[1][3] = 4096;
            this.field537[1][0] = 4096;
            this.field537[1][2] = 4096;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field538[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(IBLlw;)V"
   )
   public static final void method413(int arg0, byte arg1, class408 arg2) {
      boolean var3 = client.field10022;

      try {
         ++field534;
         boolean var4 = arg2.method3195(115, 1) == 1;
         if (var4) {
            class302.field4541[field527++] = arg0;
         }

         int var5 = arg2.method3195(112, 2);
         class158 var6 = class501.field7137[arg0];
         if (~var5 == -1) {
            if (var4) {
               var6.field2397 = false;
            } else if (class394.field5731 == arg0) {
               throw new RuntimeException(field538[10]);
            } else {
               class653 var7;
               label191: {
                  var7 = class775.field11301[arg0] = new class653();
                  var7.field9250 = (var6.field5865[0] + class480.field6903 >> 6) + (var6.field5861[0] + class115.field1824 >> 6 << 14) + (var6.field6824 << 28);
                  if (var6.field2419 != -1) {
                     var7.field9255 = var6.field2419;
                     if (!var3) {
                        break label191;
                     }
                  }

                  var7.field9255 = var6.field5834.method2849(true);
               }

               var7.field9252 = var6.field5798;
               var7.field9249 = var6.field2399;
               var7.field9248 = var6.field2394;
               if (var6.field2409 > 0) {
                  class749.method5389(19686, var6);
               }

               class501.field7137[arg0] = null;
               if (~arg2.method3195(126, 1) != -1) {
                  class287.method2385((byte)55, arg0, arg2);
               }

            }
         } else if (var5 == 1) {
            int var9;
            int var10;
            label299: {
               int var8 = arg2.method3195(115, 3);
               var9 = var6.field5861[0];
               var10 = var6.field5865[0];
               if (var8 == 0) {
                  --var10;
                  --var9;
                  if (!var3) {
                     break label299;
                  }
               }

               if (~var8 != -2) {
                  if (var8 == 2) {
                     --var10;
                     ++var9;
                     if (!var3) {
                        break label299;
                     }
                  }

                  if (var8 != 3) {
                     if (~var8 != -5) {
                        if (~var8 == -6) {
                           ++var10;
                           --var9;
                           if (!var3) {
                              break label299;
                           }
                        }

                        if (var8 != 6) {
                           if (var8 != 7) {
                              break label299;
                           }

                           ++var10;
                           ++var9;
                           if (!var3) {
                              break label299;
                           }
                        }

                        ++var10;
                        if (!var3) {
                           break label299;
                        }
                     }

                     ++var9;
                     if (!var3) {
                        break label299;
                     }
                  }

                  --var9;
                  if (!var3) {
                     break label299;
                  }
               }

               --var10;
            }

            if (var4) {
               var6.field2417 = var9;
               var6.field2412 = var10;
               var6.field2397 = true;
            } else {
               var6.method1501(var9, class466.field6768[arg0], (byte)-68, var10);
            }
         } else if (~var5 == -3) {
            int var12;
            int var13;
            label273: {
               int var11 = arg2.method3195(125, 4);
               var12 = var6.field5861[0];
               var13 = var6.field5865[0];
               if (~var11 != -1) {
                  if (var11 != 1) {
                     if (var11 == 2) {
                        var13 -= 2;
                        if (!var3) {
                           break label273;
                        }
                     }

                     if (~var11 == -4) {
                        var13 -= 2;
                        ++var12;
                        if (!var3) {
                           break label273;
                        }
                     }

                     if (var11 == 4) {
                        var12 += 2;
                        var13 -= 2;
                        if (!var3) {
                           break label273;
                        }
                     }

                     if (~var11 == -6) {
                        --var13;
                        var12 -= 2;
                        if (!var3) {
                           break label273;
                        }
                     }

                     if (~var11 != -7) {
                        if (var11 != 7) {
                           if (~var11 == -9) {
                              var12 += 2;
                              if (!var3) {
                                 break label273;
                              }
                           }

                           if (~var11 == -10) {
                              var12 -= 2;
                              ++var13;
                              if (!var3) {
                                 break label273;
                              }
                           }

                           if (~var11 == -11) {
                              var12 += 2;
                              ++var13;
                              if (!var3) {
                                 break label273;
                              }
                           }

                           if (var11 != 11) {
                              if (~var11 == -13) {
                                 var13 += 2;
                                 --var12;
                                 if (!var3) {
                                    break label273;
                                 }
                              }

                              if (var11 != 13) {
                                 if (~var11 == -15) {
                                    ++var12;
                                    var13 += 2;
                                    if (!var3) {
                                       break label273;
                                    }
                                 }

                                 if (~var11 != -16) {
                                    break label273;
                                 }

                                 var13 += 2;
                                 var12 += 2;
                                 if (!var3) {
                                    break label273;
                                 }
                              }

                              var13 += 2;
                              if (!var3) {
                                 break label273;
                              }
                           }

                           var13 += 2;
                           var12 -= 2;
                           if (!var3) {
                              break label273;
                           }
                        }

                        var12 -= 2;
                        if (!var3) {
                           break label273;
                        }
                     }

                     var12 += 2;
                     --var13;
                     if (!var3) {
                        break label273;
                     }
                  }

                  --var12;
                  var13 -= 2;
                  if (!var3) {
                     break label273;
                  }
               }

               var12 -= 2;
               var13 -= 2;
            }

            if (var4) {
               var6.field2412 = var13;
               var6.field2397 = true;
               var6.field2417 = var12;
            } else {
               var6.method1501(var12, class466.field6768[arg0], (byte)-68, var13);
            }
         } else {
            int var14 = arg2.method3195(122, 1);
            if (var14 == 0) {
               int var15 = arg2.method3195(124, 12);
               int var16 = var15 >> 10;
               int var17 = (1014 & var15) >> 5;
               if (var17 > 15) {
                  var17 -= 32;
               }

               int var18 = var15 & 31;
               if (var18 > 15) {
                  var18 -= 32;
               }

               int var19;
               int var20;
               label280: {
                  var19 = var6.field5861[0] - -var17;
                  var20 = var6.field5865[0] - -var18;
                  if (!var4) {
                     var6.method1501(var19, class466.field6768[arg0], (byte)-68, var20);
                     if (!var3) {
                        break label280;
                     }
                  }

                  var6.field2397 = true;
                  var6.field2417 = var19;
                  var6.field2412 = var20;
               }

               var6.field6824 = var6.field6826 = (byte)(3 & var6.field6824 + var16);
               if (class172.method1598(var20, var19, 101)) {
                  ++var6.field6826;
               }

               if (~class394.field5731 == ~arg0) {
                  if (~class128.field2049 != ~var6.field6824) {
                     class248.field3804 = true;
                  }

                  class128.field2049 = var6.field6824;
               }

            } else {
               if (arg1 >= -49) {
                  method414(26, -121, (byte[])null, 56);
               }

               int var22;
               int var25;
               int var26;
               label288: {
                  int var21 = arg2.method3195(114, 30);
                  var22 = var21 >> 28;
                  int var23 = var21 >> 14 & 16383;
                  int var24 = 16383 & var21;
                  var25 = (16383 & class115.field1824 + var23 + var6.field5861[0]) - class115.field1824;
                  var26 = (16383 & var6.field5865[0] + class480.field6903 + var24) + -class480.field6903;
                  if (var4) {
                     var6.field2412 = var26;
                     var6.field2397 = true;
                     var6.field2417 = var25;
                     if (!var3) {
                        break label288;
                     }
                  }

                  var6.method1501(var25, class466.field6768[arg0], (byte)-68, var26);
               }

               var6.field6824 = var6.field6826 = (byte)(var6.field6824 + var22 & 3);
               if (class172.method1598(var26, var25, 110)) {
                  ++var6.field6826;
               }

               if (~class394.field5731 == ~arg0) {
                  class128.field2049 = var6.field6824;
               }
            }
         }
      } catch (RuntimeException var28) {
         throw class612.method4503(var28, field538[11] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field538[1] : field538[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(II[BI)[B"
   )
   public static final byte[] method414(int arg0, int arg1, byte[] arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         byte[] var5;
         label37: {
            ++field528;
            if (~arg1 >= -1) {
               var5 = arg2;
               if (!var4) {
                  break label37;
               }
            }

            var5 = new byte[arg3];
            int var6 = 0;
            if (var4 || var6 < arg3) {
               do {
                  var5[var6] = arg2[arg1 + var6];
                  ++var6;
               } while(var6 < arg3);
            }
         }

         class259 var7 = new class259();
         var7.method2228(arg0 ^ -101);
         var7.method2225(var5, (long)(arg3 * 8), (byte)-117);
         byte[] var8 = new byte[64];
         var7.method2223(var8, arg0, 44);
         return var8;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field538[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field538[1] : field538[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V"
   )
   public static final void method415(String arg0, String arg1, boolean arg2) {
      try {
         class527.field7461 = class745.field10604;
         if (arg2) {
            class585.field8203 = -1;
            ++field536;
            class793.field11537 = 1;
            class216.method1867(arg0, false, false, 0, arg1);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field538[8] + (arg0 != null ? field538[1] : field538[2]) + ',' + (arg1 != null ? field538[1] : field538[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method416(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method417(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 89;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
