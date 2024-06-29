import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class169 {
   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2367 = new String[]{method1389(method1388("\f/]YM")), method1389(method1388("\f/]i\n4/\u0001t\u000b\u0000s")), method1389(method1388("\f/]\\M")), method1389(method1388("\f/]^M")), method1389(method1388("\f/]_M"))};
   @OriginalMember(
      owner = "client!kt",
      name = "e",
      descriptor = "I"
   )
   public static int field2359 = 0;
   @OriginalMember(
      owner = "client!kt",
      name = "h",
      descriptor = "F"
   )
   public static float field2361;
   @OriginalMember(
      owner = "client!kt",
      name = "b",
      descriptor = "I"
   )
   public static int field2362;
   @OriginalMember(
      owner = "client!kt",
      name = "f",
      descriptor = "I"
   )
   public static int field2363;
   @OriginalMember(
      owner = "client!kt",
      name = "c",
      descriptor = "I"
   )
   public static int field2364;
   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "I"
   )
   public static int field2365;
   @OriginalMember(
      owner = "client!kt",
      name = "d",
      descriptor = "I"
   )
   public static int field2366;
   @OriginalMember(
      owner = "client!kt",
      name = "g",
      descriptor = "Lgv;"
   )
   public static class90 field2360;

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(IBI)I"
   )
   public final int method1384(int arg0, byte arg1, int arg2) {
      try {
         ++field2366;
         int var4 = class237.field3310 <= arg2 ? arg2 : class237.field3310;
         if (class713.field10396 == this) {
            return 0;
         } else if (class254.field3461 == this) {
            return -arg0 + var4;
         } else if (class136.field1730 == this) {
            return (-arg0 + var4) / 2;
         } else {
            if (arg1 >= -110) {
               method1386(-34, 21, 95, 17, 90, true);
            }

            return 0;
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2367[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "b",
      descriptor = "(B)Z"
   )
   public static final boolean method1385(byte arg0) {
      try {
         ++field2362;
         int var1 = 56 % ((-12 - arg0) / 47);
         return ~class542.field7787 != -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2367[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2364;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2367[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(IIIIIZ)Z"
   )
   public static final boolean method1386(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      boolean var6 = client.field4360;

      try {
         ++field2365;
         if (!arg5) {
            method1387((byte)113);
         }

         int var7 = arg0;
         int var10000;
         if (var6) {
            var10000 = arg2;
         } else if (arg4 < arg0) {
            var10000 = 0;
            if (!var6) {
               return false;
            }
         } else {
            var10000 = arg2;
         }

         while(true) {
            int var8 = var10000;
            if (var6) {
               if (class318.field4341[var7][var8] == arg3 && class141.field1805[var7][var8] <= 1) {
                  return true;
               }

               ++var8;
            }

            while(true) {
               while(var8 <= arg1) {
                  if (class318.field4341[var7][var8] == arg3 && class141.field1805[var7][var8] <= 1) {
                     return true;
                  }

                  ++var8;
               }

               if (!var6) {
                  ++var7;
                  if (arg4 < var7) {
                     var10000 = 0;
                     if (!var6) {
                        return false;
                     }
                  } else {
                     var10000 = arg2;
                  }
                  break;
               }

               ++var8;
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2367[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1387(byte arg0) {
      try {
         if (arg0 != -85) {
            method1387((byte)96);
         }

         field2360 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2367[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1388(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1389(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 103;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
