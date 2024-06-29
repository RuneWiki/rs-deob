import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class508 extends class400 {
   @OriginalMember(
      owner = "client!oo",
      name = "G",
      descriptor = "I"
   )
   public int field7784 = 99;
   @OriginalMember(
      owner = "client!oo",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7786 = new String[]{method3957(method3956("YrM\u0013K")), method3957(method3956("Xh\u000f+")), method3957(method3956("M3Mi\u001e")), method3957(method3956("Rw")), method3957(method3956("YrM\u0012K")), method3957(method3956("YrM\u0005\"\u001e")), method3957(method3956("YrM\u0014K")), method3957(method3956("YrM\bK")), method3957(method3956("YrM\u0017K")), method3957(method3956("YrM\u0016K")), method3957(method3956("YrM\u0011K")), method3957(method3956("YrM\u0010K")), method3957(method3956("YrM\u0003\"\u001e")), method3957(method3956("YrM\u0015K")), method3957(method3956("YrM\u0004\"\u001e")), method3957(method3956("YrM\u0006\"\u001e"))};
   @OriginalMember(
      owner = "client!oo",
      name = "R",
      descriptor = "I"
   )
   public static int field7771;
   @OriginalMember(
      owner = "client!oo",
      name = "L",
      descriptor = "I"
   )
   public static int field7772;
   @OriginalMember(
      owner = "client!oo",
      name = "O",
      descriptor = "I"
   )
   public static int field7773;
   @OriginalMember(
      owner = "client!oo",
      name = "Q",
      descriptor = "I"
   )
   public static int field7774;
   @OriginalMember(
      owner = "client!oo",
      name = "J",
      descriptor = "I"
   )
   public static int field7775;
   @OriginalMember(
      owner = "client!oo",
      name = "F",
      descriptor = "I"
   )
   public static int field7777;
   @OriginalMember(
      owner = "client!oo",
      name = "K",
      descriptor = "I"
   )
   public static int field7778;
   @OriginalMember(
      owner = "client!oo",
      name = "P",
      descriptor = "I"
   )
   public static int field7779;
   @OriginalMember(
      owner = "client!oo",
      name = "I",
      descriptor = "I"
   )
   public static int field7780;
   @OriginalMember(
      owner = "client!oo",
      name = "S",
      descriptor = "I"
   )
   public static int field7781;
   @OriginalMember(
      owner = "client!oo",
      name = "N",
      descriptor = "I"
   )
   public static int field7782;
   @OriginalMember(
      owner = "client!oo",
      name = "T",
      descriptor = "I"
   )
   public static int field7783;
   @OriginalMember(
      owner = "client!oo",
      name = "H",
      descriptor = "Ltfa;"
   )
   public static class17 field7776;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!oo",
      name = "M",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7785;

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(I[Lfr;[BIIIIIILha;I)V"
   )
   public final void method3942(int arg0, class482[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class610 arg9, int arg10) {
      boolean var12 = client.field1786;

      try {
         ++field7772;
         class354 var13 = new class354(arg2);
         int var14 = -1;
         if (arg3 >= -3) {
            field7776 = null;
         }

         label79:
         do {
            int var15 = var13.method2880((byte)-74);
            if (var15 == 0) {
               break;
            }

            int var10000 = var14;
            int var10001 = var15;

            while(true) {
               var14 = var10000 + var10001;
               int var16 = 0;

               while(true) {
                  int var17 = var13.method2896(0);
                  if (~var17 == -1) {
                     continue label79;
                  }

                  var16 += var17 + -1;
                  int var18 = var16 & 63;
                  int var19 = 63 & var16 >> 6;
                  int var20 = var16 >> 12;
                  int var21 = var13.method2855(-31007);
                  int var22 = var21 >> 2;
                  int var23 = var21 & 3;
                  if (arg10 == var20) {
                     var10000 = arg5;
                     var10001 = var19;
                     if (var12) {
                        break;
                     }

                     if (arg5 <= var19 && arg5 + 8 > var19 && ~var18 <= ~arg4 && ~(arg4 + 8) < ~var18) {
                        class333 var24 = class102.field1434.method1411(var14, -88);
                        int var25 = class730.method5383(7 & var19, var18 & 7, var24.field5104, var24.field5097, var23, arg7, (byte)100) + arg0;
                        int var26 = class615.method4527(var23, var18 & 7, var19 & 7, var24.field5104, (byte)122, var24.field5097, arg7) + arg8;
                        if (var25 > 0 && ~var26 < -1 && var25 < super.field6268 + -1 && ~(super.field6279 + -1) < ~var26) {
                           class482 var27 = null;
                           if (!super.field6274) {
                              int var28 = arg6;
                              if (~(class757.field11211[1][var25][var26] & 2) == -3) {
                                 var28 = arg6 - 1;
                              }

                              if (~var28 <= -1) {
                                 var27 = arg1[var28];
                              }
                           }

                           this.method3950(-1, var26, var14, var23 - -arg7 & 3, arg6, var22, var25, arg9, (byte)-88, arg6, var27);
                           if (var12) {
                              continue label79;
                           }
                        }
                     }
                  }
               }
            }
         } while(!var12);

      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field7786[14] + arg0 + ',' + (arg1 != null ? field7786[2] : field7786[1]) + ',' + (arg2 != null ? field7786[2] : field7786[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field7786[2] : field7786[1]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method3943(byte arg0) {
      try {
         ++field7777;
         int var1 = 92 / ((arg0 - -21) / 44);
         return class701.field10450;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7786[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "([BLha;[Lfr;BII)V"
   )
   public final void method3944(byte[] arg0, class610 arg1, class482[] arg2, byte arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;

      try {
         ++field7779;
         if (arg3 <= 19) {
            this.method3953(-81, (byte)-37, 28, -2, -105, (class354)null, 8, (class610)null, -65, 79);
         }

         class354 var8 = new class354(arg0);
         int var9 = -1;

         label71:
         do {
            int var10 = var8.method2880((byte)-74);
            int var10000 = var10;

            while(var10000 != 0) {
               var9 += var10;
               int var11 = 0;

               while(true) {
                  int var12 = var8.method2896(0);
                  if (var12 == 0) {
                     continue label71;
                  }

                  var11 += var12 + -1;
                  int var13 = var11 & 63;
                  int var14 = 63 & var11 >> 6;
                  int var15 = var11 >> 12;
                  int var16 = var8.method2855(-31007);
                  int var17 = var16 >> 2;
                  int var18 = 3 & var16;
                  int var19 = var14 - -arg4;
                  int var20 = arg5 + var13;
                  if (var19 > 0) {
                     var10000 = var20;
                     if (var7) {
                        break;
                     }

                     if (var20 > 0 && ~var19 > ~(super.field6268 + -1) && super.field6279 + -1 > var20) {
                        class482 var21 = null;
                        if (!super.field6274) {
                           int var22 = var15;
                           if ((class757.field11211[1][var19][var20] & 2) == 2) {
                              var22 = var15 - 1;
                           }

                           if (~var22 <= -1) {
                              var21 = arg2[var22];
                           }
                        }

                        this.method3950(-1, var20, var9, var18, var15, var17, var19, arg1, (byte)-120, var15, var21);
                        if (var7) {
                           continue label71;
                        }
                     }
                  }
               }
            }

            return;
         } while(!var7);

      } catch (RuntimeException var24) {
         throw class482.method3757(var24, field7786[13] + (arg0 != null ? field7786[2] : field7786[1]) + ',' + (arg1 != null ? field7786[2] : field7786[1]) + ',' + (arg2 != null ? field7786[2] : field7786[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3945(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -2108543543) {
            field7776 = null;
         }

         ++field7782;
         return (class536.method4115(arg0, arg2, -111) | class385.method3118(arg2, 120, arg0) | class755.method5541(arg0, arg2, (byte)124)) & class433.method3417(-22089, arg2, arg0);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7786[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ZLha;B)V"
   )
   public final void method3946(boolean param1, class610 param2, byte param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIIIZ)Ldj;"
   )
   public final class434 method3947(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field7771;
         class434 var6 = null;
         if (arg2 == 0) {
            var6 = (class434)class471.method3661(arg0, arg1, arg3);
         }

         if (~arg2 == -2) {
            var6 = (class434)class353.method2831(arg0, arg1, arg3);
         }

         if (~arg2 == -3) {
            var6 = (class434)class288.method2404(arg0, arg1, arg3, field7785 != null ? field7785 : (field7785 = method3955(field7786[3])));
         }

         if (arg4) {
            return null;
         } else {
            if (~arg2 == -4) {
               var6 = (class434)class269.method2302(arg0, arg1, arg3);
            }

            return var6;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field7786[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3948(boolean arg0) {
      try {
         if (arg0) {
            field7776 = null;
         }

         field7776 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7786[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(ZII)I"
   )
   public static final int method3949(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            field7776 = null;
         }

         ++field7773;
         int var3 = -128 + class234.method2015(arg1 + 91923, 4, arg2 + 45365, (byte)-10) + (-128 + class234.method2015(arg1 + 37821, 2, arg2 + 10294, (byte)-76) >> 1) + (class234.method2015(arg1, 1, arg2, (byte)-39) - 128 >> 2);
         int var4 = (int)((double)var3 * 0.3D) + 35;
         if (~var4 <= -11) {
            if (~var4 >= -61) {
               return var4;
            }

            var4 = 60;
            if (!client.field1786) {
               return var4;
            }
         }

         var4 = 10;
         return var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field7786[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIIIIIILha;BILfr;)V"
   )
   public final void method3950(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class610 arg7, byte arg8, int arg9, class482 arg10) {
      boolean var12 = client.field1786;

      try {
         ++field7781;
         if (~class687.field10213.field536.method5531(480102311) != -1 || class152.method1386(class426.field6582, (byte)39, arg9, arg1, arg6)) {
            if (this.field7784 > arg4) {
               this.field7784 = arg4;
            }

            class333 var13 = class102.field1434.method1411(arg2, -106);
            if (~class687.field10213.field547.method4414(480102311) != -1 || !var13.field5083) {
               int var14;
               int var15;
               label781: {
                  if (arg3 != 1 && arg3 != 3) {
                     var14 = var13.field5104;
                     var15 = var13.field5097;
                     if (!var12) {
                        break label781;
                     }
                  }

                  var15 = var13.field5104;
                  var14 = var13.field5097;
               }

               int var16;
               int var17;
               label775: {
                  if (~super.field6268 <= ~(arg6 + var15)) {
                     var16 = (var15 + 1 >> 1) + arg6;
                     var17 = (var15 >> 1) + arg6;
                     if (!var12) {
                        break label775;
                     }
                  }

                  var17 = arg6;
                  var16 = arg6 + 1;
               }

               int var18;
               int var19;
               label770: {
                  if (arg1 + var14 <= super.field6279) {
                     var18 = (var14 + 1 >> 1) + arg1;
                     var19 = (var14 >> 1) + arg1;
                     if (!var12) {
                        break label770;
                     }
                  }

                  var19 = arg1;
                  var18 = arg1 + 1;
               }

               class271 var20 = class385.field6076[arg9];
               int var21 = -90 / ((arg8 - -36) / 51);
               int var22 = var20.method2313(-121, var17, var19) + var20.method2313(-115, var16, var19) - (-var20.method2313(97, var17, var18) + -var20.method2313(-123, var16, var18)) >> 2;
               int var23 = (arg6 << 9) + (var15 << 8);
               int var24 = (arg1 << 9) + (var14 << 8);
               boolean var25 = class206.field3130 && !super.field6274 && var13.field5101;
               if (var13.method2722(-165)) {
                  class346.method2795((class466)null, (class9)null, arg4, arg3, (byte)120, var13, arg6, arg1);
               }

               boolean var26 = ~arg0 == 0 && !var13.method2707((byte)93) && var13.field5088 == null && !var13.field5115 && !var13.field5095;
               if (!class621.field9037 || (!class269.method2301(53, arg5) || ~var13.field5126 == -2) && (!class394.method3172(false, arg5) || ~var13.field5126 != -1)) {
                  if (~arg5 == -23) {
                     if (~class687.field10213.field534.method5283(480102311) != -1 || var13.field5071 != 0 || var13.field5052 == 1 || var13.field5131) {
                        class462 var27;
                        label792: {
                           if (!var26) {
                              var27 = new class423(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg3, arg0);
                              if (!var12) {
                                 break label792;
                              }
                           }

                           class692 var28 = new class692(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg3, var25);
                           if (var28.method241(-18128)) {
                              var28.method227(arg7, (byte)-55);
                           }

                           var27 = var28;
                        }

                        class610.method4499(arg4, arg6, arg1, var27);
                        if (~var13.field5052 == -2 && arg10 != null) {
                           arg10.method3745(127, arg6, arg1);
                        }

                     }
                  } else if (~arg5 != -11 && ~arg5 != -12) {
                     if (~arg5 <= -13 && ~arg5 >= -18 || ~arg5 <= -19 && ~arg5 >= -22) {
                        class78 var36;
                        label523: {
                           if (var26) {
                              class439 var35 = new class439(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg6, arg6 + var15 - 1, arg1, var14 + -1 + arg1, arg5, arg3, var25);
                              var36 = var35;
                              if (!var35.method241(-18128)) {
                                 break label523;
                              }

                              var35.method227(arg7, (byte)120);
                              if (!var12) {
                                 break label523;
                              }
                           }

                           var36 = new class32(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg6, arg6 - 1 + var15, arg1, arg1 - (-var14 + 1), arg5, arg3, arg0);
                        }

                        class363.method2960(var36, false);
                        if (class206.field3130 && !super.field6274 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg4 > 0 && var13.field5126 != 0) {
                           super.field6254[arg4][arg6][arg1] = (byte)class119.method1087(super.field6254[arg4][arg6][arg1], 4);
                        }

                        if (~var13.field5052 != -1 && arg10 != null) {
                           arg10.method3742(arg6, var14, !var13.field5073, var13.field5135, 671744, arg1, var15);
                        }

                     } else if (~arg5 == -1) {
                        int var37 = var13.field5126;
                        if (class89.field1286 && ~var13.field5126 == 0) {
                           var37 = 1;
                        }

                        class269 var39;
                        label558: {
                           if (var26) {
                              class278 var38 = new class278(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3, var25);
                              var39 = var38;
                              if (!var38.method241(-18128)) {
                                 break label558;
                              }

                              var38.method227(arg7, (byte)-75);
                              if (!var12) {
                                 break label558;
                              }
                           }

                           var39 = new class348(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3, arg0);
                        }

                        label797: {
                           class57.method425(arg4, arg6, arg1, var39, (class269)null);
                           if (arg3 != 0) {
                              if (~arg3 == -2) {
                                 if (class206.field3130 && var13.field5065) {
                                    var20.method1126(arg6, arg1 - -1, 50);
                                    var20.method1126(arg6 - -1, arg1 + 1, 50);
                                 }

                                 if (var37 != 1 || super.field6274) {
                                    break label797;
                                 }

                                 class671.method4943(-var13.field5114, arg4, var13.field5079, -116, arg6, arg1 - -1, 2);
                                 if (!var12) {
                                    break label797;
                                 }
                              }

                              if (~arg3 == -3) {
                                 if (class206.field3130 && var13.field5065) {
                                    var20.method1126(arg6 - -1, arg1, 50);
                                    var20.method1126(arg6 + 1, arg1 + 1, 50);
                                 }

                                 if (~var37 != -2 || super.field6274) {
                                    break label797;
                                 }

                                 class671.method4943(-var13.field5114, arg4, var13.field5079, -125, arg6 + 1, arg1, 1);
                                 if (!var12) {
                                    break label797;
                                 }
                              }

                              if (arg3 != 3) {
                                 break label797;
                              }

                              if (class206.field3130 && var13.field5065) {
                                 var20.method1126(arg6, arg1, 50);
                                 var20.method1126(arg6 + 1, arg1, 50);
                              }

                              if (var37 != 1 || super.field6274) {
                                 break label797;
                              }

                              class671.method4943(var13.field5114, arg4, var13.field5079, -120, arg6, arg1, 2);
                              if (!var12) {
                                 break label797;
                              }
                           }

                           if (class206.field3130 && var13.field5065) {
                              var20.method1126(arg6, arg1, 50);
                              var20.method1126(arg6, arg1 - -1, 50);
                           }

                           if (var37 == 1 && !super.field6274) {
                              class671.method4943(var13.field5114, arg4, var13.field5079, -125, arg6, arg1, 1);
                           }
                        }

                        if (var13.field5052 != 0 && arg10 != null) {
                           arg10.method3749(arg3, (byte)53, arg5, arg1, var13.field5135, arg6, !var13.field5073);
                        }

                        if (~var13.field5068 != -65) {
                           class325.method2657(arg4, arg6, arg1, var13.field5068);
                        }

                     } else if (arg5 == 1) {
                        class269 var40;
                        label802: {
                           if (!var26) {
                              var40 = new class348(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3, arg0);
                              if (!var12) {
                                 break label802;
                              }
                           }

                           class278 var41 = new class278(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3, var25);
                           if (var41.method241(-18128)) {
                              var41.method227(arg7, (byte)126);
                           }

                           var40 = var41;
                        }

                        class57.method425(arg4, arg6, arg1, var40, (class269)null);
                        if (var13.field5065 && class206.field3130) {
                           label573: {
                              if (arg3 != 0) {
                                 if (arg3 == 1) {
                                    var20.method1126(arg6 - -1, arg1 - -1, 50);
                                    if (!var12) {
                                       break label573;
                                    }
                                 }

                                 if (~arg3 != -3) {
                                    if (arg3 != 3) {
                                       break label573;
                                    }

                                    var20.method1126(arg6, arg1, 50);
                                    if (!var12) {
                                       break label573;
                                    }
                                 }

                                 var20.method1126(arg6 - -1, arg1, 50);
                                 if (!var12) {
                                    break label573;
                                 }
                              }

                              var20.method1126(arg6, arg1 + 1, 50);
                           }
                        }

                        if (var13.field5052 != 0 && arg10 != null) {
                           arg10.method3749(arg3, (byte)86, arg5, arg1, var13.field5135, arg6, !var13.field5073);
                        }

                     } else if (~arg5 == -3) {
                        class269 var43;
                        class269 var44;
                        label805: {
                           int var42 = arg3 + 1 & 3;
                           if (!var26) {
                              var43 = new class348(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3 + 4, arg0);
                              var44 = new class348(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, var42, arg0);
                              if (!var12) {
                                 break label805;
                              }
                           }

                           class278 var45 = new class278(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3 + 4, var25);
                           class278 var46 = new class278(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, var42, var25);
                           if (var45.method241(-18128)) {
                              var45.method227(arg7, (byte)-82);
                           }

                           if (var46.method241(-18128)) {
                              var46.method227(arg7, (byte)112);
                           }

                           var43 = var45;
                           var44 = var46;
                        }

                        class57.method425(arg4, arg6, arg1, var43, var44);
                        if ((var13.field5126 == 1 || class89.field1286 && ~var13.field5126 == 0) && !super.field6274) {
                           label595: {
                              if (~arg3 != -1) {
                                 if (~arg3 == -2) {
                                    class671.method4943(var13.field5114, arg4, var13.field5079, -117, arg6 + 1, arg1, 1);
                                    class671.method4943(var13.field5114, arg4, var13.field5079, -114, arg6, arg1 + 1, 2);
                                    if (!var12) {
                                       break label595;
                                    }
                                 }

                                 if (~arg3 != -3) {
                                    if (arg3 != 3) {
                                       break label595;
                                    }

                                    class671.method4943(var13.field5114, arg4, var13.field5079, -128, arg6, arg1, 1);
                                    class671.method4943(var13.field5114, arg4, var13.field5079, -121, arg6, arg1, 2);
                                    if (!var12) {
                                       break label595;
                                    }
                                 }

                                 class671.method4943(var13.field5114, arg4, var13.field5079, -127, arg6 + 1, arg1, 1);
                                 class671.method4943(var13.field5114, arg4, var13.field5079, -127, arg6, arg1, 2);
                                 if (!var12) {
                                    break label595;
                                 }
                              }

                              class671.method4943(var13.field5114, arg4, var13.field5079, -115, arg6, arg1, 1);
                              class671.method4943(var13.field5114, arg4, var13.field5079, -113, arg6, arg1 + 1, 2);
                           }
                        }

                        if (var13.field5052 != 0 && arg10 != null) {
                           arg10.method3749(arg3, (byte)123, arg5, arg1, var13.field5135, arg6, !var13.field5073);
                        }

                        if (~var13.field5068 != -65) {
                           class325.method2657(arg4, arg6, arg1, var13.field5068);
                        }

                     } else if (~arg5 == -4) {
                        class269 var48;
                        label631: {
                           if (var26) {
                              class278 var47 = new class278(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3, var25);
                              if (var47.method241(-18128)) {
                                 var47.method227(arg7, (byte)111);
                              }

                              var48 = var47;
                              if (!var12) {
                                 break label631;
                              }
                           }

                           var48 = new class348(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg5, arg3, arg0);
                        }

                        class57.method425(arg4, arg6, arg1, var48, (class269)null);
                        if (var13.field5065 && class206.field3130) {
                           label808: {
                              if (arg3 == 0) {
                                 var20.method1126(arg6, arg1 + 1, 50);
                                 if (!var12) {
                                    break label808;
                                 }
                              }

                              if (arg3 != 1) {
                                 if (~arg3 != -3) {
                                    if (~arg3 != -4) {
                                       break label808;
                                    }

                                    var20.method1126(arg6, arg1, 50);
                                    if (!var12) {
                                       break label808;
                                    }
                                 }

                                 var20.method1126(arg6 + 1, arg1, 50);
                                 if (!var12) {
                                    break label808;
                                 }
                              }

                              var20.method1126(arg6 + 1, arg1 + 1, 50);
                           }
                        }

                        if (~var13.field5052 != -1 && arg10 != null) {
                           arg10.method3749(arg3, (byte)60, arg5, arg1, var13.field5135, arg6, !var13.field5073);
                        }

                     } else if (~arg5 == -10) {
                        class78 var49;
                        label810: {
                           if (!var26) {
                              var49 = new class32(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg6, arg6 - -var15 + -1, arg1, arg1 + -1 - -var14, arg5, arg3, arg0);
                              if (!var12) {
                                 break label810;
                              }
                           }

                           class439 var50 = new class439(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg6, arg6, arg1, arg1, arg5, arg3, var25);
                           if (var50.method241(-18128)) {
                              var50.method227(arg7, (byte)92);
                           }

                           var49 = var50;
                        }

                        class363.method2960(var49, false);
                        if (var13.field5126 == 1 && !super.field6274) {
                           byte var51;
                           label638: {
                              if ((arg3 & 1) != 0) {
                                 var51 = 16;
                                 if (!var12) {
                                    break label638;
                                 }
                              }

                              var51 = 8;
                           }

                           class671.method4943(0, arg4, var13.field5079, -113, arg6, arg1, var51);
                        }

                        if (~var13.field5052 != -1 && arg10 != null) {
                           arg10.method3742(arg6, var14, !var13.field5073, var13.field5135, 671744, arg1, var15);
                        }

                        if (var13.field5068 != 64) {
                           class325.method2657(arg4, arg6, arg1, var13.field5068);
                        }

                     } else if (~arg5 == -5) {
                        class484 var53;
                        label654: {
                           if (var26) {
                              class130 var52 = new class130(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, 0, 0, arg5, arg3);
                              if (var52.method241(-18128)) {
                                 var52.method227(arg7, (byte)-15);
                              }

                              var53 = var52;
                              if (!var12) {
                                 break label654;
                              }
                           }

                           var53 = new class640(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, 0, 0, arg5, arg3, arg0);
                        }

                        class189.method1687(arg4, arg6, arg1, var53, (class484)null);
                     } else if (~arg5 == -6) {
                        int var54 = 65;
                        class434 var55 = (class434)class471.method3661(arg4, arg6, arg1);
                        if (var55 != null) {
                           var54 = 1 + class102.field1434.method1411(var55.method236((byte)-11), -108).field5068;
                        }

                        class484 var57;
                        label662: {
                           if (var26) {
                              class130 var56 = new class130(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, class569.field8420[arg3] * var54, class92.field1328[arg3] * var54, arg5, arg3);
                              if (var56.method241(-18128)) {
                                 var56.method227(arg7, (byte)-54);
                              }

                              var57 = var56;
                              if (!var12) {
                                 break label662;
                              }
                           }

                           var57 = new class640(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, class569.field8420[arg3] * var54, class92.field1328[arg3] * var54, arg5, arg3, arg0);
                        }

                        class189.method1687(arg4, arg6, arg1, var57, (class484)null);
                     } else if (arg5 == 6) {
                        int var58 = 33;
                        class434 var59 = (class434)class471.method3661(arg4, arg6, arg1);
                        if (var59 != null) {
                           var58 = 1 + class102.field1434.method1411(var59.method236((byte)-11), -110).field5068 / 2;
                        }

                        class484 var60;
                        label670: {
                           if (!var26) {
                              var60 = new class640(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, class464.field7043[arg3] * var58, class655.field9788[arg3] * var58, arg5, arg3 + 4, arg0);
                              if (!var12) {
                                 break label670;
                              }
                           }

                           class130 var61 = new class130(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, class569.field8420[arg3] * var58, class92.field1328[arg3] * var58, arg5, arg3 + 4);
                           var60 = var61;
                           if (var61.method241(-18128)) {
                              var61.method227(arg7, (byte)-13);
                           }
                        }

                        class189.method1687(arg4, arg6, arg1, var60, (class484)null);
                     } else if (~arg5 == -8) {
                        class484 var63;
                        label813: {
                           int var62 = 3 & arg3 + 2;
                           if (!var26) {
                              var63 = new class640(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, 0, 0, arg5, var62 + 4, arg0);
                              if (!var12) {
                                 break label813;
                              }
                           }

                           class130 var64 = new class130(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, 0, 0, arg5, var62 - -4);
                           if (var64.method241(-18128)) {
                              var64.method227(arg7, (byte)-30);
                           }

                           var63 = var64;
                        }

                        class189.method1687(arg4, arg6, arg1, var63, (class484)null);
                     } else if (arg5 == 8) {
                        int var65 = arg3 + 2 & 3;
                        int var66 = 33;
                        class434 var67 = (class434)class471.method3661(arg4, arg6, arg1);
                        if (var67 != null) {
                           var66 = class102.field1434.method1411(var67.method236((byte)-11), -54).field5068 / 2 + 1;
                        }

                        class484 var70;
                        class484 var71;
                        label815: {
                           if (!var26) {
                              class640 var68 = new class640(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, class464.field7043[arg3] * var66, class655.field9788[arg3] * var66, arg5, arg3 + 4, arg0);
                              class640 var69 = new class640(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, 0, 0, arg5, var65 + 4, arg0);
                              var70 = var68;
                              var71 = var69;
                              if (!var12) {
                                 break label815;
                              }
                           }

                           class130 var72 = new class130(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, class464.field7043[arg3] * var66, class655.field9788[arg3] * var66, arg5, arg3 - -4);
                           class130 var73 = new class130(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, 0, 0, arg5, var65 + 4);
                           if (var72.method241(-18128)) {
                              var72.method227(arg7, (byte)-107);
                           }

                           var71 = var73;
                           if (var73.method241(-18128)) {
                              var73.method227(arg7, (byte)97);
                           }

                           var70 = var72;
                        }

                        class189.method1687(arg4, arg6, arg1, var70, var71);
                     }
                  } else {
                     class439 var29 = null;
                     int var31;
                     class78 var32;
                     if (var26) {
                        class439 var30 = new class439(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg6, arg6 + var15 + -1, arg1, arg1 + var14 + -1, arg5, arg3, var25);
                        var29 = var30;
                        var31 = var30.method3453((byte)-41);
                        var32 = var30;
                     } else {
                        var32 = new class32(arg7, var13, arg4, arg9, var23, var22, var24, super.field6274, arg6, arg6 + var15 + -1, arg1, var14 + -1 + arg1, arg5, arg3, arg0);
                        var31 = 15;
                     }

                     if (class363.method2960(var32, false)) {
                        if (var29 != null && var29.method241(-18128)) {
                           var29.method227(arg7, (byte)-35);
                        }

                        if (var13.field5065 && class206.field3130) {
                           if (~var31 < -31) {
                              var31 = 30;
                           }

                           int var33 = 0;
                           if (var12 || ~var33 >= ~var15) {
                              do {
                                 int var34 = 0;
                                 if (var12) {
                                    var20.method1126(arg6 + var33, arg1 + var34, var31);
                                    ++var34;
                                 }

                                 while(true) {
                                    while(var14 >= var34) {
                                       var20.method1126(arg6 + var33, arg1 + var34, var31);
                                       ++var34;
                                    }

                                    if (!var12) {
                                       ++var33;
                                       break;
                                    }

                                    ++var34;
                                 }
                              } while(~var33 >= ~var15);
                           }
                        }
                     }

                     if (var13.field5052 != 0 && arg10 != null) {
                        arg10.method3742(arg6, var14, !var13.field5073, var13.field5135, 671744, arg1, var15);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var75) {
         throw class482.method3757(var75, field7786[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field7786[2] : field7786[1]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field7786[2] : field7786[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IIBLica;Lha;)V"
   )
   public final void method3951(int param1, int param2, byte param3, class354 param4, class610 param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oo",
      name = "<init>",
      descriptor = "(IIIZ)V"
   )
   public class508(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class429.field6629, class29.field347);
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IILha;Lfr;III)V"
   )
   public final void method3952(int arg0, int arg1, class610 arg2, class482 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field7778;
         class434 var9 = this.method3947(arg0, arg5, arg1, arg4, false);
         if (var9 != null) {
            label147: {
               class333 var10 = class102.field1434.method1411(var9.method236((byte)-11), -54);
               int var11 = var9.method237(28440);
               int var12 = var9.method231((byte)-42);
               if (var10.method2722(-165)) {
                  class656.method4833(var10, arg0, arg5, arg4, (byte)67);
               }

               if (var9.method241(-18128)) {
                  var9.method238(arg2, 98);
               }

               if (arg1 != 0) {
                  if (arg1 == 1) {
                     class768.method5612(arg0, arg5, arg4);
                     if (!var8) {
                        break label147;
                     }
                  }

                  if (arg1 == 2) {
                     class614.method4522(arg0, arg5, arg4, field7785 != null ? field7785 : (field7785 = method3955(field7786[3])));
                     if (~var10.field5052 != -1 && super.field6268 > arg5 - -var10.field5097 && super.field6279 > var10.field5097 + arg4 && ~(var10.field5104 + arg5) > ~super.field6268 && ~(var10.field5104 + arg4) > ~super.field6279) {
                        arg3.method3750(!var10.field5073, (byte)-108, arg5, var12, var10.field5104, var10.field5135, arg4, var10.field5097);
                     }

                     if (var11 != 9) {
                        break label147;
                     }

                     if (~(1 & var12) == -1) {
                        class543.method4146(8, arg5, arg0, (byte)-102, arg4);
                        if (!var8) {
                           break label147;
                        }
                     }

                     class543.method4146(16, arg5, arg0, (byte)-31, arg4);
                     if (!var8) {
                        break label147;
                     }
                  }

                  if (arg1 != 3) {
                     break label147;
                  }

                  class421.method3347(arg0, arg5, arg4);
                  if (var10.field5052 != 1) {
                     break label147;
                  }

                  arg3.method3756(arg5, arg4, (byte)121);
                  if (!var8) {
                     break label147;
                  }
               }

               class659.method4855(arg0, arg5, arg4);
               if (~var10.field5052 != -1) {
                  arg3.method3740(var10.field5135, true, var11, var12, !var10.field5073, arg4, arg5);
               }

               if (~var10.field5126 == -2) {
                  label116: {
                     if (~var12 != -1) {
                        if (~var12 != -2) {
                           if (~var12 != -3) {
                              if (var12 != 3) {
                                 break label116;
                              }

                              class543.method4146(2, arg5, arg0, (byte)-126, arg4);
                              if (!var8) {
                                 break label116;
                              }
                           }

                           class543.method4146(1, arg5 + 1, arg0, (byte)-61, arg4);
                           if (!var8) {
                              break label116;
                           }
                        }

                        class543.method4146(2, arg5, arg0, (byte)-90, arg4 + 1);
                        if (!var8) {
                           break label116;
                        }
                     }

                     class543.method4146(1, arg5, arg0, (byte)-71, arg4);
                  }
               }
            }
         }

         if (arg6 >= -2) {
            this.method3953(25, (byte)25, -29, 105, -74, (class354)null, 11, (class610)null, 8, -75);
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field7786[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7786[2] : field7786[1]) + ',' + (arg3 != null ? field7786[2] : field7786[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(IBIIILica;ILha;II)V"
   )
   public final void method3953(int arg0, byte arg1, int arg2, int arg3, int arg4, class354 arg5, int arg6, class610 arg7, int arg8, int arg9) {
      boolean var11 = client.field1786;

      try {
         ++field7775;
         if (!super.field6274) {
            boolean var12 = false;
            class365 var13 = null;
            int var14 = (7 & arg0) * 8;
            int var15 = 45 / ((13 - arg1) / 44);
            int var16 = (7 & arg4) * 8;

            while(true) {
               label274:
               while(~arg5.field5436 > ~arg5.field5428.length) {
                  int var17 = arg5.method2855(-31007);

                  int var31;
                  int var32;
                  do {
                     if (var17 == 0) {
                        if (var13 == null) {
                           var13 = new class365(arg5);
                           if (!var11) {
                              continue label274;
                           }
                        }

                        var13.method2965(arg5, 16384);
                        if (!var11) {
                           continue label274;
                        }
                     }

                     if (~var17 != -2) {
                        if (~var17 != -3) {
                           if (var17 != 128) {
                              if (var17 != 129) {
                                 throw new IllegalStateException("");
                              }

                              if (super.field6264 == null) {
                                 super.field6264 = new byte[4][][];
                              }

                              int var18 = 0;
                              if (!var11 && var18 >= 4) {
                                 if (var11) {
                                    throw new IllegalStateException("");
                                 }
                              } else {
                                 do {
                                    byte var19 = arg5.method2886((byte)88);
                                    if (~var19 != -1 || super.field6264[arg2] == null) {
                                       if (var19 != 1) {
                                          ++var18;
                                          continue;
                                       }

                                       if (super.field6264[arg2] == null) {
                                          super.field6264[arg2] = new byte[super.field6268 + 1][super.field6279 + 1];
                                       }

                                       int var20 = 0;
                                       if (var11 || var20 < 64) {
                                          do {
                                             int var21 = 0;
                                             if (var11 || var21 < 64) {
                                                do {
                                                   byte var22 = arg5.method2886((byte)88);
                                                   if (~var18 < ~arg3) {
                                                      var21 += 4;
                                                   } else {
                                                      int var23 = var20;
                                                      if (!var11 && ~(var20 + 4) >= ~var20) {
                                                         var21 += 4;
                                                      } else {
                                                         do {
                                                            int var24 = var21;
                                                            int var25;
                                                            int var26;
                                                            if (var11) {
                                                               if (var23 >= var14 && ~var23 > ~(var14 - -8) && ~var16 >= ~var21 && ~(var16 + 8) < ~var21) {
                                                                  var25 = class11.method84(var23 & 7, 7 & var21, arg9, true) + arg8;
                                                                  var26 = class50.method346(7 & var21, arg9, 7 & var23, true) + arg6;
                                                                  if (~var25 <= -1 && ~var25 > ~super.field6268 && var26 >= 0 && ~var26 > ~super.field6279) {
                                                                     super.field6264[arg2][var25][var26] = var22;
                                                                     var12 = true;
                                                                  }
                                                               }

                                                               var24 = var21 + 1;
                                                            }

                                                            while(true) {
                                                               while(var21 - -4 > var24) {
                                                                  if (var23 >= var14 && ~var23 > ~(var14 - -8) && ~var16 >= ~var24 && ~(var16 + 8) < ~var24) {
                                                                     var25 = class11.method84(var23 & 7, 7 & var24, arg9, true) + arg8;
                                                                     var26 = class50.method346(7 & var24, arg9, 7 & var23, true) + arg6;
                                                                     if (~var25 <= -1 && ~var25 > ~super.field6268 && var26 >= 0 && ~var26 > ~super.field6279) {
                                                                        super.field6264[arg2][var25][var26] = var22;
                                                                        var12 = true;
                                                                     }
                                                                  }

                                                                  ++var24;
                                                               }

                                                               if (!var11) {
                                                                  ++var23;
                                                                  break;
                                                               }

                                                               ++var24;
                                                            }
                                                         } while(~(var20 + 4) < ~var23);

                                                         var21 += 4;
                                                      }
                                                   }
                                                } while(var21 < 64);
                                             }

                                             var20 += 4;
                                          } while(var20 < 64);
                                       }

                                       if (!var11) {
                                          ++var18;
                                          continue;
                                       }
                                    }

                                    if (~var18 >= ~arg3) {
                                       int var27 = arg8;
                                       int var28 = arg8 - -7;
                                       int var29 = arg6;
                                       if (arg8 < 0) {
                                          var27 = 0;
                                          if (var11 && ~super.field6268 >= ~var27) {
                                             var27 = super.field6268;
                                          }
                                       } else if (~super.field6268 >= ~arg8) {
                                          var27 = super.field6268;
                                       }

                                       if (arg6 >= 0) {
                                          if (arg6 >= super.field6279) {
                                             var29 = super.field6279;
                                             if (var11) {
                                                var29 = 0;
                                             }
                                          }
                                       } else {
                                          var29 = 0;
                                       }

                                       int var30 = arg6 - -7;
                                       if (var28 < 0) {
                                          var28 = 0;
                                          if (var11 && super.field6268 <= var28) {
                                             var28 = super.field6268;
                                          }
                                       } else if (super.field6268 <= var28) {
                                          var28 = super.field6268;
                                       }

                                       label363: {
                                          if (var30 >= 0) {
                                             if (super.field6279 > var30) {
                                                if (var28 <= var27) {
                                                   ++var18;
                                                   continue;
                                                }
                                                break label363;
                                             }

                                             var30 = super.field6279;
                                             if (!var11) {
                                                if (var28 <= var27) {
                                                   ++var18;
                                                   continue;
                                                }
                                                break label363;
                                             }
                                          }

                                          var30 = 0;
                                          if (var11) {
                                             super.field6264[arg2][var27][var29] = 0;
                                             ++var29;
                                          } else if (var28 <= var27) {
                                             ++var18;
                                             continue;
                                          }
                                       }

                                       while(true) {
                                          while(var29 < var30) {
                                             super.field6264[arg2][var27][var29] = 0;
                                             ++var29;
                                          }

                                          if (!var11) {
                                             ++var27;
                                             if (var28 <= var27) {
                                                ++var18;
                                                break;
                                             }
                                          } else {
                                             ++var29;
                                          }
                                       }
                                    } else {
                                       ++var18;
                                    }
                                 } while(var18 < 4);

                                 if (var11) {
                                    throw new IllegalStateException("");
                                 }
                              }
                              continue label274;
                           }

                           if (var13 == null) {
                              var13 = new class365();
                           }

                           var13.method2968(arg5, 2);
                           if (!var11) {
                              continue label274;
                           }
                        }

                        if (var13 == null) {
                           var13 = new class365();
                        }

                        var13.method2966(123, arg5);
                        if (!var11) {
                           continue label274;
                        }
                     }

                     var31 = arg5.method2855(-31007);
                     if (var31 <= 0) {
                        continue label274;
                     }

                     var32 = 0;
                  } while(var11);

                  if (var11 || var32 < var31) {
                     while(true) {
                        class330 var33 = new class330(arg7, arg5, 2);
                        if (~var33.field5009 == -32) {
                           class756 var34 = class342.field5201.method1140(arg5.method2848(-110), 2000);
                           var33.method2688(var34.field11205, -97, var34.field11204, var34.field11206, var34.field11196);
                        }

                        if (arg7.method687() > 0) {
                           class404 var35 = var33.field5003;
                           int var36 = var35.method3246((byte)-127) >> 9;
                           int var37 = var35.method3247((byte)-118) >> 9;
                           if (var33.field5008 == arg3 && ~var14 >= ~var36 && var14 + 8 > var36 && var37 >= var16 && var37 < var16 + 8) {
                              int var38 = class467.method3624(var35.method3246((byte)-127) & 4095, 4095 & var35.method3247((byte)-115), -81, arg9) + (arg8 << 9);
                              int var39 = var38 >> 9;
                              int var40 = class571.method4293(arg9, var35.method3247((byte)-116) & 4095, 3, var35.method3246((byte)-127) & 4095) + (arg6 << 9);
                              int var41 = var40 >> 9;
                              if (var39 >= 0 && ~var41 <= -1 && super.field6268 > var39 && super.field6279 > var41) {
                                 var35.method152(var38, super.field6265[arg3][var39][var41] + -var35.method3253(0), var40, false);
                                 class218.method1883(var33);
                              }
                           }
                        }

                        ++var32;
                        if (var32 >= var31) {
                           break;
                        }
                     }
                  }
               }

               if (var13 != null) {
                  class786.method5704(arg8 >> 3, var13, arg6 >> 3, 56);
               }

               if (var12 || super.field6264 == null || super.field6264[arg2] == null) {
                  return;
               }

               int var42 = arg8 + 7;
               int var43 = arg6 - -7;
               int var44 = arg8;
               if (!var11 && ~arg8 <= ~var42) {
                  return;
               }

               do {
                  int var45 = arg6;
                  if (var11) {
                     super.field6264[arg2][var44][arg6] = 0;
                     var45 = arg6 + 1;
                  }

                  while(true) {
                     while(~var45 > ~var43) {
                        super.field6264[arg2][var44][var45] = 0;
                        ++var45;
                     }

                     if (!var11) {
                        ++var44;
                        break;
                     }

                     ++var45;
                  }
               } while(~var44 > ~var42);

               return;
            }
         }
      } catch (RuntimeException var47) {
         throw class482.method3757(var47, field7786[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7786[2] : field7786[1]) + ',' + arg6 + ',' + (arg7 != null ? field7786[2] : field7786[1]) + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IZILjava/lang/String;)V"
   )
   public static final void method3954(String arg0, int arg1, String arg2, String arg3, String arg4, int arg5, boolean arg6, int arg7, String arg8) {
      boolean var9 = client.field1786;

      try {
         if (arg6) {
            field7776 = null;
         }

         ++field7774;
         class169 var10 = class257.field3912[99];
         int var11 = 99;
         if (var9) {
            class257.field3912[var11] = class257.field3912[var11 - 1];
            --var11;
         }

         while(true) {
            while(~var11 < -1) {
               class257.field3912[var11] = class257.field3912[var11 - 1];
               --var11;
            }

            if (!var9) {
               label52: {
                  if (var10 == null) {
                     var10 = new class169(arg5, arg7, arg8, arg0, arg4, arg2, arg1, arg3);
                     if (!var9) {
                        break label52;
                     }
                  }

                  var10.method1569(arg0, arg2, arg7, arg8, arg1, arg4, arg5, (byte)-86, arg3);
               }

               class257.field3912[0] = var10;
               class314.field4859 = class1.field6;
               ++class701.field10450;
               return;
            }

            --var11;
         }
      } catch (RuntimeException var13) {
         throw class482.method3757(var13, field7786[0] + (arg0 != null ? field7786[2] : field7786[1]) + ',' + arg1 + ',' + (arg2 != null ? field7786[2] : field7786[1]) + ',' + (arg3 != null ? field7786[2] : field7786[1]) + ',' + (arg4 != null ? field7786[2] : field7786[1]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field7786[2] : field7786[1]) + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!oo",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3955(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3956(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3957(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 29;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 71;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
