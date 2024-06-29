import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class530 extends class70 {
   @OriginalMember(
      owner = "client!qd",
      name = "H",
      descriptor = "[I"
   )
   private int[] field8034 = new int[257];
   @OriginalMember(
      owner = "client!qd",
      name = "Q",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8044 = new String[]{method4073(method4072("O6\b?Wo<^9Ig<\u0017;Urx\u000e,^u=\n")), method4073(method4072("w<P\u001a\u0013")), method4073(method4072("w<P\u0018\u0013")), method4073(method4072("}vPpF")), method4073(method4072("h-\u00122")), method4073(method4072("w<P\u0016\u0013")), method4073(method4072("&(\r7Acb")), method4073(method4072("w<P\u001f\u0013")), method4073(method4072("+uS;Ub?\u000e.\u0016+u")), method4073(method4072("a(\u0017o\u001bv7\rd")), method4073(method4072("w<P\u001c\u0013")), method4073(method4072("w<P\u0014\u0013")), method4073(method4072("w<P\u001b\u0013"))};
   @OriginalMember(
      owner = "client!qd",
      name = "I",
      descriptor = "I"
   )
   public static int field8033 = 0;
   @OriginalMember(
      owner = "client!qd",
      name = "N",
      descriptor = "[I"
   )
   public static int[] field8038 = new int[25];
   @OriginalMember(
      owner = "client!qd",
      name = "M",
      descriptor = "Luk;"
   )
   public static class498 field8041 = new class498(0, -1);
   @OriginalMember(
      owner = "client!qd",
      name = "O",
      descriptor = "I"
   )
   public static int field8035;
   @OriginalMember(
      owner = "client!qd",
      name = "J",
      descriptor = "I"
   )
   public static int field8036;
   @OriginalMember(
      owner = "client!qd",
      name = "G",
      descriptor = "I"
   )
   public static int field8037;
   @OriginalMember(
      owner = "client!qd",
      name = "F",
      descriptor = "I"
   )
   public static int field8039;
   @OriginalMember(
      owner = "client!qd",
      name = "K",
      descriptor = "I"
   )
   public static int field8040;
   @OriginalMember(
      owner = "client!qd",
      name = "L",
      descriptor = "I"
   )
   public static int field8042;
   @OriginalMember(
      owner = "client!qd",
      name = "P",
      descriptor = "[[I"
   )
   private int[][] field8043;

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(Z)V",
      line = 8
   )
   public final void method275(boolean arg0) {
      try {
         if (arg0) {
            this.method4071(-66);
         }

         ++field8042;
         if (this.field8043 == null) {
            this.method4069((byte)37, 1);
         }

         this.method4071(126);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8044[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(Lpfa;II)V",
      line = 24
   )
   public static final void method4068(class102 arg0, int arg1, int arg2) {
      try {
         if (arg2 != 80) {
            method4068((class102)null, 112, -117);
         }

         class667.field9984 = 0;
         class766.field11318 = false;
         ++field8036;
         class465.method3610(98, arg0);
         class570.method4285(arg0, -69);
         if (class766.field11318) {
            System.out.println(field8044[8]);
         }

         if (arg0.field5436 != arg1) {
            throw new RuntimeException(field8044[9] + arg0.field5436 + field8044[6] + arg1);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8044[7] + (arg0 != null ? field8044[3] : field8044[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "<init>",
      descriptor = "()V",
      line = 343
   )
   public class530() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "(BI)V",
      line = 49
   )
   private final void method4069(byte arg0, int arg1) {
      try {
         ++field8040;
         if (arg0 != 37) {
            this.field8034 = null;
         }

         if (arg1 != 0) {
            if (~arg1 != -2) {
               if (arg1 == 2) {
                  this.field8043 = new int[8][4];
                  this.field8043[0][1] = 2650;
                  this.field8043[0][0] = 0;
                  this.field8043[0][3] = 2361;
                  this.field8043[0][2] = 2602;
                  this.field8043[1][2] = 1799;
                  this.field8043[1][1] = 2313;
                  this.field8043[1][3] = 1558;
                  this.field8043[1][0] = 2867;
                  this.field8043[2][0] = 3072;
                  this.field8043[2][3] = 1413;
                  this.field8043[2][2] = 1734;
                  this.field8043[2][1] = 2618;
                  this.field8043[3][2] = 1220;
                  this.field8043[3][3] = 947;
                  this.field8043[3][0] = 3276;
                  this.field8043[3][1] = 2296;
                  this.field8043[4][3] = 722;
                  this.field8043[4][2] = 963;
                  this.field8043[4][1] = 2072;
                  this.field8043[4][0] = 3481;
                  this.field8043[5][0] = 3686;
                  this.field8043[5][1] = 2730;
                  this.field8043[5][2] = 2152;
                  this.field8043[5][3] = 1766;
                  this.field8043[6][1] = 2232;
                  this.field8043[6][0] = 3891;
                  this.field8043[6][2] = 1060;
                  this.field8043[6][3] = 915;
                  this.field8043[7][1] = 1686;
                  this.field8043[7][3] = 1140;
                  this.field8043[7][0] = 4096;
                  this.field8043[7][2] = 1413;
                  return;
               }

               if (~arg1 == -4) {
                  this.field8043 = new int[7][4];
                  this.field8043[0][2] = 0;
                  this.field8043[0][1] = 0;
                  this.field8043[0][3] = 4096;
                  this.field8043[0][0] = 0;
                  this.field8043[1][2] = 4096;
                  this.field8043[1][3] = 4096;
                  this.field8043[1][0] = 663;
                  this.field8043[1][1] = 0;
                  this.field8043[2][1] = 0;
                  this.field8043[2][3] = 0;
                  this.field8043[2][2] = 4096;
                  this.field8043[2][0] = 1363;
                  this.field8043[3][0] = 2048;
                  this.field8043[3][3] = 0;
                  this.field8043[3][2] = 4096;
                  this.field8043[3][1] = 4096;
                  this.field8043[4][1] = 4096;
                  this.field8043[4][3] = 0;
                  this.field8043[4][0] = 2727;
                  this.field8043[4][2] = 0;
                  this.field8043[5][2] = 0;
                  this.field8043[5][1] = 4096;
                  this.field8043[5][3] = 4096;
                  this.field8043[5][0] = 3411;
                  this.field8043[6][0] = 4096;
                  this.field8043[6][1] = 0;
                  this.field8043[6][3] = 4096;
                  this.field8043[6][2] = 0;
                  return;
               }

               if (arg1 == 4) {
                  this.field8043 = new int[6][4];
                  this.field8043[0][0] = 0;
                  this.field8043[0][1] = 0;
                  this.field8043[0][3] = 0;
                  this.field8043[0][2] = 0;
                  this.field8043[1][3] = 1493;
                  this.field8043[1][1] = 0;
                  this.field8043[1][2] = 0;
                  this.field8043[1][0] = 1843;
                  this.field8043[2][0] = 2457;
                  this.field8043[2][2] = 0;
                  this.field8043[2][3] = 2939;
                  this.field8043[2][1] = 0;
                  this.field8043[3][3] = 3565;
                  this.field8043[3][1] = 0;
                  this.field8043[3][2] = 1124;
                  this.field8043[3][0] = 2781;
                  this.field8043[4][1] = 546;
                  this.field8043[4][2] = 3084;
                  this.field8043[4][3] = 4031;
                  this.field8043[4][0] = 3481;
                  this.field8043[5][0] = 4096;
                  this.field8043[5][3] = 4096;
                  this.field8043[5][1] = 4096;
                  this.field8043[5][2] = 4096;
                  return;
               }

               if (arg1 == 5) {
                  this.field8043 = new int[16][4];
                  this.field8043[0][0] = 0;
                  this.field8043[0][2] = 192;
                  this.field8043[0][3] = 321;
                  this.field8043[0][1] = 80;
                  this.field8043[1][1] = 321;
                  this.field8043[1][2] = 449;
                  this.field8043[1][0] = 155;
                  this.field8043[1][3] = 562;
                  this.field8043[2][1] = 578;
                  this.field8043[2][0] = 389;
                  this.field8043[2][3] = 803;
                  this.field8043[2][2] = 690;
                  this.field8043[3][2] = 995;
                  this.field8043[3][0] = 671;
                  this.field8043[3][3] = 1140;
                  this.field8043[3][1] = 947;
                  this.field8043[4][3] = 1509;
                  this.field8043[4][1] = 1285;
                  this.field8043[4][2] = 1397;
                  this.field8043[4][0] = 897;
                  this.field8043[5][2] = 1429;
                  this.field8043[5][0] = 1175;
                  this.field8043[5][3] = 1413;
                  this.field8043[5][1] = 1525;
                  this.field8043[6][3] = 1333;
                  this.field8043[6][0] = 1368;
                  this.field8043[6][1] = 1734;
                  this.field8043[6][2] = 1461;
                  this.field8043[7][2] = 1525;
                  this.field8043[7][3] = 1702;
                  this.field8043[7][0] = 1507;
                  this.field8043[7][1] = 1413;
                  this.field8043[8][3] = 2056;
                  this.field8043[8][2] = 1590;
                  this.field8043[8][1] = 1108;
                  this.field8043[8][0] = 1736;
                  this.field8043[9][2] = 2056;
                  this.field8043[9][1] = 1766;
                  this.field8043[9][3] = 2666;
                  this.field8043[9][0] = 2088;
                  this.field8043[10][3] = 3276;
                  this.field8043[10][1] = 2409;
                  this.field8043[10][2] = 2586;
                  this.field8043[10][0] = 2355;
                  this.field8043[11][2] = 3148;
                  this.field8043[11][0] = 2691;
                  this.field8043[11][3] = 3228;
                  this.field8043[11][1] = 3116;
                  this.field8043[12][1] = 3806;
                  this.field8043[12][0] = 3031;
                  this.field8043[12][2] = 3710;
                  this.field8043[12][3] = 3196;
                  this.field8043[13][1] = 3437;
                  this.field8043[13][2] = 3421;
                  this.field8043[13][3] = 3019;
                  this.field8043[13][0] = 3522;
                  this.field8043[14][1] = 3116;
                  this.field8043[14][2] = 3148;
                  this.field8043[14][3] = 3228;
                  this.field8043[14][0] = 3727;
                  this.field8043[15][1] = 2377;
                  this.field8043[15][3] = 2746;
                  this.field8043[15][0] = 4096;
                  this.field8043[15][2] = 2505;
                  return;
               }

               if (arg1 != 6) {
                  throw new RuntimeException(field8044[0]);
               }

               if (!client.field1786) {
                  this.field8043 = new int[4][4];
                  this.field8043[0][0] = 2048;
                  this.field8043[0][1] = 0;
                  this.field8043[0][3] = 0;
                  this.field8043[0][2] = 4096;
                  this.field8043[1][2] = 4096;
                  this.field8043[1][1] = 4096;
                  this.field8043[1][3] = 0;
                  this.field8043[1][0] = 2867;
                  this.field8043[2][3] = 0;
                  this.field8043[2][2] = 4096;
                  this.field8043[2][0] = 3276;
                  this.field8043[2][1] = 4096;
                  this.field8043[3][3] = 0;
                  this.field8043[3][2] = 0;
                  this.field8043[3][1] = 4096;
                  this.field8043[3][0] = 4096;
                  return;
               }
            }

            this.field8043 = new int[2][4];
            this.field8043[0][3] = 0;
            this.field8043[0][1] = 0;
            this.field8043[0][2] = 0;
            this.field8043[0][0] = 0;
            this.field8043[1][2] = 4096;
            this.field8043[1][1] = 4096;
            this.field8043[1][3] = 4096;
            this.field8043[1][0] = 4096;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8044[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(IILica;)V",
      line = 300
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         if (arg1 == 0) {
            label47: {
               int var5 = arg2.method2855(-31007);
               if (var5 != 0) {
                  this.method4069((byte)37, var5);
                  if (!var4) {
                     break label47;
                  }
               }

               this.field8043 = new int[arg2.method2855(-31007)][4];
               int var6 = 0;
               if (var4 || this.field8043.length > var6) {
                  do {
                     this.field8043[var6][0] = arg2.method2848(-93);
                     this.field8043[var6][1] = arg2.method2855(arg0 + -31006) << 4;
                     this.field8043[var6][2] = arg2.method2855(-31007) << 4;
                     this.field8043[var6][3] = arg2.method2855(-31007) << 4;
                     ++var6;
                  } while(this.field8043.length > var6);
               }
            }
         }

         ++field8035;
         if (arg0 != -1) {
            this.field8034 = null;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field8044[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8044[3] : field8044[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(II)[[I",
      line = 347
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field8037;
         int[][] var4 = super.field918.method3276((byte)123, arg1);
         if (arg0 != 32) {
            method4070(95);
         }

         if (super.field918.field6361) {
            int[] var5 = this.method545(0, arg1, (byte)-59);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            int var9 = 0;
            if (var3 || var9 < class678.field10127) {
               do {
                  int var10 = var5[var9] >> 4;
                  if (var10 < 0) {
                     var10 = 0;
                  }

                  if (~var10 < -257) {
                     var10 = 256;
                  }

                  int var11 = this.field8034[var10];
                  var6[var9] = class408.method3277(var11 >> 12, 4080);
                  var7[var9] = class408.method3277(var11 >> 4, 4080);
                  var8[var9] = class408.method3277(var11 << 4, 4080);
                  ++var9;
               } while(var9 < class678.field10127);
            }
         }

         return var4;
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field8044[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "g",
      descriptor = "(I)V",
      line = 402
   )
   public static void method4070(int arg0) {
      try {
         field8038 = null;
         field8041 = null;
         if (arg0 != 3) {
            method4068((class102)null, -45, 0);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8044[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "h",
      descriptor = "(I)V",
      line = 416
   )
   private final void method4071(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field8039;
         int var3 = this.field8043.length;
         if (arg0 <= 116) {
            method4068((class102)null, -118, 58);
         }

         if (var3 > 0) {
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
                        var10000 = var6;
                        var10001 = this.field8043[var7][0];
                     } else if (var3 <= var7) {
                        var10000 = var5;
                        var10001 = var3;
                        if (!var2) {
                           break label85;
                        }
                     } else {
                        var10000 = var6;
                        var10001 = this.field8043[var7][0];
                     }

                     label84:
                     while(true) {
                        while(var10000 < var10001) {
                           var10000 = var5;
                           var10001 = var3;
                           if (!var2) {
                              break label84;
                           }
                        }

                        ++var5;
                        ++var7;
                        if (var3 <= var7) {
                           var10000 = var5;
                           var10001 = var3;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var6;
                           var10001 = this.field8043[var7][0];
                        }
                     }
                  }

                  int var9;
                  int var10;
                  int var11;
                  label116: {
                     if (var10000 >= var10001) {
                        int[] var8 = this.field8043[var3 + -1];
                        var9 = var8[2];
                        var10 = var8[3];
                        var11 = var8[1];
                        if (!var2) {
                           break label116;
                        }
                     }

                     int[] var12 = this.field8043[var5];
                     if (var5 > 0) {
                        int[] var13 = this.field8043[var5 + -1];
                        int var14 = (-var13[0] + var6 << 12) / (var12[0] + -var13[0]);
                        int var15 = -var14 + 4096;
                        var11 = var12[1] * var14 + var13[1] * var15 >> 12;
                        var10 = var12[3] * var14 + var13[3] * var15 >> 12;
                        var9 = var12[2] * var14 + var13[2] * var15 >> 12;
                        if (!var2) {
                           break label116;
                        }
                     }

                     var10 = var12[3];
                     var11 = var12[1];
                     var9 = var12[2];
                  }

                  int var16 = var9 >> 4;
                  int var17 = var10 >> 4;
                  int var18 = var11 >> 4;
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

                  label98: {
                     if (~var16 > -1) {
                        var16 = 0;
                        if (!var2) {
                           break label98;
                        }
                     }

                     if (~var16 < -256) {
                        var16 = 255;
                     }
                  }

                  label103: {
                     if (~var18 > -1) {
                        var18 = 0;
                        if (!var2) {
                           break label103;
                        }
                     }

                     if (~var18 < -256) {
                        var18 = 255;
                     }
                  }

                  this.field8034[var4] = class119.method1087(var17, class119.method1087(var16 << 8, var18 << 16));
                  ++var4;
               } while(var4 < 257);

            }
         }
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field8044[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4073(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
