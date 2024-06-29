import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lka")
public class class412 {
   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5800 = new String[]{method3125(method3124("\bH:\u0017")), method3125(method3124("\nV7U\u0006N")), method3125(method3124("\u001d\u0013xU:")), method3125(method3124("\nV7U\u0005N"))};
   @OriginalMember(
      owner = "client!lka",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field5795 = false;
   @OriginalMember(
      owner = "client!lka",
      name = "e",
      descriptor = "Ltv;"
   )
   public static class590 field5799 = new class590(4);
   @OriginalMember(
      owner = "client!lka",
      name = "d",
      descriptor = "I"
   )
   public static int field5797;
   @OriginalMember(
      owner = "client!lka",
      name = "b",
      descriptor = "I"
   )
   public static int field5798;
   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field5796;

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3122(boolean arg0) {
      try {
         field5799 = null;
         field5796 = null;
         if (arg0) {
            method3123((class78)null, (byte)-50, (class78)null, true, 92);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5800[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "a",
      descriptor = "(Lnaa;BLnaa;ZI)I"
   )
   public static final int method3123(class78 arg0, byte arg1, class78 arg2, boolean arg3, int arg4) {
      try {
         ++field5797;
         if (~arg4 == -2) {
            int var5 = arg2.field7687;
            int var6 = arg0.field7687;
            if (!arg3) {
               if (~var6 == 0) {
                  var6 = 2001;
               }

               if (var5 == -1) {
                  var5 = 2001;
               }
            }

            return -var6 + var5;
         } else if (~arg4 == -3) {
            return class181.method1387(class494.field6787, arg0.method759((byte)111).field6898, (byte)-128, arg2.method759((byte)112).field6898);
         } else if (~arg4 == -4) {
            if (!arg2.field975.equals("-")) {
               if (arg0.field975.equals("-")) {
                  return arg3 ? 1 : -1;
               } else {
                  return class181.method1387(class494.field6787, arg0.field975, (byte)-128, arg2.field975);
               }
            } else if (arg0.field975.equals("-")) {
               return 0;
            } else {
               return !arg3 ? 1 : -1;
            }
         } else if (~arg4 == -5) {
            if (!arg2.method4037(-1)) {
               return arg0.method4037(-1) ? -1 : 0;
            } else {
               return arg0.method4037(-1) ? 0 : 1;
            }
         } else if (arg4 == 5) {
            if (arg2.method4041(65535)) {
               return !arg0.method4041(65535) ? 1 : 0;
            } else {
               return arg0.method4041(65535) ? -1 : 0;
            }
         } else if (arg1 > -111) {
            return -124;
         } else if (arg4 == 6) {
            if (!arg2.method4039(-1)) {
               return arg0.method4039(-1) ? -1 : 0;
            } else {
               return !arg0.method4039(-1) ? 1 : 0;
            }
         } else if (arg4 == 7) {
            if (arg2.method4042(-96)) {
               return !arg0.method4042(-65) ? 1 : 0;
            } else {
               return !arg0.method4042(-104) ? 0 : -1;
            }
         } else if (arg4 != 8) {
            return -arg0.field971 + arg2.field971;
         } else {
            int var7 = arg2.field976;
            int var8 = arg0.field976;
            if (arg3) {
               if (var7 == 1000) {
                  var7 = -1;
               }

               if (~var8 != -1001) {
                  return -var8 + var7;
               }

               var8 = -1;
               if (!client.field4273) {
                  return -var8 + var7;
               }
            }

            if (var8 == -1) {
               var8 = 1000;
            }

            if (var7 == -1) {
               var7 = 1000;
            }

            return -var8 + var7;
         }
      } catch (RuntimeException var10) {
         throw class534.method3846(var10, field5800[1] + (arg0 != null ? field5800[2] : field5800[0]) + ',' + arg1 + ',' + (arg2 != null ? field5800[2] : field5800[0]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3124(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3125(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 61;
            break;
         case 2:
            var10005 = 86;
            break;
         case 3:
            var10005 = 123;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
