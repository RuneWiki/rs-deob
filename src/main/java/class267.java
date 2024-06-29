import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class267 extends class629 {
   @OriginalMember(
      owner = "client!se",
      name = "M",
      descriptor = "[I"
   )
   private int[] field3785 = new int[257];
   @OriginalMember(
      owner = "client!se",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3797 = new String[]{method2130(method2129("\u0016M\u001do+")), method2130(method2129(",FE_o\fL\u0013Yq\u0004LZ[m\u0011\bCLf\u0016MG")), method2130(method2129("\u0016M\u001dn+")), method2130(method2129("\u0016M\u001dq+")), method2130(method2129("\u000b]_R")), method2130(method2129("\u001e\u0006\u001d\u0010~")), method2130(method2129("\u0016M\u001d{+")), method2130(method2129("\u0016M\u001dr+")), method2130(method2129("\u0016M\u001ds+")), method2130(method2129("\u0016M\u001dw+")), method2130(method2129("\u0016M\u001dp+"))};
   @OriginalMember(
      owner = "client!se",
      name = "K",
      descriptor = "I"
   )
   public static int field3786 = -1;
   @OriginalMember(
      owner = "client!se",
      name = "O",
      descriptor = "[I"
   )
   public static int[] field3787 = new int[4096];
   @OriginalMember(
      owner = "client!se",
      name = "J",
      descriptor = "I"
   )
   public static int field3788;
   @OriginalMember(
      owner = "client!se",
      name = "H",
      descriptor = "I"
   )
   public static int field3789;
   @OriginalMember(
      owner = "client!se",
      name = "G",
      descriptor = "I"
   )
   public static int field3790;
   @OriginalMember(
      owner = "client!se",
      name = "D",
      descriptor = "I"
   )
   public static int field3791;
   @OriginalMember(
      owner = "client!se",
      name = "L",
      descriptor = "I"
   )
   public static int field3792;
   @OriginalMember(
      owner = "client!se",
      name = "F",
      descriptor = "I"
   )
   public static int field3793;
   @OriginalMember(
      owner = "client!se",
      name = "N",
      descriptor = "I"
   )
   public static int field3795;
   @OriginalMember(
      owner = "client!se",
      name = "I",
      descriptor = "[I"
   )
   public static int[] field3796;
   @OriginalMember(
      owner = "client!se",
      name = "E",
      descriptor = "[[I"
   )
   private int[][] field3794;

   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method2124(byte arg0) {
      try {
         if (arg0 != 61) {
            field3786 = 40;
         }

         field3796 = null;
         field3787 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3797[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "c",
      descriptor = "(III)Z"
   )
   public static final boolean method2125(int arg0, int arg1, int arg2) {
      try {
         if (arg1 < 71) {
            method2124((byte)0);
         }

         ++field3792;
         return (arg0 & 458752) != 0 | class413.method3155(arg0, arg2, -1) || class624.method4571(arg0, arg2, -36);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3797[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "c",
      descriptor = "(B)V"
   )
   private final void method2126(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field3789;
         if (arg0 > 120) {
            int var3 = this.field3794.length;
            if (var3 > 0) {
               int var4 = 0;
               if (var2 || var4 < 257) {
                  do {
                     int var5;
                     int var6;
                     int var10000;
                     int var10001;
                     label90: {
                        var5 = 0;
                        var6 = var4 << 4;
                        int var7 = 0;
                        if (var2) {
                           var10000 = ~this.field3794[var7][0];
                           var10001 = ~var6;
                        } else if (~var3 >= ~var7) {
                           var10000 = ~var5;
                           var10001 = ~var3;
                           if (!var2) {
                              break label90;
                           }
                        } else {
                           var10000 = ~this.field3794[var7][0];
                           var10001 = ~var6;
                        }

                        label89:
                        while(true) {
                           while(var10000 < var10001) {
                              var10000 = ~var5;
                              var10001 = ~var3;
                              if (!var2) {
                                 break label89;
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
                              var10000 = ~this.field3794[var7][0];
                              var10001 = ~var6;
                           }
                        }
                     }

                     int var9;
                     int var10;
                     int var11;
                     label116: {
                        if (var10000 <= var10001) {
                           int[] var8 = this.field3794[var3 + -1];
                           var9 = var8[3];
                           var10 = var8[1];
                           var11 = var8[2];
                           if (!var2) {
                              break label116;
                           }
                        }

                        int[] var12 = this.field3794[var5];
                        if (~var5 < -1) {
                           int[] var13 = this.field3794[var5 - 1];
                           int var14 = (-var13[0] + var6 << 12) / (var12[0] - var13[0]);
                           int var15 = -var14 + 4096;
                           var11 = var12[2] * var14 + var13[2] * var15 >> 12;
                           var10 = var12[1] * var14 + var13[1] * var15 >> 12;
                           var9 = var12[3] * var14 + var13[3] * var15 >> 12;
                           if (!var2) {
                              break label116;
                           }
                        }

                        var11 = var12[2];
                        var9 = var12[3];
                        var10 = var12[1];
                     }

                     int var16 = var10 >> 4;
                     int var17 = var11 >> 4;
                     int var18 = var9 >> 4;
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

                     label103: {
                        if (var18 < 0) {
                           var18 = 0;
                           if (!var2) {
                              break label103;
                           }
                        }

                        if (var18 > 255) {
                           var18 = 255;
                        }
                     }

                     this.field3785[var4] = class93.method899(class93.method899(var16 << 16, var17 << 8), var18);
                     ++var4;
                  } while(var4 < 257);

               }
            }
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field3797[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(ZI)V"
   )
   private final void method2127(boolean arg0, int arg1) {
      try {
         if (arg0) {
            ++field3795;
            if (arg1 != 0) {
               if (arg1 != 1) {
                  if (arg1 == 2) {
                     this.field3794 = new int[8][4];
                     this.field3794[0][0] = 0;
                     this.field3794[0][3] = 2361;
                     this.field3794[0][1] = 2650;
                     this.field3794[0][2] = 2602;
                     this.field3794[1][2] = 1799;
                     this.field3794[1][1] = 2313;
                     this.field3794[1][0] = 2867;
                     this.field3794[1][3] = 1558;
                     this.field3794[2][1] = 2618;
                     this.field3794[2][3] = 1413;
                     this.field3794[2][2] = 1734;
                     this.field3794[2][0] = 3072;
                     this.field3794[3][1] = 2296;
                     this.field3794[3][3] = 947;
                     this.field3794[3][0] = 3276;
                     this.field3794[3][2] = 1220;
                     this.field3794[4][0] = 3481;
                     this.field3794[4][3] = 722;
                     this.field3794[4][1] = 2072;
                     this.field3794[4][2] = 963;
                     this.field3794[5][2] = 2152;
                     this.field3794[5][0] = 3686;
                     this.field3794[5][3] = 1766;
                     this.field3794[5][1] = 2730;
                     this.field3794[6][2] = 1060;
                     this.field3794[6][3] = 915;
                     this.field3794[6][1] = 2232;
                     this.field3794[6][0] = 3891;
                     this.field3794[7][1] = 1686;
                     this.field3794[7][3] = 1140;
                     this.field3794[7][0] = 4096;
                     this.field3794[7][2] = 1413;
                     return;
                  }

                  if (arg1 == 3) {
                     this.field3794 = new int[7][4];
                     this.field3794[0][3] = 4096;
                     this.field3794[0][2] = 0;
                     this.field3794[0][0] = 0;
                     this.field3794[0][1] = 0;
                     this.field3794[1][3] = 4096;
                     this.field3794[1][2] = 4096;
                     this.field3794[1][0] = 663;
                     this.field3794[1][1] = 0;
                     this.field3794[2][1] = 0;
                     this.field3794[2][2] = 4096;
                     this.field3794[2][3] = 0;
                     this.field3794[2][0] = 1363;
                     this.field3794[3][3] = 0;
                     this.field3794[3][0] = 2048;
                     this.field3794[3][1] = 4096;
                     this.field3794[3][2] = 4096;
                     this.field3794[4][2] = 0;
                     this.field3794[4][1] = 4096;
                     this.field3794[4][0] = 2727;
                     this.field3794[4][3] = 0;
                     this.field3794[5][3] = 4096;
                     this.field3794[5][1] = 4096;
                     this.field3794[5][0] = 3411;
                     this.field3794[5][2] = 0;
                     this.field3794[6][2] = 0;
                     this.field3794[6][1] = 0;
                     this.field3794[6][3] = 4096;
                     this.field3794[6][0] = 4096;
                     return;
                  }

                  if (arg1 == 4) {
                     this.field3794 = new int[6][4];
                     this.field3794[0][2] = 0;
                     this.field3794[0][1] = 0;
                     this.field3794[0][0] = 0;
                     this.field3794[0][3] = 0;
                     this.field3794[1][3] = 1493;
                     this.field3794[1][1] = 0;
                     this.field3794[1][0] = 1843;
                     this.field3794[1][2] = 0;
                     this.field3794[2][3] = 2939;
                     this.field3794[2][1] = 0;
                     this.field3794[2][2] = 0;
                     this.field3794[2][0] = 2457;
                     this.field3794[3][0] = 2781;
                     this.field3794[3][1] = 0;
                     this.field3794[3][2] = 1124;
                     this.field3794[3][3] = 3565;
                     this.field3794[4][1] = 546;
                     this.field3794[4][0] = 3481;
                     this.field3794[4][2] = 3084;
                     this.field3794[4][3] = 4031;
                     this.field3794[5][1] = 4096;
                     this.field3794[5][3] = 4096;
                     this.field3794[5][0] = 4096;
                     this.field3794[5][2] = 4096;
                     return;
                  }

                  if (arg1 == 5) {
                     this.field3794 = new int[16][4];
                     this.field3794[0][0] = 0;
                     this.field3794[0][1] = 80;
                     this.field3794[0][3] = 321;
                     this.field3794[0][2] = 192;
                     this.field3794[1][2] = 449;
                     this.field3794[1][3] = 562;
                     this.field3794[1][1] = 321;
                     this.field3794[1][0] = 155;
                     this.field3794[2][1] = 578;
                     this.field3794[2][2] = 690;
                     this.field3794[2][0] = 389;
                     this.field3794[2][3] = 803;
                     this.field3794[3][2] = 995;
                     this.field3794[3][0] = 671;
                     this.field3794[3][1] = 947;
                     this.field3794[3][3] = 1140;
                     this.field3794[4][1] = 1285;
                     this.field3794[4][0] = 897;
                     this.field3794[4][2] = 1397;
                     this.field3794[4][3] = 1509;
                     this.field3794[5][0] = 1175;
                     this.field3794[5][3] = 1413;
                     this.field3794[5][1] = 1525;
                     this.field3794[5][2] = 1429;
                     this.field3794[6][0] = 1368;
                     this.field3794[6][1] = 1734;
                     this.field3794[6][3] = 1333;
                     this.field3794[6][2] = 1461;
                     this.field3794[7][3] = 1702;
                     this.field3794[7][2] = 1525;
                     this.field3794[7][0] = 1507;
                     this.field3794[7][1] = 1413;
                     this.field3794[8][2] = 1590;
                     this.field3794[8][1] = 1108;
                     this.field3794[8][0] = 1736;
                     this.field3794[8][3] = 2056;
                     this.field3794[9][3] = 2666;
                     this.field3794[9][0] = 2088;
                     this.field3794[9][2] = 2056;
                     this.field3794[9][1] = 1766;
                     this.field3794[10][2] = 2586;
                     this.field3794[10][1] = 2409;
                     this.field3794[10][3] = 3276;
                     this.field3794[10][0] = 2355;
                     this.field3794[11][0] = 2691;
                     this.field3794[11][2] = 3148;
                     this.field3794[11][1] = 3116;
                     this.field3794[11][3] = 3228;
                     this.field3794[12][1] = 3806;
                     this.field3794[12][2] = 3710;
                     this.field3794[12][0] = 3031;
                     this.field3794[12][3] = 3196;
                     this.field3794[13][0] = 3522;
                     this.field3794[13][2] = 3421;
                     this.field3794[13][3] = 3019;
                     this.field3794[13][1] = 3437;
                     this.field3794[14][0] = 3727;
                     this.field3794[14][2] = 3148;
                     this.field3794[14][1] = 3116;
                     this.field3794[14][3] = 3228;
                     this.field3794[15][1] = 2377;
                     this.field3794[15][0] = 4096;
                     this.field3794[15][2] = 2505;
                     this.field3794[15][3] = 2746;
                     return;
                  }

                  if (~arg1 != -7) {
                     throw new RuntimeException(field3797[1]);
                  }

                  if (!client.field4564) {
                     this.field3794 = new int[4][4];
                     this.field3794[0][2] = 4096;
                     this.field3794[0][3] = 0;
                     this.field3794[0][1] = 0;
                     this.field3794[0][0] = 2048;
                     this.field3794[1][3] = 0;
                     this.field3794[1][2] = 4096;
                     this.field3794[1][0] = 2867;
                     this.field3794[1][1] = 4096;
                     this.field3794[2][2] = 4096;
                     this.field3794[2][3] = 0;
                     this.field3794[2][1] = 4096;
                     this.field3794[2][0] = 3276;
                     this.field3794[3][0] = 4096;
                     this.field3794[3][1] = 4096;
                     this.field3794[3][3] = 0;
                     this.field3794[3][2] = 0;
                     return;
                  }
               }

               this.field3794 = new int[2][4];
               this.field3794[0][1] = 0;
               this.field3794[0][2] = 0;
               this.field3794[0][0] = 0;
               this.field3794[0][3] = 0;
               this.field3794[1][3] = 4096;
               this.field3794[1][0] = 4096;
               this.field3794[1][2] = 4096;
               this.field3794[1][1] = 4096;
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3797[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method901(int arg0) {
      try {
         if (this.field3794 == null) {
            this.method2127(true, 1);
         }

         if (arg0 == 245880940) {
            ++field3788;
            this.method2126((byte)122);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3797[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3793;
         int[][] var4 = super.field9169.method785((byte)72, arg0);
         if (arg1 != 0) {
            method2125(72, -18, -73);
         }

         if (super.field9169.field1332) {
            int[] var5 = this.method4622((byte)120, 0, arg0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int var9 = 0;
            if (var3 || ~var9 > ~class66.field1214) {
               do {
                  int var10 = var5[var9] >> 4;
                  if (var10 < 0) {
                     var10 = 0;
                  }

                  if (var10 > 256) {
                     var10 = 256;
                  }

                  int var11 = this.field3785[var10];
                  var6[var9] = class66.method706(4080, var11 >> 12);
                  var7[var9] = class66.method706(65280, var11) >> 4;
                  var8[var9] = class66.method706(255, var11) << 4;
                  ++var9;
               } while(~var9 > ~class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field3797[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(ZBI)V"
   )
   public static final void method2128(boolean arg0, byte arg1, int arg2) {
      try {
         ++field3791;
         if (arg1 == -4) {
            class349 var3 = class190.method1656((byte)67, arg0, arg2);
            if (var3 != null) {
               var3.method154(108);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field3797[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         if (~arg2 == -1) {
            label47: {
               int var5 = arg0.method3564((byte)-105);
               if (var5 != 0) {
                  this.method2127(true, var5);
                  if (!var4) {
                     break label47;
                  }
               }

               this.field3794 = new int[arg0.method3564((byte)-84)][4];
               int var6 = 0;
               if (var4 || var6 < this.field3794.length) {
                  do {
                     this.field3794[var6][0] = arg0.method3565(true);
                     this.field3794[var6][1] = arg0.method3564((byte)-103) << 4;
                     this.field3794[var6][2] = arg0.method3564((byte)-87) << 4;
                     this.field3794[var6][3] = arg0.method3564((byte)-48) << 4;
                     ++var6;
                  } while(var6 < this.field3794.length);
               }
            }
         }

         if (arg1 != 0) {
            field3796 = null;
         }

         ++field3790;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field3797[6] + (arg0 != null ? field3797[5] : field3797[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!se",
      name = "<init>",
      descriptor = "()V"
   )
   public class267() {
      super(1, false);
   }

   static {
      for(int var0 = 0; var0 < 4096; ++var0) {
         field3787[var0] = class255.method2047(var0, true);
      }

   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2129(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!se",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2130(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 62;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
