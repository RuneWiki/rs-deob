import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class684 extends class302 {
   @OriginalMember(
      owner = "client!kja",
      name = "P",
      descriptor = "I"
   )
   private int field10251 = 1024;
   @OriginalMember(
      owner = "client!kja",
      name = "J",
      descriptor = "I"
   )
   private int field10254 = 409;
   @OriginalMember(
      owner = "client!kja",
      name = "W",
      descriptor = "I"
   )
   private int field10253 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "T",
      descriptor = "I"
   )
   private int field10260 = 819;
   @OriginalMember(
      owner = "client!kja",
      name = "X",
      descriptor = "I"
   )
   private int field10259 = 1024;
   @OriginalMember(
      owner = "client!kja",
      name = "I",
      descriptor = "I"
   )
   private int field10262 = 1024;
   @OriginalMember(
      owner = "client!kja",
      name = "H",
      descriptor = "I"
   )
   private int field10256 = 1024;
   @OriginalMember(
      owner = "client!kja",
      name = "L",
      descriptor = "I"
   )
   private int field10261 = 0;
   @OriginalMember(
      owner = "client!kja",
      name = "O",
      descriptor = "I"
   )
   private int field10266 = 2048;
   @OriginalMember(
      owner = "client!kja",
      name = "K",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10267 = new String[]{method4976(method4975("[QG\u000fc\u0018")), method4976(method4975("[QG\u000fd\u0018")), method4976(method4975("[QG\u000f`\u0018")), method4976(method4975("K\u0015\b\u000fZ")), method4976(method4975("^NJM")), method4976(method4975("[QG\u000ff\u0018")), method4976(method4975("[QG\u000fb\u0018")), method4976(method4975("[QG\u000fa\u0018"))};
   @OriginalMember(
      owner = "client!kja",
      name = "N",
      descriptor = "I"
   )
   public static int field10252;
   @OriginalMember(
      owner = "client!kja",
      name = "Q",
      descriptor = "I"
   )
   public static int field10255;
   @OriginalMember(
      owner = "client!kja",
      name = "M",
      descriptor = "I"
   )
   public static int field10257;
   @OriginalMember(
      owner = "client!kja",
      name = "V",
      descriptor = "I"
   )
   private int field10258;
   @OriginalMember(
      owner = "client!kja",
      name = "R",
      descriptor = "I"
   )
   public static int field10263;
   @OriginalMember(
      owner = "client!kja",
      name = "U",
      descriptor = "I"
   )
   public static int field10264;
   @OriginalMember(
      owner = "client!kja",
      name = "S",
      descriptor = "I"
   )
   public static int field10265;

   @OriginalMember(
      owner = "client!kja",
      name = "<init>",
      descriptor = "()V"
   )
   public class684() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(Leaa;Z)V"
   )
   public static final void method4972(class526 arg0, boolean arg1) {
      try {
         ++field10265;
         class630.field9166 = 0;
         class733.field10869 = 0;
         if (!arg1) {
            class425.field6457 = new class14();
            class442.field6738 = new class404[1024];
            class659.field9557 = new class737[class124.field1513[class467.field7001] + 1];
            class497.field7371 = 0;
            class621.field9053 = 0;
            class417.method3188(64, arg0);
            class597.method4373((byte)106, arg0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10267[2] + (arg0 != null ? field10267[3] : field10267[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         if (arg0 >= -87) {
            method4974(-122);
         }

         ++field10255;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10267[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "([[ILjava/util/Random;IIIIZ)V"
   )
   private final void method4973(int[][] param1, Random param2, int param3, int param4, int param5, int param6, boolean param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      int var4 = client.field4530;

      try {
         label100: {
            label99: {
               label98: {
                  label97: {
                     label96: {
                        label95: {
                           label94: {
                              label93: {
                                 label92: {
                                    ++field10264;
                                    if (arg0 != 0) {
                                       if (arg0 == 1) {
                                          break label92;
                                       }

                                       if (arg0 == 2) {
                                          break label93;
                                       }

                                       if (arg0 == 3) {
                                          break label94;
                                       }

                                       if (~arg0 == -5) {
                                          break label95;
                                       }

                                       if (~arg0 == -6) {
                                          break label96;
                                       }

                                       if (arg0 == 6) {
                                          break label97;
                                       }

                                       if (~arg0 == -8) {
                                          break label98;
                                       }

                                       if (arg0 != 8) {
                                          break label100;
                                       }

                                       if (var4 == 0) {
                                          break label99;
                                       }
                                    }

                                    this.field10253 = arg2.method1104(255);
                                    if (var4 == 0) {
                                       break label100;
                                    }
                                 }

                                 this.field10259 = arg2.method1038((byte)-100);
                                 if (var4 == 0) {
                                    break label100;
                                 }
                              }

                              this.field10266 = arg2.method1038((byte)-99);
                              if (var4 == 0) {
                                 break label100;
                              }
                           }

                           this.field10254 = arg2.method1038((byte)-125);
                           if (var4 == 0) {
                              break label100;
                           }
                        }

                        this.field10260 = arg2.method1038((byte)-107);
                        if (var4 == 0) {
                           break label100;
                        }
                     }

                     this.field10251 = arg2.method1038((byte)-94);
                     if (var4 == 0) {
                        break label100;
                     }
                  }

                  this.field10261 = arg2.method1104(255);
                  if (var4 == 0) {
                     break label100;
                  }
               }

               this.field10262 = arg2.method1038((byte)-126);
               if (var4 == 0) {
                  break label100;
               }
            }

            this.field10256 = arg2.method1038((byte)-117);
         }

         if (arg1 != 0) {
            this.field10260 = -36;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10267[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10267[3] : field10267[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "f",
      descriptor = "(I)V"
   )
   public static final void method4974(int arg0) {
      try {
         if (class774.field11327 >= 0) {
            long var1;
            label24: {
               var1 = class188.method1462(true);
               class774.field11327 = (int)((long)class774.field11327 - (var1 - class55.field661));
               if (~class774.field11327 >= -1) {
                  class382.field5864 = class334.field4779.field3993;
                  class774.field11327 = -1;
                  class748.field11090 = class334.field4779.field3992;
                  class175.field2171 = class334.field4779.field3983;
                  class55.field648 = class334.field4779.field3988;
                  class472.field7060 = class334.field4779.field3995;
                  class155.field1969 = class334.field4779.field3989;
                  class4.field76 = class334.field4779.field3986;
                  class560.field8376 = class334.field4779.field3996;
                  class500.field7431 = class334.field4779.field3984;
                  class442.field6743 = class334.field4779.field3994;
                  if (client.field4530 == 0) {
                     break label24;
                  }
               }

               int var3 = (class774.field11327 << 8) / class502.field7462;
               int var4 = -var3 + 255;
               float var5 = (float)var3 / 255.0F;
               class155.field1969 = (-16711936 & (16711935 & class566.field8433) * var3 - -((16711935 & class334.field4779.field3989) * var4)) - -(16711680 & (class566.field8433 & 65280) * var3 + (65280 & class334.field4779.field3989) * var4) >>> 8;
               float var6 = -var5 + 1.0F;
               class560.field8376 = class243.field3106 * var3 + class334.field4779.field3996 * var4 >> 8;
               class4.field76 = (-class332.field4760 + class334.field4779.field3986) * var6 + class332.field4760;
               class472.field7060 = (16711680 & (class635.field9250 & 65280) * var3 - -((65280 & class334.field4779.field3995) * var4)) + ((class635.field9250 & 16711935) * var3 + (16711935 & class334.field4779.field3995) * var4 & -16711936) >>> 8;
               class175.field2171 = (class334.field4779.field3983 - class181.field2250) * var6 + class181.field2250;
               class442.field6743 = (class334.field4779.field3994 - class102.field1252) * var6 + class102.field1252;
               class500.field7431 = (-class219.field2791 + class334.field4779.field3984) * var6 + class219.field2791;
               class748.field11090 = (-class748.field11094 + class334.field4779.field3992) * var6 + class748.field11094;
               class382.field5864 = (-class728.field10824 + class334.field4779.field3993) * var6 + class728.field10824;
               if (class159.field2017 != class334.field4779.field3988) {
                  class55.field648 = class459.field6944.method608(class159.field2017, class334.field4779.field3988, var6, class55.field648);
               }
            }

            class55.field661 = var1;
         }

         ++field10257;
         if (arg0 != 1) {
            method4974(119);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10267[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field10252;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (arg1 > -37) {
            this.method4973((int[][])null, (Random)null, 118, 50, 115, 118, true);
         }

         if (super.field4298.field6356) {
            int[][] var5 = super.field4298.method3176(-1);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            byte var12 = 1;
            int var13 = 0;
            int var14 = 0;
            int var15 = class344.field5238 * this.field10259 >> 12;
            int var16 = class344.field5238 * this.field10266 >> 12;
            int var17 = class501.field7439 * this.field10254 >> 12;
            int var18 = class501.field7439 * this.field10260 >> 12;
            if (var18 <= 1) {
               return var5[arg0];
            }

            this.field10258 = class344.field5238 / 8 * this.field10251 >> 12;
            int var19 = class344.field5238 / var15 + 1;
            int[][] var20 = new int[var19][3];
            int[][] var21 = new int[var19][3];
            Random var22 = new Random((long)this.field10253);

            do {
               int var23;
               int var24;
               int var25;
               int var26;
               label171:
               do {
                  int var10000;
                  label183: {
                     label91: {
                        var23 = var15 + class413.method3157(var22, -var15 + var16, (byte)54);
                        var24 = var17 + class413.method3157(var22, -var17 + var18, (byte)54);
                        var25 = var9 + var23;
                        if (~var25 < ~class344.field5238) {
                           var25 = class344.field5238;
                           var10000 = -var9 + class344.field5238;
                           if (var3 != 0) {
                              break label91;
                           }

                           var23 = var10000;
                        }

                        var10000 = var12;
                     }

                     if (var10000 != 0) {
                        var26 = 0;
                        if (var3 == 0) {
                           break label183;
                        }
                     }

                     int var27 = var10;
                     int[] var28 = var21[var10];
                     int var29 = 0;
                     int var30 = var6 + var25;
                     if (var30 < 0) {
                        var30 += class344.field5238;
                     }

                     if (var30 > class344.field5238) {
                        var30 -= class344.field5238;
                     }

                     var26 = var28[2];

                     label145:
                     while(true) {
                        int[] var31 = var21[var27];
                        if (var30 >= var31[0] && ~var30 >= ~var31[1]) {
                           break;
                        }

                        ++var29;
                        ++var27;

                        while(var27 >= var13) {
                           var27 = 0;
                           if (var3 == 0) {
                              if (var3 != 0) {
                                 break label145;
                              }
                              break;
                           }
                        }
                     }

                     if (~var10 != ~var27) {
                        int var32 = var9 - -var6;
                        if (var32 < 0) {
                           var32 += class344.field5238;
                        }

                        if (~var32 < ~class344.field5238) {
                           var32 -= class344.field5238;
                        }

                        int var33 = 1;
                        if (var3 != 0 || ~var33 >= ~var29) {
                           do {
                              int[] var34 = var21[(var10 + var33) % var13];
                              var26 = Math.max(var26, var34[2]);
                              ++var33;
                           } while(~var33 >= ~var29);
                        }

                        int var35 = 0;
                        if (var3 != 0 || var29 >= var35) {
                           do {
                              int[] var36 = var21[(var10 + var35) % var13];
                              int var37 = var36[2];
                              if (var26 == var37) {
                                 ++var35;
                              } else {
                                 int var40;
                                 int var41;
                                 label114: {
                                    int var38 = var36[0];
                                    int var39 = var36[1];
                                    if (var30 <= var32) {
                                       if (~var38 == -1) {
                                          var40 = 0;
                                          var41 = Math.min(var30, var39);
                                          if (var3 == 0) {
                                             break label114;
                                          }
                                       }

                                       var40 = Math.max(var32, var38);
                                       var41 = class344.field5238;
                                       if (var3 == 0) {
                                          break label114;
                                       }
                                    }

                                    var40 = Math.max(var32, var38);
                                    var41 = Math.min(var30, var39);
                                 }

                                 this.method4973(var5, var22, var8 + var40, var37, var26 - var37, -var40 + var41, false);
                                 ++var35;
                              }
                           } while(var29 >= var35);
                        }
                     }

                     var10 = var27;
                  }

                  label151: {
                     if (class501.field7439 < var24 + var26) {
                        var24 = -var26 + class501.field7439;
                        if (var3 == 0) {
                           break label151;
                        }
                     }

                     var11 = false;
                  }

                  if (class344.field5238 != var25) {
                     break;
                  }

                  this.method4973(var5, var22, var7 + var9, var26, var24, var23, false);
                  if (var11) {
                     return var4;
                  }

                  var11 = true;
                  int[] var42 = var20[var14++];
                  var42[1] = var25;
                  var42[2] = var24 + var26;
                  var42[0] = var9;
                  int[][] var43 = var21;
                  var21 = var20;
                  var13 = var14;
                  var20 = var43;
                  var8 = var7;
                  var14 = 0;
                  var7 = class413.method3157(var22, class344.field5238, (byte)54);
                  var9 = 0;
                  var6 = var7 - var8;
                  int var44 = var6;
                  if (~var6 > -1) {
                     var44 = class344.field5238 + var6;
                  }

                  if (~var44 < ~class344.field5238) {
                     var44 -= class344.field5238;
                  }

                  var10 = 0;
                  var12 = 0;

                  while(true) {
                     int[] var45 = var21[var10];
                     if (~var44 <= ~var45[0] && ~var45[1] <= ~var44) {
                        break;
                     }

                     var10000 = ~var13;
                     ++var10;

                     while(var10000 >= ~var10) {
                        var10000 = 0;
                        if (var3 == 0) {
                           var10 = 0;
                           if (var3 != 0) {
                              continue label171;
                           }
                           break;
                        }
                     }
                  }
               } while(var3 == 0);

               int[] var46 = var20[var14++];
               var46[0] = var9;
               var46[1] = var25;
               var46[2] = var24 + var26;
               this.method4973(var5, var22, var7 + var9, var26, var24, var23, false);
               var9 = var25;
            } while(var3 == 0);
         }

         return var4;
      } catch (RuntimeException var48) {
         throw class670.method4877(var48, field10267[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4975(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4976(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
