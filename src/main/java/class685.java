import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class685 extends class302 {
   @OriginalMember(
      owner = "client!dv",
      name = "I",
      descriptor = "I"
   )
   private int field10275 = 3072;
   @OriginalMember(
      owner = "client!dv",
      name = "X",
      descriptor = "I"
   )
   private int field10269 = 2048;
   @OriginalMember(
      owner = "client!dv",
      name = "L",
      descriptor = "I"
   )
   private int field10282 = 1024;
   @OriginalMember(
      owner = "client!dv",
      name = "M",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10284 = new String[]{method4981(method4980(";\u001am\u0014%")), method4981(method4980(".A/V")), method4981(method4980("`\u0019}\u001a")), method4981(method4980("$Bm\u007fp")), method4981(method4980("$Bm|p")), method4981(method4980("$Bmyp")), method4981(method4980("$Bm}p")), method4981(method4980("$Bm~p")), method4981(method4980("$Bmxp")), method4981(method4980("$Bm{p"))};
   @OriginalMember(
      owner = "client!dv",
      name = "P",
      descriptor = "Lsda;"
   )
   public static class269 field10274 = new class269(69, 7);
   @OriginalMember(
      owner = "client!dv",
      name = "O",
      descriptor = "I"
   )
   public static int field10281 = 2;
   @OriginalMember(
      owner = "client!dv",
      name = "S",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10283 = "";
   @OriginalMember(
      owner = "client!dv",
      name = "K",
      descriptor = "I"
   )
   public static int field10268;
   @OriginalMember(
      owner = "client!dv",
      name = "J",
      descriptor = "I"
   )
   public static int field10270;
   @OriginalMember(
      owner = "client!dv",
      name = "Q",
      descriptor = "I"
   )
   public static int field10271;
   @OriginalMember(
      owner = "client!dv",
      name = "H",
      descriptor = "I"
   )
   public static int field10273;
   @OriginalMember(
      owner = "client!dv",
      name = "N",
      descriptor = "I"
   )
   public static int field10276;
   @OriginalMember(
      owner = "client!dv",
      name = "T",
      descriptor = "I"
   )
   public static int field10277;
   @OriginalMember(
      owner = "client!dv",
      name = "V",
      descriptor = "I"
   )
   public static int field10278;
   @OriginalMember(
      owner = "client!dv",
      name = "R",
      descriptor = "I"
   )
   public static int field10279;
   @OriginalMember(
      owner = "client!dv",
      name = "U",
      descriptor = "I"
   )
   public static int field10280;
   @OriginalMember(
      owner = "client!dv",
      name = "W",
      descriptor = "[Z"
   )
   public static boolean[] field10272;

   @OriginalMember(
      owner = "client!dv",
      name = "<init>",
      descriptor = "()V"
   )
   public class685() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!dv",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method4977(int arg0) {
      try {
         field10274 = null;
         field10272 = null;
         field10283 = null;
         if (arg0 != -1913378432) {
            method4978(33, 84, 20, 79, -10, -77, 18);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10284[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(IILjj;)V"
   )
   public final void method244(int arg0, int arg1, class128 arg2) {
      try {
         ++field10278;
         if (arg1 != 0) {
            field10280 = 80;
         }

         if (~arg0 != -1) {
            if (~arg0 == -2) {
               this.field10275 = arg2.method1038((byte)-106);
               return;
            }

            if (~arg0 != -3) {
               return;
            }

            if (client.field4530 == 0) {
               super.field4313 = arg2.method1104(255) == 1;
               return;
            }
         }

         this.field10282 = arg2.method1038((byte)-119);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10284[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10284[0] : field10284[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method708(byte arg0) {
      try {
         this.field10269 = -this.field10282 + this.field10275;
         ++field10271;
         if (arg0 > -87) {
            method4977(76);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10284[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(BI)[[I"
   )
   public final int[][] method245(byte arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 != -90) {
            field10279 = -61;
         }

         ++field10273;
         int[][] var4 = super.field4292.method3409(arg1, 0);
         if (super.field4292.field6892) {
            int[][] var5 = this.method2297(0, arg1, arg0 ^ -90);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int var12 = 0;
            if (var3 != 0 || ~class344.field5238 < ~var12) {
               do {
                  var9[var12] = this.field10282 - -(var6[var12] * this.field10269 >> 12);
                  var10[var12] = (var7[var12] * this.field10269 >> 12) + this.field10282;
                  var11[var12] = (var8[var12] * this.field10269 >> 12) + this.field10282;
                  ++var12;
               } while(~class344.field5238 < ~var12);
            }
         }

         return var4;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10284[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "b",
      descriptor = "(IIIIIII)V"
   )
   public static final void method4978(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var7 = client.field4530;

      try {
         ++field10277;
         class257.method1947(-122, arg6);
         int var8 = 0;
         if (arg3 != 3765) {
            field10274 = null;
         }

         int var9 = arg6 - arg4;
         if (~var9 > -1) {
            var9 = 0;
         }

         int var10 = arg6;
         int var11 = -arg6;
         int var12 = var9;
         int var13 = -var9;
         byte var14 = -1;
         if (~class506.field7472 >= ~arg0 && arg0 <= class22.field234) {
            int[] var15 = class292.field4077[arg0];
            int var16 = class768.method5559(-arg6 + arg2, class100.field1232, class197.field2442, 71);
            int var17 = class768.method5559(arg2 - -arg6, class100.field1232, class197.field2442, 71);
            int var18 = class768.method5559(-var9 + arg2, class100.field1232, class197.field2442, 71);
            int var19 = class768.method5559(arg2 + var9, class100.field1232, class197.field2442, arg3 + -3694);
            class47.method372(var18, var15, arg1, (byte)115, var16);
            class47.method372(var19, var15, arg5, (byte)110, var18);
            class47.method372(var17, var15, arg1, (byte)99, var19);
         }

         byte var20 = -1;
         int var10000;
         int var10001;
         int var45;
         int var46;
         if (var7 != 0) {
            var45 = var14 + 2;
            var46 = var20 + 2;
            var13 += var46;
            var10000 = var11;
            var10001 = var45;
         } else {
            if (~arg6 >= ~var8) {
               return;
            }

            var45 = var14 + 2;
            var46 = var20 + 2;
            var13 += var46;
            var10000 = var11;
            var10001 = var45;
         }

         while(true) {
            while(true) {
               var11 = var10000 + var10001;
               if (var13 >= 0 && ~var12 <= -2) {
                  --var12;
                  var13 -= var12 << 1;
                  class226.field2902[var12] = var8;
               }

               ++var8;
               if (~var11 <= -1) {
                  --var10;
                  var11 -= var10 << 1;
                  int var21 = arg0 - var10;
                  int var22 = arg0 - -var10;
                  if (~var22 <= ~class506.field7472 && ~class22.field234 <= ~var21) {
                     label143: {
                        if (~var9 < ~var10) {
                           int var23 = class226.field2902[var10];
                           int var24 = class768.method5559(arg2 + var8, class100.field1232, class197.field2442, 71);
                           int var25 = class768.method5559(-var8 + arg2, class100.field1232, class197.field2442, 71);
                           int var26 = class768.method5559(arg2 + var23, class100.field1232, class197.field2442, 71);
                           int var27 = class768.method5559(-var23 + arg2, class100.field1232, class197.field2442, 71);
                           if (class22.field234 >= var22) {
                              int[] var28 = class292.field4077[var22];
                              class47.method372(var27, var28, arg1, (byte)119, var25);
                              class47.method372(var26, var28, arg5, (byte)115, var27);
                              class47.method372(var24, var28, arg1, (byte)123, var26);
                           }

                           if (class506.field7472 > var21) {
                              break label143;
                           }

                           int[] var29 = class292.field4077[var21];
                           class47.method372(var27, var29, arg1, (byte)126, var25);
                           class47.method372(var26, var29, arg5, (byte)113, var27);
                           class47.method372(var24, var29, arg1, (byte)127, var26);
                           if (var7 == 0) {
                              break label143;
                           }
                        }

                        int var30 = class768.method5559(arg2 + var8, class100.field1232, class197.field2442, 71);
                        int var31 = class768.method5559(-var8 + arg2, class100.field1232, class197.field2442, 71);
                        if (var22 <= class22.field234) {
                           class47.method372(var30, class292.field4077[var22], arg1, (byte)96, var31);
                        }

                        if (class506.field7472 <= var21) {
                           class47.method372(var30, class292.field4077[var21], arg1, (byte)116, var31);
                        }
                     }
                  }
               }

               int var32 = -var8 + arg0;
               int var33 = arg0 + var8;
               if (~class506.field7472 < ~var33) {
                  break;
               }

               var10000 = ~var32;
               var10001 = ~class22.field234;
               if (var7 == 0) {
                  if (var10000 >= var10001) {
                     int var34 = arg2 + var10;
                     int var35 = -var10 + arg2;
                     if (var34 >= class197.field2442 && ~class100.field1232 <= ~var35) {
                        int var36 = class768.method5559(var34, class100.field1232, class197.field2442, arg3 ^ 3826);
                        int var37 = class768.method5559(var35, class100.field1232, class197.field2442, arg3 + -3694);
                        if (var8 < var9) {
                           int var38 = var12 < var8 ? class226.field2902[var8] : var12;
                           int var39 = class768.method5559(arg2 + var38, class100.field1232, class197.field2442, 71);
                           int var40 = class768.method5559(arg2 - var38, class100.field1232, class197.field2442, 71);
                           if (~class22.field234 <= ~var33) {
                              int[] var41 = class292.field4077[var33];
                              class47.method372(var40, var41, arg1, (byte)96, var37);
                              class47.method372(var39, var41, arg5, (byte)117, var40);
                              class47.method372(var36, var41, arg1, (byte)122, var39);
                           }

                           if (~class506.field7472 >= ~var32) {
                              int[] var42 = class292.field4077[var32];
                              class47.method372(var40, var42, arg1, (byte)127, var37);
                              class47.method372(var39, var42, arg5, (byte)122, var40);
                              class47.method372(var36, var42, arg1, (byte)106, var39);
                              if (var7 != 0) {
                                 if (~var33 >= ~class22.field234) {
                                    class47.method372(var36, class292.field4077[var33], arg1, (byte)127, var37);
                                 }

                                 if (class506.field7472 <= var32) {
                                    class47.method372(var36, class292.field4077[var32], arg1, (byte)127, var37);
                                 }
                              }
                           }
                        } else {
                           if (~var33 >= ~class22.field234) {
                              class47.method372(var36, class292.field4077[var33], arg1, (byte)127, var37);
                           }

                           if (class506.field7472 <= var32) {
                              class47.method372(var36, class292.field4077[var32], arg1, (byte)127, var37);
                           }
                        }
                     }
                  }
                  break;
               }
            }

            if (~var10 >= ~var8) {
               return;
            }

            var45 += 2;
            var46 += 2;
            var13 += var46;
            var10000 = var11;
            var10001 = var45;
         }
      } catch (RuntimeException var44) {
         throw class670.method4877(var44, field10284[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method401(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         ++field10276;
         int[] var4 = super.field4298.method3175(arg0, (byte)-127);
         if (super.field4298.field6356) {
            int[] var5 = this.method2299(arg0, false, 0);
            int var6 = 0;
            if (var3 != 0 || ~var6 > ~class344.field5238) {
               do {
                  var4[var6] = (var5[var6] * this.field10269 >> 12) + this.field10282;
                  ++var6;
               } while(~var6 > ~class344.field5238);
            }
         }

         if (arg1 > -37) {
            this.method401(37, 73);
         }

         return var4;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10284[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(IILhv;Z)V"
   )
   public static final void method4979(int arg0, int arg1, class544 arg2, boolean arg3) {
      int var4 = client.field4530;

      try {
         if (class367.field5530) {
            class457 var5 = class662.field9596 == -1 ? null : class170.field2105.method3799(-128, class662.field9596);
            if (client.method2388(arg2).method3548(2372) && ~(class427.field6529 & 32) != -1 && (var5 == null || ~arg2.method4028(1, class662.field9596, var5.field6933) != ~var5.field6933)) {
               ++class674.field10123;
               class466.method3485(class84.field1033, 17, arg2.field8054, true, class30.field330, false, class769.field11280 + field10284[2] + arg2.field8000, false, true, arg2.field7969, (long)(arg2.field8048 << 0 | arg2.field8054), 0L, arg2.field8048);
            }
         }

         ++field10268;
         int var6 = 9;
         String var7;
         if (var4 != 0) {
            var7 = class276.method2126(arg2, -2, var6);
            if (var7 != null) {
               ++class688.field10361;
               class466.method3485(var7, 1003, arg2.field8054, true, class25.method167(100, var6, arg2), false, arg2.field8000, false, true, arg2.field7969, (long)(arg2.field8054 | arg2.field8048 << 0), (long)(var6 + 1), arg2.field8048);
            }

            --var6;
         }

         while(true) {
            String var10000;
            if (var6 < 5) {
               var7 = class205.method1569((byte)-86, arg2);
               var10000 = var7;
               if (var4 == 0) {
                  if (var7 != null) {
                     class466.method3485(var7, 20, arg2.field8054, arg3, arg2.field8029, false, arg2.field8000, false, true, arg2.field7969, (long)(arg2.field8054 | arg2.field8048 << 0), 0L, arg2.field8048);
                     ++class326.field4629;
                  }

                  if (!arg3) {
                     field10280 = -43;
                  }

                  int var8 = 4;
                  String var9;
                  if (var4 != 0) {
                     var9 = class276.method2126(arg2, -2, var8);
                     if (var9 != null) {
                        ++class688.field10361;
                        class466.method3485(var9, 21, arg2.field8054, true, class25.method167(100, var8, arg2), false, arg2.field8000, false, true, arg2.field7969, (long)(arg2.field8048 << 0 | arg2.field8054), (long)(var8 + 1), arg2.field8048);
                     }

                     --var8;
                  }

                  while(true) {
                     class544 var12;
                     if (~var8 > -1) {
                        var12 = arg2;
                        if (var4 == 0) {
                           if (!client.method2388(arg2).method3545(-25551)) {
                              return;
                           }

                           label66: {
                              if (arg2.field7974 == null) {
                                 class466.method3485(class204.field2574.method1562((byte)-106, class728.field10827), 11, arg2.field8054, true, -1, false, "", false, true, arg2.field7969, (long)(arg2.field8048 << 0 | arg2.field8054), 0L, arg2.field8048);
                                 if (var4 == 0) {
                                    break label66;
                                 }
                              }

                              class466.method3485(arg2.field7974, 11, arg2.field8054, true, -1, false, "", false, true, arg2.field7969, (long)(arg2.field8048 << 0 | arg2.field8054), 0L, arg2.field8048);
                           }

                           ++class412.field6312;
                           return;
                        }
                     } else {
                        var12 = arg2;
                     }

                     var9 = class276.method2126(var12, -2, var8);
                     if (var9 != null) {
                        ++class688.field10361;
                        class466.method3485(var9, 21, arg2.field8054, true, class25.method167(100, var8, arg2), false, arg2.field8000, false, true, arg2.field7969, (long)(arg2.field8048 << 0 | arg2.field8054), (long)(var8 + 1), arg2.field8048);
                     }

                     --var8;
                  }
               }
            } else {
               var7 = class276.method2126(arg2, -2, var6);
               var10000 = var7;
            }

            if (var10000 != null) {
               ++class688.field10361;
               class466.method3485(var7, 1003, arg2.field8054, true, class25.method167(100, var6, arg2), false, arg2.field8000, false, true, arg2.field7969, (long)(arg2.field8054 | arg2.field8048 << 0), (long)(var6 + 1), arg2.field8048);
            }

            --var6;
         }
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10284[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10284[0] : field10284[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4980(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4981(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 67;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
