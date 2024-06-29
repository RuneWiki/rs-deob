import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class372 extends class694 {
   @OriginalMember(
      owner = "client!rq",
      name = "H",
      descriptor = "I"
   )
   public int field5240 = 99;
   @OriginalMember(
      owner = "client!rq",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5250 = new String[]{method2886(method2885("0@7\r")), method2886(method2885("%\u001buOt")), method2886(method2885(",Du%!")), method2886(method2885("/S")), method2886(method2885(",Du$!")), method2886(method2885(",Du\"!")), method2886(method2885(",Du&!")), method2886(method2885(",Du#!")), method2886(method2885(",Du !")), method2886(method2885(",Du)!")), method2886(method2885(",Du'!"))};
   @OriginalMember(
      owner = "client!rq",
      name = "P",
      descriptor = "I"
   )
   public static int field5241;
   @OriginalMember(
      owner = "client!rq",
      name = "N",
      descriptor = "I"
   )
   public static int field5242;
   @OriginalMember(
      owner = "client!rq",
      name = "K",
      descriptor = "I"
   )
   public static int field5243;
   @OriginalMember(
      owner = "client!rq",
      name = "O",
      descriptor = "I"
   )
   public static int field5244;
   @OriginalMember(
      owner = "client!rq",
      name = "L",
      descriptor = "I"
   )
   public static int field5245;
   @OriginalMember(
      owner = "client!rq",
      name = "M",
      descriptor = "I"
   )
   public static int field5246;
   @OriginalMember(
      owner = "client!rq",
      name = "J",
      descriptor = "I"
   )
   public static int field5247;
   @OriginalMember(
      owner = "client!rq",
      name = "I",
      descriptor = "I"
   )
   public static int field5248;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!rq",
      name = "Q",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field5249;

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(ZLha;I)V"
   )
   public final void method2876(boolean param1, class65 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(IIIIILha;IIILfg;I)V"
   )
   public final void method2877(int arg0, int arg1, int arg2, int arg3, int arg4, class65 arg5, int arg6, int arg7, int arg8, class138 arg9, int arg10) {
      boolean var12 = client.field4273;

      try {
         ++field5247;
         if (class674.field9907.field8458.method2628((byte)-90) != 0 || class439.method3260(arg0, class316.field4223, arg2, arg10, 127)) {
            if (this.field5240 > arg4) {
               this.field5240 = arg4;
            }

            class774 var13 = class472.field6533.method3586(64, arg8);
            if (arg1 != 19077) {
               this.field5240 = -94;
            }

            if (~class674.field9907.field8447.method4066((byte)-98) != -1 || !var13.field11164) {
               int var14;
               int var15;
               label858: {
                  if (arg6 == 1 || ~arg6 == -4) {
                     var14 = var13.field11251;
                     var15 = var13.field11168;
                     if (!var12) {
                        break label858;
                     }
                  }

                  var15 = var13.field11251;
                  var14 = var13.field11168;
               }

               int var16;
               int var17;
               label783: {
                  if (~(arg2 + var15) >= ~super.field10162) {
                     var16 = (var15 - -1 >> 1) + arg2;
                     var17 = arg2 - -(var15 >> 1);
                     if (!var12) {
                        break label783;
                     }
                  }

                  var16 = arg2 + 1;
                  var17 = arg2;
               }

               int var18;
               int var19;
               label778: {
                  if (~super.field10151 <= ~(arg0 + var14)) {
                     var18 = arg0 - -(var14 >> 1);
                     var19 = (var14 + 1 >> 1) + arg0;
                     if (!var12) {
                        break label778;
                     }
                  }

                  var18 = arg0;
                  var19 = arg0 + 1;
               }

               class295 var20 = class93.field1241[arg10];
               int var21 = var20.method2221(false, var18, var17) - -var20.method2221(false, var18, var16) + (var20.method2221(false, var19, var17) - -var20.method2221(false, var19, var16)) >> 2;
               int var22 = (arg2 << 9) + (var15 << 8);
               int var23 = (arg0 << 9) + (var14 << 8);
               boolean var24 = class193.field2357 && !super.field10154 && var13.field11243;
               if (var13.method5536((byte)-35)) {
                  class30.method245(arg0, var13, arg4, (class404)null, arg6, arg2, (class680)null, true);
               }

               boolean var25 = ~arg3 == 0 && var13.field11246 == -1 && var13.field11245 == null && var13.field11186 == null && !var13.field11244 && !var13.field11158;
               if (!class106.field1336 || (!class677.method4964(arg7, (byte)-127) || var13.field11235 == 1) && (!class676.method4951((byte)94, arg7) || ~var13.field11235 != -1)) {
                  if (arg7 == 22) {
                     if (~class674.field9907.field8424.method3960((byte)-126) != -1 || var13.field11227 != 0 || var13.field11204 == 1 || var13.field11184) {
                        class525 var27;
                        label512: {
                           if (var25) {
                              class497 var26 = new class497(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg6, var24);
                              if (var26.method2270((byte)57)) {
                                 var26.method2278(false, arg5);
                              }

                              var27 = var26;
                              if (!var12) {
                                 break label512;
                              }
                           }

                           var27 = new class398(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg6, arg3);
                        }

                        class487.method3542(arg4, arg2, arg0, var27);
                        if (~var13.field11204 == -2 && arg9 != null) {
                           arg9.method1157(arg2, 24374, arg0);
                        }

                     }
                  } else if (arg7 != 10 && arg7 != 11) {
                     if (arg7 >= 12 && ~arg7 >= -18 || ~arg7 <= -19 && arg7 <= 21) {
                        class47 var34;
                        label519: {
                           if (!var25) {
                              var34 = new class771(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg2, arg2 + var15 + -1, arg0, arg0 + -1 + var14, arg7, arg6, arg3);
                              if (!var12) {
                                 break label519;
                              }
                           }

                           class607 var35 = new class607(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg2, arg2 + var15 + -1, arg0, arg0 + -1 + var14, arg7, arg6, var24);
                           var34 = var35;
                           if (var35.method2270((byte)76)) {
                              var35.method2278(false, arg5);
                           }
                        }

                        class239.method1792(var34, false);
                        if (class193.field2357 && !super.field10154 && arg7 >= 12 && arg7 <= 17 && ~arg7 != -14 && ~arg4 < -1 && ~var13.field11235 != -1) {
                           super.field10150[arg4][arg2][arg0] = (byte)class283.method2155(super.field10150[arg4][arg2][arg0], 4);
                        }

                        if (~var13.field11204 != -1 && arg9 != null) {
                           arg9.method1166(arg0, !var13.field11239, -118, var14, var13.field11183, arg2, var15);
                        }

                     } else if (arg7 == 0) {
                        int var36 = var13.field11235;
                        if (class526.field7202 && var13.field11235 == -1) {
                           var36 = 1;
                        }

                        class718 var37;
                        label553: {
                           if (!var25) {
                              var37 = new class627(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6, arg3);
                              if (!var12) {
                                 break label553;
                              }
                           }

                           class302 var38 = new class302(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6, var24);
                           var37 = var38;
                           if (var38.method2270((byte)96)) {
                              var38.method2278(false, arg5);
                           }
                        }

                        label808: {
                           class222.method1691(arg4, arg2, arg0, var37, (class718)null);
                           if (~arg6 == -1) {
                              if (class193.field2357 && var13.field11248) {
                                 var20.method1668(arg2, arg0, 50);
                                 var20.method1668(arg2, arg0 - -1, 50);
                              }

                              if (var36 != 1 || super.field10154) {
                                 break label808;
                              }

                              class755.method5441((byte)90, arg2, arg4, var13.field11190, var13.field11218, arg0, 1);
                              if (!var12) {
                                 break label808;
                              }
                           }

                           if (arg6 != 1) {
                              if (arg6 == 2) {
                                 if (class193.field2357 && var13.field11248) {
                                    var20.method1668(arg2 + 1, arg0, 50);
                                    var20.method1668(arg2 - -1, arg0 + 1, 50);
                                 }

                                 if (var36 != 1 || super.field10154) {
                                    break label808;
                                 }

                                 class755.method5441((byte)82, arg2 - -1, arg4, -var13.field11190, var13.field11218, arg0, 1);
                                 if (!var12) {
                                    break label808;
                                 }
                              }

                              if (~arg6 != -4) {
                                 break label808;
                              }

                              if (class193.field2357 && var13.field11248) {
                                 var20.method1668(arg2, arg0, 50);
                                 var20.method1668(arg2 + 1, arg0, 50);
                              }

                              if (var36 != 1 || super.field10154) {
                                 break label808;
                              }

                              class755.method5441((byte)-69, arg2, arg4, var13.field11190, var13.field11218, arg0, 2);
                              if (!var12) {
                                 break label808;
                              }
                           }

                           if (class193.field2357 && var13.field11248) {
                              var20.method1668(arg2, arg0 + 1, 50);
                              var20.method1668(arg2 - -1, arg0 - -1, 50);
                           }

                           if (~var36 == -2 && !super.field10154) {
                              class755.method5441((byte)-117, arg2, arg4, -var13.field11190, var13.field11218, arg0 - -1, 2);
                           }
                        }

                        if (var13.field11204 != 0 && arg9 != null) {
                           arg9.method1160(arg0, arg2, !var13.field11239, arg6, var13.field11183, arg7, (byte)38);
                        }

                        if (var13.field11160 != 64) {
                           class285.method2165(arg4, arg2, arg0, var13.field11160);
                        }

                     } else if (~arg7 == -2) {
                        class718 var40;
                        label579: {
                           if (var25) {
                              class302 var39 = new class302(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6, var24);
                              var40 = var39;
                              if (!var39.method2270((byte)28)) {
                                 break label579;
                              }

                              var39.method2278(false, arg5);
                              if (!var12) {
                                 break label579;
                              }
                           }

                           var40 = new class627(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6, arg3);
                        }

                        class222.method1691(arg4, arg2, arg0, var40, (class718)null);
                        if (var13.field11248 && class193.field2357) {
                           label813: {
                              if (~arg6 == -1) {
                                 var20.method1668(arg2, arg0 - -1, 50);
                                 if (!var12) {
                                    break label813;
                                 }
                              }

                              if (~arg6 == -2) {
                                 var20.method1668(arg2 + 1, arg0 + 1, 50);
                                 if (!var12) {
                                    break label813;
                                 }
                              }

                              if (~arg6 != -3) {
                                 if (arg6 != 3) {
                                    break label813;
                                 }

                                 var20.method1668(arg2, arg0, 50);
                                 if (!var12) {
                                    break label813;
                                 }
                              }

                              var20.method1668(arg2 + 1, arg0, 50);
                           }
                        }

                        if (~var13.field11204 != -1 && arg9 != null) {
                           arg9.method1160(arg0, arg2, !var13.field11239, arg6, var13.field11183, arg7, (byte)38);
                        }

                     } else if (~arg7 == -3) {
                        class718 var42;
                        class718 var43;
                        label815: {
                           int var41 = 3 & arg6 + 1;
                           if (!var25) {
                              var42 = new class627(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6 + 4, arg3);
                              var43 = new class627(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, var41, arg3);
                              if (!var12) {
                                 break label815;
                              }
                           }

                           class302 var44 = new class302(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6 - -4, var24);
                           class302 var45 = new class302(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, var41, var24);
                           if (var44.method2270((byte)47)) {
                              var44.method2278(false, arg5);
                           }

                           if (var45.method2270((byte)53)) {
                              var45.method2278(false, arg5);
                           }

                           var42 = var44;
                           var43 = var45;
                        }

                        class222.method1691(arg4, arg2, arg0, var42, var43);
                        if ((var13.field11235 == 1 || class526.field7202 && var13.field11235 == -1) && !super.field10154) {
                           label816: {
                              if (arg6 == 0) {
                                 class755.method5441((byte)89, arg2, arg4, var13.field11190, var13.field11218, arg0, 1);
                                 class755.method5441((byte)93, arg2, arg4, var13.field11190, var13.field11218, arg0 + 1, 2);
                                 if (!var12) {
                                    break label816;
                                 }
                              }

                              if (arg6 == 1) {
                                 class755.method5441((byte)127, arg2 + 1, arg4, var13.field11190, var13.field11218, arg0, 1);
                                 class755.method5441((byte)108, arg2, arg4, var13.field11190, var13.field11218, arg0 - -1, 2);
                                 if (!var12) {
                                    break label816;
                                 }
                              }

                              if (~arg6 != -3) {
                                 if (arg6 != 3) {
                                    break label816;
                                 }

                                 class755.method5441((byte)103, arg2, arg4, var13.field11190, var13.field11218, arg0, 1);
                                 class755.method5441((byte)127, arg2, arg4, var13.field11190, var13.field11218, arg0, 2);
                                 if (!var12) {
                                    break label816;
                                 }
                              }

                              class755.method5441((byte)-32, arg2 + 1, arg4, var13.field11190, var13.field11218, arg0, 1);
                              class755.method5441((byte)107, arg2, arg4, var13.field11190, var13.field11218, arg0, 2);
                           }
                        }

                        if (~var13.field11204 != -1 && arg9 != null) {
                           arg9.method1160(arg0, arg2, !var13.field11239, arg6, var13.field11183, arg7, (byte)38);
                        }

                        if (~var13.field11160 != -65) {
                           class285.method2165(arg4, arg2, arg0, var13.field11160);
                        }

                     } else if (arg7 == 3) {
                        class718 var47;
                        label632: {
                           if (var25) {
                              class302 var46 = new class302(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6, var24);
                              var47 = var46;
                              if (!var46.method2270((byte)121)) {
                                 break label632;
                              }

                              var46.method2278(false, arg5);
                              if (!var12) {
                                 break label632;
                              }
                           }

                           var47 = new class627(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg7, arg6, arg3);
                        }

                        class222.method1691(arg4, arg2, arg0, var47, (class718)null);
                        if (var13.field11248 && class193.field2357) {
                           label623: {
                              if (arg6 != 0) {
                                 if (arg6 == 1) {
                                    var20.method1668(arg2 + 1, arg0 + 1, 50);
                                    if (!var12) {
                                       break label623;
                                    }
                                 }

                                 if (~arg6 != -3) {
                                    if (~arg6 != -4) {
                                       break label623;
                                    }

                                    var20.method1668(arg2, arg0, 50);
                                    if (!var12) {
                                       break label623;
                                    }
                                 }

                                 var20.method1668(arg2 + 1, arg0, 50);
                                 if (!var12) {
                                    break label623;
                                 }
                              }

                              var20.method1668(arg2, arg0 + 1, 50);
                           }
                        }

                        if (var13.field11204 != 0 && arg9 != null) {
                           arg9.method1160(arg0, arg2, !var13.field11239, arg6, var13.field11183, arg7, (byte)38);
                        }

                     } else if (~arg7 == -10) {
                        class47 var49;
                        label648: {
                           if (var25) {
                              class607 var48 = new class607(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg2, arg2, arg0, arg0, arg7, arg6, var24);
                              if (var48.method2270((byte)-89)) {
                                 var48.method2278(false, arg5);
                              }

                              var49 = var48;
                              if (!var12) {
                                 break label648;
                              }
                           }

                           var49 = new class771(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg2, arg2 + var15 - 1, arg0, var14 - 1 + arg0, arg7, arg6, arg3);
                        }

                        class239.method1792(var49, false);
                        if (var13.field11235 == 1 && !super.field10154) {
                           byte var50;
                           label639: {
                              if (~(arg6 & 1) != -1) {
                                 var50 = 16;
                                 if (!var12) {
                                    break label639;
                                 }
                              }

                              var50 = 8;
                           }

                           class755.method5441((byte)127, arg2, arg4, 0, var13.field11218, arg0, var50);
                        }

                        if (~var13.field11204 != -1 && arg9 != null) {
                           arg9.method1166(arg0, !var13.field11239, 87, var14, var13.field11183, arg2, var15);
                        }

                        if (var13.field11160 != 64) {
                           class285.method2165(arg4, arg2, arg0, var13.field11160);
                        }

                     } else if (arg7 == 4) {
                        class95 var51;
                        label820: {
                           if (!var25) {
                              var51 = new class314(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, 0, 0, arg7, arg6, arg3);
                              if (!var12) {
                                 break label820;
                              }
                           }

                           class591 var52 = new class591(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, 0, 0, arg7, arg6);
                           if (var52.method2270((byte)-121)) {
                              var52.method2278(false, arg5);
                           }

                           var51 = var52;
                        }

                        class394.method3001(arg4, arg2, arg0, var51, (class95)null);
                     } else if (~arg7 == -6) {
                        int var53 = 65;
                        class712 var54 = (class712)class396.method3009(arg4, arg2, arg0);
                        if (var54 != null) {
                           var53 = 1 + class472.field6533.method3586(64, var54.method2281((byte)-128)).field11160;
                        }

                        class95 var55;
                        label662: {
                           if (!var25) {
                              var55 = new class314(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, class488.field6725[arg6] * var53, class650.field9108[arg6] * var53, arg7, arg6, arg3);
                              if (!var12) {
                                 break label662;
                              }
                           }

                           class591 var56 = new class591(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, class488.field6725[arg6] * var53, class650.field9108[arg6] * var53, arg7, arg6);
                           var55 = var56;
                           if (var56.method2270((byte)-127)) {
                              var56.method2278(false, arg5);
                           }
                        }

                        class394.method3001(arg4, arg2, arg0, var55, (class95)null);
                     } else if (arg7 == 6) {
                        int var57 = 33;
                        class712 var58 = (class712)class396.method3009(arg4, arg2, arg0);
                        if (var58 != null) {
                           var57 = class472.field6533.method3586(64, var58.method2281((byte)-128)).field11160 / 2 + 1;
                        }

                        class95 var59;
                        label823: {
                           if (!var25) {
                              var59 = new class314(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, class355.field5069[arg6] * var57, class358.field5093[arg6] * var57, arg7, arg6 + 4, arg3);
                              if (!var12) {
                                 break label823;
                              }
                           }

                           class591 var60 = new class591(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, class488.field6725[arg6] * var57, class650.field9108[arg6] * var57, arg7, arg6 - -4);
                           if (var60.method2270((byte)-124)) {
                              var60.method2278(false, arg5);
                           }

                           var59 = var60;
                        }

                        class394.method3001(arg4, arg2, arg0, var59, (class95)null);
                     } else if (~arg7 == -8) {
                        class95 var62;
                        label824: {
                           int var61 = 3 & arg6 + 2;
                           if (!var25) {
                              var62 = new class314(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, 0, 0, arg7, var61 + 4, arg3);
                              if (!var12) {
                                 break label824;
                              }
                           }

                           class591 var63 = new class591(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, 0, 0, arg7, var61 + 4);
                           if (var63.method2270((byte)-81)) {
                              var63.method2278(false, arg5);
                           }

                           var62 = var63;
                        }

                        class394.method3001(arg4, arg2, arg0, var62, (class95)null);
                     } else if (arg7 == 8) {
                        int var64 = 3 & arg6 + 2;
                        int var65 = 33;
                        class712 var66 = (class712)class396.method3009(arg4, arg2, arg0);
                        if (var66 != null) {
                           var65 = class472.field6533.method3586(64, var66.method2281((byte)-127)).field11160 / 2 - -1;
                        }

                        class95 var69;
                        class95 var70;
                        label688: {
                           if (var25) {
                              class591 var67 = new class591(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, class355.field5069[arg6] * var65, class358.field5093[arg6] * var65, arg7, arg6 + 4);
                              class591 var68 = new class591(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, 0, 0, arg7, var64 - -4);
                              if (var67.method2270((byte)-90)) {
                                 var67.method2278(false, arg5);
                              }

                              var69 = var67;
                              if (var68.method2270((byte)-59)) {
                                 var68.method2278(false, arg5);
                              }

                              var70 = var68;
                              if (!var12) {
                                 break label688;
                              }
                           }

                           class314 var71 = new class314(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, class355.field5069[arg6] * var65, class358.field5093[arg6] * var65, arg7, arg6 - -4, arg3);
                           var69 = var71;
                           class314 var72 = new class314(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, 0, 0, arg7, var64 + 4, arg3);
                           var70 = var72;
                        }

                        class394.method3001(arg4, arg2, arg0, var69, var70);
                     }
                  } else {
                     class607 var28;
                     int var29;
                     class47 var30;
                     label746: {
                        var28 = null;
                        if (!var25) {
                           var29 = 15;
                           var30 = new class771(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg2, arg2 - 1 + var15, arg0, arg0 + var14 + -1, arg7, arg6, arg3);
                           if (!var12) {
                              break label746;
                           }
                        }

                        class607 var31 = new class607(arg5, var13, arg4, arg10, var22, var21, var23, super.field10154, arg2, arg2 + var15 + -1, arg0, var14 + -1 + arg0, arg7, arg6, var24);
                        var28 = var31;
                        var29 = var31.method4435(false);
                        var30 = var31;
                     }

                     if (class239.method1792(var30, false)) {
                        if (var28 != null && var28.method2270((byte)42)) {
                           var28.method2278(false, arg5);
                        }

                        if (var13.field11248 && class193.field2357) {
                           if (var29 > 30) {
                              var29 = 30;
                           }

                           int var32 = 0;
                           if (var12 || var15 >= var32) {
                              do {
                                 int var33 = 0;
                                 if (var12) {
                                    var20.method1668(arg2 - -var32, arg0 + var33, var29);
                                    ++var33;
                                 }

                                 while(true) {
                                    while(~var14 <= ~var33) {
                                       var20.method1668(arg2 - -var32, arg0 + var33, var29);
                                       ++var33;
                                    }

                                    if (!var12) {
                                       ++var32;
                                       break;
                                    }

                                    ++var33;
                                 }
                              } while(var15 >= var32);
                           }
                        }
                     }

                     if (var13.field11204 != 0 && arg9 != null) {
                        arg9.method1166(arg0, !var13.field11239, 45, var14, var13.field11183, arg2, var15);
                     }

                  }
               }
            }
         }
      } catch (RuntimeException var74) {
         throw class534.method3846(var74, field5250[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field5250[1] : field5250[0]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field5250[1] : field5250[0]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(I[ILwm;Lha;BI)V"
   )
   public final void method2878(int param1, int[] param2, class594 param3, class65 param4, byte param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(ZIIILha;III[B[Lfg;I)V"
   )
   public final void method2879(boolean arg0, int arg1, int arg2, int arg3, class65 arg4, int arg5, int arg6, int arg7, byte[] arg8, class138[] arg9, int arg10) {
      boolean var12 = client.field4273;

      try {
         ++field5245;
         class594 var13 = new class594(arg8);
         int var14 = -1;

         int var10000;
         int var10001;
         label92: {
            while(true) {
               int var15 = var13.method4272((byte)126);
               if (var15 != 0) {
                  var14 += var15;
                  var10000 = 0;
                  if (var12) {
                     break;
                  }

                  int var16 = 0;

                  while(true) {
                     int var17 = var13.method4338(arg0 == 0);
                     if (var17 == 0) {
                        break;
                     }

                     var16 += var17 + -1;
                     int var18 = var16 & 63;
                     int var19 = (var16 & 4059) >> 6;
                     int var20 = var16 >> 12;
                     int var21 = var13.method4288((byte)104);
                     int var22 = var21 >> 2;
                     int var23 = 3 & var21;
                     if (~arg2 == ~var20) {
                        var10000 = ~var19;
                        var10001 = ~arg7;
                        if (var12) {
                           break label92;
                        }

                        if (var10000 <= var10001 && var19 < arg7 - -8 && var18 >= arg10 && var18 < arg10 + 8) {
                           class774 var24 = class472.field6533.method3586(64, var14);
                           int var25 = arg3 - -class316.method2371(arg1, 7 & var19, -16508, 7 & var18, var24.field11168, var24.field11251, var23);
                           int var26 = class30.method247(var24.field11168, (byte)80, var24.field11251, arg1, var19 & 7, var18 & 7, var23) + arg5;
                           if (var25 > 0 && ~var26 < -1 && ~(super.field10162 + -1) < ~var25 && var26 < super.field10151 + -1) {
                              class138 var27 = null;
                              if (!super.field10154) {
                                 int var28 = arg6;
                                 if (~(class100.field1295[1][var25][var26] & 2) == -3) {
                                    var28 = arg6 - 1;
                                 }

                                 if (var28 >= 0) {
                                    var27 = arg9[var28];
                                 }
                              }

                              this.method2877(var26, 19077, var25, -1, arg6, arg4, 3 & arg1 + var23, var22, var14, var27, arg6);
                              if (var12) {
                                 break;
                              }
                           }
                        }
                     }
                  }

                  if (!var12) {
                     continue;
                  }
               }

               var10000 = arg0;
               break;
            }

            var10001 = 1;
         }

         if (var10000 != var10001) {
            this.method2878(-112, (int[])null, (class594)null, (class65)null, (byte)-93, 75);
         }
      } catch (RuntimeException var30) {
         throw class534.method3846(var30, field5250[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5250[1] : field5250[0]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field5250[1] : field5250[0]) + ',' + (arg9 != null ? field5250[1] : field5250[0]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "<init>",
      descriptor = "(IIIZ)V"
   )
   public class372(int arg0, int arg1, int arg2, boolean arg3) {
      super(arg0, arg1, arg2, arg3, class347.field4965, class221.field2760);
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(IIIZI)Lqf;"
   )
   public final class712 method2880(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      try {
         ++field5246;
         class712 var6 = null;
         if (~arg2 == -1) {
            var6 = (class712)class396.method3009(arg0, arg1, arg4);
         }

         if (~arg2 == -2) {
            var6 = (class712)class401.method3033(arg0, arg1, arg4);
         }

         if (~arg2 == -3) {
            var6 = (class712)class737.method5341(arg0, arg1, arg4, field5249 != null ? field5249 : (field5249 = method2884(field5250[3])));
         }

         if (!arg3) {
            this.field5240 = -122;
         }

         if (~arg2 == -4) {
            var6 = (class712)class270.method2064(arg0, arg1, arg4);
         }

         return var6;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5250[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(I[BLha;[Lfg;IB)V"
   )
   public final void method2881(int arg0, byte[] arg1, class65 arg2, class138[] arg3, int arg4, byte arg5) {
      boolean var7 = client.field4273;

      try {
         ++field5241;
         class594 var8 = new class594(arg1);
         int var9 = -126 / ((arg5 - 62) / 37);
         int var10 = -1;

         label67:
         do {
            int var11 = var8.method4272((byte)31);
            if (var11 == 0) {
               break;
            }

            int var10000 = var10;
            int var10001 = var11;

            while(true) {
               var10 = var10000 + var10001;
               int var12 = 0;

               while(true) {
                  int var13 = var8.method4338(false);
                  if (var13 == 0) {
                     continue label67;
                  }

                  var12 += var13 + -1;
                  int var14 = var12 & 63;
                  int var15 = (4081 & var12) >> 6;
                  int var16 = var12 >> 12;
                  int var17 = var8.method4288((byte)119);
                  int var18 = var17 >> 2;
                  int var19 = 3 & var17;
                  int var20 = arg0 + var15;
                  int var21 = arg4 + var14;
                  if (var20 > 0) {
                     var10000 = ~var21;
                     var10001 = -1;
                     if (var7) {
                        break;
                     }

                     if (var10000 < -1 && ~(super.field10162 + -1) < ~var20 && ~(super.field10151 - 1) < ~var21) {
                        class138 var22 = null;
                        if (!super.field10154) {
                           int var23 = var16;
                           if (~(2 & class100.field1295[1][var20][var21]) == -3) {
                              var23 = var16 - 1;
                           }

                           if (var23 >= 0) {
                              var22 = arg3[var23];
                           }
                        }

                        this.method2877(var21, 19077, var20, -1, var16, arg2, var19, var18, var10, var22, var16);
                        if (var7) {
                           continue label67;
                        }
                     }
                  }
               }
            }
         } while(!var7);

      } catch (RuntimeException var25) {
         throw class534.method3846(var25, field5250[9] + arg0 + ',' + (arg1 != null ? field5250[1] : field5250[0]) + ',' + (arg2 != null ? field5250[1] : field5250[0]) + ',' + (arg3 != null ? field5250[1] : field5250[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(Lha;IILwm;IIIII[II)V"
   )
   public final void method2882(class65 param1, int param2, int param3, class594 param4, int param5, int param6, int param7, int param8, int param9, int[] param10, int param11) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(IILfg;Lha;III)V"
   )
   public final void method2883(int arg0, int arg1, class138 arg2, class65 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4273;

      try {
         ++field5244;
         class712 var9 = this.method2880(arg0, arg1, arg5, true, arg4);
         if (var9 != null) {
            label147: {
               class774 var10 = class472.field6533.method3586(64, var9.method2281((byte)-128));
               int var11 = var9.method2273((byte)-7);
               int var12 = var9.method2280(arg6 + -31277);
               if (var10.method5536((byte)-35)) {
                  class81.method791(var10, arg4, arg0, arg1, 34962);
               }

               if (var9.method2270((byte)-110)) {
                  var9.method2272(arg3, (byte)88);
               }

               if (~arg5 != -1) {
                  if (~arg5 != -2) {
                     if (~arg5 != -3) {
                        if (~arg5 != -4) {
                           break label147;
                        }

                        class537.method3872(arg0, arg1, arg4);
                        if (var10.field11204 != 1) {
                           break label147;
                        }

                        arg2.method1149(arg1, arg4, true);
                        if (!var8) {
                           break label147;
                        }
                     }

                     class525.method3792(arg0, arg1, arg4, field5249 != null ? field5249 : (field5249 = method2884(field5250[3])));
                     if (var10.field11204 != 0 && super.field10162 > var10.field11251 + arg1 && var10.field11251 + arg4 < super.field10151 && ~(var10.field11168 + arg1) > ~super.field10162 && super.field10151 > var10.field11168 + arg4) {
                        arg2.method1150(var10.field11251, arg4, !var10.field11239, var12, -1, var10.field11168, arg1, var10.field11183);
                     }

                     if (var11 != 9) {
                        break label147;
                     }

                     if ((1 & var12) == 0) {
                        class59.method445(arg0, arg1, arg4, 8, (byte)-96);
                        if (!var8) {
                           break label147;
                        }
                     }

                     class59.method445(arg0, arg1, arg4, 16, (byte)-112);
                     if (!var8) {
                        break label147;
                     }
                  }

                  class249.method1871(arg0, arg1, arg4);
                  if (!var8) {
                     break label147;
                  }
               }

               class675.method4946(arg0, arg1, arg4);
               if (var10.field11204 != 0) {
                  arg2.method1163(arg1, arg4, var11, var10.field11183, (byte)84, !var10.field11239, var12);
               }

               if (var10.field11235 == 1) {
                  label116: {
                     if (var12 != 0) {
                        if (~var12 != -2) {
                           if (~var12 != -3) {
                              if (~var12 != -4) {
                                 break label116;
                              }

                              class59.method445(arg0, arg1, arg4, 2, (byte)-61);
                              if (!var8) {
                                 break label116;
                              }
                           }

                           class59.method445(arg0, arg1 + 1, arg4, 1, (byte)-101);
                           if (!var8) {
                              break label116;
                           }
                        }

                        class59.method445(arg0, arg1, arg4 + 1, 2, (byte)-96);
                        if (!var8) {
                           break label116;
                        }
                     }

                     class59.method445(arg0, arg1, arg4, 1, (byte)-81);
                  }
               }
            }
         }

         if (arg6 != 1) {
            this.method2882((class65)null, -87, 29, (class594)null, -101, -86, 48, 29, -51, (int[])null, 67);
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field5250[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5250[1] : field5250[0]) + ',' + (arg3 != null ? field5250[1] : field5250[0]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2884(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2885(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2886(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
