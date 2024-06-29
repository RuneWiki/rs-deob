import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class316 {
   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4371 = new String[]{method2506(method2505("\u0003\u000e\u0013c\u0018")), method2506(method2505("\u0013G\u0013\fM")), method2506(method2505("\u0016UQ!")), method2506(method2505("\u0013G\u0013\u000eM")), method2506(method2505("\u0013G\u0013\u000fM"))};
   @OriginalMember(
      owner = "client!kg",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field4367 = new int[50];
   @OriginalMember(
      owner = "client!kg",
      name = "b",
      descriptor = "I"
   )
   public static int field4368;
   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "I"
   )
   public static int field4370;
   @OriginalMember(
      owner = "client!kg",
      name = "d",
      descriptor = "[Z"
   )
   public static boolean[] field4369;

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(IIIILkv;ILoca;ILaa;Ljava/lang/String;ILda;)V"
   )
   public static final void method2502(int arg0, int arg1, int arg2, int arg3, class19 arg4, int arg5, class642 arg6, int arg7, class87 arg8, String arg9, int arg10, class447 arg11) {
      try {
         int var12;
         label63: {
            ++field4368;
            if (~class784.field11454 == -5) {
               var12 = (int)class623.field9202 & 16383;
               if (!client.field1481) {
                  break label63;
               }
            }

            var12 = (int)class623.field9202 + class495.field6914 & 16383;
         }

         int var13 = 10 + Math.max(arg6.field9629 / 2, arg6.field9572 / 2);
         int var14 = arg7 * arg7 - -(arg10 * arg10);
         if (~var14 >= ~(var13 * var13)) {
            int var15 = class746.field10907[var12];
            int var16 = -112 / ((-23 - arg1) / 34);
            int var17 = class746.field10897[var12];
            if (~class784.field11454 != -5) {
               var17 = var17 * 256 / (class391.field5419 - -256);
               var15 = var15 * 256 / (class391.field5419 - -256);
            }

            int var18 = arg7 * var17 + arg10 * var15 >> 14;
            int var19 = arg10 * var17 + -(arg7 * var15) >> 14;
            int var20 = arg4.method148((class648[])null, 0, 100, arg9);
            int var21 = var18 - var20 / 2;
            int var22 = arg4.method140(0, arg9, (byte)-43, (class648[])null, 100);
            if (~(-arg6.field9629) >= ~var21 && ~arg6.field9629 <= ~var21 && var19 >= -arg6.field9572 && ~arg6.field9572 <= ~var19) {
               arg11.method3420(arg6.field9629 / 2 + (var21 - -arg0), arg2, 11520, arg3, var20, (class648[])null, arg9, arg0, (int[])null, 0, 1, 0, 0, -arg5 + -var22 + arg2 - -(arg6.field9572 / 2) + -var19, arg8, 50);
            }
         }
      } catch (RuntimeException var24) {
         throw class93.method866(var24, field4371[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field4371[0] : field4371[2]) + ',' + arg5 + ',' + (arg6 != null ? field4371[0] : field4371[2]) + ',' + arg7 + ',' + (arg8 != null ? field4371[0] : field4371[2]) + ',' + (arg9 != null ? field4371[0] : field4371[2]) + ',' + arg10 + ',' + (arg11 != null ? field4371[0] : field4371[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(IBI)V"
   )
   public static final void method2503(int arg0, byte arg1, int arg2) {
      boolean var3 = client.field1481;

      try {
         ++field4370;
         if (class497.field6954 != null) {
            label63: {
               int var4 = class32.field475;
               int var5 = class674.field9985;
               class73.method710(false, arg2, arg0);
               if (class175.field2258 != 0) {
                  if (class175.field2258 != 1 || class543.field7934 != null && ~class32.field475 == ~var4 && ~class674.field9985 == ~var5) {
                     break label63;
                  }

                  class543.field7934 = new class122[class674.field9985 * class32.field475];
                  int var6 = 0;
                  if (var3) {
                     class543.field7934[var6] = class497.field6954.method445(class497.field6954.method415(class390.field5409, class139.field1759), class497.field6954.method409(class390.field5409, class139.field1759));
                     ++var6;
                  }

                  while(true) {
                     while(~class543.field7934.length < ~var6) {
                        class543.field7934[var6] = class497.field6954.method445(class497.field6954.method415(class390.field5409, class139.field1759), class497.field6954.method409(class390.field5409, class139.field1759));
                        ++var6;
                     }

                     class631.field9309 = 1;
                     class134.field1704 = new int[class674.field9985 * class32.field475];
                     if (!var3) {
                        if (!var3) {
                           break label63;
                        }
                        break;
                     }

                     ++var6;
                  }
               }

               class308.field4310 = null;
               class308.field4310 = class497.field6954.method445(class497.field6954.method415(class713.field10470, class345.field4735), class497.field6954.method409(class713.field10470, class345.field4735));
            }

            if (arg1 > 96) {
               class323.field4420 = true;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field4371[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2504(byte arg0) {
      try {
         if (arg0 >= -123) {
            field4369 = null;
         }

         field4367 = null;
         field4369 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4371[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2505(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2506(char[] arg0) {
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
            var10005 = 32;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
