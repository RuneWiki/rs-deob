import java.awt.Frame;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public abstract class class422 {
   @OriginalMember(
      owner = "client!de",
      name = "g",
      descriptor = "I"
   )
   public int field5743 = 4;
   @OriginalMember(
      owner = "client!de",
      name = "b",
      descriptor = "I"
   )
   private int field5753 = 4;
   @OriginalMember(
      owner = "client!de",
      name = "c",
      descriptor = "[S"
   )
   private short[] field5747 = new short[512];
   @OriginalMember(
      owner = "client!de",
      name = "q",
      descriptor = "I"
   )
   private int field5748 = 0;
   @OriginalMember(
      owner = "client!de",
      name = "e",
      descriptor = "I"
   )
   private int field5756 = 4;
   @OriginalMember(
      owner = "client!de",
      name = "d",
      descriptor = "I"
   )
   private int field5752 = 4;
   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5762 = new String[]{method3283(method3282("aMg\u0015KkA=\u0017\n")), method3283(method3282("aMge\n")), method3283(method3282("~\u0006g\u0007_")), method3283(method3282("k]%E")), method3283(method3282("aMg`\n")), method3283(method3282("aMgg\n")), method3283(method3282("aMgb\n")), method3283(method3282("aMgd\n")), method3283(method3282("aMgc\n"))};
   @OriginalMember(
      owner = "client!de",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field5745 = new int[8];
   @OriginalMember(
      owner = "client!de",
      name = "s",
      descriptor = "Lrea;"
   )
   public static class39 field5751;
   @OriginalMember(
      owner = "client!de",
      name = "l",
      descriptor = "Lrea;"
   )
   public static class39 field5749 = field5751 = new class39(false);
   @OriginalMember(
      owner = "client!de",
      name = "j",
      descriptor = "I"
   )
   public static int field5759 = 0;
   @OriginalMember(
      owner = "client!de",
      name = "r",
      descriptor = "I"
   )
   public static int field5761 = 0;
   @OriginalMember(
      owner = "client!de",
      name = "i",
      descriptor = "[[I"
   )
   public static int[][] field5758 = new int[128][128];
   @OriginalMember(
      owner = "client!de",
      name = "n",
      descriptor = "I"
   )
   public static int field5744;
   @OriginalMember(
      owner = "client!de",
      name = "m",
      descriptor = "I"
   )
   public static int field5746;
   @OriginalMember(
      owner = "client!de",
      name = "k",
      descriptor = "I"
   )
   public static int field5754;
   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "I"
   )
   public static int field5755;
   @OriginalMember(
      owner = "client!de",
      name = "o",
      descriptor = "I"
   )
   public static int field5757;
   @OriginalMember(
      owner = "client!de",
      name = "f",
      descriptor = "I"
   )
   public static int field5760;
   @OriginalMember(
      owner = "client!de",
      name = "p",
      descriptor = "[S"
   )
   private short[] field5750;

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(Lww;BIZJII)V"
   )
   public static final void method3273(class339 arg0, byte arg1, int arg2, boolean arg3, long arg4, int arg5, int arg6) {
      try {
         class74.method714(0, arg6, (byte)117, arg2, arg0, arg4, arg3, arg5);
         if (arg1 <= 45) {
            field5745 = null;
         }

         ++field5755;
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field5762[4] + (arg0 != null ? field5762[2] : field5762[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "e",
      descriptor = "(I)V"
   )
   public static void method3274(int arg0) {
      try {
         field5749 = null;
         field5758 = null;
         field5745 = null;
         field5751 = null;
         if (arg0 != -348281108) {
            field5745 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5762[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "d",
      descriptor = "(I)V"
   )
   public abstract void method3275(int arg0);

   @OriginalMember(
      owner = "client!de",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method3276(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!de",
      name = "b",
      descriptor = "(I)V"
   )
   public abstract void method3277(int arg0);

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(III)V"
   )
   public abstract void method3278(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(I)V"
   )
   private final void method3279(int arg0) {
      boolean var2 = client.field1481;

      try {
         ++field5746;
         if (arg0 >= -110) {
            this.field5750 = null;
         }

         Random var3 = new Random((long)this.field5748);
         int var4 = 0;
         if (var2) {
            this.field5747[var4] = (short)var4;
            ++var4;
         }

         while(true) {
            while(~var4 > -256) {
               this.field5747[var4] = (short)var4;
               ++var4;
            }

            int var5 = 0;
            if (!var2) {
               if (!var2 && ~var5 <= -256) {
                  return;
               } else {
                  do {
                     int var6 = -var5 + 255;
                     int var7 = class145.method1178(5733, var6, var3);
                     short var8 = this.field5747[var7];
                     this.field5747[var7] = this.field5747[var6];
                     this.field5747[var6] = this.field5747[var6 - -256] = var8;
                     ++var5;
                  } while(~var5 > -256);

                  return;
               }
            }

            ++var4;
         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5762[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(IIILgj;II)Ljava/awt/Frame;"
   )
   public static final Frame method3280(int arg0, int arg1, int arg2, class736 arg3, int arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field5757;
         if (!arg3.method5343(-27358)) {
            return null;
         } else {
            if (arg1 == 0) {
               class593[] var7 = class424.method3293(78, arg3);
               if (var7 == null) {
                  return null;
               }

               int var10000;
               label110: {
                  byte var8 = 0;
                  int var9 = 0;
                  if (var6) {
                     var10000 = arg4;
                  } else if (~var7.length >= ~var9) {
                     var10000 = var8;
                     if (!var6) {
                        break label110;
                     }
                  } else {
                     var10000 = arg4;
                  }

                  while(true) {
                     if (var10000 == var7[var9].field8741) {
                        if (~var7[var9].field8742 == ~arg2) {
                           if (~arg0 != -1) {
                              if (~var7[var9].field8745 == ~arg0) {
                                 if (var8 != 0) {
                                    if (var7[var9].field8743 > arg1) {
                                       var8 = 1;
                                       arg1 = var7[var9].field8743;
                                       ++var9;
                                    } else {
                                       ++var9;
                                    }
                                 } else {
                                    var8 = 1;
                                    arg1 = var7[var9].field8743;
                                    ++var9;
                                 }
                              } else {
                                 ++var9;
                              }
                           } else if (var8 != 0) {
                              if (var7[var9].field8743 > arg1) {
                                 var8 = 1;
                                 arg1 = var7[var9].field8743;
                                 ++var9;
                              } else {
                                 ++var9;
                              }
                           } else {
                              var8 = 1;
                              arg1 = var7[var9].field8743;
                              ++var9;
                           }
                        } else {
                           ++var9;
                        }
                     } else {
                        ++var9;
                     }

                     if (~var7.length >= ~var9) {
                        var10000 = var8;
                        if (!var6) {
                           break;
                        }
                     } else {
                        var10000 = arg4;
                     }
                  }
               }

               if (var10000 == 0) {
                  return null;
               }
            }

            class769 var10 = arg3.method5342(1, arg1, arg2, arg0, arg4);
            int var11 = -34 % ((arg5 - 34) / 49);
            if (var6) {
               class340.method2717(10L, (byte)-119);
            }

            while(var10.field11210 == 0) {
               class340.method2717(10L, (byte)-119);
            }

            Frame var12 = (Frame)var10.field11212;
            if (var12 == null) {
               return null;
            } else if (~var10.field11210 == -3) {
               class473.method3601(arg3, (byte)73, var12);
               return null;
            } else {
               return var12;
            }
         }
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field5762[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5762[2] : field5762[3]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public final void method3281(int arg0, int arg1, byte arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         ++field5760;
         int[] var6 = new int[arg1];
         int[] var7 = new int[arg0];
         int[] var8 = new int[arg3];
         int var9 = 0;
         if (var5) {
            var6[var9] = (var9 << 12) / arg1;
            ++var9;
         }

         while(true) {
            while(arg1 > var9) {
               var6[var9] = (var9 << 12) / arg1;
               ++var9;
            }

            int var10 = 0;
            if (!var5) {
               if (var5) {
                  var7[var10] = (var10 << 12) / arg0;
                  ++var10;
               }

               while(true) {
                  while(arg0 > var10) {
                     var7[var10] = (var10 << 12) / arg0;
                     ++var10;
                  }

                  if (!var5) {
                     if (arg2 != -123) {
                        this.method3279(-46);
                     }

                     int var11 = 0;
                     if (var5) {
                        var8[var11] = (var11 << 12) / arg3;
                        ++var11;
                     }

                     while(true) {
                        while(var11 < arg3) {
                           var8[var11] = (var11 << 12) / arg3;
                           ++var11;
                        }

                        this.method3277(-1136577940);
                        int var12 = 0;
                        if (!var5) {
                           if (!var5 && var12 >= arg3) {
                              return;
                           }

                           do {
                              int var13 = 0;
                              if (var5 || ~var13 > ~arg0) {
                                 do {
                                    int var14 = 0;
                                    if (var5 || ~var14 > ~arg1) {
                                       do {
                                          class422 var10000;
                                          label127: {
                                             int var15 = 0;
                                             if (var5) {
                                                var10000 = this;
                                             } else if (~this.field5743 >= ~var15) {
                                                var10000 = this;
                                                if (!var5) {
                                                   break label127;
                                                }
                                             } else {
                                                var10000 = this;
                                             }

                                             while(true) {
                                                int var16 = var10000.field5750[var15] << 12;
                                                int var17 = var7[var13] * var16 >> 12;
                                                int var18 = this.field5752 * var16 >> 12;
                                                int var19 = var8[var12] * var16 >> 12;
                                                int var20 = this.field5753 * var16 >> 12;
                                                int var21 = this.field5756 * var16 >> 12;
                                                int var22 = var6[var14] * var16 >> 12;
                                                int var23 = this.field5756 * var19;
                                                int var24 = this.field5752 * var17;
                                                int var25 = this.field5753 * var22;
                                                int var26 = var25 >> 12;
                                                int var27 = var26 + 1;
                                                int var28 = var26 & 255;
                                                int var29 = var24 >> 12;
                                                int var30 = var29 - -1;
                                                int var31 = var29 & 255;
                                                int var32 = var23 >> 12;
                                                int var33 = var32 + 1;
                                                int var34;
                                                if (var30 < var18) {
                                                   var34 = var30 & 255;
                                                   if (var5) {
                                                      var34 = 0;
                                                   }
                                                } else {
                                                   var34 = 0;
                                                }

                                                int var35 = var25 & 4095;
                                                int var36 = var24 & 4095;
                                                if (var20 <= var27) {
                                                   var27 = 0;
                                                   if (var5) {
                                                      var27 &= 255;
                                                   }
                                                } else {
                                                   var27 &= 255;
                                                }

                                                if (~var21 >= ~var33) {
                                                   var33 = 0;
                                                   if (var5) {
                                                      var33 &= 255;
                                                   }
                                                } else {
                                                   var33 &= 255;
                                                }

                                                int var37 = var32 & 255;
                                                int var38 = var23 & 4095;
                                                int var39 = var38 - 4096;
                                                int var40 = var35 + -4096;
                                                int var41 = class22.field336[var36];
                                                int var42 = class22.field336[var38];
                                                int var43 = class22.field336[var35];
                                                short var44 = this.field5747[var33];
                                                int var45 = var36 + -4096;
                                                short var46 = this.field5747[var37];
                                                short var47 = this.field5747[var34 + var44];
                                                short var48 = this.field5747[var34 + var46];
                                                short var49 = this.field5747[var31 + var46];
                                                short var50 = this.field5747[var31 + var44];
                                                int var51 = class589.method4385(var36, this.field5747[var28 + var49], var35, var38, false);
                                                int var52 = class589.method4385(var36, this.field5747[var27 - -var49], var40, var38, false);
                                                int var53 = var51 - -((-var51 + var52) * var43 >> 12);
                                                int var54 = class589.method4385(var45, this.field5747[var28 + var48], var35, var38, false);
                                                int var55 = class589.method4385(var45, this.field5747[var27 + var48], var40, var38, false);
                                                int var56 = ((-var54 + var55) * var43 >> 12) + var54;
                                                int var57 = ((-var53 + var56) * var41 >> 12) + var53;
                                                int var58 = class589.method4385(var36, this.field5747[var28 - -var50], var35, var39, false);
                                                int var59 = class589.method4385(var36, this.field5747[var27 + var50], var40, var39, false);
                                                int var60 = ((var59 - var58) * var43 >> 12) + var58;
                                                int var61 = class589.method4385(var45, this.field5747[var28 + var47], var35, var39, false);
                                                int var62 = class589.method4385(var45, this.field5747[var27 + var47], var40, var39, false);
                                                int var63 = ((var62 - var61) * var43 >> 12) + var61;
                                                int var64 = ((-var60 + var63) * var41 >> 12) + var60;
                                                this.method3278(((-var57 + var64) * var42 >> 12) + var57, arg2 + 8425, var15);
                                                ++var15;
                                                if (~this.field5743 >= ~var15) {
                                                   var10000 = this;
                                                   if (!var5) {
                                                      break;
                                                   }
                                                } else {
                                                   var10000 = this;
                                                }
                                             }
                                          }

                                          var10000.method3275(19733);
                                          ++var14;
                                       } while(~var14 > ~arg1);
                                    }

                                    ++var13;
                                 } while(~var13 > ~arg0);
                              }

                              ++var12;
                           } while(var12 < arg3);

                           return;
                        }

                        ++var11;
                     }
                  }

                  ++var10;
               }
            }

            ++var9;
         }
      } catch (RuntimeException var66) {
         throw class93.method866(var66, field5762[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "<init>",
      descriptor = "(IIIII)V"
   )
   public class422(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.field5752 = arg3;
         this.field5753 = arg2;
         this.field5748 = arg0;
         this.field5743 = arg1;
         this.field5756 = arg4;
         this.method3276(-104);
         this.method3279(-122);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5762[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3282(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3283(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
