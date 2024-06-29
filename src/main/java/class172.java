import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public abstract class class172 {
   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2154 = new String[]{method1345(method1344("\r\u0006lZ]Q")), method1345(method1344("\r\u0006lZ^Q")), method1345(method1344("\r\u0006lZ\\Q"))};
   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class378 field2149 = new class378(4, -1);
   @OriginalMember(
      owner = "client!tba",
      name = "c",
      descriptor = "I"
   )
   public static int field2152 = 0;
   @OriginalMember(
      owner = "client!tba",
      name = "e",
      descriptor = "I"
   )
   public static int field2151;
   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "I"
   )
   public static int field2153;
   @OriginalMember(
      owner = "client!tba",
      name = "d",
      descriptor = "Lha;"
   )
   public static class65 field2150;

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIIIII)I"
   )
   public static final int method1341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field2151;
         if (class93.field1241 == null) {
            return 0;
         } else {
            if (arg3 != 4956) {
               method1341(-108, 69, 104, -116, 25, 124);
            }

            if (~arg0 > -4) {
               int var6 = arg1 >> 9;
               int var7 = arg2 >> 9;
               if (arg4 >= 0 && arg5 >= 0 && arg4 <= class507.field7030 + -1 && ~arg5 >= ~(class215.field2667 + -1)) {
                  if (~var6 <= -2 && var7 >= 1 && ~(class507.field7030 + -1) <= ~var6 && var7 <= class215.field2667 + -1) {
                     boolean var8 = (class100.field1295[1][arg1 >> 9][arg2 >> 9] & 2) != 0;
                     if (~(arg1 & 511) == -1) {
                        boolean var9 = ~(class100.field1295[1][var6 + -1][arg2 >> 9] & 2) != -1;
                        boolean var10 = ~(2 & class100.field1295[1][var6][arg2 >> 9]) != -1;
                        if (!var9 != !var10) {
                           var8 = ~(class100.field1295[1][arg4][arg5] & 2) != -1;
                        }
                     }

                     if ((arg2 & 511) == 0) {
                        boolean var11 = (2 & class100.field1295[1][arg1 >> 9][var7 - 1]) != 0;
                        boolean var12 = ~(class100.field1295[1][arg1 >> 9][var7] & 2) != -1;
                        if (!var11 == var12) {
                           var8 = ~(2 & class100.field1295[1][arg4][arg5]) != -1;
                        }
                     }

                     if (var8) {
                        ++arg0;
                     }

                     return class93.field1241[arg0].method2220(123, arg1, arg2);
                  } else {
                     return 0;
                  }
               } else {
                  return 0;
               }
            } else {
               return class93.field1241[arg0].method2220(123, arg1, arg2);
            }
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field2154[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1342(int arg0) {
      try {
         field2150 = null;
         field2149 = null;
         if (arg0 != -7121) {
            field2152 = -84;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2154[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method1343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg2 > -82) {
            method1343(-38, -75, -78, -32, -64, -54, -114, 12, -25);
         }

         ++field2153;
         if (arg4 >= 1 && arg8 >= 1 && ~(class507.field7030 + -2) <= ~arg4 && arg8 <= class215.field2667 - 2) {
            int var9 = arg7;
            if (~arg7 > -4 && class407.method3090(arg4, 1, arg8)) {
               var9 = arg7 + 1;
            }

            if (~class674.field9907.field8458.method2628((byte)-90) == -1 && !class439.method3260(arg8, class316.field4223, arg4, var9, 127)) {
               return;
            }

            if (class111.field1404 == null) {
               return;
            }

            class620.field8662.method2883(arg7, arg4, class331.field4738[arg7], class338.field4832, arg8, arg0, 1);
            if (~arg5 <= -1) {
               int var10 = class674.field9907.field8424.method3960((byte)-83);
               class674.field9907.method4407(class674.field9907.field8424, -2160, 1);
               class620.field8662.method2877(arg8, 19077, arg4, arg6, arg7, class338.field4832, arg3, arg1, arg5, class331.field4738[arg7], var9);
               class674.field9907.method4407(class674.field9907.field8424, -2160, var10);
               return;
            }
         }

      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field2154[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1344(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1345(char[] arg0) {
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
            var10005 = 100;
            break;
         case 2:
            var10005 = 13;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
