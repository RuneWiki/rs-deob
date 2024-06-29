import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class131 {
   @OriginalMember(
      owner = "client!fv",
      name = "i",
      descriptor = "I"
   )
   public int field1641 = -1;
   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1644 = new String[]{method1128(method1127("J+8\u0014\u0015")), method1128(method1127("Ws8\u007f@")), method1128(method1127("_pzV")), method1128(method1127("Ws8|@")), method1128(method1127("Ws8p@")), method1128(method1127("Ws8}@")), method1128(method1127("Ws8y@")), method1128(method1127("Ws8~@")), method1128(method1127("Ws8x@")), method1128(method1127("Ws8s@")), method1128(method1127("Ws8v@")), method1128(method1127("Ws8q@")), method1128(method1127("Ws8r@")), method1128(method1127("Ws8{@"))};
   @OriginalMember(
      owner = "client!fv",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field1637 = new int[8];
   @OriginalMember(
      owner = "client!fv",
      name = "l",
      descriptor = "I"
   )
   public static int field1628 = -50;
   @OriginalMember(
      owner = "client!fv",
      name = "p",
      descriptor = "I"
   )
   public static int field1630;
   @OriginalMember(
      owner = "client!fv",
      name = "s",
      descriptor = "I"
   )
   public static int field1631;
   @OriginalMember(
      owner = "client!fv",
      name = "c",
      descriptor = "I"
   )
   public static int field1632;
   @OriginalMember(
      owner = "client!fv",
      name = "j",
      descriptor = "I"
   )
   public static int field1633;
   @OriginalMember(
      owner = "client!fv",
      name = "u",
      descriptor = "I"
   )
   public static int field1634;
   @OriginalMember(
      owner = "client!fv",
      name = "t",
      descriptor = "I"
   )
   public static int field1635;
   @OriginalMember(
      owner = "client!fv",
      name = "f",
      descriptor = "I"
   )
   public static int field1636;
   @OriginalMember(
      owner = "client!fv",
      name = "r",
      descriptor = "I"
   )
   public static int field1638;
   @OriginalMember(
      owner = "client!fv",
      name = "d",
      descriptor = "I"
   )
   public static int field1639;
   @OriginalMember(
      owner = "client!fv",
      name = "h",
      descriptor = "I"
   )
   private int field1640;
   @OriginalMember(
      owner = "client!fv",
      name = "g",
      descriptor = "I"
   )
   public static int field1642;
   @OriginalMember(
      owner = "client!fv",
      name = "b",
      descriptor = "I"
   )
   public static int field1643;
   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "J"
   )
   private long field1623;
   @OriginalMember(
      owner = "client!fv",
      name = "n",
      descriptor = "J"
   )
   private long field1624;
   @OriginalMember(
      owner = "client!fv",
      name = "q",
      descriptor = "Z"
   )
   public boolean field1625;
   @OriginalMember(
      owner = "client!fv",
      name = "o",
      descriptor = "[I"
   )
   public int[] field1626;
   @OriginalMember(
      owner = "client!fv",
      name = "k",
      descriptor = "[I"
   )
   private int[] field1627;
   @OriginalMember(
      owner = "client!fv",
      name = "m",
      descriptor = "[Lcca;"
   )
   private class258[] field1629;

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(Lhea;BILta;Lha;IIILkf;Lsg;Lpl;Ltt;)Lka;",
      line = 7
   )
   public final class497 method1115(class445 arg0, byte arg1, int arg2, class222 arg3, class66 arg4, int arg5, int arg6, int arg7, class264 arg8, class417 arg9, class676 arg10, class99 arg11) {
      int var13 = client.field4530;

      try {
         ++field1642;
         if (~this.field1641 != 0) {
            return arg0.method3363(this.field1641, false).method2868(arg5, arg4, arg10, arg6, arg2, arg7, arg9, arg11, 0, (class548)null);
         } else {
            int var14 = arg7;
            if (arg10 != null) {
               boolean var15 = false;
               boolean var16 = false;
               boolean var17 = false;
               boolean var18 = false;
               boolean var19 = true;
               boolean var20 = true;
               Object var21 = null;
               Object var22 = null;
               int var23 = arg10.field10165[arg2];
               var14 = arg7 | 32;
               int var24 = var23 >>> 16;
               class441 var25 = arg9.method3192(-28532, var24);
               int var26 = var23 & 65535;
               if (var25 != null) {
                  var16 |= var25.method3338(-108, var26);
                  var15 |= var25.method3339(-59, var26);
                  var18 |= var25.method3334(var26, 1359);
                  var17 |= arg10.field10161;
               }

               if ((arg10.field10149 || class631.field9178) && arg6 != -1 && arg10.field10165.length > arg6) {
                  int var27 = arg10.field10165[arg6];
                  int var28 = var27 >>> 16;
                  class441 var29 = ~var24 != ~var28 ? arg9.method3192(-28532, var28) : var25;
                  int var30 = var27 & 65535;
                  if (var29 != null) {
                     var16 |= var29.method3338(-43, var30);
                     var15 |= var29.method3339(123, var30);
                     var18 |= var29.method3334(var30, 1359);
                  }
               }

               if (var16) {
                  var14 |= 128;
               }

               if (var15) {
                  var14 |= 256;
               }

               if (var17) {
                  var14 |= 512;
               }

               if (var18) {
                  var14 |= 1024;
               }
            }

            class748 var31 = class134.field1713;
            class497 var32;
            synchronized(class134.field1713) {
               var32 = (class497)class134.field1713.method5454(this.field1623, 18261);
            }

            if (var32 == null || arg4.method632(var32.method326(), var14) != 0) {
               if (var32 != null) {
                  var14 = arg4.method560(var14, var32.method326());
               }

               int var10000;
               int var33;
               label292: {
                  var33 = var14;
                  byte var34 = 0;
                  int var35 = 0;
                  if (var13 != 0) {
                     var10000 = this.field1627[var35];
                  } else if (~var35 <= ~this.field1627.length) {
                     var10000 = var34;
                     if (var13 == 0) {
                        break label292;
                     }
                  } else {
                     var10000 = this.field1627[var35];
                  }

                  while(true) {
                     int var36 = var10000;
                     class258 var37 = null;
                     if (~(1073741824 & var36) == -1) {
                        if (~(var36 & Integer.MIN_VALUE) != -1) {
                           if (!arg8.method2004(108, var36 & 1073741823).method4176(false)) {
                              var34 = 1;
                              if (var13 != 0) {
                                 if (this.field1629 != null && this.field1629[var35] != null) {
                                    var37 = this.field1629[var35];
                                 }

                                 if (!arg3.method1689(1073741823 & var36, (byte)-44).method831((byte)-85, var37, this.field1625)) {
                                    var34 = 1;
                                 }

                                 ++var35;
                              } else {
                                 ++var35;
                              }
                           } else {
                              ++var35;
                           }
                        } else {
                           ++var35;
                        }
                     } else {
                        if (this.field1629 != null && this.field1629[var35] != null) {
                           var37 = this.field1629[var35];
                        }

                        if (!arg3.method1689(1073741823 & var36, (byte)-44).method831((byte)-85, var37, this.field1625)) {
                           var34 = 1;
                        }

                        ++var35;
                     }

                     if (~var35 <= ~this.field1627.length) {
                        var10000 = var34;
                        if (var13 == 0) {
                           break;
                        }
                     } else {
                        var10000 = this.field1627[var35];
                     }
                  }
               }

               if (var10000 != 0) {
                  return null;
               }

               label245: {
                  class134[] var38 = new class134[this.field1627.length];
                  int var39 = 0;
                  int var40 = 0;
                  class134 var45;
                  if (var13 != 0) {
                     var10000 = this.field1627[var40];
                  } else if (var40 >= this.field1627.length) {
                     var33 = var14 | 16384;
                     var45 = new class134(var38, var39);
                     var32 = arg4.method547(var45, var33, class124.field1515, 64, 768);
                     var10000 = 0;
                     if (var13 == 0) {
                        break label245;
                     }
                  } else {
                     var10000 = this.field1627[var40];
                  }

                  while(true) {
                     int var41 = var10000;
                     class258 var42 = null;
                     class134 var44;
                     if ((var41 & 1073741824) == 0) {
                        if ((Integer.MIN_VALUE & var41) != 0) {
                           class134 var43 = arg8.method2004(124, var41 & 1073741823).method4171(-71);
                           if (var43 != null) {
                              var38[var39++] = var43;
                              if (var13 != 0) {
                                 if (this.field1629 != null && this.field1629[var40] != null) {
                                    var42 = this.field1629[var40];
                                 }

                                 var44 = arg3.method1689(1073741823 & var41, (byte)75).method840(var42, 0, this.field1625);
                                 if (var44 != null) {
                                    var38[var39++] = var44;
                                 }

                                 ++var40;
                              } else {
                                 ++var40;
                              }
                           } else {
                              ++var40;
                           }
                        } else {
                           ++var40;
                        }
                     } else {
                        if (this.field1629 != null && this.field1629[var40] != null) {
                           var42 = this.field1629[var40];
                        }

                        var44 = arg3.method1689(1073741823 & var41, (byte)75).method840(var42, 0, this.field1625);
                        if (var44 != null) {
                           var38[var39++] = var44;
                        }

                        ++var40;
                     }

                     if (var40 >= this.field1627.length) {
                        var33 |= 16384;
                        var45 = new class134(var38, var39);
                        var32 = arg4.method547(var45, var33, class124.field1515, 64, 768);
                        var10000 = 0;
                        if (var13 == 0) {
                           break;
                        }
                     } else {
                        var10000 = this.field1627[var40];
                     }
                  }
               }

               int var46 = var10000;
               if (var13 != 0 || var46 < 5) {
                  do {
                     int var47 = 0;
                     if (var13 != 0) {
                        if (class314.field4496[var47][var46].length > this.field1626[var46]) {
                           var32.method320(class680.field10218[var47][var46], class314.field4496[var47][var46][this.field1626[var46]]);
                        }

                        ++var47;
                     }

                     while(true) {
                        while(class314.field4496.length > var47) {
                           if (class314.field4496[var47][var46].length > this.field1626[var46]) {
                              var32.method320(class680.field10218[var47][var46], class314.field4496[var47][var46][this.field1626[var46]]);
                           }

                           ++var47;
                        }

                        if (var13 == 0) {
                           ++var46;
                           break;
                        }

                        ++var47;
                     }
                  } while(var46 < 5);
               }

               var32.method333(var14);
               class748 var48 = class134.field1713;
               synchronized(class134.field1713) {
                  class134.field1713.method5455(-2049, var32, this.field1623);
               }
            }

            if (arg10 == null) {
               return var32;
            } else {
               int var49 = -56 / ((-30 - arg1) / 58);
               var32.method343((byte)4, var14, true);
               return arg10.method4934(arg7, (byte)-82, arg6, arg2, arg5, var32);
            }
         }
      } catch (RuntimeException var55) {
         throw class670.method4877(var55, field1644[8] + (arg0 != null ? field1644[0] : field1644[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1644[0] : field1644[2]) + ',' + (arg4 != null ? field1644[0] : field1644[2]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field1644[0] : field1644[2]) + ',' + (arg9 != null ? field1644[0] : field1644[2]) + ',' + (arg10 != null ? field1644[0] : field1644[2]) + ',' + (arg11 != null ? field1644[0] : field1644[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(Lsg;Lha;Lpl;Lkf;I[Lvr;ILta;[IILhea;IIZIIILtt;Lpl;ILik;)Lka;",
      line = 217
   )
   public final class497 method1116(class417 arg0, class66 arg1, class676 arg2, class264 arg3, int arg4, class146[] arg5, int arg6, class222 arg7, int[] arg8, int arg9, class445 arg10, int arg11, int arg12, boolean arg13, int arg14, int arg15, int arg16, class99 arg17, class676 arg18, int arg19, class219 arg20) {
      int var22 = client.field4530;

      try {
         ++field1633;
         if (this.field1641 != -1) {
            return arg10.method3363(this.field1641, false).method2863(arg14, (class548)null, arg18, arg15, arg6, (byte)37, arg5, arg0, arg8, arg2, arg12, arg11, arg20, arg17, arg1, arg16, arg19, arg9);
         } else {
            int var23 = arg12;
            long var24 = this.field1623;
            int[] var26 = this.field1627;
            boolean var27 = false;
            boolean var28 = false;
            if (arg18 != null && (arg18.field10157 >= 0 || arg18.field10180 >= 0)) {
               var26 = new int[this.field1627.length];
               int var29 = 0;
               if (var22 != 0) {
                  var26[var29] = this.field1627[var29];
                  ++var29;
               }

               while(true) {
                  while(var26.length > var29) {
                     var26[var29] = this.field1627[var29];
                     ++var29;
                  }

                  if (var22 == 0) {
                     if (arg18.field10157 >= 0) {
                        label1187: {
                           if (~arg18.field10157 == -65536) {
                              var27 = true;
                              var24 ^= -4294967296L;
                              var26[5] = 0;
                              if (var22 == 0) {
                                 break label1187;
                              }
                           }

                           var26[5] = class379.method2928(1073741824, arg18.field10157);
                           var24 ^= (long)var26[5] << 32;
                        }
                     }

                     if (arg18.field10180 >= 0) {
                        label1104: {
                           if (~arg18.field10180 != -65536) {
                              var26[3] = class379.method2928(arg18.field10180, 1073741824);
                              var24 ^= (long)var26[3];
                              if (var22 == 0) {
                                 break label1104;
                              }
                           }

                           var26[3] = 0;
                           var24 ^= 4294967295L;
                        }

                        var28 = true;
                     }
                     break;
                  }

                  ++var29;
               }
            }

            boolean var30 = false;
            boolean var31 = false;
            boolean var32 = false;
            boolean var33 = arg18 != null || arg2 != null;
            int var34 = arg5 == null ? 0 : arg5.length;
            int var35 = 0;
            class676 var36;
            int var37;
            int var38;
            int var39;
            int var40;
            int var41;
            int var42;
            if (var22 != 0) {
               class388.field5931[var35] = null;
               if (arg5[var35] != null) {
                  var36 = arg0.method3189(arg5[var35].field1836, (byte)-42);
                  if (var36.field10165 != null) {
                     var33 = true;
                     class286.field4012[var35] = var36;
                     var37 = arg5[var35].field1833;
                     var38 = arg5[var35].field1834;
                     var39 = var36.field10165[var37];
                     class388.field5931[var35] = arg0.method3192(-28532, var39 >>> 16);
                     var40 = var39 & 65535;
                     class778.field11364[var35] = var40;
                     if (class388.field5931[var35] != null) {
                        var31 |= class388.field5931[var35].method3338(-42, var40);
                        var30 |= class388.field5931[var35].method3339(125, var40);
                        var32 |= class388.field5931[var35].method3334(var40, arg4 + 1359);
                     }

                     if (!var36.field10149) {
                        if (class631.field9178) {
                           if (var38 != -1) {
                              if (~var38 > ~var36.field10165.length) {
                                 class397.field6112[var35] = var36.field10151[var37];
                                 class197.field2444[var35] = arg5[var35].field1831;
                                 var41 = var36.field10165[var38];
                                 class451.field6866[var35] = arg0.method3192(-28532, var41 >>> 16);
                                 var42 = var41 & 65535;
                                 class651.field9495[var35] = var42;
                                 if (class451.field6866[var35] != null) {
                                    var31 |= class451.field6866[var35].method3338(arg4 + -21, var42);
                                    var30 |= class451.field6866[var35].method3339(125, var42);
                                    var32 |= class451.field6866[var35].method3334(var42, 1359);
                                    if (var22 != 0) {
                                       class397.field6112[var35] = 0;
                                       class197.field2444[var35] = 0;
                                       class451.field6866[var35] = null;
                                       class651.field9495[var35] = -1;
                                       ++var35;
                                    } else {
                                       ++var35;
                                    }
                                 } else {
                                    ++var35;
                                 }
                              } else {
                                 class397.field6112[var35] = 0;
                                 class197.field2444[var35] = 0;
                                 class451.field6866[var35] = null;
                                 class651.field9495[var35] = -1;
                                 ++var35;
                              }
                           } else {
                              class397.field6112[var35] = 0;
                              class197.field2444[var35] = 0;
                              class451.field6866[var35] = null;
                              class651.field9495[var35] = -1;
                              ++var35;
                           }
                        } else {
                           class397.field6112[var35] = 0;
                           class197.field2444[var35] = 0;
                           class451.field6866[var35] = null;
                           class651.field9495[var35] = -1;
                           ++var35;
                        }
                     } else if (var38 != -1) {
                        if (~var38 > ~var36.field10165.length) {
                           class397.field6112[var35] = var36.field10151[var37];
                           class197.field2444[var35] = arg5[var35].field1831;
                           var41 = var36.field10165[var38];
                           class451.field6866[var35] = arg0.method3192(-28532, var41 >>> 16);
                           var42 = var41 & 65535;
                           class651.field9495[var35] = var42;
                           if (class451.field6866[var35] != null) {
                              var31 |= class451.field6866[var35].method3338(arg4 + -21, var42);
                              var30 |= class451.field6866[var35].method3339(125, var42);
                              var32 |= class451.field6866[var35].method3334(var42, 1359);
                              if (var22 != 0) {
                                 class397.field6112[var35] = 0;
                                 class197.field2444[var35] = 0;
                                 class451.field6866[var35] = null;
                                 class651.field9495[var35] = -1;
                                 ++var35;
                              } else {
                                 ++var35;
                              }
                           } else {
                              ++var35;
                           }
                        } else {
                           class397.field6112[var35] = 0;
                           class197.field2444[var35] = 0;
                           class451.field6866[var35] = null;
                           class651.field9495[var35] = -1;
                           ++var35;
                        }
                     } else {
                        class397.field6112[var35] = 0;
                        class197.field2444[var35] = 0;
                        class451.field6866[var35] = null;
                        class651.field9495[var35] = -1;
                        ++var35;
                     }
                  } else {
                     ++var35;
                  }
               } else {
                  ++var35;
               }
            }

            while(true) {
               if (~var35 <= ~var34) {
                  int var43 = -1;
                  int var44 = -1;
                  int var45 = 0;
                  class441 var46 = null;
                  class441 var47 = null;
                  int var48 = -1;
                  int var49 = -1;
                  int var50 = 0;
                  class441 var51 = null;
                  class441 var52 = null;
                  if (var22 == 0) {
                     if (var33) {
                        var23 = arg12 | 32;
                        if (arg18 != null) {
                           int var53 = arg18.field10165[arg14];
                           int var54 = var53 >>> 16;
                           var46 = arg0.method3192(-28532, var54);
                           var43 = var53 & 65535;
                           if (var46 != null) {
                              var31 |= var46.method3338(arg4 ^ -117, var43);
                              var30 |= var46.method3339(124, var43);
                              var32 |= var46.method3334(var43, arg4 + 1359);
                           }

                           if ((arg18.field10149 || class631.field9178) && ~arg9 != 0 && arg9 < arg18.field10165.length) {
                              var45 = arg18.field10151[arg14];
                              int var55 = arg18.field10165[arg9];
                              int var56 = var55 >>> 16;
                              var44 = var55 & 65535;
                              var47 = ~var54 != ~var56 ? arg0.method3192(-28532, var56) : var46;
                              if (var47 != null) {
                                 var31 |= var47.method3338(123, var44);
                                 var30 |= var47.method3339(16, var44);
                                 var32 |= var47.method3334(var44, 1359);
                              }
                           }
                        }

                        if (arg2 != null) {
                           int var57 = arg2.field10165[arg15];
                           int var58 = var57 >>> 16;
                           var51 = arg0.method3192(arg4 + -28532, var58);
                           var48 = var57 & 65535;
                           if (var51 != null) {
                              var31 |= var51.method3338(-92, var48);
                              var30 |= var51.method3339(6, var48);
                              var32 |= var51.method3334(var48, 1359);
                           }

                           if ((arg2.field10149 || class631.field9178) && arg19 != -1 && arg19 < arg2.field10165.length) {
                              var50 = arg2.field10151[arg15];
                              int var59 = arg2.field10165[arg19];
                              int var60 = var59 >>> 16;
                              var49 = var59 & 65535;
                              var52 = ~var58 == ~var60 ? var51 : arg0.method3192(-28532, var60);
                              if (var52 != null) {
                                 var31 |= var52.method3338(arg4 ^ -11, var49);
                                 var30 |= var52.method3339(arg4 + -80, var49);
                                 var32 |= var52.method3334(var49, 1359);
                              }
                           }
                        }

                        if (var31) {
                           var23 |= 128;
                        }

                        if (var30) {
                           var23 |= 256;
                        }

                        if (var32) {
                           var23 |= 1024;
                        }
                     }

                     class748 var61 = class402.field6170;
                     class497 var62;
                     synchronized(class402.field6170) {
                        var62 = (class497)class402.field6170.method5454(var24, 18261);
                     }

                     class283 var63 = null;
                     if (this.field1640 != -1) {
                        var63 = arg20.method1655(this.field1640, (byte)-96);
                     }

                     if (var62 == null || arg1.method632(var62.method326(), var23) != 0) {
                        if (var62 != null) {
                           var23 = arg1.method560(var23, var62.method326());
                        }

                        byte var65 = 0;
                        int var66 = 0;
                        int var67;
                        class258 var68;
                        boolean var69;
                        if (var22 != 0) {
                           var67 = var26[var66];
                           var68 = null;
                           var69 = var66 == 5 ? (!var27 ? (~var66 == -4 ? var28 : false) : true) : (~var66 == -4 ? var28 : false);
                           if ((var67 & 1073741824) == 0) {
                              if ((Integer.MIN_VALUE & var67) != 0) {
                                 if (!arg3.method2004(119, var67 & 1073741823).method4175((byte)-53)) {
                                    var65 = 1;
                                    if (var22 != 0) {
                                       if (!var69 && this.field1629 != null && this.field1629[var66] != null) {
                                          var68 = this.field1629[var66];
                                       }

                                       if (!arg7.method1689(var67 & 1073741823, (byte)102).method836(false, this.field1625, var68)) {
                                          var65 = 1;
                                       }

                                       ++var66;
                                    } else {
                                       ++var66;
                                    }
                                 } else {
                                    ++var66;
                                 }
                              } else {
                                 ++var66;
                              }
                           } else {
                              if (!var69 && this.field1629 != null && this.field1629[var66] != null) {
                                 var68 = this.field1629[var66];
                              }

                              if (!arg7.method1689(var67 & 1073741823, (byte)102).method836(false, this.field1625, var68)) {
                                 var65 = 1;
                              }

                              ++var66;
                           }
                        }

                        while(true) {
                           int var10000;
                           if (~var66 <= ~var26.length) {
                              var10000 = var65;
                              if (var22 == 0) {
                                 if (var65 != 0) {
                                    if (~this.field1624 != 0L) {
                                       class748 var70 = class402.field6170;
                                       synchronized(class402.field6170) {
                                          var62 = (class497)class402.field6170.method5454(this.field1624, arg4 ^ 18261);
                                       }
                                    }

                                    if (var62 != null && arg1.method632(var62.method326(), var23) == 0) {
                                       break;
                                    }

                                    return null;
                                 }

                                 class134[] var71;
                                 label744: {
                                    var71 = new class134[var26.length];
                                    int var72 = 0;
                                    int var73;
                                    class258 var74;
                                    boolean var107;
                                    if (var22 != 0) {
                                       var73 = var26[var72];
                                       var74 = null;
                                       var107 = var72 == 5 ? (!var27 ? (var72 == 3 ? var28 : false) : true) : (var72 == 3 ? var28 : false);
                                    } else {
                                       if (~var26.length >= ~var72) {
                                          break label744;
                                       }

                                       var73 = var26[var72];
                                       var74 = null;
                                       var107 = var72 == 5 ? (!var27 ? (var72 == 3 ? var28 : false) : true) : (var72 == 3 ? var28 : false);
                                    }

                                    while(true) {
                                       boolean var75 = var107;
                                       class134 var77;
                                       if (~(1073741824 & var73) == -1) {
                                          if (~(var73 & Integer.MIN_VALUE) != -1) {
                                             class134 var76 = arg3.method2004(arg4 ^ 85, var73 & 1073741823).method4174(-6706);
                                             if (var76 != null) {
                                                var71[var72] = var76;
                                                if (var22 != 0) {
                                                   if (!var75 && this.field1629 != null && this.field1629[var72] != null) {
                                                      var74 = this.field1629[var72];
                                                   }

                                                   var77 = arg7.method1689(1073741823 & var73, (byte)116).method827((byte)45, var74, this.field1625);
                                                   if (var77 != null) {
                                                      var71[var72] = var77;
                                                   }

                                                   ++var72;
                                                } else {
                                                   ++var72;
                                                }
                                             } else {
                                                ++var72;
                                             }
                                          } else {
                                             ++var72;
                                          }
                                       } else {
                                          if (!var75 && this.field1629 != null && this.field1629[var72] != null) {
                                             var74 = this.field1629[var72];
                                          }

                                          var77 = arg7.method1689(1073741823 & var73, (byte)116).method827((byte)45, var74, this.field1625);
                                          if (var77 != null) {
                                             var71[var72] = var77;
                                          }

                                          ++var72;
                                       }

                                       if (~var26.length >= ~var72) {
                                          break;
                                       }

                                       var73 = var26[var72];
                                       var74 = null;
                                       var107 = var72 == 5 ? (!var27 ? (var72 == 3 ? var28 : false) : true) : (var72 == 3 ? var28 : false);
                                    }
                                 }

                                 if (var63 != null && var63.field3967 != null) {
                                    int var78 = 0;
                                    if (var22 != 0 || ~var63.field3967.length < ~var78) {
                                       do {
                                          if (var71[var78] != null) {
                                             int var79 = 0;
                                             int var80 = 0;
                                             int var81 = 0;
                                             int var82 = 0;
                                             int var83 = 0;
                                             int var84 = 0;
                                             if (var63.field3967[var78] != null) {
                                                var82 = var63.field3967[var78][3] << 3;
                                                var83 = var63.field3967[var78][4] << 3;
                                                var80 = var63.field3967[var78][1];
                                                var81 = var63.field3967[var78][2];
                                                var79 = var63.field3967[var78][0];
                                                var84 = var63.field3967[var78][5] << 3;
                                             }

                                             if (~var82 == -1) {
                                                if (~var83 == -1) {
                                                   if (~var84 != -1) {
                                                      var71[var78].method1146(806800366, var84, var82, var83);
                                                   }
                                                } else {
                                                   var71[var78].method1146(806800366, var84, var82, var83);
                                                }
                                             } else {
                                                var71[var78].method1146(806800366, var84, var82, var83);
                                             }

                                             if (var79 == 0) {
                                                if (~var80 == -1) {
                                                   if (~var81 != -1) {
                                                      var71[var78].method1145(var80, var81, var79, arg4);
                                                      ++var78;
                                                   } else {
                                                      ++var78;
                                                   }
                                                } else {
                                                   var71[var78].method1145(var80, var81, var79, arg4);
                                                   ++var78;
                                                }
                                             } else {
                                                var71[var78].method1145(var80, var81, var79, arg4);
                                                ++var78;
                                             }
                                          } else {
                                             ++var78;
                                          }
                                       } while(~var63.field3967.length < ~var78);
                                    }
                                 }

                                 byte var108;
                                 label574: {
                                    int var85 = var23 | 16384;
                                    class134 var86 = new class134(var71, var71.length);
                                    var62 = arg1.method547(var86, var85, class124.field1515, 64, 850);
                                    int var87 = 0;
                                    if (var22 != 0) {
                                       var108 = 0;
                                    } else if (var87 >= 5) {
                                       var108 = arg13;
                                       if (var22 == 0) {
                                          break label574;
                                       }
                                    } else {
                                       var108 = 0;
                                    }

                                    label573:
                                    while(true) {
                                       int var88 = var108;
                                       if (var22 != 0) {
                                          if (~this.field1626[var87] > ~class314.field4496[var88][var87].length) {
                                             var62.method320(class680.field10218[var88][var87], class314.field4496[var88][var87][this.field1626[var87]]);
                                          }

                                          ++var88;
                                       }

                                       while(true) {
                                          while(var88 < class314.field4496.length) {
                                             if (~this.field1626[var87] > ~class314.field4496[var88][var87].length) {
                                                var62.method320(class680.field10218[var88][var87], class314.field4496[var88][var87][this.field1626[var87]]);
                                             }

                                             ++var88;
                                          }

                                          if (var22 == 0) {
                                             ++var87;
                                             if (var87 >= 5) {
                                                var108 = arg13;
                                                if (var22 == 0) {
                                                   break label573;
                                                }
                                             } else {
                                                var108 = 0;
                                             }
                                             break;
                                          }

                                          ++var88;
                                       }
                                    }
                                 }

                                 if (var108 != 0) {
                                    var62.method333(var23);
                                    class748 var89 = class402.field6170;
                                    synchronized(class402.field6170) {
                                       class402.field6170.method5455(-2049, var62, var24);
                                    }

                                    this.field1624 = var24;
                                 }
                                 break;
                              }
                           } else {
                              var10000 = var26[var66];
                           }

                           var67 = var10000;
                           var68 = null;
                           var69 = var66 == 5 ? (!var27 ? (~var66 == -4 ? var28 : false) : true) : (~var66 == -4 ? var28 : false);
                           if ((var67 & 1073741824) == 0) {
                              if ((Integer.MIN_VALUE & var67) != 0) {
                                 if (!arg3.method2004(119, var67 & 1073741823).method4175((byte)-53)) {
                                    var65 = 1;
                                    if (var22 != 0) {
                                       if (!var69 && this.field1629 != null && this.field1629[var66] != null) {
                                          var68 = this.field1629[var66];
                                       }

                                       if (!arg7.method1689(var67 & 1073741823, (byte)102).method836(false, this.field1625, var68)) {
                                          var65 = 1;
                                       }

                                       ++var66;
                                    } else {
                                       ++var66;
                                    }
                                 } else {
                                    ++var66;
                                 }
                              } else {
                                 ++var66;
                              }
                           } else {
                              if (!var69 && this.field1629 != null && this.field1629[var66] != null) {
                                 var68 = this.field1629[var66];
                              }

                              if (!arg7.method1689(var67 & 1073741823, (byte)102).method836(false, this.field1625, var68)) {
                                 var65 = 1;
                              }

                              ++var66;
                           }
                        }
                     }

                     class497 var90 = var62.method343((byte)4, var23, true);
                     byte var91 = 0;
                     if (arg8 != null) {
                        int var92 = 0;
                        if (var22 != 0 || arg8.length > var92) {
                           do {
                              if (~arg8[var92] != 0) {
                                 var91 = 1;
                              }

                              ++var92;
                           } while(arg8.length > var92);
                        }
                     }

                     if (!var33 && var91 == 0) {
                        return var90;
                     }

                     class540[] var93 = null;
                     if (var63 != null) {
                        var93 = var63.method2160((byte)-46, arg1);
                     }

                     int var94;
                     int var95;
                     label494: {
                        if (var91 != 0) {
                           if (var93 != null) {
                              var94 = 0;
                              if (var22 != 0) {
                                 if (var93[var94] != null) {
                                    var90.method335(var93[var94], 1 << var94, true);
                                 }

                                 ++var94;
                              }
                           } else {
                              var94 = arg4;
                              var95 = 1;
                              if (var22 == 0) {
                                 break label494;
                              }

                              var94 = arg4 + 1;
                           }
                        } else {
                           var94 = arg4;
                           var95 = 1;
                           if (var22 == 0) {
                              break label494;
                           }

                           var94 = arg4 + 1;
                        }

                        while(true) {
                           while(~arg8.length < ~var94) {
                              if (var93[var94] != null) {
                                 var90.method335(var93[var94], 1 << var94, true);
                              }

                              ++var94;
                           }

                           var94 = arg4;
                           var95 = 1;
                           if (var22 == 0) {
                              break;
                           }

                           var94 = arg4 + 1;
                        }
                     }

                     if (var22 != 0) {
                        if (class388.field5931[var94] != null) {
                           var90.method3706(class451.field6866[var94], var95, class651.field9495[var94], -6073, class388.field5931[var94], class197.field2444[var94] + -1, 0, (int[])null, false, class778.field11364[var94], class397.field6112[var94]);
                        }

                        ++var94;
                        var95 <<= 1;
                     }

                     while(true) {
                        while(~var34 < ~var94) {
                           if (class388.field5931[var94] != null) {
                              var90.method3706(class451.field6866[var94], var95, class651.field9495[var94], -6073, class388.field5931[var94], class197.field2444[var94] + -1, 0, (int[])null, false, class778.field11364[var94], class397.field6112[var94]);
                           }

                           ++var94;
                           var95 <<= 1;
                        }

                        if (var22 == 0) {
                           if (var91 != 0) {
                              int var96 = 0;
                              if (var22 != 0 || ~var96 > ~arg8.length) {
                                 do {
                                    if (~arg8[var96] != 0) {
                                       int var97 = arg8[var96] + -arg11;
                                       int var98 = var97 & 16383;
                                       class540 var99 = arg1.method559();
                                       var99.method1516(var98);
                                       var90.method335(var99, 1 << var96, false);
                                    }

                                    ++var96;
                                 } while(~var96 > ~arg8.length);
                              }
                           }

                           if (var91 != 0 && var93 != null) {
                              int var100 = 0;
                              if (var22 != 0 || ~var100 > ~arg8.length) {
                                 do {
                                    if (var93[var100] != null) {
                                       var90.method335(var93[var100], 1 << var100, false);
                                    }

                                    ++var100;
                                 } while(~var100 > ~arg8.length);
                              }
                           }

                           label1281: {
                              if (var46 == null || var51 == null) {
                                 if (var46 != null) {
                                    var90.method3710(18158, var44, var47, false, arg6 + -1, var45, 0, var46, var43);
                                    if (var22 == 0) {
                                       break label1281;
                                    }
                                 }

                                 if (var51 == null) {
                                    break label1281;
                                 }

                                 var90.method3710(arg4 + 18158, var49, var52, false, arg16 + -1, var50, 0, var51, var48);
                                 if (var22 == 0) {
                                    break label1281;
                                 }
                              }

                              var90.method3709(var52, var46, var45, var51, arg6 - 1, var44, false, arg18.field10153, var43, var49, var50, 65535, arg16 + -1, var48, var47);
                           }

                           int var101 = 0;
                           if (var22 != 0) {
                              class388.field5931[var101] = null;
                              class451.field6866[var101] = null;
                              class286.field4012[var101] = null;
                              ++var101;
                           }

                           while(true) {
                              while(var101 < var34) {
                                 class388.field5931[var101] = null;
                                 class451.field6866[var101] = null;
                                 class286.field4012[var101] = null;
                                 ++var101;
                              }

                              if (var22 == 0) {
                                 return var90;
                              }

                              ++var101;
                           }
                        }

                        var95 = var91;
                     }
                  }
               } else {
                  class388.field5931[var35] = null;
               }

               if (arg5[var35] != null) {
                  var36 = arg0.method3189(arg5[var35].field1836, (byte)-42);
                  if (var36.field10165 != null) {
                     var33 = true;
                     class286.field4012[var35] = var36;
                     var37 = arg5[var35].field1833;
                     var38 = arg5[var35].field1834;
                     var39 = var36.field10165[var37];
                     class388.field5931[var35] = arg0.method3192(-28532, var39 >>> 16);
                     var40 = var39 & 65535;
                     class778.field11364[var35] = var40;
                     if (class388.field5931[var35] != null) {
                        var31 |= class388.field5931[var35].method3338(-42, var40);
                        var30 |= class388.field5931[var35].method3339(125, var40);
                        var32 |= class388.field5931[var35].method3334(var40, arg4 + 1359);
                     }

                     if (!var36.field10149) {
                        if (class631.field9178) {
                           if (var38 != -1) {
                              if (~var38 > ~var36.field10165.length) {
                                 class397.field6112[var35] = var36.field10151[var37];
                                 class197.field2444[var35] = arg5[var35].field1831;
                                 var41 = var36.field10165[var38];
                                 class451.field6866[var35] = arg0.method3192(-28532, var41 >>> 16);
                                 var42 = var41 & 65535;
                                 class651.field9495[var35] = var42;
                                 if (class451.field6866[var35] != null) {
                                    var31 |= class451.field6866[var35].method3338(arg4 + -21, var42);
                                    var30 |= class451.field6866[var35].method3339(125, var42);
                                    var32 |= class451.field6866[var35].method3334(var42, 1359);
                                    if (var22 != 0) {
                                       class397.field6112[var35] = 0;
                                       class197.field2444[var35] = 0;
                                       class451.field6866[var35] = null;
                                       class651.field9495[var35] = -1;
                                       ++var35;
                                    } else {
                                       ++var35;
                                    }
                                 } else {
                                    ++var35;
                                 }
                              } else {
                                 class397.field6112[var35] = 0;
                                 class197.field2444[var35] = 0;
                                 class451.field6866[var35] = null;
                                 class651.field9495[var35] = -1;
                                 ++var35;
                              }
                           } else {
                              class397.field6112[var35] = 0;
                              class197.field2444[var35] = 0;
                              class451.field6866[var35] = null;
                              class651.field9495[var35] = -1;
                              ++var35;
                           }
                        } else {
                           class397.field6112[var35] = 0;
                           class197.field2444[var35] = 0;
                           class451.field6866[var35] = null;
                           class651.field9495[var35] = -1;
                           ++var35;
                        }
                     } else if (var38 != -1) {
                        if (~var38 > ~var36.field10165.length) {
                           class397.field6112[var35] = var36.field10151[var37];
                           class197.field2444[var35] = arg5[var35].field1831;
                           var41 = var36.field10165[var38];
                           class451.field6866[var35] = arg0.method3192(-28532, var41 >>> 16);
                           var42 = var41 & 65535;
                           class651.field9495[var35] = var42;
                           if (class451.field6866[var35] != null) {
                              var31 |= class451.field6866[var35].method3338(arg4 + -21, var42);
                              var30 |= class451.field6866[var35].method3339(125, var42);
                              var32 |= class451.field6866[var35].method3334(var42, 1359);
                              if (var22 != 0) {
                                 class397.field6112[var35] = 0;
                                 class197.field2444[var35] = 0;
                                 class451.field6866[var35] = null;
                                 class651.field9495[var35] = -1;
                                 ++var35;
                              } else {
                                 ++var35;
                              }
                           } else {
                              ++var35;
                           }
                        } else {
                           class397.field6112[var35] = 0;
                           class197.field2444[var35] = 0;
                           class451.field6866[var35] = null;
                           class651.field9495[var35] = -1;
                           ++var35;
                        }
                     } else {
                        class397.field6112[var35] = 0;
                        class197.field2444[var35] = 0;
                        class451.field6866[var35] = null;
                        class651.field9495[var35] = -1;
                        ++var35;
                     }
                  } else {
                     ++var35;
                  }
               } else {
                  ++var35;
               }
            }
         }
      } catch (RuntimeException var106) {
         throw class670.method4877(var106, field1644[4] + (arg0 != null ? field1644[0] : field1644[2]) + ',' + (arg1 != null ? field1644[0] : field1644[2]) + ',' + (arg2 != null ? field1644[0] : field1644[2]) + ',' + (arg3 != null ? field1644[0] : field1644[2]) + ',' + arg4 + ',' + (arg5 != null ? field1644[0] : field1644[2]) + ',' + arg6 + ',' + (arg7 != null ? field1644[0] : field1644[2]) + ',' + (arg8 != null ? field1644[0] : field1644[2]) + ',' + arg9 + ',' + (arg10 != null ? field1644[0] : field1644[2]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16 + ',' + (arg17 != null ? field1644[0] : field1644[2]) + ',' + (arg18 != null ? field1644[0] : field1644[2]) + ',' + arg19 + ',' + (arg20 != null ? field1644[0] : field1644[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(ILta;II)V",
      line = 783
   )
   public final void method1117(int arg0, class222 arg1, int arg2, int arg3) {
      try {
         ++field1632;
         if (arg2 == arg3) {
            this.field1627[arg0] = 0;
         } else if (arg1.method1689(arg2, (byte)-83) != null) {
            this.field1627[arg0] = class379.method2928(arg2, 1073741824);
            this.method1123((byte)-11);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1644[1] + arg0 + ',' + (arg1 != null ? field1644[0] : field1644[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(III)V",
      line = 802
   )
   public final void method1118(int arg0, int arg1, int arg2) {
      try {
         ++field1636;
         this.field1626[arg1] = arg0;
         this.method1123((byte)-11);
         if (arg2 != 128) {
            method1121(12, -87, (byte)99);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1644[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IILpl;IILsg;Lkf;IILha;II)Lka;",
      line = 814
   )
   public final class497 method1119(int arg0, int arg1, class676 arg2, int arg3, int arg4, class417 arg5, class264 arg6, int arg7, int arg8, class66 arg9, int arg10, int arg11) {
      int var13 = client.field4530;

      try {
         ++field1643;
         int var14 = arg0;
         if (arg2 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var14 = arg0 | 32;
            Object var22 = null;
            int var23 = arg2.field10165[arg3];
            int var24 = var23 >>> 16;
            int var25 = var23 & 65535;
            class441 var26 = arg5.method3192(-28532, var24);
            if (var26 != null) {
               var16 |= var26.method3338(-117, var25);
               var15 |= var26.method3339(121, var25);
               var18 |= var26.method3334(var25, 1359);
               var17 |= arg2.field10161;
            }

            if ((arg2.field10149 || class631.field9178) && ~arg7 != 0 && ~arg7 > ~arg2.field10165.length) {
               int var27 = arg2.field10165[arg7];
               int var28 = var27 >>> 16;
               int var29 = var27 & 65535;
               class441 var30;
               if (~var24 == ~var28) {
                  var30 = var26;
               } else {
                  var30 = arg5.method3192(-28532, var29 >>> 16);
               }

               if (var30 != null) {
                  var16 |= var30.method3338(-48, var29);
                  var15 |= var30.method3339(123, var29);
                  var18 |= var30.method3334(var29, 1359);
               }
            }

            if (var16) {
               var14 |= 128;
            }

            if (var15) {
               var14 |= 256;
            }

            if (var17) {
               var14 |= 512;
            }

            if (var18) {
               var14 |= 1024;
            }
         }

         long var31 = (long)arg1 | (long)arg10 << 32 | (long)(arg8 << 16);
         class748 var33 = class134.field1713;
         class497 var34;
         synchronized(class134.field1713) {
            if (arg4 > -23) {
               this.field1629 = null;
            }

            var34 = (class497)class134.field1713.method5454(var31, 18261);
         }

         if (var34 == null || ~arg9.method632(var34.method326(), var14) != -1) {
            if (var34 != null) {
               var14 = arg9.method560(var14, var34.method326());
            }

            class134[] var36 = new class134[3];
            int var37 = 0;
            if (!arg6.method2004(126, arg1).method4176(false) || !arg6.method2004(92, arg8).method4176(false) || !arg6.method2004(110, arg10).method4176(false)) {
               return null;
            }

            class134 var38 = arg6.method2004(108, arg1).method4171(-71);
            if (var38 != null) {
               var36[var37++] = var38;
            }

            class134 var39 = arg6.method2004(110, arg8).method4171(-71);
            if (var39 != null) {
               var36[var37++] = var39;
            }

            class134 var40 = arg6.method2004(108, arg10).method4171(-71);
            if (var40 != null) {
               var36[var37++] = var40;
            }

            class134 var41 = new class134(var36, var37);
            int var42 = var14 | 16384;
            var34 = arg9.method547(var41, var42, class124.field1515, 64, 768);
            int var43 = 0;
            if (var13 != 0 || ~var43 > -6) {
               do {
                  int var44 = 0;
                  if (var13 != 0) {
                     if (class314.field4496[var44][var43].length > this.field1626[var43]) {
                        var34.method320(class680.field10218[var44][var43], class314.field4496[var44][var43][this.field1626[var43]]);
                     }

                     ++var44;
                  }

                  while(true) {
                     while(var44 < class314.field4496.length) {
                        if (class314.field4496[var44][var43].length > this.field1626[var43]) {
                           var34.method320(class680.field10218[var44][var43], class314.field4496[var44][var43][this.field1626[var43]]);
                        }

                        ++var44;
                     }

                     if (var13 == 0) {
                        ++var43;
                        break;
                     }

                     ++var44;
                  }
               } while(~var43 > -6);
            }

            var34.method333(var14);
            class748 var45 = class134.field1713;
            synchronized(class134.field1713) {
               class134.field1713.method5455(-2049, var34, var31);
            }
         }

         if (arg2 == null) {
            return var34;
         } else {
            class497 var46 = var34.method343((byte)4, var14, true);
            return arg2.method4934(arg0, (byte)-82, arg7, arg3, arg11, var46);
         }
      } catch (RuntimeException var51) {
         throw class670.method4877(var51, field1644[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1644[0] : field1644[2]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1644[0] : field1644[2]) + ',' + (arg6 != null ? field1644[0] : field1644[2]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field1644[0] : field1644[2]) + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IILkf;I)V",
      line = 970
   )
   public final void method1120(int arg0, int arg1, class264 arg2, int arg3) {
      try {
         if (arg3 != -1) {
            this.field1624 = 94L;
         }

         ++field1630;
         int var5 = class70.field885[arg1];
         if (arg2.method2004(arg3 + 74, arg0) != null) {
            this.field1627[var5] = class379.method2928(Integer.MIN_VALUE, arg0);
            this.method1123((byte)-11);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field1644[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1644[0] : field1644[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(IIB)I",
      line = 987
   )
   public static final int method1121(int arg0, int arg1, byte arg2) {
      int var3 = client.field4530;

      try {
         byte var4;
         label35: {
            ++field1638;
            if (arg0 <= 20000) {
               if (~arg0 < -10001) {
                  var4 = 3;
                  class30.method216(-93);
                  if (var3 == 0) {
                     break label35;
                  }
               }

               if (arg0 > 5000) {
                  var4 = 2;
                  class492.method3645((byte)116);
                  if (var3 == 0) {
                     break label35;
                  }
               }

               class564.method4172(-8519, true);
               var4 = 1;
               if (var3 == 0) {
                  break label35;
               }
            }

            var4 = 4;
            class379.method2927((byte)79);
         }

         if (~arg1 != ~class261.field3566.field9464.method4225(108)) {
            class261.field3566.method4677(class261.field3566.field9465, 73, arg1);
            class428.method3261(false, -126, arg1);
         }

         if (arg2 >= -108) {
            return 56;
         } else {
            class471.method3510((byte)118);
            return var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1644[13] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(ZI)V",
      line = 1036
   )
   public final void method1122(boolean arg0, int arg1) {
      try {
         ++field1635;
         this.field1625 = arg0;
         if (arg1 != 574638664) {
            this.method1122(true, -6);
         }

         this.method1123((byte)-11);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1644[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(B)V",
      line = 1056
   )
   private final void method1123(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(I[BBI)I",
      line = 1185
   )
   public static final int method1124(int arg0, byte[] arg1, byte arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field1631;
         int var5 = -1;
         if (arg2 != 4) {
            method1121(15, 5, (byte)22);
         }

         int var6 = arg0;
         if (var4 != 0) {
            var5 = class276.field3846[255 & (var5 ^ arg1[arg0])] ^ var5 >>> 8;
            var6 = arg0 + 1;
         }

         while(true) {
            while(var6 < arg3) {
               var5 = class276.field3846[255 & (var5 ^ arg1[var6])] ^ var5 >>> 8;
               ++var6;
            }

            int var7 = ~var5;
            if (var4 == 0) {
               return var7;
            }

            var5 = var7;
            ++var6;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field1644[6] + arg0 + ',' + (arg1 != null ? field1644[0] : field1644[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(I[I[I[Lcca;ZIB)V",
      line = 1219
   )
   public final void method1125(int arg0, int[] arg1, int[] arg2, class258[] arg3, boolean arg4, int arg5, byte arg6) {
      try {
         this.field1629 = arg3;
         int var8 = 36 / ((arg6 - -2) / 48);
         this.field1626 = arg1;
         if (~this.field1640 != ~arg0) {
            this.field1640 = arg0;
         }

         ++field1634;
         this.field1625 = arg4;
         this.field1641 = arg5;
         this.field1627 = arg2;
         this.method1123((byte)-11);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field1644[5] + arg0 + ',' + (arg1 != null ? field1644[0] : field1644[2]) + ',' + (arg2 != null ? field1644[0] : field1644[2]) + ',' + (arg3 != null ? field1644[0] : field1644[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "a",
      descriptor = "(I)V",
      line = 1243
   )
   public static void method1126(int arg0) {
      try {
         field1637 = null;
         int var1 = 18 % ((arg0 - -11) / 37);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1644[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1127(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1128(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 49;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
