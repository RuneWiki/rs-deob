import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class648 {
   @OriginalMember(
      owner = "client!jia",
      name = "l",
      descriptor = "I"
   )
   public int field9090 = -1;
   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9095 = new String[]{method4678(method4677("#!=$Ta")), method4678(method4677("'=0f")), method4678(method4677("2fr$j")), method4678(method4677("#!=$Sa")), method4678(method4677("#!=$Va")), method4678(method4677("#!=$Za")), method4678(method4677("#!=$Qa")), method4678(method4677("#!=$[a")), method4678(method4677("#!=$^a")), method4678(method4677("#!=$Ra")), method4678(method4677("#!=$]a")), method4678(method4677("#!=$_a")), method4678(method4677("#!=$Ua")), method4678(method4677("#!=$\\a")), method4678(method4677("#!=$Pa"))};
   @OriginalMember(
      owner = "client!jia",
      name = "q",
      descriptor = "Lnw;"
   )
   public static class616 field9086 = new class616(2, -1);
   @OriginalMember(
      owner = "client!jia",
      name = "b",
      descriptor = "I"
   )
   public static int field9093 = -1;
   @OriginalMember(
      owner = "client!jia",
      name = "n",
      descriptor = "[F"
   )
   public static float[] field9094 = new float[2];
   @OriginalMember(
      owner = "client!jia",
      name = "u",
      descriptor = "I"
   )
   public static int field9071;
   @OriginalMember(
      owner = "client!jia",
      name = "o",
      descriptor = "I"
   )
   public static int field9072;
   @OriginalMember(
      owner = "client!jia",
      name = "m",
      descriptor = "I"
   )
   public static int field9073;
   @OriginalMember(
      owner = "client!jia",
      name = "i",
      descriptor = "I"
   )
   public static int field9074;
   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "I"
   )
   public static int field9076;
   @OriginalMember(
      owner = "client!jia",
      name = "j",
      descriptor = "I"
   )
   public static int field9077;
   @OriginalMember(
      owner = "client!jia",
      name = "w",
      descriptor = "I"
   )
   public static int field9079;
   @OriginalMember(
      owner = "client!jia",
      name = "d",
      descriptor = "I"
   )
   public static int field9080;
   @OriginalMember(
      owner = "client!jia",
      name = "r",
      descriptor = "I"
   )
   public static int field9082;
   @OriginalMember(
      owner = "client!jia",
      name = "p",
      descriptor = "I"
   )
   public static int field9083;
   @OriginalMember(
      owner = "client!jia",
      name = "t",
      descriptor = "I"
   )
   public static int field9084;
   @OriginalMember(
      owner = "client!jia",
      name = "y",
      descriptor = "I"
   )
   public static int field9087;
   @OriginalMember(
      owner = "client!jia",
      name = "s",
      descriptor = "I"
   )
   private int field9088;
   @OriginalMember(
      owner = "client!jia",
      name = "c",
      descriptor = "J"
   )
   private long field9075;
   @OriginalMember(
      owner = "client!jia",
      name = "v",
      descriptor = "J"
   )
   private long field9091;
   @OriginalMember(
      owner = "client!jia",
      name = "h",
      descriptor = "Lbj;"
   )
   public static class255 field9092;
   @OriginalMember(
      owner = "client!jia",
      name = "k",
      descriptor = "Z"
   )
   public boolean field9081;
   @OriginalMember(
      owner = "client!jia",
      name = "e",
      descriptor = "[I"
   )
   private int[] field9070;
   @OriginalMember(
      owner = "client!jia",
      name = "g",
      descriptor = "[I"
   )
   public int[] field9078;
   @OriginalMember(
      owner = "client!jia",
      name = "x",
      descriptor = "[Lfka;"
   )
   private class745[] field9089;
   @OriginalMember(
      owner = "client!jia",
      name = "f",
      descriptor = "[[[S"
   )
   public static short[][][] field9085;

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method4664(boolean arg0, byte arg1) {
      try {
         ++field9080;
         if (arg1 != 101) {
            field9086 = null;
         }

         this.field9081 = arg0;
         this.method4666(false);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9095[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method4665(int arg0, byte arg1) {
      try {
         ++field9076;
         if (arg1 != -53) {
            method4667(false, 89);
         }

         return arg0 >>> 8;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9095[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Z)V"
   )
   private final void method4666(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(ZI)I"
   )
   public static final int method4667(boolean arg0, int arg1) {
      try {
         ++field9074;
         if (arg1 == 16711935) {
            return -1;
         } else {
            if (!arg0) {
               method4665(49, (byte)-47);
            }

            return class32.method258(arg1, 29);
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9095[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method4668(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 >= -116) {
            this.field9091 = -81L;
         }

         ++field9087;
         this.field9078[arg2] = arg0;
         this.method4666(false);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9095[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Ljava/lang/String;Z)I"
   )
   public static final int method4669(String arg0, boolean arg1) {
      boolean var2 = client.field4273;

      try {
         ++field9071;
         if (!class76.field958.field3257) {
            return -1;
         } else if (class307.field4083.containsKey(arg0)) {
            return 100;
         } else {
            String var3 = class231.method1753(arg0, 10);
            if (var3 == null) {
               return -1;
            } else {
               String var4 = class10.field121 + var3;
               if (!class156.field2008.method736(var4, (byte)102, "")) {
                  return -1;
               } else if (!class156.field2008.method741(-16463, var4)) {
                  return class156.field2008.method710(0, var4);
               } else {
                  byte[] var5 = class156.field2008.method720(!arg1, "", var4);
                  Object var6 = null;

                  File var7;
                  try {
                     var7 = class48.method406(var3, (byte)116);
                  } catch (RuntimeException var12) {
                     return -1;
                  }

                  if (var5 != null && var7 != null) {
                     boolean var8;
                     label101: {
                        var8 = true;
                        byte[] var9 = class607.method4436(var7, false);
                        if (var9 != null && var5.length == var9.length) {
                           int var10 = 0;
                           if (var2) {
                              if (var5[var10] != var9[var10]) {
                                 var8 = false;
                                 if (!var2) {
                                    break label101;
                                 }
                              }

                              ++var10;
                           }

                           while(true) {
                              while(~var10 > ~var9.length) {
                                 if (var5[var10] != var9[var10]) {
                                    var8 = false;
                                    if (!var2) {
                                       break label101;
                                    }
                                 }

                                 ++var10;
                              }

                              if (!var2) {
                                 if (!var2) {
                                    break label101;
                                 }
                                 break;
                              }

                              ++var10;
                           }
                        }

                        var8 = false;
                     }

                     try {
                        if (!var8) {
                           class76.field958.method1947((byte)-88, var7, var5);
                        }
                     } catch (Throwable var13) {
                        return -1;
                     }

                     class786.method5663(38, arg0, var7);
                     return 100;
                  } else {
                     return !arg1 ? 15 : -1;
                  }
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field9095[3] + (arg0 != null ? field9095[2] : field9095[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "([Lwp;Lv;IIIZIILmk;Lmk;IIILha;Lca;Lqga;Liea;ILvw;Lnr;[I)Lka;"
   )
   public final class501 method4670(class191[] arg0, class609 arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, class61 arg8, class61 arg9, int arg10, int arg11, int arg12, class65 arg13, class323 arg14, class196 arg15, class508 arg16, int arg17, class322 arg18, class64 arg19, int[] arg20) {
      boolean var22 = client.field4273;

      try {
         ++field9082;
         if (this.field9090 != -1) {
            return arg14.method2428(-24138, this.field9090).method2981(arg20, arg13, arg11, arg10, arg15, arg0, arg2, arg8, arg16, arg7, arg4, arg3, arg17, (byte)-43, (class298)null, arg9, arg1, arg6);
         } else {
            int var23 = arg10;
            long var24 = this.field9075;
            int[] var26 = this.field9070;
            boolean var27 = false;
            boolean var28 = false;
            if (arg8 != null && (arg8.field647 >= 0 || arg8.field670 >= 0)) {
               var26 = new int[this.field9070.length];
               int var29 = 0;
               if (var22) {
                  var26[var29] = this.field9070[var29];
                  ++var29;
               }

               while(true) {
                  while(~var26.length < ~var29) {
                     var26[var29] = this.field9070[var29];
                     ++var29;
                  }

                  if (!var22) {
                     if (arg8.field647 >= 0) {
                        label1162: {
                           if (~arg8.field647 != -65536) {
                              var26[5] = class283.method2155(1073741824, arg8.field647);
                              var24 ^= (long)var26[5] << 32;
                              if (!var22) {
                                 break label1162;
                              }
                           }

                           var24 ^= -4294967296L;
                           var27 = true;
                           var26[5] = 0;
                        }
                     }

                     if (~arg8.field670 <= -1) {
                        var28 = true;
                        if (arg8.field670 != 65535) {
                           var26[3] = class283.method2155(arg8.field670, 1073741824);
                           var24 ^= (long)var26[3];
                           if (!var22) {
                              break;
                           }
                        }

                        var24 ^= 4294967295L;
                        var26[3] = 0;
                     }
                     break;
                  }

                  ++var29;
               }
            }

            boolean var30 = false;
            boolean var31 = false;
            boolean var32 = false;
            boolean var33 = arg8 != null || arg9 != null;
            int var34 = arg0 != null ? arg0.length : 0;
            int var35 = 0;
            class61 var36;
            int var37;
            int var38;
            int var39;
            int var40;
            int var41;
            int var42;
            if (var22) {
               class340.field4869[var35] = null;
               if (arg0[var35] != null) {
                  var36 = arg15.method1477(1, arg0[var35].field2321);
                  if (var36.field667 != null) {
                     var33 = true;
                     class608.field8533[var35] = var36;
                     var37 = arg0[var35].field2324;
                     var38 = arg0[var35].field2318;
                     var39 = var36.field667[var37];
                     class340.field4869[var35] = arg15.method1478(74, var39 >>> 16);
                     var40 = var39 & 65535;
                     class495.field6804[var35] = var40;
                     if (class340.field4869[var35] != null) {
                        var31 |= class340.field4869[var35].method3482(arg12 + -38036, var40);
                        var30 |= class340.field4869[var35].method3479(var40, arg12 ^ 18593);
                        var32 |= class340.field4869[var35].method3480(var40, 4);
                     }

                     if (!var36.field669) {
                        if (class305.field4050) {
                           if (var38 != -1) {
                              if (var36.field667.length <= var38) {
                                 class443.field6148[var35] = 0;
                                 class760.field10999[var35] = 0;
                                 class291.field3841[var35] = null;
                                 class247.field3106[var35] = -1;
                                 if (var22) {
                                    class443.field6148[var35] = var36.field661[var37];
                                    class760.field10999[var35] = arg0[var35].field2323;
                                    var41 = var36.field667[var38];
                                    class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                                    var42 = var41 & 65535;
                                    class247.field3106[var35] = var42;
                                    if (class291.field3841[var35] != null) {
                                       var31 |= class291.field3841[var35].method3482(-19443, var42);
                                       var30 |= class291.field3841[var35].method3479(var42, 0);
                                       var32 |= class291.field3841[var35].method3480(var42, 4);
                                    }

                                    ++var35;
                                 } else {
                                    ++var35;
                                 }
                              } else {
                                 class443.field6148[var35] = var36.field661[var37];
                                 class760.field10999[var35] = arg0[var35].field2323;
                                 var41 = var36.field667[var38];
                                 class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                                 var42 = var41 & 65535;
                                 class247.field3106[var35] = var42;
                                 if (class291.field3841[var35] != null) {
                                    var31 |= class291.field3841[var35].method3482(-19443, var42);
                                    var30 |= class291.field3841[var35].method3479(var42, 0);
                                    var32 |= class291.field3841[var35].method3480(var42, 4);
                                 }

                                 ++var35;
                              }
                           } else {
                              class443.field6148[var35] = 0;
                              class760.field10999[var35] = 0;
                              class291.field3841[var35] = null;
                              class247.field3106[var35] = -1;
                              if (var22) {
                                 class443.field6148[var35] = var36.field661[var37];
                                 class760.field10999[var35] = arg0[var35].field2323;
                                 var41 = var36.field667[var38];
                                 class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                                 var42 = var41 & 65535;
                                 class247.field3106[var35] = var42;
                                 if (class291.field3841[var35] != null) {
                                    var31 |= class291.field3841[var35].method3482(-19443, var42);
                                    var30 |= class291.field3841[var35].method3479(var42, 0);
                                    var32 |= class291.field3841[var35].method3480(var42, 4);
                                 }

                                 ++var35;
                              } else {
                                 ++var35;
                              }
                           }
                        } else {
                           class443.field6148[var35] = 0;
                           class760.field10999[var35] = 0;
                           class291.field3841[var35] = null;
                           class247.field3106[var35] = -1;
                           if (var22) {
                              class443.field6148[var35] = var36.field661[var37];
                              class760.field10999[var35] = arg0[var35].field2323;
                              var41 = var36.field667[var38];
                              class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                              var42 = var41 & 65535;
                              class247.field3106[var35] = var42;
                              if (class291.field3841[var35] != null) {
                                 var31 |= class291.field3841[var35].method3482(-19443, var42);
                                 var30 |= class291.field3841[var35].method3479(var42, 0);
                                 var32 |= class291.field3841[var35].method3480(var42, 4);
                              }

                              ++var35;
                           } else {
                              ++var35;
                           }
                        }
                     } else if (var38 != -1) {
                        if (var36.field667.length <= var38) {
                           class443.field6148[var35] = 0;
                           class760.field10999[var35] = 0;
                           class291.field3841[var35] = null;
                           class247.field3106[var35] = -1;
                           if (var22) {
                              class443.field6148[var35] = var36.field661[var37];
                              class760.field10999[var35] = arg0[var35].field2323;
                              var41 = var36.field667[var38];
                              class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                              var42 = var41 & 65535;
                              class247.field3106[var35] = var42;
                              if (class291.field3841[var35] != null) {
                                 var31 |= class291.field3841[var35].method3482(-19443, var42);
                                 var30 |= class291.field3841[var35].method3479(var42, 0);
                                 var32 |= class291.field3841[var35].method3480(var42, 4);
                              }

                              ++var35;
                           } else {
                              ++var35;
                           }
                        } else {
                           class443.field6148[var35] = var36.field661[var37];
                           class760.field10999[var35] = arg0[var35].field2323;
                           var41 = var36.field667[var38];
                           class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                           var42 = var41 & 65535;
                           class247.field3106[var35] = var42;
                           if (class291.field3841[var35] != null) {
                              var31 |= class291.field3841[var35].method3482(-19443, var42);
                              var30 |= class291.field3841[var35].method3479(var42, 0);
                              var32 |= class291.field3841[var35].method3480(var42, 4);
                           }

                           ++var35;
                        }
                     } else {
                        class443.field6148[var35] = 0;
                        class760.field10999[var35] = 0;
                        class291.field3841[var35] = null;
                        class247.field3106[var35] = -1;
                        if (var22) {
                           class443.field6148[var35] = var36.field661[var37];
                           class760.field10999[var35] = arg0[var35].field2323;
                           var41 = var36.field667[var38];
                           class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                           var42 = var41 & 65535;
                           class247.field3106[var35] = var42;
                           if (class291.field3841[var35] != null) {
                              var31 |= class291.field3841[var35].method3482(-19443, var42);
                              var30 |= class291.field3841[var35].method3479(var42, 0);
                              var32 |= class291.field3841[var35].method3480(var42, 4);
                           }

                           ++var35;
                        } else {
                           ++var35;
                        }
                     }
                  } else {
                     ++var35;
                  }
               } else {
                  ++var35;
               }
            }

            while(true) {
               if (var34 <= var35) {
                  int var43 = -1;
                  int var44 = -1;
                  int var45 = 0;
                  class477 var46 = null;
                  class477 var47 = null;
                  int var48 = -1;
                  int var49 = -1;
                  int var50 = 0;
                  class477 var51 = null;
                  class477 var52 = null;
                  if (!var22) {
                     if (var33) {
                        if (arg8 != null) {
                           int var53 = arg8.field667[arg2];
                           int var54 = var53 >>> 16;
                           var46 = arg15.method1478(71, var54);
                           var43 = var53 & 65535;
                           if (var46 != null) {
                              var31 |= var46.method3482(-19443, var43);
                              var30 |= var46.method3479(var43, 0);
                              var32 |= var46.method3480(var43, arg12 + -18589);
                           }

                           if ((arg8.field669 || class305.field4050) && arg3 != -1 && ~arg3 > ~arg8.field667.length) {
                              int var55 = arg8.field667[arg3];
                              var45 = arg8.field661[arg2];
                              int var56 = var55 >>> 16;
                              var44 = var55 & 65535;
                              var47 = ~var54 != ~var56 ? arg15.method1478(73, var56) : var46;
                              if (var47 != null) {
                                 var31 |= var47.method3482(-19443, var44);
                                 var30 |= var47.method3479(var44, 0);
                                 var32 |= var47.method3480(var44, 4);
                              }
                           }
                        }

                        var23 = arg10 | 32;
                        if (arg9 != null) {
                           int var57 = arg9.field667[arg6];
                           int var58 = var57 >>> 16;
                           var48 = var57 & 65535;
                           var51 = arg15.method1478(106, var58);
                           if (var51 != null) {
                              var31 |= var51.method3482(-19443, var48);
                              var30 |= var51.method3479(var48, arg12 + -18593);
                              var32 |= var51.method3480(var48, arg12 ^ 18597);
                           }

                           if ((arg9.field669 || class305.field4050) && ~arg11 != 0 && arg9.field667.length > arg11) {
                              int var59 = arg9.field667[arg11];
                              var50 = arg9.field661[arg6];
                              int var60 = var59 >>> 16;
                              var52 = var58 == var60 ? var51 : arg15.method1478(arg12 + -18488, var60);
                              var49 = var59 & 65535;
                              if (var52 != null) {
                                 var31 |= var52.method3482(-19443, var49);
                                 var30 |= var52.method3479(var49, 0);
                                 var32 |= var52.method3480(var49, 4);
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

                     class590 var61 = class305.field4046;
                     class501 var62;
                     synchronized(class305.field4046) {
                        var62 = (class501)class305.field4046.method4239(var24, arg12 ^ arg12);
                     }

                     class120 var63 = null;
                     if (~this.field9088 != 0) {
                        var63 = arg16.method3691((byte)-24, this.field9088);
                     }

                     if (var62 == null || ~arg13.method540(var62.method341(), var23) != -1) {
                        if (var62 != null) {
                           var23 = arg13.method503(var23, var62.method341());
                        }

                        byte var65 = 0;
                        int var66 = 0;
                        int var67;
                        class745 var68;
                        boolean var69;
                        if (var22) {
                           var67 = var26[var66];
                           var68 = null;
                           var69 = ~var66 == -6 ? (!var27 ? (~var66 == -4 ? var28 : false) : true) : (~var66 == -4 ? var28 : false);
                           if ((1073741824 & var67) == 0) {
                              if ((var67 & Integer.MIN_VALUE) != 0) {
                                 if (!arg18.method2421(1073741823 & var67, (byte)122).method1645(28184)) {
                                    var65 = 1;
                                    if (var22) {
                                       if (!var69 && this.field9089 != null && this.field9089[var66] != null) {
                                          var68 = this.field9089[var66];
                                       }

                                       if (!arg19.method485(0, var67 & 1073741823).method2004(this.field9081, arg12 ^ 18595, var68)) {
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
                              if (!var69 && this.field9089 != null && this.field9089[var66] != null) {
                                 var68 = this.field9089[var66];
                              }

                              if (!arg19.method485(0, var67 & 1073741823).method2004(this.field9081, arg12 ^ 18595, var68)) {
                                 var65 = 1;
                              }

                              ++var66;
                           }
                        }

                        while(true) {
                           int var10000;
                           if (~var26.length >= ~var66) {
                              var10000 = var65;
                              if (!var22) {
                                 if (var65 == 0) {
                                    class200[] var70 = new class200[var26.length];
                                    int var71 = 0;
                                    if (var22 || var71 < var26.length) {
                                       do {
                                          int var72 = var26[var71];
                                          class745 var73 = null;
                                          boolean var74 = var71 == 5 ? (!var27 ? (~var71 == -4 ? var28 : false) : true) : (~var71 == -4 ? var28 : false);
                                          if ((1073741824 & var72) == 0) {
                                             if ((var72 & Integer.MIN_VALUE) == 0) {
                                                ++var71;
                                                continue;
                                             }

                                             class200 var75 = arg18.method2421(1073741823 & var72, (byte)116).method1642((byte)-36);
                                             if (var75 == null) {
                                                ++var71;
                                                continue;
                                             }

                                             var70[var71] = var75;
                                             if (!var22) {
                                                ++var71;
                                                continue;
                                             }
                                          }

                                          if (!var74 && this.field9089 != null && this.field9089[var71] != null) {
                                             var73 = this.field9089[var71];
                                          }

                                          class200 var76 = arg19.method485(0, 1073741823 & var72).method2009(this.field9081, var73, (byte)35);
                                          if (var76 != null) {
                                             var70[var71] = var76;
                                          }

                                          ++var71;
                                       } while(var71 < var26.length);
                                    }

                                    if (var63 != null && var63.field1480 != null) {
                                       int var77 = 0;
                                       if (var22 || ~var77 > ~var63.field1480.length) {
                                          do {
                                             if (var70[var77] != null) {
                                                int var78 = 0;
                                                int var79 = 0;
                                                int var80 = 0;
                                                int var81 = 0;
                                                int var82 = 0;
                                                int var83 = 0;
                                                if (var63.field1480[var77] != null) {
                                                   var81 = var63.field1480[var77][3] << 3;
                                                   var80 = var63.field1480[var77][2];
                                                   var79 = var63.field1480[var77][1];
                                                   var83 = var63.field1480[var77][5] << 3;
                                                   var82 = var63.field1480[var77][4] << 3;
                                                   var78 = var63.field1480[var77][0];
                                                }

                                                if (var81 == 0) {
                                                   if (var82 == 0) {
                                                      if (var83 != 0) {
                                                         var70[var77].method1507(var83, var81, (byte)21, var82);
                                                      }
                                                   } else {
                                                      var70[var77].method1507(var83, var81, (byte)21, var82);
                                                   }
                                                } else {
                                                   var70[var77].method1507(var83, var81, (byte)21, var82);
                                                }

                                                if (~var78 == -1) {
                                                   if (var79 == 0) {
                                                      if (~var80 != -1) {
                                                         var70[var77].method1510((byte)53, var80, var78, var79);
                                                         ++var77;
                                                      } else {
                                                         ++var77;
                                                      }
                                                   } else {
                                                      var70[var77].method1510((byte)53, var80, var78, var79);
                                                      ++var77;
                                                   }
                                                } else {
                                                   var70[var77].method1510((byte)53, var80, var78, var79);
                                                   ++var77;
                                                }
                                             } else {
                                                ++var77;
                                             }
                                          } while(~var77 > ~var63.field1480.length);
                                       }
                                    }

                                    byte var107;
                                    label585: {
                                       int var84 = var23 | 16384;
                                       class200 var85 = new class200(var70, var70.length);
                                       var62 = arg13.method573(var85, var84, class706.field10249, 64, 850);
                                       int var86 = 0;
                                       if (var22) {
                                          var107 = 0;
                                       } else if (~var86 <= -6) {
                                          var107 = arg5;
                                          if (!var22) {
                                             break label585;
                                          }
                                       } else {
                                          var107 = 0;
                                       }

                                       label584:
                                       while(true) {
                                          int var87 = var107;
                                          if (var22) {
                                             if (field9085[var87][var86].length > this.field9078[var86]) {
                                                var62.method349(class24.field309[var87][var86], field9085[var87][var86][this.field9078[var86]]);
                                             }

                                             ++var87;
                                          }

                                          while(true) {
                                             while(~var87 > ~field9085.length) {
                                                if (field9085[var87][var86].length > this.field9078[var86]) {
                                                   var62.method349(class24.field309[var87][var86], field9085[var87][var86][this.field9078[var86]]);
                                                }

                                                ++var87;
                                             }

                                             if (!var22) {
                                                ++var86;
                                                if (~var86 <= -6) {
                                                   var107 = arg5;
                                                   if (!var22) {
                                                      break label584;
                                                   }
                                                } else {
                                                   var107 = 0;
                                                }
                                                break;
                                             }

                                             ++var87;
                                          }
                                       }
                                    }

                                    if (var107 == 0) {
                                       break;
                                    }

                                    var62.method352(var23);
                                    class590 var88 = class305.field4046;
                                    synchronized(class305.field4046) {
                                       class305.field4046.method4238(58, var62, var24);
                                    }

                                    this.field9091 = var24;
                                    if (!var22) {
                                       break;
                                    }
                                 }

                                 if (this.field9091 != -1L) {
                                    class590 var89 = class305.field4046;
                                    synchronized(class305.field4046) {
                                       var62 = (class501)class305.field4046.method4239(this.field9091, 0);
                                    }
                                 }

                                 if (var62 == null || ~arg13.method540(var62.method341(), var23) != -1) {
                                    return null;
                                 }
                                 break;
                              }
                           } else {
                              var10000 = var26[var66];
                           }

                           var67 = var10000;
                           var68 = null;
                           var69 = ~var66 == -6 ? (!var27 ? (~var66 == -4 ? var28 : false) : true) : (~var66 == -4 ? var28 : false);
                           if ((1073741824 & var67) == 0) {
                              if ((var67 & Integer.MIN_VALUE) != 0) {
                                 if (!arg18.method2421(1073741823 & var67, (byte)122).method1645(28184)) {
                                    var65 = 1;
                                    if (var22) {
                                       if (!var69 && this.field9089 != null && this.field9089[var66] != null) {
                                          var68 = this.field9089[var66];
                                       }

                                       if (!arg19.method485(0, var67 & 1073741823).method2004(this.field9081, arg12 ^ 18595, var68)) {
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
                              if (!var69 && this.field9089 != null && this.field9089[var66] != null) {
                                 var68 = this.field9089[var66];
                              }

                              if (!arg19.method485(0, var67 & 1073741823).method2004(this.field9081, arg12 ^ 18595, var68)) {
                                 var65 = 1;
                              }

                              ++var66;
                           }
                        }
                     }

                     class501 var90 = var62.method338((byte)4, var23, true);
                     byte var91 = 0;
                     if (arg20 != null) {
                        int var92 = 0;
                        if (var22 || ~arg20.length < ~var92) {
                           do {
                              if (~arg20[var92] != 0) {
                                 var91 = 1;
                              }

                              ++var92;
                           } while(~arg20.length < ~var92);
                        }
                     }

                     if (!var33 && var91 == 0) {
                        return var90;
                     }

                     class17[] var93 = null;
                     if (var63 != null) {
                        var93 = var63.method1016(arg13, -1211848253);
                     }

                     int var94;
                     int var95;
                     label492: {
                        if (var91 != 0) {
                           if (var93 != null) {
                              var94 = 0;
                              if (var22) {
                                 if (var93[var94] != null) {
                                    var90.method362(var93[var94], 1 << var94, true);
                                 }

                                 ++var94;
                              }
                           } else {
                              var94 = 0;
                              var95 = 1;
                              if (!var22) {
                                 break label492;
                              }

                              ++var94;
                           }
                        } else {
                           var94 = 0;
                           var95 = 1;
                           if (!var22) {
                              break label492;
                           }

                           ++var94;
                        }

                        while(true) {
                           while(var94 < arg20.length) {
                              if (var93[var94] != null) {
                                 var90.method362(var93[var94], 1 << var94, true);
                              }

                              ++var94;
                           }

                           var94 = 0;
                           var95 = 1;
                           if (!var22) {
                              break;
                           }

                           ++var94;
                        }
                     }

                     if (var22) {
                        if (class340.field4869[var94] != null) {
                           var90.method3621(false, class443.field6148[var94], class760.field10999[var94] + -1, class495.field6804[var94], 122, var95, class340.field4869[var94], class291.field3841[var94], class247.field3106[var94], 0, (int[])null);
                        }

                        ++var94;
                        var95 <<= 1;
                     }

                     while(true) {
                        while(~var34 < ~var94) {
                           if (class340.field4869[var94] != null) {
                              var90.method3621(false, class443.field6148[var94], class760.field10999[var94] + -1, class495.field6804[var94], 122, var95, class340.field4869[var94], class291.field3841[var94], class247.field3106[var94], 0, (int[])null);
                           }

                           ++var94;
                           var95 <<= 1;
                        }

                        if (!var22) {
                           if (var91 != 0) {
                              int var96 = 0;
                              if (var22 || var96 < arg20.length) {
                                 do {
                                    if (arg20[var96] != -1) {
                                       int var97 = arg20[var96] + -arg7;
                                       int var98 = var97 & 16383;
                                       class17 var99 = arg13.method603();
                                       var99.method141(var98);
                                       var90.method362(var99, 1 << var96, false);
                                    }

                                    ++var96;
                                 } while(var96 < arg20.length);
                              }
                           }

                           if (var91 != 0 && var93 != null) {
                              int var100 = 0;
                              if (var22 || ~var100 > ~arg20.length) {
                                 do {
                                    if (var93[var100] != null) {
                                       var90.method362(var93[var100], 1 << var100, false);
                                    }

                                    ++var100;
                                 } while(~var100 > ~arg20.length);
                              }
                           }

                           label1154: {
                              if (var46 != null && var51 != null) {
                                 var90.method3618(var43, arg8.field651, var52, var48, (byte)-7, var44, false, var45, var46, var51, arg17 + -1, arg4 + -1, var50, var49, var47);
                                 if (!var22) {
                                    break label1154;
                                 }
                              }

                              if (var46 == null) {
                                 if (var51 == null) {
                                    break label1154;
                                 }

                                 var90.method3623(var49, var48, arg17 + -1, 8353, 0, var52, var51, var50, false);
                                 if (!var22) {
                                    break label1154;
                                 }
                              }

                              var90.method3623(var44, var43, arg4 + -1, 8353, 0, var47, var46, var45, false);
                           }

                           int var101 = 0;
                           if (var22) {
                              class340.field4869[var101] = null;
                              class291.field3841[var101] = null;
                              class608.field8533[var101] = null;
                              ++var101;
                           }

                           while(true) {
                              while(var101 < var34) {
                                 class340.field4869[var101] = null;
                                 class291.field3841[var101] = null;
                                 class608.field8533[var101] = null;
                                 ++var101;
                              }

                              if (!var22) {
                                 return var90;
                              }

                              ++var101;
                           }
                        }

                        var95 = var91;
                     }
                  }
               } else {
                  class340.field4869[var35] = null;
               }

               if (arg0[var35] != null) {
                  var36 = arg15.method1477(1, arg0[var35].field2321);
                  if (var36.field667 != null) {
                     var33 = true;
                     class608.field8533[var35] = var36;
                     var37 = arg0[var35].field2324;
                     var38 = arg0[var35].field2318;
                     var39 = var36.field667[var37];
                     class340.field4869[var35] = arg15.method1478(74, var39 >>> 16);
                     var40 = var39 & 65535;
                     class495.field6804[var35] = var40;
                     if (class340.field4869[var35] != null) {
                        var31 |= class340.field4869[var35].method3482(arg12 + -38036, var40);
                        var30 |= class340.field4869[var35].method3479(var40, arg12 ^ 18593);
                        var32 |= class340.field4869[var35].method3480(var40, 4);
                     }

                     if (!var36.field669) {
                        if (class305.field4050) {
                           if (var38 != -1) {
                              if (var36.field667.length <= var38) {
                                 class443.field6148[var35] = 0;
                                 class760.field10999[var35] = 0;
                                 class291.field3841[var35] = null;
                                 class247.field3106[var35] = -1;
                                 if (var22) {
                                    class443.field6148[var35] = var36.field661[var37];
                                    class760.field10999[var35] = arg0[var35].field2323;
                                    var41 = var36.field667[var38];
                                    class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                                    var42 = var41 & 65535;
                                    class247.field3106[var35] = var42;
                                    if (class291.field3841[var35] != null) {
                                       var31 |= class291.field3841[var35].method3482(-19443, var42);
                                       var30 |= class291.field3841[var35].method3479(var42, 0);
                                       var32 |= class291.field3841[var35].method3480(var42, 4);
                                    }

                                    ++var35;
                                 } else {
                                    ++var35;
                                 }
                              } else {
                                 class443.field6148[var35] = var36.field661[var37];
                                 class760.field10999[var35] = arg0[var35].field2323;
                                 var41 = var36.field667[var38];
                                 class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                                 var42 = var41 & 65535;
                                 class247.field3106[var35] = var42;
                                 if (class291.field3841[var35] != null) {
                                    var31 |= class291.field3841[var35].method3482(-19443, var42);
                                    var30 |= class291.field3841[var35].method3479(var42, 0);
                                    var32 |= class291.field3841[var35].method3480(var42, 4);
                                 }

                                 ++var35;
                              }
                           } else {
                              class443.field6148[var35] = 0;
                              class760.field10999[var35] = 0;
                              class291.field3841[var35] = null;
                              class247.field3106[var35] = -1;
                              if (var22) {
                                 class443.field6148[var35] = var36.field661[var37];
                                 class760.field10999[var35] = arg0[var35].field2323;
                                 var41 = var36.field667[var38];
                                 class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                                 var42 = var41 & 65535;
                                 class247.field3106[var35] = var42;
                                 if (class291.field3841[var35] != null) {
                                    var31 |= class291.field3841[var35].method3482(-19443, var42);
                                    var30 |= class291.field3841[var35].method3479(var42, 0);
                                    var32 |= class291.field3841[var35].method3480(var42, 4);
                                 }

                                 ++var35;
                              } else {
                                 ++var35;
                              }
                           }
                        } else {
                           class443.field6148[var35] = 0;
                           class760.field10999[var35] = 0;
                           class291.field3841[var35] = null;
                           class247.field3106[var35] = -1;
                           if (var22) {
                              class443.field6148[var35] = var36.field661[var37];
                              class760.field10999[var35] = arg0[var35].field2323;
                              var41 = var36.field667[var38];
                              class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                              var42 = var41 & 65535;
                              class247.field3106[var35] = var42;
                              if (class291.field3841[var35] != null) {
                                 var31 |= class291.field3841[var35].method3482(-19443, var42);
                                 var30 |= class291.field3841[var35].method3479(var42, 0);
                                 var32 |= class291.field3841[var35].method3480(var42, 4);
                              }

                              ++var35;
                           } else {
                              ++var35;
                           }
                        }
                     } else if (var38 != -1) {
                        if (var36.field667.length <= var38) {
                           class443.field6148[var35] = 0;
                           class760.field10999[var35] = 0;
                           class291.field3841[var35] = null;
                           class247.field3106[var35] = -1;
                           if (var22) {
                              class443.field6148[var35] = var36.field661[var37];
                              class760.field10999[var35] = arg0[var35].field2323;
                              var41 = var36.field667[var38];
                              class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                              var42 = var41 & 65535;
                              class247.field3106[var35] = var42;
                              if (class291.field3841[var35] != null) {
                                 var31 |= class291.field3841[var35].method3482(-19443, var42);
                                 var30 |= class291.field3841[var35].method3479(var42, 0);
                                 var32 |= class291.field3841[var35].method3480(var42, 4);
                              }

                              ++var35;
                           } else {
                              ++var35;
                           }
                        } else {
                           class443.field6148[var35] = var36.field661[var37];
                           class760.field10999[var35] = arg0[var35].field2323;
                           var41 = var36.field667[var38];
                           class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                           var42 = var41 & 65535;
                           class247.field3106[var35] = var42;
                           if (class291.field3841[var35] != null) {
                              var31 |= class291.field3841[var35].method3482(-19443, var42);
                              var30 |= class291.field3841[var35].method3479(var42, 0);
                              var32 |= class291.field3841[var35].method3480(var42, 4);
                           }

                           ++var35;
                        }
                     } else {
                        class443.field6148[var35] = 0;
                        class760.field10999[var35] = 0;
                        class291.field3841[var35] = null;
                        class247.field3106[var35] = -1;
                        if (var22) {
                           class443.field6148[var35] = var36.field661[var37];
                           class760.field10999[var35] = arg0[var35].field2323;
                           var41 = var36.field667[var38];
                           class291.field3841[var35] = arg15.method1478(73, var41 >>> 16);
                           var42 = var41 & 65535;
                           class247.field3106[var35] = var42;
                           if (class291.field3841[var35] != null) {
                              var31 |= class291.field3841[var35].method3482(-19443, var42);
                              var30 |= class291.field3841[var35].method3479(var42, 0);
                              var32 |= class291.field3841[var35].method3480(var42, 4);
                           }

                           ++var35;
                        } else {
                           ++var35;
                        }
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
         throw class534.method3846(var106, field9095[10] + (arg0 != null ? field9095[2] : field9095[1]) + ',' + (arg1 != null ? field9095[2] : field9095[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field9095[2] : field9095[1]) + ',' + (arg9 != null ? field9095[2] : field9095[1]) + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + (arg13 != null ? field9095[2] : field9095[1]) + ',' + (arg14 != null ? field9095[2] : field9095[1]) + ',' + (arg15 != null ? field9095[2] : field9095[1]) + ',' + (arg16 != null ? field9095[2] : field9095[1]) + ',' + arg17 + ',' + (arg18 != null ? field9095[2] : field9095[1]) + ',' + (arg19 != null ? field9095[2] : field9095[1]) + ',' + (arg20 != null ? field9095[2] : field9095[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4671(int arg0) {
      try {
         field9092 = null;
         if (arg0 == 1073741823) {
            field9086 = null;
            field9094 = null;
            field9085 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9095[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(ILnr;BI)V"
   )
   public final void method4672(int arg0, class64 arg1, byte arg2, int arg3) {
      try {
         ++field9084;
         if (arg2 == 41) {
            if (arg0 == -1) {
               this.field9070[arg3] = 0;
            } else if (arg1.method485(arg2 + -41, arg0) != null) {
               this.field9070[arg3] = class283.method2155(1073741824, arg0);
               this.method4666(false);
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field9095[14] + arg0 + ',' + (arg1 != null ? field9095[2] : field9095[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(Lvw;ZILqga;Lmk;ILnr;IILha;Lv;Lca;)Lka;"
   )
   public final class501 method4673(class322 arg0, boolean arg1, int arg2, class196 arg3, class61 arg4, int arg5, class64 arg6, int arg7, int arg8, class65 arg9, class609 arg10, class323 arg11) {
      boolean var13 = client.field4273;

      try {
         ++field9077;
         if (this.field9090 != -1) {
            return arg11.method2428(-24138, this.field9090).method2982((class298)null, arg10, arg3, arg2, (byte)123, arg8, arg5, arg9, arg4, arg7);
         } else {
            int var14 = arg7;
            if (arg4 != null) {
               boolean var15 = false;
               boolean var16 = false;
               boolean var17 = false;
               boolean var18 = false;
               boolean var19 = true;
               boolean var20 = true;
               Object var21 = null;
               int var22 = arg4.field667[arg5];
               var14 = arg7 | 32;
               Object var23 = null;
               int var24 = var22 >>> 16;
               int var25 = var22 & 65535;
               class477 var26 = arg3.method1478(106, var24);
               if (var26 != null) {
                  var16 |= var26.method3482(-19443, var25);
                  var15 |= var26.method3479(var25, 0);
                  var18 |= var26.method3480(var25, 4);
                  var17 |= arg4.field645;
               }

               if ((arg4.field669 || class305.field4050) && arg8 != -1 && ~arg4.field667.length < ~arg8) {
                  int var27 = arg4.field667[arg8];
                  int var28 = var27 >>> 16;
                  int var29 = var27 & 65535;
                  class477 var30 = var24 != var28 ? arg3.method1478(76, var28) : var26;
                  if (var30 != null) {
                     var16 |= var30.method3482(-19443, var29);
                     var15 |= var30.method3479(var29, 0);
                     var18 |= var30.method3480(var29, 4);
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

            class590 var31 = class468.field6450;
            class501 var32;
            synchronized(class468.field6450) {
               var32 = (class501)class468.field6450.method4239(this.field9075, 0);
            }

            if (var32 == null || arg9.method540(var32.method341(), var14) != 0) {
               if (var32 != null) {
                  var14 = arg9.method503(var14, var32.method341());
               }

               int var10000;
               int var33;
               label245: {
                  var33 = var14;
                  byte var34 = 0;
                  int var35 = 0;
                  if (var13) {
                     var10000 = this.field9070[var35];
                  } else if (~var35 <= ~this.field9070.length) {
                     var10000 = var34;
                     if (!var13) {
                        break label245;
                     }
                  } else {
                     var10000 = this.field9070[var35];
                  }

                  while(true) {
                     int var36 = var10000;
                     class745 var37 = null;
                     if ((var36 & 1073741824) != 0) {
                        if (this.field9089 != null && this.field9089[var35] != null) {
                           var37 = this.field9089[var35];
                        }

                        if (!arg6.method485(0, 1073741823 & var36).method1992(this.field9081, var37, 0)) {
                           var34 = 1;
                        }
                     } else if ((Integer.MIN_VALUE & var36) != 0 && !arg0.method2421(var36 & 1073741823, (byte)124).method1638(-97)) {
                        var34 = 1;
                     }

                     ++var35;
                     if (~var35 <= ~this.field9070.length) {
                        var10000 = var34;
                        if (!var13) {
                           break;
                        }
                     } else {
                        var10000 = this.field9070[var35];
                     }
                  }
               }

               if (var10000 != 0) {
                  return null;
               }

               label226: {
                  class200[] var38 = new class200[this.field9070.length];
                  int var39 = 0;
                  int var40 = 0;
                  class200 var45;
                  if (var13) {
                     var10000 = this.field9070[var40];
                  } else if (~this.field9070.length >= ~var40) {
                     var33 = var14 | 16384;
                     var45 = new class200(var38, var39);
                     var32 = arg9.method573(var45, var33, class706.field10249, 64, 768);
                     var10000 = 0;
                     if (!var13) {
                        break label226;
                     }
                  } else {
                     var10000 = this.field9070[var40];
                  }

                  while(true) {
                     int var41 = var10000;
                     class745 var42 = null;
                     if ((var41 & 1073741824) != 0) {
                        if (this.field9089 != null && this.field9089[var40] != null) {
                           var42 = this.field9089[var40];
                        }

                        class200 var43 = arg6.method485(0, 1073741823 & var41).method2003(this.field9081, var42, 13);
                        if (var43 != null) {
                           var38[var39++] = var43;
                        }
                     } else if (~(Integer.MIN_VALUE & var41) != -1) {
                        class200 var44 = arg0.method2421(var41 & 1073741823, (byte)123).method1646(5);
                        if (var44 != null) {
                           var38[var39++] = var44;
                        }
                     }

                     ++var40;
                     if (~this.field9070.length >= ~var40) {
                        var33 |= 16384;
                        var45 = new class200(var38, var39);
                        var32 = arg9.method573(var45, var33, class706.field10249, 64, 768);
                        var10000 = 0;
                        if (!var13) {
                           break;
                        }
                     } else {
                        var10000 = this.field9070[var40];
                     }
                  }
               }

               int var46 = var10000;
               if (var13 || ~var46 > -6) {
                  do {
                     int var47 = 0;
                     if (var13) {
                        if (~field9085[var47][var46].length < ~this.field9078[var46]) {
                           var32.method349(class24.field309[var47][var46], field9085[var47][var46][this.field9078[var46]]);
                        }

                        ++var47;
                     }

                     while(true) {
                        while(var47 < field9085.length) {
                           if (~field9085[var47][var46].length < ~this.field9078[var46]) {
                              var32.method349(class24.field309[var47][var46], field9085[var47][var46][this.field9078[var46]]);
                           }

                           ++var47;
                        }

                        if (!var13) {
                           ++var46;
                           break;
                        }

                        ++var47;
                     }
                  } while(~var46 > -6);
               }

               var32.method352(var14);
               class590 var48 = class468.field6450;
               synchronized(class468.field6450) {
                  class468.field6450.method4238(66, var32, this.field9075);
               }
            }

            if (arg4 == null) {
               return var32;
            } else if (arg1) {
               return null;
            } else {
               var32.method338((byte)4, var14, true);
               return arg4.method460(arg7, arg8, 11973, arg5, var32, arg2);
            }
         }
      } catch (RuntimeException var54) {
         throw class534.method3846(var54, field9095[9] + (arg0 != null ? field9095[2] : field9095[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9095[2] : field9095[1]) + ',' + (arg4 != null ? field9095[2] : field9095[1]) + ',' + arg5 + ',' + (arg6 != null ? field9095[2] : field9095[1]) + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field9095[2] : field9095[1]) + ',' + (arg10 != null ? field9095[2] : field9095[1]) + ',' + (arg11 != null ? field9095[2] : field9095[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IIZB[Lfka;[I[I)V"
   )
   public final void method4674(int arg0, int arg1, boolean arg2, byte arg3, class745[] arg4, int[] arg5, int[] arg6) {
      try {
         this.field9081 = arg2;
         this.field9070 = arg6;
         if (this.field9088 != arg1) {
            this.field9088 = arg1;
         }

         if (arg3 <= 18) {
            this.field9088 = 70;
         }

         this.field9090 = arg0;
         this.field9089 = arg4;
         this.field9078 = arg5;
         ++field9083;
         this.method4666(false);
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field9095[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field9095[2] : field9095[1]) + ',' + (arg5 != null ? field9095[2] : field9095[1]) + ',' + (arg6 != null ? field9095[2] : field9095[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(IIZLha;IILvw;Lqga;Lmk;III)Lka;"
   )
   public final class501 method4675(int arg0, int arg1, boolean arg2, class65 arg3, int arg4, int arg5, class322 arg6, class196 arg7, class61 arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field4273;

      try {
         ++field9073;
         int var14 = arg9;
         if (arg8 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var14 = arg9 | 32;
            int var22 = arg8.field667[arg5];
            Object var23 = null;
            int var24 = var22 >>> 16;
            int var25 = var22 & 65535;
            class477 var26 = arg7.method1478(93, var24);
            if (var26 != null) {
               var16 |= var26.method3482(-19443, var25);
               var15 |= var26.method3479(var25, 0);
               var18 |= var26.method3480(var25, 4);
               var17 |= arg8.field645;
            }

            if ((arg8.field669 || class305.field4050) && ~arg0 != 0 && ~arg8.field667.length < ~arg0) {
               int var27 = arg8.field667[arg0];
               int var28 = var27 >>> 16;
               int var29 = var27 & 65535;
               class477 var30;
               if (~var24 != ~var28) {
                  var30 = arg7.method1478(69, var29 >>> 16);
               } else {
                  var30 = var26;
               }

               if (var30 != null) {
                  var16 |= var30.method3482(-19443, var29);
                  var15 |= var30.method3479(var29, 0);
                  var18 |= var30.method3480(var29, 4);
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

         long var31 = (long)arg10 | (long)arg11 << 32 | (long)(arg1 << 16);
         class590 var33 = class468.field6450;
         class501 var34;
         synchronized(class468.field6450) {
            var34 = (class501)class468.field6450.method4239(var31, 0);
         }

         if (var34 == null || ~arg3.method540(var34.method341(), var14) != -1) {
            if (var34 != null) {
               var14 = arg3.method503(var14, var34.method341());
            }

            class200[] var36 = new class200[3];
            int var37 = 0;
            if (!arg6.method2421(arg10, (byte)114).method1638(125) || !arg6.method2421(arg1, (byte)113).method1638(126) || !arg6.method2421(arg11, (byte)120).method1638(-53)) {
               return null;
            }

            class200 var38 = arg6.method2421(arg10, (byte)114).method1646(5);
            if (var38 != null) {
               var36[var37++] = var38;
            }

            class200 var39 = arg6.method2421(arg1, (byte)123).method1646(5);
            if (var39 != null) {
               var36[var37++] = var39;
            }

            class200 var40 = arg6.method2421(arg11, (byte)127).method1646(5);
            if (var40 != null) {
               var36[var37++] = var40;
            }

            int var41 = var14 | 16384;
            class200 var42 = new class200(var36, var37);
            var34 = arg3.method573(var42, var41, class706.field10249, 64, 768);
            int var43 = 0;
            if (var13 || ~var43 > -6) {
               do {
                  int var44 = 0;
                  if (var13) {
                     if (~field9085[var44][var43].length < ~this.field9078[var43]) {
                        var34.method349(class24.field309[var44][var43], field9085[var44][var43][this.field9078[var43]]);
                     }

                     ++var44;
                  }

                  while(true) {
                     while(~field9085.length < ~var44) {
                        if (~field9085[var44][var43].length < ~this.field9078[var43]) {
                           var34.method349(class24.field309[var44][var43], field9085[var44][var43][this.field9078[var43]]);
                        }

                        ++var44;
                     }

                     if (!var13) {
                        ++var43;
                        break;
                     }

                     ++var44;
                  }
               } while(~var43 > -6);
            }

            var34.method352(var14);
            class590 var45 = class468.field6450;
            synchronized(class468.field6450) {
               class468.field6450.method4238(36, var34, var31);
            }
         }

         if (arg8 == null) {
            return var34;
         } else {
            class501 var46 = var34.method338((byte)4, var14, true);
            class501 var47 = arg8.method460(arg9, arg0, 11973, arg5, var46, arg4);
            if (arg2) {
               this.method4666(true);
            }

            return var47;
         }
      } catch (RuntimeException var51) {
         throw class534.method3846(var51, field9095[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9095[2] : field9095[1]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9095[2] : field9095[1]) + ',' + (arg7 != null ? field9095[2] : field9095[1]) + ',' + (arg8 != null ? field9095[2] : field9095[1]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "a",
      descriptor = "(ILvw;II)V"
   )
   public final void method4676(int arg0, class322 arg1, int arg2, int arg3) {
      try {
         if (arg2 < -5) {
            ++field9072;
            int var5 = class668.field9493[arg3];
            if (arg1.method2421(arg0, (byte)115) != null) {
               this.field9070[var5] = class283.method2155(Integer.MIN_VALUE, arg0);
               this.method4666(false);
            }
         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field9095[8] + arg0 + ',' + (arg1 != null ? field9095[2] : field9095[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4677(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4678(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
