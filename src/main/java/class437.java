import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class437 {
   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5960 = new String[]{method3377(method3376("=\u0018bj\u001a")), method3377(method3376("4\u001e G")), method3377(method3376("!Eb\u0005O")), method3377(method3376("=\u0018bi\u001a")), method3377(method3376("=\u0018bh\u001a")), method3377(method3376("\u0014\u001e G")), method3377(method3376("f\b#G\u000f<\r*MT<U"))};
   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "Laka;"
   )
   public static class418 field5956 = new class418(0, -2);
   @OriginalMember(
      owner = "client!gs",
      name = "e",
      descriptor = "Lqb;"
   )
   public static class68 field5958 = new class68();
   @OriginalMember(
      owner = "client!gs",
      name = "b",
      descriptor = "Lmu;"
   )
   public static class314 field5959 = new class314();
   @OriginalMember(
      owner = "client!gs",
      name = "c",
      descriptor = "I"
   )
   public static int field5955;
   @OriginalMember(
      owner = "client!gs",
      name = "d",
      descriptor = "I"
   )
   public static int field5957;

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3373(byte arg0) {
      try {
         field5959 = null;
         field5958 = null;
         field5956 = null;
         if (arg0 > -111) {
            method3375((class541)null, 127, 95, 55);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5960[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lfm;III[I[I)Lfaa;"
   )
   public static final class477 method3374(class281 arg0, int arg1, int arg2, int arg3, int[] arg4, int[] arg5) {
      boolean var6 = client.field1481;

      try {
         if (arg1 != 14635) {
            return null;
         } else {
            ++field5955;
            if (!arg0.method1407(class576.field8541, -2, class673.field9968)) {
               int[] var11 = new int[arg2 * arg3];
               int var12 = 0;
               if (!var6 && ~arg2 >= ~var12) {
                  return new class477(arg0, arg3, arg2, var11);
               } else {
                  do {
                     int var13 = arg3 * var12 + arg5[var12];
                     int var14 = 0;
                     if (var6) {
                        var11[var13++] = -16777216;
                        ++var14;
                     }

                     while(true) {
                        while(~arg4[var12] < ~var14) {
                           var11[var13++] = -16777216;
                           ++var14;
                        }

                        if (!var6) {
                           ++var12;
                           break;
                        }

                        ++var14;
                     }
                  } while(~arg2 < ~var12);

                  return new class477(arg0, arg3, arg2, var11);
               }
            } else {
               byte[] var7 = new byte[arg2 * arg3];
               int var8 = 0;
               if (!var6 && ~arg2 >= ~var8) {
                  return new class477(arg0, arg3, arg2, var7);
               } else {
                  do {
                     int var9 = arg3 * var8 + arg5[var8];
                     int var10 = 0;
                     if (var6) {
                        var7[var9++] = -1;
                        ++var10;
                     }

                     while(true) {
                        while(var10 < arg4[var8]) {
                           var7[var9++] = -1;
                           ++var10;
                        }

                        if (!var6) {
                           ++var8;
                           break;
                        }

                        ++var10;
                     }
                  } while(~arg2 < ~var8);

                  return new class477(arg0, arg3, arg2, var7);
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class93.method866(var16, field5960[0] + (arg0 != null ? field5960[2] : field5960[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5960[2] : field5960[1]) + ',' + (arg5 != null ? field5960[2] : field5960[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "a",
      descriptor = "(Lwf;III)V"
   )
   public static final void method3375(class541 arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         ++field5957;
         if (arg0 != null && class500.field6967.field527 != arg0) {
            int var5 = arg0.field7914;
            int var6 = arg0.field7908;
            int var7 = arg0.field7909;
            int var8 = (int)arg0.field7912;
            long var9 = arg0.field7912;
            if (~var7 <= -2001) {
               var7 -= 2000;
            }

            if (~var7 == -1013) {
               class543.field7926 = 0;
               class233.field2898 = arg1;
               class238.field3009 = arg3;
               class54.field739 = 2;
               class411 var11 = (class411)class35.field493.method1818(-1, (long)var8);
               if (var11 != null) {
                  class81 var12 = var11.field5654;
                  class473 var13 = var12.field1135;
                  if (var13.field6583 != null) {
                     var13 = var13.method3603(class175.field2266, 4764);
                  }

                  if (var13 != null) {
                     ++class77.field1020;
                     class702 var14 = class19.method142(class387.field5365.field8765, class238.field3035, (byte)-76);
                     var14.field10264.method611(var13.field6574, -1344798296);
                     class387.field5365.method4423(var14, (byte)123);
                  }
               }
            }

            if (~var7 == -45) {
               class783 var15 = class59.field771[var8];
               if (var15 != null) {
                  class54.field739 = 2;
                  class543.field7926 = 0;
                  class238.field3009 = arg3;
                  ++class99.field1310;
                  class233.field2898 = arg1;
                  class702 var16 = class19.method142(class387.field5365.field8765, class789.field11509, (byte)-117);
                  var16.field10264.method607(124, var8);
                  var16.field10264.method614((byte)-48, !class15.field273.method2538(true, 82) ? 0 : 1);
                  class387.field5365.method4423(var16, (byte)118);
                  class412.method3236(true, -2, var15.method78(0), 0, var15.field210[0], var15.field205[0], arg2 + -1, 0, var15.method78(0));
               }
            }

            if (~var7 == -54) {
               class543.field7926 = 0;
               class233.field2898 = arg1;
               class54.field739 = 2;
               ++class663.field9825;
               class238.field3009 = arg3;
               class702 var17 = class19.method142(class387.field5365.field8765, class294.field4106, (byte)-91);
               var17.field10264.method643(false, var8);
               var17.field10264.method593(!class15.field273.method2538(true, 82) ? 0 : 1, 867770704);
               var17.field10264.method611(class353.field4940 + var6, arg2 ^ -1344798295);
               var17.field10264.method643(false, class539.field7889 + var5);
               class387.field5365.method4423(var17, (byte)102);
               class616.method4539((byte)-81, var6, var5);
            }

            if (~var7 == -13) {
               class411 var18 = (class411)class35.field493.method1818(arg2 + -2, (long)var8);
               if (var18 != null) {
                  class54.field739 = 2;
                  class233.field2898 = arg1;
                  ++class218.field2757;
                  class238.field3009 = arg3;
                  class81 var19 = var18.field5654;
                  class543.field7926 = 0;
                  class702 var20 = class19.method142(class387.field5365.field8765, class277.field3543, (byte)-82);
                  var20.field10264.method609(-3, var8);
                  var20.field10264.method593(!class15.field273.method2538(true, 82) ? 0 : 1, 867770704);
                  class387.field5365.method4423(var20, (byte)108);
                  class412.method3236(true, -2, var19.method78(0), 0, var19.field210[0], var19.field205[0], 0, 0, var19.method78(0));
               }
            }

            if (var7 == 6) {
               class411 var21 = (class411)class35.field493.method1818(-1, (long)var8);
               if (var21 != null) {
                  class54.field739 = 2;
                  class543.field7926 = 0;
                  class233.field2898 = arg1;
                  ++class786.field11481;
                  class238.field3009 = arg3;
                  class81 var22 = var21.field5654;
                  class702 var23 = class19.method142(class387.field5365.field8765, class642.field9555, (byte)-103);
                  var23.field10264.method617((byte)53, !class15.field273.method2538(true, 82) ? 0 : 1);
                  var23.field10264.method607(124, var8);
                  class387.field5365.method4423(var23, (byte)100);
                  class412.method3236(true, -2, var22.method78(0), 0, var22.field210[0], var22.field205[0], 0, 0, var22.method78(0));
               }
            }

            if (~var7 == -47) {
               class783 var24 = class59.field771[var8];
               if (var24 != null) {
                  class233.field2898 = arg1;
                  class543.field7926 = 0;
                  ++class89.field1207;
                  class54.field739 = 2;
                  class238.field3009 = arg3;
                  class702 var25 = class19.method142(class387.field5365.field8765, class593.field8744, (byte)-75);
                  var25.field10264.method598(class15.field273.method2538(true, 82) ? 1 : 0, 30);
                  var25.field10264.method611(var8, arg2 + -1344798297);
                  class387.field5365.method4423(var25, (byte)102);
                  class412.method3236(true, -2, var24.method78(0), 0, var24.field210[0], var24.field205[0], 0, 0, var24.method78(0));
               }
            }

            if (var7 == 1008) {
               class238.field3009 = arg3;
               ++class627.field9255;
               class233.field2898 = arg1;
               class54.field739 = 2;
               class543.field7926 = 0;
               class702 var26 = class19.method142(class387.field5365.field8765, class212.field2691, (byte)-89);
               var26.field10264.method643(false, class353.field4940 + var6);
               var26.field10264.method611((int)(var9 >>> 32) & Integer.MAX_VALUE, -1344798296);
               var26.field10264.method598(class15.field273.method2538(true, 82) ? 1 : 0, 90);
               var26.field10264.method643(false, class539.field7889 + var5);
               class387.field5365.method4423(var26, (byte)104);
               class188.method1579((byte)53, var5, var6, var9);
            }

            if (~var7 == -17 && class201.field2554 == null) {
               class575.method4315(var6, -128, var5);
               class201.field2554 = class77.method737(-16985, var6, var5);
               class49.method372(class201.field2554, 0);
            }

            if (var7 == 48) {
               label470: {
                  if (~class580.field8586 < -1 && class15.field273.method2538(true, 82) && class15.field273.method2538(true, 81)) {
                     class364.method2864(class539.field7889 + var5, (byte)-108, class353.field4940 + var6, class204.field2593.field10457);
                     if (!var4) {
                        break label470;
                     }
                  }

                  class702 var27;
                  label441: {
                     var27 = class142.method1164(false, var6, var8, var5);
                     if (~var8 != -2) {
                        class543.field7926 = 0;
                        class233.field2898 = arg1;
                        class238.field3009 = arg3;
                        class54.field739 = 1;
                        if (!var4) {
                           break label441;
                        }
                     }

                     var27.field10264.method593(-1, 867770704);
                     var27.field10264.method593(-1, 867770704);
                     var27.field10264.method611((int)class623.field9202, -1344798296);
                     var27.field10264.method593(57, 867770704);
                     var27.field10264.method593(class495.field6914, 867770704);
                     var27.field10264.method593(class391.field5419, 867770704);
                     var27.field10264.method593(89, 867770704);
                     var27.field10264.method611(class204.field2593.field10467, arg2 + -1344798297);
                     var27.field10264.method611(class204.field2593.field10468, -1344798296);
                     var27.field10264.method593(63, 867770704);
                  }

                  class387.field5365.method4423(var27, (byte)104);
                  class412.method3236(true, -4, 1, 0, var5, var6, arg2 + -1, 0, 1);
               }
            }

            if (var7 == 25) {
               class783 var28 = class59.field771[var8];
               if (var28 != null) {
                  class543.field7926 = 0;
                  class238.field3009 = arg3;
                  ++class397.field5474;
                  class54.field739 = 2;
                  class233.field2898 = arg1;
                  class702 var29 = class19.method142(class387.field5365.field8765, class123.field1611, (byte)-102);
                  var29.field10264.method609(-3, var8);
                  var29.field10264.method593(!class15.field273.method2538(true, 82) ? 0 : 1, arg2 ^ 867770705);
                  class387.field5365.method4423(var29, (byte)97);
                  class412.method3236(true, -2, var28.method78(0), 0, var28.field210[0], var28.field205[0], 0, 0, var28.method78(0));
               }
            }

            if (arg2 == 1) {
               if (~var7 == -60) {
                  class783 var30 = class59.field771[var8];
                  if (var30 != null) {
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     class54.field739 = 2;
                     ++class765.field11193;
                     class543.field7926 = 0;
                     class702 var31 = class19.method142(class387.field5365.field8765, class39.field538, (byte)-99);
                     var31.field10264.method593(class15.field273.method2538(true, 82) ? 1 : 0, arg2 + 867770703);
                     var31.field10264.method609(-3, var8);
                     class387.field5365.method4423(var31, (byte)102);
                     class412.method3236(true, -2, var30.method78(arg2 + -1), 0, var30.field210[0], var30.field205[0], arg2 ^ 1, 0, var30.method78(0));
                  }
               }

               if (var7 == 15) {
                  class411 var32 = (class411)class35.field493.method1818(arg2 + -2, (long)var8);
                  if (var32 != null) {
                     class81 var33 = var32.field5654;
                     class543.field7926 = 0;
                     class54.field739 = 2;
                     class233.field2898 = arg1;
                     class238.field3009 = arg3;
                     ++class419.field5726;
                     class702 var34 = class19.method142(class387.field5365.field8765, class558.field8175, (byte)-82);
                     var34.field10264.method641(class26.field392, -125);
                     var34.field10264.method607(arg2 ^ 125, class371.field5188);
                     var34.field10264.method643(false, class226.field2826);
                     var34.field10264.method643(false, var8);
                     var34.field10264.method617((byte)53, !class15.field273.method2538(true, 82) ? 0 : 1);
                     class387.field5365.method4423(var34, (byte)99);
                     class412.method3236(true, -2, var33.method78(0), 0, var33.field210[0], var33.field205[0], 0, 0, var33.method78(0));
                  }
               }

               if (var7 == 60) {
                  label536: {
                     if (class580.field8586 <= 0 || !class15.field273.method2538(true, 82) || !class15.field273.method2538(true, 81)) {
                        class233.field2898 = arg1;
                        ++class516.field7235;
                        class54.field739 = 1;
                        class238.field3009 = arg3;
                        class543.field7926 = 0;
                        class702 var35 = class19.method142(class387.field5365.field8765, class650.field9703, (byte)-124);
                        var35.field10264.method607(127, class353.field4940 + var6);
                        var35.field10264.method643(false, class539.field7889 + var5);
                        class387.field5365.method4423(var35, (byte)118);
                        if (!var4) {
                           break label536;
                        }
                     }

                     class364.method2864(class539.field7889 + var5, (byte)-51, class353.field4940 - -var6, class204.field2593.field10457);
                  }
               }

               if (var7 == 1011) {
                  class543.field7926 = 0;
                  ++class670.field9928;
                  class238.field3009 = arg3;
                  class54.field739 = 2;
                  class233.field2898 = arg1;
                  class702 var36 = class19.method142(class387.field5365.field8765, class552.field8121, (byte)-95);
                  var36.field10264.method611(var8, -1344798296);
                  class387.field5365.method4423(var36, (byte)105);
               }

               if (~var7 == -31) {
                  class783 var37 = class59.field771[var8];
                  if (var37 != null) {
                     ++class145.field1821;
                     class54.field739 = 2;
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     class543.field7926 = 0;
                     class702 var38 = class19.method142(class387.field5365.field8765, class666.field9868, (byte)-126);
                     var38.field10264.method598(class15.field273.method2538(true, 82) ? 1 : 0, 65);
                     var38.field10264.method611(class371.field5188, -1344798296);
                     var38.field10264.method609(arg2 + -4, class226.field2826);
                     var38.field10264.method643(false, var8);
                     var38.field10264.method641(class26.field392, arg2 + 38);
                     class387.field5365.method4423(var38, (byte)117);
                     class412.method3236(true, -2, var37.method78(arg2 ^ 1), 0, var37.field210[0], var37.field205[0], 0, 0, var37.method78(0));
                  }
               }

               if (var7 == 20) {
                  class543.field7926 = 0;
                  class233.field2898 = arg1;
                  class54.field739 = 2;
                  ++class459.field6310;
                  class238.field3009 = arg3;
                  class702 var39 = class19.method142(class387.field5365.field8765, class596.field8818, (byte)-107);
                  var39.field10264.method593(!class15.field273.method2538(true, 82) ? 0 : 1, 867770704);
                  var39.field10264.method611(Integer.MAX_VALUE & (int)(var9 >>> 32), -1344798296);
                  var39.field10264.method611(class539.field7889 + var5, arg2 + -1344798297);
                  var39.field10264.method611(class353.field4940 + var6, -1344798296);
                  class387.field5365.method4423(var39, (byte)111);
                  class188.method1579((byte)53, var5, var6, var9);
               }

               if (var7 == 52) {
                  class783 var40 = class59.field771[var8];
                  if (var40 != null) {
                     ++class89.field1207;
                     class238.field3009 = arg3;
                     class543.field7926 = 0;
                     class54.field739 = 2;
                     class233.field2898 = arg1;
                     class702 var41 = class19.method142(class387.field5365.field8765, class351.field4925, (byte)-102);
                     var41.field10264.method614((byte)-81, class15.field273.method2538(true, 82) ? 1 : 0);
                     var41.field10264.method607(124, var8);
                     class387.field5365.method4423(var41, (byte)127);
                     class412.method3236(true, -2, var40.method78(0), 0, var40.field210[0], var40.field205[0], 0, 0, var40.method78(arg2 + -1));
                  }
               }

               if (var7 == 17) {
                  class783 var42 = class59.field771[var8];
                  if (var42 != null) {
                     class233.field2898 = arg1;
                     class54.field739 = 2;
                     class543.field7926 = 0;
                     class238.field3009 = arg3;
                     ++class89.field1207;
                     class702 var43 = class19.method142(class387.field5365.field8765, class278.field3551, (byte)-80);
                     var43.field10264.method609(-3, var8);
                     var43.field10264.method617((byte)53, !class15.field273.method2538(true, 82) ? 0 : 1);
                     class387.field5365.method4423(var43, (byte)101);
                     class412.method3236(true, -2, var42.method78(0), 0, var42.field210[0], var42.field205[0], 0, 0, var42.method78(0));
                  }
               }

               if (var7 == 3) {
                  class642 var44 = class77.method737(-16985, var6, var5);
                  if (var44 != null) {
                     class321.method2526(arg2 + 27351);
                     class729 var45 = client.method999(var44);
                     class263.method2110(var45.field10634, var44, -14332, var45.method5275(4004219));
                     class649.field9694 = class403.method3159(-1, var44);
                     class207.field2632 = var44.field9560 + field5960[6];
                     if (class649.field9694 == null) {
                        class649.field9694 = field5960[5];
                     }
                  }

               } else {
                  if (~var7 == -1011) {
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     class543.field7926 = 0;
                     class54.field739 = 2;
                     ++class201.field2551;
                     class702 var46 = class19.method142(class387.field5365.field8765, class211.field2688, (byte)-116);
                     var46.field10264.method611(var8, -1344798296);
                     class387.field5365.method4423(var46, (byte)120);
                  }

                  if (var7 == 23) {
                     class238.field3009 = arg3;
                     ++class673.field9970;
                     class233.field2898 = arg1;
                     class54.field739 = 2;
                     class543.field7926 = 0;
                     class702 var47 = class19.method142(class387.field5365.field8765, class598.field8834, (byte)-74);
                     var47.field10264.method607(124, var8);
                     var47.field10264.method643(false, class539.field7889 + var5);
                     var47.field10264.method617((byte)53, class15.field273.method2538(true, 82) ? 1 : 0);
                     var47.field10264.method611(class353.field4940 + var6, -1344798296);
                     class387.field5365.method4423(var47, (byte)99);
                     class616.method4539((byte)-62, var6, var5);
                  }

                  if (~var7 == -58) {
                     class411 var48 = (class411)class35.field493.method1818(-1, (long)var8);
                     if (var48 != null) {
                        class543.field7926 = 0;
                        ++class209.field2649;
                        class233.field2898 = arg1;
                        class81 var49 = var48.field5654;
                        class54.field739 = 2;
                        class238.field3009 = arg3;
                        class702 var50 = class19.method142(class387.field5365.field8765, class755.field11057, (byte)-104);
                        var50.field10264.method593(!class15.field273.method2538(true, 82) ? 0 : 1, 867770704);
                        var50.field10264.method607(126, var8);
                        class387.field5365.method4423(var50, (byte)111);
                        class412.method3236(true, -2, var49.method78(0), 0, var49.field210[0], var49.field205[0], arg2 + -1, 0, var49.method78(0));
                     }
                  }

                  if (var7 == 8) {
                     class543.field7926 = 0;
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     class54.field739 = 2;
                     ++class278.field3547;
                     class702 var51 = class19.method142(class387.field5365.field8765, class259.field3297, (byte)-80);
                     var51.field10264.method607(arg2 + 123, class539.field7889 + var5);
                     var51.field10264.method607(arg2 + 122, var8);
                     var51.field10264.method609(arg2 ^ -4, class353.field4940 + var6);
                     var51.field10264.method598(!class15.field273.method2538(true, 82) ? 0 : 1, arg2 ^ 82);
                     class387.field5365.method4423(var51, (byte)126);
                     class616.method4539((byte)-67, var6, var5);
                  }

                  if (~var7 == -5) {
                     class783 var52 = class59.field771[var8];
                     if (var52 != null) {
                        ++class205.field2610;
                        class238.field3009 = arg3;
                        class54.field739 = 2;
                        class233.field2898 = arg1;
                        class543.field7926 = 0;
                        class702 var53 = class19.method142(class387.field5365.field8765, class684.field10086, (byte)-107);
                        var53.field10264.method609(-3, var8);
                        var53.field10264.method598(class15.field273.method2538(true, 82) ? 1 : 0, 94);
                        class387.field5365.method4423(var53, (byte)102);
                        class412.method3236(true, -2, var52.method78(0), 0, var52.field210[0], var52.field205[0], 0, 0, var52.method78(0));
                     }
                  }

                  if (var7 == 11) {
                     class233.field2898 = arg1;
                     class543.field7926 = 0;
                     class238.field3009 = arg3;
                     class54.field739 = 2;
                     ++class145.field1821;
                     class702 var54 = class19.method142(class387.field5365.field8765, class666.field9868, (byte)-128);
                     var54.field10264.method598(class15.field273.method2538(true, 82) ? 1 : 0, arg2 + 9);
                     var54.field10264.method611(class371.field5188, -1344798296);
                     var54.field10264.method609(arg2 ^ -4, class226.field2826);
                     var54.field10264.method643(false, class204.field2593.field145);
                     var54.field10264.method641(class26.field392, -111);
                     class387.field5365.method4423(var54, (byte)120);
                  }

                  if (var7 == 22) {
                     class411 var55 = (class411)class35.field493.method1818(arg2 ^ -2, (long)var8);
                     if (var55 != null) {
                        ++class79.field1095;
                        class543.field7926 = 0;
                        class238.field3009 = arg3;
                        class54.field739 = 2;
                        class81 var56 = var55.field5654;
                        class233.field2898 = arg1;
                        class702 var57 = class19.method142(class387.field5365.field8765, class681.field10026, (byte)-98);
                        var57.field10264.method643(false, var8);
                        var57.field10264.method593(!class15.field273.method2538(true, 82) ? 0 : 1, 867770704);
                        class387.field5365.method4423(var57, (byte)109);
                        class412.method3236(true, -2, var56.method78(0), 0, var56.field210[0], var56.field205[0], arg2 + -1, 0, var56.method78(arg2 + -1));
                     }
                  }

                  if (~var7 == -52) {
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     ++class581.field8590;
                     class54.field739 = 2;
                     class543.field7926 = 0;
                     class702 var58 = class19.method142(class387.field5365.field8765, class444.field6019, (byte)-96);
                     var58.field10264.method593(class15.field273.method2538(true, 82) ? 1 : 0, 867770704);
                     var58.field10264.method611(class353.field4940 + var6, -1344798296);
                     var58.field10264.method609(-3, var8);
                     var58.field10264.method607(125, class539.field7889 + var5);
                     class387.field5365.method4423(var58, (byte)101);
                     class616.method4539((byte)-74, var6, var5);
                  }

                  if (var7 == 47) {
                     class54.field739 = 2;
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     ++class544.field7954;
                     class543.field7926 = 0;
                     class702 var59 = class19.method142(class387.field5365.field8765, class413.field5679, (byte)-84);
                     var59.field10264.method617((byte)53, !class15.field273.method2538(true, 82) ? 0 : 1);
                     var59.field10264.method609(-3, var8);
                     var59.field10264.method609(-3, class353.field4940 + var6);
                     var59.field10264.method607(127, class539.field7889 + var5);
                     class387.field5365.method4423(var59, (byte)103);
                     class616.method4539((byte)-86, var6, var5);
                  }

                  if (~var7 == -22) {
                     class233.field2898 = arg1;
                     class543.field7926 = 0;
                     ++class407.field5619;
                     class54.field739 = 2;
                     class238.field3009 = arg3;
                     class702 var60 = class19.method142(class387.field5365.field8765, class205.field2621, (byte)-85);
                     var60.field10264.method619(-82, class26.field392);
                     var60.field10264.method611(class539.field7889 + var5, -1344798296);
                     var60.field10264.method607(121, class226.field2826);
                     var60.field10264.method611(class353.field4940 + var6, arg2 ^ -1344798295);
                     var60.field10264.method598(class15.field273.method2538(true, 82) ? 1 : 0, 80);
                     var60.field10264.method609(arg2 + -4, class371.field5188);
                     var60.field10264.method607(arg2 ^ 121, (int)(var9 >>> 32) & Integer.MAX_VALUE);
                     class387.field5365.method4423(var60, (byte)117);
                     class188.method1579((byte)53, var5, var6, var9);
                  }

                  if (var7 == 1006 || var7 == 1007 || ~var7 == -1010 || var7 == 1001 || ~var7 == -1004) {
                     class10.method96(var5, var7, var8, (byte)-113);
                  }

                  if (~var7 == -20) {
                     class238.field3009 = arg3;
                     class543.field7926 = 0;
                     class233.field2898 = arg1;
                     class54.field739 = 2;
                     ++class791.field11580;
                     class702 var61 = class19.method142(class387.field5365.field8765, class45.field578, (byte)-93);
                     var61.field10264.method614((byte)97, !class15.field273.method2538(true, 82) ? 0 : 1);
                     var61.field10264.method611(class353.field4940 + var6, -1344798296);
                     var61.field10264.method609(-3, (int)(var9 >>> 32) & Integer.MAX_VALUE);
                     var61.field10264.method611(class539.field7889 + var5, -1344798296);
                     class387.field5365.method4423(var61, (byte)110);
                     class188.method1579((byte)53, var5, var6, var9);
                  }

                  if (~var7 == -10) {
                     class54.field739 = 2;
                     class233.field2898 = arg1;
                     class238.field3009 = arg3;
                     class543.field7926 = 0;
                     ++class129.field1656;
                     class702 var62 = class19.method142(class387.field5365.field8765, class359.field5006, (byte)-96);
                     var62.field10264.method614((byte)89, !class15.field273.method2538(true, 82) ? 0 : 1);
                     var62.field10264.method611(class353.field4940 + var6, arg2 ^ -1344798295);
                     var62.field10264.method609(arg2 ^ -4, class539.field7889 + var5);
                     var62.field10264.method643(false, Integer.MAX_VALUE & (int)(var9 >>> 32));
                     class387.field5365.method4423(var62, (byte)127);
                     class188.method1579((byte)53, var5, var6, var9);
                  }

                  if (var7 == 58) {
                     ++class408.field5632;
                     class54.field739 = 1;
                     class238.field3009 = arg3;
                     class543.field7926 = 0;
                     class233.field2898 = arg1;
                     class702 var63 = class19.method142(class387.field5365.field8765, class545.field7967, (byte)-104);
                     var63.field10264.method607(120, class371.field5188);
                     var63.field10264.method607(121, class539.field7889 + var5);
                     var63.field10264.method641(class26.field392, -121);
                     var63.field10264.method643(false, class226.field2826);
                     var63.field10264.method611(class353.field4940 + var6, -1344798296);
                     class387.field5365.method4423(var63, (byte)96);
                     class412.method3236(true, -4, 1, 0, var5, var6, 0, 0, 1);
                  }

                  if (~var7 == -50) {
                     class783 var64 = class59.field771[var8];
                     if (var64 != null) {
                        class54.field739 = 2;
                        class543.field7926 = 0;
                        class233.field2898 = arg1;
                        class238.field3009 = arg3;
                        ++class98.field1300;
                        class702 var65 = class19.method142(class387.field5365.field8765, class242.field3048, (byte)-87);
                        var65.field10264.method617((byte)53, class15.field273.method2538(true, 82) ? 1 : 0);
                        var65.field10264.method643(false, var8);
                        class387.field5365.method4423(var65, (byte)100);
                        class412.method3236(true, -2, var64.method78(arg2 + -1), 0, var64.field210[0], var64.field205[0], arg2 ^ 1, 0, var64.method78(0));
                     }
                  }

                  if (~var7 == -14) {
                     class642 var66 = class77.method737(-16985, var6, var5);
                     if (var66 != null) {
                        class406.method3179(var66, 1);
                     }
                  }

                  if (~var7 == -11) {
                     ++class101.field1324;
                     class54.field739 = 2;
                     class543.field7926 = 0;
                     class233.field2898 = arg1;
                     class238.field3009 = arg3;
                     class702 var67 = class19.method142(class387.field5365.field8765, class761.field11127, (byte)-128);
                     var67.field10264.method609(-3, class353.field4940 + var6);
                     var67.field10264.method594(false, class26.field392);
                     var67.field10264.method643(false, class371.field5188);
                     var67.field10264.method611(class226.field2826, -1344798296);
                     var67.field10264.method607(127, var5 - -class539.field7889);
                     var67.field10264.method614((byte)105, !class15.field273.method2538(true, 82) ? 0 : 1);
                     var67.field10264.method609(arg2 ^ -4, var8);
                     class387.field5365.method4423(var67, (byte)119);
                     class616.method4539((byte)-90, var6, var5);
                  }

                  if (var7 == 45 || ~var7 == -1005) {
                     class307.method2456(var8, arg0.field7903, var6, 30881, var5);
                  }

                  if (var7 == 2) {
                     class411 var68 = (class411)class35.field493.method1818(arg2 + -2, (long)var8);
                     if (var68 != null) {
                        ++class78.field1036;
                        class54.field739 = 2;
                        class81 var69 = var68.field5654;
                        class543.field7926 = 0;
                        class233.field2898 = arg1;
                        class238.field3009 = arg3;
                        class702 var70 = class19.method142(class387.field5365.field8765, class764.field11184, (byte)-113);
                        var70.field10264.method614((byte)-51, class15.field273.method2538(true, 82) ? 1 : 0);
                        var70.field10264.method611(var8, arg2 + -1344798297);
                        class387.field5365.method4423(var70, (byte)107);
                        class412.method3236(true, -2, var69.method78(0), 0, var69.field210[0], var69.field205[0], arg2 + -1, 0, var69.method78(0));
                     }
                  }

                  if (~var7 == -19) {
                     class783 var71 = class59.field771[var8];
                     if (var71 != null) {
                        class238.field3009 = arg3;
                        class543.field7926 = 0;
                        ++class597.field8827;
                        class233.field2898 = arg1;
                        class54.field739 = 2;
                        class702 var72 = class19.method142(class387.field5365.field8765, class496.field6919, (byte)-76);
                        var72.field10264.method643(false, var8);
                        var72.field10264.method614((byte)-66, !class15.field273.method2538(true, 82) ? 0 : 1);
                        class387.field5365.method4423(var72, (byte)111);
                        class412.method3236(true, -2, var71.method78(arg2 + -1), 0, var71.field210[0], var71.field205[0], 0, 0, var71.method78(0));
                     }
                  }

                  if (~var7 == -51) {
                     class238.field3009 = arg3;
                     class233.field2898 = arg1;
                     class54.field739 = 2;
                     ++class81.field1149;
                     class543.field7926 = 0;
                     class702 var73 = class19.method142(class387.field5365.field8765, class107.field1433, (byte)-74);
                     var73.field10264.method607(arg2 ^ 125, class353.field4940 + var6);
                     var73.field10264.method607(126, Integer.MAX_VALUE & (int)(var9 >>> 32));
                     var73.field10264.method611(class539.field7889 + var5, -1344798296);
                     var73.field10264.method617((byte)53, !class15.field273.method2538(true, 82) ? 0 : 1);
                     class387.field5365.method4423(var73, (byte)104);
                     class188.method1579((byte)53, var5, var6, var9);
                  }

                  if (var7 == 5) {
                     class783 var74 = class59.field771[var8];
                     if (var74 != null) {
                        class238.field3009 = arg3;
                        class233.field2898 = arg1;
                        ++class762.field11154;
                        class543.field7926 = 0;
                        class54.field739 = 2;
                        class702 var75 = class19.method142(class387.field5365.field8765, class733.field10693, (byte)-91);
                        var75.field10264.method609(-3, var8);
                        var75.field10264.method593(class15.field273.method2538(true, 82) ? 1 : 0, 867770704);
                        class387.field5365.method4423(var75, (byte)108);
                        class412.method3236(true, -2, var74.method78(0), 0, var74.field210[0], var74.field205[0], 0, 0, var74.method78(0));
                     }
                  }

                  if (class597.field8823) {
                     class321.method2526(arg2 ^ 27353);
                  }

                  if (class389.field5394 != null && ~class136.field1734 == -1) {
                     class49.method372(class389.field5394, arg2 ^ 1);
                  }
               }
            }
         }
      } catch (RuntimeException var77) {
         throw class93.method866(var77, field5960[4] + (arg0 != null ? field5960[2] : field5960[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3376(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3377(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
