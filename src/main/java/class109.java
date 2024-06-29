import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class109 extends class264 {
   @OriginalMember(
      owner = "client!al",
      name = "S",
      descriptor = "I"
   )
   private int field1352 = 2048;
   @OriginalMember(
      owner = "client!al",
      name = "P",
      descriptor = "I"
   )
   private int field1353 = 0;
   @OriginalMember(
      owner = "client!al",
      name = "N",
      descriptor = "I"
   )
   private int field1359 = 10;
   @OriginalMember(
      owner = "client!al",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1362 = new String[]{method887(method886("Hb \u0001\u0017")), method887(method886("Hb \u000e\u0017")), method887(method886("R  kB")), method887(method886("Hb \u0004\u0017")), method887(method886("G{b)")), method887(method886("Hb \u0006\u0017")), method887(method886("Hb \u0007\u0017")), method887(method886("Hb \u0000\u0017"))};
   @OriginalMember(
      owner = "client!al",
      name = "I",
      descriptor = "F"
   )
   public static float field1354;
   @OriginalMember(
      owner = "client!al",
      name = "F",
      descriptor = "I"
   )
   public static int field1350;
   @OriginalMember(
      owner = "client!al",
      name = "Q",
      descriptor = "I"
   )
   public static int field1351;
   @OriginalMember(
      owner = "client!al",
      name = "L",
      descriptor = "I"
   )
   public static int field1356;
   @OriginalMember(
      owner = "client!al",
      name = "R",
      descriptor = "I"
   )
   public static int field1357;
   @OriginalMember(
      owner = "client!al",
      name = "O",
      descriptor = "I"
   )
   public static int field1358;
   @OriginalMember(
      owner = "client!al",
      name = "H",
      descriptor = "I"
   )
   public static int field1360;
   @OriginalMember(
      owner = "client!al",
      name = "M",
      descriptor = "[I"
   )
   private int[] field1355;
   @OriginalMember(
      owner = "client!al",
      name = "K",
      descriptor = "[I"
   )
   private int[] field1361;

   @OriginalMember(
      owner = "client!al",
      name = "d",
      descriptor = "(I)V",
      line = 4
   )
   private final void method883(int arg0) {
      boolean var2 = client.field4360;

      try {
         ++field1357;
         this.field1355 = new int[this.field1359 + 1];
         this.field1361 = new int[this.field1359 - -1];
         int var3 = 0;
         int var4 = 4096 / this.field1359;
         int var5 = this.field1352 * var4 >> 12;
         int var6 = 0;
         if (var2) {
            this.field1361[var6] = var3;
            this.field1355[var6] = var3 + var5;
            var3 += var4;
            ++var6;
         }

         while(true) {
            while(~var6 > ~this.field1359) {
               this.field1361[var6] = var3;
               this.field1355[var6] = var3 + var5;
               var3 += var4;
               ++var6;
            }

            if (!var2) {
               if (arg0 >= -89) {
                  return;
               }

               this.field1361[this.field1359] = 4096;
               this.field1355[this.field1359] = 4096 - -this.field1355[0];
               return;
            }

            var3 = arg0 + -89;
            ++var6;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field1362[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(BII)V",
      line = 36
   )
   public static final void method884(byte arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field1358;
         if (arg0 != -22) {
            field1354 = 0.10816828F;
         }

         if (~class430.field6152 != ~arg2) {
            class258.field3496 = new int[arg2];
            int var4 = 0;
            if (var3) {
               class258.field3496[var4] = (var4 << 12) / arg2;
               ++var4;
            }

            while(true) {
               while(~arg2 < ~var4) {
                  class258.field3496[var4] = (var4 << 12) / arg2;
                  ++var4;
               }

               class430.field6152 = arg2;
               class684.field10073 = arg2 * 32;
               if (!var3) {
                  class78.field967 = arg2 + -1;
                  break;
               }

               ++var4;
            }
         }

         if (class20.field234 != arg1) {
            label57: {
               if (~class430.field6152 != ~arg1) {
                  class666.field9668 = new int[arg1];
                  int var5 = 0;
                  if (var3) {
                     class666.field9668[var5] = (var5 << 12) / arg1;
                     ++var5;
                  }

                  while(true) {
                     while(~arg1 < ~var5) {
                        class666.field9668[var5] = (var5 << 12) / arg1;
                        ++var5;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label57;
                        }
                        break;
                     }

                     ++var5;
                  }
               }

               class666.field9668 = class258.field3496;
            }

            class20.field234 = arg1;
            class220.field3144 = arg1 + -1;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1362[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 83
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label46: {
            label45: {
               label44: {
                  ++field1351;
                  if (arg0 != 0) {
                     if (arg0 == 1) {
                        break label44;
                     }

                     if (arg0 != 2) {
                        break label46;
                     }

                     if (!var4) {
                        break label45;
                     }
                  }

                  this.field1359 = arg1.method1143(-15465);
                  if (!var4) {
                     break label46;
                  }
               }

               this.field1352 = arg1.method1211(-26166);
               if (!var4) {
                  break label46;
               }
            }

            this.field1353 = arg1.method1143(-15465);
         }

         if (arg2 < 49) {
            this.field1353 = 38;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field1362[3] + arg0 + ',' + (arg1 != null ? field1362[2] : field1362[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "<init>",
      descriptor = "()V",
      line = 128
   )
   public class109() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(I)V",
      line = 136
   )
   public final void method413(int arg0) {
      try {
         if (arg0 <= 49) {
            this.field1361 = null;
         }

         ++field1360;
         this.method883(-101);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field1362[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "a",
      descriptor = "(II)[I",
      line = 151
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = -83 / ((arg1 - 24) / 44);
         ++field1356;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = class666.field9668[arg0];
            if (this.field1353 == 0) {
               label202: {
                  short var7 = 0;
                  int var8 = 0;
                  if (var3) {
                     if (this.field1361[var8] <= var6) {
                        if (~this.field1361[var8 + 1] < ~var6) {
                           if (this.field1355[var8] > var6) {
                              var7 = 4096;
                              if (var3) {
                                 ++var8;
                              } else {
                                 class242.method1854(var5, 0, class430.field6152, var7);
                                 if (!var3) {
                                    break label202;
                                 }

                                 ++var8;
                              }
                           } else {
                              class242.method1854(var5, 0, class430.field6152, var7);
                              if (!var3) {
                                 break label202;
                              }

                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     } else {
                        ++var8;
                     }
                  }

                  label201:
                  while(true) {
                     while(this.field1359 > var8) {
                        if (this.field1361[var8] <= var6) {
                           if (~this.field1361[var8 + 1] < ~var6) {
                              if (this.field1355[var8] > var6) {
                                 var7 = 4096;
                                 if (var3) {
                                    ++var8;
                                 } else {
                                    class242.method1854(var5, 0, class430.field6152, var7);
                                    if (!var3) {
                                       break label201;
                                    }

                                    ++var8;
                                 }
                              } else {
                                 class242.method1854(var5, 0, class430.field6152, var7);
                                 if (!var3) {
                                    break label201;
                                 }

                                 ++var8;
                              }
                           } else {
                              ++var8;
                           }
                        } else {
                           ++var8;
                        }
                     }

                     class242.method1854(var5, 0, class430.field6152, var7);
                     if (!var3) {
                        break;
                     }

                     ++var8;
                  }
               }

               if (!var3) {
                  return var5;
               }
            }

            int var9 = 0;
            if (var3 || ~class430.field6152 < ~var9) {
               do {
                  int var10;
                  short var11;
                  label75: {
                     int var12;
                     label74: {
                        label73: {
                           var10 = 0;
                           var11 = 0;
                           var12 = class258.field3496[var9];
                           int var13 = this.field1353;
                           if (var13 != 1) {
                              if (var13 == 2) {
                                 break label73;
                              }

                              if (~var13 != -4) {
                                 break label75;
                              }

                              if (!var3) {
                                 break label74;
                              }
                           }

                           var10 = var12;
                           if (!var3) {
                              break label75;
                           }
                        }

                        var10 = 2048 - -(var6 + -4096 + var12 >> 1);
                        if (!var3) {
                           break label75;
                        }
                     }

                     var10 = (-var6 + var12 >> 1) + 2048;
                  }

                  label133: {
                     int var14 = 0;
                     if (var3) {
                        if (this.field1361[var14] <= var10) {
                           if (var10 < this.field1361[var14 + 1]) {
                              if (var10 < this.field1355[var14]) {
                                 var11 = 4096;
                                 if (var3) {
                                    ++var14;
                                 } else {
                                    var5[var9] = var11;
                                    if (!var3) {
                                       break label133;
                                    }

                                    ++var14;
                                 }
                              } else {
                                 var5[var9] = var11;
                                 if (!var3) {
                                    break label133;
                                 }

                                 ++var14;
                              }
                           } else {
                              ++var14;
                           }
                        } else {
                           ++var14;
                        }
                     }

                     label132:
                     while(true) {
                        while(this.field1359 > var14) {
                           if (this.field1361[var14] <= var10) {
                              if (var10 < this.field1361[var14 + 1]) {
                                 if (var10 < this.field1355[var14]) {
                                    var11 = 4096;
                                    if (var3) {
                                       ++var14;
                                    } else {
                                       var5[var9] = var11;
                                       if (!var3) {
                                          break label132;
                                       }

                                       ++var14;
                                    }
                                 } else {
                                    var5[var9] = var11;
                                    if (!var3) {
                                       break label132;
                                    }

                                    ++var14;
                                 }
                              } else {
                                 ++var14;
                              }
                           } else {
                              ++var14;
                           }
                        }

                        var5[var9] = var11;
                        if (!var3) {
                           break;
                        }

                        ++var14;
                     }
                  }

                  ++var9;
               } while(~class430.field6152 < ~var9);
            }
         }

         return var5;
      } catch (RuntimeException var16) {
         throw class237.method1823(var16, field1362[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "b",
      descriptor = "(B)V",
      line = 271
   )
   public static final void method885(byte arg0) {
      boolean var1 = client.field4360;

      try {
         ++field1350;
         if (class130.field1665 == null) {
            class130.field1665 = new int[65536];
            if (!var1) {
               double var2 = -0.015D + 0.03D * Math.random() + 0.7D;
               int var4 = 0;
               int var5 = 0;
               int var27;
               if (!var1 && ~var5 <= -513) {
                  var27 = 84 % ((arg0 - -5) / 41);
                  return;
               }

               do {
                  float var6 = ((float)(var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                  float var7 = (float)(7 & var5) / 8.0F + 0.0625F;
                  int var8 = 0;
                  if (var1 || var8 < 128) {
                     do {
                        float var10;
                        float var11;
                        float var12;
                        label91: {
                           float var9 = (float)var8 / 128.0F;
                           var10 = 0.0F;
                           var11 = 0.0F;
                           var12 = 0.0F;
                           float var13 = var6 / 60.0F;
                           int var14 = (int)var13;
                           int var15 = var14 % 6;
                           float var16 = (float)(-var14) + var13;
                           float var17 = (1.0F - var7) * var9;
                           float var18 = (1.0F - var7 * var16) * var9;
                           float var19 = (1.0F - (1.0F - var16) * var7) * var9;
                           if (~var15 == -1) {
                              var10 = var9;
                              var12 = var17;
                              var11 = var19;
                              if (!var1) {
                                 break label91;
                              }
                           }

                           if (var15 != 1) {
                              label72: {
                                 if (~var15 != -3) {
                                    if (var15 != 3) {
                                       if (~var15 == -5) {
                                          var11 = var17;
                                          var12 = var9;
                                          var10 = var19;
                                          if (!var1) {
                                             break label72;
                                          }
                                       }

                                       if (var15 != 5) {
                                          break label72;
                                       }

                                       var10 = var9;
                                       var12 = var18;
                                       var11 = var17;
                                       if (!var1) {
                                          break label72;
                                       }
                                    }

                                    var11 = var18;
                                    var12 = var9;
                                    var10 = var17;
                                    if (!var1) {
                                       break label72;
                                    }
                                 }

                                 var11 = var9;
                                 var10 = var17;
                                 var12 = var19;
                                 if (var1) {
                                    var12 = var17;
                                    var11 = var9;
                                    var10 = var18;
                                 }
                              }
                           } else {
                              var12 = var17;
                              var11 = var9;
                              var10 = var18;
                           }
                        }

                        float var20 = (float)Math.pow((double)var10, var2);
                        float var21 = (float)Math.pow((double)var11, var2);
                        float var22 = (float)Math.pow((double)var12, var2);
                        int var23 = (int)(var20 * 256.0F);
                        int var24 = (int)(var21 * 256.0F);
                        int var25 = (int)(var22 * 256.0F);
                        int var26 = (var24 << 8) + var25 + -16777216 - -(var23 << 16);
                        class130.field1665[var4++] = var26;
                        ++var8;
                     } while(var8 < 128);
                  }

                  ++var5;
               } while(~var5 > -513);

               var27 = 84 % ((arg0 - -5) / 41);
               return;
            }
         }

      } catch (RuntimeException var29) {
         throw class237.method1823(var29, field1362[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method886(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!al",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method887(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 41;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
