import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class475 extends class629 {
   @OriginalMember(
      owner = "client!oja",
      name = "R",
      descriptor = "I"
   )
   private int field6941 = 2;
   @OriginalMember(
      owner = "client!oja",
      name = "P",
      descriptor = "I"
   )
   private int field6943 = 1;
   @OriginalMember(
      owner = "client!oja",
      name = "N",
      descriptor = "I"
   )
   private int field6935 = 2048;
   @OriginalMember(
      owner = "client!oja",
      name = "J",
      descriptor = "I"
   )
   private int field6934 = 5;
   @OriginalMember(
      owner = "client!oja",
      name = "I",
      descriptor = "I"
   )
   private int field6932 = 5;
   @OriginalMember(
      owner = "client!oja",
      name = "Q",
      descriptor = "[S"
   )
   private short[] field6944 = new short[512];
   @OriginalMember(
      owner = "client!oja",
      name = "E",
      descriptor = "[B"
   )
   private byte[] field6946 = new byte[512];
   @OriginalMember(
      owner = "client!oja",
      name = "H",
      descriptor = "I"
   )
   private int field6936 = 0;
   @OriginalMember(
      owner = "client!oja",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6947 = new String[]{method3599(method3598("~)\u001b\u000e")), method3599(method3598("krYLX")), method3599(method3598("\u007f6\u0016L`8")), method3599(method3598("\u007f6\u0016Lo8")), method3599(method3598("\u007f6\u0016Lh8")), method3599(method3598("\u007f6\u0016Lk8")), method3599(method3598("\u007f6\u0016Ll8"))};
   @OriginalMember(
      owner = "client!oja",
      name = "G",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field6933 = new BigInteger(method3599(method3598("(kOU\u0015vlEP\u001cq9\u0012\u0007\u001d'?DWAt>E[D%nBP@qdNRF(o\u0015PD'nA\u0001C)dOV\u001d%9GU\u001d(8A\u0000@(iEW\u0012t?DZ\u0011qdFU\u0011v:FT\u0015%?\u0011Q\u0016\"8F\u0007\u001c$jD\u0001G#o\u0012\u0004\u001c kO\u0006\u001dr?\u0012QC!kFTA%:\u0015Z\u0017$dA[@'n\u0013")), 16);
   @OriginalMember(
      owner = "client!oja",
      name = "D",
      descriptor = "I"
   )
   public static int field6939 = -1;
   @OriginalMember(
      owner = "client!oja",
      name = "F",
      descriptor = "I"
   )
   public static int field6938;
   @OriginalMember(
      owner = "client!oja",
      name = "M",
      descriptor = "I"
   )
   public static int field6940;
   @OriginalMember(
      owner = "client!oja",
      name = "L",
      descriptor = "I"
   )
   public static int field6942;
   @OriginalMember(
      owner = "client!oja",
      name = "K",
      descriptor = "I"
   )
   public static int field6945;
   @OriginalMember(
      owner = "client!oja",
      name = "O",
      descriptor = "Lvaa;"
   )
   public static class492 field6937;

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(B)V",
      line = 5
   )
   private final void method3596(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(I)V",
      line = 34
   )
   public final void method901(int arg0) {
      try {
         ++field6938;
         if (arg0 == 245880940) {
            this.field6946 = class138.method1288(5, this.field6936);
            this.method3596((byte)77);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field6947[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 48
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         label82: {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              if (arg2 != 0) {
                                 if (~arg2 == -2) {
                                    break label76;
                                 }

                                 if (arg2 == 2) {
                                    break label77;
                                 }

                                 if (arg2 == 3) {
                                    break label78;
                                 }

                                 if (~arg2 == -5) {
                                    break label79;
                                 }

                                 if (arg2 == 5) {
                                    break label80;
                                 }

                                 if (~arg2 != -7) {
                                    break label82;
                                 }

                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field6934 = this.field6932 = arg0.method3564((byte)-58);
                              if (!var4) {
                                 break label82;
                              }
                           }

                           this.field6936 = arg0.method3564((byte)-76);
                           if (!var4) {
                              break label82;
                           }
                        }

                        this.field6935 = arg0.method3565(true);
                        if (!var4) {
                           break label82;
                        }
                     }

                     this.field6941 = arg0.method3564((byte)-121);
                     if (!var4) {
                        break label82;
                     }
                  }

                  this.field6943 = arg0.method3564((byte)-66);
                  if (!var4) {
                     break label82;
                  }
               }

               this.field6934 = arg0.method3564((byte)-66);
               if (!var4) {
                  break label82;
               }
            }

            this.field6932 = arg0.method3564((byte)-128);
         }

         if (arg1 == 0) {
            ++field6945;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field6947[2] + (arg0 != null ? field6947[1] : field6947[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "<init>",
      descriptor = "()V",
      line = 374
   )
   public class475() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "(II)[I",
      line = 136
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != 2048) {
            this.field6943 = 99;
         }

         ++field6942;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (super.field9161.field7474) {
            int var5 = class442.field6448[arg0] * this.field6932 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 - -1;
            int var8 = 0;
            if (var3 || class66.field1214 > var8) {
               do {
                  int var10000;
                  int var21;
                  label296: {
                     class763.field11052 = Integer.MAX_VALUE;
                     class719.field10378 = Integer.MAX_VALUE;
                     class359.field5378 = Integer.MAX_VALUE;
                     class15.field245 = Integer.MAX_VALUE;
                     int var9 = class429.field6201[var8] * this.field6934 + 2048;
                     int var10 = var9 >> 12;
                     int var11 = var10 + 1;
                     int var12 = var6 + -1;
                     if (var3) {
                        var10000 = 255;
                     } else if (var12 > var7) {
                        var21 = this.field6941;
                        var10000 = var21;
                        if (!var3) {
                           break label296;
                        }
                     } else {
                        var10000 = 255;
                     }

                     while(true) {
                        label292: {
                           int var13 = var10000 & this.field6946[255 & (~var12 <= ~this.field6932 ? -this.field6932 + var12 : var12)];
                           int var14 = var10 - 1;
                           int var10001;
                           int var10002;
                           byte[] var25;
                           if (var3) {
                              var25 = this.field6946;
                              var10001 = var13;
                              var10002 = this.field6934 > var14 ? var14 : var14 - this.field6934;
                           } else {
                              if (~var11 > ~var14) {
                                 break label292;
                              }

                              var25 = this.field6946;
                              var10001 = var13;
                              var10002 = this.field6934 > var14 ? var14 : var14 - this.field6934;
                           }

                           while(true) {
                              int var19;
                              label284: {
                                 int var16;
                                 int var17;
                                 label283: {
                                    double var26;
                                    label334: {
                                       label335: {
                                          int var15 = (var25[var10001 + var10002 & 255] & 255) * 2;
                                          int var24 = var15 + 1;
                                          var16 = var9 + (-this.field6944[var15] - (var14 << 12));
                                          var17 = -(var12 << 12) + -this.field6944[var24] + var5;
                                          int var18 = this.field6943;
                                          if (~var18 != -2) {
                                             if (var18 == 3) {
                                                var16 = ~var16 > -1 ? -var16 : var16;
                                                var17 = ~var17 <= -1 ? var17 : -var17;
                                                var10000 = ~var17 > ~var16 ? var16 : var17;
                                                break label335;
                                             }

                                             if (var18 == 4) {
                                                var16 = (int)(Math.sqrt((double)((float)(~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                                var26 = 4096.0D;
                                                var10001 = var17 >= 0 ? var17 : -var17;
                                                break label334;
                                             }

                                             if (~var18 == -6) {
                                                break label283;
                                             }

                                             if (var18 != 2) {
                                                var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                                break label284;
                                             }

                                             if (!var3) {
                                                var19 = (~var16 <= -1 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                                if (var3) {
                                                   var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                                }
                                                break label284;
                                             }
                                          }

                                          var19 = var16 * var16 + var17 * var17 >> 12;
                                          if (!var3) {
                                             break label284;
                                          }

                                          var16 = ~var16 > -1 ? -var16 : var16;
                                          var17 = ~var17 <= -1 ? var17 : -var17;
                                          var10000 = ~var17 > ~var16 ? var16 : var17;
                                       }

                                       var19 = var10000;
                                       if (!var3) {
                                          break label284;
                                       }

                                       var16 = (int)(Math.sqrt((double)((float)(~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                       var26 = 4096.0D;
                                       var10001 = var17 >= 0 ? var17 : -var17;
                                    }

                                    var17 = (int)(var26 * Math.sqrt((double)((float)var10001 / 4096.0F)));
                                    int var20 = var16 + var17;
                                    var19 = var20 * var20 >> 12;
                                    if (!var3) {
                                       break label284;
                                    }
                                 }

                                 var16 *= var16;
                                 var17 *= var17;
                                 var19 = (int)(Math.sqrt(Math.sqrt((double)((float)(var16 + var17) / 1.6777216E7F))) * 4096.0D);
                                 if (var3) {
                                    var19 = (~var16 <= -1 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                    if (var3) {
                                       var19 = (int)(4096.0D * Math.sqrt((double)((float)(var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                    }
                                 }
                              }

                              label288: {
                                 if (~class15.field245 < ~var19) {
                                    class763.field11052 = class719.field10378;
                                    class719.field10378 = class359.field5378;
                                    class359.field5378 = class15.field245;
                                    class15.field245 = var19;
                                    if (!var3) {
                                       ++var14;
                                       break label288;
                                    }
                                 }

                                 if (~var19 <= ~class359.field5378) {
                                    if (~var19 > ~class719.field10378) {
                                       class763.field11052 = class719.field10378;
                                       class719.field10378 = var19;
                                       if (var3) {
                                          if (~class763.field11052 < ~var19) {
                                             class763.field11052 = var19;
                                             if (var3) {
                                                class763.field11052 = class719.field10378;
                                                class719.field10378 = class359.field5378;
                                                class359.field5378 = var19;
                                                ++var14;
                                             } else {
                                                ++var14;
                                             }
                                          } else {
                                             ++var14;
                                          }
                                       } else {
                                          ++var14;
                                       }
                                    } else if (~class763.field11052 < ~var19) {
                                       class763.field11052 = var19;
                                       if (var3) {
                                          class763.field11052 = class719.field10378;
                                          class719.field10378 = class359.field5378;
                                          class359.field5378 = var19;
                                          ++var14;
                                       } else {
                                          ++var14;
                                       }
                                    } else {
                                       ++var14;
                                    }
                                 } else {
                                    class763.field11052 = class719.field10378;
                                    class719.field10378 = class359.field5378;
                                    class359.field5378 = var19;
                                    ++var14;
                                 }
                              }

                              if (~var11 > ~var14) {
                                 break;
                              }

                              var25 = this.field6946;
                              var10001 = var13;
                              var10002 = this.field6934 > var14 ? var14 : var14 - this.field6934;
                           }
                        }

                        ++var12;
                        if (var12 > var7) {
                           var21 = this.field6941;
                           var10000 = var21;
                           if (!var3) {
                              break;
                           }
                        } else {
                           var10000 = 255;
                        }
                     }
                  }

                  label320: {
                     label319: {
                        label318: {
                           label317: {
                              label316: {
                                 if (var10000 != 0) {
                                    if (~var21 == -2) {
                                       break label316;
                                    }

                                    if (var21 == 3) {
                                       break label317;
                                    }

                                    if (var21 == 4) {
                                       break label318;
                                    }

                                    if (~var21 != -3) {
                                       break label320;
                                    }

                                    if (!var3) {
                                       break label319;
                                    }
                                 }

                                 var4[var8] = class15.field245;
                                 if (!var3) {
                                    break label320;
                                 }
                              }

                              var4[var8] = class359.field5378;
                              if (!var3) {
                                 break label320;
                              }
                           }

                           var4[var8] = class719.field10378;
                           if (!var3) {
                              break label320;
                           }
                        }

                        var4[var8] = class763.field11052;
                        if (!var3) {
                           break label320;
                        }
                     }

                     var4[var8] = -class15.field245 + class359.field5378;
                  }

                  ++var8;
               } while(class66.field1214 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var23) {
         throw class608.method4462(var23, field6947[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "g",
      descriptor = "(I)V",
      line = 349
   )
   public static void method3597(int arg0) {
      try {
         field6933 = null;
         if (arg0 == 5226) {
            field6937 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6947[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3598(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3599(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 16;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
