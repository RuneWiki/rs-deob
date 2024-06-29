import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class230 extends class465 {
   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2936 = new String[]{method1740(method1739("\u0003z\u0019M")), method1740(method1739("\u0005b[\u001d1\u0003f\u0001\u001fp")), method1740(method1739("\u0016![\u000f%")), method1740(method1739("\u0005b[bp")), method1740(method1739("\u0005b[cp")), method1740(method1739("\u0005b[`p")), method1740(method1739("#z\u0019M")), method1740(method1739("Ql\u001aMe\u000bi\u0013G>\u000b1")), method1740(method1739("\u0005b[fp")), method1740(method1739("\u0005b[ip")), method1740(method1739("\u0005b[dp")), method1740(method1739("\u0005b[gp")), method1740(method1739("\u0005b[ep"))};
   @OriginalMember(
      owner = "client!hm",
      name = "i",
      descriptor = "[I"
   )
   public static int[] field2934 = new int[6];
   @OriginalMember(
      owner = "client!hm",
      name = "k",
      descriptor = "I"
   )
   public static int field2927;
   @OriginalMember(
      owner = "client!hm",
      name = "m",
      descriptor = "I"
   )
   public static int field2928;
   @OriginalMember(
      owner = "client!hm",
      name = "j",
      descriptor = "I"
   )
   public static int field2929;
   @OriginalMember(
      owner = "client!hm",
      name = "n",
      descriptor = "I"
   )
   public static int field2930;
   @OriginalMember(
      owner = "client!hm",
      name = "g",
      descriptor = "I"
   )
   public static int field2931;
   @OriginalMember(
      owner = "client!hm",
      name = "h",
      descriptor = "I"
   )
   public static int field2932;
   @OriginalMember(
      owner = "client!hm",
      name = "l",
      descriptor = "I"
   )
   public static int field2933;
   @OriginalMember(
      owner = "client!hm",
      name = "f",
      descriptor = "I"
   )
   public static int field2935;

   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method77(int arg0, int arg1) {
      try {
         if (arg0 != -14812) {
            this.method69(false);
         }

         super.field6984 = arg1;
         ++field2929;
         class630.method4539(super.field6984, arg0 ^ -14782);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2936[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method1735(boolean arg0) {
      try {
         ++field2930;
         if (~super.field6980.method4673((byte)-76).method3317(19285) > -97) {
            return false;
         } else {
            return !arg0;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2936[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method69(boolean arg0) {
      try {
         if (arg0) {
            this.method69(false);
         }

         ++field2927;
         if (super.field6980.method4673((byte)-76).method3317(19285) < 96) {
            super.field6984 = 0;
         }

         if (~super.field6984 > -1 || ~super.field6984 < -3) {
            super.field6984 = this.method78(16726277);
         }

      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2936[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "<init>",
      descriptor = "(Lsk;)V"
   )
   public class230(class648 arg0) {
      super(arg0);

      try {
         class630.method4539(super.field6984, -55);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2936[1] + (arg0 != null ? field2936[2] : field2936[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1736(int arg0) {
      try {
         field2934 = null;
         if (arg0 != 82) {
            field2934 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2936[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(BILjfa;I)V"
   )
   public static final void method1737(byte arg0, int arg1, class303 arg2, int arg3) {
      int var4 = client.field4530;

      try {
         ++field2928;
         if (arg2 != null && class459.field6947.field8129 != arg2) {
            int var5 = arg2.field4321;
            if (arg0 != 111) {
               field2934 = null;
            }

            int var6 = arg2.field4328;
            int var7 = arg2.field4333;
            int var8 = (int)arg2.field4324;
            long var9 = arg2.field4324;
            if (var7 >= 2000) {
               var7 -= 2000;
            }

            if (~var7 == -23) {
               class721.field10729 = arg3;
               class247.field3251 = 2;
               ++class593.field8748;
               class447.field6800 = arg1;
               class209.field2663 = 0;
               class180 var11 = class486.method3603(class633.field9212, (byte)-33, class48.field583);
               var11.field2211.method1103(class669.field10064 + var6, -34);
               var11.field2211.method1081(arg0 ^ 239, class718.field10676 + var5);
               var11.field2211.method1096((byte)-107, var8);
               var11.field2211.method1048(0, !class597.field8785.method1535(82, (byte)-105) ? 0 : 1);
               class763.method5527(false, var11);
               class641.method4607(arg0 ^ -84, var6, var5);
            }

            if (~var7 == -1002) {
               ++class711.field10614;
               class247.field3251 = 2;
               class447.field6800 = arg1;
               class721.field10729 = arg3;
               class209.field2663 = 0;
               class180 var12 = class486.method3603(class791.field11502, (byte)-73, class48.field583);
               var12.field2211.method1103(var8, -79);
               class763.method5527(false, var12);
            }

            if (var7 == 13) {
               class687 var13 = class661.field9578[var8];
               if (var13 != null) {
                  class209.field2663 = 0;
                  class721.field10729 = arg3;
                  class447.field6800 = arg1;
                  class247.field3251 = 2;
                  ++class350.field5305;
                  class180 var14 = class486.method3603(class139.field1786, (byte)-104, class48.field583);
                  var14.field2211.method1048(0, !class597.field8785.method1535(82, (byte)-106) ? 0 : 1);
                  var14.field2211.method1096((byte)-107, var8);
                  class763.method5527(false, var14);
                  class105.method899(var13.method3046(arg0), 0, true, -2, var13.field6114[0], 0, 0, var13.method3046(arg0 + -204), var13.field6116[0]);
               }
            }

            if (~var7 == -31) {
               ++class412.field6314;
               class447.field6800 = arg1;
               class247.field3251 = 2;
               class209.field2663 = 0;
               class721.field10729 = arg3;
               class180 var15 = class486.method3603(class403.field6193, (byte)-49, class48.field583);
               var15.field2211.method1103(class669.field10064 + var6, arg0 ^ -5);
               var15.field2211.method1103(class718.field10676 + var5, -18);
               var15.field2211.method1048(arg0 ^ 111, !class597.field8785.method1535(82, (byte)-95) ? 0 : 1);
               var15.field2211.method1096((byte)-107, (int)(var9 >>> 32) & Integer.MAX_VALUE);
               class763.method5527(false, var15);
               class574.method4248(var5, (byte)108, var9, var6);
            }

            if (var7 == 10) {
               class726 var16 = (class726)class259.field3509.method5681((long)var8, arg0 + -112);
               if (var16 != null) {
                  ++class753.field11135;
                  class155 var17 = var16.field10794;
                  class209.field2663 = 0;
                  class447.field6800 = arg1;
                  class721.field10729 = arg3;
                  class247.field3251 = 2;
                  class180 var18 = class486.method3603(class536.field7841, (byte)-56, class48.field583);
                  var18.field2211.method1060(-23626, class200.field2500);
                  var18.field2211.method1085(class597.field8785.method1535(82, (byte)-86) ? 1 : 0, (byte)-11);
                  var18.field2211.method1103(class209.field2658, -43);
                  var18.field2211.method1103(class192.field2407, arg0 ^ -8);
                  var18.field2211.method1079(var8, 1856);
                  class763.method5527(false, var18);
                  class105.method899(var17.method3046(112), 0, true, -2, var17.field6114[0], 0, 0, var17.method3046(-63), var17.field6116[0]);
               }
            }

            if (~var7 == -49) {
               label537: {
                  if (~class445.field6773 >= -1 || !class597.field8785.method1535(82, (byte)-104) || !class597.field8785.method1535(81, (byte)-102)) {
                     class180 var19;
                     label445: {
                        var19 = class394.method3014(false, var6, var5, var8);
                        if (var8 == 1) {
                           var19.field2211.method1085(-1, (byte)-11);
                           var19.field2211.method1085(-1, (byte)-11);
                           var19.field2211.method1103((int)class56.field706, -117);
                           var19.field2211.method1085(57, (byte)-11);
                           var19.field2211.method1085(class241.field3071, (byte)-11);
                           var19.field2211.method1085(class606.field8898, (byte)-11);
                           var19.field2211.method1085(89, (byte)-11);
                           var19.field2211.method1103(class693.field10418.field9003, -104);
                           var19.field2211.method1103(class693.field10418.field9007, -119);
                           var19.field2211.method1085(63, (byte)-11);
                           if (var4 == 0) {
                              break label445;
                           }
                        }

                        class447.field6800 = arg1;
                        class209.field2663 = 0;
                        class247.field3251 = 1;
                        class721.field10729 = arg3;
                     }

                     class763.method5527(false, var19);
                     class105.method899(1, 0, true, -4, var5, 0, 0, 1, var6);
                     if (var4 == 0) {
                        break label537;
                     }
                  }

                  class30.method213(class669.field10064 + var6, -464686778, class693.field10418.field9010, class718.field10676 + var5);
               }
            }

            if (var7 == 11 && class458.field6935 == null) {
               class205.method1568(var5, true, var6);
               class458.field6935 = class241.method1793(-1, var6, var5);
               class140.method1188(class458.field6935, (byte)-126);
            }

            if (~var7 == -13) {
               class687 var20 = class661.field9578[var8];
               if (var20 != null) {
                  class447.field6800 = arg1;
                  class209.field2663 = 0;
                  ++class17.field202;
                  class721.field10729 = arg3;
                  class247.field3251 = 2;
                  class180 var21 = class486.method3603(class137.field1759, (byte)-81, class48.field583);
                  var21.field2211.method1103(var8, -68);
                  var21.field2211.method1048(arg0 ^ 111, class597.field8785.method1535(82, (byte)-80) ? 1 : 0);
                  class763.method5527(false, var21);
                  class105.method899(var20.method3046(-60), 0, true, -2, var20.field6114[0], 0, 0, var20.method3046(6), var20.field6116[0]);
               }
            }

            if (var7 == 17) {
               class544 var22 = class241.method1793(-1, var6, var5);
               if (var22 != null) {
                  class583.method4298((byte)-11, var22);
               }
            }

            if (var7 == 58) {
               class721.field10729 = arg3;
               class447.field6800 = arg1;
               class247.field3251 = 2;
               class209.field2663 = 0;
               ++class503.field7466;
               class180 var23 = class486.method3603(class611.field8959, (byte)-45, class48.field583);
               var23.field2211.method1085(!class597.field8785.method1535(82, (byte)-73) ? 0 : 1, (byte)-11);
               var23.field2211.method1081(arg0 + 17, var8);
               var23.field2211.method1103(var5 - -class718.field10676, -97);
               var23.field2211.method1096((byte)-107, class669.field10064 + var6);
               class763.method5527(false, var23);
               class641.method4607(-12, var6, var5);
            }

            if (~var7 == -19) {
               class687 var24 = class661.field9578[var8];
               if (var24 != null) {
                  class209.field2663 = 0;
                  class447.field6800 = arg1;
                  class721.field10729 = arg3;
                  ++class551.field8157;
                  class247.field3251 = 2;
                  class180 var25 = class486.method3603(class144.field1820, (byte)-22, class48.field583);
                  var25.field2211.method1042(class597.field8785.method1535(82, (byte)-75) ? 1 : 0, arg0 ^ 19);
                  var25.field2211.method1103(var8, -85);
                  class763.method5527(false, var25);
                  class105.method899(var24.method3046(109), 0, true, -2, var24.field6114[0], arg0 + -111, 0, var24.method3046(arg0 ^ 108), var24.field6116[0]);
               }
            }

            if (var7 == 20) {
               class544 var26 = class241.method1793(-1, var6, var5);
               if (var26 != null) {
                  class8.method76(arg0 + 30576);
                  class478 var27 = client.method2388(var26);
                  class400.method3068(var26, var27.field7103, 0, var27.method3546(-2220));
                  class84.field1033 = class205.method1569((byte)-86, var26);
                  class769.field11280 = var26.field8000 + field2936[7];
                  if (class84.field1033 == null) {
                     class84.field1033 = field2936[6];
                  }
               }

            } else {
               if (var7 == 1011) {
                  class247.field3251 = 2;
                  class209.field2663 = 0;
                  ++class577.field8567;
                  class721.field10729 = arg3;
                  class447.field6800 = arg1;
                  class180 var28 = class486.method3603(class181.field2240, (byte)-77, class48.field583);
                  var28.field2211.method1085(class597.field8785.method1535(82, (byte)-112) ? 1 : 0, (byte)-11);
                  var28.field2211.method1079((int)(var9 >>> 32) & Integer.MAX_VALUE, 1856);
                  var28.field2211.method1081(128, var5 - -class718.field10676);
                  var28.field2211.method1096((byte)-107, var6 - -class669.field10064);
                  class763.method5527(false, var28);
                  class574.method4248(var5, (byte)98, var9, var6);
               }

               if (var7 == 60) {
                  class687 var29 = class661.field9578[var8];
                  if (var29 != null) {
                     class447.field6800 = arg1;
                     class721.field10729 = arg3;
                     class247.field3251 = 2;
                     class209.field2663 = 0;
                     ++client.field4515;
                     class180 var30 = class486.method3603(class656.field9530, (byte)-83, class48.field583);
                     var30.field2211.method1103(var8, -113);
                     var30.field2211.method1085(class597.field8785.method1535(82, (byte)-122) ? 1 : 0, (byte)-11);
                     class763.method5527(false, var30);
                     class105.method899(var29.method3046(125), 0, true, -2, var29.field6114[0], 0, 0, var29.method3046(98), var29.field6116[0]);
                  }
               }

               if (~var7 == -51) {
                  class726 var31 = (class726)class259.field3509.method5681((long)var8, arg0 + -112);
                  if (var31 != null) {
                     class155 var32 = var31.field10794;
                     class209.field2663 = 0;
                     ++class535.field7810;
                     class447.field6800 = arg1;
                     class721.field10729 = arg3;
                     class247.field3251 = 2;
                     class180 var33 = class486.method3603(class456.field6915, (byte)-32, class48.field583);
                     var33.field2211.method1079(var8, arg0 ^ 1839);
                     var33.field2211.method1048(0, class597.field8785.method1535(82, (byte)-84) ? 1 : 0);
                     class763.method5527(false, var33);
                     class105.method899(var32.method3046(124), 0, true, -2, var32.field6114[0], 0, 0, var32.method3046(109), var32.field6116[0]);
                  }
               }

               if (~var7 == -1008) {
                  class447.field6800 = arg1;
                  class721.field10729 = arg3;
                  class247.field3251 = 2;
                  class209.field2663 = 0;
                  class726 var34 = (class726)class259.field3509.method5681((long)var8, -1);
                  if (var34 != null) {
                     class155 var35 = var34.field10794;
                     class369 var36 = var35.field1971;
                     if (var36.field5590 != null) {
                        var36 = var36.method2872(true, class597.field8793);
                     }

                     if (var36 != null) {
                        ++class472.field7057;
                        class180 var37 = class486.method3603(class369.field5626, (byte)-125, class48.field583);
                        var37.field2211.method1103(var36.field5594, arg0 ^ -40);
                        class763.method5527(false, var37);
                     }
                  }
               }

               if (var7 == 46) {
                  class687 var38 = class661.field9578[var8];
                  if (var38 != null) {
                     class247.field3251 = 2;
                     ++class394.field5970;
                     class721.field10729 = arg3;
                     class447.field6800 = arg1;
                     class209.field2663 = 0;
                     class180 var39 = class486.method3603(class322.field4592, (byte)-20, class48.field583);
                     var39.field2211.method1042(class597.field8785.method1535(82, (byte)-109) ? 1 : 0, arg0 ^ -80);
                     var39.field2211.method1103(var8, -118);
                     class763.method5527(false, var39);
                     class105.method899(var38.method3046(arg0 ^ 31), 0, true, -2, var38.field6114[0], 0, 0, var38.method3046(arg0 ^ 10), var38.field6116[0]);
                  }
               }

               if (~var7 == -26) {
                  label538: {
                     if (~class445.field6773 >= -1 || !class597.field8785.method1535(82, (byte)-78) || !class597.field8785.method1535(81, (byte)-123)) {
                        class247.field3251 = 1;
                        class447.field6800 = arg1;
                        ++class745.field11052;
                        class209.field2663 = 0;
                        class721.field10729 = arg3;
                        class180 var40 = class486.method3603(class386.field5899, (byte)-119, class48.field583);
                        var40.field2211.method1081(arg0 ^ 239, class669.field10064 - -var6);
                        var40.field2211.method1096((byte)-107, class718.field10676 - -var5);
                        class763.method5527(false, var40);
                        if (var4 == 0) {
                           break label538;
                        }
                     }

                     class30.method213(class669.field10064 + var6, -464686778, class693.field10418.field9010, class718.field10676 + var5);
                  }
               }

               if (var7 == 8) {
                  class721.field10729 = arg3;
                  class209.field2663 = 0;
                  class447.field6800 = arg1;
                  ++class709.field10587;
                  class247.field3251 = 2;
                  class180 var41 = class486.method3603(class770.field11287, (byte)-9, class48.field583);
                  var41.field2211.method1081(128, class669.field10064 + var6);
                  var41.field2211.method1096((byte)-107, class718.field10676 + var5);
                  var41.field2211.method1085(class597.field8785.method1535(82, (byte)-79) ? 1 : 0, (byte)-11);
                  var41.field2211.method1096((byte)-107, (int)(var9 >>> 32) & Integer.MAX_VALUE);
                  class763.method5527(false, var41);
                  class574.method4248(var5, (byte)86, var9, var6);
               }

               if (var7 == 16) {
                  class726 var42 = (class726)class259.field3509.method5681((long)var8, arg0 ^ -112);
                  if (var42 != null) {
                     class155 var43 = var42.field10794;
                     class209.field2663 = 0;
                     ++class569.field8479;
                     class247.field3251 = 2;
                     class447.field6800 = arg1;
                     class721.field10729 = arg3;
                     class180 var44 = class486.method3603(class10.field146, (byte)-107, class48.field583);
                     var44.field2211.method1048(0, class597.field8785.method1535(82, (byte)-82) ? 1 : 0);
                     var44.field2211.method1096((byte)-107, var8);
                     class763.method5527(false, var44);
                     class105.method899(var43.method3046(-72), 0, true, -2, var43.field6114[0], 0, 0, var43.method3046(116), var43.field6116[0]);
                  }
               }

               if (var7 == 45) {
                  class247.field3251 = 2;
                  ++class680.field10221;
                  class721.field10729 = arg3;
                  class209.field2663 = 0;
                  class447.field6800 = arg1;
                  class180 var45 = class486.method3603(class690.field10401, (byte)-64, class48.field583);
                  var45.field2211.method1103(class192.field2407, -19);
                  var45.field2211.method1079(class669.field10064 + var6, 1856);
                  var45.field2211.method1103(var8, -80);
                  var45.field2211.method1051((byte)-123, class200.field2500);
                  var45.field2211.method1079(var5 - -class718.field10676, arg0 ^ 1839);
                  var45.field2211.method1085(!class597.field8785.method1535(82, (byte)-90) ? 0 : 1, (byte)-11);
                  var45.field2211.method1079(class209.field2658, 1856);
                  class763.method5527(false, var45);
                  class641.method4607(-45, var6, var5);
               }

               if (var7 == 3) {
                  class247.field3251 = 2;
                  class721.field10729 = arg3;
                  class447.field6800 = arg1;
                  ++class659.field9555;
                  class209.field2663 = 0;
                  class180 var46 = class486.method3603(class685.field10274, (byte)-96, class48.field583);
                  var46.field2211.method1096((byte)-107, var8);
                  var46.field2211.method1042(class597.field8785.method1535(82, (byte)-121) ? 1 : 0, -58);
                  var46.field2211.method1096((byte)-107, var6 - -class669.field10064);
                  var46.field2211.method1079(class718.field10676 + var5, 1856);
                  class763.method5527(false, var46);
                  class641.method4607(arg0 + -205, var6, var5);
               }

               if (var7 == 4) {
                  class726 var47 = (class726)class259.field3509.method5681((long)var8, -1);
                  if (var47 != null) {
                     class447.field6800 = arg1;
                     class209.field2663 = 0;
                     class721.field10729 = arg3;
                     class247.field3251 = 2;
                     class155 var48 = var47.field10794;
                     ++class744.field11029;
                     class180 var49 = class486.method3603(class604.field8880, (byte)-94, class48.field583);
                     var49.field2211.method1096((byte)-107, var8);
                     var49.field2211.method1048(0, !class597.field8785.method1535(82, (byte)-101) ? 0 : 1);
                     class763.method5527(false, var49);
                     class105.method899(var48.method3046(101), 0, true, -2, var48.field6114[0], 0, 0, var48.method3046(-25), var48.field6116[0]);
                  }
               }

               if (~var7 == -6) {
                  class209.field2663 = 0;
                  ++class540.field7875;
                  class247.field3251 = 2;
                  class721.field10729 = arg3;
                  class447.field6800 = arg1;
                  class180 var50 = class486.method3603(class618.field9017, (byte)-89, class48.field583);
                  var50.field2211.method1079(class669.field10064 + var6, 1856);
                  var50.field2211.method1103((int)(var9 >>> 32) & Integer.MAX_VALUE, -111);
                  var50.field2211.method1079(class718.field10676 + var5, 1856);
                  var50.field2211.method1048(0, !class597.field8785.method1535(82, (byte)-107) ? 0 : 1);
                  class763.method5527(false, var50);
                  class574.method4248(var5, (byte)114, var9, var6);
               }

               if (var7 == 57) {
                  class247.field3251 = 1;
                  class209.field2663 = 0;
                  ++class183.field2274;
                  class721.field10729 = arg3;
                  class447.field6800 = arg1;
                  class180 var51 = class486.method3603(class70.field889, (byte)-14, class48.field583);
                  var51.field2211.method1079(class209.field2658, 1856);
                  var51.field2211.method1096((byte)-107, class718.field10676 - -var5);
                  var51.field2211.method1096((byte)-107, class669.field10064 + var6);
                  var51.field2211.method1060(-23626, class200.field2500);
                  var51.field2211.method1096((byte)-107, class192.field2407);
                  class763.method5527(false, var51);
                  class105.method899(1, 0, true, -4, var5, 0, 0, 1, var6);
               }

               if (var7 == 1009) {
                  class721.field10729 = arg3;
                  ++class227.field2911;
                  class447.field6800 = arg1;
                  class209.field2663 = 0;
                  class247.field3251 = 2;
                  class180 var52 = class486.method3603(class140.field1800, (byte)-23, class48.field583);
                  var52.field2211.method1103(var8, -103);
                  class763.method5527(false, var52);
               }

               if (~var7 == -54) {
                  class687 var53 = class661.field9578[var8];
                  if (var53 != null) {
                     class447.field6800 = arg1;
                     class247.field3251 = 2;
                     class721.field10729 = arg3;
                     ++class541.field7890;
                     class209.field2663 = 0;
                     class180 var54 = class486.method3603(class790.field11476, (byte)-17, class48.field583);
                     var54.field2211.method1051((byte)-128, class200.field2500);
                     var54.field2211.method1079(class192.field2407, 1856);
                     var54.field2211.method1096((byte)-107, var8);
                     var54.field2211.method1081(128, class209.field2658);
                     var54.field2211.method1085(class597.field8785.method1535(82, (byte)-90) ? 1 : 0, (byte)-11);
                     class763.method5527(false, var54);
                     class105.method899(var53.method3046(127), 0, true, -2, var53.field6114[0], 0, 0, var53.method3046(121), var53.field6116[0]);
                  }
               }

               if (var7 == 59) {
                  class687 var55 = class661.field9578[var8];
                  if (var55 != null) {
                     ++class17.field202;
                     class721.field10729 = arg3;
                     class247.field3251 = 2;
                     class209.field2663 = 0;
                     class447.field6800 = arg1;
                     class180 var56 = class486.method3603(class312.field4464, (byte)-30, class48.field583);
                     var56.field2211.method1085(class597.field8785.method1535(82, (byte)-116) ? 1 : 0, (byte)-11);
                     var56.field2211.method1096((byte)-107, var8);
                     class763.method5527(false, var56);
                     class105.method899(var55.method3046(99), 0, true, -2, var55.field6114[0], 0, 0, var55.method3046(109), var55.field6116[0]);
                  }
               }

               if (var7 == 9) {
                  class687 var57 = class661.field9578[var8];
                  if (var57 != null) {
                     class209.field2663 = 0;
                     ++class498.field7383;
                     class247.field3251 = 2;
                     class721.field10729 = arg3;
                     class447.field6800 = arg1;
                     class180 var58 = class486.method3603(class545.field8098, (byte)-44, class48.field583);
                     var58.field2211.method1085(!class597.field8785.method1535(82, (byte)-120) ? 0 : 1, (byte)-11);
                     var58.field2211.method1096((byte)-107, var8);
                     class763.method5527(false, var58);
                     class105.method899(var57.method3046(113), 0, true, -2, var57.field6114[0], 0, 0, var57.method3046(-68), var57.field6116[0]);
                  }
               }

               if (~var7 == -3) {
                  class209.field2663 = 0;
                  class247.field3251 = 2;
                  ++class179.field2208;
                  class447.field6800 = arg1;
                  class721.field10729 = arg3;
                  class180 var59 = class486.method3603(class420.field6406, (byte)-118, class48.field583);
                  var59.field2211.method1096((byte)-107, class718.field10676 + var5);
                  var59.field2211.method1042(!class597.field8785.method1535(82, (byte)-125) ? 0 : 1, 126);
                  var59.field2211.method1103(var8, arg0 + -141);
                  var59.field2211.method1081(128, var6 - -class669.field10064);
                  class763.method5527(false, var59);
                  class641.method4607(-119, var6, var5);
               }

               if (var7 == 52) {
                  class726 var60 = (class726)class259.field3509.method5681((long)var8, arg0 + -112);
                  if (var60 != null) {
                     class721.field10729 = arg3;
                     class209.field2663 = 0;
                     class155 var61 = var60.field10794;
                     class447.field6800 = arg1;
                     ++class562.field8399;
                     class247.field3251 = 2;
                     class180 var62 = class486.method3603(class102.field1247, (byte)-54, class48.field583);
                     var62.field2211.method1042(!class597.field8785.method1535(82, (byte)-84) ? 0 : 1, -45);
                     var62.field2211.method1079(var8, arg0 + 1745);
                     class763.method5527(false, var62);
                     class105.method899(var61.method3046(100), 0, true, -2, var61.field6114[0], arg0 ^ 111, 0, var61.method3046(117), var61.field6116[0]);
                  }
               }

               if (~var7 == -20) {
                  class687 var63 = class661.field9578[var8];
                  if (var63 != null) {
                     class247.field3251 = 2;
                     class209.field2663 = 0;
                     ++class285.field4006;
                     class447.field6800 = arg1;
                     class721.field10729 = arg3;
                     class180 var64 = class486.method3603(class236.field2998, (byte)-81, class48.field583);
                     var64.field2211.method1096((byte)-107, var8);
                     var64.field2211.method1042(!class597.field8785.method1535(82, (byte)-120) ? 0 : 1, 77);
                     class763.method5527(false, var64);
                     class105.method899(var63.method3046(-21), 0, true, -2, var63.field6114[0], 0, 0, var63.method3046(arg0 + -234), var63.field6116[0]);
                  }
               }

               if (var7 == 49) {
                  class247.field3251 = 2;
                  class721.field10729 = arg3;
                  class209.field2663 = 0;
                  ++class383.field5871;
                  class447.field6800 = arg1;
                  class180 var65 = class486.method3603(class793.field11560, (byte)-86, class48.field583);
                  var65.field2211.method1079(class192.field2407, 1856);
                  var65.field2211.method1096((byte)-107, class209.field2658);
                  var65.field2211.method1085(class597.field8785.method1535(82, (byte)-109) ? 1 : 0, (byte)-11);
                  var65.field2211.method1051((byte)-120, class200.field2500);
                  var65.field2211.method1103(class718.field10676 + var5, -96);
                  var65.field2211.method1103(class669.field10064 + var6, arg0 + -202);
                  var65.field2211.method1081(128, (int)(var9 >>> 32) & Integer.MAX_VALUE);
                  class763.method5527(false, var65);
                  class574.method4248(var5, (byte)65, var9, var6);
               }

               if (var7 == 1006 || ~var7 == -1013 || var7 == 1008 || ~var7 == -1003 || ~var7 == -1005) {
                  class766.method5545(var7, (byte)95, var5, var8);
               }

               if (var7 == 23) {
                  class726 var66 = (class726)class259.field3509.method5681((long)var8, -1);
                  if (var66 != null) {
                     ++class767.field11251;
                     class247.field3251 = 2;
                     class447.field6800 = arg1;
                     class155 var67 = var66.field10794;
                     class209.field2663 = 0;
                     class721.field10729 = arg3;
                     class180 var68 = class486.method3603(class537.field7849, (byte)-49, class48.field583);
                     var68.field2211.method1048(arg0 + -111, class597.field8785.method1535(82, (byte)-90) ? 1 : 0);
                     var68.field2211.method1079(var8, 1856);
                     class763.method5527(false, var68);
                     class105.method899(var67.method3046(-100), 0, true, -2, var67.field6114[0], 0, 0, var67.method3046(arg0 + -12), var67.field6116[0]);
                  }
               }

               if (var7 == 47) {
                  class687 var69 = class661.field9578[var8];
                  if (var69 != null) {
                     class209.field2663 = 0;
                     class247.field3251 = 2;
                     ++class387.field5917;
                     class447.field6800 = arg1;
                     class721.field10729 = arg3;
                     class180 var70 = class486.method3603(class638.field9289, (byte)-46, class48.field583);
                     var70.field2211.method1081(128, var8);
                     var70.field2211.method1048(0, !class597.field8785.method1535(82, (byte)-91) ? 0 : 1);
                     class763.method5527(false, var70);
                     class105.method899(var69.method3046(arg0 ^ -30), 0, true, -2, var69.field6114[0], arg0 ^ 111, 0, var69.method3046(arg0 + -2), var69.field6116[0]);
                  }
               }

               if (var7 == 15) {
                  class447.field6800 = arg1;
                  class209.field2663 = 0;
                  ++class96.field1186;
                  class247.field3251 = 2;
                  class721.field10729 = arg3;
                  class180 var71 = class486.method3603(class382.field5858, (byte)-125, class48.field583);
                  var71.field2211.method1042(!class597.field8785.method1535(82, (byte)-118) ? 0 : 1, -49);
                  var71.field2211.method1081(128, var5 - -class718.field10676);
                  var71.field2211.method1103((int)(var9 >>> 32) & Integer.MAX_VALUE, arg0 + -160);
                  var71.field2211.method1079(class669.field10064 + var6, 1856);
                  class763.method5527(false, var71);
                  class574.method4248(var5, (byte)119, var9, var6);
               }

               if (var7 == 21 || ~var7 == -1004) {
                  class338.method2600(arg2.field4318, var8, var5, var6, false);
               }

               if (var7 == 51) {
                  class687 var72 = class661.field9578[var8];
                  if (var72 != null) {
                     class247.field3251 = 2;
                     class721.field10729 = arg3;
                     class447.field6800 = arg1;
                     class209.field2663 = 0;
                     ++class17.field202;
                     class180 var73 = class486.method3603(class749.field11105, (byte)-87, class48.field583);
                     var73.field2211.method1096((byte)-107, var8);
                     var73.field2211.method1062(!class597.field8785.method1535(82, (byte)-126) ? 0 : 1, -128);
                     class763.method5527(false, var73);
                     class105.method899(var72.method3046(109), 0, true, -2, var72.field6114[0], 0, 0, var72.method3046(121), var72.field6116[0]);
                  }
               }

               if (~var7 == -7) {
                  class447.field6800 = arg1;
                  class721.field10729 = arg3;
                  class209.field2663 = 0;
                  ++class541.field7890;
                  class247.field3251 = 2;
                  class180 var74 = class486.method3603(class790.field11476, (byte)-92, class48.field583);
                  var74.field2211.method1051((byte)-124, class200.field2500);
                  var74.field2211.method1079(class192.field2407, 1856);
                  var74.field2211.method1096((byte)-107, class693.field10418.field6027);
                  var74.field2211.method1081(arg0 ^ 239, class209.field2658);
                  var74.field2211.method1085(class597.field8785.method1535(82, (byte)-126) ? 1 : 0, (byte)-11);
                  class763.method5527(false, var74);
               }

               if (var7 == 44) {
                  class247.field3251 = 2;
                  class209.field2663 = 0;
                  class721.field10729 = arg3;
                  class447.field6800 = arg1;
                  ++class409.field6237;
                  class180 var75 = class486.method3603(class88.field1068, (byte)-29, class48.field583);
                  var75.field2211.method1085(!class597.field8785.method1535(82, (byte)-98) ? 0 : 1, (byte)-11);
                  var75.field2211.method1079(var8, 1856);
                  var75.field2211.method1096((byte)-107, var5 - -class718.field10676);
                  var75.field2211.method1081(128, class669.field10064 + var6);
                  class763.method5527(false, var75);
                  class641.method4607(arg0 + -202, var6, var5);
               }

               if (class367.field5530) {
                  class8.method76(30687);
               }

               if (class687.field10344 != null && class37.field403 == 0) {
                  class140.method1188(class687.field10344, (byte)-122);
               }
            }
         }
      } catch (RuntimeException var77) {
         throw class670.method4877(var77, field2936[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2936[2] : field2936[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method70(int arg0, byte arg1) {
      try {
         ++field2935;
         int var3 = 95 % ((arg1 - -51) / 60);
         return super.field6980.method4673((byte)-76).method3317(19285) < 96 ? 3 : 1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2936[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method78(int arg0) {
      try {
         if (arg0 != 16726277) {
            field2932 = -6;
         }

         ++field2933;
         return ~super.field6980.method4673((byte)-76).method3317(arg0 ^ 16740944) > -97 ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2936[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "<init>",
      descriptor = "(ILsk;)V"
   )
   public class230(int arg0, class648 arg1) {
      super(arg0, arg1);

      try {
         class630.method4539(super.field6984, -84);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2936[1] + arg0 + ',' + (arg1 != null ? field2936[2] : field2936[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method1738(int arg0) {
      try {
         if (arg0 <= 81) {
            field2934 = null;
         }

         ++field2931;
         return super.field6984;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field2936[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1739(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1740(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 117;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
