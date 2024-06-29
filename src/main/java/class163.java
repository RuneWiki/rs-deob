import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public abstract class class163 {
   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2052 = new String[]{method1336(method1335("CTY.C^")), method1336(method1335("\r\u001d\\/")), method1336(method1335("\n\n\u001e\u0007\f")), method1336(method1335("\u0018F\u001emY")), method1336(method1335("\n\n\u001e\u0002\f")), method1336(method1335("\n\n\u001e\u0001\f")), method1336(method1335("\n\n\u001e\u0000\f"))};
   @OriginalMember(
      owner = "client!ib",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field2049 = new String[100];
   @OriginalMember(
      owner = "client!ib",
      name = "c",
      descriptor = "Lsd;"
   )
   public static class101 field2048 = new class101(10, -2);
   @OriginalMember(
      owner = "client!ib",
      name = "e",
      descriptor = "I"
   )
   public static int field2051 = 328;
   @OriginalMember(
      owner = "client!ib",
      name = "f",
      descriptor = "I"
   )
   public static int field2046;
   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "I"
   )
   public static int field2047;
   @OriginalMember(
      owner = "client!ib",
      name = "b",
      descriptor = "I"
   )
   public static int field2050;

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "([II)Ljava/lang/String;"
   )
   public static final String method1331(int[] arg0, int arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 != -1) {
            method1332(-69L, -105);
         }

         ++field2046;
         StringBuffer var3 = new StringBuffer();
         int var4 = class132.field1647;
         int var5 = 0;
         if (var2 == 0 && ~arg0.length >= ~var5) {
            return var3.toString();
         } else {
            do {
               class621 var6 = class793.field11562.method2815(arg0[var5], -30204);
               if (var6.field9054 != -1) {
                  class396 var7 = (class396)class659.field9554.method5454((long)var6.field9054, 18261);
                  if (var7 == null) {
                     class671 var8 = class671.method4894(class521.field7580, var6.field9054, 0);
                     if (var8 != null) {
                        var7 = class786.field11439.method577(var8, true);
                        class659.field9554.method5455(-2049, var7, (long)var6.field9054);
                     }
                  }

                  if (var7 != null) {
                     class75.field966[var4] = var7;
                     var3.append(field2052[0]).append(var4).append(">");
                     ++var4;
                  }
               }

               ++var5;
            } while(~arg0.length < ~var5);

            return var3.toString();
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field2052[2] + (arg0 != null ? field2052[3] : field2052[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(JI)I"
   )
   public static final int method1332(long arg0, int arg1) {
      try {
         ++field2047;
         if (arg1 != -11745) {
            method1331((int[])null, 56);
         }

         return (int)(arg0 / 86400000L) + -11745;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field2052[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method1333(int arg0) {
      try {
         ++field2050;
         if (class672.field10112 != arg0) {
            return false;
         } else {
            return ~class777.field11357 == -1 && class578.field8576 == 0;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2052[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1334(int arg0) {
      try {
         field2048 = null;
         field2049 = null;
         if (arg0 < 27) {
            field2048 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2052[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 48;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
