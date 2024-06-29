import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class115 {
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1562 = new String[]{method1072(method1071("\u0001\u0004\u0001Vh")), method1072(method1071("\u0001\u0004\u0001Sh")), method1072(method1071("\u0001\u0004\u0001Uh")), method1072(method1071("\u000fF\u00019=")), method1072(method1071("\u0001\u0004\u0001Th")), method1072(method1071("\u001a\u001dC{"))};
   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "Lnaa;"
   )
   public static class113 field1556 = new class113(89, 8);
   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field1559 = new String[100];
   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "I"
   )
   public static int field1560 = -1;
   @OriginalMember(
      owner = "client!ul",
      name = "f",
      descriptor = "F"
   )
   public static float field1561;
   @OriginalMember(
      owner = "client!ul",
      name = "c",
      descriptor = "I"
   )
   public static int field1555;
   @OriginalMember(
      owner = "client!ul",
      name = "e",
      descriptor = "I"
   )
   public static int field1557;
   @OriginalMember(
      owner = "client!ul",
      name = "g",
      descriptor = "I"
   )
   public static int field1558;

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1067(int arg0, int arg1, int arg2) {
      try {
         ++field1557;
         arg1 = (127 & arg0) * arg1 >> 7;
         if (arg2 < 122) {
            return 100;
         } else {
            if (~arg1 <= -3) {
               if (~arg1 >= -127) {
                  return (arg0 & 65408) + arg1;
               }

               arg1 = 126;
               if (!client.field1786) {
                  return (arg0 & 65408) + arg1;
               }
            }

            arg1 = 2;
            return (arg0 & 65408) + arg1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1562[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1068(byte arg0) {
      try {
         field1559 = null;
         field1556 = null;
         if (arg0 >= -36) {
            field1556 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1562[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method1069(int arg0, byte arg1) {
      try {
         int var2 = 36 / ((arg1 - -13) / 35);
         ++field1558;
         if (arg0 != 19 && ~arg0 != -4 && arg0 != 21 && ~arg0 != -54 && ~arg0 != -23 && arg0 != 1002) {
            return arg0 == 25;
         } else {
            return true;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1562[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;BC)Ljava/lang/String;"
   )
   public static final String method1070(String arg0, String arg1, byte arg2, char arg3) {
      boolean var4 = client.field1786;

      try {
         int var5 = -23 / ((arg2 - -49) / 38);
         ++field1555;
         int var6 = arg1.length();
         int var7 = arg0.length();
         int var8 = var6;
         int var9 = var7 + -1;
         if (~var9 != -1) {
            int var10 = 0;

            do {
               var10 = arg1.indexOf(arg3, var10);
               if (~var10 > -1) {
                  break;
               }

               ++var10;
               var8 += var9;
            } while(!var4);
         }

         StringBuffer var11 = new StringBuffer(var8);
         int var12 = 0;

         while(true) {
            int var13 = arg1.indexOf(arg3, var12);
            if (~var13 <= -1) {
               var11.append(arg1.substring(var12, var13));
               var11.append(arg0);
               var12 = var13 + 1;
               if (var4) {
                  break;
               }

               if (!var4) {
                  continue;
               }
            }

            var11.append(arg1.substring(var12));
            break;
         }

         return var11.toString();
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field1562[4] + (arg0 != null ? field1562[3] : field1562[5]) + ',' + (arg1 != null ? field1562[3] : field1562[5]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1071(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1072(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 23;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
