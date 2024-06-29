import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class134 extends class213 {
   @OriginalMember(
      owner = "client!ut",
      name = "I",
      descriptor = "Z"
   )
   private boolean field1739 = true;
   @OriginalMember(
      owner = "client!ut",
      name = "H",
      descriptor = "Z"
   )
   private boolean field1736 = true;
   @OriginalMember(
      owner = "client!ut",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1748 = new String[]{method1130(method1129("\u0000\u0013\u0015E")), method1130(method1129("\u001b\u0012Wjp")), method1130(method1129("\u0015HW\u0007%")), method1130(method1129("\u001b\u0012Wkp")), method1130(method1129("\u001b\u0012Whp")), method1130(method1129("\u001b\u0012Wnp")), method1130(method1129("\u001b\u0012Wcp"))};
   @OriginalMember(
      owner = "client!ut",
      name = "G",
      descriptor = "I"
   )
   public static int field1747 = 0;
   @OriginalMember(
      owner = "client!ut",
      name = "K",
      descriptor = "Z"
   )
   public static boolean field1744 = false;
   @OriginalMember(
      owner = "client!ut",
      name = "E",
      descriptor = "Z"
   )
   public static boolean field1745 = false;
   @OriginalMember(
      owner = "client!ut",
      name = "M",
      descriptor = "F"
   )
   public static float field1740 = 1.0F;
   @OriginalMember(
      owner = "client!ut",
      name = "N",
      descriptor = "I"
   )
   public static int field1737;
   @OriginalMember(
      owner = "client!ut",
      name = "P",
      descriptor = "I"
   )
   public static int field1738;
   @OriginalMember(
      owner = "client!ut",
      name = "L",
      descriptor = "I"
   )
   public static int field1741;
   @OriginalMember(
      owner = "client!ut",
      name = "J",
      descriptor = "I"
   )
   public static int field1742;
   @OriginalMember(
      owner = "client!ut",
      name = "O",
      descriptor = "I"
   )
   public static int field1743;
   @OriginalMember(
      owner = "client!ut",
      name = "F",
      descriptor = "I"
   )
   public static int field1746;

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(Lha;B)V"
   )
   public static final void method1127(class65 arg0, byte arg1) {
      boolean var2 = client.field4273;

      try {
         ++field1741;
         int var3 = 0;
         int var4 = 0;
         if (class775.field11283) {
            var3 = class101.method916(-98);
            var4 = class291.method2190(-84);
         }

         if (arg1 > 21) {
            label105: {
               int var5 = -10660793;
               class38.method291(class378.field5305, -16777216, class441.field6118 + var3, arg0, class67.field776, var5, class604.field8417 - -var4, -2);
               class101.field1310.method630(var5, class604.field8417 + var4 + 14, class551.field7545.method3980(class494.field6787, true), -1, var3 + 3 + class441.field6118, 16656);
               int var6 = class242.field3026.method1581(69) + var3;
               int var7 = class242.field3026.method1572(false) - -var4;
               if (!class107.field1366) {
                  int var8 = 0;
                  class241 var9 = (class241)class280.field3738.method3855(127);
                  if (var2 || var9 != null) {
                     do {
                        int var10 = (class234.field2899 + -1 + -var8) * 16 + var4 + class604.field8417 - -31;
                        class656.method4742(-1, arg0, class604.field8417 + var4, var7, class67.field776, class378.field5305, -256, var10, var9, class441.field6118 + var3, var6, 0);
                        ++var8;
                        var9 = (class241)class280.field3738.method3866((byte)116);
                     } while(var9 != null);
                  }

                  if (!var2) {
                     break label105;
                  }
               }

               int var11 = 0;
               class85 var12 = (class85)class193.field2360.method3964((byte)-128);
               if (var2 || var12 != null) {
                  do {
                     label73: {
                        int var13 = var11 * 16 + class604.field8417 + var4 + 31;
                        ++var11;
                        if (~var12.field1099 != -2) {
                           class133.method1121(-256, var13, class67.field776, arg0, (byte)-91, -1, class378.field5305, var12, var6, class604.field8417 + var4, var7, class441.field6118 + var3);
                           if (!var2) {
                              break label73;
                           }
                        }

                        class656.method4742(-1, arg0, class604.field8417 + var4, var7, class67.field776, class378.field5305, -256, var13, (class241)var12.field1105.field7496.field7453, class441.field6118 - -var3, var6, 0);
                     }

                     var12 = (class85)class193.field2360.method3965(true);
                  } while(var12 != null);
               }

               if (class423.field5947 != null) {
                  int var10000;
                  int var10001;
                  label60: {
                     class38.method291(class746.field10850, -16777216, class46.field535, arg0, class275.field3671, var5, class594.field8244, -2);
                     int var14 = 0;
                     class101.field1310.method630(var5, class594.field8244 + 14, class423.field5947.field1101, -1, class46.field535 + 3, 16656);
                     class241 var15 = (class241)class423.field5947.field1105.method3964((byte)-128);
                     if (var2) {
                        var10000 = var14 * 16 + 31;
                        var10001 = class594.field8244;
                     } else if (var15 == null) {
                        var10000 = -2;
                        var10001 = class46.field535;
                        if (!var2) {
                           break label60;
                        }
                     } else {
                        var10000 = var14 * 16 + 31;
                        var10001 = class594.field8244;
                     }

                     while(true) {
                        int var16 = var10000 + var10001;
                        ++var14;
                        class656.method4742(-1, arg0, class594.field8244, var7, class275.field3671, class746.field10850, -256, var16, var15, class46.field535, var6, 0);
                        var15 = (class241)class423.field5947.field1105.method3965(true);
                        if (var15 == null) {
                           var10000 = -2;
                           var10001 = class46.field535;
                           if (!var2) {
                              break;
                           }
                        } else {
                           var10000 = var14 * 16 + 31;
                           var10001 = class594.field8244;
                        }
                     }
                  }

                  class585.method4201((byte)var10000, var10001, class594.field8244, class746.field10850, class275.field3671);
               }
            }

            class585.method4201((byte)-2, class441.field6118 + var3, class604.field8417 + var4, class378.field5305, class67.field776);
         }
      } catch (RuntimeException var18) {
         throw class534.method3846(var18, field1748[3] + (arg0 != null ? field1748[2] : field1748[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(Ljava/lang/String;ZLda;Ljk;Lha;Z)V"
   )
   public static final void method1128(String arg0, boolean arg1, class66 arg2, class663 arg3, class65 arg4, boolean arg5) {
      try {
         ++field1743;
         boolean var6 = !class432.field6034 || class158.method1285(-31);
         if (var6) {
            label102: {
               if (!class432.field6034 || !var6) {
                  int var7 = arg3.method4808(arg0, 250, (byte)77, (class763[])null);
                  int var8 = 13 * arg3.method4809((byte)-53, (class763[])null, 250, arg0);
                  byte var9 = 4;
                  int var10 = var9 + 6;
                  int var11 = var9 + 6;
                  arg4.method508(-var9 + var10, -var9 + var11, var9 + var9 + var7, var8 - -var9 + var9, -16777216, 0);
                  arg4.method523(-var9 + var10, -var9 + var11, var7 + var9 + var9, var8 + var9 - -var9, -1, 0);
                  arg2.method628((class763[])null, 1, var11, var7, (byte)89, (int[])null, 1, (class516)null, 0, -1, -1, var10, 0, arg0, var8, 0);
                  class480.method3499(var9 + var9 + var8, 0, -var9 + var10, -var9 + var11, var7 + var9 + var9);
                  if (!client.field4273) {
                     break label102;
                  }
               }

               class663 var24 = class601.field8385;
               class66 var23 = arg4.method496(var24, class457.field6261, true);
               int var12 = var24.method4808(arg0, 250, (byte)77, (class763[])null);
               int var13 = var24.method4805((class763[])null, 250, 112, var24.field9459, arg0);
               int var14 = class257.field3288.field3467;
               int var15 = var14 - -4;
               int var16 = var15 * 2 + var12;
               int var17 = var15 * 2 + var13;
               if (~var17 > ~class766.field11056) {
                  var17 = class766.field11056;
               }

               if (var16 < class131.field1656) {
                  var16 = class131.field1656;
               }

               int var18 = class348.field4998.method1433(var16, class698.field10190, 1) + class135.field1753;
               int var19 = class384.field5381.method1325(var17, class420.field5892, 8599) - -class186.field2280;
               if (class775.field11283) {
                  var18 += class101.method916(-87);
                  var19 += class291.method2190(-121);
               }

               arg4.method549(class188.field2306, false).method2127(class622.field8692.field3467 + var18, class622.field8692.field3469 + var19, -(class622.field8692.field3467 * 2) + var16, -(class622.field8692.field3469 * 2) + var17, 1, 0, 0);
               arg4.method549(class622.field8692, true).method5482(var18, var19);
               class622.field8692.method2045();
               arg4.method549(class622.field8692, true).method5482(var16 + var18 + -var14, var19);
               class622.field8692.method2051();
               arg4.method549(class622.field8692, true).method5482(var18 - var14 + var16, var17 + var19 - var14);
               class622.field8692.method2045();
               arg4.method549(class622.field8692, true).method5482(var18, var17 + var19 + -var14);
               class622.field8692.method2051();
               arg4.method549(class257.field3288, true).method5484(var18, class622.field8692.field3469 + var19, var14, -(class622.field8692.field3469 * 2) + var17);
               class257.field3288.method2052();
               arg4.method549(class257.field3288, true).method5484(class622.field8692.field3467 + var18, var19, -(class622.field8692.field3467 * 2) + var16, var14);
               class257.field3288.method2052();
               arg4.method549(class257.field3288, true).method5484(-var14 + var16 + var18, var19 - -class622.field8692.field3469, var14, -(class622.field8692.field3469 * 2) + var17);
               class257.field3288.method2052();
               arg4.method549(class257.field3288, true).method5484(class622.field8692.field3467 + var18, var17 - var14 + var19, -(class622.field8692.field3467 * 2) + var16, var14);
               class257.field3288.method2052();
               var23.method628((class763[])null, 1, var19 - -var15, var16 - var15 * 2, (byte)114, (int[])null, 1, (class516)null, 0, class252.field3201 | -16777216, -1, var15 + var18, 0, arg0, var17 - var15 * 2, 0);
               class480.method3499(var17, 0, var18, var19, var16);
            }

            if (arg1) {
               method1127((class65)null, (byte)-26);
            }

            if (arg5) {
               try {
                  if (!class775.field11283) {
                     arg4.method548(false);
                  } else {
                     class530.method3828((byte)75);
                  }
               } catch (class265 var21) {
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class534.method3846(var22, field1748[1] + (arg0 != null ? field1748[2] : field1748[0]) + ',' + arg1 + ',' + (arg2 != null ? field1748[2] : field1748[0]) + ',' + (arg3 != null ? field1748[2] : field1748[0]) + ',' + (arg4 != null ? field1748[2] : field1748[0]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(IB)[[I"
   )
   public final int[][] method212(int arg0, byte arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1737;
         int[][] var4 = super.field2644.method3543(-2, arg0);
         if (super.field2644.field6719) {
            label70: {
               int[][] var5 = this.method1615(true, this.field1736 ? class40.field468 - arg0 : arg0, 0);
               int[] var6 = var5[0];
               int[] var7 = var5[1];
               int[] var8 = var5[2];
               int[] var9 = var4[0];
               int[] var10 = var4[1];
               int[] var11 = var4[2];
               if (!this.field1739) {
                  int var12 = 0;
                  if (var3) {
                     var9[var12] = var6[var12];
                     var10[var12] = var7[var12];
                     var11[var12] = var8[var12];
                     ++var12;
                  }

                  while(true) {
                     while(~class576.field7916 < ~var12) {
                        var9[var12] = var6[var12];
                        var10[var12] = var7[var12];
                        var11[var12] = var8[var12];
                        ++var12;
                     }

                     if (!var3) {
                        if (!var3) {
                           break label70;
                        }
                        break;
                     }

                     ++var12;
                  }
               }

               int var13 = 0;
               if (var3 || ~class576.field7916 < ~var13) {
                  do {
                     var9[var13] = var6[-var13 + class676.field9924];
                     var10[var13] = var7[class676.field9924 - var13];
                     var11[var13] = var8[-var13 + class676.field9924];
                     ++var13;
                  } while(~class576.field7916 < ~var13);
               }
            }
         }

         if (arg1 < 26) {
            method1128((String)null, true, (class66)null, (class663)null, (class65)null, true);
         }

         return var4;
      } catch (RuntimeException var15) {
         throw class534.method3846(var15, field1748[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method215(int arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         ++field1738;
         int[] var4 = super.field2650.method3769(arg0, -4);
         if (arg1 != 2064866508) {
            return null;
         } else {
            if (super.field2650.field7140) {
               int[] var5 = this.method1619((byte)117, !this.field1736 ? arg0 : -arg0 + class40.field468, 0);
               if (!this.field1739) {
                  class714.method5199(var5, 0, var4, 0, class576.field7916);
                  if (!var3) {
                     return var4;
                  }
               }

               int var6 = 0;
               if (var3 || ~var6 > ~class576.field7916) {
                  do {
                     var4[var6] = var5[-var6 + class676.field9924];
                     ++var6;
                  } while(~var6 > ~class576.field7916);
               }
            }

            return var4;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field1748[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "a",
      descriptor = "(Lwm;II)V"
   )
   public final void method217(class594 arg0, int arg1, int arg2) {
      try {
         ++field1742;
         int var4 = 69 / ((arg1 - 68) / 48);
         if (arg2 != 0) {
            if (~arg2 == -2) {
               this.field1736 = ~arg0.method4288((byte)67) == -2;
               return;
            }

            if (~arg2 != -3) {
               return;
            }

            if (!client.field4273) {
               super.field2645 = arg0.method4288((byte)98) == 1;
               return;
            }
         }

         this.field1739 = arg0.method4288((byte)88) == 1;
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field1748[5] + (arg0 != null ? field1748[2] : field1748[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ut",
      name = "<init>",
      descriptor = "()V"
   )
   public class134() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1129(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ut",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1130(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 102;
            break;
         case 2:
            var10005 = 121;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
