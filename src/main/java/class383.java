import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public abstract class class383 extends class294 {
   @OriginalMember(
      owner = "client!mn",
      name = "N",
      descriptor = "S"
   )
   public short field5670;
   @OriginalMember(
      owner = "client!mn",
      name = "D",
      descriptor = "S"
   )
   public short field5672;
   @OriginalMember(
      owner = "client!mn",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5675 = new String[]{method2985(method2984("+A#P<(FyR}")), method2985(method2984("+A#(}")), method2985(method2984("(Za\u0000")), method2985(method2984("=\u0001#B(")), method2985(method2984("+A#+\u0014n")), method2985(method2984("zLb\u0000hv\u001fk\n3 \u0011")), method2985(method2984("f\u00023Li%@aQevIk\n3x")), method2985(method2984("+A#8}")), method2985(method2984("f\u00023Li%@aQ3 \u0016=Xex")), method2985(method2984("f\u00023")), method2985(method2984("zLb\u0000h I4\\av\u0011")), method2985(method2984("\u0016Nx\u001f<(H-\n:4\u000f")), method2985(method2984("+A#/}")), method2985(method2984("f\\h\u000f:(K~B{h")), method2985(method2984("6Nx\u001f0")), method2985(method2984("+A##}")), method2985(method2984("+A#(\u0014n")), method2985(method2984("+A#.}")), method2985(method2984("+A#%}")), method2985(method2984("+A#*\u0014n")), method2985(method2984("\u0015Gl\b04\u000fn\u000386Fa\tu Nd\u00000\"\u0015")), method2985(method2984("+A#;}")), method2985(method2984("+A#&}"))};
   @OriginalMember(
      owner = "client!mn",
      name = "L",
      descriptor = "Leb;"
   )
   public static class650 field5660 = new class650(5, 3);
   @OriginalMember(
      owner = "client!mn",
      name = "K",
      descriptor = "I"
   )
   public static int field5661;
   @OriginalMember(
      owner = "client!mn",
      name = "I",
      descriptor = "I"
   )
   public static int field5662;
   @OriginalMember(
      owner = "client!mn",
      name = "C",
      descriptor = "I"
   )
   public static int field5663;
   @OriginalMember(
      owner = "client!mn",
      name = "H",
      descriptor = "I"
   )
   public static int field5664;
   @OriginalMember(
      owner = "client!mn",
      name = "F",
      descriptor = "I"
   )
   public static int field5665;
   @OriginalMember(
      owner = "client!mn",
      name = "M",
      descriptor = "I"
   )
   public static int field5666;
   @OriginalMember(
      owner = "client!mn",
      name = "G",
      descriptor = "I"
   )
   public static int field5667;
   @OriginalMember(
      owner = "client!mn",
      name = "J",
      descriptor = "I"
   )
   public static int field5668;
   @OriginalMember(
      owner = "client!mn",
      name = "O",
      descriptor = "I"
   )
   public static int field5669;
   @OriginalMember(
      owner = "client!mn",
      name = "A",
      descriptor = "I"
   )
   public static int field5671;
   @OriginalMember(
      owner = "client!mn",
      name = "B",
      descriptor = "I"
   )
   public static int field5674;
   @OriginalMember(
      owner = "client!mn",
      name = "P",
      descriptor = "Z"
   )
   public static boolean field5673;

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(Lrk;IILjava/lang/String;)Ltu;",
      line = 4
   )
   public static final class366 method2979(class35 arg0, int arg1, int arg2, String arg3) {
      try {
         ++field5668;
         if (arg1 != 12203) {
            method2979((class35)null, 105, 84, (String)null);
         }

         long var4 = OpenGL.glCreateShaderObjectARB(arg2);
         OpenGL.glShaderSourceARB(var4, arg3);
         OpenGL.glCompileShaderARB(var4);
         OpenGL.glGetObjectParameterivARB(var4, 35713, class756.field10971, 0);
         if (class756.field10971[0] == 0) {
            if (~class756.field10971[0] == -1) {
               System.out.println(field5675[20]);
            }

            OpenGL.glGetObjectParameterivARB(var4, 35716, class756.field10971, 1);
            if (class756.field10971[1] > 1) {
               byte[] var6 = new byte[class756.field10971[1]];
               OpenGL.glGetInfoLogARB(var4, class756.field10971[1], class756.field10971, 0, var6, 0);
               System.out.println(new String(var6));
            }

            if (class756.field10971[0] == 0) {
               OpenGL.glDeleteObjectARB(var4);
               return null;
            }
         }

         return new class366(arg0, var4, arg2);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field5675[21] + (arg0 != null ? field5675[3] : field5675[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5675[3] : field5675[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(III)Z",
      line = 43
   )
   public static final boolean method2980(int arg0, int arg1, int arg2) {
      try {
         ++field5665;
         if (!class27.method191(arg0, (byte)-125, arg2)) {
            return false;
         } else if (~(arg0 & 36864) != -1 | class190.method1655(arg0, arg2, (byte)62) | class594.method4387(true, arg2, arg0)) {
            return true;
         } else {
            if (arg1 != 0) {
               method2981(false);
            }

            return (arg2 & 55) == 0 & (class4.method28(arg0, (byte)-43, arg2) | (8192 & arg0) != 0 | class520.method3925(arg1 + 35, arg2, arg0));
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5675[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "d",
      descriptor = "(I)V",
      line = 64
   )
   public final void method594(int arg0) {
      try {
         if (arg0 == 255) {
            ++field5661;
            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5675[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "(ILha;)Z",
      line = 76
   )
   public final boolean method1362(int arg0, class65 arg1) {
      try {
         if (arg0 != 0) {
            this.field5672 = -29;
         }

         ++field5667;
         return class98.method935(arg0 ^ -101, super.field4091, super.field4101 >> class76.field1336, this.method589(arg0 ^ 19053), super.field4096 >> class76.field1336);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5675[4] + arg0 + ',' + (arg1 != null ? field5675[3] : field5675[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "g",
      descriptor = "(I)Z",
      line = 93
   )
   public final boolean method601(int arg0) {
      try {
         if (arg0 != 0) {
            field5673 = true;
         }

         ++field5663;
         return false;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5675[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "(IZLvca;Lha;III)V",
      line = 106
   )
   public final void method579(int arg0, boolean arg1, class294 arg2, class65 arg3, int arg4, int arg5, int arg6) {
      try {
         if (arg5 != 0) {
            field5660 = null;
         }

         ++field5669;
         throw new IllegalStateException();
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5675[15] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5675[3] : field5675[2]) + ',' + (arg3 != null ? field5675[3] : field5675[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "([Lke;B)I",
      line = 117
   )
   public final int method1366(class622[] arg0, byte arg1) {
      try {
         if (arg1 > -57) {
            field5673 = false;
         }

         ++field5666;
         return this.method2296(super.field4096 >> class76.field1336, arg0, super.field4101 >> class76.field1336, true);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field5675[19] + (arg0 != null ? field5675[3] : field5675[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "i",
      descriptor = "(I)Z",
      line = 130
   )
   public final boolean method1365(int arg0) {
      try {
         if (arg0 != -1) {
            method2979((class35)null, -12, 118, (String)null);
         }

         ++field5674;
         return class750.field10812[(super.field4101 >> class76.field1336) + -class566.field8206 + class54.field1102][(super.field4096 >> class76.field1336) - class115.field1864 + class54.field1102];
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field5675[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "c",
      descriptor = "(Z)V",
      line = 141
   )
   public static void method2981(boolean arg0) {
      try {
         field5660 = null;
         if (!arg0) {
            field5673 = false;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5675[22] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "a",
      descriptor = "([Ljava/lang/String;I)V",
      line = 153
   )
   public static final void method2982(String[] arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         label64: {
            ++field5671;
            if (arg0.length <= 1) {
               class304.field4406 = class304.field4406 + arg0[0];
               class588.field8497 += arg0[0].length();
               if (!var2) {
                  break label64;
               }
            }

            int var3 = 0;
            if (var2 || ~var3 > ~arg0.length) {
               label69: {
                  while(!arg0[var3].startsWith(field5675[14])) {
                     class304.field4406 = arg0[var3];
                     class123.method1141(0, false);
                     if (var2) {
                        break;
                     }

                     ++var3;
                     if (~var3 <= ~arg0.length) {
                        break label69;
                     }
                  }

                  int var4 = 5;

                  try {
                     var4 = Integer.parseInt(arg0[var3].substring(6));
                  } catch (Exception var6) {
                  }

                  class622.method4561(field5675[11] + var4 + field5675[13], (byte)89);
                  class157.field2510 = arg0;
                  class545.field7895 = var3 - -1;
                  class22.field351 = class57.method650(101) - -((long)(var4 * 1000));
                  return;
               }
            }
         }

         if (arg1 != 5) {
            method2983(99, -16, -42, (class65)null);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field5675[12] + (arg0 != null ? field5675[3] : field5675[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "<init>",
      descriptor = "(IIIIIII)V",
      line = 199
   )
   public class383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         this.field5670 = (short)arg6;
         super.field4097 = arg1;
         super.field4091 = (byte)arg4;
         super.field4101 = arg0;
         super.field4096 = arg2;
         super.field4090 = (byte)arg3;
         this.field5672 = (short)arg5;
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field5675[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "b",
      descriptor = "(IIILha;)V",
      line = 214
   )
   public static final void method2983(int arg0, int arg1, int arg2, class65 arg3) {
      boolean var4 = client.field4564;

      try {
         ++field5664;
         if (~arg2 <= -1 && arg0 >= 0 && ~class678.field9947 != -1 && ~class560.field8152 != -1) {
            int var5;
            int var6;
            int var7;
            int var8;
            class173 var9;
            int var10;
            int var11;
            label677: {
               if (!class262.field3734) {
                  arg3.method429(class769.field11198, class109.field1783, class678.field9947, class560.field8152);
                  var5 = class678.field9947;
                  var6 = class560.field8152;
                  var7 = class769.field11198;
                  var8 = class109.field1783;
                  arg3.method333(class211.field3155, class151.field2420, class678.field9947, class560.field8152);
                  var9 = arg3.method432();
                  var9.method997(class760.field11028, class396.field5820, class53.field1100, class15.field235, class140.field2292, class477.field6951);
                  arg3.method338(var9);
                  var10 = arg2;
                  var11 = arg0;
                  if (!var4) {
                     break label677;
                  }
               }

               class690.method5025(arg1 ^ -3046, false);
               var9 = arg3.method398();
               int[] var12 = arg3.method278();
               var5 = var12[2];
               var7 = var12[0];
               var8 = var12[1];
               var6 = var12[3];
               var10 = class335.method2602((byte)75, false) + arg2;
               var11 = arg0 + class197.method1701(-1, false);
            }

            if (~var5 == -1) {
               var5 = 1;
            }

            class284.method2212(arg1 ^ -15033, true);
            if (~var6 == -1) {
               var6 = 1;
            }

            if (class530.field7721 != null && (!class85.field1410 || ~(64 & class585.field8461) != -1)) {
               int var13;
               int var14;
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               int var20;
               label663: {
                  var13 = -1;
                  var14 = -1;
                  var15 = arg3.method291();
                  var16 = arg3.method437();
                  if (!class679.field9962) {
                     var17 = (-var8 + var11) * var16 / var6;
                     var18 = (-var8 + var11) * var15 / var6;
                     var19 = (-var7 + var10) * var15 / var5;
                     var20 = (var10 - var7) * var16 / var5;
                     if (!var4) {
                        break label663;
                     }
                  }

                  var19 = var20 = (-var7 + var10) * class75.field1316 / var5;
                  var18 = var17 = (var11 - var8) * class75.field1316 / var6;
               }

               int[] var21 = new int[]{var19, var18, var15};
               int[] var22 = new int[]{var20, var17, var16};
               var9.method976(var21);
               var9.method976(var22);
               float var23 = class613.method4502(4, (float)var21[2], (float)var22[1], (float)var21[1], 31447, (float)var21[0], (float)var22[0], (float)var22[2]);
               if (var23 > 0.0F) {
                  int var24 = var22[0] - var21[0];
                  int var25 = var22[2] + -var21[2];
                  int var26 = (int)((float)var24 * var23 + (float)var21[0]);
                  int var27 = (int)((float)var25 * var23 + (float)var21[2]);
                  var13 = (-1 + class304.field4398.method3438(false) << 8) + var26 >> 9;
                  var14 = (class304.field4398.method3438(false) - 1 << 8) + var27 >> 9;
                  byte var28 = class304.field4398.field4090;
                  if (~var28 > -4 && ~(2 & class608.field8732[1][var26 >> 9][var27 >> 9]) != -1) {
                     int var90 = var28 + 1;
                  }
               }

               if (var13 != -1 && var14 != -1) {
                  label761: {
                     if (!class85.field1410 || ~(class585.field8461 & 64) == -1) {
                        if (class542.field7863) {
                           class388.method3010((long)(var14 | var13 << 0), -1, true, 0L, var14, false, -128, true, var13, "", 60, -1, class100.field1626.method961(class385.field5684, true));
                        }

                        class388.method3010((long)(var14 | var13 << 0), -1, true, 0L, var14, false, -120, true, var13, "", 22, class32.field487, class715.field10351);
                        ++class744.field10720;
                        if (!var4) {
                           break label761;
                        }
                     }

                     class303 var29 = class345.method2670(class752.field10823, (byte)116, class780.field11429);
                     if (var29 == null) {
                        class449.method3386((byte)-44);
                        if (!var4) {
                           break label761;
                        }
                     }

                     class388.method3010((long)(var14 | var13 << 0), -1, true, 0L, var14, false, -121, true, var13, field5675[9], 53, class560.field8149, class133.field2194);
                  }
               }
            }

            if (class262.field3734) {
               class218.method1851(86);
            }

            int var30 = 0;
            if (arg1 == -3048) {
               while(true) {
                  byte var10001;
                  if (!class262.field3734) {
                     var10001 = 1;
                     if (!var4) {
                     }
                  } else {
                     var10001 = 2;
                  }

                  if (var30 >= var10001) {
                     class284.method2212(12639, false);
                     return;
                  }

                  boolean var31 = var30 == 0;
                  class189 var32 = !var31 ? class664.field9657 : class458.field6722;
                  int var33 = arg2;
                  int var34 = arg0;
                  if (class262.field3734) {
                     class690.method5025(arg1 ^ -3046, var31);
                     var33 = arg2 + class335.method2602((byte)75, var31);
                     var34 = arg0 + class197.method1701(arg1 ^ 3047, var31);
                  }

                  boolean var10000;
                  label640: {
                     class150 var35 = var32.field2841;
                     class321 var36 = (class321)var35.method1394((byte)-115);
                     if (var4) {
                        var10000 = class320.field4616;
                     } else if (var36 == null) {
                        var10000 = class262.field3734;
                        if (!var4) {
                           break label640;
                        }
                     } else {
                        var10000 = class320.field4616;
                     }

                     while(true) {
                        if ((var10000 || class304.field4398.field4090 == var36.field4623.field4090) && var36.method2504(var33, arg3, arg1 + 3048, var34)) {
                           label714: {
                              int var39;
                              int var40;
                              label633: {
                                 boolean var37 = false;
                                 boolean var38 = false;
                                 if (!(var36.field4623 instanceof class144)) {
                                    var39 = var36.field4623.field4101 >> 9;
                                    var40 = var36.field4623.field4096 >> 9;
                                    if (!var4) {
                                       break label633;
                                    }
                                 }

                                 var40 = ((class144)var36.field4623).field2347;
                                 var39 = ((class144)var36.field4623).field2354;
                              }

                              if (var36.field4623 instanceof class457) {
                                 class457 var41 = (class457)var36.field4623;
                                 int var42 = var41.method3438(false);
                                 if ((1 & var42) == 0 && (var41.field4101 & 511) == 0 && (var41.field4096 & 511) == 0 || ~(1 & var42) == -2 && (var41.field4101 & 511) == 256 && ~(var41.field4096 & 511) == -257) {
                                    int var43 = var41.field4101 - (-1 + var41.method3438(false) << 8);
                                    int var44 = var41.field4096 + -(var41.method3438(false) + -1 << 8);
                                    int var45 = 0;
                                    if (var4 || class16.field293 > var45) {
                                       do {
                                          class272 var46 = (class272)class78.field1344.method1572((long)class577.field8316[var45], -16289);
                                          if (var46 != null) {
                                             class451 var47 = var46.field3851;
                                             if (~class29.field458 != ~var47.field11226) {
                                                if (!var47.field11222 && !var4) {
                                                   ++var45;
                                                } else {
                                                   int var48 = -(var47.field6586.field239 + -1 << 8) + var47.field4101;
                                                   int var49 = var47.field4096 - (var47.field6586.field239 - 1 << 8);
                                                   if (~var43 >= ~var48 && ~var47.field6586.field239 >= ~(-(-var43 + var48 >> 9) + var41.method3438(false)) && ~var44 >= ~var49 && ~var47.field6586.field239 >= ~(var41.method3438(false) + -(var49 - var44 >> 9))) {
                                                      class60.method664(~class304.field4398.field4090 != ~var36.field4623.field4090, var47, (byte)-111);
                                                      var47.field11226 = class29.field458;
                                                   }

                                                   ++var45;
                                                }
                                             } else {
                                                ++var45;
                                             }
                                          } else {
                                             ++var45;
                                          }
                                       } while(class16.field293 > var45);
                                    }

                                    int var50 = class158.field2525;
                                    int[] var51 = class442.field6446;
                                    int var52 = 0;
                                    if (var4 || ~var50 < ~var52) {
                                       do {
                                          class457 var53 = class458.field6723[var51[var52]];
                                          if (var53 != null) {
                                             if (~class29.field458 != ~var53.field11226) {
                                                if (var41 != var53) {
                                                   if (!var53.field11222 && !var4) {
                                                      ++var52;
                                                   } else {
                                                      int var54 = var53.field4101 - (var53.method3438(false) - 1 << 8);
                                                      int var55 = var53.field4096 - (-1 + var53.method3438(false) << 8);
                                                      if (var43 <= var54 && var53.method3438(false) <= var41.method3438(false) + -(-var43 + var54 >> 9) && var44 <= var55 && ~var53.method3438(false) >= ~(-(-var44 + var55 >> 9) + var41.method3438(false))) {
                                                         class375.method2932(~class304.field4398.field4090 != ~var36.field4623.field4090, 31395, var53);
                                                         var53.field11226 = class29.field458;
                                                      }

                                                      ++var52;
                                                   }
                                                } else {
                                                   ++var52;
                                                }
                                             } else {
                                                ++var52;
                                             }
                                          } else {
                                             ++var52;
                                          }
                                       } while(~var50 < ~var52);
                                    }
                                 }

                                 if (class29.field458 == var41.field11226) {
                                    break label714;
                                 }

                                 class375.method2932(~class304.field4398.field4090 != ~var36.field4623.field4090, 31395, var41);
                                 var41.field11226 = class29.field458;
                              }

                              if (var36.field4623 instanceof class451) {
                                 class451 var56 = (class451)var36.field4623;
                                 if (var56.field6586 != null) {
                                    if ((var56.field6586.field239 & 1) == 0 && (511 & var56.field4101) == 0 && (511 & var56.field4096) == 0 || (var56.field6586.field239 & 1) == 1 && (511 & var56.field4101) == 256 && (var56.field4096 & 511) == 256) {
                                       int var57 = -(var56.field6586.field239 + -1 << 8) + var56.field4101;
                                       int var58 = -(var56.field6586.field239 + -1 << 8) + var56.field4096;
                                       int var59 = 0;
                                       if (var4 || class16.field293 > var59) {
                                          do {
                                             class272 var60 = (class272)class78.field1344.method1572((long)class577.field8316[var59], -16289);
                                             if (var60 != null) {
                                                class451 var61 = var60.field3851;
                                                if (~class29.field458 != ~var61.field11226) {
                                                   if (var56 != var61) {
                                                      if (!var61.field11222 && !var4) {
                                                         ++var59;
                                                      } else {
                                                         int var62 = -(var61.field6586.field239 + -1 << 8) + var61.field4101;
                                                         int var63 = var61.field4096 - (var61.field6586.field239 - 1 << 8);
                                                         if (~var62 <= ~var57 && ~var61.field6586.field239 >= ~(-(-var57 + var62 >> 9) + var56.field6586.field239) && var63 >= var58 && var61.field6586.field239 <= -(-var58 + var63 >> 9) + var56.field6586.field239) {
                                                            class60.method664(~class304.field4398.field4090 != ~var36.field4623.field4090, var61, (byte)-117);
                                                            var61.field11226 = class29.field458;
                                                         }

                                                         ++var59;
                                                      }
                                                   } else {
                                                      ++var59;
                                                   }
                                                } else {
                                                   ++var59;
                                                }
                                             } else {
                                                ++var59;
                                             }
                                          } while(class16.field293 > var59);
                                       }

                                       int var64 = class158.field2525;
                                       int[] var65 = class442.field6446;
                                       int var66 = 0;
                                       if (var4 || var66 < var64) {
                                          do {
                                             class457 var67 = class458.field6723[var65[var66]];
                                             if (var67 != null) {
                                                if (~class29.field458 != ~var67.field11226) {
                                                   if (!var67.field11222 && !var4) {
                                                      ++var66;
                                                   } else {
                                                      int var68 = var67.field4101 - (-1 + var67.method3438(false) << 8);
                                                      int var69 = var67.field4096 - (-1 + var67.method3438(false) << 8);
                                                      if (~var57 >= ~var68 && ~var67.method3438(false) >= ~(var56.field6586.field239 - (-var57 + var68 >> 9)) && var58 <= var69 && var67.method3438(false) <= -(-var58 + var69 >> 9) + var56.field6586.field239) {
                                                         class375.method2932(class304.field4398.field4090 != var36.field4623.field4090, 31395, var67);
                                                         var67.field11226 = class29.field458;
                                                      }

                                                      ++var66;
                                                   }
                                                } else {
                                                   ++var66;
                                                }
                                             } else {
                                                ++var66;
                                             }
                                          } while(var66 < var64);
                                       }
                                    }

                                    if (~class29.field458 == ~var56.field11226) {
                                       break label714;
                                    }

                                    class60.method664(class304.field4398.field4090 != var36.field4623.field4090, var56, (byte)-100);
                                    var56.field11226 = class29.field458;
                                 }
                              }

                              if (var36.field4623 instanceof class265) {
                                 int var70 = class347.field4939 + var39;
                                 int var71 = var40 - -class753.field10887;
                                 class490 var72 = (class490)class669.field9742.method1572((long)(var70 | var71 << 14 | var36.field4623.field4090 << 28), arg1 + -13241);
                                 if (var72 != null) {
                                    int var73 = 0;
                                    class756 var74 = (class756)var72.field7146.method2586((byte)-62);
                                    if (var4 || var74 != null) {
                                       do {
                                          class439 var75 = class408.field5993.method845((byte)108, var74.field10977);
                                          if (class85.field1410 && ~class304.field4398.field4090 == ~var36.field4623.field4090) {
                                             class576 var76 = ~class131.field2175 == 0 ? null : class559.field8143.method3265(11, class131.field2175);
                                             if (~(class585.field8461 & 1) != -1 && (var76 == null || var75.method3298(var76.field8296, class131.field2175, arg1 ^ 12224) != var76.field8296)) {
                                                class388.method3010((long)var73, -1, true, (long)var74.field10977, var40, false, arg1 + 2930, false, var39, class123.field1965 + field5675[8] + var75.field6353, 57, class560.field8149, class133.field2194);
                                                ++class32.field483;
                                             }
                                          }

                                          if (class304.field4398.field4090 == var36.field4623.field4090) {
                                             String[] var77 = var75.field6401;
                                             int var78 = 4;
                                             if (var4 || ~var78 <= -1) {
                                                do {
                                                   if (var77 != null && var77[var78] != null) {
                                                      byte var79 = 0;
                                                      if (~var78 == -1) {
                                                         var79 = 46;
                                                      }

                                                      int var80 = class245.field3528;
                                                      if (~var78 == -2) {
                                                         var79 = 16;
                                                      }

                                                      if (var78 == 2) {
                                                         var79 = 52;
                                                      }

                                                      if (var78 == 3) {
                                                         var79 = 3;
                                                      }

                                                      if (var78 == 4) {
                                                         var79 = 6;
                                                      }

                                                      if (~var75.field6352 == ~var78) {
                                                         var80 = var75.field6359;
                                                      }

                                                      if (~var75.field6332 == ~var78) {
                                                         var80 = var75.field6330;
                                                      }

                                                      class388.method3010((long)var73, -1, true, (long)var74.field10977, var40, false, -123, false, var39, field5675[10] + var75.field6353, var79, var80, var77[var78]);
                                                      ++class443.field6463;
                                                   }

                                                   --var78;
                                                } while(~var78 <= -1);
                                             }
                                          }

                                          ++class345.field4916;
                                          class388.method3010((long)var73, -1, true, (long)var74.field10977, var40, ~class304.field4398.field4090 != ~var36.field4623.field4090, -107, false, var39, field5675[10] + var75.field6353, 1007, class330.field4712, class100.field1621.method961(class385.field5684, true));
                                          ++var73;
                                          var74 = (class756)var72.field7146.method2584(arg1 ^ -3047);
                                       } while(var74 != null);
                                    }
                                 }
                              }

                              if (var36.field4623 instanceof class268) {
                                 class268 var81 = (class268)var36.field4623;
                                 class670 var82 = class634.field9256.method2559(var81.method591((byte)-90), arg1 + 3048);
                                 if (var82.field9805 != null) {
                                    var82 = var82.method4894(0, class616.field8951);
                                 }

                                 if (var82 != null) {
                                    if (class85.field1410 && class304.field4398.field4090 == var36.field4623.field4090) {
                                       class576 var83 = ~class131.field2175 != 0 ? class559.field8143.method3265(11, class131.field2175) : null;
                                       if ((class585.field8461 & 4) != 0 && (var83 == null || var82.method4909((byte)-71, var83.field8296, class131.field2175) != var83.field8296)) {
                                          class388.method3010((long)var81.hashCode(), -1, true, class53.method632(var40, var39, 19737, var81), var40, false, arg1 + 2924, false, var39, class123.field1965 + field5675[6] + var82.field9779, 45, class560.field8149, class133.field2194);
                                          ++class577.field8311;
                                       }
                                    }

                                    if (~class304.field4398.field4090 == ~var36.field4623.field4090) {
                                       String[] var84 = var82.field9748;
                                       if (var84 != null) {
                                          int var85 = 4;
                                          if (var4 || var85 >= 0) {
                                             do {
                                                if (var84[var85] != null) {
                                                   short var86 = 0;
                                                   int var87 = class245.field3528;
                                                   if (var85 == 0) {
                                                      var86 = 18;
                                                   }

                                                   if (~var85 == -2) {
                                                      var86 = 13;
                                                   }

                                                   if (var85 == 2) {
                                                      var86 = 11;
                                                   }

                                                   if (var85 == 3) {
                                                      var86 = 21;
                                                   }

                                                   if (var85 == 4) {
                                                      var86 = 1011;
                                                   }

                                                   if (~var82.field9765 == ~var85) {
                                                      var87 = var82.field9822;
                                                   }

                                                   if (~var82.field9789 == ~var85) {
                                                      var87 = var82.field9823;
                                                   }

                                                   ++class649.field9414;
                                                   class388.method3010((long)var81.hashCode(), -1, true, class53.method632(var40, var39, 19737, var81), var40, false, -98, false, var39, field5675[5] + var82.field9779, var86, var87, var84[var85]);
                                                }

                                                --var85;
                                             } while(var85 >= 0);
                                          }
                                       }

                                       class388.method3010((long)var81.hashCode(), -1, true, (long)var82.field9826, var40, ~class304.field4398.field4090 != ~var36.field4623.field4090, -115, false, var39, field5675[5] + var82.field9779, 1010, class330.field4712, class100.field1621.method961(class385.field5684, true));
                                       ++class318.field4598;
                                    }
                                 }
                              }
                           }
                        }

                        var36 = (class321)var35.method1400(false);
                        if (var36 == null) {
                           var10000 = class262.field3734;
                           if (!var4) {
                              break;
                           }
                        } else {
                           var10000 = class320.field4616;
                        }
                     }
                  }

                  if (var10000) {
                     class218.method1851(-65);
                  }

                  ++var30;
               }
            }
         }
      } catch (RuntimeException var89) {
         throw class608.method4462(var89, field5675[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5675[3] : field5675[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2984(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2985(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
