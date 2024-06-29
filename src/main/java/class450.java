import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class450 {
   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6107 = new String[]{method3453(method3452("\u0017sT\u000e\u0010")), method3453(method3452("\u0017sT\b\u0010")), method3453(method3452("\u0017sT\r\u0010")), method3453(method3452("\u0017sT\u000f\u0010"))};
   @OriginalMember(
      owner = "client!or",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6096 = new String[100];
   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "Lkb;"
   )
   public static class500 field6103 = new class500(method3453(method3452("\nt\u0014)K\u001b`\n)")), method3453(method3452("*t\u0014)k\u001b`\n)")), 0);
   @OriginalMember(
      owner = "client!or",
      name = "k",
      descriptor = "I"
   )
   public static int field6097;
   @OriginalMember(
      owner = "client!or",
      name = "h",
      descriptor = "I"
   )
   public int field6099;
   @OriginalMember(
      owner = "client!or",
      name = "f",
      descriptor = "I"
   )
   public int field6100;
   @OriginalMember(
      owner = "client!or",
      name = "l",
      descriptor = "I"
   )
   public int field6101;
   @OriginalMember(
      owner = "client!or",
      name = "i",
      descriptor = "I"
   )
   public static int field6102;
   @OriginalMember(
      owner = "client!or",
      name = "j",
      descriptor = "I"
   )
   public static int field6104;
   @OriginalMember(
      owner = "client!or",
      name = "c",
      descriptor = "I"
   )
   public static int field6105;
   @OriginalMember(
      owner = "client!or",
      name = "e",
      descriptor = "Z"
   )
   public boolean field6095;
   @OriginalMember(
      owner = "client!or",
      name = "g",
      descriptor = "Z"
   )
   public boolean field6098;
   @OriginalMember(
      owner = "client!or",
      name = "b",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field6106;

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3448(int arg0) {
      try {
         field6103 = null;
         if (arg0 >= -66) {
            field6105 = 0;
         }

         field6096 = null;
         field6106 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6107[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public static final boolean method3449(int arg0, int arg1, boolean arg2) {
      try {
         ++field6104;
         if (arg2) {
            method3449(37, -56, false);
         }

         return class778.method5621(arg0, -6117, arg1) || class423.method3286(1, arg0, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6107[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method3450(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6102;
         int var6 = arg0 & 3;
         if (var6 == 0) {
            return arg3;
         } else if (arg2 != -1) {
            return 115;
         } else if (~var6 == -2) {
            return -arg1 + 4095;
         } else {
            return ~var6 == -3 ? -arg3 + 4095 : arg1;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6107[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3451(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field6097;
         class431 var2 = class387.field5365.field8764;
         int var3 = 0;
         int var10000;
         if (var1) {
            var10000 = class705.field10310[var3];
         } else if (~class472.field6505 >= ~var3) {
            var10000 = arg0;
            if (!var1) {
               if (arg0 <= 81) {
                  method3448(21);
                  return;
               }

               return;
            }
         } else {
            var10000 = class705.field10310[var3];
         }

         while(true) {
            int var4 = var10000;
            class81 var5 = ((class411)class35.field493.method1818(-1, (long)var4)).field5654;
            int var6 = var2.method640(255);
            if (~(2 & var6) != -1) {
               var6 += var2.method640(255) << 8;
               if ((var6 & 512) != 0) {
                  var6 += var2.method640(255) << 16;
               }
            } else if ((var6 & 512) != 0) {
               var6 += var2.method640(255) << 16;
            }

            if ((131072 & var6) != 0) {
               int var7 = var5.field1135.field6540.length;
               int var8 = 0;
               if (var5.field1135.field6521 != null) {
                  var8 = var5.field1135.field6521.length;
                  if (var5.field1135.field6524 != null) {
                     var8 = var5.field1135.field6524.length;
                  }
               } else if (var5.field1135.field6524 != null) {
                  var8 = var5.field1135.field6524.length;
               }

               byte var9 = 0;
               int var10 = var2.method633((byte)-15);
               if (~(var10 & 1) != -2) {
                  int[] var11 = null;
                  if ((2 & var10) == 2) {
                     var11 = new int[var7];
                     int var12 = 0;
                     if (var1) {
                        var11[var12] = var2.method603(-2);
                        ++var12;
                     }

                     while(var7 > var12) {
                        var11[var12] = var2.method603(-2);
                        ++var12;
                     }
                  }

                  short[] var13 = null;
                  if (~(var10 & 4) == -5) {
                     var13 = new short[var8];
                     int var14 = 0;
                     if (var1) {
                        var13[var14] = (short)var2.method642(false);
                        ++var14;
                     }

                     while(var14 < var8) {
                        var13[var14] = (short)var2.method642(false);
                        ++var14;
                     }
                  }

                  short[] var15 = null;
                  if (~(8 & var10) == -9) {
                     var15 = new short[var9];
                     int var16 = 0;
                     if (var1) {
                        var15[var16] = (short)var2.method642(false);
                        ++var16;
                     }

                     while(~var9 < ~var16) {
                        var15[var16] = (short)var2.method642(false);
                        ++var16;
                     }
                  }

                  long var17 = (long)(var5.field1150++) << 32 | (long)var4;
                  new class12(var17, var11, var13, var15);
               }
            }

            if (~(262144 & var6) != -1) {
               var5.field1125 = var2.method627((byte)-124);
               if (~var5.field1125 == -65536) {
                  var5.field1125 = var5.field1135.field6572;
               }

               if ((var6 & 4) != 0) {
                  var5.field1141 = var2.method661((byte)-89);
                  var5.field1138 = var2.method627((byte)-127);
               }
            } else if ((var6 & 4) != 0) {
               var5.field1141 = var2.method661((byte)-89);
               var5.field1138 = var2.method627((byte)-127);
            }

            if (~(var6 & 32768) == -1) {
               if (~(8 & var6) != -1) {
                  var5.field110 = var2.method627((byte)-124);
                  if (var5.field110 == 65535) {
                     var5.field110 = -1;
                  }
               }
            } else {
               int var19 = var2.method626(255);
               int[] var20 = new int[var19];
               int[] var21 = new int[var19];
               int[] var22 = new int[var19];
               int var23 = 0;
               int var24;
               if (var1) {
                  var24 = var2.method603(-2);
                  if (~var24 == -65536) {
                     var24 = -1;
                  }

                  var20[var23] = var24;
                  var21[var23] = var2.method622((byte)87);
                  var22[var23] = var2.method642(false);
                  ++var23;
               }

               while(true) {
                  if (var19 <= var23) {
                     class473.method3602(var5, var21, (byte)125, var20, var22);
                     if (~(8 & var6) != -1) {
                        var5.field110 = var2.method627((byte)-124);
                        if (var5.field110 == 65535) {
                           var5.field110 = -1;
                        }
                     }
                     break;
                  }

                  var24 = var2.method603(-2);
                  if (~var24 == -65536) {
                     var24 = -1;
                  }

                  var20[var23] = var24;
                  var21[var23] = var2.method622((byte)87);
                  var22[var23] = var2.method642(false);
                  ++var23;
               }
            }

            if (~(2048 & var6) != -1) {
               var5.field156 = var2.method628((byte)-12);
               var5.field188 = var2.method624(0);
               var5.field172 = var2.method624(0);
               var5.field176 = var2.method628((byte)-12);
               var5.field181 = var2.method661((byte)-125) + class413.field5678;
               var5.field122 = var2.method642(false) + class413.field5678;
               var5.field189 = var2.method626(255);
               var5.field156 += var5.field210[0];
               var5.field211 = 0;
               var5.field172 += var5.field210[0];
               var5.field208 = 1;
               var5.field188 += var5.field205[0];
               var5.field176 += var5.field205[0];
            }

            if (~(var6 & 8192) != -1) {
               int var25 = var2.method642(false);
               var5.field158 = var2.method633((byte)-15);
               var5.field192 = var2.method640(255);
               var5.field136 = var25 & 32767;
               var5.field144 = (32768 & var25) != 0;
               var5.field195 = class413.field5678 - -var5.field136 + var5.field158;
            }

            if ((var6 & 16384) != 0) {
               int var26 = var2.method626(255);
               int[] var27 = new int[var26];
               int[] var28 = new int[var26];
               int var29 = 0;
               if (!var1 && var26 <= var29) {
                  var5.method88((byte)73, var28, var27);
               } else {
                  while(true) {
                     label450: {
                        int var30 = var2.method627((byte)-123);
                        if ((49152 & var30) != 49152) {
                           var27[var29] = var30;
                           if (!var1) {
                              var28[var29] = var2.method661((byte)-76);
                              ++var29;
                              break label450;
                           }
                        }

                        int var31 = var2.method627((byte)-119);
                        var27[var29] = class2.method15(var30 << 16, var31);
                        var28[var29] = var2.method661((byte)-76);
                        ++var29;
                     }

                     if (var26 <= var29) {
                        var5.method88((byte)73, var28, var27);
                        break;
                     }
                  }
               }
            }

            if (~(var6 & 1) != -1) {
               int var32 = var2.method633((byte)-15);
               if (~var32 < -1) {
                  int var33 = 0;
                  if (var1 || ~var32 < ~var33) {
                     do {
                        int var34 = -1;
                        int var35 = -1;
                        int var36 = -1;
                        int var37 = var2.method653((byte)-67);
                        if (~var37 == -32768) {
                           var37 = var2.method653((byte)101);
                           var35 = var2.method653((byte)-58);
                           var34 = var2.method653((byte)103);
                           var36 = var2.method653((byte)-72);
                           if (var1) {
                              if (~var37 == -32767) {
                                 var37 = -1;
                                 if (var1) {
                                    var35 = var2.method653((byte)-88);
                                 }
                              } else {
                                 var35 = var2.method653((byte)-88);
                              }
                           }
                        } else if (~var37 == -32767) {
                           var37 = -1;
                           if (var1) {
                              var35 = var2.method653((byte)-88);
                           }
                        } else {
                           var35 = var2.method653((byte)-88);
                        }

                        int var38 = var2.method653((byte)74);
                        int var39 = var2.method633((byte)-15);
                        var5.method86(var38, var37, 121, class413.field5678, var39, var35, var34, var36);
                        ++var33;
                     } while(~var32 < ~var33);
                  }
               }
            }

            if (~(4096 & var6) != -1) {
               int var40 = var5.field1135.field6517.length;
               int var41 = 0;
               int var42;
               if (var5.field1135.field6521 != null) {
                  var41 = var5.field1135.field6521.length;
                  var42 = 0;
                  if (var5.field1135.field6524 != null) {
                     var42 = var5.field1135.field6524.length;
                  }
               } else {
                  var42 = 0;
                  if (var5.field1135.field6524 != null) {
                     var42 = var5.field1135.field6524.length;
                  }
               }

               int var43 = var2.method622((byte)114);
               if ((1 & var43) == 1) {
                  var5.field1130 = null;
               } else {
                  int[] var44 = null;
                  if (~(var43 & 2) == -3) {
                     var44 = new int[var40];
                     int var45 = 0;
                     if (var1) {
                        var44[var45] = var2.method603(-2);
                        ++var45;
                     }

                     while(var45 < var40) {
                        var44[var45] = var2.method603(-2);
                        ++var45;
                     }
                  }

                  short[] var46 = null;
                  if ((4 & var43) == 4) {
                     var46 = new short[var41];
                     int var47 = 0;
                     if (var1) {
                        var46[var47] = (short)var2.method661((byte)-72);
                        ++var47;
                     }

                     while(var47 < var41) {
                        var46[var47] = (short)var2.method661((byte)-72);
                        ++var47;
                     }
                  }

                  short[] var48 = null;
                  if (~(8 & var43) == -9) {
                     var48 = new short[var42];
                     int var49 = 0;
                     if (var1) {
                        var48[var49] = (short)var2.method603(-2);
                        ++var49;
                     }

                     while(var42 > var49) {
                        var48[var49] = (short)var2.method603(-2);
                        ++var49;
                     }
                  }

                  long var50 = (long)var4 | (long)(var5.field1121++) << 32;
                  var5.field1130 = new class12(var50, var44, var46, var48);
                  if (var1) {
                     var5.field1130 = null;
                  }
               }
            }

            if ((var6 & 1024) != 0) {
               var5.field161 = var2.method648(107);
               var5.field183 = var2.method602(-95);
               var5.field184 = var2.method628((byte)-12);
               var5.field111 = (byte)var2.method626(255);
               var5.field196 = class413.field5678 - -var2.method627((byte)-128);
               var5.field116 = class413.field5678 - -var2.method627((byte)-122);
            }

            if (~(var6 & 32) != -1) {
               if (var5.field1135.method3598(0)) {
                  class215.method1756(var5, 0);
               }

               var5.method787(false, class270.field3460.method5197(var2.method603(-2), -123));
               var5.method89(var5.field1135.field6546, -1000);
               var5.field162 = var5.field1135.field6565 << 3;
               if (var5.field1135.method3598(0)) {
                  class647.method4754(256, (class783)null, var5.field205[0], var5.field10457, var5.field210[0], (class294)null, 0, var5);
               }
            }

            if (~(65536 & var6) != -1) {
               var5.field1126 = var2.method606(11856);
               if (!"".equals(var5.field1126)) {
                  if (var5.field1126.equals(var5.field1135.field6526)) {
                     var5.field1126 = var5.field1135.field6526;
                  }
               } else {
                  var5.field1126 = var5.field1135.field6526;
               }
            }

            if (~(var6 & 16) != -1) {
               int[] var52 = new int[4];
               int var53 = 0;
               if (var1) {
                  var52[var53] = var2.method603(-2);
                  if (var52[var53] == 65535) {
                     var52[var53] = -1;
                  }

                  ++var53;
               }

               while(true) {
                  int var10001;
                  int var10002;
                  int[] var72;
                  if (var53 >= 4) {
                     int var54 = var2.method622((byte)-93);
                     var72 = var52;
                     var10001 = var54;
                     var10002 = 1;
                     if (!var1) {
                        class50.method377(var52, var54, true, var5);
                        break;
                     }
                  } else {
                     var72 = var52;
                     var10001 = var53;
                     var10002 = var2.method603(-2);
                  }

                  var72[var10001] = var10002;
                  if (var52[var53] == 65535) {
                     var52[var53] = -1;
                  }

                  ++var53;
               }
            }

            if ((256 & var6) != 0) {
               int var55 = var2.method603(-2);
               int var56 = var2.method592(-1914126896);
               if (~var55 == -65536) {
                  var55 = -1;
               }

               int var57 = var2.method622((byte)116);
               int var58 = 7 & var57;
               int var59 = var57 >> 3 & 15;
               if (var59 == 15) {
                  var59 = -1;
               }

               var5.method87(var58, 0, var55, var59, var56, 1);
            }

            if (~(64 & var6) != -1) {
               int var60 = var2.method627((byte)-122);
               if (~var60 == -65536) {
                  var60 = -1;
               }

               int var61 = var2.method591((byte)-110);
               int var62 = var2.method640(255);
               int var63 = var62 & 7;
               int var64 = 15 & var62 >> 3;
               if (var64 == 15) {
                  var64 = -1;
               }

               var5.method87(var63, 0, var60, var64, var61, 0);
            }

            if ((var6 & 524288) != 0) {
               int var65 = var2.method627((byte)-123);
               int var66 = var2.method610(-38);
               if (~var65 == -65536) {
                  var65 = -1;
               }

               int var67 = var2.method626(255);
               int var68 = 7 & var67;
               int var69 = (123 & var67) >> 3;
               if (~var69 == -16) {
                  var69 = -1;
               }

               var5.method87(var68, 0, var65, var69, var66, 2);
            }

            if (~(var6 & 128) != -1) {
               var5.field113 = var2.method606(11856);
               var5.field190 = 100;
            }

            ++var3;
            if (~class472.field6505 >= ~var3) {
               var10000 = arg0;
               if (!var1) {
                  if (arg0 <= 81) {
                     method3448(21);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = class705.field10310[var3];
            }
         }
      } catch (RuntimeException var71) {
         throw class93.method866(var71, field6107[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3452(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!or",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3453(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 120;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 122;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
