import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class493 extends class213 {
   @OriginalMember(
      owner = "client!bg",
      name = "M",
      descriptor = "[I"
   )
   private int[] field6780 = new int[257];
   @OriginalMember(
      owner = "client!bg",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6786 = new String[]{method3583(method3582("7y\u001b<\u001e")), method3583(method3582(".0\u001bYK")), method3583(method3582("7y\u001b0\u001e")), method3583(method3582(";kY\u001b")), method3583(method3582("7y\u001b1\u001e")), method3583(method3582("\u001cpC\u0016Z<z\u0015\u0010D4z\\\u0012X!>E\u0005S&{A")), method3583(method3582("7y\u001b4\u001e")), method3583(method3582("7y\u001b5\u001e")), method3583(method3582("7y\u001b3\u001e")), method3583(method3582("7y\u001b>\u001e")), method3583(method3582("7y\u001b=\u001e")), method3583(method3582("7y\u001b?\u001e")), method3583(method3582("7y\u001b2\u001e"))};
   @OriginalMember(
      owner = "client!bg",
      name = "N",
      descriptor = "Lbga;"
   )
   public static class378 field6778 = new class378(29, -1);
   @OriginalMember(
      owner = "client!bg",
      name = "F",
      descriptor = "I"
   )
   public static int field6773;
   @OriginalMember(
      owner = "client!bg",
      name = "K",
      descriptor = "I"
   )
   public static int field6774;
   @OriginalMember(
      owner = "client!bg",
      name = "O",
      descriptor = "I"
   )
   public static int field6775;
   @OriginalMember(
      owner = "client!bg",
      name = "I",
      descriptor = "I"
   )
   public static int field6776;
   @OriginalMember(
      owner = "client!bg",
      name = "D",
      descriptor = "I"
   )
   public static int field6777;
   @OriginalMember(
      owner = "client!bg",
      name = "E",
      descriptor = "I"
   )
   public static int field6779;
   @OriginalMember(
      owner = "client!bg",
      name = "L",
      descriptor = "I"
   )
   public static int field6781;
   @OriginalMember(
      owner = "client!bg",
      name = "Q",
      descriptor = "I"
   )
   public static int field6782;
   @OriginalMember(
      owner = "client!bg",
      name = "J",
      descriptor = "I"
   )
   public static int field6783;
   @OriginalMember(
      owner = "client!bg",
      name = "R",
      descriptor = "I"
   )
   public static int field6784;
   @OriginalMember(
      owner = "client!bg",
      name = "G",
      descriptor = "I"
   )
   public static int field6785;
   @OriginalMember(
      owner = "client!bg",
      name = "P",
      descriptor = "[[I"
   )
   private int[][] field6772;

   @OriginalMember(
      owner = "client!bg",
      name = "<init>",
      descriptor = "()V"
   )
   public class493() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Lqh;Ld;I)V"
   )
   public static final void method3575(class74 arg0, class160 arg1, int arg2) {
      try {
         class87.field1117 = arg1;
         class720.field10547 = arg0;
         if (arg2 != 1799) {
            field6783 = 115;
         }

         ++field6779;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6786[9] + (arg0 != null ? field6786[1] : field6786[3]) + ',' + (arg1 != null ? field6786[1] : field6786[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "g",
      descriptor = "(I)V"
   )
   private final void method3576(int arg0) {
      boolean var2 = client.field4273;

      try {
         ++field6776;
         int var3 = this.field6772.length;
         if (arg0 < -78) {
            if (~var3 < -1) {
               int var4 = 0;
               if (var2 || var4 < 257) {
                  do {
                     int var5;
                     int var6;
                     int var10000;
                     int var10001;
                     label85: {
                        var5 = 0;
                        var6 = var4 << 4;
                        int var7 = 0;
                        if (var2) {
                           var10000 = ~var6;
                           var10001 = ~this.field6772[var7][0];
                        } else if (~var3 >= ~var7) {
                           var10000 = ~var5;
                           var10001 = ~var3;
                           if (!var2) {
                              break label85;
                           }
                        } else {
                           var10000 = ~var6;
                           var10001 = ~this.field6772[var7][0];
                        }

                        label84:
                        while(true) {
                           while(var10000 > var10001) {
                              var10000 = ~var5;
                              var10001 = ~var3;
                              if (!var2) {
                                 break label84;
                              }
                           }

                           ++var5;
                           ++var7;
                           if (~var3 >= ~var7) {
                              var10000 = ~var5;
                              var10001 = ~var3;
                              if (!var2) {
                                 break;
                              }
                           } else {
                              var10000 = ~var6;
                              var10001 = ~this.field6772[var7][0];
                           }
                        }
                     }

                     int var9;
                     int var10;
                     int var11;
                     label116: {
                        if (var10000 <= var10001) {
                           int[] var8 = this.field6772[var3 - 1];
                           var9 = var8[1];
                           var10 = var8[2];
                           var11 = var8[3];
                           if (!var2) {
                              break label116;
                           }
                        }

                        int[] var12 = this.field6772[var5];
                        if (var5 <= 0) {
                           var11 = var12[3];
                           var9 = var12[1];
                           var10 = var12[2];
                           if (!var2) {
                              break label116;
                           }
                        }

                        int[] var13 = this.field6772[var5 + -1];
                        int var14 = (var6 - var13[0] << 12) / (var12[0] - var13[0]);
                        int var15 = -var14 + 4096;
                        var11 = var12[3] * var14 - -(var13[3] * var15) >> 12;
                        var9 = var12[1] * var14 - -(var13[1] * var15) >> 12;
                        var10 = var12[2] * var14 + var13[2] * var15 >> 12;
                     }

                     int var16;
                     int var17;
                     int var18;
                     label97: {
                        var16 = var11 >> 4;
                        var17 = var9 >> 4;
                        var18 = var10 >> 4;
                        if (~var18 > -1) {
                           var18 = 0;
                           if (!var2) {
                              break label97;
                           }
                        }

                        if (var18 > 255) {
                           var18 = 255;
                        }
                     }

                     if (var17 >= 0) {
                        if (var17 > 255) {
                           var17 = 255;
                           if (var2) {
                              var17 = 0;
                           }
                        }
                     } else {
                        var17 = 0;
                     }

                     label103: {
                        if (~var16 > -1) {
                           var16 = 0;
                           if (!var2) {
                              break label103;
                           }
                        }

                        if (var16 > 255) {
                           var16 = 255;
                        }
                     }

                     this.field6780[var4] = class283.method2155(class283.method2155(var18 << 8, var17 << 16), var16);
                     ++var4;
                  } while(var4 < 257);

               }
            }
         }
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field6786[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(II)V"
   )
   public static final void method3577(int arg0, int arg1) {
      boolean var2 = client.field4273;

      try {
         label42: {
            int var3 = 69 / ((arg1 - 55) / 54);
            if (~arg0 != -38) {
               if (~arg0 == -51) {
                  class618.field8618 = 4.0F;
                  if (!var2) {
                     break label42;
                  }
               }

               if (~arg0 != -76) {
                  if (~arg0 == -101) {
                     class618.field8618 = 8.0F;
                     if (!var2) {
                        break label42;
                     }
                  }

                  if (~arg0 != -201) {
                     break label42;
                  }

                  class618.field8618 = 16.0F;
                  if (!var2) {
                     break label42;
                  }
               }

               class618.field8618 = 6.0F;
               if (!var2) {
                  break label42;
               }
            }

            class618.field8618 = 3.0F;
         }

         class575.field7911 = -1;
         ++field6775;
         class575.field7911 = -1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6786[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         if (arg1 <= 26) {
            return null;
         } else {
            ++field6785;
            int[][] var4 = super.field2644.method3543(-2, arg0);
            if (super.field2644.field6719) {
               int[] var5 = this.method1619((byte)36, arg0, 0);
               int[] var6 = var4[0];
               int[] var7 = var4[1];
               int[] var8 = var4[2];
               int var9 = 0;
               if (var3 || ~class576.field7916 < ~var9) {
                  do {
                     int var10 = var5[var9] >> 4;
                     if (~var10 > -1) {
                        var10 = 0;
                     }

                     if (var10 > 256) {
                        var10 = 256;
                     }

                     int var11 = this.field6780[var10];
                     var6[var9] = class743.method5375(4080, var11 >> 12);
                     var7[var9] = class743.method5375(4080, var11 >> 4);
                     var8[var9] = class743.method5375(255, var11) << 4;
                     ++var9;
                  } while(~class576.field7916 < ~var9);
               }
            }

            return var4;
         }
      } catch (RuntimeException var13) {
         throw class534.method3846(var13, field6786[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(IB)V"
   )
   private final void method3578(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field6774;
         if (~arg0 != -1) {
            label86: {
               label72: {
                  label71: {
                     label70: {
                        label69: {
                           label68: {
                              if (arg0 != 1) {
                                 if (~arg0 == -3) {
                                    break label68;
                                 }

                                 if (~arg0 == -4) {
                                    break label69;
                                 }

                                 if (~arg0 == -5) {
                                    break label70;
                                 }

                                 if (~arg0 == -6) {
                                    break label71;
                                 }

                                 if (~arg0 != -7) {
                                    throw new RuntimeException(field6786[5]);
                                 }

                                 if (!var3) {
                                    break label72;
                                 }
                              }

                              this.field6772 = new int[2][4];
                              this.field6772[0][3] = 0;
                              this.field6772[0][0] = 0;
                              this.field6772[0][2] = 0;
                              this.field6772[0][1] = 0;
                              this.field6772[1][2] = 4096;
                              this.field6772[1][0] = 4096;
                              this.field6772[1][1] = 4096;
                              this.field6772[1][3] = 4096;
                              if (!var3) {
                                 break label86;
                              }
                           }

                           this.field6772 = new int[8][4];
                           this.field6772[0][1] = 2650;
                           this.field6772[0][3] = 2361;
                           this.field6772[0][0] = 0;
                           this.field6772[0][2] = 2602;
                           this.field6772[1][1] = 2313;
                           this.field6772[1][2] = 1799;
                           this.field6772[1][3] = 1558;
                           this.field6772[1][0] = 2867;
                           this.field6772[2][3] = 1413;
                           this.field6772[2][2] = 1734;
                           this.field6772[2][1] = 2618;
                           this.field6772[2][0] = 3072;
                           this.field6772[3][1] = 2296;
                           this.field6772[3][0] = 3276;
                           this.field6772[3][2] = 1220;
                           this.field6772[3][3] = 947;
                           this.field6772[4][1] = 2072;
                           this.field6772[4][0] = 3481;
                           this.field6772[4][2] = 963;
                           this.field6772[4][3] = 722;
                           this.field6772[5][2] = 2152;
                           this.field6772[5][0] = 3686;
                           this.field6772[5][3] = 1766;
                           this.field6772[5][1] = 2730;
                           this.field6772[6][3] = 915;
                           this.field6772[6][1] = 2232;
                           this.field6772[6][2] = 1060;
                           this.field6772[6][0] = 3891;
                           this.field6772[7][1] = 1686;
                           this.field6772[7][2] = 1413;
                           this.field6772[7][3] = 1140;
                           this.field6772[7][0] = 4096;
                           if (!var3) {
                              break label86;
                           }
                        }

                        this.field6772 = new int[7][4];
                        this.field6772[0][0] = 0;
                        this.field6772[0][2] = 0;
                        this.field6772[0][1] = 0;
                        this.field6772[0][3] = 4096;
                        this.field6772[1][2] = 4096;
                        this.field6772[1][3] = 4096;
                        this.field6772[1][1] = 0;
                        this.field6772[1][0] = 663;
                        this.field6772[2][2] = 4096;
                        this.field6772[2][0] = 1363;
                        this.field6772[2][3] = 0;
                        this.field6772[2][1] = 0;
                        this.field6772[3][0] = 2048;
                        this.field6772[3][1] = 4096;
                        this.field6772[3][2] = 4096;
                        this.field6772[3][3] = 0;
                        this.field6772[4][0] = 2727;
                        this.field6772[4][1] = 4096;
                        this.field6772[4][3] = 0;
                        this.field6772[4][2] = 0;
                        this.field6772[5][0] = 3411;
                        this.field6772[5][2] = 0;
                        this.field6772[5][1] = 4096;
                        this.field6772[5][3] = 4096;
                        this.field6772[6][0] = 4096;
                        this.field6772[6][1] = 0;
                        this.field6772[6][2] = 0;
                        this.field6772[6][3] = 4096;
                        if (!var3) {
                           break label86;
                        }
                     }

                     this.field6772 = new int[6][4];
                     this.field6772[0][0] = 0;
                     this.field6772[0][3] = 0;
                     this.field6772[0][2] = 0;
                     this.field6772[0][1] = 0;
                     this.field6772[1][0] = 1843;
                     this.field6772[1][3] = 1493;
                     this.field6772[1][2] = 0;
                     this.field6772[1][1] = 0;
                     this.field6772[2][0] = 2457;
                     this.field6772[2][1] = 0;
                     this.field6772[2][2] = 0;
                     this.field6772[2][3] = 2939;
                     this.field6772[3][2] = 1124;
                     this.field6772[3][0] = 2781;
                     this.field6772[3][1] = 0;
                     this.field6772[3][3] = 3565;
                     this.field6772[4][2] = 3084;
                     this.field6772[4][3] = 4031;
                     this.field6772[4][1] = 546;
                     this.field6772[4][0] = 3481;
                     this.field6772[5][1] = 4096;
                     this.field6772[5][3] = 4096;
                     this.field6772[5][2] = 4096;
                     this.field6772[5][0] = 4096;
                     if (!var3) {
                        break label86;
                     }
                  }

                  this.field6772 = new int[16][4];
                  this.field6772[0][1] = 80;
                  this.field6772[0][3] = 321;
                  this.field6772[0][0] = 0;
                  this.field6772[0][2] = 192;
                  this.field6772[1][1] = 321;
                  this.field6772[1][2] = 449;
                  this.field6772[1][3] = 562;
                  this.field6772[1][0] = 155;
                  this.field6772[2][1] = 578;
                  this.field6772[2][2] = 690;
                  this.field6772[2][3] = 803;
                  this.field6772[2][0] = 389;
                  this.field6772[3][3] = 1140;
                  this.field6772[3][1] = 947;
                  this.field6772[3][2] = 995;
                  this.field6772[3][0] = 671;
                  this.field6772[4][0] = 897;
                  this.field6772[4][2] = 1397;
                  this.field6772[4][3] = 1509;
                  this.field6772[4][1] = 1285;
                  this.field6772[5][3] = 1413;
                  this.field6772[5][1] = 1525;
                  this.field6772[5][0] = 1175;
                  this.field6772[5][2] = 1429;
                  this.field6772[6][1] = 1734;
                  this.field6772[6][0] = 1368;
                  this.field6772[6][2] = 1461;
                  this.field6772[6][3] = 1333;
                  this.field6772[7][2] = 1525;
                  this.field6772[7][1] = 1413;
                  this.field6772[7][0] = 1507;
                  this.field6772[7][3] = 1702;
                  this.field6772[8][3] = 2056;
                  this.field6772[8][1] = 1108;
                  this.field6772[8][0] = 1736;
                  this.field6772[8][2] = 1590;
                  this.field6772[9][2] = 2056;
                  this.field6772[9][1] = 1766;
                  this.field6772[9][3] = 2666;
                  this.field6772[9][0] = 2088;
                  this.field6772[10][2] = 2586;
                  this.field6772[10][3] = 3276;
                  this.field6772[10][1] = 2409;
                  this.field6772[10][0] = 2355;
                  this.field6772[11][2] = 3148;
                  this.field6772[11][0] = 2691;
                  this.field6772[11][3] = 3228;
                  this.field6772[11][1] = 3116;
                  this.field6772[12][3] = 3196;
                  this.field6772[12][0] = 3031;
                  this.field6772[12][1] = 3806;
                  this.field6772[12][2] = 3710;
                  this.field6772[13][0] = 3522;
                  this.field6772[13][3] = 3019;
                  this.field6772[13][2] = 3421;
                  this.field6772[13][1] = 3437;
                  this.field6772[14][2] = 3148;
                  this.field6772[14][3] = 3228;
                  this.field6772[14][1] = 3116;
                  this.field6772[14][0] = 3727;
                  this.field6772[15][2] = 2505;
                  this.field6772[15][0] = 4096;
                  this.field6772[15][1] = 2377;
                  this.field6772[15][3] = 2746;
                  if (!var3) {
                     break label86;
                  }
               }

               this.field6772 = new int[4][4];
               this.field6772[0][3] = 0;
               this.field6772[0][2] = 4096;
               this.field6772[0][0] = 2048;
               this.field6772[0][1] = 0;
               this.field6772[1][0] = 2867;
               this.field6772[1][2] = 4096;
               this.field6772[1][3] = 0;
               this.field6772[1][1] = 4096;
               this.field6772[2][0] = 3276;
               this.field6772[2][3] = 0;
               this.field6772[2][1] = 4096;
               this.field6772[2][2] = 4096;
               this.field6772[3][3] = 0;
               this.field6772[3][2] = 0;
               this.field6772[3][1] = 4096;
               this.field6772[3][0] = 4096;
               if (var3) {
                  throw new RuntimeException(field6786[5]);
               }
            }
         }

         if (arg1 != 62) {
            this.field6772 = null;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6786[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         if (arg2 == 0) {
            label41: {
               int var5 = arg0.method4288((byte)100);
               if (var5 != 0) {
                  this.method3578(var5, (byte)62);
                  if (!var4) {
                     break label41;
                  }
               }

               this.field6772 = new int[arg0.method4288((byte)107)][4];
               int var6 = 0;
               if (var4 || this.field6772.length > var6) {
                  do {
                     this.field6772[var6][0] = arg0.method4280(-19104);
                     this.field6772[var6][1] = arg0.method4288((byte)105) << 4;
                     this.field6772[var6][2] = arg0.method4288((byte)106) << 4;
                     this.field6772[var6][3] = arg0.method4288((byte)68) << 4;
                     ++var6;
                  } while(this.field6772.length > var6);
               }
            }
         }

         ++field6773;
         int var7 = 81 / ((arg1 - 68) / 48);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field6786[2] + (arg0 != null ? field6786[1] : field6786[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method1457(int arg0) {
      try {
         if (arg0 != 28274) {
            method3577(100, -85);
         }

         ++field6781;
         if (this.field6772 == null) {
            this.method3578(1, (byte)62);
         }

         this.method3576(-110);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6786[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3579(byte arg0) {
      try {
         ++field6784;
         int var1 = 0;
         if (class674.field9907.field8457.method1798((byte)-103) == 1) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
         }

         if (~class674.field9907.field8447.method4066((byte)-94) == -1) {
            var1 |= 64;
         }

         class278.method2113(-9018, var1);
         class472.field6533.method3594(var1, 4864);
         int var6 = -82 % ((arg0 - -20) / 44);
         class645.field9054.method477((byte)-94, var1);
         class742.field10813.method2429(var1, (byte)-21);
         class516.field7085.method1489(var1, (byte)117);
         class307.method2308(var1, 16194);
         class114.method989(var1, (byte)125);
         class660.method4788(-25055, var1);
         class356.method2795((byte)126, var1);
         class95.method885(1);
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field6786[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(ILwm;)Lbca;"
   )
   public static final class692 method3580(int arg0, class594 arg1) {
      try {
         if (arg0 != 2) {
            return null;
         } else {
            ++field6777;
            return new class692(arg1.method4333(-82), arg1.method4333(arg0 + -76), arg1.method4333(arg0 ^ -112), arg1.method4333(-127), arg1.method4293(arg0 + 105), arg1.method4293(107), arg1.method4288((byte)96));
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6786[11] + arg0 + ',' + (arg1 != null ? field6786[1] : field6786[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method3581(int arg0) {
      try {
         field6778 = null;
         if (arg0 != 0) {
            field6782 = -126;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6786[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3582(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3583(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
