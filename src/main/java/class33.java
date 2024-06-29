import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class33 extends class629 {
   @OriginalMember(
      owner = "client!mca",
      name = "M",
      descriptor = "I"
   )
   private int field493 = 1;
   @OriginalMember(
      owner = "client!mca",
      name = "L",
      descriptor = "I"
   )
   private int field494 = 1;
   @OriginalMember(
      owner = "client!mca",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field499 = new String[]{method245(method244("x/Bd")), method245(method244("mt\u0000&\u0010")), method245(method244("{9O&#>")), method245(method244("{9O&\">")), method245(method244("{9O&!>")), method245(method244("{9O&'>")), method245(method244("{9O&(>")), method245(method244("{9O& >"))};
   @OriginalMember(
      owner = "client!mca",
      name = "J",
      descriptor = "Ljava/lang/String;"
   )
   public static String field489 = null;
   @OriginalMember(
      owner = "client!mca",
      name = "E",
      descriptor = "[I"
   )
   public static int[] field491 = new int[8];
   @OriginalMember(
      owner = "client!mca",
      name = "K",
      descriptor = "I"
   )
   public static int field490;
   @OriginalMember(
      owner = "client!mca",
      name = "D",
      descriptor = "I"
   )
   public static int field492;
   @OriginalMember(
      owner = "client!mca",
      name = "I",
      descriptor = "I"
   )
   public static int field495;
   @OriginalMember(
      owner = "client!mca",
      name = "F",
      descriptor = "I"
   )
   public static int field496;
   @OriginalMember(
      owner = "client!mca",
      name = "H",
      descriptor = "I"
   )
   public static int field497;
   @OriginalMember(
      owner = "client!mca",
      name = "G",
      descriptor = "I"
   )
   public static int field498;

   @OriginalMember(
      owner = "client!mca",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method239(int arg0) {
      try {
         int var1 = -52 % ((arg0 - 51) / 43);
         field491 = null;
         field489 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field499[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(IIIII[FI)V"
   )
   public static final void method240(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6) {
      boolean var7 = client.field4564;

      try {
         ++field492;
         if (arg4 > 0 && !class756.method5476((byte)-63, arg4)) {
            throw new IllegalArgumentException("");
         } else if (arg2 > 0 && !class756.method5476((byte)-63, arg2)) {
            throw new IllegalArgumentException("");
         } else {
            int var8 = class332.method2587(arg0, (byte)-93);
            int var9 = 0;
            int var10 = ~arg4 > ~arg2 ? arg4 : arg2;
            int var11 = arg4 >> 1;
            int var12 = arg2 >> 1;
            float[] var13 = arg5;
            int var14 = -15 / ((-17 - arg3) / 41);
            float[] var15 = new float[var8 * var12 * var11];

            while(true) {
               OpenGL.glTexImage2Df(arg6, var9, arg1, arg4, arg2, 0, arg0, 5126, var13, 0);
               if (var10 <= 1) {
                  return;
               }

               int var10000;
               label87: {
                  int var16 = arg4 * var8;
                  int var17 = 0;
                  float[] var29;
                  if (var7) {
                     var10000 = var17;
                  } else if (~var8 >= ~var17) {
                     var29 = var15;
                     var15 = var13;
                     arg2 = var12;
                     arg4 = var11;
                     var13 = var29;
                     ++var9;
                     var12 >>= 1;
                     var10 >>= 1;
                     var10000 = var11 >> 1;
                     if (!var7) {
                        break label87;
                     }
                  } else {
                     var10000 = var17;
                  }

                  while(true) {
                     int var18 = var10000;
                     int var19 = var17;
                     int var20 = var16 + var17;
                     int var21 = 0;
                     if (var7 || var21 < var12) {
                        do {
                           int var22 = 0;
                           if (var7 || ~var22 > ~var11) {
                              do {
                                 float var23 = var13[var19];
                                 int var24 = var8 + var19;
                                 float var25 = var13[var24] + var23;
                                 float var26 = var13[var20] + var25;
                                 var19 = var8 + var24;
                                 int var27 = var8 + var20;
                                 float var28 = var13[var27] + var26;
                                 var20 = var8 + var27;
                                 var15[var18] = var28 * 0.25F;
                                 var18 += var8;
                                 ++var22;
                              } while(~var22 > ~var11);
                           }

                           var19 += var16;
                           var20 += var16;
                           ++var21;
                        } while(var21 < var12);
                     }

                     ++var17;
                     if (~var8 >= ~var17) {
                        var29 = var15;
                        var15 = var13;
                        arg2 = var12;
                        arg4 = var11;
                        var13 = var29;
                        ++var9;
                        var12 >>= 1;
                        var10 >>= 1;
                        var10000 = var11 >> 1;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var17;
                     }
                  }
               }

               var11 = var10000;
            }
         }
      } catch (RuntimeException var31) {
         throw class608.method4462(var31, field499[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field499[1] : field499[0]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "<init>",
      descriptor = "()V"
   )
   public class33() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!mca",
      name = "b",
      descriptor = "(II)[I"
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field497;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            field489 = null;
         }

         if (super.field9161.field7474) {
            int var5 = this.field493 + 1 + this.field493;
            int var6 = 65536 / var5;
            int var7 = this.field494 + 1 + this.field494;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            int var10 = -this.field493 + arg0;
            if (var3 || ~(arg0 - -this.field493) <= ~var10) {
               label113:
               do {
                  int[] var11 = this.method4622((byte)125, 0, var10 & class37.field902);
                  int[] var12 = new int[class66.field1214];
                  int var13 = 0;
                  int var14 = -this.field494;
                  if (var3) {
                     var13 += var11[var14 & class704.field10259];
                     ++var14;
                  }

                  while(true) {
                     while(~var14 >= ~this.field494) {
                        var13 += var11[var14 & class704.field10259];
                        ++var14;
                     }

                     int var15 = 0;
                     if (!var3) {
                        if (var3) {
                           var12[var15] = var8 * var13 >> 16;
                           var13 -= var11[-this.field494 + var15 & class704.field10259];
                           ++var15;
                           var13 += var11[this.field494 + var15 & class704.field10259];
                        }

                        while(true) {
                           while(~class66.field1214 < ~var15) {
                              var12[var15] = var8 * var13 >> 16;
                              var13 -= var11[-this.field494 + var15 & class704.field10259];
                              ++var15;
                              var13 += var11[this.field494 + var15 & class704.field10259];
                           }

                           var9[-arg0 + var10 + this.field493] = var12;
                           if (!var3) {
                              ++var10;
                              continue label113;
                           }

                           var13 += var11[this.field494 + var15 & class704.field10259];
                        }
                     }

                     ++var14;
                  }
               } while(~(arg0 - -this.field493) <= ~var10);
            }

            int var16 = 0;
            if (var3 || var16 < class66.field1214) {
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
               } while(var16 < class66.field1214);
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field499[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(Luda;II)V"
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      try {
         ++field495;
         if (arg1 == 0) {
            if (arg2 != 0) {
               if (~arg2 == -2) {
                  this.field493 = arg0.method3564((byte)-88);
                  return;
               }

               if (arg2 != 2) {
                  return;
               }

               if (!client.field4564) {
                  super.field9166 = arg0.method3564((byte)-92) == 1;
                  return;
               }
            }

            this.field494 = arg0.method3564((byte)-39);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field499[6] + (arg0 != null ? field499[1] : field499[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(BZII)I"
   )
   public static final int method242(byte arg0, boolean arg1, int arg2, int arg3) {
      try {
         ++field498;
         int var4 = 89 / ((arg0 - 36) / 61);
         class349 var5 = class190.method1656((byte)68, arg1, arg3);
         if (var5 == null) {
            return 0;
         } else {
            return ~arg2 <= -1 && arg2 < var5.field4964.length ? var5.field4964[arg2] : 0;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field499[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "a",
      descriptor = "(II)[[I"
   )
   public final int[][] method243(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field490;
         int[][] var4 = super.field9169.method785((byte)70, arg0);
         if (arg1 != 0) {
            return null;
         } else {
            if (super.field9169.field1332) {
               int var5;
               int var6;
               int[][][] var9;
               int[][] var10000;
               int[] var30;
               int[] var31;
               label102: {
                  var5 = this.field493 + 1 - -this.field493;
                  var6 = 65536 / var5;
                  int var7 = this.field494 - (-this.field494 + -1);
                  int var8 = 65536 / var7;
                  var9 = new int[var5][][];
                  int var10 = -this.field493 + arg0;
                  if (var3) {
                     var10000 = this.method4621(-122, 0, var10 & class37.field902);
                  } else if (~(this.field493 + arg0) > ~var10) {
                     var30 = var4[0];
                     var31 = var4[1];
                     var10000 = var4;
                     if (!var3) {
                        break label102;
                     }
                  } else {
                     var10000 = this.method4621(-122, 0, var10 & class37.field902);
                  }

                  label101:
                  while(true) {
                     int[][] var11 = var10000;
                     int[][] var12 = new int[3][class66.field1214];
                     int var13 = 0;
                     int var14 = 0;
                     int var15 = 0;
                     int[] var16 = var11[0];
                     int[] var17 = var11[1];
                     int[] var18 = var11[2];
                     int var19 = -this.field494;
                     int var20;
                     if (var3) {
                        var20 = class704.field10259 & var19;
                        var15 += var18[var20];
                        var13 += var16[var20];
                        var14 += var17[var20];
                        ++var19;
                     }

                     while(true) {
                        int var41;
                        if (var19 > this.field494) {
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
                                 } else if (class66.field1214 <= var24) {
                                    var9[this.field493 + var10 + -arg0] = var12;
                                    if (!var3) {
                                       break label98;
                                    }
                                 } else {
                                    var21[var24] = var8 * var13 >> 16;
                                    var22[var24] = var8 * var14 >> 16;
                                    var23[var24] = var8 * var15 >> 16;
                                 }

                                 while(true) {
                                    int var25 = -this.field494 + var24 & class704.field10259;
                                    int var26 = var13 - var16[var25];
                                    ++var24;
                                    int var27 = var15 - var18[var25];
                                    int var28 = var14 - var17[var25];
                                    int var29 = this.field494 + var24 & class704.field10259;
                                    var15 = var18[var29] + var27;
                                    var14 = var17[var29] + var28;
                                    var13 = var16[var29] + var26;
                                    if (class66.field1214 <= var24) {
                                       var9[this.field493 + var10 + -arg0] = var12;
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
                              if (~(this.field493 + arg0) > ~var10) {
                                 var30 = var4[0];
                                 var31 = var4[1];
                                 var10000 = var4;
                                 if (!var3) {
                                    break label101;
                                 }
                              } else {
                                 var10000 = this.method4621(-122, 0, var10 & class37.field902);
                              }
                              break;
                           }
                        } else {
                           var41 = class704.field10259 & var19;
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
               if (var3 || ~class66.field1214 < ~var33) {
                  do {
                     int var34 = 0;
                     int var35 = 0;
                     int var36 = 0;
                     int var37 = 0;
                     if (var3 || var5 > var37) {
                        do {
                           int[][] var38 = var9[var37];
                           var34 += var38[0][var33];
                           var36 += var38[2][var33];
                           var35 += var38[1][var33];
                           ++var37;
                        } while(var5 > var37);
                     }

                     var30[var33] = var6 * var34 >> 16;
                     var31[var33] = var6 * var35 >> 16;
                     var32[var33] = var6 * var36 >> 16;
                     ++var33;
                  } while(~class66.field1214 < ~var33);
               }
            }

            return var4;
         }
      } catch (RuntimeException var40) {
         throw class608.method4462(var40, field499[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method244(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method245(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
