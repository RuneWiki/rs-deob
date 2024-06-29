import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class663 extends class70 {
   @OriginalMember(
      owner = "client!kea",
      name = "L",
      descriptor = "I"
   )
   private int field9935 = 1;
   @OriginalMember(
      owner = "client!kea",
      name = "I",
      descriptor = "I"
   )
   private int field9938 = 1;
   @OriginalMember(
      owner = "client!kea",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9940 = new String[]{method4906(method4905("\u0007\u0002V\u000f5D")), method4906(method4905("\u0007\u0002V\u000f>D")), method4906(method4905("\u0007\u0002V\u000f0D")), method4906(method4905("\u0017I\u0019\u000f\t")), method4906(method4905("\u0002\u0012[M")), method4906(method4905("\u0007\u0002V\u000f7D")), method4906(method4905("\u0007\u0002V\u000f<D"))};
   @OriginalMember(
      owner = "client!kea",
      name = "K",
      descriptor = "I"
   )
   public static int field9933;
   @OriginalMember(
      owner = "client!kea",
      name = "F",
      descriptor = "I"
   )
   public static int field9934;
   @OriginalMember(
      owner = "client!kea",
      name = "H",
      descriptor = "I"
   )
   public static int field9936;
   @OriginalMember(
      owner = "client!kea",
      name = "G",
      descriptor = "I"
   )
   public static int field9939;
   @OriginalMember(
      owner = "client!kea",
      name = "J",
      descriptor = "Llaa;"
   )
   public static class541 field9937;

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(ILjava/awt/Canvas;Ld;I)Lha;",
      line = 5
   )
   public static final class610 method4903(int arg0, Canvas arg1, class150 arg2, int arg3) {
      try {
         ++field9936;
         if (arg3 != 1) {
            field9937 = null;
         }

         return new class652(arg1, arg2, arg0);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9940[2] + arg0 + ',' + (arg1 != null ? field9940[3] : field9940[4]) + ',' + (arg2 != null ? field9940[3] : field9940[4]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "b",
      descriptor = "(B)V",
      line = 16
   )
   public static void method4904(byte arg0) {
      try {
         int var1 = 12 % ((arg0 - 39) / 34);
         field9937 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9940[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(IILica;)V",
      line = 25
   )
   public final void method274(int arg0, int arg1, class354 arg2) {
      boolean var4 = client.field1786;

      try {
         label57: {
            label51: {
               label50: {
                  if (arg1 != 0) {
                     if (~arg1 == -2) {
                        break label50;
                     }

                     if (arg1 != 2) {
                        break label57;
                     }

                     if (!var4) {
                        break label51;
                     }
                  }

                  this.field9935 = arg2.method2855(-31007);
                  if (!var4) {
                     break label57;
                  }
               }

               this.field9938 = arg2.method2855(-31007);
               if (!var4) {
                  break label57;
               }
            }

            super.field933 = arg2.method2855(-31007) == 1;
         }

         ++field9933;
         if (arg0 != -1) {
            this.method274(7, -63, (class354)null);
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field9940[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9940[3] : field9940[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(II)[[I",
      line = 70
   )
   public final int[][] method537(int arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9934;
         int[][] var4 = super.field918.method3276((byte)109, arg1);
         if (super.field918.field6361) {
            int var5;
            int var6;
            int[][][] var9;
            int[][] var10000;
            int[] var30;
            int[] var31;
            label104: {
               var5 = this.field9938 + 1 + this.field9938;
               var6 = 65536 / var5;
               int var7 = this.field9935 + this.field9935 - -1;
               int var8 = 65536 / var7;
               var9 = new int[var5][][];
               int var10 = -this.field9938 + arg1;
               if (var3) {
                  var10000 = this.method539(true, var10 & class578.field8547, 0);
               } else if (this.field9938 + arg1 < var10) {
                  var30 = var4[0];
                  var31 = var4[1];
                  var10000 = var4;
                  if (!var3) {
                     break label104;
                  }
               } else {
                  var10000 = this.method539(true, var10 & class578.field8547, 0);
               }

               label103:
               while(true) {
                  int[][] var11 = var10000;
                  int[][] var12 = new int[3][class678.field10127];
                  int var13 = 0;
                  int var14 = 0;
                  int var15 = 0;
                  int[] var16 = var11[0];
                  int[] var17 = var11[1];
                  int[] var18 = var11[2];
                  int var19 = -this.field9935;
                  int var20;
                  if (var3) {
                     var20 = class50.field637 & var19;
                     var13 += var16[var20];
                     var14 += var17[var20];
                     var15 += var18[var20];
                     ++var19;
                  }

                  while(true) {
                     int var41;
                     if (var19 > this.field9935) {
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
                              } else if (var24 >= class678.field10127) {
                                 var9[-arg1 + var10 + this.field9938] = var12;
                                 if (!var3) {
                                    break label100;
                                 }
                              } else {
                                 var21[var24] = var8 * var13 >> 16;
                                 var22[var24] = var8 * var14 >> 16;
                                 var23[var24] = var8 * var15 >> 16;
                              }

                              while(true) {
                                 int var25 = var24 - this.field9935 & class50.field637;
                                 ++var24;
                                 int var26 = var14 - var17[var25];
                                 int var27 = var15 - var18[var25];
                                 int var28 = var13 - var16[var25];
                                 int var29 = class50.field637 & this.field9935 + var24;
                                 var15 = var18[var29] + var27;
                                 var14 = var17[var29] + var26;
                                 var13 = var16[var29] + var28;
                                 if (var24 >= class678.field10127) {
                                    var9[-arg1 + var10 + this.field9938] = var12;
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
                           if (this.field9938 + arg1 < var10) {
                              var30 = var4[0];
                              var31 = var4[1];
                              var10000 = var4;
                              if (!var3) {
                                 break label103;
                              }
                           } else {
                              var10000 = this.method539(true, var10 & class578.field8547, 0);
                           }
                           break;
                        }
                     } else {
                        var41 = class50.field637 & var19;
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
            if (var3 || ~class678.field10127 < ~var33) {
               do {
                  int var34 = 0;
                  int var35 = 0;
                  int var36 = 0;
                  int var37 = 0;
                  if (var3 || ~var37 > ~var5) {
                     do {
                        int[][] var38 = var9[var37];
                        var34 += var38[0][var33];
                        var36 += var38[2][var33];
                        var35 += var38[1][var33];
                        ++var37;
                     } while(~var37 > ~var5);
                  }

                  var30[var33] = var6 * var34 >> 16;
                  var31[var33] = var6 * var35 >> 16;
                  var32[var33] = var6 * var36 >> 16;
                  ++var33;
               } while(~class678.field10127 < ~var33);
            }
         }

         if (arg0 != 32) {
            field9937 = null;
         }

         return var4;
      } catch (RuntimeException var40) {
         throw class482.method3757(var40, field9940[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "<init>",
      descriptor = "()V",
      line = 209
   )
   public class663() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!kea",
      name = "a",
      descriptor = "(BI)[I",
      line = 216
   )
   public final int[] method8(byte arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field9939;
         int[] var4 = super.field923.method3718(-2, arg1);
         if (super.field923.field7284) {
            int var5 = this.field9938 + 1 - -this.field9938;
            int var6 = 65536 / var5;
            int var7 = this.field9935 - -this.field9935 + 1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            int var10 = arg1 - this.field9938;
            if (var3 || var10 <= this.field9938 + arg1) {
               label115:
               do {
                  int[] var11 = this.method545(0, class578.field8547 & var10, (byte)-102);
                  int[] var12 = new int[class678.field10127];
                  int var13 = 0;
                  int var14 = -this.field9935;
                  if (var3) {
                     var13 += var11[var14 & class50.field637];
                     ++var14;
                  }

                  while(true) {
                     while(~this.field9935 <= ~var14) {
                        var13 += var11[var14 & class50.field637];
                        ++var14;
                     }

                     int var15 = 0;
                     if (!var3) {
                        if (var3) {
                           var12[var15] = var8 * var13 >> 16;
                           var13 -= var11[-this.field9935 + var15 & class50.field637];
                           ++var15;
                           var13 += var11[class50.field637 & var15 - -this.field9935];
                        }

                        while(true) {
                           while(var15 < class678.field10127) {
                              var12[var15] = var8 * var13 >> 16;
                              var13 -= var11[-this.field9935 + var15 & class50.field637];
                              ++var15;
                              var13 += var11[class50.field637 & var15 - -this.field9935];
                           }

                           var9[var10 - (-this.field9938 + arg1)] = var12;
                           if (!var3) {
                              ++var10;
                              continue label115;
                           }

                           var13 += var11[class50.field637 & var15 - -this.field9935];
                        }
                     }

                     ++var14;
                  }
               } while(var10 <= this.field9938 + arg1);
            }

            int var16 = 0;
            if (var3 || ~class678.field10127 < ~var16) {
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
               } while(~class678.field10127 < ~var16);
            }
         }

         if (arg0 != 87) {
            this.method537(106, 22);
         }

         return var4;
      } catch (RuntimeException var20) {
         throw class482.method3757(var20, field9940[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4905(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4906(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 103;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
