import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class439 extends class606 {
   @OriginalMember(
      owner = "client!pda",
      name = "E",
      descriptor = "I"
   )
   private int field6429 = 2000;
   @OriginalMember(
      owner = "client!pda",
      name = "K",
      descriptor = "I"
   )
   private int field6432 = 0;
   @OriginalMember(
      owner = "client!pda",
      name = "G",
      descriptor = "I"
   )
   private int field6434 = 4096;
   @OriginalMember(
      owner = "client!pda",
      name = "M",
      descriptor = "I"
   )
   private int field6428 = 0;
   @OriginalMember(
      owner = "client!pda",
      name = "O",
      descriptor = "I"
   )
   private int field6437 = 16;
   @OriginalMember(
      owner = "client!pda",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6438 = new String[]{method3420(method3419("+Z'|\u0014")), method3420(method3419(" \u0010h|(x")), method3420(method3419(">\u0001e>")), method3420(method3419(" \u0010h|!x")), method3420(method3419(" \u0010h|\"x")), method3420(method3419(" \u0010h|*x")), method3420(method3419(" \u0010h|,x"))};
   @OriginalMember(
      owner = "client!pda",
      name = "L",
      descriptor = "[I"
   )
   public static int[] field6433 = new int[1];
   @OriginalMember(
      owner = "client!pda",
      name = "N",
      descriptor = "I"
   )
   public static int field6430;
   @OriginalMember(
      owner = "client!pda",
      name = "I",
      descriptor = "I"
   )
   public static int field6431;
   @OriginalMember(
      owner = "client!pda",
      name = "F",
      descriptor = "I"
   )
   public static int field6435;
   @OriginalMember(
      owner = "client!pda",
      name = "H",
      descriptor = "I"
   )
   public static int field6436;

   @OriginalMember(
      owner = "client!pda",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method270(byte arg0) {
      try {
         ++field6430;
         class22.method299(4096);
         if (arg0 < 118) {
            field6433 = null;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6438[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(Lcu;II)V"
   )
   public final void method8(class65 arg0, int arg1, int arg2) {
      boolean var4 = client.field10022;

      try {
         label64: {
            label63: {
               label62: {
                  label61: {
                     label60: {
                        ++field6435;
                        if (arg1 != 0) {
                           if (~arg1 == -2) {
                              break label60;
                           }

                           if (arg1 == 2) {
                              break label61;
                           }

                           if (arg1 == 3) {
                              break label62;
                           }

                           if (arg1 != 4) {
                              break label64;
                           }

                           if (!var4) {
                              break label63;
                           }
                        }

                        this.field6428 = arg0.method665(false);
                        if (!var4) {
                           break label64;
                        }
                     }

                     this.field6429 = arg0.method685(-2);
                     if (!var4) {
                        break label64;
                     }
                  }

                  this.field6437 = arg0.method665(false);
                  if (!var4) {
                     break label64;
                  }
               }

               this.field6432 = arg0.method685(-2);
               if (!var4) {
                  break label64;
               }
            }

            this.field6434 = arg0.method685(-2);
         }

         if (arg2 > -6) {
            this.field6437 = 87;
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field6438[1] + (arg0 != null ? field6438[0] : field6438[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != 0) {
            return null;
         } else {
            ++field6431;
            int[] var4 = super.field8645.method2632(arg1, 27230);
            if (super.field8645.field4884) {
               int var5 = this.field6434 >> 1;
               int[][] var6 = super.field8645.method2629(true);
               Random var7 = new Random((long)this.field6428);
               int var8 = 0;
               if (var3 || ~this.field6429 < ~var8) {
                  do {
                     int var9 = ~this.field6434 < -1 ? this.field6432 + class633.method4632(12, var7, this.field6434) + -var5 : this.field6432;
                     int var10 = 255 & var9 >> 4;
                     int var11 = class633.method4632(12, var7, class563.field8014);
                     int var12 = class633.method4632(12, var7, class451.field6570);
                     int var13 = (class458.field6687[var10] * this.field6437 >> 12) + var11;
                     int var14 = (class608.field8660[var10] * this.field6437 >> 12) + var12;
                     int var15 = -var12 + var14;
                     int var16 = -var11 + var13;
                     if (var16 == 0) {
                        if (var15 == 0) {
                           ++var8;
                           continue;
                        }

                        if (var16 < 0) {
                           var16 = -var16;
                        }
                     } else if (var16 < 0) {
                        var16 = -var16;
                     }

                     if (var15 < 0) {
                        var15 = -var15;
                     }

                     boolean var17 = ~var16 > ~var15;
                     if (var17) {
                        int var18 = var11;
                        var11 = var12;
                        int var19 = var13;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                     }

                     if (~var13 > ~var11) {
                        int var20 = var11;
                        var11 = var13;
                        int var21 = var12;
                        var13 = var20;
                        var12 = var14;
                        var14 = var21;
                     }

                     int var22 = var12;
                     int var23 = var13 - var11;
                     int var24 = var14 - var12;
                     int var25 = -var23 / 2;
                     int var26 = 2048 / var23;
                     int var27 = 1024 + -(class633.method4632(arg0 ^ 12, var7, 4096) >> 2);
                     int var28 = ~var14 >= ~var12 ? -1 : 1;
                     if (~var24 > -1) {
                        var24 = -var24;
                     }

                     int var29 = var11;
                     if (!var3 && var13 <= var11) {
                        ++var8;
                     } else {
                        do {
                           int var30 = (-var11 + var29) * var26 + var27 - -1024;
                           int var31 = var29 & class358.field5293;
                           int var32 = var22 & class801.field11660;
                           var25 += var24;
                           if (var17) {
                              var6[var32][var31] = var30;
                              if (var3) {
                                 var6[var31][var32] = var30;
                              }
                           } else {
                              var6[var31][var32] = var30;
                           }

                           if (var25 > 0) {
                              var25 += -var23;
                              var22 += var28;
                           }

                           ++var29;
                        } while(var13 > var29);

                        ++var8;
                     }
                  } while(~this.field6429 < ~var8);
               }
            }

            return var4;
         }
      } catch (RuntimeException var34) {
         throw class612.method4503(var34, field6438[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3417(int arg0) {
      try {
         if (arg0 >= -47) {
            method3418(75, 25, false, -72, (class91)null);
         }

         field6433 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6438[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "a",
      descriptor = "(IIZILjga;)V"
   )
   public static final void method3418(int arg0, int arg1, boolean arg2, int arg3, class91 arg4) {
      boolean var5 = client.field10022;

      try {
         int var6;
         int var7;
         label120: {
            ++field6436;
            var6 = arg4.field1513;
            var7 = arg4.field1452;
            if (arg4.field1352 != 0) {
               if (arg4.field1352 != 1) {
                  if (arg4.field1352 != 2) {
                     break label120;
                  }

                  arg4.field1513 = arg4.field1475 * arg0 >> 14;
                  if (!var5) {
                     break label120;
                  }
               }

               arg4.field1513 = -arg4.field1475 + arg0;
               if (!var5) {
                  break label120;
               }
            }

            arg4.field1513 = arg4.field1475;
         }

         label110: {
            if (arg4.field1486 != 0) {
               if (arg4.field1486 == 1) {
                  arg4.field1452 = arg1 - arg4.field1402;
                  if (!var5) {
                     break label110;
                  }
               }

               if (arg4.field1486 != 2) {
                  break label110;
               }

               arg4.field1452 = arg4.field1402 * arg1 >> 14;
               if (!var5) {
                  break label110;
               }
            }

            arg4.field1452 = arg4.field1402;
         }

         if (arg4.field1352 == 4) {
            arg4.field1513 = arg4.field1477 * arg4.field1452 / arg4.field1469;
         }

         if (arg3 != -6) {
            method3417(-116);
         }

         if (arg4.field1486 == 4) {
            arg4.field1452 = arg4.field1513 * arg4.field1469 / arg4.field1477;
         }

         if (class34.field514 && (client.method5048(arg4).field6076 != 0 || ~arg4.field1403 == -1)) {
            label134: {
               if (~arg4.field1452 <= -6 || ~arg4.field1513 <= -6) {
                  if (arg4.field1513 <= 0) {
                     arg4.field1513 = 5;
                  }

                  if (arg4.field1452 > 0) {
                     break label134;
                  }

                  arg4.field1452 = 5;
                  if (!var5) {
                     break label134;
                  }
               }

               arg4.field1452 = 5;
               arg4.field1513 = 5;
            }
         }

         if (class540.field7580 == arg4.field1418) {
            class397.field5880 = arg4;
         }

         if (arg2 && arg4.field1423 != null) {
            if (~arg4.field1513 != ~var6 || arg4.field1452 != var7) {
               class536 var8 = new class536();
               var8.field7524 = arg4;
               var8.field7529 = arg4.field1423;
               class750.field10657.method2238(var8, arg3 ^ -9);
            }

         }
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field6438[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6438[0] : field6438[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pda",
      name = "<init>",
      descriptor = "()V"
   )
   public class439() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3419(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3420(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 116;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
