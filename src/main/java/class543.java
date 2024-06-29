import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class543 {
   @OriginalMember(
      owner = "client!fb",
      name = "b",
      descriptor = "[I"
   )
   private int[] field7930;
   @OriginalMember(
      owner = "client!fb",
      name = "c",
      descriptor = "I"
   )
   private int field7925;
   @OriginalMember(
      owner = "client!fb",
      name = "n",
      descriptor = "[I"
   )
   private int[] field7936;
   @OriginalMember(
      owner = "client!fb",
      name = "s",
      descriptor = "[[Lgf;"
   )
   private class74[][] field7938;
   @OriginalMember(
      owner = "client!fb",
      name = "r",
      descriptor = "[I"
   )
   private int[] field7942;
   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "[[Lgf;"
   )
   private class74[][] field7929;
   @OriginalMember(
      owner = "client!fb",
      name = "e",
      descriptor = "Lkfa;"
   )
   private class428 field7919;
   @OriginalMember(
      owner = "client!fb",
      name = "m",
      descriptor = "Lbc;"
   )
   private class11 field7939;
   @OriginalMember(
      owner = "client!fb",
      name = "p",
      descriptor = "Lbc;"
   )
   private class11 field7931;
   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "Lfi;"
   )
   private class265 field7940;
   @OriginalMember(
      owner = "client!fb",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7945 = new String[]{method4109(method4108("\u000f:mPA")), method4109(method4108("\u0012vm5\u0014")), method4109(method4108("\u000f:m'\u0000\u000717%A")), method4109(method4108("\u0007-/w")), method4109(method4108("\u000f:m^A")), method4109(method4108("\u000f:mQA")), method4109(method4108("\u000f:m\\A")), method4109(method4108("\u000f:mYA")), method4109(method4108("\u000f:mSA")), method4109(method4108("\u000f:m]A")), method4109(method4108("\u000f:mZA")), method4109(method4108("\u000f:mXA")), method4109(method4108("\u000f:mRA")), method4109(method4108("\u000f:m_A"))};
   @OriginalMember(
      owner = "client!fb",
      name = "y",
      descriptor = "I"
   )
   public static int field7926 = 0;
   @OriginalMember(
      owner = "client!fb",
      name = "v",
      descriptor = "I"
   )
   public static int field7922 = 0;
   @OriginalMember(
      owner = "client!fb",
      name = "h",
      descriptor = "Lifa;"
   )
   public static class75 field7928 = new class75(3, 7);
   @OriginalMember(
      owner = "client!fb",
      name = "x",
      descriptor = "I"
   )
   public static int field7943 = 0;
   @OriginalMember(
      owner = "client!fb",
      name = "o",
      descriptor = "I"
   )
   public static int field7920;
   @OriginalMember(
      owner = "client!fb",
      name = "j",
      descriptor = "I"
   )
   public static int field7921;
   @OriginalMember(
      owner = "client!fb",
      name = "w",
      descriptor = "I"
   )
   public static int field7923;
   @OriginalMember(
      owner = "client!fb",
      name = "g",
      descriptor = "I"
   )
   public static int field7924;
   @OriginalMember(
      owner = "client!fb",
      name = "u",
      descriptor = "I"
   )
   public static int field7927;
   @OriginalMember(
      owner = "client!fb",
      name = "i",
      descriptor = "I"
   )
   public static int field7932;
   @OriginalMember(
      owner = "client!fb",
      name = "t",
      descriptor = "I"
   )
   public static int field7933;
   @OriginalMember(
      owner = "client!fb",
      name = "d",
      descriptor = "I"
   )
   public static int field7935;
   @OriginalMember(
      owner = "client!fb",
      name = "k",
      descriptor = "I"
   )
   public static int field7937;
   @OriginalMember(
      owner = "client!fb",
      name = "l",
      descriptor = "I"
   )
   public static int field7941;
   @OriginalMember(
      owner = "client!fb",
      name = "q",
      descriptor = "I"
   )
   public static int field7944;
   @OriginalMember(
      owner = "client!fb",
      name = "f",
      descriptor = "[Lkr;"
   )
   public static class122[] field7934;

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Lfm;B)V"
   )
   private final void method4097(class281 arg0, byte arg1) {
      try {
         ++field7924;
         if (arg1 == 89) {
            class131.field1674 = arg0.field3821;
            arg0.method2247(108);
            arg0.method2279(false, (byte)-80);
            arg0.method2287(false, 126);
            arg0.method2277(false);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7945[9] + (arg0 != null ? field7945[1] : field7945[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "([FII)[F"
   )
   public static final float[] method4098(float[] arg0, int arg1, int arg2) {
      try {
         ++field7932;
         float[] var3 = new float[arg2];
         class349.method2763(arg0, 0, var3, 0, arg2);
         return arg1 != 3657 ? null : var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7945[8] + (arg0 != null ? field7945[1] : field7945[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(BLfm;)V"
   )
   private final void method4099(byte arg0, class281 arg1) {
      try {
         ++field7920;
         arg1.method2287(true, arg0 ^ 13);
         arg1.method2279(true, (byte)-80);
         if (arg0 != 114) {
            this.field7939 = null;
         }

         if (class131.field1674 != arg1.field3821) {
            arg1.method428(class131.field1674);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7945[5] + arg0 + ',' + (arg1 != null ? field7945[1] : field7945[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Lti;Lgea;I)Lnda;"
   )
   public static final class742 method4100(class546 arg0, class66 arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field7921;
         class742 var4 = new class742(arg0);
         int var5 = arg1.method640(255);
         boolean var6 = ~(1 & var5) != -1;
         int var7 = -123 / ((arg2 - -54) / 54);
         boolean var8 = ~(var5 & 2) != -1;
         boolean var9 = (4 & var5) != 0;
         if (var6) {
            var4.field10852[0] = arg1.method618((byte)-117);
            var4.field10847[0] = arg1.method618((byte)-91);
            if (arg0.field8004 != -1 || arg0.field8025 != -1) {
               var4.field10852[1] = arg1.method618((byte)36);
               var4.field10847[1] = arg1.method618((byte)-107);
            }

            if (arg0.field8023 != -1 || ~arg0.field7992 != 0) {
               var4.field10852[2] = arg1.method618((byte)32);
               var4.field10847[2] = arg1.method618((byte)61);
            }
         }

         boolean var10 = (var5 & 8) != 0;
         if (var8) {
            var4.field10851[0] = arg1.method618((byte)-116);
            var4.field10855[0] = arg1.method618((byte)-101);
            if (arg0.field8053 != -1 || ~arg0.field8040 != 0) {
               var4.field10851[1] = arg1.method618((byte)86);
               var4.field10855[1] = arg1.method618((byte)-99);
            }
         }

         if (var9) {
            int var11 = arg1.method603(-2);
            int[] var12 = new int[]{class109.method974(15, var11), class109.method974(var11 >> 4, 15), class109.method974(3935, var11) >> 8, class109.method974(var11 >> 12, 15)};
            int var13 = 0;
            if (var3 || var13 < 4) {
               do {
                  if (var12[var13] != 15) {
                     var4.field10853[var12[var13]] = (short)arg1.method603(-2);
                  }

                  ++var13;
               } while(var13 < 4);
            }
         }

         if (var10) {
            int var14 = arg1.method640(255);
            int[] var15 = new int[]{class109.method974(var14, 15), class109.method974(15, var14 >> 4)};
            int var16 = 0;
            if (var3 || ~var16 > -3) {
               do {
                  if (~var15[var16] != -16) {
                     var4.field10856[var15[var16]] = (short)arg1.method603(-2);
                  }

                  ++var16;
               } while(~var16 > -3);
            }
         }

         return var4;
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field7945[10] + (arg0 != null ? field7945[1] : field7945[3]) + ',' + (arg1 != null ? field7945[1] : field7945[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(B)Lgg;"
   )
   public static final class120 method4101(byte arg0) {
      try {
         ++field7923;
         if (arg0 >= -123) {
            field7941 = -75;
         }

         return class326.field4469;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7945[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method4102(int arg0) {
      try {
         this.field7939.method105(-100);
         ++field7944;
         if (arg0 > -12) {
            this.method4104((class281)null, 83);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field7945[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(IZLfm;)V"
   )
   private final void method4103(int arg0, boolean arg1, class281 arg2) {
      boolean var4 = client.field1481;

      try {
         ++field7935;
         int var5 = 0;
         class620 var6 = arg2.method2227(86);
         float var7 = var6.field9130;
         float var8 = var6.field9145;
         float var9 = var6.field9170;
         float var10 = var6.field9137;
         float var11 = var6.field9164;
         float var12 = var6.field9123;
         float var13 = var7 + var10;
         float var14 = var8 + var11;
         float var15 = var9 + var12;
         float var16 = var7 - var10;
         float var17 = var8 - var11;
         float var18 = var9 - var12;
         float var19 = -var7 + var10;
         float var20 = -var8 + var11;
         float var21 = -var9 + var12;
         Buffer var22 = this.field7939.method102((byte)-83, arg1);
         if (var22 != null) {
            int var10000;
            Stream var23;
            int var24;
            class543 var75;
            byte var76;
            label480: {
               var23 = arg2.method2235(true, var22);
               if (Stream.method2990()) {
                  label282: {
                     var24 = arg0 + -1;
                     if (var4) {
                        var10000 = ~this.field7942[var24] >= -65 ? this.field7942[var24] : 64;
                     } else if (var24 < 0) {
                        if (!var4) {
                           break label282;
                        }

                        var10000 = 64;
                     } else {
                        var10000 = ~this.field7942[var24] >= -65 ? this.field7942[var24] : 64;
                     }

                     while(true) {
                        int var25 = var10000;
                        if (~var25 >= -1) {
                           --var24;
                        } else {
                           int var26 = var25 + -1;
                           class74 var27;
                           int var28;
                           byte var29;
                           byte var30;
                           byte var31;
                           byte var32;
                           float var33;
                           float var34;
                           float var35;
                           int var36;
                           if (var4) {
                              var27 = this.field7938[var24][var26];
                              var28 = var27.field980;
                              var29 = (byte)(var28 >> 16);
                              var30 = (byte)(var28 >> 8);
                              var31 = (byte)var28;
                              var32 = (byte)(var28 >>> 24);
                              var33 = (float)(var27.field974 >> 12);
                              var34 = (float)(var27.field976 >> 12);
                              var35 = (float)(var27.field977 >> 12);
                              var36 = var27.field982 >> 12;
                              var23.method2994((float)(-var36) * var13 + var33);
                              var23.method2994((float)(-var36) * var14 + var34);
                              var23.method2994((float)(-var36) * var15 + var35);
                              if (arg2.field3867 != 0) {
                                 var23.method3001(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method2991(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method2991(var29, var30, var31, var32);
                              }

                              var23.method2994(0.0F);
                              var23.method2994(0.0F);
                              var23.method2994((float)var36 * var16 + var33);
                              var23.method2994((float)var36 * var17 + var34);
                              var23.method2994((float)var36 * var18 + var35);
                              if (~arg2.field3867 != -1) {
                                 var23.method3001(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method2991(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method2991(var29, var30, var31, var32);
                              }

                              var23.method2994(1.0F);
                              var23.method2994(0.0F);
                              var23.method2994((float)var36 * var13 + var33);
                              var23.method2994((float)var36 * var14 + var34);
                              var23.method2994((float)var36 * var15 + var35);
                              if (~arg2.field3867 != -1) {
                                 var23.method3001(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method2991(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method2991(var29, var30, var31, var32);
                              }

                              var23.method2994(1.0F);
                              var23.method2994(1.0F);
                              var23.method2994((float)var36 * var19 + var33);
                              var23.method2994((float)var36 * var20 + var34);
                              var23.method2994((float)var36 * var21 + var35);
                              if (arg2.field3867 == 0) {
                                 var23.method2991(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method3001(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method3001(var29, var30, var31, var32);
                              }

                              var23.method2994(0.0F);
                              var23.method2994(1.0F);
                              ++var5;
                              --var26;
                           }

                           while(true) {
                              if (var26 < 0) {
                                 var75 = this;
                                 if (!var4) {
                                    if (this.field7942[var24] <= 64) {
                                       --var24;
                                       break;
                                    }

                                    int var37 = this.field7942[var24] + -65;
                                    int var38 = this.field7930[var37] + -1;
                                    if (!var4 && var38 < 0) {
                                       --var24;
                                       break;
                                    }

                                    do {
                                       class74 var39 = this.field7929[var37][var38];
                                       int var40 = var39.field980;
                                       byte var41 = (byte)(var40 >> 16);
                                       byte var42 = (byte)(var40 >> 8);
                                       byte var43 = (byte)var40;
                                       byte var44 = (byte)(var40 >>> 24);
                                       float var45 = (float)(var39.field974 >> 12);
                                       float var46 = (float)(var39.field976 >> 12);
                                       float var47 = (float)(var39.field977 >> 12);
                                       int var48 = var39.field982 >> 12;
                                       var23.method2994((float)(-var48) * var13 + var45);
                                       var23.method2994((float)(-var48) * var14 + var46);
                                       var23.method2994((float)(-var48) * var15 + var47);
                                       if (arg2.field3867 == 0) {
                                          var23.method2991(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method3001(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method3001(var41, var42, var43, var44);
                                       }

                                       var23.method2994(0.0F);
                                       var23.method2994(0.0F);
                                       var23.method2994((float)var48 * var16 + var45);
                                       var23.method2994((float)var48 * var17 + var46);
                                       var23.method2994((float)var48 * var18 + var47);
                                       if (arg2.field3867 == 0) {
                                          var23.method2991(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method3001(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method3001(var41, var42, var43, var44);
                                       }

                                       var23.method2994(1.0F);
                                       var23.method2994(0.0F);
                                       var23.method2994((float)var48 * var13 + var45);
                                       var23.method2994((float)var48 * var14 + var46);
                                       var23.method2994((float)var48 * var15 + var47);
                                       if (arg2.field3867 != 0) {
                                          var23.method3001(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method2991(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method2991(var41, var42, var43, var44);
                                       }

                                       var23.method2994(1.0F);
                                       var23.method2994(1.0F);
                                       var23.method2994((float)var48 * var19 + var45);
                                       var23.method2994((float)var48 * var20 + var46);
                                       var23.method2994((float)var48 * var21 + var47);
                                       if (~arg2.field3867 == -1) {
                                          var23.method2991(var41, var42, var43, var44);
                                          if (var4) {
                                             var23.method3001(var41, var42, var43, var44);
                                          }
                                       } else {
                                          var23.method3001(var41, var42, var43, var44);
                                       }

                                       var23.method2994(0.0F);
                                       ++var5;
                                       var23.method2994(1.0F);
                                       --var38;
                                    } while(var38 >= 0);

                                    --var24;
                                    break;
                                 }
                              } else {
                                 var75 = this;
                              }

                              var27 = var75.field7938[var24][var26];
                              var28 = var27.field980;
                              var29 = (byte)(var28 >> 16);
                              var30 = (byte)(var28 >> 8);
                              var31 = (byte)var28;
                              var32 = (byte)(var28 >>> 24);
                              var33 = (float)(var27.field974 >> 12);
                              var34 = (float)(var27.field976 >> 12);
                              var35 = (float)(var27.field977 >> 12);
                              var36 = var27.field982 >> 12;
                              var23.method2994((float)(-var36) * var13 + var33);
                              var23.method2994((float)(-var36) * var14 + var34);
                              var23.method2994((float)(-var36) * var15 + var35);
                              if (arg2.field3867 != 0) {
                                 var23.method3001(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method2991(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method2991(var29, var30, var31, var32);
                              }

                              var23.method2994(0.0F);
                              var23.method2994(0.0F);
                              var23.method2994((float)var36 * var16 + var33);
                              var23.method2994((float)var36 * var17 + var34);
                              var23.method2994((float)var36 * var18 + var35);
                              if (~arg2.field3867 != -1) {
                                 var23.method3001(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method2991(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method2991(var29, var30, var31, var32);
                              }

                              var23.method2994(1.0F);
                              var23.method2994(0.0F);
                              var23.method2994((float)var36 * var13 + var33);
                              var23.method2994((float)var36 * var14 + var34);
                              var23.method2994((float)var36 * var15 + var35);
                              if (~arg2.field3867 != -1) {
                                 var23.method3001(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method2991(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method2991(var29, var30, var31, var32);
                              }

                              var23.method2994(1.0F);
                              var23.method2994(1.0F);
                              var23.method2994((float)var36 * var19 + var33);
                              var23.method2994((float)var36 * var20 + var34);
                              var23.method2994((float)var36 * var21 + var35);
                              if (arg2.field3867 == 0) {
                                 var23.method2991(var29, var30, var31, var32);
                                 if (var4) {
                                    var23.method3001(var29, var30, var31, var32);
                                 }
                              } else {
                                 var23.method3001(var29, var30, var31, var32);
                              }

                              var23.method2994(0.0F);
                              var23.method2994(1.0F);
                              ++var5;
                              --var26;
                           }
                        }

                        if (var24 < 0) {
                           if (!var4) {
                              break;
                           }

                           var10000 = 64;
                        } else {
                           var10000 = ~this.field7942[var24] >= -65 ? this.field7942[var24] : 64;
                        }
                     }
                  }

                  if (!var4) {
                     var23.method2995();
                     var76 = this.field7939.method104(-19749);
                     if (!var4) {
                        if (var76 != 0) {
                           arg2.method1375(this.field7939, arg1, 0);
                           arg2.method1375(this.field7931, true, 1);
                           arg2.method1402(1, this.field7919);
                           arg2.method1419(0, 0, 89, class629.field9286, var5 * 2, var5 * 4, this.field7940);
                           return;
                        }

                        return;
                     }

                     var10000 = var76 >= -65 ? this.field7942[var24] : 64;
                     break label480;
                  }
               }

               var24 = arg0 - 1;
               if (var4) {
                  var10000 = ~this.field7942[var24] >= -65 ? this.field7942[var24] : 64;
               } else if (~var24 > -1) {
                  var23.method2995();
                  var76 = this.field7939.method104(-19749);
                  if (!var4) {
                     if (var76 != 0) {
                        arg2.method1375(this.field7939, arg1, 0);
                        arg2.method1375(this.field7931, true, 1);
                        arg2.method1402(1, this.field7919);
                        arg2.method1419(0, 0, 89, class629.field9286, var5 * 2, var5 * 4, this.field7940);
                        return;
                     }

                     return;
                  }

                  var10000 = var76 >= -65 ? this.field7942[var24] : 64;
               } else {
                  var10000 = ~this.field7942[var24] >= -65 ? this.field7942[var24] : 64;
               }
            }

            while(true) {
               int var49 = var10000;
               if (var49 <= 0) {
                  --var24;
               } else {
                  int var50 = var49 + -1;
                  class74 var51;
                  int var52;
                  byte var53;
                  byte var54;
                  byte var55;
                  byte var56;
                  float var57;
                  float var58;
                  float var59;
                  int var60;
                  if (var4) {
                     var51 = this.field7938[var24][var50];
                     var52 = var51.field980;
                     var53 = (byte)(var52 >> 16);
                     var54 = (byte)(var52 >> 8);
                     var55 = (byte)var52;
                     var56 = (byte)(var52 >>> 24);
                     var57 = (float)(var51.field974 >> 12);
                     var58 = (float)(var51.field976 >> 12);
                     var59 = (float)(var51.field977 >> 12);
                     var60 = var51.field982 >> 12;
                     var23.method2997((float)(-var60) * var13 + var57);
                     var23.method2997((float)(-var60) * var14 + var58);
                     var23.method2997((float)(-var60) * var15 + var59);
                     if (~arg2.field3867 != -1) {
                        var23.method3001(var53, var54, var55, var56);
                        if (var4) {
                           var23.method2991(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method2991(var53, var54, var55, var56);
                     }

                     var23.method2997(0.0F);
                     var23.method2997(0.0F);
                     var23.method2997((float)var60 * var16 + var57);
                     var23.method2997((float)var60 * var17 + var58);
                     var23.method2997((float)var60 * var18 + var59);
                     if (~arg2.field3867 == -1) {
                        var23.method2991(var53, var54, var55, var56);
                        if (var4) {
                           var23.method3001(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method3001(var53, var54, var55, var56);
                     }

                     var23.method2997(1.0F);
                     var23.method2997(0.0F);
                     var23.method2997((float)var60 * var13 + var57);
                     var23.method2997((float)var60 * var14 + var58);
                     var23.method2997((float)var60 * var15 + var59);
                     if (arg2.field3867 == 0) {
                        var23.method2991(var53, var54, var55, var56);
                        if (var4) {
                           var23.method3001(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method3001(var53, var54, var55, var56);
                     }

                     var23.method2997(1.0F);
                     var23.method2997(1.0F);
                     var23.method2997((float)var60 * var19 + var57);
                     var23.method2997((float)var60 * var20 + var58);
                     var23.method2997((float)var60 * var21 + var59);
                     if (~arg2.field3867 != -1) {
                        var23.method3001(var53, var54, var55, var56);
                        if (var4) {
                           var23.method2991(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method2991(var53, var54, var55, var56);
                     }

                     var23.method2997(0.0F);
                     var23.method2997(1.0F);
                     ++var5;
                     --var50;
                  }

                  while(true) {
                     if (~var50 > -1) {
                        var75 = this;
                        if (!var4) {
                           if (~this.field7942[var24] >= -65) {
                              --var24;
                              break;
                           }

                           int var61 = this.field7942[var24] + -64 + -1;
                           int var62 = this.field7930[var61] + -1;
                           if (!var4 && var62 < 0) {
                              --var24;
                              break;
                           }

                           do {
                              class74 var63 = this.field7929[var61][var62];
                              int var64 = var63.field980;
                              byte var65 = (byte)(var64 >> 16);
                              byte var66 = (byte)(var64 >> 8);
                              byte var67 = (byte)var64;
                              byte var68 = (byte)(var64 >>> 24);
                              float var69 = (float)(var63.field974 >> 12);
                              float var70 = (float)(var63.field976 >> 12);
                              float var71 = (float)(var63.field977 >> 12);
                              int var72 = var63.field982 >> 12;
                              var23.method2997((float)(-var72) * var13 + var69);
                              var23.method2997((float)(-var72) * var14 + var70);
                              var23.method2997((float)(-var72) * var15 + var71);
                              if (~arg2.field3867 == -1) {
                                 var23.method2991(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method3001(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method3001(var65, var66, var67, var68);
                              }

                              var23.method2997(0.0F);
                              var23.method2997(0.0F);
                              var23.method2997((float)var72 * var16 + var69);
                              var23.method2997((float)var72 * var17 + var70);
                              var23.method2997((float)var72 * var18 + var71);
                              if (~arg2.field3867 != -1) {
                                 var23.method3001(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method2991(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method2991(var65, var66, var67, var68);
                              }

                              var23.method2997(1.0F);
                              var23.method2997(0.0F);
                              var23.method2997((float)var72 * var13 + var69);
                              var23.method2997((float)var72 * var14 + var70);
                              var23.method2997((float)var72 * var15 + var71);
                              if (arg2.field3867 == 0) {
                                 var23.method2991(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method3001(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method3001(var65, var66, var67, var68);
                              }

                              var23.method2997(1.0F);
                              var23.method2997(1.0F);
                              var23.method2997((float)var72 * var19 + var69);
                              var23.method2997((float)var72 * var20 + var70);
                              var23.method2997((float)var72 * var21 + var71);
                              if (arg2.field3867 != 0) {
                                 var23.method3001(var65, var66, var67, var68);
                                 if (var4) {
                                    var23.method2991(var65, var66, var67, var68);
                                 }
                              } else {
                                 var23.method2991(var65, var66, var67, var68);
                              }

                              var23.method2997(0.0F);
                              ++var5;
                              var23.method2997(1.0F);
                              --var62;
                           } while(var62 >= 0);

                           --var24;
                           break;
                        }
                     } else {
                        var75 = this;
                     }

                     var51 = var75.field7938[var24][var50];
                     var52 = var51.field980;
                     var53 = (byte)(var52 >> 16);
                     var54 = (byte)(var52 >> 8);
                     var55 = (byte)var52;
                     var56 = (byte)(var52 >>> 24);
                     var57 = (float)(var51.field974 >> 12);
                     var58 = (float)(var51.field976 >> 12);
                     var59 = (float)(var51.field977 >> 12);
                     var60 = var51.field982 >> 12;
                     var23.method2997((float)(-var60) * var13 + var57);
                     var23.method2997((float)(-var60) * var14 + var58);
                     var23.method2997((float)(-var60) * var15 + var59);
                     if (~arg2.field3867 != -1) {
                        var23.method3001(var53, var54, var55, var56);
                        if (var4) {
                           var23.method2991(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method2991(var53, var54, var55, var56);
                     }

                     var23.method2997(0.0F);
                     var23.method2997(0.0F);
                     var23.method2997((float)var60 * var16 + var57);
                     var23.method2997((float)var60 * var17 + var58);
                     var23.method2997((float)var60 * var18 + var59);
                     if (~arg2.field3867 == -1) {
                        var23.method2991(var53, var54, var55, var56);
                        if (var4) {
                           var23.method3001(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method3001(var53, var54, var55, var56);
                     }

                     var23.method2997(1.0F);
                     var23.method2997(0.0F);
                     var23.method2997((float)var60 * var13 + var57);
                     var23.method2997((float)var60 * var14 + var58);
                     var23.method2997((float)var60 * var15 + var59);
                     if (arg2.field3867 == 0) {
                        var23.method2991(var53, var54, var55, var56);
                        if (var4) {
                           var23.method3001(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method3001(var53, var54, var55, var56);
                     }

                     var23.method2997(1.0F);
                     var23.method2997(1.0F);
                     var23.method2997((float)var60 * var19 + var57);
                     var23.method2997((float)var60 * var20 + var58);
                     var23.method2997((float)var60 * var21 + var59);
                     if (~arg2.field3867 != -1) {
                        var23.method3001(var53, var54, var55, var56);
                        if (var4) {
                           var23.method2991(var53, var54, var55, var56);
                        }
                     } else {
                        var23.method2991(var53, var54, var55, var56);
                     }

                     var23.method2997(0.0F);
                     var23.method2997(1.0F);
                     ++var5;
                     --var50;
                  }
               }

               if (~var24 > -1) {
                  var23.method2995();
                  var76 = this.field7939.method104(-19749);
                  if (!var4) {
                     if (var76 != 0) {
                        arg2.method1375(this.field7939, arg1, 0);
                        arg2.method1375(this.field7931, true, 1);
                        arg2.method1402(1, this.field7919);
                        arg2.method1419(0, 0, 89, class629.field9286, var5 * 2, var5 * 4, this.field7940);
                        return;
                     }

                     return;
                  }

                  var10000 = var76 >= -65 ? this.field7942[var24] : 64;
               } else {
                  var10000 = ~this.field7942[var24] >= -65 ? this.field7942[var24] : 64;
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class93.method866(var74, field7945[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7945[1] : field7945[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Lfm;I)V"
   )
   public final void method4104(class281 arg0, int arg1) {
      try {
         this.field7939.method101(30842, arg1, 24);
         ++field7927;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7945[13] + (arg0 != null ? field7945[1] : field7945[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Lfm;II)V"
   )
   private final void method4105(class281 arg0, int arg1, int arg2) {
      try {
         class131.field1674 = arg0.field3821;
         ++field7933;
         arg0.method2220((float)arg1, (byte)119);
         arg0.method2255((byte)76);
         arg0.method2279(false, (byte)-80);
         arg0.method2287(false, arg2 ^ 8083);
         if (arg2 == 8191) {
            arg0.method2277(false);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field7945[11] + (arg0 != null ? field7945[1] : field7945[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method4106(boolean arg0) {
      try {
         field7928 = null;
         field7934 = null;
         if (arg0) {
            field7928 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field7945[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fb",
      name = "a",
      descriptor = "(ZLfm;ILnh;)V"
   )
   public final void method4107(boolean param1, class281 param2, int param3, class554 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fb",
      name = "<init>",
      descriptor = "(Lfm;)V"
   )
   public class543(class281 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4108(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4109(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
