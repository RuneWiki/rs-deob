import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class405 extends class555 {
   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5719 = new String[]{method3079(method3078("YEiL\u0000\u0015")), method3079(method3078("F\u000f&L7")), method3079(method3078("YEiL\r\u0015")), method3079(method3078("STd\u000e")), method3079(method3078("YEiL\f\u0015")), method3079(method3078("YEiL\u000e\u0015")), method3079(method3078("YEiL\u000f\u0015")), method3079(method3078("YEiL\t\u0015")), method3079(method3078("YEiL\u000b\u0015")), method3079(method3078("YEiL\b\u0015")), method3079(method3078("YEiL\u0003\u0015")), method3079(method3078("\u001d\f6B")), method3079(method3078("YEiL\u0002\u0015"))};
   @OriginalMember(
      owner = "client!dda",
      name = "g",
      descriptor = "I"
   )
   public static int field5709;
   @OriginalMember(
      owner = "client!dda",
      name = "f",
      descriptor = "I"
   )
   public static int field5710;
   @OriginalMember(
      owner = "client!dda",
      name = "l",
      descriptor = "I"
   )
   public static int field5711;
   @OriginalMember(
      owner = "client!dda",
      name = "m",
      descriptor = "I"
   )
   public static int field5712;
   @OriginalMember(
      owner = "client!dda",
      name = "o",
      descriptor = "I"
   )
   public static int field5713;
   @OriginalMember(
      owner = "client!dda",
      name = "j",
      descriptor = "I"
   )
   public static int field5714;
   @OriginalMember(
      owner = "client!dda",
      name = "n",
      descriptor = "I"
   )
   public static int field5715;
   @OriginalMember(
      owner = "client!dda",
      name = "i",
      descriptor = "I"
   )
   public static int field5716;
   @OriginalMember(
      owner = "client!dda",
      name = "k",
      descriptor = "I"
   )
   public static int field5717;
   @OriginalMember(
      owner = "client!dda",
      name = "h",
      descriptor = "I"
   )
   public static int field5718;

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method635(int arg0) {
      try {
         if (arg0 < 124) {
            return 77;
         } else {
            ++field5712;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5719[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method3072(byte arg0) {
      try {
         ++field5717;
         return arg0 > -61 ? -43 : super.field7632;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5719[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method637(int arg0) {
      try {
         ++field5711;
         if (arg0 != -13712) {
            method3075(35, (class594)null);
         }

         if (super.field7633.method4418((byte)-123) == class339.field4866) {
            super.field7632 = 2;
         }

         if (~super.field7632 > -1 || ~super.field7632 < -3) {
            super.field7632 = this.method635(127);
         }

      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5719[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(Leb;BII)V"
   )
   public static final void method3073(class657 arg0, byte arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         if (class221.field2764) {
            class786 var5 = class111.field1407 == -1 ? null : class717.field10511.method5460(class111.field1407, 11);
            if (client.method2396(arg0).method3159(-1) && ~(class32.field377 & 32) != -1 && (var5 == null || arg0.method4761(var5.field11479, class111.field1407, -10889) != var5.field11479)) {
               class324.method2441(0L, false, 124, (long)(arg0.field9285 << 0 | arg0.field9220), class88.field1123 + field5719[11] + arg0.field9328, arg0.field9285, class460.field6309, arg0.field9345, arg0.field9220, true, 13, false, class740.field10780);
               ++class4.field27;
            }
         }

         ++field5714;
         int var6 = 9;
         String var7;
         if (var4) {
            var7 = class475.method3471(false, arg0, var6);
            if (var7 != null) {
               ++class315.field4215;
               class324.method2441((long)(var6 - -1), false, 121, (long)(arg0.field9220 | arg0.field9285 << 0), arg0.field9328, arg0.field9285, var7, arg0.field9345, arg0.field9220, true, 1011, false, class321.method2415(arg0, var6, -1));
            }

            --var6;
         }

         while(true) {
            String var10000;
            if (var6 < 5) {
               var7 = class237.method1780(67, arg0);
               var10000 = var7;
               if (!var4) {
                  if (var7 != null) {
                     class324.method2441(0L, false, 126, (long)(arg0.field9285 << 0 | arg0.field9220), arg0.field9328, arg0.field9285, var7, arg0.field9345, arg0.field9220, true, 6, false, arg0.field9248);
                     ++class387.field5420;
                  }

                  int var8 = -96 / ((75 - arg1) / 41);
                  int var9 = 4;
                  String var10;
                  if (var4) {
                     var10 = class475.method3471(false, arg0, var9);
                     if (var10 != null) {
                        ++class315.field4215;
                        class324.method2441((long)(var9 + 1), false, 121, (long)(arg0.field9220 | arg0.field9285 << 0), arg0.field9328, arg0.field9285, var10, arg0.field9345, arg0.field9220, true, 2, false, class321.method2415(arg0, var9, -1));
                     }

                     --var9;
                  }

                  while(true) {
                     boolean var13;
                     if (var9 < 0) {
                        var13 = client.method2396(arg0).method3164(-1);
                        if (!var4) {
                           if (var13) {
                              ++class353.field5042;
                              if (arg0.field9315 == null) {
                                 class324.method2441(0L, false, 125, (long)(arg0.field9220 | arg0.field9285 << 0), "", arg0.field9285, class551.field7531.method3980(class494.field6787, true), arg0.field9345, arg0.field9220, true, 50, false, -1);
                                 return;
                              }

                              class324.method2441(0L, false, 126, (long)(arg0.field9220 | arg0.field9285 << 0), "", arg0.field9285, arg0.field9315, arg0.field9345, arg0.field9220, true, 50, false, -1);
                              return;
                           }

                           return;
                        }
                     } else {
                        var13 = false;
                     }

                     var10 = class475.method3471(var13, arg0, var9);
                     if (var10 != null) {
                        ++class315.field4215;
                        class324.method2441((long)(var9 + 1), false, 121, (long)(arg0.field9220 | arg0.field9285 << 0), arg0.field9328, arg0.field9285, var10, arg0.field9345, arg0.field9220, true, 2, false, class321.method2415(arg0, var9, -1));
                     }

                     --var9;
                  }
               }
            } else {
               var7 = class475.method3471(false, arg0, var6);
               var10000 = var7;
            }

            if (var10000 != null) {
               ++class315.field4215;
               class324.method2441((long)(var6 - -1), false, 121, (long)(arg0.field9220 | arg0.field9285 << 0), arg0.field9328, arg0.field9285, var7, arg0.field9345, arg0.field9220, true, 1011, false, class321.method2415(arg0, var6, -1));
            }

            --var6;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field5719[10] + (arg0 != null ? field5719[1] : field5719[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method3074(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         class497.field6825 = arg2;
         class252.field3195 = arg1;
         if (arg4 == -835637152) {
            class215.field2669 = arg3;
            class345.field4942 = arg0;
            class12.field143 = arg5;
            ++field5718;
            class228.field2853 = arg6;
         }
      } catch (RuntimeException var8) {
         throw class534.method3846(var8, field5719[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ILwm;)Lvaa;"
   )
   public static final class498 method3075(int arg0, class594 arg1) {
      try {
         ++field5713;
         class101 var2 = class44.method375((byte)-49, arg1);
         int var3 = arg1.method4280(-19104);
         int var4 = arg1.method4280(-19104);
         if (arg0 != 0) {
            return null;
         } else {
            int var5 = arg1.method4280(-19104);
            int var6 = arg1.method4280(-19104);
            int var7 = arg1.method4280(arg0 + -19104);
            int var8 = arg1.method4280(-19104);
            return new class498(var2.field1297, var2.field1309, var2.field1301, var2.field1302, var2.field1299, var2.field1311, var2.field1303, var2.field1298, var2.field1306, var3, var4, var5, var6, var7, var8);
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field5719[2] + arg0 + ',' + (arg1 != null ? field5719[1] : field5719[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(Lfia;)V"
   )
   public class405(class605 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!dda",
      name = "<init>",
      descriptor = "(ILfia;)V"
   )
   public class405(int arg0, class605 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method633(int arg0, byte arg1) {
      try {
         if (arg1 < 36) {
            return -90;
         } else {
            ++field5715;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5719[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method3076(int arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5709;
         int var2 = arg0;
         if (var1 || class741.field10800 > arg0) {
            do {
               int var3 = class285.field3785[var2];
               class243 var4 = (class243)class335.field4808.method1839(96, (long)var3);
               if (var4 != null) {
                  class680 var5 = var4.field3043;
                  class271.method2081(var5.field9989.field5538, -512, var5);
               }

               ++var2;
            } while(class741.field10800 > var2);

         }
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5719[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "a",
      descriptor = "(ZIII)I"
   )
   public static final int method3077(boolean arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field5710;
         if (arg2 > -16) {
            return -1;
         } else {
            class784 var5 = class655.method4729(arg0, arg3, (byte)-102);
            if (var5 == null) {
               return 0;
            } else if (arg1 == -1) {
               return 0;
            } else {
               int var6 = 0;
               int var7 = 0;
               if (var4) {
                  if (arg1 == var5.field11463[var7]) {
                     var6 += var5.field11456[var7];
                  }

                  ++var7;
               }

               while(true) {
                  int var10000;
                  if (~var7 <= ~var5.field11456.length) {
                     var10000 = var6;
                     if (!var4) {
                        return var6;
                     }
                  } else {
                     var10000 = arg1;
                  }

                  if (var10000 == var5.field11463[var7]) {
                     var6 += var5.field11456[var7];
                  }

                  ++var7;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class534.method3846(var9, field5719[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method638(int arg0, byte arg1) {
      try {
         int var3 = 100 % ((arg1 - 12) / 47);
         ++field5716;
         super.field7632 = arg0;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5719[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3078(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3079(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
