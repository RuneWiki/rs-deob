import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class445 {
   @OriginalMember(
      owner = "client!mba",
      name = "d",
      descriptor = "Lor;"
   )
   private class670 field6159;
   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "J"
   )
   public long field6161;
   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6165 = new String[]{method3305(method3304(":\u001bkH")), method3305(method3304("/@)\nr")), method3305(method3304("9\ff\n3=\u0000nP1|")), method3305(method3304("9\ff\ni=\u0000fHf.\u000b/")), method3305(method3304("\u0016At\u0004@!\u001a=")), method3305(method3304("hAdKcjN\u007f")), method3305(method3304("t Wg5t")), method3305(method3304("\u0013\u000fjA5t'i\u001e")), method3305(method3304("\u0003/UjF\u001a)=\u0004B1\u0003hVvt\u001btEh1NhRj&N1\u0010B\u0016O'tc1\u000ftA/=\u0000aK}9NpL`1\u0018bV/=\u001d'Vj'\u001ehJ|=\fkA/2\u0001u\u0004{<\u000b'G`:\u001abJ{{\u000fuAnt\u0017hQ/5\u001cb\u0004z'\u0007iC =\u0000)")), method3305(method3304("qN/")), method3305(method3304("\u0016At")), method3305(method3304("\u0018\u001d=\u0004")), method3305(method3304("\u0018\u0001eFvnNNJ5")), method3305(method3304("\u0004\u000fuPf7\u0002bW5t")), method3305(method3304("qG")), method3305(method3304("\u001b\baLj5\u001e=")), method3305(method3304("h\rhH22\b>\u0014;dP")), method3305(method3304("t#h@j8\u001d=\u0004")), method3305(method3304("t>k\u001e/")), method3305(method3304("\u0012\u001et\u001e")), method3305(method3304("tA'")), method3305(method3304("9\ff\nN|")), method3305(method3304("\u0019\u000bj\u001e")), method3305(method3304("t\"f\u001e/")), method3305(method3304("\u0017\u000fdLjn")), method3305(method3304("\u0004\u0001k]|nN")), method3305(method3304("9\ff\nM|")), method3305(method3304("9\u0000"))};
   @OriginalMember(
      owner = "client!mba",
      name = "e",
      descriptor = "I"
   )
   public static int field6162 = 0;
   @OriginalMember(
      owner = "client!mba",
      name = "b",
      descriptor = "I"
   )
   public static int field6160;
   @OriginalMember(
      owner = "client!mba",
      name = "c",
      descriptor = "I"
   )
   public static int field6163;
   @OriginalMember(
      owner = "client!mba",
      name = "f",
      descriptor = "I"
   )
   public static int field6164;

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(B)Lefa;"
   )
   public static final class195 method3302(byte arg0) {
      try {
         ++field6163;

         try {
            return new class474();
         } catch (Throwable var3) {
            try {
               return (class195)Class.forName(field6165[27]).newInstance();
            } catch (Throwable var2) {
               if (arg0 >= -60) {
                  field6162 = -44;
               }

               return new class319();
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field6165[26] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field6164;
         this.field6159.method4889(-107, this.field6161);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6165[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(IIIIIBZIII[Leb;)V"
   )
   public static final void method3303(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, boolean arg6, int arg7, int arg8, int arg9, class657[] arg10) {
      boolean var11 = client.field4273;

      try {
         ++field6160;
         class338.field4832.method577(arg9, arg1, arg4, arg8);
         int var12 = 48 / ((31 - arg5) / 53);
         int var13 = 0;
         if (var11 || ~var13 > ~arg10.length) {
            do {
               class657 var14 = arg10[var13];
               if (var14 != null && (~var14.field9363 == ~arg7 || arg7 == -1412584499 && (class602.field8398 == var14 || var11))) {
                  int var15;
                  int var16;
                  int var17;
                  int var18;
                  int var19;
                  label973: {
                     var15 = var14.field9256 + arg3;
                     var16 = var14.field9380 - -arg2;
                     var17 = var14.field9379 + 1 + var15;
                     var18 = var14.field9360 + var16 + 1;
                     if (~arg0 != 0) {
                        var19 = arg0;
                        if (!var11) {
                           break label973;
                        }
                     }

                     class224.field2809[class739.field10765].setBounds(var14.field9256 + arg3, var14.field9380 + arg2, var14.field9379, var14.field9360);
                     var19 = class739.field10765++;
                  }

                  var14.field9342 = var19;
                  var14.field9335 = class369.field5205;
                  if (!client.method2401(var14)) {
                     label1020: {
                        if (var14.field9209 != 0) {
                           class602.method4394((byte)106, var14);
                        }

                        int var20 = var14.field9256 - -arg3;
                        int var21 = var14.field9380 + arg2;
                        int var22 = 0;
                        int var23 = 0;
                        if (class775.field11283) {
                           var22 = class101.method916(45);
                           var23 = class291.method2190(20);
                        }

                        int var24 = var14.field9330;
                        if (class92.field1233) {
                           if (client.method2396(var14).field5875 == 0) {
                              if (var14.field9372 == 0 && var24 > 127) {
                                 var24 = 127;
                              }
                           } else if (var24 > 127) {
                              var24 = 127;
                           }
                        }

                        if (class602.field8398 == var14) {
                           if (~arg7 != 1412584498 && (class722.field10587 == var14.field9383 || ~class78.field973 == ~var14.field9383)) {
                              class777.field11297 = arg2;
                              class222.field2769 = arg3;
                              class421.field5903 = arg10;
                              if (!var11) {
                                 break label1020;
                              }
                           }

                           if (class120.field1475 && class565.field7705) {
                              int var25 = class242.field3026.method1581(69) + var22;
                              int var26 = class242.field3026.method1572(false) + var23;
                              int var27 = var26 - class508.field7039;
                              int var28 = var25 - class670.field9552;
                              if (class527.field7209 > var28) {
                                 var28 = class527.field7209;
                              }

                              if (class527.field7209 + class611.field8543.field9379 < var28 - -var14.field9379) {
                                 var28 = -var14.field9379 + class527.field7209 + class611.field8543.field9379;
                              }

                              if (var27 < class299.field3955) {
                                 var27 = class299.field3955;
                              }

                              if (class299.field3955 + class611.field8543.field9360 < var14.field9360 + var27) {
                                 var27 = class299.field3955 + class611.field8543.field9360 + -var14.field9360;
                              }

                              var20 = var28;
                              var21 = var27;
                           }

                           if (~class78.field973 == ~var14.field9383) {
                              var24 = 128;
                           }
                        }

                        int var31;
                        int var32;
                        int var33;
                        int var34;
                        if (~var14.field9372 != -3) {
                           int var29 = var14.field9379 + var20;
                           int var30 = var21 - -var14.field9360;
                           if (~var14.field9372 == -10) {
                              ++var29;
                              ++var30;
                           }

                           var31 = ~var21 >= ~arg1 ? arg1 : var21;
                           var32 = var20 <= arg9 ? arg9 : var20;
                           var33 = ~var29 > ~arg4 ? var29 : arg4;
                           var34 = ~var30 <= ~arg8 ? arg8 : var30;
                           if (var11) {
                              var34 = arg8;
                              var32 = arg9;
                              var31 = arg1;
                              var33 = arg4;
                           }
                        } else {
                           var34 = arg8;
                           var32 = arg9;
                           var31 = arg1;
                           var33 = arg4;
                        }

                        if (~var32 > ~var33 && (var31 < var34 || var11)) {
                           label1054: {
                              if (var14.field9209 != 0) {
                                 if (~class107.field1373 == ~var14.field9209 || class681.field9997 == var14.field9209) {
                                    class578.method4154(var20, var14, var21, (byte)-101);
                                    if (!class775.field11283) {
                                       class784.method5651(var14.field9360, ~class681.field9997 == ~var14.field9209, var21, var14.field9379, -76, var20);
                                       class338.field4832.method577(arg9, arg1, arg4, arg8);
                                    }

                                    class244.field3057[var19] = true;
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (~class150.field1954 == ~var14.field9209) {
                                    if (var14.method4774(class338.field4832, (byte)-41) == null) {
                                       break label1054;
                                    }

                                    class736.method5336((byte)96);
                                    class60.method455(var21, var14, var20, -110, class338.field4832);
                                    class294.field3861[var19] = true;
                                    class338.field4832.method577(arg9, arg1, arg4, arg8);
                                    if (!class775.field11283) {
                                       break label1054;
                                    }

                                    if (arg6) {
                                       class534.method3842(0, var17, var18, var16, var15);
                                       if (!var11) {
                                          break label1054;
                                       }
                                    }

                                    class369.method2854(var17, var16, var18, 2, var15);
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (~class252.field3204 == ~var14.field9209) {
                                    class235.method1774(var14, var21, var20, class338.field4832, (byte)74);
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (~class430.field6002 == ~var14.field9209) {
                                    class135.method1131(860, class338.field4832, var21, var20, var14.field9252 % 64, var14);
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (~class281.field3762 == ~var14.field9209) {
                                    if (var14.method4774(class338.field4832, (byte)-41) == null) {
                                       break label1054;
                                    }

                                    class702.method5093(-94, var21, var20, var14);
                                    class294.field3861[var19] = true;
                                    class338.field4832.method577(arg9, arg1, arg4, arg8);
                                    if (!class775.field11283) {
                                       break label1054;
                                    }

                                    if (arg6) {
                                       class534.method3842(0, var17, var18, var16, var15);
                                       if (!var11) {
                                          break label1054;
                                       }
                                    }

                                    class369.method2854(var17, var16, var18, 2, var15);
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (~class61.field672 == ~var14.field9209) {
                                    class132.method1110(class338.field4832, var21, var20, (byte)0, var14.field9379, class368.field5178, var14.field9360);
                                    class244.field3057[var19] = true;
                                    class338.field4832.method577(arg9, arg1, arg4, arg8);
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (~class688.field10081 == ~var14.field9209) {
                                    class687.method5014(var21, class338.field4832, var20, var14.field9379, true, var14.field9360);
                                    class244.field3057[var19] = true;
                                    class338.field4832.method577(arg9, arg1, arg4, arg8);
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }

                                 if (class252.field3200 == var14.field9209) {
                                    if (!class419.field5887 && !class330.field4730) {
                                       break label1054;
                                    }

                                    int var35 = var14.field9379 + var20;
                                    if (class775.field11283) {
                                       if (!arg6) {
                                          class369.method2854(var17, var16, var18, 2, var15);
                                          if (var11) {
                                             class534.method3842(0, var17, var18, var16, var15);
                                          }
                                       } else {
                                          class534.method3842(0, var17, var18, var16, var15);
                                       }
                                    }

                                    int var36 = var21 - -15;
                                    if (class419.field5887) {
                                       int var37 = -256;
                                       if (class118.field1444 < 20) {
                                          var37 = -65536;
                                       }

                                       class163.field2095.method624(-1, field6165[19] + class118.field1444, var36, var37, var35, -125);
                                       var36 += 15;
                                       Runtime var38 = Runtime.getRuntime();
                                       int var39 = (int)((var38.totalMemory() + -var38.freeMemory()) / 1024L);
                                       int var40 = -256;
                                       if (var39 > 98304) {
                                          var40 = -65536;
                                          if (class447.field6183) {
                                             class766.method5493((byte)71);
                                             int var41 = 0;
                                             if (var11) {
                                                System.gc();
                                                ++var41;
                                             }

                                             while(true) {
                                                while(~var41 > -11) {
                                                   System.gc();
                                                   ++var41;
                                                }

                                                var39 = (int)((var38.totalMemory() + -var38.freeMemory()) / 1024L);
                                                if (!var11) {
                                                   if (~var39 < -65537) {
                                                      class545.method3938(-7764, 4, field6165[8]);
                                                   }
                                                   break;
                                                }

                                                ++var41;
                                             }
                                          }
                                       }

                                       class163.field2095.method624(-1, field6165[22] + var39 + "k", var36, var40, var35, -122);
                                       var36 += 15;
                                       class163.field2095.method624(-1, field6165[7] + class605.field8474.field2795 + field6165[4] + class605.field8474.field2793 + field6165[10], var36, -256, var35, -124);
                                       var36 += 15;
                                       class163.field2095.method624(-1, field6165[12] + class605.field8473.field2795 + field6165[4] + class605.field8473.field2793 + field6165[10], var36, -256, var35, -122);
                                       var36 += 15;
                                       int var42 = class338.field4832.method610() / 1024;
                                       class163.field2095.method624(-1, field6165[15] + var42 + "k", var36, ~var42 < -65537 ? -65536 : -256, var35, -126);
                                       var36 += 15;
                                       int var43 = 0;
                                       int var44 = 0;
                                       int var45 = 0;
                                       int var46 = 0;
                                       if (var11) {
                                          if (class721.field10558[var46] != null) {
                                             var43 += class721.field10558[var46].method1600((byte)34);
                                             var44 += class721.field10558[var46].method1592(false);
                                             var45 += class721.field10558[var46].method1604(5177);
                                          }

                                          ++var46;
                                       }

                                       while(true) {
                                          while(var46 < 37) {
                                             if (class721.field10558[var46] != null) {
                                                var43 += class721.field10558[var46].method1600((byte)34);
                                                var44 += class721.field10558[var46].method1592(false);
                                                var45 += class721.field10558[var46].method1604(5177);
                                             }

                                             ++var46;
                                          }

                                          int var47 = var45 * 100 / var43;
                                          int var48 = var44 * 10000 / var43;
                                          String var49 = field6165[24] + class458.method3368(0, (long)var48, true, 2, (byte)112) + field6165[9] + var47 + field6165[14];
                                          class183.field2263.method624(-1, var49, var36, -256, var35, -124);
                                          if (!var11) {
                                             var36 += 12;
                                             break;
                                          }

                                          ++var46;
                                       }
                                    }

                                    if (~class192.field2347 < -1) {
                                       class183.field2263.method624(-1, field6165[13] + class653.field9145 + field6165[20] + class192.field2347, var36, -256, var35, -126);
                                    }

                                    var36 += 12;
                                    if (class330.field4730) {
                                       class183.field2263.method624(-1, field6165[25] + class338.field4832.method494() + field6165[17] + class338.field4832.method505(), var36, -256, var35, -123);
                                       var36 += 12;
                                       class183.field2263.method624(-1, field6165[11] + class61.field673 + field6165[23] + class759.field10988 + field6165[6] + class422.field5941 + field6165[18] + class245.field3070, var36, -256, var35, -123);
                                       var36 += 12;
                                       class261.method2002((byte)-127);
                                    }

                                    class244.field3057[var19] = true;
                                    if (!var11) {
                                       break label1054;
                                    }
                                 }
                              }

                              if (var14.field9372 == 0) {
                                 if (~class502.field6890 == ~var14.field9209 && class338.field4832.method583()) {
                                    class338.field4832.method502(var20, var21, var14.field9379, var14.field9360);
                                 }

                                 method3303(var19, var31, -var14.field9255 + var21, -var14.field9271 + var20, var33, (byte)119, arg6, var14.field9220, var34, var32, arg10);
                                 if (var14.field9322 != null) {
                                    method3303(var19, var31, -var14.field9255 + var21, -var14.field9271 + var20, var33, (byte)108, arg6, var14.field9220, var34, var32, var14.field9322);
                                 }

                                 class588 var50 = (class588)class202.field2476.method1839(-127, (long)var14.field9220);
                                 if (var50 != null) {
                                    class503.method3630(var32, var21, 91, var34, var20, var50.field8107, var19, var31, var33);
                                 }

                                 if (~class502.field6890 == ~var14.field9209 && class338.field4832.method583()) {
                                    class338.field4832.method552();
                                 }

                                 class338.field4832.method577(arg9, arg1, arg4, arg8);
                              }

                              if (class378.field5304[var19] || class309.field4103 > 1) {
                                 label1056: {
                                    if (var14.field9372 == 3) {
                                       label1000: {
                                          if (~var24 == -1) {
                                             if (var14.field9228) {
                                                class338.field4832.method508(var20, var21, var14.field9379, var14.field9360, var14.field9252, 0);
                                                if (!var11) {
                                                   break label1000;
                                                }
                                             }

                                             class338.field4832.method523(var20, var21, var14.field9379, var14.field9360, var14.field9252, 0);
                                             if (!var11) {
                                                break label1000;
                                             }
                                          }

                                          if (!var14.field9228) {
                                             class338.field4832.method523(var20, var21, var14.field9379, var14.field9360, -(var24 & 255) + 255 << 24 | 16777215 & var14.field9252, 1);
                                             if (!var11) {
                                                break label1000;
                                             }
                                          }

                                          class338.field4832.method508(var20, var21, var14.field9379, var14.field9360, -(255 & var24) + 255 << 24 | var14.field9252 & 16777215, 1);
                                       }

                                       if (!class775.field11283) {
                                          break label1056;
                                       }

                                       if (arg6) {
                                          class534.method3842(0, var17, var18, var16, var15);
                                          if (!var11) {
                                             break label1056;
                                          }
                                       }

                                       class369.method2854(var17, var16, var18, 2, var15);
                                       if (!var11) {
                                          break label1056;
                                       }
                                    }

                                    if (var14.field9372 == 4) {
                                       class66 var51 = var14.method4756(class338.field4832, (byte)-86);
                                       if (var51 == null) {
                                          if (!class143.field1897) {
                                             break label1056;
                                          }

                                          class383.method2943(false, var14);
                                          if (!var11) {
                                             break label1056;
                                          }
                                       }

                                       int var52 = var14.field9252;
                                       String var53 = var14.field9289;
                                       if (var14.field9345 != -1) {
                                          class261 var54 = class645.field9054.method485(0, var14.field9345);
                                          var53 = var54.field3371;
                                          if (var53 == null) {
                                             var53 = field6165[0];
                                          }

                                          if ((var54.field3390 == 1 || ~var14.field9274 != -2) && var14.field9274 != -1) {
                                             var53 = field6165[16] + var53 + field6165[5] + class330.method2624(false, var14.field9274);
                                          }
                                       }

                                       if (var14.field9246 != -1) {
                                          var53 = class181.method1388((byte)-66, var14.field9246);
                                          if (var53 == null) {
                                             var53 = "";
                                          }
                                       }

                                       if (class392.field5480 == var14) {
                                          var53 = class551.field7552.method3980(class494.field6787, true);
                                          var52 = var14.field9252;
                                       }

                                       if (class238.field2960) {
                                          class338.field4832.method530(var20, var21, var14.field9379 + var20, var14.field9360 + var21);
                                       }

                                       var51.method629((byte)-101, var14.field9379, var14.field9258, var14.field9360, var14.field9203, var14.field9325, !var14.field9352 ? -1 : -(var24 & 255) + 255 << 24, (class516)null, -(255 & var24) + 255 << 24 | var52, var21, 0, (int[])null, 0, var20, var53, class447.field6181, var14.field9354);
                                       if (class238.field2960) {
                                          class338.field4832.method577(arg9, arg1, arg4, arg8);
                                       }

                                       if (~var53.trim().length() >= -1) {
                                          break label1056;
                                       }

                                       if (class238.field2960) {
                                          if (!class775.field11283) {
                                             break label1056;
                                          }

                                          if (arg6) {
                                             class534.method3842(0, var17, var18, var16, var15);
                                             if (!var11) {
                                                break label1056;
                                             }
                                          }

                                          class369.method2854(var17, var16, var18, 2, var15);
                                          if (!var11) {
                                             break label1056;
                                          }
                                       }

                                       class663 var55 = class637.method4622(class338.field4832, -63, var14.field9329);
                                       int var56 = var55.method4808(var53, var14.field9379, (byte)77, class447.field6181);
                                       int var57 = var55.method4805(class447.field6181, var14.field9379, 82, var14.field9354, var53);
                                       if (!class775.field11283) {
                                          break label1056;
                                       }

                                       if (arg6) {
                                          class534.method3842(0, var20 + var56, var21 + var57, var21, var20);
                                          if (!var11) {
                                             break label1056;
                                          }
                                       }

                                       class369.method2854(var20 + var56, var21, var21 + var57, 2, var20);
                                       if (!var11) {
                                          break label1056;
                                       }
                                    }

                                    if (~var14.field9372 == -6) {
                                       label867: {
                                          if (~var14.field9213 > -1) {
                                             class763 var59;
                                             label864: {
                                                if (~var14.field9345 != 0) {
                                                   class648 var58 = !var14.field9240 ? null : class278.field3709.field5672;
                                                   var59 = class645.field9054.method481(var14.field9226, var14.field9274, var14.field9347, class338.field4832, var58, 40, var14.field9355 | -16777216, var14.field9345);
                                                   if (!var11) {
                                                      break label864;
                                                   }
                                                }

                                                if (~var14.field9246 != 0) {
                                                   var59 = class327.method2505(var14.field9246, -2, class338.field4832);
                                                   if (var11) {
                                                      var59 = var14.method4764(class338.field4832, true);
                                                   }
                                                } else {
                                                   var59 = var14.method4764(class338.field4832, true);
                                                }
                                             }

                                             if (var59 != null) {
                                                int var60 = var59.method2125();
                                                int var61 = var59.method2129();
                                                int var62 = -(255 & var24) + 255 << 24 | (~var14.field9252 == -1 ? 16777215 : 16777215 & var14.field9252);
                                                if (var14.field9334) {
                                                   label1007: {
                                                      class338.field4832.method530(var20, var21, var14.field9379 + var20, var21 - -var14.field9360);
                                                      if (var14.field9245 == 0) {
                                                         if (~var14.field9252 != -1 || var24 != 0) {
                                                            var59.method2127(var20, var21, var14.field9379, var14.field9360, 0, var62, 1);
                                                            if (!var11) {
                                                               break label1007;
                                                            }
                                                         }

                                                         var59.method5484(var20, var21, var14.field9379, var14.field9360);
                                                         if (!var11) {
                                                            break label1007;
                                                         }
                                                      }

                                                      int var63 = (var60 - 1 + var14.field9379) / var60;
                                                      int var64 = (var61 + -1 + var14.field9360) / var61;
                                                      int var65 = 0;
                                                      if (var11 || ~var65 > ~var63) {
                                                         do {
                                                            int var66 = 0;
                                                            if (var11) {
                                                               if (var14.field9252 != 0) {
                                                                  var59.method5485((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var21 - -(var61 * var66)), 4096, var14.field9245, 0, var62, 1);
                                                                  if (var11) {
                                                                     var59.method5478((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field9245);
                                                                     ++var66;
                                                                  } else {
                                                                     ++var66;
                                                                  }
                                                               } else {
                                                                  var59.method5478((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field9245);
                                                                  ++var66;
                                                               }
                                                            }

                                                            while(true) {
                                                               while(var64 > var66) {
                                                                  if (var14.field9252 != 0) {
                                                                     var59.method5485((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var21 - -(var61 * var66)), 4096, var14.field9245, 0, var62, 1);
                                                                     if (var11) {
                                                                        var59.method5478((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field9245);
                                                                        ++var66;
                                                                     } else {
                                                                        ++var66;
                                                                     }
                                                                  } else {
                                                                     var59.method5478((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field9245);
                                                                     ++var66;
                                                                  }
                                                               }

                                                               if (!var11) {
                                                                  ++var65;
                                                                  break;
                                                               }

                                                               var59.method5478((float)var60 / 2.0F + (float)(var20 - -(var60 * var65)), (float)var61 / 2.0F + (float)(var61 * var66 + var21), 4096, var14.field9245);
                                                               ++var66;
                                                            }
                                                         } while(~var65 > ~var63);
                                                      }
                                                   }

                                                   class338.field4832.method577(arg9, arg1, arg4, arg8);
                                                   if (!var11) {
                                                      break label867;
                                                   }
                                                }

                                                if (~var14.field9252 != -1 || ~var24 != -1) {
                                                   if (var14.field9245 != 0) {
                                                      var59.method5485((float)var14.field9379 / 2.0F + (float)var20, (float)var14.field9360 / 2.0F + (float)var21, var14.field9379 * 4096 / var60, var14.field9245, 0, var62, 1);
                                                      if (!var11) {
                                                         break label867;
                                                      }
                                                   }

                                                   if (~var14.field9379 != ~var60 || var14.field9360 != var61) {
                                                      var59.method5486(var20, var21, var14.field9379, var14.field9360, 0, var62, 1);
                                                      if (!var11) {
                                                         break label867;
                                                      }
                                                   }

                                                   var59.method1631(var20, var21, 0, var62, 1);
                                                   if (!var11) {
                                                      break label867;
                                                   }
                                                }

                                                if (~var14.field9245 != -1) {
                                                   var59.method5478((float)var14.field9379 / 2.0F + (float)var20, (float)var14.field9360 / 2.0F + (float)var21, var14.field9379 * 4096 / var60, var14.field9245);
                                                   if (!var11) {
                                                      break label867;
                                                   }
                                                }

                                                if (~var14.field9379 != ~var60 || var14.field9360 != var61) {
                                                   var59.method5477(var20, var21, var14.field9379, var14.field9360);
                                                   if (!var11) {
                                                      break label867;
                                                   }
                                                }

                                                var59.method5482(var20, var21);
                                                if (!var11) {
                                                   break label867;
                                                }
                                             }

                                             if (!class143.field1897) {
                                                break label867;
                                             }

                                             class383.method2943(false, var14);
                                             if (!var11) {
                                                break label867;
                                             }
                                          }

                                          var14.method4771(-98, class371.field5238, class212.field2634).method1816(var21, 0, var14.field9379, false, var14.field9360, var14.field9257 << 3, 0, var14.field9233 << 3, var20, class338.field4832);
                                       }

                                       if (!class775.field11283) {
                                          break label1056;
                                       }

                                       if (arg6) {
                                          class534.method3842(0, var17, var18, var16, var15);
                                          if (!var11) {
                                             break label1056;
                                          }
                                       }

                                       class369.method2854(var17, var16, var18, 2, var15);
                                       if (!var11) {
                                          break label1056;
                                       }
                                    }

                                    if (var14.field9372 == 6) {
                                       class707.method5143((byte)-117);
                                       Object var67 = null;
                                       class501 var68 = null;
                                       int var69 = 0;
                                       if (var14.field9345 != -1) {
                                          class261 var70 = class645.field9054.method485(0, var14.field9345);
                                          if (var70 != null) {
                                             class261 var71 = var70.method2008(var14.field9274, (byte)-79);
                                             class61 var72 = var14.field9304 != -1 ? class392.field5479.method1477(1, var14.field9304) : null;
                                             class648 var73 = var14.field9240 ? class278.field3709.field5672 : null;
                                             var68 = var71.method2001(var73, true, 2048, var72, var14.field9238, var14.field9370, 1, class338.field4832, var14.field9343);
                                             if (var68 == null) {
                                                class383.method2943(false, var14);
                                                if (var11) {
                                                   var69 = -var68.method366() >> 1;
                                                }
                                             } else {
                                                var69 = -var68.method366() >> 1;
                                             }
                                          }
                                       } else if (~var14.field9381 == -6) {
                                          int var74 = var14.field9281;
                                          if (var74 >= 0 && var74 < 2048) {
                                             class404 var75 = class136.field1773[var74];
                                             class61 var76 = ~var14.field9304 != 0 ? class392.field5479.method1477(1, var14.field9304) : null;
                                             if (var75 != null && (~class602.field8397 == ~var74 || ~class488.method3548((byte)-126, var75.field5662) == ~var14.field9302)) {
                                                var68 = var75.field5672.method4670((class191[])null, class259.field3320, var14.field9343, var14.field9238, var14.field9370, true, 0, 0, var76, (class61)null, 2048, -1, 18593, class338.field4832, class742.field10813, class392.field5479, class581.field7984, 0, class261.field3341, class645.field9054, (int[])null);
                                             }
                                          }
                                       } else if (var14.field9381 != 8 && ~var14.field9381 != -10) {
                                          if (~var14.field9304 == 0) {
                                             var68 = var14.method4773(-1, class278.field3709.field5672, class259.field3320, -122, 0, class645.field9054, 2048, class581.field7984, class392.field5479, (class61)null, class338.field4832, class261.field3341, class742.field10813, -1, (class298)var67);
                                             if (var68 == null && class143.field1897) {
                                                class383.method2943(false, var14);
                                             }
                                          } else {
                                             class61 var80 = class392.field5479.method1477(1, var14.field9304);
                                             var68 = var14.method4773(var14.field9343, class278.field3709.field5672, class259.field3320, 68, var14.field9370, class645.field9054, 2048, class581.field7984, class392.field5479, var80, class338.field4832, class261.field3341, class742.field10813, var14.field9238, (class298)var67);
                                             if (var68 == null && class143.field1897) {
                                                class383.method2943(false, var14);
                                             }
                                          }
                                       } else {
                                          class784 var77 = class655.method4729(false, var14.field9281, (byte)101);
                                          class61 var78 = ~var14.field9304 == 0 ? null : class392.field5479.method1477(1, var14.field9304);
                                          if (var77 != null) {
                                             class648 var79 = !var14.field9240 ? null : class278.field3709.field5672;
                                             var68 = var77.method5650(~var14.field9381 == -10, var79, 100, var78, 2048, var14.field9238, class338.field4832, var14.field9343, var14.field9302, var14.field9370);
                                          }
                                       }

                                       if (var68 != null) {
                                          int var81;
                                          if (var14.field9349 > 0) {
                                             var81 = (var14.field9379 << 9) / var14.field9349;
                                             if (var11) {
                                                var81 = 512;
                                             }
                                          } else {
                                             var81 = 512;
                                          }

                                          int var82;
                                          if (~var14.field9316 >= -1) {
                                             var82 = 512;
                                             if (var11) {
                                                var82 = (var14.field9360 << 9) / var14.field9316;
                                             }
                                          } else {
                                             var82 = (var14.field9360 << 9) / var14.field9316;
                                          }

                                          int var83 = var14.field9379 / 2 + var20;
                                          int var84 = var21 - -(var14.field9360 / 2);
                                          if (!var14.field9221) {
                                             var83 += var14.field9332 * var81 >> 9;
                                             var84 += var14.field9254 * var82 >> 9;
                                          }

                                          class92.field1230.method145();
                                          class338.field4832.method581(class92.field1230);
                                          class338.field4832.method526(var83, var84, var81, var82);
                                          class338.field4832.method608();
                                          if (var14.field9225) {
                                             class338.field4832.method574(false);
                                          }

                                          label733: {
                                             if (!var14.field9221) {
                                                int var85 = (var14.field9219 << 2) * class192.field2342[var14.field9317 << 3] >> 14;
                                                int var86 = (var14.field9219 << 2) * class192.field2341[var14.field9317 << 3] >> 14;
                                                class88.field1124.method156(-var14.field9247 << 3);
                                                class88.field1124.method155(var14.field9204 << 3);
                                                class88.field1124.method154(var14.field9300 << 2, var69 + var85 - -(var14.field9282 << 2), var86 - -(var14.field9282 << 2));
                                                class88.field1124.method140(var14.field9317 << 3);
                                                if (!var11) {
                                                   break label733;
                                                }
                                             }

                                             class88.field1124.method150(var14.field9317);
                                             class88.field1124.method155(var14.field9204);
                                             class88.field1124.method144(var14.field9247);
                                             class88.field1124.method154(var14.field9332, var14.field9254, var14.field9199);
                                          }

                                          var14.method4766(class88.field1124, class338.field4832, 32, var68, class369.field5205);
                                          if (class238.field2960) {
                                             class338.field4832.method530(var20, var21, var14.field9379 + var20, var14.field9360 + var21);
                                          }

                                          label1017: {
                                             if (var14.field9221) {
                                                if (var14.field9357) {
                                                   var68.method321(class88.field1124, (class52)null, var14.field9219, 1);
                                                   if (!var11) {
                                                      break label1017;
                                                   }
                                                }

                                                var68.method370(class88.field1124, (class52)null, 1);
                                                if (var14.field9267 == null) {
                                                   break label1017;
                                                }

                                                class338.field4832.method598(var14.field9267.method4927());
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             if (var14.field9357) {
                                                var68.method321(class88.field1124, (class52)null, var14.field9219 << 2, 1);
                                                if (!var11) {
                                                   break label1017;
                                                }
                                             }

                                             var68.method370(class88.field1124, (class52)null, 1);
                                             if (var14.field9267 != null) {
                                                class338.field4832.method598(var14.field9267.method4927());
                                             }
                                          }

                                          if (class238.field2960) {
                                             class338.field4832.method577(arg9, arg1, arg4, arg8);
                                          }

                                          if (var14.field9225) {
                                             class338.field4832.method574(true);
                                          }
                                       }

                                       if (!class775.field11283) {
                                          break label1056;
                                       }

                                       if (arg6) {
                                          class534.method3842(0, var17, var18, var16, var15);
                                          if (!var11) {
                                             break label1056;
                                          }
                                       }

                                       class369.method2854(var17, var16, var18, 2, var15);
                                       if (!var11) {
                                          break label1056;
                                       }
                                    }

                                    if (~var14.field9372 == -10) {
                                       int var87;
                                       int var88;
                                       int var89;
                                       int var90;
                                       label709: {
                                          if (!var14.field9286) {
                                             var87 = var20;
                                             var88 = var21;
                                             var89 = var14.field9360 + var21;
                                             var90 = var14.field9379 + var20;
                                             if (!var11) {
                                                break label709;
                                             }
                                          }

                                          var87 = var20;
                                          var88 = var14.field9360 + var21;
                                          var90 = var14.field9379 + var20;
                                          var89 = var21;
                                       }

                                       label704: {
                                          if (var14.field9293 == 1) {
                                             class338.field4832.method497(var87, var88, var90, var89, var14.field9252, 0);
                                             if (!var11) {
                                                break label704;
                                             }
                                          }

                                          class338.field4832.method569(var87, var88, var90, var89, var14.field9252, var14.field9293, 0);
                                       }

                                       if (class775.field11283) {
                                          if (!arg6) {
                                             class369.method2854(var17, var16, var18, 2, var15);
                                             if (var11) {
                                                class534.method3842(0, var17, var18, var16, var15);
                                             }
                                          } else {
                                             class534.method3842(0, var17, var18, var16, var15);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               ++var13;
            } while(~var13 > ~arg10.length);

         }
      } catch (RuntimeException var92) {
         throw class534.method3846(var92, field6165[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 != null ? field6165[1] : field6165[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "<init>",
      descriptor = "(Lor;JI)V"
   )
   public class445(class670 arg0, long arg1, int arg2) {
      try {
         this.field6159 = arg0;
         this.field6161 = arg1;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6165[2] + (arg0 != null ? field6165[1] : field6165[0]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3304(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 15);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3305(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 84;
            break;
         case 1:
            var10005 = 110;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 15;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
