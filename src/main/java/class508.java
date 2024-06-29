import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class508 {
   @OriginalMember(
      owner = "client!in",
      name = "h",
      descriptor = "Liw;"
   )
   private class107 field7219 = new class107(64);
   @OriginalMember(
      owner = "client!in",
      name = "b",
      descriptor = "Lsa;"
   )
   private class39 field7220;
   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7222 = new String[]{method3833(method3832("\u0011qZb\u0006")), method3833(method3832("\u0011qZj\u0006")), method3833(method3832("\u0011qZf\u0006")), method3833(method3832("\u0011qZa\u0006")), method3833(method3832("\u0016j\u0018O")), method3833(method3832("\u0011qZ\u001fG\u0016v\u0000\u001d\u0006")), method3833(method3832("\u00031Z\rS")), method3833(method3832("\u0011qZ`\u0006")), method3833(method3832("\u0011qZg\u0006")), method3833(method3832("\u0011qZd\u0006")), method3833(method3832("D|\u001bO\u0013\u001ey\u0012EH\u001e!")), method3833(method3832("6j\u0018O")), method3833(method3832("\u0011qZe\u0006")), method3833(method3832("Dv\u0019D\u0013H!")), method3833(method3832(",.T\u000e\u000e")), method3833(method3832("Xv\u0004\u0019")), method3833(method3832("Dv\u0019D\u0013I!")), method3833(method3832("\u0011q\u0002L\u0014")), method3833(method3832("\u0017o\u0011M]\u0016")), method3833(method3832("X2T")), method3833(method3832("\u0011qZk\u0006"))};
   @OriginalMember(
      owner = "client!in",
      name = "c",
      descriptor = "I"
   )
   public static int field7210;
   @OriginalMember(
      owner = "client!in",
      name = "e",
      descriptor = "I"
   )
   public static int field7211;
   @OriginalMember(
      owner = "client!in",
      name = "j",
      descriptor = "I"
   )
   public static int field7212;
   @OriginalMember(
      owner = "client!in",
      name = "i",
      descriptor = "I"
   )
   public static int field7213;
   @OriginalMember(
      owner = "client!in",
      name = "l",
      descriptor = "I"
   )
   public static int field7214;
   @OriginalMember(
      owner = "client!in",
      name = "g",
      descriptor = "I"
   )
   public static int field7215;
   @OriginalMember(
      owner = "client!in",
      name = "k",
      descriptor = "I"
   )
   public static int field7216;
   @OriginalMember(
      owner = "client!in",
      name = "d",
      descriptor = "I"
   )
   public static int field7217;
   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "I"
   )
   public static int field7218;
   @OriginalMember(
      owner = "client!in",
      name = "f",
      descriptor = "I"
   )
   public static int field7221;

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method3823(byte arg0) {
      try {
         class107 var2 = this.field7219;
         synchronized(this.field7219) {
            this.field7219.method1052(true);
            if (arg0 != 59) {
               this.method3823((byte)-72);
            }
         }

         ++field7216;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7222[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "b",
      descriptor = "(II)V"
   )
   public final void method3824(int arg0, int arg1) {
      try {
         class107 var3 = this.field7219;
         synchronized(this.field7219) {
            this.field7219.method1048(arg1, -8543);
         }

         if (arg0 == -6521) {
            ++field7214;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7222[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3825(int arg0) {
      try {
         ++field7210;
         if (arg0 != 47) {
            field7211 = -68;
         }

         class180.method1627((byte)-101);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7222[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(Ldr;B)Z"
   )
   public static final boolean method3826(class242 param0, byte param1) throws IOException {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!in",
      name = "b",
      descriptor = "(B)V"
   )
   public final void method3827(byte arg0) {
      try {
         class107 var2 = this.field7219;
         synchronized(this.field7219) {
            this.field7219.method1045(3);
         }

         if (arg0 != -2) {
            this.field7219 = null;
         }

         ++field7217;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7222[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(IZI)V"
   )
   public static final void method3828(int arg0, boolean arg1, int arg2) {
      try {
         ++field7218;
         class247.method2142(class765.field10915.method5512(-2, class777.field11340), arg2, arg1, (byte)5);
         if (arg0 != 1) {
            field7211 = 51;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7222[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(IBILtea;)V"
   )
   public static final void method3829(int arg0, byte arg1, int arg2, class272 arg3) {
      boolean var4 = client.field10022;

      try {
         ++field7215;
         if (arg3 != null && class594.field8377.field4002 != arg3) {
            int var5 = arg3.field4163;
            int var6 = arg3.field4151;
            int var7 = arg3.field4159;
            int var8 = (int)arg3.field4166;
            long var9 = arg3.field4166;
            if (~var7 <= -2001) {
               var7 -= 2000;
            }

            if (var7 == 9) {
               class361.field5336 = arg2;
               ++class17.field234;
               class766.field10995 = arg0;
               class91.field1447 = 2;
               class623.field8911 = 0;
               class381 var11 = class801.method5775(class330.field4928, 0, class745.field10605.field3718);
               var11.field5570.method675(-32331, class451.field6582);
               var11.field5570.method675(-32331, class704.field10135);
               var11.field5570.method653(class117.field1849.field5826, -116);
               var11.field5570.method689((byte)-113, class130.field2085.method4653(82, (byte)-106) ? 1 : 0);
               var11.field5570.method674(-82, class224.field3183);
               class745.field10605.method2111(14024, var11);
            }

            if (~var7 == -1011 || var7 == 1008 || ~var7 == -1012 || var7 == 1006 || ~var7 == -1010) {
               class719.method5202(var7, (byte)73, var8, var5);
            }

            if (~var7 == -7 && class463.field6743 == null) {
               class74.method825(255, var5, var6);
               class463.field6743 = class751.method5399(var6, 1, var5);
               class566.method4205(1727005542, class463.field6743);
            }

            if (~var7 == -47) {
               class91 var12 = class751.method5399(var6, 1, var5);
               if (var12 != null) {
                  class499.method3776(123);
                  class414 var13 = client.method5048(var12);
                  class623.method4585(var13.method3238(-84), var13.field6069, -27461, var12);
                  class733.field10420 = class499.method3777(var12, 28);
                  class128.field2048 = var12.field1437 + field7222[10];
                  if (class733.field10420 == null) {
                     class733.field10420 = field7222[11];
                  }
               }

            } else {
               class164 var14 = null;
               if (var7 == 11) {
                  var14 = class604.field8617;
               } else if (var7 == 10) {
                  var14 = class330.field4915;
               } else if (var7 == 15) {
                  var14 = class296.field4396;
               } else if (var7 != 51) {
                  if (var7 == 58) {
                     var14 = class578.field8152;
                  } else if (~var7 == -1005) {
                     var14 = class430.field6304;
                  }
               } else {
                  var14 = class176.field2611;
               }

               if (var14 != null) {
                  class432 var15 = (class432)class573.field8110.method3101(-1, (long)var8);
                  if (var15 != null) {
                     class361.field5336 = arg2;
                     class91.field1447 = 2;
                     class766.field10995 = arg0;
                     ++class403.field5938;
                     class799 var16 = var15.field6345;
                     class623.field8911 = 0;
                     class381 var17 = class801.method5775(var14, 0, class745.field10605.field3718);
                     var17.field5570.method636(false, var8);
                     var17.field5570.method689((byte)-116, class130.field2085.method4653(82, (byte)-106) ? 1 : 0);
                     class745.field10605.method2111(14024, var17);
                     class627.method4612(var16.method1507(-63), (byte)106, true, var16.field5861[0], -2, 0, 0, var16.method1507(-117), var16.field5865[0]);
                  }
               }

               if (~var7 == -20 || var7 == 1003) {
                  class456.method3532(var5, var6, arg3.field4152, var8, (byte)-128);
               }

               if (~var7 == -22) {
                  label298: {
                     if (class33.field489 > 0 && class130.field2085.method4653(82, (byte)-106) && class130.field2085.method4653(81, (byte)-106)) {
                        class566.method4206((byte)101, class115.field1824 + var5, class117.field1849.field6824, class480.field6903 + var6);
                        if (!var4) {
                           break label298;
                        }
                     }

                     ++class18.field248;
                     class623.field8911 = 0;
                     class766.field10995 = arg0;
                     class91.field1447 = 1;
                     class361.field5336 = arg2;
                     class381 var18 = class801.method5775(class775.field11306, 0, class745.field10605.field3718);
                     var18.field5570.method675(-32331, class115.field1824 + var5);
                     var18.field5570.method636(false, class480.field6903 - -var6);
                     class745.field10605.method2111(14024, var18);
                  }
               }

               int var19 = -7 % ((74 - arg1) / 47);
               class164 var20 = null;
               if (var7 != 30) {
                  if (var7 != 57) {
                     if (var7 != 59) {
                        if (~var7 != -46) {
                           if (~var7 == -1003) {
                              var20 = class716.field10270;
                           } else if (var7 == 1001) {
                              var20 = class94.field1539;
                           }
                        } else {
                           var20 = class411.field6014;
                        }
                     } else {
                        var20 = class544.field7681;
                     }
                  } else {
                     var20 = class724.field10351;
                  }
               } else {
                  var20 = class603.field8603;
               }

               if (var20 != null) {
                  class91.field1447 = 2;
                  class766.field10995 = arg0;
                  class623.field8911 = 0;
                  class361.field5336 = arg2;
                  ++class90.field1327;
                  class381 var21 = class801.method5775(var20, 0, class745.field10605.field3718);
                  var21.field5570.method656((byte)91, class130.field2085.method4653(82, (byte)-106) ? 1 : 0);
                  var21.field5570.method675(-32331, Integer.MAX_VALUE & (int)(var9 >>> 32));
                  var21.field5570.method675(-32331, class480.field6903 + var6);
                  var21.field5570.method643(var5 - -class115.field1824, true);
                  class745.field10605.method2111(14024, var21);
                  class465.method3576(var6, var9, 4, var5);
               }

               if (~var7 == -51) {
                  class432 var22 = (class432)class573.field8110.method3101(-1, (long)var8);
                  if (var22 != null) {
                     class799 var23 = var22.field6345;
                     class91.field1447 = 2;
                     class623.field8911 = 0;
                     ++class711.field10206;
                     class766.field10995 = arg0;
                     class361.field5336 = arg2;
                     class381 var24 = class801.method5775(class27.field399, 0, class745.field10605.field3718);
                     var24.field5570.method653(class704.field10135, -89);
                     var24.field5570.method653(var8, -55);
                     var24.field5570.method661(-108, class224.field3183);
                     var24.field5570.method656((byte)-123, !class130.field2085.method4653(82, (byte)-106) ? 0 : 1);
                     var24.field5570.method675(-32331, class451.field6582);
                     class745.field10605.method2111(14024, var24);
                     class627.method4612(var23.method1507(-99), (byte)106, true, var23.field5861[0], -2, 0, 0, var23.method1507(-119), var23.field5865[0]);
                  }
               }

               class164 var25 = null;
               if (~var7 != -17) {
                  if (var7 == 20) {
                     var25 = class785.field11456;
                  } else if (var7 == 60) {
                     var25 = class354.field5235;
                  } else if (~var7 != -53) {
                     if (var7 == 53) {
                        var25 = class181.field2672;
                     } else if (var7 != 18) {
                        if (var7 == 48) {
                           var25 = class739.field10554;
                        } else if (~var7 == -5) {
                           var25 = class559.field7936;
                        } else if (var7 != 25) {
                           if (var7 == 44) {
                              var25 = class775.field11291;
                           }
                        } else {
                           var25 = class332.field4939;
                        }
                     } else {
                        var25 = class479.field6889;
                     }
                  } else {
                     var25 = class105.field1644;
                  }
               } else {
                  var25 = class674.field9450;
               }

               if (var25 != null) {
                  class158 var26 = class501.field7137[var8];
                  if (var26 != null) {
                     class91.field1447 = 2;
                     class766.field10995 = arg0;
                     class623.field8911 = 0;
                     ++class511.field7246;
                     class361.field5336 = arg2;
                     class381 var27 = class801.method5775(var25, 0, class745.field10605.field3718);
                     var27.field5570.method653(var8, -52);
                     var27.field5570.method689((byte)-114, !class130.field2085.method4653(82, (byte)-106) ? 0 : 1);
                     class745.field10605.method2111(14024, var27);
                     class627.method4612(var26.method1507(-118), (byte)106, true, var26.field5861[0], -2, 0, 0, var26.method1507(-57), var26.field5865[0]);
                  }
               }

               if (~var7 == -13) {
                  label327: {
                     if (class33.field489 > 0 && class130.field2085.method4653(82, (byte)-106) && class130.field2085.method4653(81, (byte)-106)) {
                        class566.method4206((byte)-94, class115.field1824 + var5, class117.field1849.field6824, class480.field6903 + var6);
                        if (!var4) {
                           break label327;
                        }
                     }

                     class381 var28;
                     label279: {
                        var28 = class449.method3482(var6, var8, 82, var5);
                        if (var8 == 1) {
                           var28.field5570.method656((byte)54, -1);
                           var28.field5570.method656((byte)-111, -1);
                           var28.field5570.method653((int)class86.field1312, -95);
                           var28.field5570.method656((byte)101, 57);
                           var28.field5570.method656((byte)42, class647.field9122);
                           var28.field5570.method656((byte)70, class455.field6620);
                           var28.field5570.method656((byte)-123, 89);
                           var28.field5570.method653(class117.field1849.field6832, -124);
                           var28.field5570.method653(class117.field1849.field6833, -59);
                           var28.field5570.method656((byte)47, 63);
                           if (!var4) {
                              break label279;
                           }
                        }

                        class766.field10995 = arg0;
                        class623.field8911 = 0;
                        class91.field1447 = 1;
                        class361.field5336 = arg2;
                     }

                     class745.field10605.method2111(14024, var28);
                     class627.method4612(1, (byte)106, true, var5, -4, 0, 0, 1, var6);
                  }
               }

               if (~var7 == -18) {
                  class158 var29 = class501.field7137[var8];
                  if (var29 != null) {
                     ++class17.field234;
                     class766.field10995 = arg0;
                     class91.field1447 = 2;
                     class623.field8911 = 0;
                     class361.field5336 = arg2;
                     class381 var30 = class801.method5775(class330.field4928, 0, class745.field10605.field3718);
                     var30.field5570.method675(-32331, class451.field6582);
                     var30.field5570.method675(-32331, class704.field10135);
                     var30.field5570.method653(var8, -81);
                     var30.field5570.method689((byte)-101, !class130.field2085.method4653(82, (byte)-106) ? 0 : 1);
                     var30.field5570.method674(-83, class224.field3183);
                     class745.field10605.method2111(14024, var30);
                     class627.method4612(var29.method1507(-91), (byte)106, true, var29.field5861[0], -2, 0, 0, var29.method1507(-16), var29.field5865[0]);
                  }
               }

               if (~var7 == -9) {
                  class91 var31 = class751.method5399(var6, 1, var5);
                  if (var31 != null) {
                     class91.method916(var31, (byte)-125);
                  }
               }

               if (~var7 == -23) {
                  ++class267.field4081;
                  class766.field10995 = arg0;
                  class91.field1447 = 2;
                  class623.field8911 = 0;
                  class361.field5336 = arg2;
                  class381 var32 = class801.method5775(class556.field7898, 0, class745.field10605.field3718);
                  var32.field5570.method689((byte)-118, class130.field2085.method4653(82, (byte)-106) ? 1 : 0);
                  var32.field5570.method675(-32331, class115.field1824 + var5);
                  var32.field5570.method643(class704.field10135, true);
                  var32.field5570.method661(-104, class224.field3183);
                  var32.field5570.method643(class451.field6582, true);
                  var32.field5570.method675(-32331, var6 - -class480.field6903);
                  var32.field5570.method636(false, var8);
                  class745.field10605.method2111(14024, var32);
                  class113.method1110(var6, (byte)11, var5);
               }

               class164 var33 = null;
               if (~var7 == -3) {
                  var33 = class6.field74;
               } else if (~var7 == -14) {
                  var33 = class196.field2829;
               } else if (var7 == 5) {
                  var33 = class708.field10162;
               } else if (~var7 == -24) {
                  var33 = class513.field7281;
               } else if (var7 == 47) {
                  var33 = class403.field5936;
               } else if (~var7 == -1008) {
                  var33 = class596.field8397;
               }

               if (var33 != null) {
                  class623.field8911 = 0;
                  class361.field5336 = arg2;
                  class766.field10995 = arg0;
                  ++class135.field2191;
                  class91.field1447 = 2;
                  class381 var34 = class801.method5775(var33, 0, class745.field10605.field3718);
                  var34.field5570.method653(var8, -68);
                  var34.field5570.method675(-32331, class115.field1824 + var5);
                  var34.field5570.method675(-32331, class480.field6903 + var6);
                  var34.field5570.method656((byte)113, class130.field2085.method4653(82, (byte)-106) ? 1 : 0);
                  class745.field10605.method2111(14024, var34);
                  class113.method1110(var6, (byte)11, var5);
               }

               if (~var7 == -50) {
                  class361.field5336 = arg2;
                  ++class323.field4810;
                  class766.field10995 = arg0;
                  class623.field8911 = 0;
                  class91.field1447 = 2;
                  class381 var35 = class801.method5775(class150.field2308, 0, class745.field10605.field3718);
                  var35.field5570.method689((byte)-117, !class130.field2085.method4653(82, (byte)-106) ? 0 : 1);
                  var35.field5570.method650(false, class224.field3183);
                  var35.field5570.method653(class704.field10135, -95);
                  var35.field5570.method653(class480.field6903 + var6, -49);
                  var35.field5570.method636(false, class451.field6582);
                  var35.field5570.method653(Integer.MAX_VALUE & (int)(var9 >>> 32), -95);
                  var35.field5570.method675(-32331, class115.field1824 + var5);
                  class745.field10605.method2111(14024, var35);
                  class465.method3576(var6, var9, 4, var5);
               }

               if (var7 == 3) {
                  class766.field10995 = arg0;
                  ++class793.field11539;
                  class623.field8911 = 0;
                  class91.field1447 = 1;
                  class361.field5336 = arg2;
                  class381 var36 = class801.method5775(class375.field5474, 0, class745.field10605.field3718);
                  var36.field5570.method643(class704.field10135, true);
                  var36.field5570.method650(false, class224.field3183);
                  var36.field5570.method675(-32331, class480.field6903 + var6);
                  var36.field5570.method653(class451.field6582, -111);
                  var36.field5570.method636(false, class115.field1824 + var5);
                  class745.field10605.method2111(14024, var36);
                  class627.method4612(1, (byte)106, true, var5, -4, 0, 0, 1, var6);
               }

               if (class37.field543) {
                  class499.method3776(127);
               }

               if (class746.field10610 != null && ~class279.field4229 == -1) {
                  class566.method4205(1727005542, class746.field10610);
               }
            }
         }
      } catch (RuntimeException var38) {
         throw class612.method4503(var38, field7222[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field7222[6] : field7222[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(II)Lpr;"
   )
   public final class129 method3830(int arg0, int arg1) {
      try {
         ++field7213;
         class107 var3 = this.field7219;
         class129 var4;
         synchronized(this.field7219) {
            var4 = (class129)this.field7219.method1041((long)arg0, 8);
         }

         if (var4 != null) {
            return var4;
         } else {
            class39 var5 = this.field7220;
            byte[] var6;
            synchronized(this.field7220) {
               var6 = this.field7220.method460((byte)-11, arg0, arg1);
            }

            class129 var7 = new class129();
            if (var6 != null) {
               var7.method1312(new class65(var6), -2582);
            }

            var7.method1314(15);
            class107 var8 = this.field7219;
            synchronized(this.field7219) {
               this.field7219.method1050(arg1 ^ -98, var7, (long)arg0);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class612.method4503(var13, field7222[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "a",
      descriptor = "(ILjga;BI)V"
   )
   public static final void method3831(int arg0, class91 arg1, byte arg2, int arg3) {
      boolean var4 = client.field10022;

      try {
         if (arg2 == 61) {
            label138: {
               if (~arg1.field1389 == -1) {
                  arg1.field1425 = arg1.field1406;
                  if (!var4) {
                     break label138;
                  }
               }

               if (arg1.field1389 == 1) {
                  arg1.field1425 = (-arg1.field1452 + arg3) / 2 + arg1.field1406;
                  if (!var4) {
                     break label138;
                  }
               }

               if (~arg1.field1389 == -3) {
                  arg1.field1425 = -arg1.field1452 + arg3 + -arg1.field1406;
                  if (!var4) {
                     break label138;
                  }
               }

               if (arg1.field1389 != 3) {
                  if (arg1.field1389 != 4) {
                     arg1.field1425 = -(arg1.field1406 * arg3 >> 14) + -arg1.field1452 + arg3;
                     if (!var4) {
                        break label138;
                     }
                  }

                  arg1.field1425 = (-arg1.field1452 + arg3) / 2 - -(arg1.field1406 * arg3 >> 14);
                  if (!var4) {
                     break label138;
                  }
               }

               arg1.field1425 = arg1.field1406 * arg3 >> 14;
            }

            label139: {
               if (arg1.field1462 == 0) {
                  arg1.field1341 = arg1.field1401;
                  if (!var4) {
                     break label139;
                  }
               }

               if (~arg1.field1462 != -2) {
                  if (arg1.field1462 != 2) {
                     if (arg1.field1462 != 3) {
                        if (arg1.field1462 == 4) {
                           arg1.field1341 = (arg0 - arg1.field1513) / 2 - -(arg1.field1401 * arg0 >> 14);
                           if (!var4) {
                              break label139;
                           }
                        }

                        arg1.field1341 = -arg1.field1513 + arg0 + -(arg1.field1401 * arg0 >> 14);
                        if (!var4) {
                           break label139;
                        }
                     }

                     arg1.field1341 = arg1.field1401 * arg0 >> 14;
                     if (!var4) {
                        break label139;
                     }
                  }

                  arg1.field1341 = -arg1.field1401 + arg0 - arg1.field1513;
                  if (!var4) {
                     break label139;
                  }
               }

               arg1.field1341 = (-arg1.field1513 + arg0) / 2 + arg1.field1401;
            }

            ++field7212;
            if (class34.field514) {
               if (client.method5048(arg1).field6076 != 0 || ~arg1.field1403 == -1) {
                  label87: {
                     if (arg1.field1425 < 0) {
                        arg1.field1425 = 0;
                        if (!var4) {
                           break label87;
                        }
                     }

                     if (arg3 < arg1.field1452 + arg1.field1425) {
                        arg1.field1425 = -arg1.field1452 + arg3;
                     }
                  }

                  if (~arg1.field1341 > -1) {
                     arg1.field1341 = 0;
                     return;
                  }

                  if (arg1.field1513 + arg1.field1341 <= arg0) {
                     return;
                  }

                  arg1.field1341 = -arg1.field1513 + arg0;
               }

            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field7222[7] + arg0 + ',' + (arg1 != null ? field7222[6] : field7222[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "<init>",
      descriptor = "(Ltb;ILsa;)V"
   )
   public class508(class392 arg0, int arg1, class39 arg2) {
      try {
         this.field7220 = arg2;
         if (this.field7220 != null) {
            this.field7220.method434((byte)-106, 35);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field7222[5] + (arg0 != null ? field7222[6] : field7222[4]) + ',' + arg1 + ',' + (arg2 != null ? field7222[6] : field7222[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3832(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!in",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3833(char[] arg0) {
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
            var10005 = 31;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
