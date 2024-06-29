import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mfa")
public class class216 extends class454 {
   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2749 = new String[]{method1768(method1767(">OA\"\n{")), method1768(method1767("=\\L`")), method1768(method1767(">OA\"\r{")), method1768(method1767("(\u0007\u000e\"4")), method1768(method1767(">OA\"\f{")), method1768(method1767(">OA\"\u0001{")), method1768(method1767(">OA\"\b{")), method1768(method1767(">OA\"\u000f{")), method1768(method1767(">OA\"\u0006{")), method1768(method1767(">OA\"\u000b{")), method1768(method1767(">OA\"\u0007{")), method1768(method1767(">OA\"\u000e{"))};
   @OriginalMember(
      owner = "client!mfa",
      name = "n",
      descriptor = "I"
   )
   public static int field2742 = -1;
   @OriginalMember(
      owner = "client!mfa",
      name = "i",
      descriptor = "I"
   )
   public static int field2738;
   @OriginalMember(
      owner = "client!mfa",
      name = "m",
      descriptor = "I"
   )
   public static int field2739;
   @OriginalMember(
      owner = "client!mfa",
      name = "o",
      descriptor = "I"
   )
   public static int field2740;
   @OriginalMember(
      owner = "client!mfa",
      name = "s",
      descriptor = "I"
   )
   public static int field2741;
   @OriginalMember(
      owner = "client!mfa",
      name = "k",
      descriptor = "I"
   )
   public static int field2743;
   @OriginalMember(
      owner = "client!mfa",
      name = "j",
      descriptor = "I"
   )
   public static int field2744;
   @OriginalMember(
      owner = "client!mfa",
      name = "l",
      descriptor = "I"
   )
   public static int field2746;
   @OriginalMember(
      owner = "client!mfa",
      name = "q",
      descriptor = "I"
   )
   public static int field2747;
   @OriginalMember(
      owner = "client!mfa",
      name = "r",
      descriptor = "I"
   )
   public static int field2748;
   @OriginalMember(
      owner = "client!mfa",
      name = "p",
      descriptor = "Lkia;"
   )
   public static class93 field2745;

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method1761(boolean arg0) {
      try {
         ++field2744;
         if (arg0) {
            field2745 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2749[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method1762(byte arg0) {
      try {
         field2745 = null;
         if (arg0 != -74) {
            field2745 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2749[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(IIIIIBI)V"
   )
   public static final void method1763(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         class511.method3859(arg1, 106);
         ++field2748;
         int var8 = 0;
         int var9 = -arg3 + arg1;
         if (var9 < 0) {
            var9 = 0;
         }

         int var10 = arg1;
         int var11 = -arg1;
         if (arg5 == -72) {
            int var12 = var9;
            int var13 = -var9;
            byte var14 = -1;
            if (~arg4 <= ~class577.field8561 && class586.field8647 >= arg4) {
               int[] var15 = class237.field3001[arg4];
               int var16 = class180.method1522(25495, class415.field5689, class282.field3921, -arg1 + arg6);
               int var17 = class180.method1522(25495, class415.field5689, class282.field3921, arg1 + arg6);
               int var18 = class180.method1522(arg5 + 25567, class415.field5689, class282.field3921, arg6 - var9);
               int var19 = class180.method1522(25495, class415.field5689, class282.field3921, arg6 + var9);
               class385.method3045(arg0, var18, var15, var16, (byte)-80);
               class385.method3045(arg2, var19, var15, var18, (byte)-75);
               class385.method3045(arg0, var17, var15, var19, (byte)-94);
            }

            byte var20 = -1;
            int var45;
            int var46;
            if (var7) {
               var45 = var14 + 2;
               var46 = var20 + 2;
               var13 += var46;
               var11 += var45;
               if (~var13 <= -1 && var9 >= 1) {
                  var12 = var9 - 1;
                  var13 -= var12 << 1;
                  class89.field1205[var12] = var8;
               }
            } else {
               if (~arg1 >= ~var8) {
                  return;
               }

               var45 = var14 + 2;
               var46 = var20 + 2;
               var13 += var46;
               var11 += var45;
               if (~var13 <= -1 && var9 >= 1) {
                  var12 = var9 - 1;
                  var13 -= var12 << 1;
                  class89.field1205[var12] = var8;
               }
            }

            while(true) {
               while(true) {
                  ++var8;
                  if (~var11 <= -1) {
                     --var10;
                     var11 -= var10 << 1;
                     int var21 = arg4 - var10;
                     int var22 = arg4 - -var10;
                     if (class577.field8561 <= var22 && var21 <= class586.field8647) {
                        label181: {
                           if (var9 <= var10) {
                              int var23 = class180.method1522(arg5 ^ -25553, class415.field5689, class282.field3921, arg6 - -var8);
                              int var24 = class180.method1522(arg5 + 25567, class415.field5689, class282.field3921, arg6 - var8);
                              if (class586.field8647 >= var22) {
                                 class385.method3045(arg0, var23, class237.field3001[var22], var24, (byte)-63);
                              }

                              if (~class577.field8561 < ~var21) {
                                 break label181;
                              }

                              class385.method3045(arg0, var23, class237.field3001[var21], var24, (byte)-100);
                              if (!var7) {
                                 break label181;
                              }
                           }

                           int var25 = class89.field1205[var10];
                           int var26 = class180.method1522(25495, class415.field5689, class282.field3921, arg6 - -var8);
                           int var27 = class180.method1522(25495, class415.field5689, class282.field3921, -var8 + arg6);
                           int var28 = class180.method1522(25495, class415.field5689, class282.field3921, arg6 + var25);
                           int var29 = class180.method1522(arg5 + 25567, class415.field5689, class282.field3921, -var25 + arg6);
                           if (~class586.field8647 <= ~var22) {
                              int[] var30 = class237.field3001[var22];
                              class385.method3045(arg0, var29, var30, var27, (byte)-60);
                              class385.method3045(arg2, var28, var30, var29, (byte)-127);
                              class385.method3045(arg0, var26, var30, var28, (byte)-85);
                           }

                           if (var21 >= class577.field8561) {
                              int[] var31 = class237.field3001[var21];
                              class385.method3045(arg0, var29, var31, var27, (byte)-83);
                              class385.method3045(arg2, var28, var31, var29, (byte)-111);
                              class385.method3045(arg0, var26, var31, var28, (byte)-67);
                           }
                        }
                     }
                  }

                  int var32 = -var8 + arg4;
                  int var33 = arg4 - -var8;
                  if (~class577.field8561 >= ~var33) {
                     int var10000 = class586.field8647;
                     if (var7) {
                        if (var10000 <= var32 && var12 >= 1) {
                           --var12;
                           var13 -= var12 << 1;
                           class89.field1205[var12] = var8;
                        }
                        continue;
                     }

                     if (var10000 >= var32) {
                        int var34 = arg6 + var10;
                        int var35 = -var10 + arg6;
                        if (~class415.field5689 >= ~var34 && var35 <= class282.field3921) {
                           int var36 = class180.method1522(25495, class415.field5689, class282.field3921, var34);
                           int var37 = class180.method1522(arg5 + 25567, class415.field5689, class282.field3921, var35);
                           int var38;
                           int var39;
                           int var40;
                           int[] var41;
                           int[] var42;
                           if (~var9 >= ~var8) {
                              if (~var33 >= ~class586.field8647) {
                                 class385.method3045(arg0, var36, class237.field3001[var33], var37, (byte)-117);
                              }

                              if (~class577.field8561 >= ~var32) {
                                 class385.method3045(arg0, var36, class237.field3001[var32], var37, (byte)-83);
                                 if (var7) {
                                    var38 = var8 <= var12 ? var12 : class89.field1205[var8];
                                    var39 = class180.method1522(25495, class415.field5689, class282.field3921, arg6 + var38);
                                    var40 = class180.method1522(arg5 ^ -25553, class415.field5689, class282.field3921, -var38 + arg6);
                                    if (~class586.field8647 <= ~var33) {
                                       var41 = class237.field3001[var33];
                                       class385.method3045(arg0, var40, var41, var37, (byte)-87);
                                       class385.method3045(arg2, var39, var41, var40, (byte)-61);
                                       class385.method3045(arg0, var36, var41, var39, (byte)-124);
                                    }

                                    if (var32 >= class577.field8561) {
                                       var42 = class237.field3001[var32];
                                       class385.method3045(arg0, var40, var42, var37, (byte)-82);
                                       class385.method3045(arg2, var39, var42, var40, (byte)-110);
                                       class385.method3045(arg0, var36, var42, var39, (byte)-111);
                                    }
                                 }
                              }
                           } else {
                              var38 = var8 <= var12 ? var12 : class89.field1205[var8];
                              var39 = class180.method1522(25495, class415.field5689, class282.field3921, arg6 + var38);
                              var40 = class180.method1522(arg5 ^ -25553, class415.field5689, class282.field3921, -var38 + arg6);
                              if (~class586.field8647 <= ~var33) {
                                 var41 = class237.field3001[var33];
                                 class385.method3045(arg0, var40, var41, var37, (byte)-87);
                                 class385.method3045(arg2, var39, var41, var40, (byte)-61);
                                 class385.method3045(arg0, var36, var41, var39, (byte)-124);
                              }

                              if (var32 >= class577.field8561) {
                                 var42 = class237.field3001[var32];
                                 class385.method3045(arg0, var40, var42, var37, (byte)-82);
                                 class385.method3045(arg2, var39, var42, var40, (byte)-110);
                                 class385.method3045(arg0, var36, var42, var39, (byte)-111);
                              }
                           }
                        }
                     }
                  }

                  if (~var10 >= ~var8) {
                     return;
                  }

                  var45 += 2;
                  var46 += 2;
                  var13 += var46;
                  var11 += var45;
                  if (~var13 <= -1 && var12 >= 1) {
                     --var12;
                     var13 -= var12 << 1;
                     class89.field1205[var12] = var8;
                  }
               }
            }
         }
      } catch (RuntimeException var44) {
         throw class93.method866(var44, field2749[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field2747;
         if (class699.method5095(arg0, 2)) {
            if (super.field6259.field11012.method22((byte)113) && !class62.method558(super.field6259.field11012.method27(-18033), -122)) {
               return 3;
            }

            if (~super.field6259.field10980.method3905(-18033) == -2) {
               return 3;
            }
         }

         if (~arg0 == -4) {
            return 3;
         } else if (class699.method5095(arg0, 2)) {
            return 2;
         } else {
            if (arg1) {
               this.method24(-20, true);
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2749[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1764(int arg0) {
      try {
         if (arg0 != -18033) {
            return 65;
         } else {
            ++field2738;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2749[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method1765(int arg0) {
      try {
         if (arg0 != 1) {
            field2742 = 100;
         }

         ++field2741;
         return class699.method5095(super.field6263, 2);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2749[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (this.method1765(1)) {
            if (super.field6259.field11012.method22((byte)109) && !class62.method558(super.field6259.field11012.method27(-18033), -124)) {
               super.field6263 = 1;
            }

            if (super.field6259.field10980.method3905(-18033) == 1) {
               super.field6263 = 1;
            }
         }

         if (arg0) {
            ++field2746;
            if (~super.field6263 == -4) {
               super.field6263 = 2;
            }

            if (super.field6263 < 0 || super.field6263 > 3) {
               super.field6263 = this.method23(1);
            }

         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2749[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class216(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(BLjava/lang/String;)Z"
   )
   public static final boolean method1766(byte arg0, String arg1) {
      try {
         if (arg0 != 126) {
            method1763(-54, -103, -65, -55, 11, (byte)-25, -19);
         }

         ++field2743;
         return class728.field10624.containsKey(arg1);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2749[2] + arg0 + ',' + (arg1 != null ? field2749[3] : field2749[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return -71;
         } else {
            ++field2740;
            return 0;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2749[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class216(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 >= -46) {
            this.method1764(-128);
         }

         ++field2739;
         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2749[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1767(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 73);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1768(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 83;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 73;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
