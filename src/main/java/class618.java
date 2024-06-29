import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hja")
public class class618 extends class70 {
   @OriginalMember(
      owner = "client!hja",
      name = "J",
      descriptor = "I"
   )
   private int field9099 = 1;
   @OriginalMember(
      owner = "client!hja",
      name = "Q",
      descriptor = "I"
   )
   private int field9097 = 1;
   @OriginalMember(
      owner = "client!hja",
      name = "S",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9105 = new String[]{method4554(method4553("7z}n\u000bw")), method4554(method4553("7z}n\u0006w")), method4554(method4553("7z}n\u0001w")), method4554(method4553("7z}n\u0000w")), method4554(method4553("1ep,")), method4554(method4553("$>2n9")), method4554(method4553("7z}n\u0007w"))};
   @OriginalMember(
      owner = "client!hja",
      name = "P",
      descriptor = "I"
   )
   public static int field9102 = 0;
   @OriginalMember(
      owner = "client!hja",
      name = "N",
      descriptor = "Laka;"
   )
   public static class418 field9101 = new class418(89, 0);
   @OriginalMember(
      owner = "client!hja",
      name = "O",
      descriptor = "[F"
   )
   public static float[] field9104 = new float[]{0.0F, -1.0F, 0.0F, 0.0F};
   @OriginalMember(
      owner = "client!hja",
      name = "R",
      descriptor = "I"
   )
   public static int field9095;
   @OriginalMember(
      owner = "client!hja",
      name = "M",
      descriptor = "I"
   )
   public static int field9096;
   @OriginalMember(
      owner = "client!hja",
      name = "I",
      descriptor = "I"
   )
   public static int field9098;
   @OriginalMember(
      owner = "client!hja",
      name = "L",
      descriptor = "I"
   )
   public static int field9100;
   @OriginalMember(
      owner = "client!hja",
      name = "K",
      descriptor = "Ljava/awt/Font;"
   )
   public static Font field9103;

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(ILgea;I)V"
   )
   public final void method550(int arg0, class66 arg1, int arg2) {
      try {
         ++field9098;
         if (arg0 > -34) {
            method4552((byte)5);
         }

         if (~arg2 != -1) {
            if (arg2 == 1) {
               this.field9099 = arg1.method640(255);
               return;
            }

            if (~arg2 != -3) {
               return;
            }

            if (!client.field1481) {
               super.field930 = arg1.method640(255) == 1;
               return;
            }
         }

         this.field9097 = arg1.method640(255);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9105[6] + arg0 + ',' + (arg1 != null ? field9105[5] : field9105[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method547(int arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9100;
         int[][] var4 = super.field926.method2860(0, arg1);
         if (arg0 != -6752) {
            method4552((byte)126);
         }

         if (super.field926.field5048) {
            int var5;
            int var6;
            int[][][] var9;
            int[][] var10000;
            int[] var30;
            int[] var31;
            label102: {
               var5 = this.field9099 - -1 + this.field9099;
               var6 = 65536 / var5;
               int var7 = this.field9097 - -this.field9097 - -1;
               int var8 = 65536 / var7;
               var9 = new int[var5][][];
               int var10 = -this.field9099 + arg1;
               if (var3) {
                  var10000 = this.method696(var10 & class623.field9205, 0, 32767);
               } else if (this.field9099 + arg1 < var10) {
                  var30 = var4[0];
                  var31 = var4[1];
                  var10000 = var4;
                  if (!var3) {
                     break label102;
                  }
               } else {
                  var10000 = this.method696(var10 & class623.field9205, 0, 32767);
               }

               label101:
               while(true) {
                  int[][] var11 = var10000;
                  int[][] var12 = new int[3][class262.field3328];
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = 0;
                  int[] var16 = var11[0];
                  int[] var17 = var11[1];
                  int[] var18 = var11[2];
                  int var19 = -this.field9097;
                  int var20;
                  if (var3) {
                     var20 = var19 & class174.field2249;
                     var13 += var16[var20];
                     var14 += var17[var20];
                     var15 += var18[var20];
                     ++var19;
                  }

                  while(true) {
                     int var41;
                     if (this.field9097 < var19) {
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
                              } else if (~var24 <= ~class262.field3328) {
                                 var9[-arg1 + this.field9099 + var10] = var12;
                                 if (!var3) {
                                    break label98;
                                 }
                              } else {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              }

                              while(true) {
                                 int var25 = -this.field9097 + var24 & class174.field2249;
                                 ++var24;
                                 int var26 = var15 - var18[var25];
                                 int var27 = var14 - var17[var25];
                                 int var28 = var13 - var16[var25];
                                 int var29 = this.field9097 + var24 & class174.field2249;
                                 var13 = var16[var29] + var28;
                                 var15 = var18[var29] + var26;
                                 var14 = var17[var29] + var27;
                                 if (~var24 <= ~class262.field3328) {
                                    var9[-arg1 + this.field9099 + var10] = var12;
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
                           if (this.field9099 + arg1 < var10) {
                              var30 = var4[0];
                              var31 = var4[1];
                              var10000 = var4;
                              if (!var3) {
                                 break label101;
                              }
                           } else {
                              var10000 = this.method696(var10 & class623.field9205, 0, 32767);
                           }
                           break;
                        }
                     } else {
                        var41 = var19 & class174.field2249;
                     }

                     var20 = var41;
                     var13 += var16[var20];
                     var14 += var17[var20];
                     var15 += var18[var20];
                     ++var19;
                  }
               }
            }

            int[] var32 = var10000[2];
            int var33 = 0;
            if (var3 || class262.field3328 > var33) {
               do {
                  int var34 = 0;
                  int var35 = 0;
                  int var36 = 0;
                  int var37 = 0;
                  if (var3 || ~var37 > ~var5) {
                     do {
                        int[][] var38 = var9[var37];
                        var34 += var38[0][var33];
                        var35 += var38[1][var33];
                        var36 += var38[2][var33];
                        ++var37;
                     } while(~var37 > ~var5);
                  }

                  var30[var33] = var6 * var34 >> 16;
                  var31[var33] = var6 * var35 >> 16;
                  var32[var33] = var6 * var36 >> 16;
                  ++var33;
               } while(class262.field3328 > var33);
            }
         }

         return var4;
      } catch (RuntimeException var40) {
         throw class93.method866(var40, field9105[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "<init>",
      descriptor = "()V"
   )
   public class618() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!hja",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4551(byte arg0) {
      try {
         field9101 = null;
         field9104 = null;
         field9103 = null;
         int var1 = -125 / ((-2 - arg0) / 51);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field9105[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4552(byte arg0) {
      try {
         ++field9096;
         if (class139.field1753 != null) {
            if (class139.field1753.field11210 == 1) {
               class139.field1753 = null;
               return;
            }

            if (~class139.field1753.field11210 == -3) {
               class505.method3818(2, class667.field9879, (byte)97, class673.field9967);
               class139.field1753 = null;
               return;
            }
         }

         if (arg0 != -102) {
            method4551((byte)41);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9105[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "a",
      descriptor = "(BI)[I"
   )
   public final int[] method331(byte arg0, int arg1) {
      boolean var3 = client.field1481;

      try {
         ++field9095;
         if (arg0 != -63) {
            this.field9097 = -26;
         }

         int[] var4 = super.field940.method119(false, arg1);
         if (super.field940.field270) {
            int var5 = this.field9099 + 1 + this.field9099;
            int var6 = 65536 / var5;
            int var7 = this.field9097 - (-this.field9097 - 1);
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            int var10 = -this.field9099 + arg1;
            if (var3 || var10 <= this.field9099 + arg1) {
               label113:
               do {
                  int[] var11 = this.method690(20, 0, var10 & class623.field9205);
                  int[] var12 = new int[class262.field3328];
                  int var13 = 0;
                  int var14 = -this.field9097;
                  if (var3) {
                     var13 += var11[class174.field2249 & var14];
                     ++var14;
                  }

                  while(true) {
                     while(~this.field9097 <= ~var14) {
                        var13 += var11[class174.field2249 & var14];
                        ++var14;
                     }

                     int var15 = 0;
                     if (!var3) {
                        if (var3) {
                           var12[var15] = var8 * var13 >> 16;
                           var13 -= var11[-this.field9097 + var15 & class174.field2249];
                           ++var15;
                           var13 += var11[class174.field2249 & this.field9097 + var15];
                        }

                        while(true) {
                           while(class262.field3328 > var15) {
                              var12[var15] = var8 * var13 >> 16;
                              var13 -= var11[-this.field9097 + var15 & class174.field2249];
                              ++var15;
                              var13 += var11[class174.field2249 & this.field9097 + var15];
                           }

                           var9[this.field9099 + var10 + -arg1] = var12;
                           if (!var3) {
                              ++var10;
                              continue label113;
                           }

                           var13 += var11[class174.field2249 & this.field9097 + var15];
                        }
                     }

                     ++var14;
                  }
               } while(var10 <= this.field9099 + arg1);
            }

            int var16 = 0;
            if (var3 || var16 < class262.field3328) {
               do {
                  int var17 = 0;
                  int var18 = 0;
                  if (var3) {
                     var17 += var9[var18][var16];
                     ++var18;
                  }

                  while(true) {
                     while(~var18 > ~var5) {
                        var17 += var9[var18][var16];
                        ++var18;
                     }

                     var4[var16] = var6 * var17 >> 16;
                     if (!var3) {
                        ++var16;
                        break;
                     }

                     ++var18;
                  }
               } while(var16 < class262.field3328);
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class93.method866(var20, field9105[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4553(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4554(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
