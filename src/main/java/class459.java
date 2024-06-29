import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class459 extends class302 {
   @OriginalMember(
      owner = "client!af",
      name = "M",
      descriptor = "[I"
   )
   private int[] field6949 = new int[257];
   @OriginalMember(
      owner = "client!af",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6954 = new String[]{method3452(method3451(")\u0007on\u0017")), method3452(method3451(")\u0007o}\u0017")), method3452(method3451("3Oo\u0002B")), method3452(method3451("&\u0014-@")), method3452(method3451(")\u0007oi\u0017")), method3452(method3451(")\u0007oo\u0017")), method3452(method3451("\u0001\u000f7MS!\u0005aKM)\u0005(IQ<A1^Z;\u00045")), method3452(method3451(")\u0007ok\u0017")), method3452(method3451(")\u0007oh\u0017")), method3452(method3451(")\u0007oj\u0017"))};
   @OriginalMember(
      owner = "client!af",
      name = "T",
      descriptor = "Lum;"
   )
   public static class550 field6947 = new class550();
   @OriginalMember(
      owner = "client!af",
      name = "P",
      descriptor = "I"
   )
   public static int field6942;
   @OriginalMember(
      owner = "client!af",
      name = "S",
      descriptor = "I"
   )
   public static int field6943;
   @OriginalMember(
      owner = "client!af",
      name = "I",
      descriptor = "I"
   )
   public static int field6945;
   @OriginalMember(
      owner = "client!af",
      name = "R",
      descriptor = "I"
   )
   public static int field6946;
   @OriginalMember(
      owner = "client!af",
      name = "Q",
      descriptor = "I"
   )
   public static int field6950;
   @OriginalMember(
      owner = "client!af",
      name = "O",
      descriptor = "I"
   )
   public static int field6952;
   @OriginalMember(
      owner = "client!af",
      name = "L",
      descriptor = "I"
   )
   public static int field6953;
   @OriginalMember(
      owner = "client!af",
      name = "N",
      descriptor = "Lha;"
   )
   public static class66 field6944;
   @OriginalMember(
      owner = "client!af",
      name = "J",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field6948;
   @OriginalMember(
      owner = "client!af",
      name = "H",
      descriptor = "[[I"
   )
   private int[][] field6951;

   @OriginalMember(
      owner = "client!af",
      name = "d",
      descriptor = "(B)V",
      line = 8
   )
   public static void method3447(byte arg0) {
      try {
         field6944 = null;
         field6948 = null;
         field6947 = null;
         if (arg0 > 0) {
            method3448((byte)91, (byte[])null, 125);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6954[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(BI)[[I",
      line = 26
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field6946;
         if (arg0 != -90) {
            this.method245((byte)48, -31);
         }

         int[][] var4 = super.field4292.method3409(arg1, arg0 + 90);
         if (super.field4292.field6892) {
            int[] var5 = this.method2299(arg1, false, 0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int var9 = 0;
            if (var3 != 0 || var9 < class344.field5238) {
               do {
                  int var10 = var5[var9] >> 4;
                  if (~var10 > -1) {
                     var10 = 0;
                  }

                  if (var10 > 256) {
                     var10 = 256;
                  }

                  int var11 = this.field6949[var10];
                  var6[var9] = class153.method1262(16711680, var11) >> 12;
                  var7[var9] = class153.method1262(4080, var11 >> 4);
                  var8[var9] = class153.method1262(var11, 255) << 4;
                  ++var9;
               } while(var9 < class344.field5238);
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field6954[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(B[BI)[B",
      line = 78
   )
   public static final byte[] method3448(byte arg0, byte[] arg1, int arg2) {
      try {
         ++field6953;
         byte[] var3 = new byte[arg2];
         class195.method1492(arg1, 0, var3, 0, arg2);
         return arg0 != 10 ? null : var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6954[1] + arg0 + ',' + (arg1 != null ? field6954[2] : field6954[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "<init>",
      descriptor = "()V",
      line = 97
   )
   public class459() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(IILjj;)V",
      line = 100
   )
   public final void method244(int param1, int param2, class128 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!af",
      name = "c",
      descriptor = "(B)V",
      line = 135
   )
   private final void method3449(byte arg0) {
      int var2 = client.field4530;

      try {
         if (arg0 != -60) {
            field6947 = null;
         }

         ++field6952;
         int var3 = this.field6951.length;
         if (var3 > 0) {
            int var4 = 0;
            if (var2 != 0 || var4 < 257) {
               do {
                  int var5;
                  int var6;
                  int var10000;
                  int var10001;
                  label86: {
                     var5 = 0;
                     var6 = var4 << 4;
                     int var7 = 0;
                     if (var2 != 0) {
                        var10000 = var6;
                        var10001 = this.field6951[var7][0];
                     } else if (~var7 <= ~var3) {
                        var10000 = ~var3;
                        var10001 = ~var5;
                        if (var2 == 0) {
                           break label86;
                        }
                     } else {
                        var10000 = var6;
                        var10001 = this.field6951[var7][0];
                     }

                     label85:
                     while(true) {
                        while(var10000 < var10001) {
                           var10000 = ~var3;
                           var10001 = ~var5;
                           if (var2 == 0) {
                              break label85;
                           }
                        }

                        ++var5;
                        ++var7;
                        if (~var7 <= ~var3) {
                           var10000 = ~var3;
                           var10001 = ~var5;
                           if (var2 == 0) {
                              break;
                           }
                        } else {
                           var10000 = var6;
                           var10001 = this.field6951[var7][0];
                        }
                     }
                  }

                  int var9;
                  int var10;
                  int var11;
                  label116: {
                     if (var10000 >= var10001) {
                        int[] var8 = this.field6951[var3 + -1];
                        var9 = var8[1];
                        var10 = var8[3];
                        var11 = var8[2];
                        if (var2 == 0) {
                           break label116;
                        }
                     }

                     int[] var12 = this.field6951[var5];
                     if (~var5 < -1) {
                        int[] var13 = this.field6951[var5 - 1];
                        int var14 = (-var13[0] + var6 << 12) / (var12[0] + -var13[0]);
                        int var15 = -var14 + 4096;
                        var9 = var12[1] * var14 + var13[1] * var15 >> 12;
                        var11 = var12[2] * var14 + var13[2] * var15 >> 12;
                        var10 = var12[3] * var14 + var13[3] * var15 >> 12;
                        if (var2 == 0) {
                           break label116;
                        }
                     }

                     var11 = var12[2];
                     var9 = var12[1];
                     var10 = var12[3];
                  }

                  int var16;
                  int var17;
                  int var18;
                  label98: {
                     var16 = var9 >> 4;
                     var17 = var11 >> 4;
                     var18 = var10 >> 4;
                     if (var18 < 0) {
                        var18 = 0;
                        if (var2 == 0) {
                           break label98;
                        }
                     }

                     if (var18 > 255) {
                        var18 = 255;
                     }
                  }

                  label103: {
                     if (~var17 > -1) {
                        var17 = 0;
                        if (var2 == 0) {
                           break label103;
                        }
                     }

                     if (var17 > 255) {
                        var17 = 255;
                     }
                  }

                  if (~var16 <= -1) {
                     if (~var16 < -256) {
                        var16 = 255;
                        if (var2 != 0) {
                           var16 = 0;
                        }
                     }
                  } else {
                     var16 = 0;
                  }

                  this.field6949[var4] = class379.method2928(class379.method2928(var17 << 8, var16 << 16), var18);
                  ++var4;
               } while(var4 < 257);

            }
         }
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field6954[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "b",
      descriptor = "(B)V",
      line = 246
   )
   public final void method708(byte arg0) {
      try {
         if (this.field6951 == null) {
            this.method3450(1, -112);
         }

         if (arg0 > -87) {
            this.method245((byte)-110, -32);
         }

         ++field6943;
         this.method3449((byte)-60);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6954[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "b",
      descriptor = "(II)V",
      line = 260
   )
   private final void method3450(int arg0, int arg1) {
      try {
         ++field6945;
         if (arg1 > -106) {
            this.method3450(19, 32);
         }

         if (arg0 != 0) {
            if (arg0 != 1) {
               if (~arg0 == -3) {
                  this.field6951 = new int[8][4];
                  this.field6951[0][0] = 0;
                  this.field6951[0][3] = 2361;
                  this.field6951[0][1] = 2650;
                  this.field6951[0][2] = 2602;
                  this.field6951[1][0] = 2867;
                  this.field6951[1][1] = 2313;
                  this.field6951[1][2] = 1799;
                  this.field6951[1][3] = 1558;
                  this.field6951[2][0] = 3072;
                  this.field6951[2][1] = 2618;
                  this.field6951[2][2] = 1734;
                  this.field6951[2][3] = 1413;
                  this.field6951[3][2] = 1220;
                  this.field6951[3][3] = 947;
                  this.field6951[3][0] = 3276;
                  this.field6951[3][1] = 2296;
                  this.field6951[4][2] = 963;
                  this.field6951[4][0] = 3481;
                  this.field6951[4][1] = 2072;
                  this.field6951[4][3] = 722;
                  this.field6951[5][2] = 2152;
                  this.field6951[5][3] = 1766;
                  this.field6951[5][0] = 3686;
                  this.field6951[5][1] = 2730;
                  this.field6951[6][2] = 1060;
                  this.field6951[6][0] = 3891;
                  this.field6951[6][3] = 915;
                  this.field6951[6][1] = 2232;
                  this.field6951[7][2] = 1413;
                  this.field6951[7][0] = 4096;
                  this.field6951[7][1] = 1686;
                  this.field6951[7][3] = 1140;
                  return;
               }

               if (arg0 == 3) {
                  this.field6951 = new int[7][4];
                  this.field6951[0][2] = 0;
                  this.field6951[0][0] = 0;
                  this.field6951[0][3] = 4096;
                  this.field6951[0][1] = 0;
                  this.field6951[1][2] = 4096;
                  this.field6951[1][1] = 0;
                  this.field6951[1][3] = 4096;
                  this.field6951[1][0] = 663;
                  this.field6951[2][3] = 0;
                  this.field6951[2][0] = 1363;
                  this.field6951[2][2] = 4096;
                  this.field6951[2][1] = 0;
                  this.field6951[3][2] = 4096;
                  this.field6951[3][3] = 0;
                  this.field6951[3][1] = 4096;
                  this.field6951[3][0] = 2048;
                  this.field6951[4][3] = 0;
                  this.field6951[4][2] = 0;
                  this.field6951[4][0] = 2727;
                  this.field6951[4][1] = 4096;
                  this.field6951[5][2] = 0;
                  this.field6951[5][0] = 3411;
                  this.field6951[5][3] = 4096;
                  this.field6951[5][1] = 4096;
                  this.field6951[6][2] = 0;
                  this.field6951[6][0] = 4096;
                  this.field6951[6][3] = 4096;
                  this.field6951[6][1] = 0;
                  return;
               }

               if (arg0 == 4) {
                  this.field6951 = new int[6][4];
                  this.field6951[0][3] = 0;
                  this.field6951[0][0] = 0;
                  this.field6951[0][1] = 0;
                  this.field6951[0][2] = 0;
                  this.field6951[1][2] = 0;
                  this.field6951[1][3] = 1493;
                  this.field6951[1][0] = 1843;
                  this.field6951[1][1] = 0;
                  this.field6951[2][1] = 0;
                  this.field6951[2][0] = 2457;
                  this.field6951[2][2] = 0;
                  this.field6951[2][3] = 2939;
                  this.field6951[3][3] = 3565;
                  this.field6951[3][2] = 1124;
                  this.field6951[3][1] = 0;
                  this.field6951[3][0] = 2781;
                  this.field6951[4][2] = 3084;
                  this.field6951[4][3] = 4031;
                  this.field6951[4][0] = 3481;
                  this.field6951[4][1] = 546;
                  this.field6951[5][2] = 4096;
                  this.field6951[5][3] = 4096;
                  this.field6951[5][1] = 4096;
                  this.field6951[5][0] = 4096;
                  return;
               }

               if (~arg0 == -6) {
                  this.field6951 = new int[16][4];
                  this.field6951[0][1] = 80;
                  this.field6951[0][0] = 0;
                  this.field6951[0][3] = 321;
                  this.field6951[0][2] = 192;
                  this.field6951[1][3] = 562;
                  this.field6951[1][2] = 449;
                  this.field6951[1][1] = 321;
                  this.field6951[1][0] = 155;
                  this.field6951[2][3] = 803;
                  this.field6951[2][2] = 690;
                  this.field6951[2][0] = 389;
                  this.field6951[2][1] = 578;
                  this.field6951[3][3] = 1140;
                  this.field6951[3][0] = 671;
                  this.field6951[3][2] = 995;
                  this.field6951[3][1] = 947;
                  this.field6951[4][0] = 897;
                  this.field6951[4][2] = 1397;
                  this.field6951[4][1] = 1285;
                  this.field6951[4][3] = 1509;
                  this.field6951[5][3] = 1413;
                  this.field6951[5][2] = 1429;
                  this.field6951[5][0] = 1175;
                  this.field6951[5][1] = 1525;
                  this.field6951[6][1] = 1734;
                  this.field6951[6][0] = 1368;
                  this.field6951[6][3] = 1333;
                  this.field6951[6][2] = 1461;
                  this.field6951[7][1] = 1413;
                  this.field6951[7][0] = 1507;
                  this.field6951[7][3] = 1702;
                  this.field6951[7][2] = 1525;
                  this.field6951[8][2] = 1590;
                  this.field6951[8][0] = 1736;
                  this.field6951[8][1] = 1108;
                  this.field6951[8][3] = 2056;
                  this.field6951[9][2] = 2056;
                  this.field6951[9][1] = 1766;
                  this.field6951[9][3] = 2666;
                  this.field6951[9][0] = 2088;
                  this.field6951[10][2] = 2586;
                  this.field6951[10][1] = 2409;
                  this.field6951[10][3] = 3276;
                  this.field6951[10][0] = 2355;
                  this.field6951[11][3] = 3228;
                  this.field6951[11][2] = 3148;
                  this.field6951[11][1] = 3116;
                  this.field6951[11][0] = 2691;
                  this.field6951[12][0] = 3031;
                  this.field6951[12][1] = 3806;
                  this.field6951[12][2] = 3710;
                  this.field6951[12][3] = 3196;
                  this.field6951[13][3] = 3019;
                  this.field6951[13][2] = 3421;
                  this.field6951[13][1] = 3437;
                  this.field6951[13][0] = 3522;
                  this.field6951[14][3] = 3228;
                  this.field6951[14][2] = 3148;
                  this.field6951[14][1] = 3116;
                  this.field6951[14][0] = 3727;
                  this.field6951[15][1] = 2377;
                  this.field6951[15][3] = 2746;
                  this.field6951[15][0] = 4096;
                  this.field6951[15][2] = 2505;
                  return;
               }

               if (~arg0 != -7) {
                  throw new RuntimeException(field6954[6]);
               }

               if (client.field4530 == 0) {
                  this.field6951 = new int[4][4];
                  this.field6951[0][1] = 0;
                  this.field6951[0][2] = 4096;
                  this.field6951[0][0] = 2048;
                  this.field6951[0][3] = 0;
                  this.field6951[1][0] = 2867;
                  this.field6951[1][3] = 0;
                  this.field6951[1][2] = 4096;
                  this.field6951[1][1] = 4096;
                  this.field6951[2][0] = 3276;
                  this.field6951[2][1] = 4096;
                  this.field6951[2][2] = 4096;
                  this.field6951[2][3] = 0;
                  this.field6951[3][3] = 0;
                  this.field6951[3][2] = 0;
                  this.field6951[3][0] = 4096;
                  this.field6951[3][1] = 4096;
                  return;
               }
            }

            this.field6951 = new int[2][4];
            this.field6951[0][3] = 0;
            this.field6951[0][2] = 0;
            this.field6951[0][0] = 0;
            this.field6951[0][1] = 0;
            this.field6951[1][1] = 4096;
            this.field6951[1][0] = 4096;
            this.field6951[1][3] = 4096;
            this.field6951[1][2] = 4096;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field6954[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 72;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
