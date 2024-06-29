import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class273 extends class629 {
   @OriginalMember(
      owner = "client!mb",
      name = "T",
      descriptor = "I"
   )
   private int field3863 = 2048;
   @OriginalMember(
      owner = "client!mb",
      name = "Q",
      descriptor = "I"
   )
   private int field3857 = 819;
   @OriginalMember(
      owner = "client!mb",
      name = "G",
      descriptor = "I"
   )
   private int field3858 = 1024;
   @OriginalMember(
      owner = "client!mb",
      name = "N",
      descriptor = "I"
   )
   private int field3861 = 1024;
   @OriginalMember(
      owner = "client!mb",
      name = "F",
      descriptor = "I"
   )
   private int field3867 = 0;
   @OriginalMember(
      owner = "client!mb",
      name = "H",
      descriptor = "I"
   )
   private int field3871 = 1024;
   @OriginalMember(
      owner = "client!mb",
      name = "D",
      descriptor = "I"
   )
   private int field3869 = 0;
   @OriginalMember(
      owner = "client!mb",
      name = "K",
      descriptor = "I"
   )
   private int field3864 = 1024;
   @OriginalMember(
      owner = "client!mb",
      name = "R",
      descriptor = "I"
   )
   private int field3870 = 409;
   @OriginalMember(
      owner = "client!mb",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3874 = new String[]{method2157(method2156("\u0016'L~S")), method2157(method2156("\u0016'LyS")), method2157(method2156("\u0000kL\u001e\u0006")), method2157(method2156("\u0016'LuS")), method2157(method2156("\u00150\u000e\\")), method2157(method2156("\u0016'L}S")), method2157(method2156("\u0016'L\u007fS")), method2157(method2156("\u0016'LzS"))};
   @OriginalMember(
      owner = "client!mb",
      name = "S",
      descriptor = "Z"
   )
   public static boolean field3873 = false;
   @OriginalMember(
      owner = "client!mb",
      name = "O",
      descriptor = "I"
   )
   public static int field3856;
   @OriginalMember(
      owner = "client!mb",
      name = "J",
      descriptor = "I"
   )
   public static int field3859;
   @OriginalMember(
      owner = "client!mb",
      name = "E",
      descriptor = "I"
   )
   public static int field3862;
   @OriginalMember(
      owner = "client!mb",
      name = "U",
      descriptor = "I"
   )
   private int field3865;
   @OriginalMember(
      owner = "client!mb",
      name = "P",
      descriptor = "I"
   )
   public static int field3868;
   @OriginalMember(
      owner = "client!mb",
      name = "M",
      descriptor = "I"
   )
   public static int field3872;
   @OriginalMember(
      owner = "client!mb",
      name = "I",
      descriptor = "Lhw;"
   )
   public static class141 field3860;
   @OriginalMember(
      owner = "client!mb",
      name = "L",
      descriptor = "Lhw;"
   )
   public static class141 field3866;

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(Luda;II)V",
      line = 8
   )
   public final void method241(class473 arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

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
                                    if (~arg2 != -1) {
                                       if (~arg2 == -2) {
                                          break label92;
                                       }

                                       if (~arg2 == -3) {
                                          break label93;
                                       }

                                       if (arg2 == 3) {
                                          break label94;
                                       }

                                       if (arg2 == 4) {
                                          break label95;
                                       }

                                       if (~arg2 == -6) {
                                          break label96;
                                       }

                                       if (arg2 == 6) {
                                          break label97;
                                       }

                                       if (~arg2 == -8) {
                                          break label98;
                                       }

                                       if (arg2 != 8) {
                                          break label100;
                                       }

                                       if (!var4) {
                                          break label99;
                                       }
                                    }

                                    this.field3869 = arg0.method3564((byte)-110);
                                    if (!var4) {
                                       break label100;
                                    }
                                 }

                                 this.field3861 = arg0.method3565(true);
                                 if (!var4) {
                                    break label100;
                                 }
                              }

                              this.field3863 = arg0.method3565(true);
                              if (!var4) {
                                 break label100;
                              }
                           }

                           this.field3870 = arg0.method3565(true);
                           if (!var4) {
                              break label100;
                           }
                        }

                        this.field3857 = arg0.method3565(true);
                        if (!var4) {
                           break label100;
                        }
                     }

                     this.field3864 = arg0.method3565(true);
                     if (!var4) {
                        break label100;
                     }
                  }

                  this.field3867 = arg0.method3564((byte)-96);
                  if (!var4) {
                     break label100;
                  }
               }

               this.field3858 = arg0.method3565(true);
               if (!var4) {
                  break label100;
               }
            }

            this.field3871 = arg0.method3565(true);
         }

         if (arg1 != 0) {
            this.method45(101, -100);
         }

         ++field3856;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3874[3] + (arg0 != null ? field3874[2] : field3874[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(I)V",
      line = 102
   )
   public final void method901(int arg0) {
      try {
         ++field3872;
         if (arg0 != 245880940) {
            this.field3867 = 64;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3874[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "()V",
      line = 112
   )
   public class273() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!mb",
      name = "g",
      descriptor = "(I)V",
      line = 121
   )
   public static void method2153(int arg0) {
      try {
         field3860 = null;
         if (arg0 == 11641) {
            field3866 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3874[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(IB)V",
      line = 133
   )
   public static final void method2154(int arg0, byte arg1) {
      try {
         ++field3862;
         if (arg1 >= 23) {
            class640.field9323 = arg0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3874[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(ILjava/util/Random;IZII[[I)V",
      line = 144
   )
   private final void method2155(int param1, Random param2, int param3, boolean param4, int param5, int param6, int[][] param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mb",
      name = "b",
      descriptor = "(II)[I",
      line = 350
   )
   public final int[] method45(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field3868;
         int[] var4 = super.field9161.method3870((byte)56, arg0);
         if (arg1 != 2048) {
            this.method2155(-72, (Random)null, 108, true, 17, -99, (int[][])null);
         }

         if (super.field9161.field7474) {
            int[][] var5 = super.field9161.method3869((byte)-88);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            byte var12 = 1;
            int var13 = 0;
            int var14 = 0;
            int var15 = class66.field1214 * this.field3861 >> 12;
            int var16 = class66.field1214 * this.field3863 >> 12;
            int var17 = class686.field10095 * this.field3870 >> 12;
            int var18 = class686.field10095 * this.field3857 >> 12;
            if (var18 <= 1) {
               return var5[arg0];
            }

            this.field3865 = class66.field1214 / 8 * this.field3864 >> 12;
            int var19 = class66.field1214 / var15 + 1;
            int[][] var20 = new int[var19][3];
            int[][] var21 = new int[var19][3];
            Random var22 = new Random((long)this.field3869);

            do {
               int var23;
               int var24;
               int var25;
               int var26;
               do {
                  label180: {
                     int var10000;
                     label87: {
                        var23 = var15 + class398.method3070(-var15 + var16, var22, (byte)106);
                        var24 = var17 + class398.method3070(-var17 + var18, var22, (byte)62);
                        var25 = var9 + var23;
                        if (~class66.field1214 > ~var25) {
                           var23 = -var9 + class66.field1214;
                           var10000 = class66.field1214;
                           if (var3) {
                              break label87;
                           }

                           var25 = var10000;
                        }

                        var10000 = var12;
                     }

                     if (var10000 != 0) {
                        var26 = 0;
                        if (!var3) {
                           break label180;
                        }
                     }

                     int var27 = var10;
                     int[] var28 = var21[var10];
                     int var29 = 0;
                     int var30 = var6 + var25;
                     if (var30 < 0) {
                        var30 += class66.field1214;
                     }

                     if (var30 > class66.field1214) {
                        var30 -= class66.field1214;
                     }

                     label142:
                     while(true) {
                        int[] var31 = var21[var27];
                        if (var31[0] <= var30 && var30 <= var31[1]) {
                           break;
                        }

                        ++var29;

                        do {
                           var10000 = ~var13;
                           ++var27;
                           if (var10000 < ~var27) {
                              continue label142;
                           }

                           var27 = 0;
                        } while(var3);

                        if (var3) {
                           break;
                        }
                     }

                     var26 = var28[2];
                     if (~var10 != ~var27) {
                        int var32 = var6 + var9;
                        if (var32 < 0) {
                           var32 += class66.field1214;
                        }

                        if (~class66.field1214 > ~var32) {
                           var32 -= class66.field1214;
                        }

                        int var33 = 1;
                        if (var3 || var33 <= var29) {
                           do {
                              int[] var34 = var21[(var10 + var33) % var13];
                              var26 = Math.max(var26, var34[2]);
                              ++var33;
                           } while(var33 <= var29);
                        }

                        int var35 = 0;
                        if (var3 || ~var29 <= ~var35) {
                           do {
                              int[] var36 = var21[(var10 - -var35) % var13];
                              int var37 = var36[2];
                              if (~var26 == ~var37) {
                                 ++var35;
                              } else {
                                 int var40;
                                 int var41;
                                 label111: {
                                    int var38 = var36[0];
                                    int var39 = var36[1];
                                    if (var32 < var30) {
                                       var40 = Math.max(var32, var38);
                                       var41 = Math.min(var30, var39);
                                       if (!var3) {
                                          break label111;
                                       }
                                    }

                                    if (~var38 == -1) {
                                       var40 = 0;
                                       var41 = Math.min(var30, var39);
                                       if (var3) {
                                          var40 = Math.max(var32, var38);
                                          var41 = class66.field1214;
                                       }
                                    } else {
                                       var40 = Math.max(var32, var38);
                                       var41 = class66.field1214;
                                    }
                                 }

                                 this.method2155(var37, var22, -var40 + var41, true, var40 - -var8, -var37 + var26, var5);
                                 ++var35;
                              }
                           } while(~var29 <= ~var35);
                        }
                     }

                     var10 = var27;
                  }

                  label148: {
                     if (~class686.field10095 <= ~(var24 + var26)) {
                        var11 = false;
                        if (!var3) {
                           break label148;
                        }
                     }

                     var24 = class686.field10095 - var26;
                  }

                  if (class66.field1214 != var25) {
                     break;
                  }

                  this.method2155(var26, var22, var23, true, var9 - -var7, var24, var5);
                  if (var11) {
                     return var4;
                  }

                  var11 = true;
                  int[] var42 = var20[var14++];
                  var42[1] = var25;
                  var42[0] = var9;
                  var42[2] = var26 - -var24;
                  int[][] var43 = var21;
                  var21 = var20;
                  var13 = var14;
                  var20 = var43;
                  var8 = var7;
                  var14 = 0;
                  var7 = class398.method3070(class66.field1214, var22, (byte)83);
                  var9 = 0;
                  var6 = -var8 + var7;
                  int var44 = var6;
                  if (~var6 > -1) {
                     var44 = class66.field1214 + var6;
                  }

                  var10 = 0;
                  if (class66.field1214 < var44) {
                     var44 -= class66.field1214;
                  }

                  label165:
                  while(true) {
                     int[] var45 = var21[var10];
                     if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                        break;
                     }

                     ++var10;

                     while(var10 >= var13) {
                        var10 = 0;
                        if (!var3) {
                           if (var3) {
                              break label165;
                           }
                           break;
                        }
                     }
                  }

                  var12 = 0;
               } while(!var3);

               int[] var46 = var20[var14++];
               var46[2] = var24 + var26;
               var46[1] = var25;
               var46[0] = var9;
               this.method2155(var26, var22, var23, true, var7 + var9, var24, var5);
               var9 = var25;
            } while(!var3);
         }

         return var4;
      } catch (RuntimeException var48) {
         throw class608.method4462(var48, field3874[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2156(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2157(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
