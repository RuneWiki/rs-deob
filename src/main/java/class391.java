import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class391 {
   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5423 = new String[]{method3095(method3094("\u0016lq\u00050")), method3095(method3094("\u00077qje")), method3095(method3094("\u0012l3(")), method3095(method3094("\u0016lq\u00000")), method3095(method3094("\u0016lq\u00060")), method3095(method3094("\u0016lq\u00070")), method3095(method3094("\u0016lq\u00010"))};
   @OriginalMember(
      owner = "client!ju",
      name = "d",
      descriptor = "Lse;"
   )
   public static class6 field5412 = new class6(13, 8);
   @OriginalMember(
      owner = "client!ju",
      name = "i",
      descriptor = "I"
   )
   public static int field5419 = 0;
   @OriginalMember(
      owner = "client!ju",
      name = "j",
      descriptor = "I"
   )
   public static int field5411;
   @OriginalMember(
      owner = "client!ju",
      name = "h",
      descriptor = "I"
   )
   public static int field5413;
   @OriginalMember(
      owner = "client!ju",
      name = "g",
      descriptor = "I"
   )
   public int field5414;
   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "I"
   )
   public int field5415;
   @OriginalMember(
      owner = "client!ju",
      name = "f",
      descriptor = "I"
   )
   public static int field5416;
   @OriginalMember(
      owner = "client!ju",
      name = "k",
      descriptor = "I"
   )
   public static int field5417;
   @OriginalMember(
      owner = "client!ju",
      name = "c",
      descriptor = "I"
   )
   public int field5418;
   @OriginalMember(
      owner = "client!ju",
      name = "e",
      descriptor = "I"
   )
   public int field5420;
   @OriginalMember(
      owner = "client!ju",
      name = "b",
      descriptor = "I"
   )
   public static int field5421;
   @OriginalMember(
      owner = "client!ju",
      name = "l",
      descriptor = "I"
   )
   public static int field5422;

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3089(int arg0) {
      try {
         field5412 = null;
         if (arg0 != -19127) {
            field5416 = -15;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5423[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3090(int arg0, int arg1) {
      try {
         ++field5411;
         int var2 = 76 % ((arg0 - -27) / 58);
         return arg1 == 11 || ~arg1 == -13 || arg1 == 13;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5423[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(Lha;IZLkka;Lija;I)Z"
   )
   public static final boolean method3091(class479 arg0, int arg1, boolean arg2, class519 arg3, class160 arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field5413;
         int var7 = Integer.MAX_VALUE;
         int var8 = Integer.MIN_VALUE;
         int var9 = Integer.MAX_VALUE;
         int var10 = Integer.MIN_VALUE;
         if (arg3.field7271 != null) {
            var10 = -((arg3.field7253 - -arg4.field2048 - class326.field4488) * (-class326.field4506 + class326.field4494) / (-class326.field4488 + class326.field4487)) + class326.field4494;
            var7 = class326.field4498 - -((arg3.field7255 - -arg4.field2046 - class326.field4500) * (-class326.field4498 + class326.field4501) / (-class326.field4500 + class326.field4507));
            var8 = (-class326.field4500 + arg3.field7277 - -arg4.field2046) * (-class326.field4498 + class326.field4501) / (-class326.field4500 + class326.field4507) + class326.field4498;
            var9 = -((arg3.field7258 + arg4.field2048 + -class326.field4488) * (-class326.field4506 + class326.field4494) / (-class326.field4488 + class326.field4487)) + class326.field4494;
         }

         class648 var11 = null;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         if (~arg3.field7279 != 0) {
            if (arg4.field2047 && ~arg3.field7283 != 0) {
               var11 = arg3.method3897(-26816, arg0, true);
            } else {
               var11 = arg3.method3897(-26816, arg0, false);
            }

            if (var11 != null) {
               var12 = arg4.field2045 - (var11.method2406() - -1 >> 1);
               var13 = arg4.field2045 - -(var11.method2406() + 1 >> 1);
               if (~var12 > ~var7) {
                  var7 = var12;
               }

               if (var13 > var8) {
                  var8 = var13;
               }

               var14 = arg4.field2049 - (1 + var11.method2396() >> 1);
               if (var14 < var9) {
                  var9 = var14;
               }

               var15 = arg4.field2049 - -(1 + var11.method2396() >> 1);
               if (var15 > var10) {
                  var10 = var15;
               }
            }
         }

         class394 var16 = null;
         int var17 = 0;
         int var18 = 0;
         int var19 = 0;
         int var20 = 0;
         int var21 = 0;
         if (!arg2) {
            return false;
         } else {
            int var22 = 0;
            int var23 = 0;
            int var24 = 0;
            if (arg3.field7289 != null) {
               var16 = class6.method48(arg3.field7282, 0);
               if (var16 != null) {
                  label165: {
                     var17 = class13.field253.method149(arg3.field7289, (class648[])null, class616.field9070, (int[])null, -126);
                     var18 = (-class326.field4498 + class326.field4501) * arg3.field7260 / (-class326.field4500 + class326.field4507) + arg4.field2045;
                     var19 = -((class326.field4494 - class326.field4506) * arg3.field7285 / (-class326.field4488 + class326.field4487)) + arg4.field2049;
                     if (var11 != null) {
                        var19 -= (var11.method2396() >> 1) - -(var16.method3107() * var17);
                        if (!var6) {
                           break label165;
                        }
                     }

                     var19 -= var16.method3108() * var17 / 2;
                  }

                  int var25 = 0;
                  if (var6 || ~var25 > ~var17) {
                     do {
                        String var26 = class616.field9070[var25];
                        if (var25 < var17 + -1) {
                           var26 = var26.substring(0, -4 + var26.length());
                        }

                        int var27 = var16.method3106(var26);
                        if (var27 > var20) {
                           var20 = var27;
                        }

                        ++var25;
                     } while(~var25 > ~var17);
                  }

                  var21 = -(var20 / 2) + var18 + arg1;
                  var22 = var20 / 2 + (var18 - -arg1);
                  if (var21 < var7) {
                     var7 = var21;
                  }

                  if (~var22 < ~var8) {
                     var8 = var22;
                  }

                  var23 = var19 - -arg5;
                  if (var23 < var9) {
                     var9 = var23;
                  }

                  var24 = var17 * var16.method3107() + arg5 + var19;
                  if (~var10 > ~var24) {
                     var10 = var24;
                  }
               }
            }

            if (~var8 <= ~class326.field4498 && var7 <= class326.field4501 && ~var10 <= ~class326.field4506 && ~class326.field4494 <= ~var9) {
               class326.method2559(arg0, arg4, arg3);
               if (var11 != null) {
                  if (class768.field11204 > 0 && (class204.field2600 != -1 && class204.field2600 == arg4.field2052 || class16.field282 != -1 && class16.field282 == arg3.field7280)) {
                     int var28;
                     label136: {
                        if (class495.field6905 <= 50) {
                           var28 = class495.field6905 * 2;
                           if (!var6) {
                              break label136;
                           }
                        }

                        var28 = (-class495.field6905 + 100) * 2;
                     }

                     int var29 = 16776960 | var28 << 24;
                     arg0.method3639(arg4.field2045, 115, var29, 7 + var11.method2394() / 2, arg4.field2049);
                     arg0.method3639(arg4.field2045, 113, var29, var11.method2394() / 2 - -5, arg4.field2049);
                     arg0.method3639(arg4.field2045, 56, var29, 3 + var11.method2394() / 2, arg4.field2049);
                     arg0.method3639(arg4.field2045, 69, var29, var11.method2394() / 2 - -1, arg4.field2049);
                     arg0.method3639(arg4.field2045, 97, var29, var11.method2394() / 2, arg4.field2049);
                  }

                  var11.method4760(arg4.field2045 - (var11.method2406() >> 1), arg4.field2049 + -(var11.method2396() >> 1));
               }

               if (arg3.field7289 != null && var16 != null) {
                  class742.method5385((byte)-78, var20, arg0, arg4, arg3, var18, var17, var19, var16);
               }

               if (arg3.field7279 != -1 || arg3.field7289 != null) {
                  class387 var30 = new class387(arg4);
                  var30.field5352 = var14;
                  var30.field5354 = var22;
                  var30.field5353 = var23;
                  var30.field5361 = var12;
                  var30.field5351 = var24;
                  var30.field5349 = var13;
                  var30.field5358 = var15;
                  var30.field5364 = var21;
                  class138.field1748.method279(false, var30);
               }

               return false;
            } else {
               return true;
            }
         }
      } catch (RuntimeException var32) {
         throw class93.method866(var32, field5423[0] + (arg0 != null ? field5423[1] : field5423[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5423[1] : field5423[2]) + ',' + (arg4 != null ? field5423[1] : field5423[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(IIZI[Loca;I)V"
   )
   public static final void method3092(int arg0, int arg1, boolean arg2, int arg3, class642[] arg4, int arg5) {
      boolean var6 = client.field1481;

      try {
         ++field5417;
         if (arg0 != -28853) {
            field5412 = null;
         }

         int var7 = 0;
         if (var6 || var7 < arg4.length) {
            do {
               class642 var8 = arg4[var7];
               if (var8 != null && ~var8.field9589 == ~arg5) {
                  class259.method2087(arg3, arg2, arg1, var8, (byte)-127);
                  class693.method5054(arg1, var8, arg3, -5);
                  if (var8.field9556 > -var8.field9629 + var8.field9600) {
                     var8.field9556 = -var8.field9629 + var8.field9600;
                  }

                  if (~var8.field9556 > -1) {
                     var8.field9556 = 0;
                  }

                  if (~(-var8.field9572 + var8.field9502) > ~var8.field9584) {
                     var8.field9584 = -var8.field9572 + var8.field9502;
                  }

                  if (var8.field9584 < 0) {
                     var8.field9584 = 0;
                  }

                  if (~var8.field9493 == -1) {
                     class591.method4406(var8, arg2, 5000);
                  }
               }

               ++var7;
            } while(var7 < arg4.length);

         }
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field5423[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field5423[1] : field5423[2]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public static final boolean method3093(int arg0, boolean arg1) {
      try {
         if (arg1) {
            return false;
         } else {
            ++field5421;
            return arg0 == 58 || ~arg0 == -22 || ~arg0 == -16 || arg0 == 10 || arg0 == 30 || ~arg0 == -12 || arg0 == 13;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field5423[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3094(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ju",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3095(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 124;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
