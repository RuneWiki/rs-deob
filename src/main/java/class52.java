import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kaa")
public class class52 extends class264 {
   @OriginalMember(
      owner = "client!kaa",
      name = "J",
      descriptor = "[I"
   )
   private int[] field668 = new int[257];
   @OriginalMember(
      owner = "client!kaa",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field673 = new String[]{method416(method415("\r+4\"zN")), method416(method415("\r+4\"{N")), method416(method415("\b?9`")), method416(method415("\r+4\"}N")), method416(method415("\u001dd{\"A")), method416(method415("\r+4\"yN")), method416(method415("/$#mP\u000f.ukN\u0007.<iR\u0012j%~Y\u0015/!")), method416(method415("\r+4\"xN")), method416(method415("\r+4\"\u007fN")), method416(method415("\r+4\"wN"))};
   @OriginalMember(
      owner = "client!kaa",
      name = "K",
      descriptor = "Leg;"
   )
   public static class118 field671 = new class118(63, -1);
   @OriginalMember(
      owner = "client!kaa",
      name = "F",
      descriptor = "I"
   )
   public static int field663;
   @OriginalMember(
      owner = "client!kaa",
      name = "P",
      descriptor = "I"
   )
   public static int field664;
   @OriginalMember(
      owner = "client!kaa",
      name = "Q",
      descriptor = "I"
   )
   public static int field665;
   @OriginalMember(
      owner = "client!kaa",
      name = "H",
      descriptor = "I"
   )
   public static int field666;
   @OriginalMember(
      owner = "client!kaa",
      name = "M",
      descriptor = "I"
   )
   public static int field667;
   @OriginalMember(
      owner = "client!kaa",
      name = "L",
      descriptor = "I"
   )
   public static int field670;
   @OriginalMember(
      owner = "client!kaa",
      name = "N",
      descriptor = "I"
   )
   public static int field672;
   @OriginalMember(
      owner = "client!kaa",
      name = "O",
      descriptor = "[[B"
   )
   public static byte[][] field669;
   @OriginalMember(
      owner = "client!kaa",
      name = "I",
      descriptor = "[[I"
   )
   private int[][] field662;

   @OriginalMember(
      owner = "client!kaa",
      name = "g",
      descriptor = "(I)V",
      line = 4
   )
   public static final void method410(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 27
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg0 == 0) {
            label47: {
               int var5 = arg1.method1143(-15465);
               if (~var5 != -1) {
                  this.method412(false, var5);
                  if (!var4) {
                     break label47;
                  }
               }

               this.field662 = new int[arg1.method1143(-15465)][4];
               int var6 = 0;
               if (var4 || this.field662.length > var6) {
                  do {
                     this.field662[var6][0] = arg1.method1211(-26166);
                     this.field662[var6][1] = arg1.method1143(-15465) << 4;
                     this.field662[var6][2] = arg1.method1143(-15465) << 4;
                     this.field662[var6][3] = arg1.method1143(-15465) << 4;
                     ++var6;
                  } while(this.field662.length > var6);
               }
            }
         }

         if (arg2 < 49) {
            this.field668 = null;
         }

         ++field663;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field673[3] + arg0 + ',' + (arg1 != null ? field673[4] : field673[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(IB)[[I",
      line = 66
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field667;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            return null;
         } else {
            if (super.field3634.field8828) {
               int[] var5 = this.method2019(0, -27804, arg0);
               int[] var6 = var4[0];
               int[] var7 = var4[1];
               int[] var8 = var4[2];
               int var9 = 0;
               if (var3 || ~class430.field6152 < ~var9) {
                  do {
                     int var10 = var5[var9] >> 4;
                     if (~var10 > -1) {
                        var10 = 0;
                     }

                     if (~var10 < -257) {
                        var10 = 256;
                     }

                     int var11 = this.field668[var10];
                     var6[var9] = class556.method3988(var11, 16711680) >> 12;
                     var7[var9] = class556.method3988(4080, var11 >> 4);
                     var8[var9] = class556.method3988(4080, var11 << 4);
                     ++var9;
                  } while(~class430.field6152 < ~var9);
               }
            }

            return var4;
         }
      } catch (RuntimeException var13) {
         throw class237.method1823(var13, field673[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "b",
      descriptor = "(B)V",
      line = 119
   )
   public static void method411(byte arg0) {
      try {
         field671 = null;
         field669 = null;
         if (arg0 <= 51) {
            field670 = 2;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field673[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(ZI)V",
      line = 130
   )
   private final void method412(boolean arg0, int arg1) {
      try {
         ++field666;
         if (!arg0) {
            if (~arg1 != -1) {
               if (arg1 != 1) {
                  if (arg1 == 2) {
                     this.field662 = new int[8][4];
                     this.field662[0][3] = 2361;
                     this.field662[0][2] = 2602;
                     this.field662[0][1] = 2650;
                     this.field662[0][0] = 0;
                     this.field662[1][2] = 1799;
                     this.field662[1][0] = 2867;
                     this.field662[1][1] = 2313;
                     this.field662[1][3] = 1558;
                     this.field662[2][2] = 1734;
                     this.field662[2][1] = 2618;
                     this.field662[2][0] = 3072;
                     this.field662[2][3] = 1413;
                     this.field662[3][0] = 3276;
                     this.field662[3][3] = 947;
                     this.field662[3][2] = 1220;
                     this.field662[3][1] = 2296;
                     this.field662[4][3] = 722;
                     this.field662[4][0] = 3481;
                     this.field662[4][1] = 2072;
                     this.field662[4][2] = 963;
                     this.field662[5][2] = 2152;
                     this.field662[5][3] = 1766;
                     this.field662[5][1] = 2730;
                     this.field662[5][0] = 3686;
                     this.field662[6][1] = 2232;
                     this.field662[6][2] = 1060;
                     this.field662[6][3] = 915;
                     this.field662[6][0] = 3891;
                     this.field662[7][1] = 1686;
                     this.field662[7][0] = 4096;
                     this.field662[7][2] = 1413;
                     this.field662[7][3] = 1140;
                     return;
                  }

                  if (~arg1 == -4) {
                     this.field662 = new int[7][4];
                     this.field662[0][2] = 0;
                     this.field662[0][0] = 0;
                     this.field662[0][3] = 4096;
                     this.field662[0][1] = 0;
                     this.field662[1][0] = 663;
                     this.field662[1][1] = 0;
                     this.field662[1][2] = 4096;
                     this.field662[1][3] = 4096;
                     this.field662[2][2] = 4096;
                     this.field662[2][3] = 0;
                     this.field662[2][1] = 0;
                     this.field662[2][0] = 1363;
                     this.field662[3][1] = 4096;
                     this.field662[3][3] = 0;
                     this.field662[3][0] = 2048;
                     this.field662[3][2] = 4096;
                     this.field662[4][2] = 0;
                     this.field662[4][0] = 2727;
                     this.field662[4][3] = 0;
                     this.field662[4][1] = 4096;
                     this.field662[5][2] = 0;
                     this.field662[5][3] = 4096;
                     this.field662[5][1] = 4096;
                     this.field662[5][0] = 3411;
                     this.field662[6][1] = 0;
                     this.field662[6][0] = 4096;
                     this.field662[6][2] = 0;
                     this.field662[6][3] = 4096;
                     return;
                  }

                  if (~arg1 == -5) {
                     this.field662 = new int[6][4];
                     this.field662[0][2] = 0;
                     this.field662[0][0] = 0;
                     this.field662[0][3] = 0;
                     this.field662[0][1] = 0;
                     this.field662[1][0] = 1843;
                     this.field662[1][3] = 1493;
                     this.field662[1][1] = 0;
                     this.field662[1][2] = 0;
                     this.field662[2][1] = 0;
                     this.field662[2][2] = 0;
                     this.field662[2][0] = 2457;
                     this.field662[2][3] = 2939;
                     this.field662[3][2] = 1124;
                     this.field662[3][1] = 0;
                     this.field662[3][0] = 2781;
                     this.field662[3][3] = 3565;
                     this.field662[4][1] = 546;
                     this.field662[4][0] = 3481;
                     this.field662[4][3] = 4031;
                     this.field662[4][2] = 3084;
                     this.field662[5][2] = 4096;
                     this.field662[5][0] = 4096;
                     this.field662[5][1] = 4096;
                     this.field662[5][3] = 4096;
                     return;
                  }

                  if (~arg1 == -6) {
                     this.field662 = new int[16][4];
                     this.field662[0][1] = 80;
                     this.field662[0][0] = 0;
                     this.field662[0][2] = 192;
                     this.field662[0][3] = 321;
                     this.field662[1][2] = 449;
                     this.field662[1][1] = 321;
                     this.field662[1][3] = 562;
                     this.field662[1][0] = 155;
                     this.field662[2][2] = 690;
                     this.field662[2][3] = 803;
                     this.field662[2][1] = 578;
                     this.field662[2][0] = 389;
                     this.field662[3][2] = 995;
                     this.field662[3][0] = 671;
                     this.field662[3][3] = 1140;
                     this.field662[3][1] = 947;
                     this.field662[4][3] = 1509;
                     this.field662[4][1] = 1285;
                     this.field662[4][0] = 897;
                     this.field662[4][2] = 1397;
                     this.field662[5][2] = 1429;
                     this.field662[5][3] = 1413;
                     this.field662[5][0] = 1175;
                     this.field662[5][1] = 1525;
                     this.field662[6][3] = 1333;
                     this.field662[6][0] = 1368;
                     this.field662[6][1] = 1734;
                     this.field662[6][2] = 1461;
                     this.field662[7][1] = 1413;
                     this.field662[7][0] = 1507;
                     this.field662[7][3] = 1702;
                     this.field662[7][2] = 1525;
                     this.field662[8][2] = 1590;
                     this.field662[8][3] = 2056;
                     this.field662[8][1] = 1108;
                     this.field662[8][0] = 1736;
                     this.field662[9][2] = 2056;
                     this.field662[9][1] = 1766;
                     this.field662[9][0] = 2088;
                     this.field662[9][3] = 2666;
                     this.field662[10][2] = 2586;
                     this.field662[10][1] = 2409;
                     this.field662[10][0] = 2355;
                     this.field662[10][3] = 3276;
                     this.field662[11][1] = 3116;
                     this.field662[11][2] = 3148;
                     this.field662[11][0] = 2691;
                     this.field662[11][3] = 3228;
                     this.field662[12][3] = 3196;
                     this.field662[12][0] = 3031;
                     this.field662[12][2] = 3710;
                     this.field662[12][1] = 3806;
                     this.field662[13][3] = 3019;
                     this.field662[13][0] = 3522;
                     this.field662[13][1] = 3437;
                     this.field662[13][2] = 3421;
                     this.field662[14][0] = 3727;
                     this.field662[14][3] = 3228;
                     this.field662[14][2] = 3148;
                     this.field662[14][1] = 3116;
                     this.field662[15][2] = 2505;
                     this.field662[15][3] = 2746;
                     this.field662[15][1] = 2377;
                     this.field662[15][0] = 4096;
                     return;
                  }

                  if (~arg1 != -7) {
                     throw new RuntimeException(field673[6]);
                  }

                  if (!client.field4360) {
                     this.field662 = new int[4][4];
                     this.field662[0][0] = 2048;
                     this.field662[0][2] = 4096;
                     this.field662[0][1] = 0;
                     this.field662[0][3] = 0;
                     this.field662[1][3] = 0;
                     this.field662[1][1] = 4096;
                     this.field662[1][0] = 2867;
                     this.field662[1][2] = 4096;
                     this.field662[2][3] = 0;
                     this.field662[2][1] = 4096;
                     this.field662[2][0] = 3276;
                     this.field662[2][2] = 4096;
                     this.field662[3][3] = 0;
                     this.field662[3][0] = 4096;
                     this.field662[3][2] = 0;
                     this.field662[3][1] = 4096;
                     return;
                  }
               }

               this.field662 = new int[2][4];
               this.field662[0][3] = 0;
               this.field662[0][1] = 0;
               this.field662[0][0] = 0;
               this.field662[0][2] = 0;
               this.field662[1][0] = 4096;
               this.field662[1][1] = 4096;
               this.field662[1][2] = 4096;
               this.field662[1][3] = 4096;
            }
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field673[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "a",
      descriptor = "(I)V",
      line = 382
   )
   public final void method413(int arg0) {
      try {
         if (this.field662 == null) {
            this.method412(false, 1);
         }

         if (arg0 < 49) {
            this.method3(-1, (class147)null, -116);
         }

         ++field664;
         this.method414(-126);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field673[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "d",
      descriptor = "(I)V",
      line = 403
   )
   private final void method414(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field665;
         if (arg0 >= -98) {
            this.field662 = null;
         }

         int var3 = this.field662.length;
         if (var3 > 0) {
            int var4 = 0;
            if (var2 || ~var4 > -258) {
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
                        var10000 = var6;
                        var10001 = this.field662[var7][0];
                     } else if (~var3 >= ~var7) {
                        var10000 = ~var3;
                        var10001 = ~var5;
                        if (!var2) {
                           break label96;
                        }
                     } else {
                        var10000 = var6;
                        var10001 = this.field662[var7][0];
                     }

                     label95:
                     while(true) {
                        while(var10000 < var10001) {
                           var10000 = ~var3;
                           var10001 = ~var5;
                           if (!var2) {
                              break label95;
                           }
                        }

                        ++var5;
                        ++var7;
                        if (~var3 >= ~var7) {
                           var10000 = ~var3;
                           var10001 = ~var5;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var6;
                           var10001 = this.field662[var7][0];
                        }
                     }
                  }

                  int var9;
                  int var10;
                  int var11;
                  label116: {
                     if (var10000 >= var10001) {
                        int[] var8 = this.field662[var3 - 1];
                        var9 = var8[2];
                        var10 = var8[1];
                        var11 = var8[3];
                        if (!var2) {
                           break label116;
                        }
                     }

                     int[] var12 = this.field662[var5];
                     if (~var5 >= -1) {
                        var10 = var12[1];
                        var9 = var12[2];
                        var11 = var12[3];
                        if (!var2) {
                           break label116;
                        }
                     }

                     int[] var13 = this.field662[var5 + -1];
                     int var14 = (-var13[0] + var6 << 12) / (var12[0] + -var13[0]);
                     int var15 = 4096 - var14;
                     var9 = var12[2] * var14 + var13[2] * var15 >> 12;
                     var11 = var12[3] * var14 + var13[3] * var15 >> 12;
                     var10 = var12[1] * var14 + var13[1] * var15 >> 12;
                  }

                  int var16 = var10 >> 4;
                  int var17 = var9 >> 4;
                  int var18 = var11 >> 4;
                  if (~var18 <= -1) {
                     if (var18 > 255) {
                        var18 = 255;
                        if (var2) {
                           var18 = 0;
                        }
                     }
                  } else {
                     var18 = 0;
                  }

                  if (var17 >= 0) {
                     if (~var17 < -256) {
                        var17 = 255;
                        if (var2) {
                           var17 = 0;
                        }
                     }
                  } else {
                     var17 = 0;
                  }

                  if (var16 >= 0) {
                     if (var16 > 255) {
                        var16 = 255;
                        if (var2) {
                           var16 = 0;
                        }
                     }
                  } else {
                     var16 = 0;
                  }

                  this.field668[var4] = class300.method2238(var18, class300.method2238(var17 << 8, var16 << 16));
                  ++var4;
               } while(~var4 > -258);

            }
         }
      } catch (RuntimeException var20) {
         throw class237.method1823(var20, field673[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "<init>",
      descriptor = "()V",
      line = 505
   )
   public class52() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method415(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method416(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 74;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
