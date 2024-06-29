import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class458 {
   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6941 = new String[]{method3446(method3445("\u0003S\u001a\u0011\u0011")), method3446(method3445("\u0003S\u001a\u0016\u0011")), method3446(method3445("\u0003S\u001a\u0013\u0011")), method3446(method3445("\u0003S\u001a\u0010\u0011"))};
   @OriginalMember(
      owner = "client!gr",
      name = "e",
      descriptor = "I"
   )
   public static int field6937 = 0;
   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "Lhv;"
   )
   public static class544 field6935 = null;
   @OriginalMember(
      owner = "client!gr",
      name = "f",
      descriptor = "I"
   )
   public static int field6936;
   @OriginalMember(
      owner = "client!gr",
      name = "c",
      descriptor = "I"
   )
   public static int field6938;
   @OriginalMember(
      owner = "client!gr",
      name = "b",
      descriptor = "I"
   )
   public static int field6939;
   @OriginalMember(
      owner = "client!gr",
      name = "d",
      descriptor = "I"
   )
   public static int field6940;

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(BI)J"
   )
   public static final long method3441(byte arg0, int arg1) {
      try {
         ++field6940;
         if (arg0 < 75) {
            method3443(-71);
         }

         return (long)(arg1 + 11745) * 86400000L;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field6941[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method3442(int arg0, int arg1, int arg2, int arg3, int arg4) {
      int var5 = client.field4530;

      try {
         ++field6938;
         if (~class4.field85 == -2) {
            int var6 = arg3 / class186.field2315;
            int var7 = arg4 / class186.field2315;
            if (arg1 != 26306) {
               field6935 = null;
            }

            int var8 = arg2 / class519.field7557;
            int var9 = arg0 / class519.field7557;
            if (var6 < class312.field4444 && var7 >= 0 && var8 < class690.field10400 && ~var9 <= -1) {
               if (var9 >= class690.field10400) {
                  var9 = class690.field10400 + -1;
               }

               if (var6 < 0) {
                  var6 = 0;
               }

               if (class312.field4444 <= var7) {
                  var7 = class312.field4444 + -1;
               }

               if (~var8 > -1) {
                  var8 = 0;
               }

               int var10 = var8;
               if (var5 != 0 || var8 <= var9) {
                  do {
                     int var11 = class677.method4945(class690.field10400, (byte)89, var10 - -class580.field8592) * class312.field4444;
                     int var12 = var6;
                     if (var5 != 0 || var7 >= var6) {
                        do {
                           int var13 = class677.method4945(class312.field4444, (byte)91, class665.field9665 + var12) + var11;
                           class102.field1254[var13] = class433.field6607;
                           ++var12;
                        } while(var7 >= var12);
                     }

                     ++var10;
                  } while(var10 <= var9);

               }
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field6941[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(I)[Lnca;"
   )
   public static final class785[] method3443(int arg0) {
      try {
         if (arg0 != 11745) {
            return null;
         } else {
            ++field6939;
            return new class785[]{class185.field2288, class185.field2297, class185.field2298, class185.field2299, class185.field2300, class185.field2301, class185.field2302, class185.field2303, class185.field2304, class185.field2305, class185.field2306, class185.field2307, class185.field2308};
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6941[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3444(byte arg0) {
      try {
         field6935 = null;
         if (arg0 != -12) {
            field6935 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6941[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3445(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3446(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
