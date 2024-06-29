import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class662 {
   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9624 = new String[]{method4848(method4847("\u00148\u000e\u0001kH")), method4848(method4847("\u00148\u000e\u0001hH")), method4848(method4847("\u00148\u000e\u0001jH")), method4848(method4847("\u00148\u000e\u0001mH")), method4848(method4847("\u001brA\u0001T")), method4848(method4847("\u000e)\u0003C"))};
   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "I"
   )
   public static int field9620;
   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "I"
   )
   public static int field9621;
   @OriginalMember(
      owner = "client!tda",
      name = "d",
      descriptor = "I"
   )
   public static int field9623;
   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "[Laja;"
   )
   public static class99[] field9622;

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4843(int arg0) {
      try {
         field9622 = null;
         if (arg0 != 1000) {
            method4843(30);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9624[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "c",
      descriptor = "(I)I"
   )
   public static final int method4844(int arg0) {
      try {
         ++field9623;
         return class402.field5939 == arg0 ? class220.field3311 : class82.field1382;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9624[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "a",
      descriptor = "(Lpq;Lpq;ZBI)I"
   )
   public static final int method4845(class203 arg0, class203 arg1, boolean arg2, byte arg3, int arg4) {
      try {
         if (arg3 > -8) {
            method4845((class203)null, (class203)null, true, (byte)-37, -65);
         }

         ++field9621;
         if (~arg4 == -2) {
            int var5 = arg1.field9585;
            int var6 = arg0.field9585;
            if (!arg2) {
               if (~var5 == 0) {
                  var5 = 2001;
               }

               if (var6 == -1) {
                  var6 = 2001;
               }
            }

            return -var6 + var5;
         } else if (~arg4 == -3) {
            return class118.method1118(arg0.method1736((byte)0).field2632, class385.field5684, arg1.method1736((byte)0).field2632, (byte)-100);
         } else if (~arg4 == -4) {
            if (!arg1.field3042.equals("-")) {
               if (arg0.field3042.equals("-")) {
                  return !arg2 ? -1 : 1;
               } else {
                  return class118.method1118(arg0.field3042, class385.field5684, arg1.field3042, (byte)-85);
               }
            } else if (arg0.field3042.equals("-")) {
               return 0;
            } else {
               return !arg2 ? 1 : -1;
            }
         } else if (~arg4 == -5) {
            if (!arg1.method4830(8)) {
               return !arg0.method4830(8) ? 0 : -1;
            } else {
               return arg0.method4830(8) ? 0 : 1;
            }
         } else if (~arg4 == -6) {
            if (arg1.method4827((byte)-26)) {
               return !arg0.method4827((byte)-26) ? 1 : 0;
            } else {
               return !arg0.method4827((byte)-26) ? 0 : -1;
            }
         } else if (~arg4 == -7) {
            if (!arg1.method4828(false)) {
               return arg0.method4828(false) ? -1 : 0;
            } else {
               return arg0.method4828(false) ? 0 : 1;
            }
         } else if (arg4 == 7) {
            if (!arg1.method4829((byte)121)) {
               return !arg0.method4829((byte)123) ? 0 : -1;
            } else {
               return arg0.method4829((byte)126) ? 0 : 1;
            }
         } else if (arg4 != 8) {
            return -arg0.field3032 + arg1.field3032;
         } else {
            int var7 = arg1.field3037;
            int var8 = arg0.field3037;
            if (!arg2) {
               if (~var7 == 0) {
                  var7 = 1000;
               }

               if (~var8 != 0) {
                  return -var8 + var7;
               }

               var8 = 1000;
               if (!client.field4564) {
                  return -var8 + var7;
               }
            }

            if (~var8 == -1001) {
               var8 = -1;
            }

            if (~var7 == -1001) {
               var7 = -1;
            }

            return -var8 + var7;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field9624[3] + (arg0 != null ? field9624[4] : field9624[5]) + ',' + (arg1 != null ? field9624[4] : field9624[5]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method4846(int arg0) {
      try {
         if (arg0 < 16) {
            return 60;
         } else {
            ++field9620;
            return class601.field8678;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9624[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4847(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4848(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 96;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 47;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
