import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class2 extends class606 {
   @OriginalMember(
      owner = "client!kg",
      name = "M",
      descriptor = "I"
   )
   private int field15 = 1;
   @OriginalMember(
      owner = "client!kg",
      name = "E",
      descriptor = "I"
   )
   private int field20 = 1;
   @OriginalMember(
      owner = "client!kg",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field21 = new String[]{method11(method10("\ryv#\u0015")), method11(method10("\ryv!\u0015")), method11(method10("\u001d0vN@")), method11(method10("\bk4\f")), method11(method10("\ryv\"\u0015")), method11(method10("\ryv%\u0015")), method11(method10("\ryv(\u0015"))};
   @OriginalMember(
      owner = "client!kg",
      name = "F",
      descriptor = "[I"
   )
   public static int[] field17 = new int[8];
   @OriginalMember(
      owner = "client!kg",
      name = "G",
      descriptor = "[C"
   )
   private static char[] field19 = new char[64];
   @OriginalMember(
      owner = "client!kg",
      name = "K",
      descriptor = "I"
   )
   public static int field12;
   @OriginalMember(
      owner = "client!kg",
      name = "D",
      descriptor = "I"
   )
   public static int field13;
   @OriginalMember(
      owner = "client!kg",
      name = "J",
      descriptor = "I"
   )
   public static int field14;
   @OriginalMember(
      owner = "client!kg",
      name = "L",
      descriptor = "I"
   )
   public static int field16;
   @OriginalMember(
      owner = "client!kg",
      name = "H",
      descriptor = "I"
   )
   public static int field18;

   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "(II)[[I"
   )
   public final int[][] method5(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field14;
         if (arg0 != 373) {
            this.method8((class65)null, -11, -17);
         }

         int[][] var4 = super.field8649.method5536(23870, arg1);
         if (super.field8649.field11043) {
            int var5;
            int var6;
            int[][][] var9;
            int[][] var10000;
            int[] var30;
            int[] var31;
            label102: {
               var5 = this.field20 + this.field20 - -1;
               var6 = 65536 / var5;
               int var7 = this.field15 - (-this.field15 + -1);
               int var8 = 65536 / var7;
               var9 = new int[var5][][];
               int var10 = -this.field20 + arg1;
               if (var3) {
                  var10000 = this.method4467(0, class801.field11660 & var10, (byte)69);
               } else if (var10 > arg1 - -this.field20) {
                  var30 = var4[0];
                  var31 = var4[1];
                  var10000 = var4;
                  if (!var3) {
                     break label102;
                  }
               } else {
                  var10000 = this.method4467(0, class801.field11660 & var10, (byte)69);
               }

               label101:
               while(true) {
                  int[][] var11 = var10000;
                  int[][] var12 = new int[3][class563.field8014];
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = 0;
                  int[] var16 = var11[0];
                  int[] var17 = var11[1];
                  int[] var18 = var11[2];
                  int var19 = -this.field15;
                  int var20;
                  if (var3) {
                     var20 = class358.field5293 & var19;
                     var14 += var17[var20];
                     var13 += var16[var20];
                     var15 += var18[var20];
                     ++var19;
                  }

                  while(true) {
                     int var41;
                     if (~var19 < ~this.field15) {
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
                              } else if (var24 >= class563.field8014) {
                                 var9[-arg1 + var10 + this.field20] = var12;
                                 if (!var3) {
                                    break label98;
                                 }
                              } else {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              }

                              while(true) {
                                 int var25 = class358.field5293 & -this.field15 + var24;
                                 int var26 = var13 - var16[var25];
                                 ++var24;
                                 int var27 = var14 - var17[var25];
                                 int var28 = var15 - var18[var25];
                                 int var29 = class358.field5293 & this.field15 + var24;
                                 var15 = var18[var29] + var28;
                                 var13 = var16[var29] + var26;
                                 var14 = var17[var29] + var27;
                                 if (var24 >= class563.field8014) {
                                    var9[-arg1 + var10 + this.field20] = var12;
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
                           if (var10 > arg1 - -this.field20) {
                              var30 = var4[0];
                              var31 = var4[1];
                              var10000 = var4;
                              if (!var3) {
                                 break label101;
                              }
                           } else {
                              var10000 = this.method4467(0, class801.field11660 & var10, (byte)69);
                           }
                           break;
                        }
                     } else {
                        var41 = class358.field5293 & var19;
                     }

                     var20 = var41;
                     var14 += var17[var20];
                     var13 += var16[var20];
                     var15 += var18[var20];
                     ++var19;
                  }
               }
            }

            int[] var32 = var10000[2];
            int var33 = 0;
            if (var3 || var33 < class563.field8014) {
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
               } while(var33 < class563.field8014);
            }
         }

         return var4;
      } catch (RuntimeException var40) {
         throw class612.method4503(var40, field21[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "<init>",
      descriptor = "()V"
   )
   public class2() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(IZI)I"
   )
   public static final int method6(int arg0, boolean arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field13;
         if (arg1) {
            return 0;
         } else {
            class380 var4 = class231.method2056(arg2, arg1, Integer.MIN_VALUE);
            if (var4 == null) {
               return class9.field162.method4573(arg0 + 125, arg2).field2910;
            } else {
               int var5 = 0;
               int var6 = arg0;
               if (var3) {
                  if (var4.field5559[arg0] == -1) {
                     ++var5;
                  }

                  var6 = arg0 + 1;
               }

               while(true) {
                  while(~var6 > ~var4.field5559.length) {
                     if (var4.field5559[var6] == -1) {
                        ++var5;
                     }

                     ++var6;
                  }

                  var5 += class9.field162.method4573(127, arg2).field2910 + -var4.field5559.length;
                  if (!var3) {
                     return var5;
                  }

                  if (var5 == -1) {
                     ++var5;
                  }

                  ++var6;
               }
            }
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field21[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method7(int arg0) {
      try {
         field17 = null;
         field19 = null;
         int var1 = -29 / ((14 - arg0) / 33);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field21[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      try {
         if (arg2 > -6) {
            this.method8((class65)null, -60, -11);
         }

         ++field12;
         if (~arg1 != -1) {
            if (arg1 == 1) {
               this.field20 = arg0.method665(false);
               return;
            }

            if (arg1 != 2) {
               return;
            }

            if (!client.field10022) {
               super.field8641 = ~arg0.method665(false) == -2;
               return;
            }
         }

         this.field15 = arg0.method665(false);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field21[1] + (arg0 != null ? field21[2] : field21[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field16;
         int[] var4 = super.field8645.method2632(arg1, 27230);
         if (super.field8645.field4884) {
            int var5 = this.field20 - -1 + this.field20;
            int var6 = 65536 / var5;
            int var7 = this.field15 - -this.field15 - -1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            int var10 = -this.field20 + arg1;
            if (var3 || this.field20 + arg1 >= var10) {
               label115:
               do {
                  int[] var11 = this.method4463(var10 & class801.field11660, 13064, 0);
                  int[] var12 = new int[class563.field8014];
                  int var13 = 0;
                  int var14 = -this.field15;
                  if (var3) {
                     var13 += var11[class358.field5293 & var14];
                     ++var14;
                  }

                  while(true) {
                     while(~var14 >= ~this.field15) {
                        var13 += var11[class358.field5293 & var14];
                        ++var14;
                     }

                     int var15 = 0;
                     if (!var3) {
                        if (var3) {
                           var12[var15] = var8 * var13 >> 16;
                           var13 -= var11[class358.field5293 & var15 - this.field15];
                           ++var15;
                           var13 += var11[class358.field5293 & this.field15 + var15];
                        }

                        while(true) {
                           while(~class563.field8014 < ~var15) {
                              var12[var15] = var8 * var13 >> 16;
                              var13 -= var11[class358.field5293 & var15 - this.field15];
                              ++var15;
                              var13 += var11[class358.field5293 & this.field15 + var15];
                           }

                           var9[-arg1 + this.field20 + var10] = var12;
                           if (!var3) {
                              ++var10;
                              continue label115;
                           }

                           var13 += var11[class358.field5293 & this.field15 + var15];
                        }
                     }

                     ++var14;
                  }
               } while(this.field20 + arg1 >= var10);
            }

            int var16 = 0;
            if (var3 || ~class563.field8014 < ~var16) {
               do {
                  int var17 = 0;
                  int var18 = 0;
                  if (var3) {
                     var17 += var9[var18][var16];
                     ++var18;
                  }

                  while(true) {
                     while(var18 < var5) {
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
               } while(~class563.field8014 < ~var16);
            }
         }

         if (arg0 != 0) {
            method7(13);
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field21[6] + arg0 + ',' + arg1 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 26; ++var0) {
         field19[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; ~var1 > -53; ++var1) {
         field19[var1] = (char)(var1 + 97 + -26);
      }

      for(int var2 = 52; ~var2 > -63; ++var2) {
         field19[var2] = (char)(var2 + 48 + -52);
      }

      field19[62] = '+';
      field19[63] = '/';
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method10(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method11(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
