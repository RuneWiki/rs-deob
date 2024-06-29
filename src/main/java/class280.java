import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class280 extends class264 {
   @OriginalMember(
      owner = "client!tia",
      name = "H",
      descriptor = "I"
   )
   private int field3901 = 1;
   @OriginalMember(
      owner = "client!tia",
      name = "J",
      descriptor = "I"
   )
   private int field3902 = 1;
   @OriginalMember(
      owner = "client!tia",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3903 = new String[]{method2137(method2136("\u000bug1\u007fW")), method2137(method2136("\u000bug1~W")), method2137(method2136("\u000bug1zW")), method2137(method2136("\u0011ijs")), method2137(method2136("\u000bug1|W")), method2137(method2136("\u00042(1@"))};
   @OriginalMember(
      owner = "client!tia",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field3895 = new int[2];
   @OriginalMember(
      owner = "client!tia",
      name = "K",
      descriptor = "[I"
   )
   public static int[] field3894 = new int[4096];
   @OriginalMember(
      owner = "client!tia",
      name = "G",
      descriptor = "I"
   )
   public static int field3896;
   @OriginalMember(
      owner = "client!tia",
      name = "F",
      descriptor = "I"
   )
   public static int field3898;
   @OriginalMember(
      owner = "client!tia",
      name = "N",
      descriptor = "I"
   )
   public static int field3899;
   @OriginalMember(
      owner = "client!tia",
      name = "L",
      descriptor = "I"
   )
   public static int field3900;
   @OriginalMember(
      owner = "client!tia",
      name = "I",
      descriptor = "Lpda;"
   )
   public static class658 field3897;

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         label57: {
            label51: {
               label50: {
                  if (arg0 != 0) {
                     if (arg0 == 1) {
                        break label50;
                     }

                     if (~arg0 != -3) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field3902 = arg1.method1143(-15465);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field3901 = arg1.method1143(-15465);
               if (!var4) {
                  break label57;
               }
            }

            super.field3637 = arg1.method1143(-15465) == 1;
         }

         if (arg2 > 49) {
            ++field3898;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field3903[4] + arg0 + ',' + (arg1 != null ? field3903[5] : field3903[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method2135(boolean arg0) {
      try {
         field3897 = null;
         field3894 = null;
         field3895 = null;
         if (arg0) {
            method2135(true);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3903[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3899;
         int var4 = -111 / ((24 - arg1) / 44);
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = this.field3901 - -1 + this.field3901;
            int var7 = 65536 / var6;
            int var8 = this.field3902 - -this.field3902 + 1;
            int var9 = 65536 / var8;
            int[][] var10 = new int[var6][];
            int var11 = -this.field3901 + arg0;
            if (var3 || arg0 - -this.field3901 >= var11) {
               label110:
               do {
                  int[] var12 = this.method2019(0, -27804, class220.field3144 & var11);
                  int[] var13 = new int[class430.field6152];
                  int var14 = 0;
                  int var15 = -this.field3902;
                  if (var3) {
                     var14 += var12[var15 & class78.field967];
                     ++var15;
                  }

                  while(true) {
                     while(~this.field3902 <= ~var15) {
                        var14 += var12[var15 & class78.field967];
                        ++var15;
                     }

                     int var16 = 0;
                     if (!var3) {
                        if (var3) {
                           var13[var16] = var9 * var14 >> 16;
                           var14 -= var12[-this.field3902 + var16 & class78.field967];
                           ++var16;
                           var14 += var12[class78.field967 & this.field3902 + var16];
                        }

                        while(true) {
                           while(~class430.field6152 < ~var16) {
                              var13[var16] = var9 * var14 >> 16;
                              var14 -= var12[-this.field3902 + var16 & class78.field967];
                              ++var16;
                              var14 += var12[class78.field967 & this.field3902 + var16];
                           }

                           var10[var11 - -this.field3901 + -arg0] = var13;
                           if (!var3) {
                              ++var11;
                              continue label110;
                           }

                           var14 += var12[class78.field967 & this.field3902 + var16];
                        }
                     }

                     ++var15;
                  }
               } while(arg0 - -this.field3901 >= var11);
            }

            int var17 = 0;
            if (var3 || ~class430.field6152 < ~var17) {
               do {
                  int var18 = 0;
                  int var19 = 0;
                  if (var3) {
                     var18 += var10[var19][var17];
                     ++var19;
                  }

                  while(true) {
                     while(var6 > var19) {
                        var18 += var10[var19][var17];
                        ++var19;
                     }

                     var5[var17] = var7 * var18 >> 16;
                     if (!var3) {
                        ++var17;
                        break;
                     }

                     ++var19;
                  }
               } while(~class430.field6152 < ~var17);
            }
         }

         return var5;
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field3903[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "<init>",
      descriptor = "()V"
   )
   public class280() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!tia",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field3900;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 > -117) {
            return null;
         } else {
            if (super.field3634.field8828) {
               int var5;
               int var6;
               int[][][] var9;
               int[][] var10000;
               int[] var30;
               int[] var31;
               label102: {
                  var5 = this.field3901 + this.field3901 + 1;
                  var6 = 65536 / var5;
                  int var7 = this.field3902 + this.field3902 + 1;
                  int var8 = 65536 / var7;
                  var9 = new int[var5][][];
                  int var10 = arg0 - this.field3901;
                  if (var3) {
                     var10000 = this.method2015(0, (byte)76, class220.field3144 & var10);
                  } else if (~(arg0 - -this.field3901) > ~var10) {
                     var30 = var4[0];
                     var31 = var4[1];
                     var10000 = var4;
                     if (!var3) {
                        break label102;
                     }
                  } else {
                     var10000 = this.method2015(0, (byte)76, class220.field3144 & var10);
                  }

                  label101:
                  while(true) {
                     int[][] var11 = var10000;
                     int[][] var12 = new int[3][class430.field6152];
                     int var13 = 0;
                     int var14 = 0;
                     int var15 = 0;
                     int[] var16 = var11[0];
                     int[] var17 = var11[1];
                     int[] var18 = var11[2];
                     int var19 = -this.field3902;
                     int var20;
                     if (var3) {
                        var20 = class78.field967 & var19;
                        var15 += var18[var20];
                        var13 += var16[var20];
                        var14 += var17[var20];
                        ++var19;
                     }

                     while(true) {
                        int var41;
                        if (~this.field3902 > ~var19) {
                           int[] var21 = var12[0];
                           int[] var22 = var12[1];
                           int[] var23 = var12[2];
                           var41 = 0;
                           if (!var3) {
                              label98: {
                                 int var24 = 0;
                                 if (var3) {
                                    var21[var24] = var8 * var13 >> 16;
                                    var22[var24] = var8 * var14 >> 16;
                                    var23[var24] = var8 * var15 >> 16;
                                 } else if (~class430.field6152 >= ~var24) {
                                    var9[-arg0 + var10 + this.field3901] = var12;
                                    if (!var3) {
                                       break label98;
                                    }
                                 } else {
                                    var21[var24] = var8 * var13 >> 16;
                                    var22[var24] = var8 * var14 >> 16;
                                    var23[var24] = var8 * var15 >> 16;
                                 }

                                 while(true) {
                                    int var25 = class78.field967 & var24 - this.field3902;
                                    int var26 = var15 - var18[var25];
                                    ++var24;
                                    int var27 = var14 - var17[var25];
                                    int var28 = var13 - var16[var25];
                                    int var29 = class78.field967 & this.field3902 + var24;
                                    var14 = var17[var29] + var27;
                                    var13 = var16[var29] + var28;
                                    var15 = var18[var29] + var26;
                                    if (~class430.field6152 >= ~var24) {
                                       var9[-arg0 + var10 + this.field3901] = var12;
                                       if (!var3) {
                                          break;
                                       }
                                    } else {
                                       var21[var24] = var8 * var13 >> 16;
                                       var22[var24] = var8 * var14 >> 16;
                                       var23[var24] = var8 * var15 >> 16;
                                    }
                                 }
                              }

                              ++var10;
                              if (~(arg0 - -this.field3901) > ~var10) {
                                 var30 = var4[0];
                                 var31 = var4[1];
                                 var10000 = var4;
                                 if (!var3) {
                                    break label101;
                                 }
                              } else {
                                 var10000 = this.method2015(0, (byte)76, class220.field3144 & var10);
                              }
                              break;
                           }
                        } else {
                           var41 = class78.field967 & var19;
                        }

                        var20 = var41;
                        var15 += var18[var20];
                        var13 += var16[var20];
                        var14 += var17[var20];
                        ++var19;
                     }
                  }
               }

               int[] var32 = var10000[2];
               int var33 = 0;
               if (var3 || var33 < class430.field6152) {
                  do {
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     if (var3 || ~var37 > ~var5) {
                        do {
                           int[][] var38 = var9[var37];
                           var36 += var38[2][var33];
                           var34 += var38[0][var33];
                           var35 += var38[1][var33];
                           ++var37;
                        } while(~var37 > ~var5);
                     }

                     var30[var33] = var6 * var34 >> 16;
                     var31[var33] = var6 * var35 >> 16;
                     var32[var33] = var6 * var36 >> 16;
                     ++var33;
                  } while(var33 < class430.field6152);
               }
            }

            return var4;
         }
      } catch (RuntimeException var40) {
         throw class237.method1823(var40, field3903[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2136(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2137(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 127;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 31;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
