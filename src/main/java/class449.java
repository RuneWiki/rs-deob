import java.awt.Color;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class449 extends class567 {
   @OriginalMember(
      owner = "client!hea",
      name = "q",
      descriptor = "Z"
   )
   private boolean field6207 = false;
   @OriginalMember(
      owner = "client!hea",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6213 = new String[]{method3334(method3333("8\rC\u0011")), method3334(method3333("-V\u0001S^")), method3334(method3333(">\u001dNSa~")), method3334(method3333(">\u001dNSf~")), method3334(method3333(">\u001dNSe~")), method3334(method3333(">\u001dNSi~")), method3334(method3333(">\u001dNSg~")), method3334(method3333(">\u001dNS`~")), method3334(method3333(">\u001dNSk~")), method3334(method3333(">\u001dNSd~")), method3334(method3333(">\u001dNSb~"))};
   @OriginalMember(
      owner = "client!hea",
      name = "x",
      descriptor = "I"
   )
   public static int field6210 = 0;
   @OriginalMember(
      owner = "client!hea",
      name = "w",
      descriptor = "Lou;"
   )
   public static class635 field6203 = new class635();
   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field6211 = new int[13];
   @OriginalMember(
      owner = "client!hea",
      name = "r",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field6212 = new BigInteger(method3334(method3333("7@\u001bH\u0017eHJJ\u0012b\u001dI\u001c\u00155IN\u001e\u001aaN\u0016D\u0014oO\u001c\u001e\u00170O\u001dL\u00110\u001e\u001e\u001c\u001bdNIJEc\u001b\u001a\u001f\u0015dNNHB2\u0019I\u0018\u001a2M\u0019KGe\u001cLKF`N\u001bHAe\u001d\u0018\u001cFaHKKGeN\u0018\u001b\u001ad\u001d\u001aIA4H\u001bE@`LM\u001eAb\u001a\u0017I\u001a5O\u001cD\u0014aA\u0019O\u0011n\u001c\u0017\u001fF3@\u001dH\u0015c@\u0018\u0019Bb@\u001d\u001fF5\u001c\u001eK\u001a4\u001b\u001dIE3\u0019IE@c\u001d\u0016\u001e\u00174N\u001c\u0018@5ML\u001c\u0015fH\u0018KG3\u001eJ\u001f\u0013`K\u001cL\u00142MLOG0\u0019\u001aJ\u00115HL\u0019\u00153H\u001c\u001cF4O\u001e\u001f\u0012eIL\u001bAoMK\u001f\u0015a\u001c\u0018OA0I\u001aN\u00152I\u001c\u001eBf\u0019\u001cI\u0016`\u001a\u001bE\u001af\u001dI\u001e\u0017`\u001c\u0016N\u00154O\u001cDA4N\u001a\u0019\u0012dMJLBc\u001e\u001eOFbN\u001bD\u001ao\u001c\u0017\u0019\u001ac\u0019N\u001b\u00113\u001a\u0017\u001eEfHJ\u001fEn@JL\u0017cNJEAaNIJ\u00152\u001eJJ\u0016o@\u001cL\u0016bN\u001bLEnHLI@nIM\u001b\u0010eH\u001d\u001c\u00147\u001cNK\u00105KN\u0018\u0010nH\u0019M\u001b0A\u001cI\u0015o\u001cNO\u00167ANE\u0010e\u0019\u001cM@4I\u001bIF7JM\u001eFoM\u0017\u0018\u0011nLKH\u001a4\u0019\u0019NFa\u001b\u0019DG0J\u001b\u0018BfL\u0016\u001bBgL\u001f\u0018\u0016b\u001d\u001a\u001fG4@M\u001f\u001aeKIM\u0015fJK\u0018Fo@\u001c\u001b\u00153\u001dIJ\u001bc\u001bMDBa@JI\u0012dK\u0016E\u0010`\u0019\u001dJ\u00145\u001b\u001e\u0019Eb@\u0019E@2NM\u0019@nA\u001aE@aKM\u0019Be\u001c\u001a\u001bGc\u001c\u001b\u001fA7I\u0019M\u0011`\u0019\u0019\u001e\u001b3I\u001b\u001eFnKK\u0018\u00125\u001c\u001a\u0018\u0016`\u001b\u001aH\u00155II\u001e\u001b`\u0019KH\u00133I\u0019KE`O\u001eKGfO\u001b\u001cEeIME\u0013g\u001eK\u0018Ed\u001d\u001eO\u0013g\u001dLD\u0012cNIL\u0011fKJN\u0013a\u001d\u001bO\u0016g@\u001eO\u00164\u001cNI\u0016gL\u0016\u001e\u0012nI\u001cO\u0012oINNB0HJ\u0018\u0017`I\u001fKE2AKHF`\u001d\u001cN\u0015fM\u001c\u001e\u0015fL\u0017OAb\u0019\u0019M\u00103O\u001e\u001eAgL\u0019NB7\u001e\u0018M\u0010nA\u001fME3LIK\u0012f@\u001fM\u0010cM\u001dJE7\u001c\u0019\u001cAe\u001b\u001eO@n\u001b\u001fLE7L\u001dKE3\u001b\u0017I@7\u001aIJ\u0016`\u001c\u0019LE2\u001eLH\u00103\u001b\u0019K\u0014nM\u001dDB3\u001bK\u001e\u0011f\u001d\u0016D@aO\u0019O\u0017fL\u0016EFgJ\u0017K\u0010nO\u001e\u001f\u001a`INE\u0010fKJ\u001e\u0013aALDE2\u001cLIBaO\u0017\u001eB7NMK\u0010g\u0019\u001aL\u0013dHNL\u00135A\u0017LAf@\u0016D\u001a3M\u0017\u001cBcA\u0019O@7O\u0016MF`H\u0017D\u0014bNLIB5\u001bLHGdN\u001e\u0019G3O\u0017\u0019BnM\u0019K\u0017c\u001b\u0016K\u0015`\u001e\u0017H\u00127KK\u001fBf\u001c\u0017\u001b\u00130J\u0017M@2OLEF7\u001d\u0016\u001f@b\u001e\u0016\u0019B7\u001e\u0017\u001e\u00137\u001d\u001aE\u0016d\u001cMM\u00127HK\u001c\u001a2\u001b\u001b\u0018F5\u001e\u001bI\u001an\u001b\u0016LA5LMM\u0017`\u001b\u001aIB2\u001a\u0016\u0018@cALLAnMLI\u001bo\u001b\u0016K\u00175\u001dI\u001c@aI\u001c\u001b\u00177M\u0016IFcA\u001bE\u001bn\u001b\u0016L\u0013n\u001d\u001aI\u00115JK\u001c\u0016bLIDAg\u001d\u0017N\u0014g\u001e\u001d\u001b")), 16);
   @OriginalMember(
      owner = "client!hea",
      name = "y",
      descriptor = "I"
   )
   public static int field6200;
   @OriginalMember(
      owner = "client!hea",
      name = "o",
      descriptor = "I"
   )
   public static int field6201;
   @OriginalMember(
      owner = "client!hea",
      name = "v",
      descriptor = "I"
   )
   public static int field6202;
   @OriginalMember(
      owner = "client!hea",
      name = "u",
      descriptor = "I"
   )
   public static int field6204;
   @OriginalMember(
      owner = "client!hea",
      name = "p",
      descriptor = "I"
   )
   public static int field6205;
   @OriginalMember(
      owner = "client!hea",
      name = "t",
      descriptor = "I"
   )
   public static int field6206;
   @OriginalMember(
      owner = "client!hea",
      name = "s",
      descriptor = "I"
   )
   public static int field6208;
   @OriginalMember(
      owner = "client!hea",
      name = "A",
      descriptor = "I"
   )
   public static int field6209;

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         if (arg0 > -64) {
            return false;
         } else {
            ++field6208;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6213[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         ++field6201;
         if (arg0 != -1309) {
            field6210 = 85;
         }

         super.field7728.method2587(class535.field7314, arg0 + 1375, field6203);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6213[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "h",
      descriptor = "(I)V"
   )
   public static final void method3330(int arg0) {
      try {
         class42.field495.method3875(1);
         ++field6206;
         if (arg0 != -20052) {
            field6211 = null;
         }

         class242.field3026.method1575(13361);
         class15.field197.method810(false);
         class204.field2515.setBackground(Color.black);
         class640.field9018 = -1;
         class42.field495 = class484.method3522(class204.field2515, false);
         class242.field3026 = class781.method5599(class204.field2515, true, 0);
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6213[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      try {
         label20: {
            if (!this.field6207) {
               super.field7728.method2592(0, class550.field7513, arg0);
               if (!client.field4273) {
                  break label20;
               }
            }

            super.field7728.method2506(1, arg0 + -42);
            super.field7728.method2583(class346.field4961, (byte)42);
            super.field7728.method2587(field6203, 39, field6203);
            super.field7728.method2547(2, class206.field2525, 0);
            super.field7728.method2592(0, class550.field7513, 0);
            super.field7728.method2524((byte)73);
            super.field7728.method2581((class159)null, arg0 + 18);
            super.field7728.method2506(0, -62);
            this.field6207 = false;
         }

         ++field6205;
         super.field7728.method2587(field6203, arg0 + -109, field6203);
         if (arg0 != 0) {
            this.method1(-107, false);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6213[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(IIIILfg;IIIIII)Z"
   )
   public static final boolean method3331(int arg0, int arg1, int arg2, int arg3, class138 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var11 = client.field4273;

      try {
         ++field6204;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -34 / ((26 - arg6) / 54);
         int var17 = -var14 + arg0;
         class97.field1273[var14][var15] = 99;
         int var18 = -var15 + arg2;
         class742.field10808[var14][var15] = 0;
         byte var19 = 0;
         class205.field2519[var19] = arg0;
         int var20 = 0;
         byte var10001 = var19;
         int var29 = var19 + 1;
         class257.field3285[var10001] = arg2;
         int[][] var21 = arg4.field1807;
         if (!var11 && ~var29 == ~var20) {
            class620.field8668 = arg0;
            class154.field1995 = arg2;
            return false;
         } else {
            int var12;
            int var13;
            label226:
            do {
               var12 = class205.field2519[var20];
               var13 = class257.field3285[var20];
               var20 = 4095 & var20 - -1;
               int var22 = -var17 + var12;
               int var23 = var13 - var18;
               int var24 = var12 - arg4.field1790;
               int var25 = -arg4.field1785 + var13;
               int var26 = arg10;
               int var10000 = arg10;
               byte var30 = -4;

               do {
                  if (var10000 != var30) {
                     if (var26 != -3) {
                        if (~var26 != 1) {
                           if (~var26 != 0) {
                              label213: {
                                 if (~var26 != -1 && ~var26 != -2 && ~var26 != -3 && var26 != 3) {
                                    if (~var26 != -10) {
                                       if (arg4.method1165(arg9, 2, arg5, var13, -1, arg10, var12, arg3)) {
                                          class154.field1995 = var13;
                                          class620.field8668 = var12;
                                          return true;
                                       }
                                       break label213;
                                    }

                                    if (var11) {
                                       if (arg3 == var12 && ~arg5 == ~var13) {
                                          class154.field1995 = var13;
                                          class620.field8668 = var12;
                                          return true;
                                       }
                                       break label213;
                                    }
                                 }

                                 if (arg4.method1148((byte)121, arg9, arg10, var13, 2, var12, arg5, arg3)) {
                                    class154.field1995 = var13;
                                    class620.field8668 = var12;
                                    return true;
                                 }
                              }
                           } else if (arg4.method1164(var13, arg8, arg1, arg3, 2, arg7, arg5, -29800, var12)) {
                              class154.field1995 = var13;
                              class620.field8668 = var12;
                              return true;
                           }
                        } else if (arg4.method1152(var13, 2, 128, 2, arg3, arg7, arg1, arg8, var12, arg5)) {
                           class620.field8668 = var12;
                           class154.field1995 = var13;
                           return true;
                        }
                     } else if (class535.method3850(arg1, 2, var13, 2, arg3, var12, arg5, 2, arg8)) {
                        class620.field8668 = var12;
                        class154.field1995 = var13;
                        return true;
                     }
                  } else if (arg3 == var12 && ~arg5 == ~var13) {
                     class154.field1995 = var13;
                     class620.field8668 = var12;
                     return true;
                  }

                  var26 = class742.field10808[var22][var23] + 1;
                  if (var22 > 0 && class97.field1273[var22 - 1][var23] == 0 && ~(1134821376 & var21[var24 + -1][var25]) == -1 && (1310982144 & var21[var24 + -1][var25 + 1]) == 0) {
                     class205.field2519[var29] = var12 + -1;
                     class257.field3285[var29] = var13;
                     var29 = 4095 & var29 + 1;
                     class97.field1273[var22 - 1][var23] = 2;
                     class742.field10808[var22 - 1][var23] = var26;
                  }

                  if (var22 < 126 && class97.field1273[var22 - -1][var23] == 0 && (var21[var24 - -2][var25] & 1625554944) == 0 && (2015625216 & var21[var24 + 2][var25 + 1]) == 0) {
                     class205.field2519[var29] = var12 - -1;
                     class257.field3285[var29] = var13;
                     class97.field1273[var22 + 1][var23] = 8;
                     var29 = var29 + 1 & 4095;
                     class742.field10808[var22 - -1][var23] = var26;
                  }

                  if (~var23 < -1 && ~class97.field1273[var22][var23 + -1] == -1 && ~(var21[var24][var25 + -1] & 1134821376) == -1 && (1625554944 & var21[var24 - -1][var25 - 1]) == 0) {
                     class205.field2519[var29] = var12;
                     class257.field3285[var29] = var13 + -1;
                     class97.field1273[var22][var23 - 1] = 1;
                     var29 = var29 + 1 & 4095;
                     class742.field10808[var22][var23 + -1] = var26;
                  }

                  if (var23 < 126 && class97.field1273[var22][var23 - -1] == 0 && ~(1310982144 & var21[var24][var25 + 2]) == -1 && (var21[var24 + 1][var25 + 2] & 2015625216) == 0) {
                     class205.field2519[var29] = var12;
                     class257.field3285[var29] = var13 + 1;
                     class97.field1273[var22][var23 - -1] = 4;
                     var29 = var29 - -1 & 4095;
                     class742.field10808[var22][var23 + 1] = var26;
                  }

                  if (var22 > 0 && var23 > 0 && class97.field1273[var22 - 1][var23 + -1] == 0 && (var21[var24 - 1][var25] & 1336147968) == 0 && ~(1134821376 & var21[var24 + -1][var25 + -1]) == -1 && (var21[var24][var25 - 1] & 1675886592) == 0) {
                     class205.field2519[var29] = var12 - 1;
                     class257.field3285[var29] = var13 + -1;
                     var29 = 4095 & var29 + 1;
                     class97.field1273[var22 - 1][var23 + -1] = 3;
                     class742.field10808[var22 + -1][var23 + -1] = var26;
                  }

                  if (~var22 > -127 && ~var23 < -1 && class97.field1273[var22 - -1][var23 + -1] == 0 && ~(1675886592 & var21[var24 - -1][var25 + -1]) == -1 && (1625554944 & var21[var24 + 2][var25 + -1]) == 0 && ~(var21[var24 + 2][var25] & 2028208128) == -1) {
                     class205.field2519[var29] = var12 + 1;
                     class257.field3285[var29] = var13 + -1;
                     var29 = 4095 & var29 + 1;
                     class97.field1273[var22 - -1][var23 - 1] = 9;
                     class742.field10808[var22 + 1][var23 + -1] = var26;
                  }

                  if (~var22 < -1 && var23 < 126 && class97.field1273[var22 - 1][var23 + 1] == 0 && (var21[var24 + -1][var25 + 1] & 1336147968) == 0 && (var21[var24 + -1][var25 - -2] & 1310982144) == 0 && ~(2116288512 & var21[var24][var25 + 2]) == -1) {
                     class205.field2519[var29] = var12 + -1;
                     class257.field3285[var29] = var13 - -1;
                     class97.field1273[var22 - 1][var23 + 1] = 6;
                     var29 = 4095 & var29 + 1;
                     class742.field10808[var22 + -1][var23 - -1] = var26;
                  }

                  if (~var22 <= -127) {
                     continue label226;
                  }

                  var10000 = var23;
                  var30 = 126;
               } while(var11);

               if (var23 < 126 && ~class97.field1273[var22 + 1][var23 + 1] == -1 && (var21[var24 + 1][var25 + 2] & 2116288512) == 0 && (var21[var24 + 2][var25 + 2] & 2015625216) == 0 && ~(var21[var24 - -2][var25 + 1] & 2028208128) == -1) {
                  class205.field2519[var29] = var12 + 1;
                  class257.field3285[var29] = var13 - -1;
                  var29 = var29 + 1 & 4095;
                  class97.field1273[var22 - -1][var23 + 1] = 12;
                  class742.field10808[var22 + 1][var23 + 1] = var26;
               }
            } while(~var29 != ~var20);

            class620.field8668 = var12;
            class154.field1995 = var13;
            return false;
         }
      } catch (RuntimeException var28) {
         throw class534.method3846(var28, field6213[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field6213[1] : field6213[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class449(class327 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         int var4 = 83 / ((arg1 - 63) / 58);
         ++field6202;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6213[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         if (arg0) {
            super.field7728.method2581(arg1, 95);
            ++field6200;
            super.field7728.method2593(0, arg2);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field6213[2] + arg0 + ',' + (arg1 != null ? field6213[1] : field6213[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3332(boolean arg0) {
      try {
         field6203 = null;
         if (!arg0) {
            method3331(5, 33, -30, -96, (class138)null, -10, 45, -97, -40, 72, 59);
         }

         field6211 = null;
         field6212 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6213[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      try {
         label22: {
            ++field6209;
            class142 var3 = super.field7728.method2492((byte)-26);
            if (var3 != null && arg0) {
               super.field7728.method2506(1, arg1 + -10210);
               super.field7728.method2581(var3, -113);
               super.field7728.method2583(class585.field8030, (byte)-107);
               super.field7728.method2506(1, 113);
               super.field7728.method2587(class535.field7314, 54, class581.field7982);
               super.field7728.method2517(class529.field7261, arg1 ^ -10287, 2, true, false);
               super.field7728.method2592(0, class544.field7429, 0);
               class251 var4 = super.field7728.method2527(-120);
               var4.method1893(super.field7728.method2579((byte)123), 102);
               super.field7728.method2503((byte)10, class517.field7092);
               super.field7728.method2506(0, 123);
               this.field6207 = true;
               if (!client.field4273) {
                  break label22;
               }
            }

            super.field7728.method2592(0, class544.field7429, arg1 ^ 10286);
         }

         if (arg1 != 10286) {
            field6210 = -28;
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6213[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3333(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3334(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 125;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
