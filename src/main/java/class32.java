import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class32 extends class606 {
   @OriginalMember(
      owner = "client!bg",
      name = "E",
      descriptor = "I"
   )
   private int field448 = 1024;
   @OriginalMember(
      owner = "client!bg",
      name = "G",
      descriptor = "I"
   )
   private int field445 = 2048;
   @OriginalMember(
      owner = "client!bg",
      name = "D",
      descriptor = "I"
   )
   private int field454 = 0;
   @OriginalMember(
      owner = "client!bg",
      name = "S",
      descriptor = "I"
   )
   private int field447 = 0;
   @OriginalMember(
      owner = "client!bg",
      name = "Q",
      descriptor = "I"
   )
   private int field451 = 409;
   @OriginalMember(
      owner = "client!bg",
      name = "F",
      descriptor = "I"
   )
   private int field456 = 819;
   @OriginalMember(
      owner = "client!bg",
      name = "L",
      descriptor = "I"
   )
   private int field450 = 1024;
   @OriginalMember(
      owner = "client!bg",
      name = "T",
      descriptor = "I"
   )
   private int field457 = 1024;
   @OriginalMember(
      owner = "client!bg",
      name = "R",
      descriptor = "I"
   )
   private int field449 = 1024;
   @OriginalMember(
      owner = "client!bg",
      name = "V",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field461 = new String[]{method378(method377("#\u0002\bc:")), method378(method377("#\u0002\bg:")), method378(method377(":K\b\u000eo")), method378(method377("/\u0010JL")), method378(method377("#\u0002\ba:")), method378(method377("#\u0002\bj:")), method378(method377("#\u0002\bi:")), method378(method377("#\u0002\bk:")), method378(method377("#\u0002\bh:")), method378(method377("#\u0002\be:"))};
   @OriginalMember(
      owner = "client!bg",
      name = "H",
      descriptor = "[I"
   )
   public static int[] field460 = new int[1000];
   @OriginalMember(
      owner = "client!bg",
      name = "N",
      descriptor = "I"
   )
   public static int field443;
   @OriginalMember(
      owner = "client!bg",
      name = "K",
      descriptor = "I"
   )
   public static int field444;
   @OriginalMember(
      owner = "client!bg",
      name = "I",
      descriptor = "I"
   )
   public static int field446;
   @OriginalMember(
      owner = "client!bg",
      name = "J",
      descriptor = "I"
   )
   public static int field452;
   @OriginalMember(
      owner = "client!bg",
      name = "M",
      descriptor = "I"
   )
   public static int field453;
   @OriginalMember(
      owner = "client!bg",
      name = "O",
      descriptor = "I"
   )
   public static int field455;
   @OriginalMember(
      owner = "client!bg",
      name = "P",
      descriptor = "I"
   )
   public static int field458;
   @OriginalMember(
      owner = "client!bg",
      name = "U",
      descriptor = "I"
   )
   private int field459;

   @OriginalMember(
      owner = "client!bg",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method372(int arg0) {
      try {
         field460 = null;
         if (arg0 != 0) {
            method373(-121);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field461[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field444;
         int[] var4 = super.field8645.method2632(arg1, arg0 + 27230);
         if (arg0 != 0) {
            return null;
         } else {
            if (super.field8645.field4884) {
               int[][] var5 = super.field8645.method2629(true);
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               int var9 = 0;
               int var10 = 0;
               boolean var11 = true;
               byte var12 = 1;
               int var13 = 0;
               int var14 = 0;
               int var15 = class563.field8014 * this.field457 >> 12;
               int var16 = class563.field8014 * this.field445 >> 12;
               int var17 = class451.field6570 * this.field451 >> 12;
               int var18 = class451.field6570 * this.field456 >> 12;
               if (~var18 >= -2) {
                  return var5[arg1];
               }

               this.field459 = class563.field8014 / 8 * this.field448 >> 12;
               int var19 = class563.field8014 / var15 + 1;
               int[][] var20 = new int[var19][3];
               int[][] var21 = new int[var19][3];
               Random var22 = new Random((long)this.field454);

               do {
                  int var23;
                  int var24;
                  int var25;
                  int var26;
                  label174:
                  do {
                     label186: {
                        int var10000;
                        label94: {
                           var23 = class633.method4632(12, var22, -var15 + var16) + var15;
                           var24 = var17 + class633.method4632(12, var22, -var17 + var18);
                           var25 = var9 + var23;
                           if (class563.field8014 < var25) {
                              var23 = -var9 + class563.field8014;
                              var10000 = class563.field8014;
                              if (var3) {
                                 break label94;
                              }

                              var25 = var10000;
                           }

                           var10000 = var12;
                        }

                        if (var10000 != 0) {
                           var26 = 0;
                           if (!var3) {
                              break label186;
                           }
                        }

                        int var27 = var10;
                        int[] var28 = var21[var10];
                        int var29 = 0;
                        int var30 = var6 + var25;
                        if (var30 < 0) {
                           var30 += class563.field8014;
                        }

                        if (var30 > class563.field8014) {
                           var30 -= class563.field8014;
                        }

                        var26 = var28[2];

                        do {
                           int var10001;
                           label146: {
                              int[] var31 = var21[var27];
                              if (~var30 <= ~var31[0]) {
                                 var10000 = ~var30;
                                 var10001 = ~var31[1];
                                 if (var3) {
                                    break label146;
                                 }

                                 if (var10000 >= var10001) {
                                    break;
                                 }
                              }

                              var10000 = ~var13;
                              ++var27;
                              var10001 = ~var27;
                           }

                           if (var10000 >= var10001) {
                              var27 = 0;
                           }

                           ++var29;
                        } while(!var3);

                        if (~var10 != ~var27) {
                           int var32 = var6 + var9;
                           if (~var32 > -1) {
                              var32 += class563.field8014;
                           }

                           if (var32 > class563.field8014) {
                              var32 -= class563.field8014;
                           }

                           int var33 = 1;
                           if (var3 || ~var29 <= ~var33) {
                              do {
                                 int[] var34 = var21[(var10 + var33) % var13];
                                 var26 = Math.max(var26, var34[2]);
                                 ++var33;
                              } while(~var29 <= ~var33);
                           }

                           int var35 = 0;
                           if (var3 || var29 >= var35) {
                              do {
                                 int[] var36 = var21[(var10 + var35) % var13];
                                 int var37 = var36[2];
                                 if (var26 == var37) {
                                    ++var35;
                                 } else {
                                    int var40;
                                    int var41;
                                    label117: {
                                       int var38 = var36[0];
                                       int var39 = var36[1];
                                       if (~var32 <= ~var30) {
                                          if (var38 == 0) {
                                             var40 = 0;
                                             var41 = Math.min(var30, var39);
                                             if (!var3) {
                                                break label117;
                                             }
                                          }

                                          var40 = Math.max(var32, var38);
                                          var41 = class563.field8014;
                                          if (!var3) {
                                             break label117;
                                          }
                                       }

                                       var40 = Math.max(var32, var38);
                                       var41 = Math.min(var30, var39);
                                    }

                                    this.method374(-var40 + var41, -var37 + var26, var37, arg0 + 18156, var22, var5, var8 + var40);
                                    ++var35;
                                 }
                              } while(var29 >= var35);
                           }
                        }

                        var10 = var27;
                     }

                     label154: {
                        if (var24 + var26 <= class451.field6570) {
                           var11 = false;
                           if (!var3) {
                              break label154;
                           }
                        }

                        var24 = -var26 + class451.field6570;
                     }

                     if (class563.field8014 != var25) {
                        break;
                     }

                     this.method374(var23, var24, var26, 18156, var22, var5, var7 + var9);
                     if (var11) {
                        return var4;
                     }

                     var11 = true;
                     int[] var42 = var20[var14++];
                     var42[0] = var9;
                     var42[1] = var25;
                     var42[2] = var24 + var26;
                     int[][] var43 = var21;
                     var21 = var20;
                     var20 = var43;
                     var13 = var14;
                     var14 = 0;
                     var8 = var7;
                     var7 = class633.method4632(12, var22, class563.field8014);
                     var9 = 0;
                     var6 = var7 - var8;
                     int var44 = var6;
                     if (~var6 > -1) {
                        var44 = class563.field8014 + var6;
                     }

                     if (var44 > class563.field8014) {
                        var44 -= class563.field8014;
                     }

                     var10 = 0;
                     var12 = 0;

                     while(true) {
                        int[] var45 = var21[var10];
                        if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
                           break;
                        }

                        ++var10;

                        while(~var10 <= ~var13) {
                           var10 = 0;
                           if (!var3) {
                              if (var3) {
                                 continue label174;
                              }
                              break;
                           }
                        }
                     }
                  } while(!var3);

                  int[] var46 = var20[var14++];
                  var46[0] = var9;
                  var46[2] = var24 + var26;
                  var46[1] = var25;
                  this.method374(var23, var24, var26, 18156, var22, var5, var7 + var9);
                  var9 = var25;
               } while(!var3);
            }

            return var4;
         }
      } catch (RuntimeException var48) {
         throw class612.method4503(var48, field461[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "<init>",
      descriptor = "()V"
   )
   public class32() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!bg",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method373(int arg0) {
      try {
         ++field453;
         class9.field160.method5482(-123, 5);
         class142.field2263.method2705(5, 1314);
         class226.field3299.method3412((byte)-94, 5);
         class549.field7834.method3846(5, 111);
         class478.field6879.method4874(5, 64);
         class201.field2882.method5590(5, true);
         class216.field3085.method4247(5, -1815);
         class183.field2689.method3228((byte)127, 5);
         class225.field3194.method2714(5, false);
         class690.field9935.method3945(5, arg0 ^ 4686);
         class383.field5588.method2662(5, (byte)-79);
         class283.field4267.method1705(5, (byte)-76);
         class378.field5523.method1301(-706, 5);
         class33.field467.method1752(5, 5926);
         class376.field5490.method2361(5, 4);
         class746.field10611.method1221(22934, 5);
         class78.field1245.method3824(-6521, 5);
         class705.field10141.method1462(arg0 ^ arg0, 5);
         class376.field5487.method4565(false, 5);
         class237.field3664.method1109((byte)74, 5);
         class787.field11478.method3713(5, (byte)-108);
         class316.field4722.method3925(5, (byte)-104);
         class300.field4488.method1846(arg0 ^ -4628, 5);
         class390.method3031(5, (byte)2);
         class296.method2465(false, 50);
         class633.method4629(false, 50);
         class25.method317(5, (byte)-21);
         class59.method609((byte)-56, 5);
         class605.field8625.method1048(5, arg0 + -13168);
         class306.field4633.method1048(5, -8543);
         class588.field8263.method1048(5, -8543);
         class253.field3838.method1048(5, arg0 ^ -13136);
         class427.field6234.method1048(5, -8543);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field461[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(IIIILjava/util/Random;[[II)V"
   )
   private final void method374(int param1, int param2, int param3, int param4, Random param5, int[][] param6, int param7) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

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
                                    if (arg1 != 0) {
                                       if (~arg1 == -2) {
                                          break label92;
                                       }

                                       if (~arg1 == -3) {
                                          break label93;
                                       }

                                       if (~arg1 == -4) {
                                          break label94;
                                       }

                                       if (arg1 == 4) {
                                          break label95;
                                       }

                                       if (arg1 == 5) {
                                          break label96;
                                       }

                                       if (~arg1 == -7) {
                                          break label97;
                                       }

                                       if (arg1 == 7) {
                                          break label98;
                                       }

                                       if (~arg1 != -9) {
                                          break label100;
                                       }

                                       if (!var4) {
                                          break label99;
                                       }
                                    }

                                    this.field454 = arg0.method665(false);
                                    if (!var4) {
                                       break label100;
                                    }
                                 }

                                 this.field457 = arg0.method685(-2);
                                 if (!var4) {
                                    break label100;
                                 }
                              }

                              this.field445 = arg0.method685(-2);
                              if (!var4) {
                                 break label100;
                              }
                           }

                           this.field451 = arg0.method685(-2);
                           if (!var4) {
                              break label100;
                           }
                        }

                        this.field456 = arg0.method685(-2);
                        if (!var4) {
                           break label100;
                        }
                     }

                     this.field448 = arg0.method685(-2);
                     if (!var4) {
                        break label100;
                     }
                  }

                  this.field447 = arg0.method665(false);
                  if (!var4) {
                     break label100;
                  }
               }

               this.field449 = arg0.method685(-2);
               if (!var4) {
                  break label100;
               }
            }

            this.field450 = arg0.method685(-2);
         }

         if (arg2 >= -6) {
            this.field449 = 70;
         }

         ++field446;
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field461[4] + (arg0 != null ? field461[2] : field461[3]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "a",
      descriptor = "(BIII)V"
   )
   public static final void method375(byte arg0, int arg1, int arg2, int arg3) {
      try {
         ++field452;
         class644.field9070 = new byte[arg3][arg2][arg1];
         if (arg0 != -120) {
            field460 = null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field461[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "e",
      descriptor = "(B)V"
   )
   public static final void method376(byte arg0) {
      try {
         class61.field873 = null;
         ++field458;
         if (arg0 >= -66) {
            method373(-53);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field461[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         ++field455;
         if (arg0 < 118) {
            this.field454 = -55;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field461[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 18);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method378(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 18;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
