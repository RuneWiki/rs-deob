import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class276 {
   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "Lsia;"
   )
   private class407 field3520 = new class407(64);
   @OriginalMember(
      owner = "client!te",
      name = "i",
      descriptor = "Lww;"
   )
   public class339 field3528;
   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "Lww;"
   )
   private class339 field3526;
   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3529 = new String[]{method2184(method2183("yg\no_ckPm\u001e")), method2184(method2183("v,\n}K")), method2184(method2183("cwH?")), method2184(method2183("yg\n\u0011\u001e")), method2184(method2183("yg\n\u0014\u001e")), method2184(method2183("yg\n\u0010\u001e")), method2184(method2183("yg\n\u0012\u001e")), method2184(method2183("yg\n\u0015\u001e")), method2184(method2183("yg\n\u0016\u001e")), method2184(method2183("yg\n\u001b\u001e")), method2184(method2183("yg\n\u0017\u001e"))};
   @OriginalMember(
      owner = "client!te",
      name = "d",
      descriptor = "I"
   )
   public static int field3524 = 0;
   @OriginalMember(
      owner = "client!te",
      name = "k",
      descriptor = "I"
   )
   public static int field3517;
   @OriginalMember(
      owner = "client!te",
      name = "h",
      descriptor = "I"
   )
   public static int field3518;
   @OriginalMember(
      owner = "client!te",
      name = "m",
      descriptor = "I"
   )
   public static int field3519;
   @OriginalMember(
      owner = "client!te",
      name = "j",
      descriptor = "I"
   )
   public static int field3521;
   @OriginalMember(
      owner = "client!te",
      name = "g",
      descriptor = "I"
   )
   public static int field3522;
   @OriginalMember(
      owner = "client!te",
      name = "l",
      descriptor = "I"
   )
   public static int field3523;
   @OriginalMember(
      owner = "client!te",
      name = "f",
      descriptor = "I"
   )
   public static int field3525;
   @OriginalMember(
      owner = "client!te",
      name = "e",
      descriptor = "[[Z"
   )
   public static boolean[][] field3516;
   @OriginalMember(
      owner = "client!te",
      name = "c",
      descriptor = "[[[I"
   )
   public static int[][][] field3527;

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2175(int arg0) {
      try {
         ++field3521;
         class407 var2 = this.field3520;
         synchronized(this.field3520) {
            this.field3520.method3201((byte)113);
            if (arg0 != 2) {
               this.field3528 = null;
            }

         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3529[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(II)V"
   )
   public final void method2176(int arg0, int arg1) {
      try {
         class407 var3 = this.field3520;
         synchronized(this.field3520) {
            this.field3520.method3197(5, arg0);
         }

         ++field3523;
         int var4 = -87 / ((arg1 - 51) / 59);
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3529[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2177(int arg0) {
      try {
         class407 var2 = this.field3520;
         synchronized(this.field3520) {
            this.field3520.method3187(-23825);
         }

         if (arg0 == 3) {
            ++field3517;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3529[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method2178(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field3522;
         if (arg0 == arg3) {
            class464.method3529(arg5, arg4, arg0, arg1, 0);
         } else {
            label40: {
               if (-arg0 + arg4 < class415.field5689 || ~class282.field3921 > ~(arg0 + arg4) || -arg3 + arg1 < class577.field8561 || ~class586.field8647 > ~(arg1 + arg3)) {
                  class105.method936(arg4, arg2 ^ 18688, arg3, arg0, arg5, arg1);
                  if (!client.field1481) {
                     break label40;
                  }
               }

               class227.method1811(arg5, false, arg4, arg1, arg0, arg3);
            }

            if (arg2 != -18737) {
               field3524 = -69;
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field3529[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2179(int arg0) {
      try {
         field3516 = null;
         field3527 = null;
         if (arg0 != 0) {
            method2179(-74);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3529[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(BLjava/lang/String;I)V"
   )
   public static final void method2180(byte arg0, String arg1, int arg2) {
      try {
         ++field3519;
         class487 var3 = class2.method12((long)arg2, 2, (byte)43);
         var3.method3694(-21792);
         var3.field6800 = arg1;
         int var4 = -113 % ((arg0 - 18) / 34);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3529[4] + arg0 + ',' + (arg1 != null ? field3529[1] : field3529[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2181(int arg0, int arg1, int arg2) {
      try {
         int var3 = -98 / ((-18 - arg2) / 52);
         ++field3525;
         return class90.method838(arg0, arg1, -76) | ~(arg0 & 2048) != -1 || class401.method3144(arg0, (byte)-73, arg1);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3529[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "a",
      descriptor = "(IB)Lks;"
   )
   public final class475 method2182(int arg0, byte arg1) {
      try {
         ++field3518;
         class407 var3 = this.field3520;
         class475 var4;
         synchronized(this.field3520) {
            var4 = (class475)this.field3520.method3192((long)arg0, (byte)-122);
         }

         if (var4 != null) {
            return var4;
         } else {
            class339 var5 = this.field3526;
            byte[] var6;
            synchronized(this.field3526) {
               var6 = this.field3526.method2697(arg0, 3, false);
            }

            class475 var7 = new class475();
            if (arg1 != -80) {
               this.method2175(37);
            }

            var7.field6623 = this;
            if (var6 != null) {
               var7.method3622(new class66(var6), -1);
            }

            class407 var8 = this.field3520;
            synchronized(this.field3520) {
               this.field3520.method3190(var7, (long)arg0, 8);
               return var7;
            }
         }
      } catch (RuntimeException var13) {
         throw class93.method866(var13, field3529[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "<init>",
      descriptor = "(Lkb;ILww;Lww;)V"
   )
   public class276(class500 arg0, int arg1, class339 arg2, class339 arg3) {
      try {
         this.field3528 = arg3;
         this.field3526 = arg2;
         this.field3526.method2691(3, 5);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field3529[0] + (arg0 != null ? field3529[1] : field3529[2]) + ',' + arg1 + ',' + (arg2 != null ? field3529[1] : field3529[2]) + ',' + (arg3 != null ? field3529[1] : field3529[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2183(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!te",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2184(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
