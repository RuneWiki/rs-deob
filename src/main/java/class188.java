import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class188 extends class213 {
   @OriginalMember(
      owner = "client!dca",
      name = "K",
      descriptor = "I"
   )
   private int field2302 = 1;
   @OriginalMember(
      owner = "client!dca",
      name = "J",
      descriptor = "I"
   )
   private int field2301 = 1;
   @OriginalMember(
      owner = "client!dca",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2307 = new String[]{method1430(method1429("\u0004l\u0011\u001cI")), method1430(method1429("\u00117S^")), method1430(method1429("\u001b!^\u001csW")), method1430(method1429("\u001b!^\u001cwW")), method1430(method1429("\u001b!^\u001cvW")), method1430(method1429("\u001b!^\u001cuW")), method1430(method1429("\u001b!^\u001c~W"))};
   @OriginalMember(
      owner = "client!dca",
      name = "E",
      descriptor = "I"
   )
   public static int field2300 = -50;
   @OriginalMember(
      owner = "client!dca",
      name = "D",
      descriptor = "Lnw;"
   )
   public static class616 field2303 = new class616(51, -1);
   @OriginalMember(
      owner = "client!dca",
      name = "H",
      descriptor = "I"
   )
   public static int field2297;
   @OriginalMember(
      owner = "client!dca",
      name = "F",
      descriptor = "I"
   )
   public static int field2298;
   @OriginalMember(
      owner = "client!dca",
      name = "L",
      descriptor = "I"
   )
   public static int field2299;
   @OriginalMember(
      owner = "client!dca",
      name = "N",
      descriptor = "I"
   )
   public static int field2304;
   @OriginalMember(
      owner = "client!dca",
      name = "I",
      descriptor = "Lok;"
   )
   public static class267 field2306;
   @OriginalMember(
      owner = "client!dca",
      name = "M",
      descriptor = "Lqh;"
   )
   public static class74 field2305;

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2304;
         if (arg1 != 2064866508) {
            field2300 = 10;
         }

         int[] var4 = super.field2650.method3769(arg0, -4);
         if (super.field2650.field7140) {
            int var5 = this.field2301 + 1 + this.field2301;
            int var6 = 65536 / var5;
            int var7 = this.field2302 + 1 + this.field2302;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            int var10 = -this.field2301 + arg0;
            if (var3 || this.field2301 + arg0 >= var10) {
               label113:
               do {
                  int[] var11 = this.method1619((byte)113, var10 & class40.field468, 0);
                  int[] var12 = new int[class576.field7916];
                  int var13 = 0;
                  int var14 = -this.field2302;
                  if (var3) {
                     var13 += var11[class676.field9924 & var14];
                     ++var14;
                  }

                  while(true) {
                     while(var14 <= this.field2302) {
                        var13 += var11[class676.field9924 & var14];
                        ++var14;
                     }

                     int var15 = 0;
                     if (!var3) {
                        if (var3) {
                           var12[var15] = var8 * var13 >> 16;
                           var13 -= var11[class676.field9924 & -this.field2302 + var15];
                           ++var15;
                           var13 += var11[this.field2302 + var15 & class676.field9924];
                        }

                        while(true) {
                           while(~var15 > ~class576.field7916) {
                              var12[var15] = var8 * var13 >> 16;
                              var13 -= var11[class676.field9924 & -this.field2302 + var15];
                              ++var15;
                              var13 += var11[this.field2302 + var15 & class676.field9924];
                           }

                           var9[-arg0 + var10 + this.field2301] = var12;
                           if (!var3) {
                              ++var10;
                              continue label113;
                           }

                           var13 += var11[this.field2302 + var15 & class676.field9924];
                        }
                     }

                     ++var14;
                  }
               } while(this.field2301 + arg0 >= var10);
            }

            int var16 = 0;
            if (var3 || class576.field7916 > var16) {
               do {
                  int var17 = 0;
                  int var18 = 0;
                  if (var3) {
                     var17 += var9[var18][var16];
                     ++var18;
                  }

                  while(true) {
                     while(~var5 < ~var18) {
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
               } while(class576.field7916 > var16);
            }
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class534.method3846(var20, field2307[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1427(int arg0) {
      try {
         if (arg0 == -8289) {
            field2303 = null;
            field2306 = null;
            field2305 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2307[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      boolean var4 = client.field4273;

      try {
         label52: {
            label47: {
               label46: {
                  if (arg2 != 0) {
                     if (arg2 == 1) {
                        break label46;
                     }

                     if (arg2 != 2) {
                        break label52;
                     }

                     if (!var4) {
                        break label47;
                     }
                  }

                  this.field2302 = arg0.method4288((byte)96);
                  if (!var4) {
                     break label52;
                  }
               }

               this.field2301 = arg0.method4288((byte)118);
               if (!var4) {
                  break label52;
               }
            }

            super.field2645 = arg0.method4288((byte)65) == 1;
         }

         int var6 = 117 % ((68 - arg1) / 48);
         ++field2299;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field2307[2] + (arg0 != null ? field2307[0] : field2307[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "<init>",
      descriptor = "()V"
   )
   public class188() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!dca",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method1428(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dca",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field2298;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719) {
            int var5;
            int var6;
            int[][][] var9;
            int[][] var10000;
            int[] var30;
            int[] var31;
            label104: {
               var5 = this.field2301 + 1 + this.field2301;
               var6 = 65536 / var5;
               int var7 = this.field2302 + 1 + this.field2302;
               int var8 = 65536 / var7;
               var9 = new int[var5][][];
               int var10 = -this.field2301 + arg0;
               if (var3) {
                  var10000 = this.method1615(true, var10 & class40.field468, 0);
               } else if (~(this.field2301 + arg0) > ~var10) {
                  var30 = var4[0];
                  var31 = var4[1];
                  var10000 = var4;
                  if (!var3) {
                     break label104;
                  }
               } else {
                  var10000 = this.method1615(true, var10 & class40.field468, 0);
               }

               label103:
               while(true) {
                  int[][] var11 = var10000;
                  int[][] var12 = new int[3][class576.field7916];
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = 0;
                  int[] var16 = var11[0];
                  int[] var17 = var11[1];
                  int[] var18 = var11[2];
                  int var19 = -this.field2302;
                  int var20;
                  if (var3) {
                     var20 = var19 & class676.field9924;
                     var15 += var18[var20];
                     var13 += var16[var20];
                     var14 += var17[var20];
                     ++var19;
                  }

                  while(true) {
                     int var41;
                     if (~var19 < ~this.field2302) {
                        int[] var21 = var12[0];
                        int[] var22 = var12[1];
                        int[] var23 = var12[2];
                        var41 = 0;
                        if (!var3) {
                           label100: {
                              int var24 = 0;
                              if (var3) {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              } else if (~var24 <= ~class576.field7916) {
                                 var9[this.field2301 + var10 + -arg0] = var12;
                                 if (!var3) {
                                    break label100;
                                 }
                              } else {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              }

                              while(true) {
                                 int var25 = class676.field9924 & -this.field2302 + var24;
                                 ++var24;
                                 int var26 = var15 - var18[var25];
                                 int var27 = var13 - var16[var25];
                                 int var28 = var14 - var17[var25];
                                 int var29 = this.field2302 + var24 & class676.field9924;
                                 var13 = var16[var29] + var27;
                                 var14 = var17[var29] + var28;
                                 var15 = var18[var29] + var26;
                                 if (~var24 <= ~class576.field7916) {
                                    var9[this.field2301 + var10 + -arg0] = var12;
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
                           if (~(this.field2301 + arg0) > ~var10) {
                              var30 = var4[0];
                              var31 = var4[1];
                              var10000 = var4;
                              if (!var3) {
                                 break label103;
                              }
                           } else {
                              var10000 = this.method1615(true, var10 & class40.field468, 0);
                           }
                           break;
                        }
                     } else {
                        var41 = var19 & class676.field9924;
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
            if (var3 || ~var33 > ~class576.field7916) {
               do {
                  int var34 = 0;
                  int var35 = 0;
                  int var36 = 0;
                  int var37 = 0;
                  if (var3 || var5 > var37) {
                     do {
                        int[][] var38 = var9[var37];
                        var35 += var38[1][var33];
                        var36 += var38[2][var33];
                        var34 += var38[0][var33];
                        ++var37;
                     } while(var5 > var37);
                  }

                  var30[var33] = var6 * var34 >> 16;
                  var31[var33] = var6 * var35 >> 16;
                  var32[var33] = var6 * var36 >> 16;
                  ++var33;
               } while(~var33 > ~class576.field7916);
            }
         }

         if (arg1 <= 26) {
            this.method215(22, 23);
         }

         return var4;
      } catch (RuntimeException var40) {
         throw class534.method3846(var40, field2307[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1429(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1430(char[] arg0) {
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
            var10005 = 66;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 50;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
