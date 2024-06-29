import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class118 extends class673 {
   @OriginalMember(
      owner = "client!is",
      name = "m",
      descriptor = "Laja;"
   )
   private class106 field1544;
   @OriginalMember(
      owner = "client!is",
      name = "I",
      descriptor = "Lue;"
   )
   private class243 field1557;
   @OriginalMember(
      owner = "client!is",
      name = "n",
      descriptor = "Lfm;"
   )
   private class281 field1539;
   @OriginalMember(
      owner = "client!is",
      name = "o",
      descriptor = "I"
   )
   private int field1550;
   @OriginalMember(
      owner = "client!is",
      name = "J",
      descriptor = "I"
   )
   private int field1534;
   @OriginalMember(
      owner = "client!is",
      name = "s",
      descriptor = "I"
   )
   private int field1547;
   @OriginalMember(
      owner = "client!is",
      name = "B",
      descriptor = "I"
   )
   private int field1549;
   @OriginalMember(
      owner = "client!is",
      name = "p",
      descriptor = "[[F"
   )
   private float[][] field1542;
   @OriginalMember(
      owner = "client!is",
      name = "D",
      descriptor = "[[F"
   )
   private float[][] field1536;
   @OriginalMember(
      owner = "client!is",
      name = "q",
      descriptor = "[[F"
   )
   private float[][] field1551;
   @OriginalMember(
      owner = "client!is",
      name = "C",
      descriptor = "I"
   )
   private int field1545;
   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "Lfi;"
   )
   private class265 field1548;
   @OriginalMember(
      owner = "client!is",
      name = "E",
      descriptor = "Lbc;"
   )
   private class11 field1552;
   @OriginalMember(
      owner = "client!is",
      name = "A",
      descriptor = "Lhv;"
   )
   private class227 field1556;
   @OriginalMember(
      owner = "client!is",
      name = "G",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field1535;
   @OriginalMember(
      owner = "client!is",
      name = "t",
      descriptor = "Ljaclib/memory/Stream;"
   )
   private Stream field1546;
   @OriginalMember(
      owner = "client!is",
      name = "r",
      descriptor = "I"
   )
   private int field1558;
   @OriginalMember(
      owner = "client!is",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1559 = new String[]{method1043(method1042("\u000e%3R0")), method1043(method1042("\u000e%3P0")), method1043(method1042("\u000e%3U0")), method1043(method1042("\t#q}")), method1043(method1042("\u000e%3S0")), method1043(method1042("\u001cx3?e")), method1043(method1042("\u000e%3T0")), method1043(method1042("\u000e%3-q\t?i/0"))};
   @OriginalMember(
      owner = "client!is",
      name = "l",
      descriptor = "[S"
   )
   public static short[] field1537 = new short[256];
   @OriginalMember(
      owner = "client!is",
      name = "u",
      descriptor = "I"
   )
   public static int field1538;
   @OriginalMember(
      owner = "client!is",
      name = "y",
      descriptor = "I"
   )
   public static int field1540;
   @OriginalMember(
      owner = "client!is",
      name = "x",
      descriptor = "I"
   )
   public static int field1554;
   @OriginalMember(
      owner = "client!is",
      name = "H",
      descriptor = "I"
   )
   public static int field1555;
   @OriginalMember(
      owner = "client!is",
      name = "v",
      descriptor = "Lbda;"
   )
   public static class223 field1541;
   @OriginalMember(
      owner = "client!is",
      name = "F",
      descriptor = "Lww;"
   )
   public static class339 field1553;
   @OriginalMember(
      owner = "client!is",
      name = "w",
      descriptor = "[I"
   )
   public static int[] field1543;

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(SB)V"
   )
   private final void method1037(short arg0, byte arg1) {
      try {
         label16: {
            ++field1555;
            if (Stream.method2990()) {
               this.field1546.method3002(arg0);
               if (!client.field1481) {
                  break label16;
               }
            }

            this.field1546.method2992(arg0);
         }

         int var3 = 18 / ((arg1 - -6) / 62);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1559[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(IBIIIII)V"
   )
   private final void method1038(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1481;

      try {
         ++field1554;
         long var9 = -1L;
         int var11 = (arg2 << this.field1544.field5773) + arg3;
         int var12 = (arg4 << this.field1544.field5773) + arg5;
         int var13 = this.field1544.method3288(var11, (byte)121, var12);
         if ((arg3 & 127) == 0 || ~(arg5 & 127) == -1) {
            var9 = 65535L << 16 & (long)var12 << 16 | 65535L & (long)var11;
            class673 var14 = this.field1556.method1818(-1, var9);
            if (var14 != null) {
               this.method1037(((class369)var14).field5148, (byte)115);
               return;
            }
         }

         short var15 = (short)(this.field1558++);
         if (~var9 != 0L) {
            this.field1556.method1808(var9, new class369(var15), 26459);
         }

         float var16;
         float var17;
         float var18;
         label119: {
            if (arg3 != 0 || arg5 != 0) {
               if (~this.field1544.field5764 == ~arg3 && ~arg5 == -1) {
                  var16 = this.field1551[arg0 + 1][arg6];
                  var17 = this.field1536[arg0 + 1][arg6];
                  var18 = this.field1542[arg0 + 1][arg6];
                  if (!var8) {
                     break label119;
                  }
               }

               if (this.field1544.field5764 != arg3 || ~this.field1544.field5764 != ~arg5) {
                  if (~arg3 == -1 && ~this.field1544.field5764 == ~arg5) {
                     var16 = this.field1551[arg0][arg6 + 1];
                     var18 = this.field1542[arg0][arg6 + 1];
                     var17 = this.field1536[arg0][arg6 + 1];
                     if (!var8) {
                        break label119;
                     }
                  }

                  float var19 = (float)arg3 / (float)this.field1544.field5764;
                  float var20 = (float)arg5 / (float)this.field1544.field5764;
                  float var21 = this.field1536[arg0][arg6];
                  float var22 = this.field1551[arg0][arg6];
                  float var23 = this.field1542[arg0][arg6];
                  float var24 = this.field1536[arg0 + 1][arg6];
                  float var25 = this.field1551[arg0 + 1][arg6];
                  float var26 = (this.field1551[arg0 + 1][arg6 - -1] - var25) * var19 + var25;
                  float var27 = (this.field1551[arg0][arg6 + 1] + -var22) * var19 + var22;
                  float var28 = (this.field1536[arg0][arg6 - -1] - var21) * var19 + var21;
                  float var29 = this.field1542[arg0 + 1][arg6];
                  float var30 = (this.field1536[arg0 + 1][arg6 + 1] + -var24) * var19 + var24;
                  float var31 = (this.field1542[arg0][arg6 - -1] + -var23) * var19 + var23;
                  var17 = (var30 - var28) * var20 + var28;
                  float var32 = (this.field1542[arg0 + 1][arg6 - -1] + -var29) * var19 + var29;
                  var16 = (var26 - var27) * var20 + var27;
                  var18 = (-var31 + var32) * var20 + var31;
                  if (!var8) {
                     break label119;
                  }
               }

               var16 = this.field1551[arg0 + 1][arg6 - -1];
               var17 = this.field1536[arg0 + 1][arg6 + 1];
               var18 = this.field1542[arg0 + 1][arg6 - -1];
               if (!var8) {
                  break label119;
               }
            }

            var16 = this.field1551[arg0][arg6];
            var18 = this.field1542[arg0][arg6];
            var17 = this.field1536[arg0][arg6];
         }

         float var33 = (float)(this.field1557.method1927((byte)-8) - var11);
         float var34 = (float)(-var13 + this.field1557.method1926(arg1 ^ -103));
         float var35 = (float)(this.field1557.method1928(125) + -var12);
         float var36 = (float)Math.sqrt((double)(var35 * var35 + var33 * var33 + var34 * var34));
         float var37 = 1.0F / var36;
         float var38 = var34 * var37;
         float var39 = var35 * var37;
         float var40 = var33 * var37;
         float var41 = var36 / (float)this.field1557.method1933(false);
         if (arg1 != -95) {
            this.method1037((short)-128, (byte)-119);
         }

         float var42 = 1.0F - var41 * var41;
         if (var42 < 0.0F) {
            var42 = 0.0F;
         }

         float var43 = var18 * var39 + var16 * var38 + var17 * var40;
         if (var43 < 0.0F) {
            var43 = 0.0F;
         }

         float var44 = var42 * var43 * 2.0F;
         if (var44 > 1.0F) {
            var44 = 1.0F;
         }

         int var45 = this.field1557.method1929(-1);
         int var46 = (int)((float)(var45 >> 16 & 255) * var44);
         if (var46 > 255) {
            var46 = 255;
         }

         int var47 = (int)((float)(var45 >> 8 & 255) * var44);
         if (var47 > 255) {
            var47 = 255;
         }

         int var48;
         label74: {
            var48 = (int)((float)(255 & var45) * var44);
            if (Stream.method2990()) {
               this.field1535.method2994((float)var11);
               this.field1535.method2994((float)var13);
               this.field1535.method2994((float)var12);
               if (!var8) {
                  break label74;
               }
            }

            this.field1535.method2997((float)var11);
            this.field1535.method2997((float)var13);
            this.field1535.method2997((float)var12);
         }

         if (~var48 < -256) {
            var48 = 255;
         }

         label68: {
            if (this.field1539.field3867 != 0) {
               this.field1535.method2993(var46);
               this.field1535.method2993(var47);
               this.field1535.method2993(var48);
               if (!var8) {
                  break label68;
               }
            }

            this.field1535.method2993(var48);
            this.field1535.method2993(var47);
            this.field1535.method2993(var46);
         }

         this.field1535.method2993(255);
         this.method1037(var15, (byte)81);
      } catch (RuntimeException var50) {
         throw class93.method866(var50, field1559[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(BILha;)V"
   )
   public static final void method1039(byte arg0, int arg1, class479 arg2) {
      boolean var3 = client.field1481;

      try {
         ++field1540;
         if (class613.field9018 && class78.field1042) {
            if (class287.field3979) {
               class735.field10727 = class575.field8534.method3269(false);
            }

            class627.field9262 = 0;
            class159.field2042 = 0;
            class26.field399 = 0;
            int[] var4 = arg2.method419();
            class221.field2772 = (int)((float)var4[3] / 3.0F);
            class791.field11571 = (int)((float)var4[2] / 3.0F);
            arg2.method416(class523.field7329);
            if (~((int)((float)class523.field7329[0] / 3.0F)) != ~class277.field3541 || ~((int)((float)class523.field7329[1] / 3.0F)) != ~class362.field5024) {
               class277.field3541 = (int)((float)class523.field7329[0] / 3.0F);
               class362.field5024 = (int)((float)class523.field7329[1] / 3.0F);
               class566.field8330 = new int[class362.field5024 * class277.field3541];
               class649.field9695 = class277.field3541 >> 1;
               class554.field8139 = class362.field5024 >> 1;
            }

            class596.field8821 = arg2.method484();
            class422.field5761 = 0;
            int var5 = 0;
            if (var3) {
               class631.method4658(arg1, class207.field2630[var5], arg2, false);
               ++var5;
            }

            while(true) {
               while(~var5 > ~class484.field6739) {
                  class631.method4658(arg1, class207.field2630[var5], arg2, false);
                  ++var5;
               }

               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     class631.method4658(arg1, class541.field7917[var6], arg2, false);
                     ++var6;
                  }

                  while(true) {
                     while(~class347.field4754 < ~var6) {
                        class631.method4658(arg1, class541.field7917[var6], arg2, false);
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           class631.method4658(arg1, class37.field532[var7], arg2, false);
                           ++var7;
                        }

                        while(true) {
                           int var10000;
                           if (~class367.field5120 >= ~var7) {
                              var10000 = arg0;
                              if (!var3) {
                                 if (arg0 >= -38) {
                                    field1553 = null;
                                 }

                                 class516.field7237 = 0;
                                 if (class422.field5761 > 0) {
                                    int var8 = class566.field8330.length;
                                    int var9 = -var8 + var8 & 7;
                                    int var10 = 0;
                                    if (var3) {
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                    }

                                    while(true) {
                                       while(var9 > var10) {
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                          class566.field8330[var10++] = Integer.MAX_VALUE;
                                       }

                                       if (!var3) {
                                          if (var3 || var8 > var10) {
                                             do {
                                                class566.field8330[var10++] = Integer.MAX_VALUE;
                                             } while(var8 > var10);
                                          }

                                          class535.field7836 = 1;
                                          int var11 = 0;
                                          if (var3 || ~var11 > ~class422.field5761) {
                                             do {
                                                class529 var12 = class379.field5274[var11];
                                                class428.method3313(var12.field7421[0], var12.field7423[3], var12.field7421[1], var12.field7423[0], var12.field7421[3], 94, var12.field7423[1], var12.field7419[0], var12.field7419[1], var12.field7419[3]);
                                                class428.method3313(var12.field7421[1], var12.field7423[3], var12.field7421[2], var12.field7423[1], var12.field7421[3], 117, var12.field7423[2], var12.field7419[1], var12.field7419[2], var12.field7419[3]);
                                                ++var11;
                                             } while(~var11 > ~class422.field5761);
                                          }

                                          class535.field7836 = 2;
                                          break;
                                       }

                                       class566.field8330[var10++] = Integer.MAX_VALUE;
                                    }
                                 }

                                 if (class287.field3979) {
                                    class448.field6062 = class575.field8534.method3269(false) - class735.field10727;
                                    return;
                                 }

                                 return;
                              }
                           } else {
                              var10000 = arg1;
                           }

                           class631.method4658(var10000, class37.field532[var7], arg2, false);
                           ++var7;
                        }
                     }

                     ++var6;
                  }
               }

               ++var5;
            }
         } else {
            class422.field5761 = 0;
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field1559[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1559[5] : field1559[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(III[[ZI)V"
   )
   public final void method1040(int arg0, int arg1, int arg2, boolean[][] arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field1538;
         if (this.field1548 != null) {
            if (~this.field1550 >= ~(arg0 + arg1)) {
               if (~this.field1534 <= ~(-arg0 + arg1)) {
                  if (arg2 - -arg0 >= this.field1547) {
                     if (arg4 != 7083) {
                        this.method1037((short)116, (byte)-25);
                     }

                     if (~(-arg0 + arg2) >= ~this.field1549) {
                        int var7 = this.field1547;
                        if (var6 || ~var7 >= ~this.field1549) {
                           do {
                              int var8 = this.field1550;
                              if (var6 || ~this.field1534 <= ~var8) {
                                 do {
                                    int var9 = -arg1 + var8;
                                    int var10 = -arg2 + var7;
                                    if (-arg0 < var9 && ~arg0 < ~var9 && -arg0 < var10 && var10 < arg0 && arg3[arg0 + var9][arg0 + var10]) {
                                       this.field1539.method2273(0, (byte)((int)(255.0F * this.field1557.method1931(false))));
                                       this.field1539.method1375(this.field1552, true, 0);
                                       this.field1539.method1402(1, this.field1539.field3889);
                                       this.field1539.method1419(0, 0, arg4 + -7037, class629.field9286, this.field1545 / 3, this.field1558, this.field1548);
                                       return;
                                    }

                                    ++var8;
                                 } while(~this.field1534 <= ~var8);
                              }

                              ++var7;
                           } while(~var7 >= ~this.field1549);

                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var12) {
         throw class93.method866(var12, field1559[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1559[5] : field1559[3]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1041(boolean arg0) {
      try {
         field1541 = null;
         field1553 = null;
         if (!arg0) {
            field1543 = null;
            field1537 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1559[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!is",
      name = "<init>",
      descriptor = "(Lfm;Laja;Lue;[I)V"
   )
   public class118(class281 param1, class106 param2, class243 param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1042(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!is",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1043(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 86;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
