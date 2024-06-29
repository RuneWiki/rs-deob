import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class414 extends class264 {
   @OriginalMember(
      owner = "client!tm",
      name = "O",
      descriptor = "I"
   )
   private int field5959 = 0;
   @OriginalMember(
      owner = "client!tm",
      name = "N",
      descriptor = "I"
   )
   private int field5969 = 8192;
   @OriginalMember(
      owner = "client!tm",
      name = "Q",
      descriptor = "I"
   )
   private int field5967 = 4096;
   @OriginalMember(
      owner = "client!tm",
      name = "K",
      descriptor = "I"
   )
   private int field5960 = 2048;
   @OriginalMember(
      owner = "client!tm",
      name = "W",
      descriptor = "I"
   )
   private int field5961 = 2048;
   @OriginalMember(
      owner = "client!tm",
      name = "U",
      descriptor = "I"
   )
   private int field5962 = 12288;
   @OriginalMember(
      owner = "client!tm",
      name = "G",
      descriptor = "I"
   )
   private int field5973 = 0;
   @OriginalMember(
      owner = "client!tm",
      name = "X",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5976 = new String[]{method3102(method3101(")3<H")), method3102(method3101("<h~\nT")), method3102(method3101("3+~g\u0001")), method3102(method3101("3+~`\u0001")), method3102(method3101("3+~o\u0001")), method3102(method3101("3+~a\u0001")), method3102(method3101("3+~b\u0001")), method3102(method3101("3+~f\u0001")), method3102(method3101("3+~e\u0001")), method3102(method3101("3+~l\u0001"))};
   @OriginalMember(
      owner = "client!tm",
      name = "J",
      descriptor = "I"
   )
   public static int field5972 = 0;
   @OriginalMember(
      owner = "client!tm",
      name = "I",
      descriptor = "Z"
   )
   public static volatile boolean field5975 = true;
   @OriginalMember(
      owner = "client!tm",
      name = "R",
      descriptor = "I"
   )
   public static int field5958;
   @OriginalMember(
      owner = "client!tm",
      name = "S",
      descriptor = "I"
   )
   public static int field5963;
   @OriginalMember(
      owner = "client!tm",
      name = "F",
      descriptor = "I"
   )
   public static int field5965;
   @OriginalMember(
      owner = "client!tm",
      name = "P",
      descriptor = "I"
   )
   public static int field5966;
   @OriginalMember(
      owner = "client!tm",
      name = "L",
      descriptor = "I"
   )
   public static int field5968;
   @OriginalMember(
      owner = "client!tm",
      name = "V",
      descriptor = "I"
   )
   public static int field5970;
   @OriginalMember(
      owner = "client!tm",
      name = "T",
      descriptor = "I"
   )
   public static int field5971;
   @OriginalMember(
      owner = "client!tm",
      name = "H",
      descriptor = "I"
   )
   public static int field5974;
   @OriginalMember(
      owner = "client!tm",
      name = "M",
      descriptor = "[I"
   )
   public static int[] field5964;

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(Llia;B)V"
   )
   public static final void method3096(class506 param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method413(int arg0) {
      try {
         class69.method644(693);
         if (arg0 >= 49) {
            ++field5963;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field5976[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(IIB)Z"
   )
   private final boolean method3097(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 != 118) {
            return false;
         } else {
            ++field5971;
            int var4 = (-arg0 + arg1) * this.field5962 >> 12;
            int var5 = class290.field4017[(1046432 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field5962;
            int var7 = (var6 << 12) / this.field5969;
            int var8 = this.field5967 * var7 >> 12;
            return ~var8 < ~(arg0 + arg1) && ~(arg0 + arg1) < ~(-var8);
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5976[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(IZIIII[I[IZI[IB[I[[[BII[IB)V"
   )
   public static final void method3098(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, boolean arg8, int arg9, int[] arg10, byte arg11, int[] arg12, byte[][][] arg13, int arg14, int arg15, int[] arg16, byte arg17) {
      boolean var18 = client.field4360;

      try {
         if (arg11 != -88) {
            method3098(-99, true, -43, -109, -2, 3, (int[])null, (int[])null, false, 30, (int[])null, (byte)-52, (int[])null, (byte[][][])null, 65, -108, (int[])null, (byte)120);
         }

         ++field5966;
         if (~class614.field9025 != 0) {
            int[] var19 = class50.field660.method558();
            int var20 = var19[0];
            int var21 = var19[1];
            int var22 = var19[2];
            int var23 = var19[3];
            int var24 = var22;
            int var25 = var23;
            if (class614.field9025 == 1) {
               var24 = (int)((double)class236.field3290 * (double)var22 / (double)class790.field11596);
               var25 = (int)((double)class236.field3290 * (double)var23 / (double)class790.field11596);
            }

            if (!class171.field2384) {
               label417: {
                  if (class614.field9025 == 1) {
                     class517.method3765(0);
                  }

                  int var26 = -class445.field6339 + arg2;
                  int var27 = -class578.field8534 + arg0;
                  int var28 = -class556.field7985 + arg5;
                  int var29 = (int)(((double)var28 * class429.field6140 + (double)var26 * class23.field267 + (double)var27 * class160.field2286) * (double)var24 / (double)arg15);
                  int var30 = (int)(((double)var28 * class517.field7456 + (double)var26 * class170.field2375 + (double)var27 * class385.field5595) * (double)var25 / (double)arg15);
                  double var31 = (double)var28 * class426.field6116 + (double)var26 * class347.field4691 + (double)var27 * class554.field7936;
                  int var33 = -class598.field8798 + var29 + class241.field3354;
                  int var34 = class756.field11203 - class366.field5019 + var30;
                  int var35 = class392.field5678 + var33;
                  int var36 = class236.field3290 + var34;
                  if (var33 >= 0 && var34 >= 0 && ~var35 >= ~class752.field11122 && ~var36 >= ~class790.field11596 || ~class614.field9025 == -3) {
                     if (~class614.field9025 == -3) {
                        class384.field5591 = -var31;
                     }

                     class136.field1735 = var33;
                     class532.field7589 = var34;
                     if (!var18) {
                        break label417;
                     }
                  }

                  if (~var35 < -1 && ~var36 < -1 && class752.field11122 > var33 && class790.field11596 > var34) {
                     int var39;
                     int var40;
                     int var41;
                     int var42;
                     double var43;
                     label334: {
                        int var37 = -class241.field3354 + var33;
                        int var38 = -class756.field11203 + var34;
                        var39 = 0;
                        var40 = 0;
                        var41 = 0;
                        var42 = 0;
                        var43 = 0.0D;
                        if (class614.field9025 != 0) {
                           if (class614.field9025 != 1) {
                              break label334;
                           }

                           var42 = var38 / class88.field1146;
                           var41 = var37 / class347.field4686;
                           var40 = class88.field1146 * var42;
                           var39 = class347.field4686 * var41;
                           var43 = (class384.field5591 + var31) * (double)(var37 * var39 + var38 * var40) / (double)(var37 * var37 + var38 * var38);
                           if (!var18) {
                              break label334;
                           }
                        }

                        var40 = var38;
                        var39 = var37;
                        var43 = class384.field5591 + var31;
                     }

                     double var45;
                     int var47;
                     int var48;
                     int var49;
                     int var50;
                     int var51;
                     int var52;
                     int var53;
                     int var54;
                     int var55;
                     label367: {
                        var45 = -var43;
                        var47 = 0;
                        var48 = 0;
                        var49 = 0;
                        var50 = 0;
                        var51 = 0;
                        if (var39 < 0) {
                           var52 = -var39;
                           var53 = class752.field11122 - -var39;
                           var54 = 0;
                           var55 = var52;
                           if (class614.field9025 != 1) {
                              break label367;
                           }

                           var49 = 0;
                           var51 = -var41;
                           if (!var18) {
                              break label367;
                           }
                        }

                        var53 = -var39 + class752.field11122;
                        var52 = 0;
                        var55 = var39;
                        if (~class614.field9025 == -2) {
                           var51 = var41;
                           var49 = -var41 + class50.field658;
                        }

                        var54 = var53;
                     }

                     int var56;
                     int var57;
                     int var58;
                     int var59;
                     int var60;
                     int var61;
                     int var62;
                     label368: {
                        var56 = 0;
                        if (~var40 > -1) {
                           var57 = 0;
                           var58 = class790.field11596 + var40;
                           var59 = -var40;
                           var60 = var59;
                           if (~class614.field9025 == -2) {
                              var48 = -var42;
                              var47 = 0;
                              var50 = var48;
                              var56 = class131.field1670 + var42;
                           }

                           var61 = var59;
                           var62 = var58;
                           if (!var18) {
                              break label368;
                           }
                        }

                        var59 = 0;
                        var58 = class790.field11596 - var40;
                        if (class614.field9025 == 1) {
                           var48 = var42;
                           var47 = -var42 + class131.field1670;
                           var50 = 0;
                           var56 = var47;
                        }

                        var62 = var58;
                        var60 = var40;
                        var61 = 0;
                        var57 = var58;
                     }

                     class762 var63 = class790.field11583.field3628;
                     class623 var64 = (class623)var63.method5529((byte)-42);
                     if (var18 || var64 != null) {
                        do {
                           class307[] var65 = var64.field9164;
                           boolean var66 = true;
                           int var67 = 0;
                           if (var18 || ~var65.length < ~var67) {
                              do {
                                 class307 var68 = var65[var67];
                                 int var69 = var68.field4194;
                                 int var70 = var68.field4193;
                                 int var71 = var68.field4196;
                                 int var72 = var68.field4192;
                                 int var73;
                                 var68.field4192 = var73 = -var40 + var72;
                                 int var74 = var68.field4195;
                                 int var75;
                                 var68.field4194 = var75 = -var39 + var69;
                                 int var76;
                                 var68.field4193 = var76 = -var40 + var70;
                                 int var77;
                                 var68.field4196 = var77 = -var39 + var71;
                                 if (var66) {
                                    int var78 = -var74 + (~var75 > ~var77 ? var75 : var77);
                                    if (var78 <= class752.field11122) {
                                       int var79 = -var74 + (var73 <= var76 ? var73 : var76);
                                       if (~class790.field11596 <= ~var79) {
                                          int var80 = (var75 < var77 ? var77 : var75) + var74;
                                          if (~var80 <= -1) {
                                             int var81 = var74 + (var73 <= var76 ? var76 : var73);
                                             if (var81 >= 0) {
                                                var66 = false;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 ++var67;
                              } while(~var65.length < ~var67);
                           }

                           if (var66) {
                              var64.method12((byte)50);
                              class198.method1565(false, var64);
                           }

                           var64 = (class623)var63.method5527((byte)45);
                        } while(var64 != null);
                     }

                     if (~class614.field9025 == -1) {
                        class50.field660.method556(class106.field1344);
                     }

                     label293: {
                        class50.field660.method521(-var39, -var40);
                        class50.field660.method612(var52, var59, var53, var58, var45);
                        class350.method2551(11059, class384.field5591 + var45);
                        class475.field6833 = class384.field5591 + var45;
                        if (~class614.field9025 == -2) {
                           class71.field867 = var25;
                           class788.field11566 = var20 - (class598.field8798 + var39);
                           class223.field3172 = var24;
                           class237.field3308 = -var40 + var21 + -class366.field5019;
                           class50.field660.method492(class788.field11566, class237.field3308, class223.field3172, class71.field867);
                           if (!var18) {
                              break label293;
                           }
                        }

                        class71.field867 = var25;
                        class223.field3172 = var24;
                        class237.field3308 = -class366.field5019 + var21 + class756.field11203 + -var40;
                        class788.field11566 = var20 - -class241.field3354 + -var39 + -class598.field8798;
                        class50.field660.method492(class788.field11566, class237.field3308, class223.field3172, class71.field867);
                     }

                     class679.method4952(class790.field11583);
                     if (~var60 < -1) {
                        class50.field660.method592(0, var57, class752.field11122, var57 + var60);
                        class50.field660.method523();
                        class50.field660.method495(class649.field9476);
                        class34.method300(arg3, arg2, arg0, arg5, arg13, arg10, arg7, arg16, arg12, arg6, arg4, arg17, arg9, arg14, arg1, arg8, arg15, 1, false);
                     }

                     if (var55 > 0) {
                        class50.field660.method592(var54, var61, var54 - -var55, var61 - -var62);
                        class50.field660.method523();
                        class50.field660.method495(class649.field9476);
                        class34.method300(arg3, arg2, arg0, arg5, arg13, arg10, arg7, arg16, arg12, arg6, arg4, arg17, arg9, arg14, arg1, arg8, arg15, 1, false);
                     }

                     class50.field660.method574();
                     class777.method5598();
                     if (class614.field9025 == 0) {
                        class50.field660.method549();
                     }

                     class366.field5019 += var40;
                     class598.field8798 += var39;
                     class384.field5591 += var45;
                     class532.field7589 = class756.field11203 + var30 + -class366.field5019;
                     class136.field1735 = class241.field3354 + var29 + -class598.field8798;
                     if (class614.field9025 != 1) {
                        break label417;
                     }

                     class503.field7302 += var42;
                     class360.field4901 += var41;
                     int var82 = 0;
                     if (var18 || class131.field1670 > var82) {
                        do {
                           int var83 = class700.method5086(var82 - -class503.field7302, (byte)-77, class131.field1670) * class50.field658;
                           int var84 = 0;
                           if (var18 || var84 < class50.field658) {
                              do {
                                 int var85 = var83 - -class700.method5086(class360.field4901 + var84, (byte)-49, class50.field658);
                                 boolean var86 = ~var47 >= ~var82 && ~var82 > ~(var47 - -var48) ? true : (~var82 <= ~var50 ? (var82 < var50 + var56 ? (var49 <= var84 ? var49 + var51 > var84 : false) : false) : false);
                                 class12.field133[var85].method2(class347.field4686 * var84, class88.field1146 * var82, class347.field4686, class88.field1146, 0, 0, var86, true);
                                 ++var84;
                              } while(var84 < class50.field658);
                           }

                           ++var82;
                        } while(class131.field1670 > var82);
                     }

                     if (!var18) {
                        break label417;
                     }
                  }

                  class171.field2384 = true;
               }
            }

            if (class171.field2384) {
               class445.field6339 = arg2;
               class578.field8534 = arg0;
               class556.field7985 = arg5;
               class598.field8798 = 0;
               class532.field7589 = class756.field11203;
               class366.field5019 = 0;
               class384.field5591 = 0.0D;
               class136.field1735 = class241.field3354;
               if (class614.field9025 == 0) {
                  class50.field660.method556(class106.field1344);
               }

               label240: {
                  class50.field660.method574();
                  class50.field660.method523();
                  class50.field660.method495(class649.field9476);
                  class269.field3721.method1232(class445.field6339, class578.field8534, class556.field7985, class64.field772, class751.field11114, class138.field1765);
                  class50.field660.method532(class269.field3721);
                  if (~class614.field9025 != -2) {
                     class237.field3308 = var21 - -class756.field11203;
                     class788.field11566 = class241.field3354 + var20;
                     class71.field867 = var25;
                     class223.field3172 = var24;
                     class50.field660.method492(class788.field11566, class237.field3308, class223.field3172, class71.field867);
                     if (!var18) {
                        break label240;
                     }
                  }

                  class788.field11566 = var20;
                  class71.field867 = var25;
                  class223.field3172 = var24;
                  class237.field3308 = var21;
                  class50.field660.method492(class788.field11566, class237.field3308, class223.field3172, class71.field867);
               }

               class475.field6833 = 0.0D;
               class790.field11583.method2008(true);
               class679.method4952(class790.field11583);
               class34.method300(arg3, arg2, arg0, arg5, arg13, arg10, arg7, arg16, arg12, arg6, arg4, arg17, arg9, arg14, arg1, arg8, arg15, 1, false);
               class777.method5598();
               class171.field2384 = false;
               if (~class614.field9025 == -1) {
                  class50.field660.method549();
               }

               if (~class614.field9025 == -2) {
                  class641.method4633(true);
               }
            }

            if (~class614.field9025 == -1) {
               class106.field1344.method1(class136.field1735, class532.field7589, class392.field5678, class236.field3290, 0, 0, true, true);
            }

            label374: {
               ++class489.field7006;
               class350.method2551(11059, class384.field5591);
               class379.field5461 = class384.field5591;
               if (class614.field9025 != 0 && class614.field9025 != 2) {
                  if (~class614.field9025 != -2) {
                     break label374;
                  }

                  class720.field10515 = var20 - class598.field8798;
                  class225.field3200 = var21 - class366.field5019;
                  class586.field8666 = var24;
                  class342.field4645 = var25;
                  class50.field660.method492(class720.field10515, class225.field3200, class586.field8666, class342.field4645);
                  class50.field660.method592(class136.field1735, class532.field7589, class136.field1735 - -class392.field5678, class532.field7589 - -class236.field3290);
                  if (!var18) {
                     break label374;
                  }
               }

               if (~class614.field9025 == -3) {
                  class50.field660.method495(class649.field9476);
                  class50.field660.method523();
               }

               class225.field3200 = -class366.field5019 + var21 + class756.field11203 - class532.field7589;
               class342.field4645 = var25;
               class586.field8666 = var24;
               class720.field10515 = -class598.field8798 + -class136.field1735 + class241.field3354 + var20;
               class50.field660.method492(class720.field10515, class225.field3200, class586.field8666, class342.field4645);
            }

            class34.method300(arg3, arg2, arg0, arg5, arg13, arg10, arg7, arg16, arg12, arg6, arg4, arg17, arg9, arg14, arg1, arg8, arg15, ~class614.field9025 != -3 ? 2 : 0, ~class614.field9025 == -2);
            class50.field660.method574();
            class50.field660.method492(var20, var21, var22, var23);
         }
      } catch (RuntimeException var88) {
         throw class237.method1823(var88, field5976[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5976[1] : field5976[0]) + ',' + (arg7 != null ? field5976[1] : field5976[0]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field5976[1] : field5976[0]) + ',' + arg11 + ',' + (arg12 != null ? field5976[1] : field5976[0]) + ',' + (arg13 != null ? field5976[1] : field5976[0]) + ',' + arg14 + ',' + arg15 + ',' + (arg16 != null ? field5976[1] : field5976[0]) + ',' + arg17 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3099(int arg0) {
      try {
         if (arg0 <= 80) {
            method3099(104);
         }

         field5964 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5976[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "b",
      descriptor = "(III)Z"
   )
   private final boolean method3100(int arg0, int arg1, int arg2) {
      try {
         ++field5970;
         int var4 = (arg0 - -arg2) * this.field5962 >> 12;
         int var5 = class290.field4017[255 & arg1 * var4 >> 12];
         int var6 = (var5 << 12) / this.field5962;
         int var7 = (var6 << 12) / this.field5969;
         int var8 = this.field5967 * var7 >> 12;
         return ~(arg0 - arg2) > ~var8 && ~(-var8) > ~(-arg2 + arg0);
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field5976[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(ILwf;I)V"
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         if (arg2 > 49) {
            label81: {
               label80: {
                  label79: {
                     label78: {
                        label77: {
                           label76: {
                              label75: {
                                 if (arg0 != 0) {
                                    if (~arg0 == -2) {
                                       break label75;
                                    }

                                    if (arg0 == 2) {
                                       break label76;
                                    }

                                    if (~arg0 == -4) {
                                       break label77;
                                    }

                                    if (arg0 == 4) {
                                       break label78;
                                    }

                                    if (~arg0 == -6) {
                                       break label79;
                                    }

                                    if (arg0 != 6) {
                                       break label81;
                                    }

                                    if (!var4) {
                                       break label80;
                                    }
                                 }

                                 this.field5961 = arg1.method1211(-26166);
                                 if (!var4) {
                                    break label81;
                                 }
                              }

                              this.field5959 = arg1.method1211(-26166);
                              if (!var4) {
                                 break label81;
                              }
                           }

                           this.field5973 = arg1.method1211(-26166);
                           if (!var4) {
                              break label81;
                           }
                        }

                        this.field5960 = arg1.method1211(-26166);
                        if (!var4) {
                           break label81;
                        }
                     }

                     this.field5962 = arg1.method1211(-26166);
                     if (!var4) {
                        break label81;
                     }
                  }

                  this.field5967 = arg1.method1211(-26166);
                  if (!var4) {
                     break label81;
                  }
               }

               this.field5969 = arg1.method1211(-26166);
            }

            ++field5974;
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field5976[8] + arg0 + ',' + (arg1 != null ? field5976[1] : field5976[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         ++field5958;
         int var4 = 6 / ((arg1 - 24) / 44);
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = class666.field9668[arg0] + -2048;
            int var7 = 0;
            if (var3 || class430.field6152 > var7) {
               do {
                  int var8 = class258.field3496[var7] + -2048;
                  int var9 = this.field5961 + var8;
                  int var10 = var9 >= -2048 ? var9 : var9 + 4096;
                  int var11 = ~var10 >= -2049 ? var10 : var10 - 4096;
                  int var12 = this.field5959 + var6;
                  int var13 = var12 >= -2048 ? var12 : var12 - -4096;
                  int var14 = ~var13 < -2049 ? var13 + -4096 : var13;
                  int var15 = this.field5973 + var8;
                  int var16 = var15 < -2048 ? var15 + 4096 : var15;
                  int var17 = var16 <= 2048 ? var16 : var16 + -4096;
                  int var18 = this.field5960 + var6;
                  int var19 = var18 >= -2048 ? var18 : var18 + 4096;
                  int var20 = var19 > 2048 ? var19 + -4096 : var19;
                  var5[var7] = !this.method3097(var11, var14, (byte)118) ? (!this.method3100(var20, 255, var17) ? 0 : 4096) : 4096;
                  ++var7;
               } while(class430.field6152 > var7);
            }
         }

         return var5;
      } catch (RuntimeException var22) {
         throw class237.method1823(var22, field5976[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tm",
      name = "<init>",
      descriptor = "()V"
   )
   public class414() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3101(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3102(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
