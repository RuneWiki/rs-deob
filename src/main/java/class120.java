import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class120 extends class15 {
   @OriginalMember(
      owner = "client!gg",
      name = "B",
      descriptor = "I"
   )
   public int field1585 = -1;
   @OriginalMember(
      owner = "client!gg",
      name = "D",
      descriptor = "I"
   )
   public int field1579 = 0;
   @OriginalMember(
      owner = "client!gg",
      name = "K",
      descriptor = "I"
   )
   public int field1578 = -1;
   @OriginalMember(
      owner = "client!gg",
      name = "Q",
      descriptor = "I"
   )
   public int field1581 = 12800;
   @OriginalMember(
      owner = "client!gg",
      name = "A",
      descriptor = "I"
   )
   public int field1593 = 12800;
   @OriginalMember(
      owner = "client!gg",
      name = "w",
      descriptor = "Z"
   )
   public boolean field1596 = true;
   @OriginalMember(
      owner = "client!gg",
      name = "u",
      descriptor = "I"
   )
   public int field1599 = 0;
   @OriginalMember(
      owner = "client!gg",
      name = "E",
      descriptor = "I"
   )
   public int field1583;
   @OriginalMember(
      owner = "client!gg",
      name = "F",
      descriptor = "Ljava/lang/String;"
   )
   public String field1584;
   @OriginalMember(
      owner = "client!gg",
      name = "G",
      descriptor = "Ljava/lang/String;"
   )
   public String field1582;
   @OriginalMember(
      owner = "client!gg",
      name = "L",
      descriptor = "I"
   )
   public int field1589;
   @OriginalMember(
      owner = "client!gg",
      name = "t",
      descriptor = "Lrca;"
   )
   public class37 field1586;
   @OriginalMember(
      owner = "client!gg",
      name = "P",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1601 = new String[]{method1064(method1063("\u001e2*@n")), method1064(method1063("\u0002{**;")), method1064(method1063("\u0017 hh")), method1064(method1063("\u001e2*Bn")), method1064(method1063("\u001e2*En")), method1064(method1063("\u001e2*Gn")), method1064(method1063("\u001e2*An")), method1064(method1063("\u001e2*Fn")), method1064(method1063("\u001e2*Ln")), method1064(method1063("\u001e2*Hn")), method1064(method1063("\u001e2*Cn")), method1064(method1063("\u001e2*8/\u0017<p:n"))};
   @OriginalMember(
      owner = "client!gg",
      name = "N",
      descriptor = "I"
   )
   public static int field1587 = 1;
   @OriginalMember(
      owner = "client!gg",
      name = "J",
      descriptor = "I"
   )
   public static int field1591 = 1405;
   @OriginalMember(
      owner = "client!gg",
      name = "y",
      descriptor = "I"
   )
   public static int field1576;
   @OriginalMember(
      owner = "client!gg",
      name = "x",
      descriptor = "I"
   )
   public static int field1577;
   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "I"
   )
   public static int field1580;
   @OriginalMember(
      owner = "client!gg",
      name = "C",
      descriptor = "I"
   )
   public static int field1588;
   @OriginalMember(
      owner = "client!gg",
      name = "M",
      descriptor = "I"
   )
   public static int field1592;
   @OriginalMember(
      owner = "client!gg",
      name = "H",
      descriptor = "I"
   )
   public static int field1594;
   @OriginalMember(
      owner = "client!gg",
      name = "s",
      descriptor = "I"
   )
   public static int field1595;
   @OriginalMember(
      owner = "client!gg",
      name = "v",
      descriptor = "I"
   )
   public static int field1598;
   @OriginalMember(
      owner = "client!gg",
      name = "O",
      descriptor = "I"
   )
   public static int field1600;
   @OriginalMember(
      owner = "client!gg",
      name = "I",
      descriptor = "[Lnl;"
   )
   public static class713[] field1597;
   @OriginalMember(
      owner = "client!gg",
      name = "R",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1590;

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(IIZ)Z"
   )
   public final boolean method1054(int arg0, int arg1, boolean arg2) {
      boolean var4 = client.field1481;

      try {
         if (!arg2) {
            this.field1579 = -2;
         }

         ++field1588;
         class483 var5 = (class483)this.field1586.method288(0);
         if (var4) {
            if (var5.method3667(arg1, arg0, 26547)) {
               return true;
            }

            var5 = (class483)this.field1586.method290(17958);
         }

         while(true) {
            boolean var10000;
            if (var5 == null) {
               var10000 = false;
               if (!var4) {
                  return false;
               }
            } else {
               var10000 = var5.method3667(arg1, arg0, 26547);
            }

            if (var10000) {
               return true;
            }

            var5 = (class483)this.field1586.method290(17958);
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field1601[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method1055(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "([IIIBI)Z"
   )
   public final boolean method1056(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
      boolean var6 = client.field1481;

      try {
         ++field1576;
         int var7 = 84 / ((-89 - arg3) / 36);
         class483 var8 = (class483)this.field1586.method288(0);
         boolean var10000;
         if (var6) {
            var10000 = var8.method3668(arg4, arg2, arg1, 1);
         } else if (var8 == null) {
            var10000 = false;
            if (!var6) {
               return false;
            }
         } else {
            var10000 = var8.method3668(arg4, arg2, arg1, 1);
         }

         while(!var10000) {
            var8 = (class483)this.field1586.method290(17958);
            if (var8 == null) {
               var10000 = false;
               if (!var6) {
                  return false;
               }
            } else {
               var10000 = var8.method3668(arg4, arg2, arg1, 1);
            }
         }

         var8.method3669(arg4, arg0, 2, arg1);
         return true;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1601[0] + (arg0 != null ? field1601[1] : field1601[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(IBI[I)Z"
   )
   public final boolean method1057(int arg0, byte arg1, int arg2, int[] arg3) {
      boolean var5 = client.field1481;

      try {
         ++field1595;
         class483 var6 = (class483)this.field1586.method288(0);
         if (var5) {
            if (var6.method3667(arg2, arg0, 26547)) {
               var6.method3669(arg0, arg3, 2, arg2);
               return true;
            }

            var6 = (class483)this.field1586.method290(17958);
         }

         while(true) {
            byte var10000;
            if (var6 == null) {
               var10000 = arg1;
               if (!var5) {
                  if (arg1 <= 61) {
                     this.method1055((byte)2);
                  }

                  return false;
               }
            } else {
               var10000 = var6.method3667(arg2, arg0, 26547);
            }

            if (var10000 != 0) {
               var6.method3669(arg0, arg3, 2, arg2);
               return true;
            }

            var6 = (class483)this.field1586.method290(17958);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1601[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field1601[1] : field1601[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(ZILha;Lkv;Ljava/lang/String;Lda;)V"
   )
   public static final void method1058(boolean arg0, int arg1, class479 arg2, class19 arg3, String arg4, class447 arg5) {
      try {
         ++field1600;
         if (arg1 == -570417178) {
            boolean var6 = !class465.field6404 || class245.method1945(0);
            if (var6) {
               label103: {
                  if (!class465.field6404 || !var6) {
                     int var7 = arg3.method148((class648[])null, 0, 250, arg4);
                     int var8 = arg3.method147((byte)-116, 250, arg4, (class648[])null) * 13;
                     byte var9 = 4;
                     int var10 = 6 - -var9;
                     int var11 = var9 + 6;
                     arg2.method513(-var9 + var10, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
                     arg2.method462(-var9 + var10, var11 - var9, var9 + var9 + var7, var8 + var9 - -var9, -1, 0);
                     arg5.method3420(var10, 0, 11520, -1, var7, (class648[])null, arg4, 0, (int[])null, 1, 1, 0, -1, var11, (class87)null, var8);
                     class436.method3369(-var9 + var11, -93, var8 + var9 + var9, -var9 + var10, var7 + var9 - -var9);
                     if (!client.field1481) {
                        break label103;
                     }
                  }

                  class19 var23 = class593.field8748;
                  class447 var24 = arg2.method430(var23, class229.field2867, true);
                  int var12 = var23.method148((class648[])null, 0, 250, arg4);
                  int var13 = var23.method140(var23.field304, arg4, (byte)-43, (class648[])null, 250);
                  int var14 = class549.field8091.field819;
                  int var15 = var14 - -4;
                  int var16 = var15 * 2 + var12;
                  int var17 = var15 * 2 + var13;
                  if (var17 < class302.field4232) {
                     var17 = class302.field4232;
                  }

                  if (~class227.field2848 < ~var16) {
                     var16 = class227.field2848;
                  }

                  int var18 = class418.field5716.method1893((byte)-49, var16, class286.field3961) - -class417.field5703;
                  int var19 = class78.field1048.method4440(class627.field9254, arg1 ^ 570417253, var17) + class335.field4601;
                  if (class28.field416) {
                     var18 += class356.method2825(0);
                     var19 += class465.method3538(arg1 + 570390672);
                  }

                  arg2.method402(class214.field2720, false).method2409(class686.field10106.field819 + var18, var19 - -class686.field10106.field820, -(class686.field10106.field819 * 2) + var16, -(class686.field10106.field820 * 2) + var17, 1, 0, 0);
                  arg2.method402(class686.field10106, true).method4760(var18, var19);
                  class686.field10106.method580();
                  arg2.method402(class686.field10106, true).method4760(-var14 + var16 + var18, var19);
                  class686.field10106.method588();
                  arg2.method402(class686.field10106, true).method4760(var18 - -var16 + -var14, var17 - var14 + var19);
                  class686.field10106.method580();
                  arg2.method402(class686.field10106, true).method4760(var18, var17 + var19 - var14);
                  class686.field10106.method588();
                  arg2.method402(class549.field8091, true).method4762(var18, var19 - -class686.field10106.field820, var14, -(class686.field10106.field820 * 2) + var17);
                  class549.field8091.method579();
                  arg2.method402(class549.field8091, true).method4762(class686.field10106.field819 + var18, var19, var16 - class686.field10106.field819 * 2, var14);
                  class549.field8091.method579();
                  arg2.method402(class549.field8091, true).method4762(-var14 + var18 + var16, class686.field10106.field820 + var19, var14, -(class686.field10106.field820 * 2) + var17);
                  class549.field8091.method579();
                  arg2.method402(class549.field8091, true).method4762(class686.field10106.field819 + var18, var17 + var19 + -var14, var16 - class686.field10106.field819 * 2, var14);
                  class549.field8091.method579();
                  var24.method3420(var15 + var18, 0, arg1 + 570428698, -16777216 | class137.field1744, -(var15 * 2) + var16, (class648[])null, arg4, 0, (int[])null, 1, 1, 0, -1, var15 + var19, (class87)null, -(var15 * 2) + var17);
                  class436.method3369(var19, -112, var17, var18, var16);
               }

               if (arg0) {
                  try {
                     if (class28.field416) {
                        class341.method2725(125);
                     } else {
                        arg2.method3642((byte)77);
                     }
                  } catch (class221 var21) {
                  }
               }
            }
         }
      } catch (RuntimeException var22) {
         throw class93.method866(var22, field1601[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1601[1] : field1601[2]) + ',' + (arg3 != null ? field1601[1] : field1601[2]) + ',' + (arg4 != null ? field1601[1] : field1601[2]) + ',' + (arg5 != null ? field1601[1] : field1601[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "([IIZI)Z"
   )
   public final boolean method1059(int[] arg0, int arg1, boolean arg2, int arg3) {
      boolean var5 = client.field1481;

      try {
         ++field1598;
         class483 var6 = (class483)this.field1586.method288(0);
         if (var5) {
            if (var6.method3671(arg1, 22307, arg3)) {
               var6.method3670(arg3, (byte)-26, arg0, arg1);
               return true;
            }

            var6 = (class483)this.field1586.method290(17958);
         }

         while(true) {
            boolean var10000;
            if (var6 == null) {
               var10000 = arg2;
               if (!var5) {
                  if (!arg2) {
                     this.field1593 = 100;
                  }

                  return false;
               }
            } else {
               var10000 = var6.method3671(arg1, 22307, arg3);
            }

            if (var10000) {
               var6.method3670(arg3, (byte)-26, arg0, arg1);
               return true;
            }

            var6 = (class483)this.field1586.method290(17958);
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field1601[7] + (arg0 != null ? field1601[1] : field1601[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method1060(int arg0) {
      try {
         ++field1594;
         if (arg0 != -3929) {
            field1580 = -108;
         }

         class577.method4324((byte)-123, 12);
         class620.method4583((byte)-128);
         System.gc();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1601[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1061(boolean arg0) {
      try {
         field1597 = null;
         field1590 = null;
         if (arg0) {
            method1062(-41, (byte)3, -55, 4, -70, (class258)null);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1601[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "<init>",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V"
   )
   public class120(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
      try {
         this.field1583 = arg0;
         this.field1596 = arg5;
         this.field1578 = arg4;
         this.field1584 = arg1;
         this.field1582 = arg2;
         this.field1589 = arg3;
         this.field1585 = arg6;
         if (~this.field1585 == -256) {
            this.field1585 = 0;
         }

         this.field1586 = new class37();
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field1601[11] + arg0 + ',' + (arg1 != null ? field1601[1] : field1601[2]) + ',' + (arg2 != null ? field1601[1] : field1601[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "a",
      descriptor = "(IBIIILdga;)V"
   )
   public static final void method1062(int arg0, byte arg1, int arg2, int arg3, int arg4, class258 arg5) {
      boolean var6 = client.field1481;

      try {
         ++field1592;
         if (arg5.field3286 != -1 || arg5.field3278 != null) {
            int var7;
            int var8;
            label214: {
               var7 = 0;
               var8 = arg5.field3274 * class757.field11093.field11006.method3351(arg1 + -18027) >> 8;
               if (~arg2 >= ~arg5.field3264) {
                  if (arg2 >= arg5.field3266) {
                     break label214;
                  }

                  var7 += -arg2 + arg5.field3266;
                  if (!var6) {
                     break label214;
                  }
               }

               var7 += -arg5.field3264 + arg2;
            }

            label207: {
               if (~arg5.field3271 <= ~arg0) {
                  if (~arg0 <= ~arg5.field3261) {
                     break label207;
                  }

                  var7 += -arg0 + arg5.field3261;
                  if (!var6) {
                     break label207;
                  }
               }

               var7 += -arg5.field3271 + arg0;
            }

            if (arg5.field3277 != 0 && ~(var7 + -256) >= ~arg5.field3277 && class757.field11093.field11006.method3351(-18033) != 0 && ~arg5.field3285 == ~arg4) {
               var7 -= 256;
               if (var7 < 0) {
                  var7 = 0;
               }

               int var9 = arg5.field3277 - arg5.field3276;
               if (var9 < 0) {
                  var9 = arg5.field3277;
               }

               int var10 = var8;
               int var11 = -arg5.field3276 + var7;
               if (~var11 < -1 && ~var9 < -1) {
                  var10 = (var9 - var11) * var8 / var9;
               }

               if (arg1 != -6) {
                  method1062(-51, (byte)93, 16, -55, -95, (class258)null);
               }

               class204.field2593.method78(0);
               int var12 = 8192;
               int var13 = (arg5.field3266 + arg5.field3264) / 2 + -arg2;
               int var14 = (arg5.field3271 - -arg5.field3261) / 2 + -arg0;
               if (var13 != 0 || var14 != 0) {
                  int var15 = -4096 + -class242.field3054 + -((int)(Math.atan2((double)var13, (double)var14) * 2607.5945876176133D)) & 16383;
                  if (var15 > 8192) {
                     var15 = -var15 + 16384;
                  }

                  int var16;
                  label183: {
                     if (var7 > 0) {
                        if (var7 < 4096) {
                           var16 = var7 * 8192 / 4096 + 8192;
                           if (!var6) {
                              break label183;
                           }
                        }

                        var16 = 16384;
                        if (!var6) {
                           break label183;
                        }
                     }

                     var16 = 8192;
                  }

                  var12 = var15 * var16 / 8192 - -(-var16 + 16384 >> 1);
               }

               label175: {
                  if (arg5.field3280 == null) {
                     if (arg5.field3286 < 0) {
                        break label175;
                     }

                     int var17 = arg5.field3272 == 256 && ~arg5.field3279 == -257 ? 256 : class731.method5284(-88, arg5.field3279, arg5.field3272);
                     if (arg5.field3269) {
                        if (arg5.field3290 == null) {
                           arg5.field3290 = class672.method4915(class392.field5431, arg5.field3286);
                        }

                        if (arg5.field3290 == null) {
                           break label175;
                        }

                        if (arg5.field3255 == null) {
                           arg5.field3255 = arg5.field3290.method4913(new int[]{22050});
                        }

                        if (arg5.field3255 == null) {
                           break label175;
                        }

                        class251 var18 = class251.method2000(arg5.field3255, var17, var10 << 6, var12);
                        var18.method2008(-1);
                        class674.field9978.method2839(var18);
                        arg5.field3280 = var18;
                        if (!var6) {
                           break label175;
                        }
                     }

                     class525 var19 = class525.method3928(class604.field8873, arg5.field3286, 0);
                     if (var19 == null) {
                        break label175;
                     }

                     class521 var20 = var19.method3930().method3910(class32.field476);
                     class251 var21 = class251.method2000(var20, var17, var10 << 6, var12);
                     var21.method2008(-1);
                     class674.field9978.method2839(var21);
                     arg5.field3280 = var21;
                     if (!var6) {
                        break label175;
                     }
                  }

                  arg5.field3280.method2003(var10);
                  arg5.field3280.method2024(var12);
               }

               if (arg5.field3262 == null) {
                  if (arg5.field3278 != null && (arg5.field3265 -= arg3) <= 0) {
                     int var22 = arg5.field3272 == 256 && arg5.field3279 == 256 ? 256 : arg5.field3279 + (int)(Math.random() * (double)(-arg5.field3279 + arg5.field3272));
                     if (arg5.field3263) {
                        if (arg5.field3283 == null) {
                           int var23 = (int)((double)arg5.field3278.length * Math.random());
                           arg5.field3283 = class672.method4915(class392.field5431, arg5.field3278[var23]);
                        }

                        if (arg5.field3283 != null) {
                           if (arg5.field3288 == null) {
                              arg5.field3288 = arg5.field3283.method4913(new int[]{22050});
                           }

                           if (arg5.field3288 != null) {
                              class251 var24 = class251.method2000(arg5.field3288, var22, var10 << 6, var12);
                              var24.method2008(0);
                              class674.field9978.method2839(var24);
                              arg5.field3265 = (int)(Math.random() * (double)(arg5.field3273 - arg5.field3275)) + arg5.field3275;
                              arg5.field3262 = var24;
                              return;
                           }
                        }

                        return;
                     }

                     int var25 = (int)((double)arg5.field3278.length * Math.random());
                     class525 var26 = class525.method3928(class604.field8873, arg5.field3278[var25], 0);
                     if (var26 != null) {
                        class521 var27 = var26.method3930().method3910(class32.field476);
                        class251 var28 = class251.method2000(var27, var22, var10 << 6, var12);
                        var28.method2008(0);
                        class674.field9978.method2839(var28);
                        arg5.field3265 = arg5.field3275 - -((int)((double)(-arg5.field3275 + arg5.field3273) * Math.random()));
                        arg5.field3262 = var28;
                        return;
                     }
                  }
               } else {
                  arg5.field3262.method2003(var10);
                  arg5.field3262.method2024(var12);
                  if (arg5.field3262.method4926(0)) {
                     return;
                  }

                  arg5.field3288 = null;
                  arg5.field3262 = null;
                  arg5.field3283 = null;
               }

            } else {
               if (arg5.field3280 != null) {
                  class674.field9978.method2844(arg5.field3280);
                  arg5.field3280 = null;
                  arg5.field3255 = null;
                  arg5.field3290 = null;
               }

               if (arg5.field3262 != null) {
                  class674.field9978.method2844(arg5.field3262);
                  arg5.field3262 = null;
                  arg5.field3288 = null;
                  arg5.field3283 = null;
               }

            }
         }
      } catch (RuntimeException var30) {
         throw class93.method866(var30, field1601[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field1601[1] : field1601[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1063(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1064(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
