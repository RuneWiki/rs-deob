import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class735 {
   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "I"
   )
   public int field10739;
   @OriginalMember(
      owner = "client!dd",
      name = "d",
      descriptor = "I"
   )
   public int field10735;
   @OriginalMember(
      owner = "client!dd",
      name = "g",
      descriptor = "I"
   )
   public int field10741;
   @OriginalMember(
      owner = "client!dd",
      name = "i",
      descriptor = "I"
   )
   public int field10743;
   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10744 = new String[]{method5335(method5334("y\t\tn_")), method5335(method5334("y\t\to_")), method5335(method5334("s\u0018KA")), method5335(method5334("fC\t\u0003\n")), method5335(method5334("y\t\ti_")), method5335(method5334("y\t\tY\u0018N\u0019UD\u0019zE")), method5335(method5334("y\t\t\u0011\u001es\u0004S\u0013_")), method5335(method5334("y\t\tl_"))};
   @OriginalMember(
      owner = "client!dd",
      name = "h",
      descriptor = "I"
   )
   public static int field10737;
   @OriginalMember(
      owner = "client!dd",
      name = "b",
      descriptor = "I"
   )
   public static int field10738;
   @OriginalMember(
      owner = "client!dd",
      name = "c",
      descriptor = "I"
   )
   public static int field10740;
   @OriginalMember(
      owner = "client!dd",
      name = "e",
      descriptor = "I"
   )
   public static int field10742;
   @OriginalMember(
      owner = "client!dd",
      name = "f",
      descriptor = "[Lu;"
   )
   public static class80[] field10736;

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IIZIIII)V"
   )
   public static final void method5330(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         if (!arg2) {
            method5330(-110, 123, false, -114, -71, 50, 125);
         }

         label35: {
            if (~(-arg3 + arg5) > ~class265.field3451 || arg3 + arg5 > class663.field9442 || ~(arg6 - arg3) > ~class478.field6604 || ~(arg3 + arg6) < ~class313.field4171) {
               class222.method1693(arg4, arg5, arg3, 2, arg6, arg0, arg1);
               if (!client.field4273) {
                  break label35;
               }
            }

            class269.method2059(arg6, arg5, arg1, arg3, arg4, arg0, 579874817);
         }

         ++field10740;
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field10744[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10737;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10744[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IIZILbn;)V"
   )
   public static final void method5331(int arg0, int arg1, boolean arg2, int arg3, class471 arg4) {
      try {
         arg4.field6527.method4337(arg0, 1184007664);
         ++field10742;
         arg4.field6527.method4274(-1165420232, arg3);
         if (arg2) {
            method5331(-83, 73, true, -52, (class471)null);
         }

         arg4.field6527.method4284(arg1, -31429);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10744[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10744[3] : field10744[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(IILoha;IBI)V"
   )
   public static final void method5332(int arg0, int arg1, class775 arg2, int arg3, byte arg4, int arg5) {
      boolean var6 = client.field4273;

      try {
         ++field10738;
         if (~arg2.field11272 != 0 || arg2.field11291 != null) {
            int var7;
            int var8;
            label205: {
               var7 = 0;
               var8 = arg2.field11288 * class674.field9907.field8467.method5190((byte)-118) >> 8;
               if (~arg2.field11293 > ~arg1) {
                  var7 += -arg2.field11293 + arg1;
                  if (!var6) {
                     break label205;
                  }
               }

               if (arg2.field11258 > arg1) {
                  var7 += -arg1 + arg2.field11258;
               }
            }

            label200: {
               if (~arg5 < ~arg2.field11275) {
                  var7 += arg5 - arg2.field11275;
                  if (!var6) {
                     break label200;
                  }
               }

               if (arg2.field11263 > arg5) {
                  var7 += -arg5 + arg2.field11263;
               }
            }

            if (~arg2.field11266 != -1 && ~(var7 + -256) >= ~arg2.field11266 && class674.field9907.field8467.method5190((byte)-107) != 0 && ~arg2.field11260 == ~arg3) {
               var7 -= 256;
               if (~var7 > -1) {
                  var7 = 0;
               }

               int var9 = -arg2.field11277 + arg2.field11266;
               if (var9 < 0) {
                  var9 = arg2.field11266;
               }

               int var10 = var8;
               int var11 = -arg2.field11277 + var7;
               if (~var11 < -1 && ~var9 < -1) {
                  var10 = (-var11 + var9) * var8 / var9;
               }

               class278.field3709.method3060((byte)38);
               int var12 = 47 % ((arg4 - 17) / 49);
               int var13 = 8192;
               int var14 = (arg2.field11293 + arg2.field11258) / 2 + -arg1;
               int var15 = (arg2.field11275 + arg2.field11263) / 2 + -arg5;
               if (var14 != 0 || var15 != 0) {
                  int var16 = 16383 & -class749.field10899 - (int)(Math.atan2((double)var14, (double)var15) * 2607.5945876176133D) + -4096;
                  if (~var16 < -8193) {
                     var16 = -var16 + 16384;
                  }

                  int var17;
                  label180: {
                     if (~var7 < -1) {
                        if (~var7 <= -4097) {
                           var17 = 16384;
                           if (!var6) {
                              break label180;
                           }
                        }

                        var17 = 8192 - -(var7 * 8192 / 4096);
                        if (!var6) {
                           break label180;
                        }
                     }

                     var17 = 8192;
                  }

                  var13 = (-var17 + 16384 >> 1) + var16 * var17 / 8192;
               }

               label172: {
                  if (arg2.field11262 != null) {
                     arg2.field11262.method5637(var10);
                     arg2.field11262.method5617(var13);
                     if (!var6) {
                        break label172;
                     }
                  }

                  if (arg2.field11272 >= 0) {
                     label230: {
                        int var18 = ~arg2.field11265 == -257 && arg2.field11287 == 256 ? 256 : class404.method3068(false, arg2.field11265, arg2.field11287);
                        if (arg2.field11280) {
                           if (arg2.field11282 == null) {
                              arg2.field11282 = class36.method285(class154.field1993, arg2.field11272);
                           }

                           if (arg2.field11282 == null) {
                              break label230;
                           }

                           if (arg2.field11259 == null) {
                              arg2.field11259 = arg2.field11282.method278(new int[]{22050});
                           }

                           if (arg2.field11259 == null) {
                              break label230;
                           }

                           class783 var19 = class783.method5643(arg2.field11259, var18, var10 << 6, var13);
                           var19.method5618(-1);
                           class717.field10509.method2173(var19);
                           arg2.field11262 = var19;
                           if (!var6) {
                              break label230;
                           }
                        }

                        class729 var20 = class729.method5302(class74.field943, arg2.field11272, 0);
                        if (var20 != null) {
                           class98 var21 = var20.method5300().method904(class223.field2776);
                           class783 var22 = class783.method5643(var21, var18, var10 << 6, var13);
                           var22.method5618(-1);
                           class717.field10509.method2173(var22);
                           arg2.field11262 = var22;
                        }
                     }
                  }
               }

               if (arg2.field11267 != null) {
                  arg2.field11267.method5637(var10);
                  arg2.field11267.method5617(var13);
                  if (!arg2.field11267.method3610(536870911)) {
                     arg2.field11276 = null;
                     arg2.field11264 = null;
                     arg2.field11267 = null;
                  }
               } else {
                  if (arg2.field11291 != null && (arg2.field11294 -= arg0) <= 0) {
                     int var23 = arg2.field11265 == 256 && ~arg2.field11287 == -257 ? 256 : arg2.field11287 + (int)((double)(-arg2.field11287 + arg2.field11265) * Math.random());
                     if (arg2.field11268) {
                        if (arg2.field11264 == null) {
                           int var24 = (int)(Math.random() * (double)arg2.field11291.length);
                           arg2.field11264 = class36.method285(class154.field1993, arg2.field11291[var24]);
                        }

                        if (arg2.field11264 != null) {
                           if (arg2.field11276 == null) {
                              arg2.field11276 = arg2.field11264.method278(new int[]{22050});
                           }

                           if (arg2.field11276 != null) {
                              class783 var25 = class783.method5643(arg2.field11276, var23, var10 << 6, var13);
                              var25.method5618(0);
                              class717.field10509.method2173(var25);
                              arg2.field11294 = arg2.field11290 - -((int)(Math.random() * (double)(-arg2.field11290 + arg2.field11271)));
                              arg2.field11267 = var25;
                              return;
                           }
                        }

                        return;
                     }

                     int var26 = (int)(Math.random() * (double)arg2.field11291.length);
                     class729 var27 = class729.method5302(class74.field943, arg2.field11291[var26], 0);
                     if (var27 != null) {
                        class98 var28 = var27.method5300().method904(class223.field2776);
                        class783 var29 = class783.method5643(var28, var23, var10 << 6, var13);
                        var29.method5618(0);
                        class717.field10509.method2173(var29);
                        arg2.field11294 = arg2.field11290 + (int)((double)(arg2.field11271 - arg2.field11290) * Math.random());
                        arg2.field11267 = var29;
                        return;
                     }
                  }

               }
            } else {
               if (arg2.field11262 != null) {
                  class717.field10509.method2175(arg2.field11262);
                  arg2.field11282 = null;
                  arg2.field11262 = null;
                  arg2.field11259 = null;
               }

               if (arg2.field11267 != null) {
                  class717.field10509.method2175(arg2.field11267);
                  arg2.field11267 = null;
                  arg2.field11276 = null;
                  arg2.field11264 = null;
               }

            }
         }
      } catch (RuntimeException var31) {
         throw class534.method3846(var31, field10744[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10744[3] : field10744[2]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5333(byte arg0) {
      try {
         field10736 = null;
         int var1 = -21 % ((-20 - arg0) / 63);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10744[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class735(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10739 = arg3;
         this.field10735 = arg1;
         this.field10741 = arg0;
         this.field10743 = arg2;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field10744[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5334(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5335(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 45;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
