import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class61 extends class70 {
   @OriginalMember(
      owner = "client!mm",
      name = "J",
      descriptor = "[I"
   )
   private int[] field780 = new int[257];
   @OriginalMember(
      owner = "client!mm",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field786 = new String[]{method554(method553("M\u0007\u0018\r9")), method554(method553("N\u001fZ$")), method554(method553("[D\u0018fl")), method554(method553("i\u0004@)}I\u000e\u0016/cA\u000e_-\u007fTJF:tS\u000fB")), method554(method553("M\u0007\u0018\u000f9")), method554(method553("M\u0007\u0018\u00049")), method554(method553("M\u0007\u0018\n9")), method554(method553("M\u0007\u0018\u000b9")), method554(method553("M\u0007\u0018\f9"))};
   @OriginalMember(
      owner = "client!mm",
      name = "O",
      descriptor = "I"
   )
   public static int field779;
   @OriginalMember(
      owner = "client!mm",
      name = "L",
      descriptor = "I"
   )
   public static int field781;
   @OriginalMember(
      owner = "client!mm",
      name = "N",
      descriptor = "I"
   )
   public static int field782;
   @OriginalMember(
      owner = "client!mm",
      name = "M",
      descriptor = "I"
   )
   public static int field783;
   @OriginalMember(
      owner = "client!mm",
      name = "K",
      descriptor = "I"
   )
   public static int field784;
   @OriginalMember(
      owner = "client!mm",
      name = "P",
      descriptor = "I"
   )
   public static int field785;
   @OriginalMember(
      owner = "client!mm",
      name = "I",
      descriptor = "[[I"
   )
   private int[][] field778;

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field785;
         if (arg0 != -6752) {
            this.method548(56, -19);
         }

         int[][] var4 = super.field926.method2860(arg0 + 6752, arg1);
         if (super.field926.field5048) {
            int[] var5 = this.method690(72, 0, arg1);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int var9 = 0;
            if (var3 || ~var9 > ~class262.field3328) {
               do {
                  int var10 = var5[var9] >> 4;
                  if (~var10 > -1) {
                     var10 = 0;
                  }

                  if (~var10 < -257) {
                     var10 = 256;
                  }

                  int var11 = this.field780[var10];
                  var6[var9] = class109.method974(16711680, var11) >> 12;
                  var7[var9] = class109.method974(var11, 65280) >> 4;
                  var8[var9] = class109.method974(4080, var11 << 4);
                  ++var9;
               } while(~var9 > ~class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field786[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "b",
      descriptor = "(II)V"
   )
   private final void method548(int arg0, int arg1) {
      try {
         ++field784;
         if (arg0 != 1) {
            this.method551(-95);
         }

         if (~arg1 != -1) {
            if (arg1 != 1) {
               if (~arg1 == -3) {
                  this.field778 = new int[8][4];
                  this.field778[0][1] = 2650;
                  this.field778[0][3] = 2361;
                  this.field778[0][2] = 2602;
                  this.field778[0][0] = 0;
                  this.field778[1][2] = 1799;
                  this.field778[1][3] = 1558;
                  this.field778[1][1] = 2313;
                  this.field778[1][0] = 2867;
                  this.field778[2][0] = 3072;
                  this.field778[2][1] = 2618;
                  this.field778[2][2] = 1734;
                  this.field778[2][3] = 1413;
                  this.field778[3][1] = 2296;
                  this.field778[3][2] = 1220;
                  this.field778[3][0] = 3276;
                  this.field778[3][3] = 947;
                  this.field778[4][2] = 963;
                  this.field778[4][1] = 2072;
                  this.field778[4][3] = 722;
                  this.field778[4][0] = 3481;
                  this.field778[5][3] = 1766;
                  this.field778[5][2] = 2152;
                  this.field778[5][0] = 3686;
                  this.field778[5][1] = 2730;
                  this.field778[6][0] = 3891;
                  this.field778[6][1] = 2232;
                  this.field778[6][2] = 1060;
                  this.field778[6][3] = 915;
                  this.field778[7][1] = 1686;
                  this.field778[7][3] = 1140;
                  this.field778[7][0] = 4096;
                  this.field778[7][2] = 1413;
                  return;
               }

               if (arg1 == 3) {
                  this.field778 = new int[7][4];
                  this.field778[0][0] = 0;
                  this.field778[0][3] = 4096;
                  this.field778[0][2] = 0;
                  this.field778[0][1] = 0;
                  this.field778[1][2] = 4096;
                  this.field778[1][3] = 4096;
                  this.field778[1][1] = 0;
                  this.field778[1][0] = 663;
                  this.field778[2][0] = 1363;
                  this.field778[2][3] = 0;
                  this.field778[2][2] = 4096;
                  this.field778[2][1] = 0;
                  this.field778[3][0] = 2048;
                  this.field778[3][3] = 0;
                  this.field778[3][1] = 4096;
                  this.field778[3][2] = 4096;
                  this.field778[4][0] = 2727;
                  this.field778[4][2] = 0;
                  this.field778[4][1] = 4096;
                  this.field778[4][3] = 0;
                  this.field778[5][0] = 3411;
                  this.field778[5][2] = 0;
                  this.field778[5][3] = 4096;
                  this.field778[5][1] = 4096;
                  this.field778[6][3] = 4096;
                  this.field778[6][2] = 0;
                  this.field778[6][0] = 4096;
                  this.field778[6][1] = 0;
                  return;
               }

               if (~arg1 == -5) {
                  this.field778 = new int[6][4];
                  this.field778[0][0] = 0;
                  this.field778[0][3] = 0;
                  this.field778[0][2] = 0;
                  this.field778[0][1] = 0;
                  this.field778[1][2] = 0;
                  this.field778[1][3] = 1493;
                  this.field778[1][0] = 1843;
                  this.field778[1][1] = 0;
                  this.field778[2][2] = 0;
                  this.field778[2][0] = 2457;
                  this.field778[2][3] = 2939;
                  this.field778[2][1] = 0;
                  this.field778[3][2] = 1124;
                  this.field778[3][1] = 0;
                  this.field778[3][0] = 2781;
                  this.field778[3][3] = 3565;
                  this.field778[4][1] = 546;
                  this.field778[4][3] = 4031;
                  this.field778[4][2] = 3084;
                  this.field778[4][0] = 3481;
                  this.field778[5][1] = 4096;
                  this.field778[5][2] = 4096;
                  this.field778[5][0] = 4096;
                  this.field778[5][3] = 4096;
                  return;
               }

               if (arg1 == 5) {
                  this.field778 = new int[16][4];
                  this.field778[0][1] = 80;
                  this.field778[0][0] = 0;
                  this.field778[0][2] = 192;
                  this.field778[0][3] = 321;
                  this.field778[1][1] = 321;
                  this.field778[1][0] = 155;
                  this.field778[1][3] = 562;
                  this.field778[1][2] = 449;
                  this.field778[2][3] = 803;
                  this.field778[2][0] = 389;
                  this.field778[2][1] = 578;
                  this.field778[2][2] = 690;
                  this.field778[3][1] = 947;
                  this.field778[3][2] = 995;
                  this.field778[3][3] = 1140;
                  this.field778[3][0] = 671;
                  this.field778[4][2] = 1397;
                  this.field778[4][0] = 897;
                  this.field778[4][1] = 1285;
                  this.field778[4][3] = 1509;
                  this.field778[5][3] = 1413;
                  this.field778[5][0] = 1175;
                  this.field778[5][2] = 1429;
                  this.field778[5][1] = 1525;
                  this.field778[6][3] = 1333;
                  this.field778[6][2] = 1461;
                  this.field778[6][1] = 1734;
                  this.field778[6][0] = 1368;
                  this.field778[7][3] = 1702;
                  this.field778[7][1] = 1413;
                  this.field778[7][0] = 1507;
                  this.field778[7][2] = 1525;
                  this.field778[8][3] = 2056;
                  this.field778[8][0] = 1736;
                  this.field778[8][1] = 1108;
                  this.field778[8][2] = 1590;
                  this.field778[9][1] = 1766;
                  this.field778[9][0] = 2088;
                  this.field778[9][2] = 2056;
                  this.field778[9][3] = 2666;
                  this.field778[10][3] = 3276;
                  this.field778[10][2] = 2586;
                  this.field778[10][0] = 2355;
                  this.field778[10][1] = 2409;
                  this.field778[11][3] = 3228;
                  this.field778[11][1] = 3116;
                  this.field778[11][0] = 2691;
                  this.field778[11][2] = 3148;
                  this.field778[12][0] = 3031;
                  this.field778[12][2] = 3710;
                  this.field778[12][3] = 3196;
                  this.field778[12][1] = 3806;
                  this.field778[13][1] = 3437;
                  this.field778[13][3] = 3019;
                  this.field778[13][2] = 3421;
                  this.field778[13][0] = 3522;
                  this.field778[14][3] = 3228;
                  this.field778[14][0] = 3727;
                  this.field778[14][1] = 3116;
                  this.field778[14][2] = 3148;
                  this.field778[15][0] = 4096;
                  this.field778[15][3] = 2746;
                  this.field778[15][1] = 2377;
                  this.field778[15][2] = 2505;
                  return;
               }

               if (arg1 != 6) {
                  throw new RuntimeException(field786[3]);
               }

               if (!client.field1481) {
                  this.field778 = new int[4][4];
                  this.field778[0][3] = 0;
                  this.field778[0][1] = 0;
                  this.field778[0][0] = 2048;
                  this.field778[0][2] = 4096;
                  this.field778[1][1] = 4096;
                  this.field778[1][3] = 0;
                  this.field778[1][0] = 2867;
                  this.field778[1][2] = 4096;
                  this.field778[2][1] = 4096;
                  this.field778[2][2] = 4096;
                  this.field778[2][3] = 0;
                  this.field778[2][0] = 3276;
                  this.field778[3][2] = 0;
                  this.field778[3][0] = 4096;
                  this.field778[3][1] = 4096;
                  this.field778[3][3] = 0;
                  return;
               }
            }

            this.field778 = new int[2][4];
            this.field778[0][3] = 0;
            this.field778[0][1] = 0;
            this.field778[0][2] = 0;
            this.field778[0][0] = 0;
            this.field778[1][3] = 4096;
            this.field778[1][1] = 4096;
            this.field778[1][2] = 4096;
            this.field778[1][0] = 4096;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field786[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(Ljava/lang/String;CZ)[Ljava/lang/String;"
   )
   public static final String[] method549(String arg0, char arg1, boolean arg2) {
      boolean var3 = client.field1481;

      try {
         ++field782;
         int var4 = class781.method5636(arg0, 0, arg1);
         String[] var5 = new String[var4 - -1];
         int var6 = 0;
         int var7 = 0;
         if (!arg2) {
            method549((String)null, (char)65508, true);
         }

         int var8 = 0;
         int var9;
         if (var3) {
            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         } else {
            if (var4 <= var8) {
               var5[var4] = arg0.substring(var7);
               return var5;
            }

            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         }

         while(true) {
            while(arg0.charAt(var9) != arg1) {
               ++var9;
            }

            var5[var6++] = arg0.substring(var7, var9);
            var7 = var9 + 1;
            ++var8;
            if (var4 <= var8) {
               var5[var4] = arg0.substring(var7);
               return var5;
            }

            var9 = var7;
            if (var3) {
               var9 = var7 + 1;
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field786[0] + (arg0 != null ? field786[2] : field786[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      boolean var4 = client.field1481;

      try {
         ++field779;
         if (arg2 == 0) {
            label47: {
               int var5 = arg1.method640(255);
               if (~var5 != -1) {
                  this.method548(1, var5);
                  if (!var4) {
                     break label47;
                  }
               }

               this.field778 = new int[arg1.method640(255)][4];
               int var6 = 0;
               if (var4 || ~var6 > ~this.field778.length) {
                  do {
                     this.field778[var6][0] = arg1.method603(-2);
                     this.field778[var6][1] = arg1.method640(255) << 4;
                     this.field778[var6][2] = arg1.method640(255) << 4;
                     this.field778[var6][3] = arg1.method640(255) << 4;
                     ++var6;
                  } while(~var6 > ~this.field778.length);
               }
            }
         }

         if (arg0 > -34) {
            this.method547(36, -65);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field786[7] + arg0 + ',' + (arg1 != null ? field786[2] : field786[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "i",
      descriptor = "(I)V"
   )
   private final void method551(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field781;
         if (arg0 == 18823) {
            int var3 = this.field778.length;
            if (var3 > 0) {
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
                           var10000 = this.field778[var7][0];
                           var10001 = var6;
                        } else if (~var3 >= ~var7) {
                           var10000 = var5;
                           var10001 = var3;
                           if (!var2) {
                              break label96;
                           }
                        } else {
                           var10000 = this.field778[var7][0];
                           var10001 = var6;
                        }

                        label95:
                        while(true) {
                           while(var10000 > var10001) {
                              var10000 = var5;
                              var10001 = var3;
                              if (!var2) {
                                 break label95;
                              }
                           }

                           ++var5;
                           ++var7;
                           if (~var3 >= ~var7) {
                              var10000 = var5;
                              var10001 = var3;
                              if (!var2) {
                                 break;
                              }
                           } else {
                              var10000 = this.field778[var7][0];
                              var10001 = var6;
                           }
                        }
                     }

                     int var9;
                     int var10;
                     int var11;
                     label116: {
                        if (var10000 >= var10001) {
                           int[] var8 = this.field778[var3 + -1];
                           var9 = var8[3];
                           var10 = var8[2];
                           var11 = var8[1];
                           if (!var2) {
                              break label116;
                           }
                        }

                        int[] var12 = this.field778[var5];
                        if (var5 > 0) {
                           int[] var13 = this.field778[var5 + -1];
                           int var14 = (-var13[0] + var6 << 12) / (var12[0] - var13[0]);
                           int var15 = 4096 - var14;
                           var11 = var12[1] * var14 - -(var13[1] * var15) >> 12;
                           var9 = var12[3] * var14 - -(var13[3] * var15) >> 12;
                           var10 = var12[2] * var14 + var13[2] * var15 >> 12;
                           if (!var2) {
                              break label116;
                           }
                        }

                        var9 = var12[3];
                        var11 = var12[1];
                        var10 = var12[2];
                     }

                     int var16 = var9 >> 4;
                     int var17 = var11 >> 4;
                     int var18 = var10 >> 4;
                     if (~var17 <= -1) {
                        if (var17 > 255) {
                           var17 = 255;
                           if (var2) {
                              var17 = 0;
                           }
                        }
                     } else {
                        var17 = 0;
                     }

                     if (~var16 <= -1) {
                        if (~var16 < -256) {
                           var16 = 255;
                           if (var2) {
                              var16 = 0;
                           }
                        }
                     } else {
                        var16 = 0;
                     }

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

                     this.field780[var4] = class2.method15(var16, class2.method15(var18 << 8, var17 << 16));
                     ++var4;
                  } while(var4 < 257);

               }
            }
         }
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field786[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "<init>",
      descriptor = "()V"
   )
   public class61() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!mm",
      name = "d",
      descriptor = "(I)V"
   )
   public final void method552(int arg0) {
      try {
         ++field783;
         if (this.field778 == null) {
            this.method548(1, 1);
         }

         if (arg0 >= -36) {
            this.field780 = null;
         }

         this.method551(18823);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field786[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method553(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method554(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 54;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
