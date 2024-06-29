import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class167 {
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2629 = new String[]{method1518(method1517("Y\u000e=M\u0018")), method1518(method1517("LU\u007f\u000f")), method1518(method1517("HH=!M")), method1518(method1517("HH=\"M"))};
   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "I"
   )
   public static int field2626;
   @OriginalMember(
      owner = "client!jh",
      name = "c",
      descriptor = "I"
   )
   public static int field2627;
   @OriginalMember(
      owner = "client!jh",
      name = "b",
      descriptor = "I"
   )
   public static int field2628;

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(BLjava/lang/Object;Z)[B"
   )
   public static final byte[] method1515(byte arg0, Object arg1, boolean arg2) {
      try {
         if (arg0 != 99) {
            field2626 = 108;
         }

         ++field2628;
         if (arg1 == null) {
            return null;
         } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[])arg1;
            return !arg2 ? var3 : class443.method3334(var3, (byte)88);
         } else if (arg1 instanceof class277) {
            class277 var4 = (class277)arg1;
            return var4.method2177((byte)115);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2629[2] + arg0 + ',' + (arg1 != null ? field2629[0] : field2629[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(IBIIIIIII)V"
   )
   public static final void method1516(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4564;

      try {
         ++field2627;
         if (!class28.method199(0, arg7)) {
            if (~arg4 != 0) {
               class178.field2749[arg4] = true;
            } else {
               int var10 = 0;
               if (var9) {
                  class178.field2749[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(var10 < 100) {
                     class178.field2749[var10] = true;
                     ++var10;
                  }

                  if (!var9) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class262.field3734) {
               var12 = class127.field2121;
               var14 = class684.field10070;
               var13 = class588.field8499;
               var15 = class611.field8871;
               var11 = class348.field4946;
               class611.field8871 = 1;
            }

            label91: {
               if (class327.field4684[arg7] == null) {
                  class639.method4677(class253.field3608[arg7], arg8, arg4, arg5, arg3, arg2, arg0, 125, -1, arg6, arg4 < 0);
                  if (!var9) {
                     break label91;
                  }
               }

               class639.method4677(class327.field4684[arg7], arg8, arg4, arg5, arg3, arg2, arg0, -95, -1, arg6, ~arg4 > -1);
            }

            if (arg1 >= -41) {
               field2626 = -88;
            }

            if (class262.field3734) {
               if (~arg4 <= -1 && ~class611.field8871 == -3) {
                  class670.method4896(class588.field8499, 0, class348.field4946, class684.field10070, class127.field2121);
               }

               class348.field4946 = var11;
               class684.field10070 = var14;
               class588.field8499 = var13;
               class127.field2121 = var12;
               class611.field8871 = var15;
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field2629[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
