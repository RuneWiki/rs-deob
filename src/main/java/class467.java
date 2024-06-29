import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class467 {
   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6425 = new String[]{method3555(method3554("S/be<")), method3555(method3554("S/b`<")), method3555(method3554("S/bc<")), method3555(method3554("S/bb<"))};
   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "I"
   )
   public static int field6418;
   @OriginalMember(
      owner = "client!vv",
      name = "e",
      descriptor = "I"
   )
   public static int field6419;
   @OriginalMember(
      owner = "client!vv",
      name = "f",
      descriptor = "I"
   )
   public static int field6420;
   @OriginalMember(
      owner = "client!vv",
      name = "d",
      descriptor = "I"
   )
   public static int field6421;
   @OriginalMember(
      owner = "client!vv",
      name = "c",
      descriptor = "I"
   )
   public static int field6422;
   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "I"
   )
   public static int field6423;
   @OriginalMember(
      owner = "client!vv",
      name = "g",
      descriptor = "I"
   )
   public static int field6424;

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(ZIIII)V"
   )
   public static final void method3550(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         label20: {
            if (class757.field11093.field11012.method27(-18033) != 0) {
               class84.field1168 = class757.field11093.field11012.method27(-18033);
               class214.method1749(0, true, 115);
               if (!client.field1481) {
                  break label20;
               }
            }

            class359.method2833(77, false);
         }

         if (arg2 < 26) {
            method3552(-116, -80, 102, -59);
         }

         ++field6422;
         class328.field4543 = arg4;
         class192.field2431 = arg0;
         class460.field6317 = arg1;
         class326.method2557(arg3);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6425[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "b",
      descriptor = "(B)V"
   )
   public static final void method3551(byte param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(IIII)I"
   )
   public static final int method3552(int arg0, int arg1, int arg2, int arg3) {
      boolean var4 = client.field1481;

      try {
         if (arg0 != 1711503530) {
            field6423 = 64;
         }

         label41: {
            if (arg1 > 243) {
               arg2 >>= 4;
               if (!var4) {
                  break label41;
               }
            }

            if (arg1 > 217) {
               arg2 >>= 3;
               if (!var4) {
                  break label41;
               }
            }

            if (arg1 > 192) {
               arg2 >>= 2;
               if (!var4) {
                  break label41;
               }
            }

            if (~arg1 < -180) {
               arg2 >>= 1;
            }
         }

         ++field6424;
         return ((arg3 >> 2 & 63) << 10) + (arg1 >> 1) - -(arg2 >> 5 << 7);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6425[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method3553(byte arg0) {
      boolean var1 = client.field1481;

      try {
         ++field6420;
         int var2 = class304.field4255;
         int[] var3 = class710.field10421;
         if (arg0 != -12) {
            field6419 = 7;
         }

         int var4 = 0;
         if (var1 || ~var4 > ~var2) {
            do {
               class783 var5 = class59.field771[var3[var4]];
               if (var5 != null) {
                  class334.method2654(var5, (byte)-123, var5.method78(arg0 ^ -12));
               }

               ++var4;
            } while(~var4 > ~var2);

         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field6425[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3554(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3555(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
