import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class485 {
   @OriginalMember(
      owner = "client!qg",
      name = "s",
      descriptor = "I"
   )
   public int field7040;
   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7061 = new String[]{method3668(method3667("+y\u0004u?")), method3668(method3667("+y\u0004s?")), method3668(method3667("+y\u0004p?")), method3668(method3667("!0\u0004\u001fj")), method3668(method3667("4kF]")), method3668(method3667("+y\u0004\r~4w^\u000f?")), method3668(method3667("+y\u0004Ex\tjXXy=6")), method3668(method3667("+y\u0004r?"))};
   @OriginalMember(
      owner = "client!qg",
      name = "u",
      descriptor = "I"
   )
   public static int field7045 = 1;
   @OriginalMember(
      owner = "client!qg",
      name = "r",
      descriptor = "Lum;"
   )
   public static class548 field7041 = new class548(14, 0);
   @OriginalMember(
      owner = "client!qg",
      name = "f",
      descriptor = "Lum;"
   )
   public static class548 field7046 = new class548(15, 4);
   @OriginalMember(
      owner = "client!qg",
      name = "v",
      descriptor = "Lum;"
   )
   public static class548 field7047 = new class548(16, -2);
   @OriginalMember(
      owner = "client!qg",
      name = "m",
      descriptor = "Lum;"
   )
   public static class548 field7048 = new class548(17, 0);
   @OriginalMember(
      owner = "client!qg",
      name = "o",
      descriptor = "Lum;"
   )
   public static class548 field7049 = new class548(19, -2);
   @OriginalMember(
      owner = "client!qg",
      name = "c",
      descriptor = "Lum;"
   )
   public static class548 field7050 = new class548(22, -2);
   @OriginalMember(
      owner = "client!qg",
      name = "j",
      descriptor = "Lum;"
   )
   public static class548 field7051 = new class548(23, 4);
   @OriginalMember(
      owner = "client!qg",
      name = "k",
      descriptor = "Lum;"
   )
   public static class548 field7052 = new class548(24, -1);
   @OriginalMember(
      owner = "client!qg",
      name = "n",
      descriptor = "Lum;"
   )
   public static class548 field7053 = new class548(26, 0);
   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "Lum;"
   )
   public static class548 field7054 = new class548(27, 0);
   @OriginalMember(
      owner = "client!qg",
      name = "g",
      descriptor = "Lum;"
   )
   public static class548 field7055 = new class548(28, -2);
   @OriginalMember(
      owner = "client!qg",
      name = "i",
      descriptor = "Lum;"
   )
   public static class548 field7056 = new class548(29, -2);
   @OriginalMember(
      owner = "client!qg",
      name = "q",
      descriptor = "Lum;"
   )
   public static class548 field7057 = new class548(30, -2);
   @OriginalMember(
      owner = "client!qg",
      name = "e",
      descriptor = "[Lum;"
   )
   private static class548[] field7058 = new class548[32];
   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "[S"
   )
   public static short[] field7059;
   @OriginalMember(
      owner = "client!qg",
      name = "d",
      descriptor = "D"
   )
   public static double field7060;
   @OriginalMember(
      owner = "client!qg",
      name = "h",
      descriptor = "I"
   )
   public static int field7039;
   @OriginalMember(
      owner = "client!qg",
      name = "l",
      descriptor = "I"
   )
   public static int field7042;
   @OriginalMember(
      owner = "client!qg",
      name = "p",
      descriptor = "I"
   )
   public static int field7043;
   @OriginalMember(
      owner = "client!qg",
      name = "t",
      descriptor = "I"
   )
   public static int field7044;

   static {
      class548[] var0 = class400.method3080(69);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         field7058[var0[var1].field7915] = var0[var1];
      }

      field7059 = new short[256];
      field7060 = -1.0D;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "b",
      descriptor = "(Z)V",
      line = 3
   )
   public static void method3663(boolean arg0) {
      try {
         field7059 = null;
         field7046 = null;
         field7041 = null;
         if (arg0) {
            field7053 = null;
         }

         field7057 = null;
         field7051 = null;
         field7052 = null;
         field7050 = null;
         field7048 = null;
         field7058 = null;
         field7047 = null;
         field7053 = null;
         field7056 = null;
         field7055 = null;
         field7049 = null;
         field7054 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7061[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Z)V",
      line = 27
   )
   public static final void method3664(boolean arg0) {
      boolean var1 = client.field4564;

      try {
         while(true) {
            if (~class346.field4923.method1717(class650.field9423, (byte)9) <= -16) {
               int var2 = class346.field4923.method1714((byte)-34, 15);
               if (var2 != 32767) {
                  boolean var3 = false;
                  class272 var4 = (class272)class78.field1344.method1572((long)var2, -16289);
                  if (var4 == null) {
                     class451 var5 = new class451();
                     var5.field11306 = var2;
                     var4 = new class272(var5);
                     class78.field1344.method1566(var4, 24742, (long)var2);
                     var3 = true;
                     class334.field4782[class492.field7163++] = var4;
                  }

                  class451 var6 = var4.field3851;
                  class577.field8316[class16.field293++] = var2;
                  var6.field11225 = class101.field1672;
                  if (var6.field6586 != null && var6.field6586.method113(-1)) {
                     class680.method4960((byte)-97, var6);
                  }

                  int var7 = class346.field4923.method1714((byte)-34, 5);
                  if (~var7 < -16) {
                     var7 -= 32;
                  }

                  int var8 = class346.field4923.method1714((byte)-34, 2);
                  int var9 = 4 + class346.field4923.method1714((byte)-34, 3) << 11 & 15683;
                  int var10 = class346.field4923.method1714((byte)-34, 1);
                  if (var10 == 1) {
                     class776.field11355[class310.field4476++] = var2;
                  }

                  var6.method3395(-9148, class373.field5547.method2060((byte)-109, class346.field4923.method1714((byte)-34, 14)));
                  int var11 = class346.field4923.method1714((byte)-34, 5);
                  if (~var11 < -16) {
                     var11 -= 32;
                  }

                  int var12 = class346.field4923.method1714((byte)-34, 1);
                  var6.method5579(0, var6.field6586.field239);
                  var6.field11248 = var6.field6586.field266 << 3;
                  if (var3) {
                     var6.method5577(-31308, var9, true);
                  }

                  var6.method3400(class304.field4398.field11313[0] + var7, class304.field4398.field11322[0] + var11, var8, -28132, var12 == 1, var6.method3438(arg0));
                  if (!var6.field6586.method113(-1)) {
                     continue;
                  }

                  class132.method1261(var6.field4090, var6.field11322[0], false, var6.field11313[0], var6, (class457)null, 0, (class670)null);
                  if (var1) {
                     break;
                  }

                  if (!var1) {
                     continue;
                  }
               }
            }

            ++field7042;
            break;
         }

         if (!arg0) {
            class346.field4923.method1719(-1537210170);
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field7061[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 114
   )
   public final String toString() {
      try {
         ++field7044;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7061[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Lvia;I)I",
      line = 124
   )
   public static final int method3665(class587 arg0, int arg1) {
      try {
         ++field7039;
         String var2 = class729.method5266(arg0, -44);
         int[] var3 = null;
         if (class567.method4229(arg0.field8485, 125)) {
            var3 = class408.field5993.method845((byte)85, (int)arg0.field8494).field6326;
         } else if (arg0.field8491 == -1) {
            if (!class433.method3259(-18, arg0.field8485)) {
               if (class237.method1942(1010, arg0.field8485)) {
                  Object var4 = null;
                  class670 var5;
                  if (~arg0.field8485 == -1011) {
                     var5 = class634.field9256.method2559((int)arg0.field8494, 0);
                  } else {
                     var5 = class634.field9256.method2559((int)(2147483647L & arg0.field8494 >>> 32), 0);
                  }

                  if (var5.field9805 != null) {
                     var5 = var5.method4894(0, class616.field8951);
                  }

                  if (var5 != null) {
                     var3 = var5.field9819;
                  }
               }
            } else {
               class272 var6 = (class272)class78.field1344.method1572((long)((int)arg0.field8494), -16289);
               if (var6 != null) {
                  class451 var7 = var6.field3851;
                  class15 var8 = var7.field6586;
                  if (var8.field230 != null) {
                     var8 = var8.method111(class616.field8951, -2690);
                  }

                  if (var8 != null) {
                     var3 = var8.field229;
                  }
               }
            }
         } else {
            var3 = class408.field5993.method845((byte)-51, arg0.field8491).field6326;
         }

         int var9 = -14 / ((arg1 - -24) / 61);
         if (var3 != null) {
            var2 = var2 + class502.method3767((byte)-118, var3);
         }

         int var10 = class511.field7461.method3345(var2, 3957, class207.field3090);
         if (arg0.field8479) {
            var10 += class601.field8679.method3002() + 4;
         }

         return var10;
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field7061[7] + (arg0 != null ? field7061[3] : field7061[4]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "<init>",
      descriptor = "(II)V",
      line = 196
   )
   public class485(int arg0, int arg1) {
      try {
         this.field7040 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field7061[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "a",
      descriptor = "(Ljava/lang/String;Lhw;IZ)Ltk;",
      line = 206
   )
   public static final class360 method3666(String arg0, class141 arg1, int arg2, boolean arg3) {
      boolean var4 = client.field4564;

      try {
         ++field7043;
         int var5 = arg1.method1329(-1, arg0);
         if (var5 == -1) {
            return new class360(0);
         } else {
            int[] var6 = arg1.method1334((byte)-92, var5);
            if (arg2 != -2) {
               method3666((String)null, (class141)null, -1, false);
            }

            class360 var7 = new class360(var6.length);
            int var8 = 0;
            int var9 = 0;
            class473 var10;
            int var11;
            int var12;
            int var13;
            class360 var10000;
            if (var4) {
               var10 = new class473(arg1.method1347((byte)125, var5, var6[var9++]));
               var11 = var10.method3567(31871);
               var12 = var10.method3565(true);
               var13 = var10.method3564((byte)-63);
               if (!arg3) {
                  if (~var13 != -2) {
                     var7.field5389[var8] = var11;
                     var7.field5394[var8] = var12;
                     ++var8;
                     if (var4) {
                        --var7.field5397;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  } else {
                     --var7.field5397;
                     var10000 = var7;
                  }
               } else {
                  var7.field5389[var8] = var11;
                  var7.field5394[var8] = var12;
                  ++var8;
                  if (var4) {
                     --var7.field5397;
                     var10000 = var7;
                  } else {
                     var10000 = var7;
                  }
               }
            } else {
               var10000 = var7;
            }

            do {
               while(~var10000.field5397 < ~var8) {
                  var10 = new class473(arg1.method1347((byte)125, var5, var6[var9++]));
                  var11 = var10.method3567(31871);
                  var12 = var10.method3565(true);
                  var13 = var10.method3564((byte)-63);
                  if (!arg3) {
                     if (~var13 != -2) {
                        var7.field5389[var8] = var11;
                        var7.field5394[var8] = var12;
                        ++var8;
                        if (var4) {
                           --var7.field5397;
                           var10000 = var7;
                        } else {
                           var10000 = var7;
                        }
                     } else {
                        --var7.field5397;
                        var10000 = var7;
                     }
                  } else {
                     var7.field5389[var8] = var11;
                     var7.field5394[var8] = var12;
                     ++var8;
                     if (var4) {
                        --var7.field5397;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  }
               }

               var10000 = var7;
            } while(var4);

            return var7;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field7061[2] + (arg0 != null ? field7061[3] : field7061[4]) + ',' + (arg1 != null ? field7061[3] : field7061[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3667(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3668(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 90;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
