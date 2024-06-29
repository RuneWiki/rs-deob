import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class147 {
   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2300 = new String[]{method1440(method1439("w \u0004]")), method1440(method1439("l:Fr&")), method1440(method1439("b{F\u001fs")), method1440(method1439("l:Fs&")), method1440(method1439("l:Fp&")), method1440(method1439("l:Fu&"))};
   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "I"
   )
   public static int field2296;
   @OriginalMember(
      owner = "client!uo",
      name = "d",
      descriptor = "I"
   )
   public static int field2297;
   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "I"
   )
   public static int field2299;
   @OriginalMember(
      owner = "client!uo",
      name = "c",
      descriptor = "Lpb;"
   )
   public static class142 field2298;

   @OriginalMember(
      owner = "client!uo",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method1435(int arg0) {
      try {
         ++field2297;
         if (!class211.field3020) {
            class411.field6028 = true;
            class126.field2033 += (12.0F - class126.field2033) / 2.0F;
            if (arg0 >= -25) {
               field2298 = null;
            }

            class211.field3020 = true;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2300[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(IIILha;II)V"
   )
   public static final void method1436(int arg0, int arg1, int arg2, class17 arg3, int arg4, int arg5) {
      boolean var6 = client.field10022;

      try {
         arg3.method150(arg1, arg2, arg1 + arg5, arg2 - -arg4);
         ++field2296;
         arg3.method223(arg2, arg5, 1, arg1, -16777216, arg4);
         if (~class484.field6932 <= -101) {
            int var8;
            int var9;
            label93: {
               float var7 = (float)class651.field9235 / (float)class651.field9225;
               var8 = arg5;
               var9 = arg4;
               if (!(var7 < 1.0F)) {
                  var8 = (int)((float)arg4 / var7);
                  if (!var6) {
                     break label93;
                  }
               }

               var9 = (int)((float)arg5 * var7);
            }

            int var25 = (-var9 + arg4) / 2 + arg2;
            int var24 = (-var8 + arg5) / 2 + arg1;
            if (class108.field1682 == null || ~arg5 != ~class108.field1682.method1350() || ~class108.field1682.method1354() != ~arg4) {
               class651.method4747(class651.field9220, class651.field9235 + class651.field9223, class651.field9225 + class651.field9220, class651.field9223, var24, var25, var24 - -var8, var25 + var9);
               class651.method4748(arg3);
               class108.field1682 = arg3.method159(var24, var25, var8, var9, false);
            }

            class108.field1682.method1451(var24, var25);
            int var10 = class200.field2878 * var8 / class651.field9225;
            int var11 = class140.field2241 * var9 / class651.field9235;
            int var12 = var24 - -(class566.field8043 * var8 / class651.field9225);
            int var13 = -(class313.field4708 * var9 / class651.field9235) + var9 + -var11 + var25;
            int var14 = -1996554240;
            if (class343.field5054 == class122.field1967) {
               var14 = -1996488705;
            }

            arg3.method226(var12, var13, var10, var11, var14, 1);
            if (arg0 > 64) {
               arg3.method257(var12, var13, var10, var11, var14, 0);
               if (class287.field4295 > 0) {
                  int var15;
                  label56: {
                     if (~class746.field10608 >= -51) {
                        var15 = class746.field10608 * 5;
                        if (!var6) {
                           break label56;
                        }
                     }

                     var15 = -(class746.field10608 * 5) + 500;
                  }

                  class270 var16 = (class270)class651.field9217.method2245((byte)-94);
                  if (var6 || var16 != null) {
                     do {
                        class541 var17 = class651.field9200.method1756(36, var16.field4134);
                        if (class669.method4853(-1, var17)) {
                           label105: {
                              if (class501.field7146 != var16.field4134) {
                                 if (class460.field6701 == -1 || class460.field6701 != var17.field7606) {
                                    break label105;
                                 }

                                 int var18 = var24 - -(var16.field4130 * var8 / class651.field9225);
                                 int var19 = (-var16.field4133 + class651.field9235) * var9 / class651.field9235 + var25;
                                 arg3.method223(var19 + -2, 4, 1, var18 - 2, 16776960 | var15 << 24, 4);
                                 if (!var6) {
                                    break label105;
                                 }
                              }

                              int var20 = var16.field4130 * var8 / class651.field9225 + var24;
                              int var21 = (-var16.field4133 + class651.field9235) * var9 / class651.field9235 + var25;
                              arg3.method223(var21 + -2, 4, 1, var20 + -2, 16776960 | var15 << 24, 4);
                           }
                        }

                        var16 = (class270)class651.field9217.method2239((byte)101);
                     } while(var16 != null);

                  }
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field2300[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field2300[2] : field2300[0]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I[SZ)[S"
   )
   public static final short[] method1437(int arg0, short[] arg1, boolean arg2) {
      try {
         if (arg2) {
            return null;
         } else {
            ++field2299;
            short[] var3 = new short[arg0];
            class474.method3637(arg1, 0, var3, 0, arg0);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field2300[5] + arg0 + ',' + (arg1 != null ? field2300[2] : field2300[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1438(int arg0) {
      try {
         field2298 = null;
         if (arg0 != 16776960) {
            method1438(64);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2300[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1439(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1440(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 104;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
