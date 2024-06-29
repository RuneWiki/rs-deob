import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class396 extends class564 {
   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5577 = new String[]{method3016(method3015(": Y$\u0003")), method3016(method3015(": Y%\u0003")), method3016(method3015(";8\u001b\u000e")), method3016(method3015(": Y(\u0003")), method3016(method3015(".cYLV")), method3016(method3015(": Y+\u0003")), method3016(method3015(": Y!\u0003"))};
   @OriginalMember(
      owner = "client!om",
      name = "h",
      descriptor = "I"
   )
   public static int field5572;
   @OriginalMember(
      owner = "client!om",
      name = "d",
      descriptor = "I"
   )
   public static int field5573;
   @OriginalMember(
      owner = "client!om",
      name = "f",
      descriptor = "I"
   )
   public static int field5574;
   @OriginalMember(
      owner = "client!om",
      name = "g",
      descriptor = "I"
   )
   public static int field5575;
   @OriginalMember(
      owner = "client!om",
      name = "e",
      descriptor = "I"
   )
   public static int field5576;

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(ZLjava/lang/String;BZLjava/lang/String;)V"
   )
   public static final void method3008(boolean arg0, String arg1, byte arg2, boolean arg3, String arg4) {
      try {
         class73.field901 = arg0;
         class631.field8834 = arg1;
         if (!arg3) {
            class25.field324 = -1;
         }

         ++field5574;
         class616.field8591 = arg4;
         class199.field2403 = arg3;
         if (!class199.field2403 && (class631.field8834.equals("") || class616.field8591.equals(""))) {
            class365.method2827(3, true);
         } else {
            if (~class619.field8658 != -2) {
               class521.field7129 = -1;
               class93.field1242 = 0;
            }

            class604.field8418.field2800 = false;
            class365.method2827(-3, true);
            if (arg2 == -86) {
               class545.field7442 = 1;
               class420.field5894 = 0;
               class178.field2215 = 0;
            }
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5577[6] + arg0 + ',' + (arg1 != null ? field5577[4] : field5577[2]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5577[4] : field5577[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(III)Lbs;"
   )
   public static final class718 method3009(int arg0, int arg1, int arg2) {
      class225 var3 = class111.field1404[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2831;
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method3010(int arg0, int arg1) {
      try {
         ++field5572;
         return arg0 < 90 ? -41 : arg1 & 255;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5577[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3011() {
      for(int var0 = 0; var0 < class247.field3099.length; ++var0) {
         class247.field3099[var0].method3346();
      }

      class247.field3099 = null;
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(B[I[Ljava/lang/String;)V"
   )
   public static final void method3012(byte arg0, int[] arg1, String[] arg2) {
      try {
         class520.method3766(arg2.length + -1, 0, arg1, arg2, -1924);
         ++field5576;
         if (arg0 < -88) {
            ;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5577[3] + arg0 + ',' + (arg1 != null ? field5577[4] : field5577[2]) + ',' + (arg2 != null ? field5577[4] : field5577[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method3013(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5575;
         class206 var2 = class605.field8474.field2788;
         int var3 = 0;
         int var10000;
         if (var1) {
            var10000 = class404.field5683[var3];
         } else if (~var3 <= ~class331.field4734) {
            var10000 = arg0;
            if (!var1) {
               if (arg0 != -1) {
                  method3010(-50, -85);
                  return;
               }

               return;
            }
         } else {
            var10000 = class404.field5683[var3];
         }

         while(true) {
            int var4 = var10000;
            class680 var5 = ((class243)class335.field4808.method1839(-115, (long)var4)).field3043;
            int var6 = var2.method4288((byte)125);
            if ((2 & var6) != 0) {
               var6 += var2.method4288((byte)111) << 8;
               if ((512 & var6) != 0) {
                  var6 += var2.method4288((byte)74) << 16;
               }
            } else if ((512 & var6) != 0) {
               var6 += var2.method4288((byte)74) << 16;
            }

            if ((131072 & var6) != 0) {
               int var7 = var2.method4275(-128);
               if (var7 == 65535) {
                  var7 = -1;
               }

               int var8 = var2.method4311(-128);
               int var9 = var2.method4292(122);
               int var10 = var9 & 7;
               int var11 = 15 & var9 >> 3;
               if (~var11 == -16) {
                  var11 = -1;
               }

               var5.method4084(var7, var10, var8, false, 2, var11);
            }

            if (~(var6 & 1024) != -1) {
               var5.field7832 = var2.method4340(409855200);
               var5.field7790 = var2.method4340(409855200);
               var5.field7811 = var2.method4290(116);
               var5.field7803 = (byte)var2.method4286(arg0 + 129);
               var5.field7806 = class369.field5205 + var2.method4299((byte)78);
               var5.field7824 = class369.field5205 - -var2.method4280(-19104);
            }

            if ((var6 & 8192) == 0) {
               if ((var6 & 4) != 0) {
                  var5.field7778 = var2.method4291(-100);
                  var5.field7767 = 100;
               }
            } else {
               int var12 = var2.method4286(128);
               int[] var13 = new int[var12];
               int[] var14 = new int[var12];
               int var15 = 0;
               if (!var1 && ~var15 <= ~var12) {
                  var5.method4089(var13, var14, ~arg0);
                  if ((var6 & 4) != 0) {
                     var5.field7778 = var2.method4291(-100);
                     var5.field7767 = 100;
                  }
               } else {
                  while(true) {
                     int var16 = var2.method4280(-19104);
                     int var17;
                     if (~(49152 & var16) != -49153) {
                        var13[var15] = var16;
                        if (var1) {
                           var17 = var2.method4299((byte)78);
                           var13[var15] = class283.method2155(var17, var16 << 16);
                           var14[var15] = var2.method4299((byte)78);
                           ++var15;
                        } else {
                           var14[var15] = var2.method4299((byte)78);
                           ++var15;
                        }
                     } else {
                        var17 = var2.method4299((byte)78);
                        var13[var15] = class283.method2155(var17, var16 << 16);
                        var14[var15] = var2.method4299((byte)78);
                        ++var15;
                     }

                     if (~var15 <= ~var12) {
                        var5.method4089(var13, var14, ~arg0);
                        if ((var6 & 4) != 0) {
                           var5.field7778 = var2.method4291(-100);
                           var5.field7767 = 100;
                        }
                        break;
                     }
                  }
               }
            }

            if (~(4096 & var6) != -1) {
               var5.field7792 = var2.method4340(arg0 + 409855201);
               var5.field7797 = var2.method4340(arg0 ^ -409855201);
               var5.field7756 = var2.method4340(409855200);
               var5.field7834 = var2.method4290(arg0 + 122);
               var5.field7816 = var2.method4280(-19104) - -class369.field5205;
               var5.field7828 = var2.method4280(-19104) - -class369.field5205;
               var5.field7827 = var2.method4288((byte)118);
               var5.field7792 += var5.field7853[0];
               var5.field7848 = 1;
               var5.field7756 += var5.field7853[0];
               var5.field7797 += var5.field7855[0];
               var5.field7856 = 0;
               var5.field7834 += var5.field7855[0];
            }

            if ((32768 & var6) != 0) {
               int var18 = var2.method4299((byte)78);
               var5.field7779 = var2.method4288((byte)60);
               var5.field7835 = var2.method4336((byte)77);
               var5.field7826 = var18 & 32767;
               var5.field7815 = ~(32768 & var18) != -1;
               var5.field7804 = class369.field5205 + var5.field7826 + var5.field7779;
            }

            if (~(var6 & 262144) != -1) {
               int var19 = var5.field9989.field5474.length;
               int var20 = 0;
               byte var21;
               if (var5.field9989.field5486 != null) {
                  var20 = var5.field9989.field5486.length;
                  var21 = 0;
                  if (var5.field9989.field5531 != null) {
                     var20 = var5.field9989.field5531.length;
                  }
               } else {
                  var21 = 0;
                  if (var5.field9989.field5531 != null) {
                     var20 = var5.field9989.field5531.length;
                  }
               }

               int var22 = var2.method4292(126);
               if ((var22 & 1) != 1) {
                  int[] var23 = null;
                  if ((2 & var22) == 2) {
                     var23 = new int[var19];
                     int var24 = 0;
                     if (var1) {
                        var23[var24] = var2.method4310(2);
                        ++var24;
                     }

                     while(var19 > var24) {
                        var23[var24] = var2.method4310(2);
                        ++var24;
                     }
                  }

                  short[] var25 = null;
                  if ((var22 & 4) == 4) {
                     var25 = new short[var20];
                     int var26 = 0;
                     if (var1) {
                        var25[var26] = (short)var2.method4280(-19104);
                        ++var26;
                     }

                     while(~var20 < ~var26) {
                        var25[var26] = (short)var2.method4280(-19104);
                        ++var26;
                     }
                  }

                  Object var27 = null;
                  long var29;
                  if ((8 & var22) != 8) {
                     var29 = (long)var4 | (long)(var5.field9977++) << 32;
                     new class298(var29, var23, var25, (short[])var27);
                  } else {
                     short[] var72 = new short[var21];
                     int var28 = 0;
                     if (var1) {
                        var72[var28] = (short)var2.method4280(-19104);
                        ++var28;
                     }

                     while(~var21 < ~var28) {
                        var72[var28] = (short)var2.method4280(-19104);
                        ++var28;
                     }

                     var29 = (long)var4 | (long)(var5.field9977++) << 32;
                     new class298(var29, var23, var25, var72);
                  }
               }
            }

            if (~(var6 & 524288) != -1) {
               var5.field9985 = var2.method4280(arg0 ^ 19103);
               if (~var5.field9985 == -65536) {
                  var5.field9985 = var5.field9989.field5541;
               }
            }

            if ((256 & var6) != 0) {
               int var31 = var2.method4280(arg0 ^ 19103);
               if (~var31 == -65536) {
                  var31 = -1;
               }

               int var32 = var2.method4281((byte)95);
               int var33 = var2.method4336((byte)118);
               int var34 = 7 & var33;
               int var35 = var33 >> 3 & 15;
               if (~var35 == -16) {
                  var35 = -1;
               }

               var5.method4084(var31, var34, var32, false, 1, var35);
            }

            if (~(16384 & var6) != -1) {
               label497: {
                  int var36 = var5.field9989.field5532.length;
                  int var37 = 0;
                  int var38;
                  if (var5.field9989.field5486 != null) {
                     var37 = var5.field9989.field5486.length;
                     var38 = 0;
                     if (var5.field9989.field5531 != null) {
                        var38 = var5.field9989.field5531.length;
                     }
                  } else {
                     var38 = 0;
                     if (var5.field9989.field5531 != null) {
                        var38 = var5.field9989.field5531.length;
                     }
                  }

                  int var39 = var2.method4336((byte)-96);
                  if ((1 & var39) == 1) {
                     var5.field9984 = null;
                     if (!var1) {
                        break label497;
                     }
                  }

                  int[] var40 = null;
                  if ((2 & var39) == 2) {
                     var40 = new int[var36];
                     int var41 = 0;
                     if (var1) {
                        var40[var41] = var2.method4310(2);
                        ++var41;
                     }

                     while(~var36 < ~var41) {
                        var40[var41] = var2.method4310(2);
                        ++var41;
                     }
                  }

                  short[] var42 = null;
                  if (~(var39 & 4) == -5) {
                     var42 = new short[var37];
                     int var43 = 0;
                     if (var1) {
                        var42[var43] = (short)var2.method4299((byte)78);
                        ++var43;
                     }

                     while(~var37 < ~var43) {
                        var42[var43] = (short)var2.method4299((byte)78);
                        ++var43;
                     }
                  }

                  Object var44 = null;
                  long var46;
                  if ((8 & var39) != 8) {
                     var46 = (long)var4 | (long)(var5.field9992++) << 32;
                     var5.field9984 = new class298(var46, var40, var42, (short[])var44);
                  } else {
                     short[] var73 = new short[var38];
                     int var45 = 0;
                     if (var1) {
                        var73[var45] = (short)var2.method4280(-19104);
                        ++var45;
                     }

                     while(~var38 < ~var45) {
                        var73[var45] = (short)var2.method4280(-19104);
                        ++var45;
                     }

                     var46 = (long)var4 | (long)(var5.field9992++) << 32;
                     var5.field9984 = new class298(var46, var40, var42, var73);
                  }
               }
            }

            if ((var6 & 8) != 0) {
               int var48 = var2.method4299((byte)78);
               if (~var48 == -65536) {
                  var48 = -1;
               }

               int var49 = var2.method4302(true);
               int var50 = var2.method4288((byte)83);
               int var51 = 7 & var50;
               int var52 = 15 & var50 >> 3;
               if (~var52 == -16) {
                  var52 = -1;
               }

               var5.method4084(var48, var51, var49, false, 0, var52);
            }

            if ((var6 & 65536) != 0) {
               var5.field9972 = var2.method4291(arg0 + -71);
               if (!"".equals(var5.field9972)) {
                  if (var5.field9972.equals(var5.field9989.field5534)) {
                     var5.field9972 = var5.field9989.field5534;
                  }
               } else {
                  var5.field9972 = var5.field9989.field5534;
               }
            }

            if ((var6 & 128) != 0) {
               int var53 = var2.method4286(arg0 ^ -129);
               if (~var53 < -1) {
                  int var54 = 0;
                  if (var1 || ~var54 > ~var53) {
                     do {
                        int var55 = -1;
                        int var56 = -1;
                        int var57 = -1;
                        int var58 = var2.method4338(false);
                        if (var58 != 32767) {
                           if (~var58 == -32767) {
                              var58 = -1;
                              if (var1) {
                                 var56 = var2.method4338(false);
                                 if (var1) {
                                    var58 = var2.method4338(false);
                                    var56 = var2.method4338(false);
                                    var55 = var2.method4338(false);
                                    var57 = var2.method4338(false);
                                 }
                              }
                           } else {
                              var56 = var2.method4338(false);
                              if (var1) {
                                 var58 = var2.method4338(false);
                                 var56 = var2.method4338(false);
                                 var55 = var2.method4338(false);
                                 var57 = var2.method4338(false);
                              }
                           }
                        } else {
                           var58 = var2.method4338(false);
                           var56 = var2.method4338(false);
                           var55 = var2.method4338(false);
                           var57 = var2.method4338(false);
                        }

                        int var59 = var2.method4338(false);
                        int var60 = var2.method4288((byte)69);
                        var5.method4075(var55, var56, var57, class369.field5205, -74, var58, var60, var59);
                        ++var54;
                     } while(~var54 > ~var53);
                  }
               }
            }

            if (~(var6 & 64) != -1) {
               var5.field7780 = var2.method4275(-106);
               if (~var5.field7780 == -65536) {
                  var5.field7780 = -1;
               }
            }

            if ((var6 & 32) != 0) {
               if (var5.field9989.method2983(24238)) {
                  class501.method3619(var5, false);
               }

               var5.method4975(class742.field10813.method2428(-24138, var2.method4280(arg0 + -19103)), arg0 ^ -84);
               var5.method4085(var5.field9989.field5538, (byte)-115);
               var5.field7783 = var5.field9989.field5511 << 3;
               if (var5.field9989.method2983(arg0 ^ -24239)) {
                  class30.method245(var5.field7855[0], (class774)null, var5.field1001, (class404)null, 0, var5.field7853[0], var5, true);
               }
            }

            if ((var6 & 1) != 0) {
               int[] var61 = new int[4];
               int var62 = 0;
               if (var1) {
                  var61[var62] = var2.method4275(-105);
                  if (var61[var62] == 65535) {
                     var61[var62] = -1;
                  }

                  ++var62;
               }

               while(true) {
                  while(var62 < 4) {
                     var61[var62] = var2.method4275(-105);
                     if (var61[var62] == 65535) {
                        var61[var62] = -1;
                     }

                     ++var62;
                  }

                  int var63 = var2.method4288((byte)104);
                  if (!var1) {
                     class122.method1032(var63, var5, (byte)-106, var61);
                     break;
                  }

                  if (var63 == 65535) {
                     var61[var62] = -1;
                  }

                  ++var62;
               }
            }

            if ((var6 & 2048) == 0) {
               if (~(var6 & 16) != -1) {
                  var5.field9987 = var2.method4299((byte)78);
                  var5.field9980 = var2.method4280(-19104);
               }

               ++var3;
            } else {
               int var64 = var2.method4292(123);
               int[] var65 = new int[var64];
               int[] var66 = new int[var64];
               int[] var67 = new int[var64];
               int var68 = 0;
               int var69;
               if (var1) {
                  var69 = var2.method4299((byte)78);
                  if (var69 == 65535) {
                     var69 = -1;
                  }

                  var65[var68] = var69;
                  var66[var68] = var2.method4292(class168.method1321(arg0, -126));
                  var67[var68] = var2.method4280(-19104);
                  ++var68;
               }

               while(true) {
                  if (var68 >= var64) {
                     var10000 = -2;
                     if (!var1) {
                        class336.method2665(-2, var65, var67, var5, var66);
                        if (~(var6 & 16) != -1) {
                           var5.field9987 = var2.method4299((byte)78);
                           var5.field9980 = var2.method4280(-19104);
                        }

                        ++var3;
                        break;
                     }
                  } else {
                     var10000 = var2.method4299((byte)78);
                  }

                  var69 = var10000;
                  if (var69 == 65535) {
                     var69 = -1;
                  }

                  var65[var68] = var69;
                  var66[var68] = var2.method4292(class168.method1321(arg0, -126));
                  var67[var68] = var2.method4280(-19104);
                  ++var68;
               }
            }

            if (~var3 <= ~class331.field4734) {
               var10000 = arg0;
               if (!var1) {
                  if (arg0 != -1) {
                     method3010(-50, -85);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = class404.field5683[var3];
            }
         }
      } catch (RuntimeException var71) {
         throw class534.method3846(var71, field5577[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3014(byte arg0) {
      try {
         ++field5573;
         class590 var1 = class305.field4046;
         synchronized(class305.field4046) {
            class305.field4046.method4244(true);
         }

         class590 var2 = class468.field6450;
         synchronized(class468.field6450) {
            class468.field6450.method4244(true);
         }

         if (arg0 != -122) {
            method3009(101, 23, 36);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field5577[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3015(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!om",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3016(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 85;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
