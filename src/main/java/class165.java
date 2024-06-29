import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class165 {
   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2340 = new String[]{method1370(method1369("PD!\u0005\u0015")), method1370(method1369("PD!\u0000\u0015")), method1370(method1369("PD!\u0003\u0015")), method1370(method1369("PD!\u0002\u0015"))};
   @OriginalMember(
      owner = "client!ib",
      name = "n",
      descriptor = "I"
   )
   public static int field2329 = 0;
   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "[Z"
   )
   public static boolean[] field2331 = new boolean[200];
   @OriginalMember(
      owner = "client!ib",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field2336 = new int[3];
   @OriginalMember(
      owner = "client!ib",
      name = "l",
      descriptor = "I"
   )
   public static int field2337 = -1;
   @OriginalMember(
      owner = "client!ib",
      name = "b",
      descriptor = "F"
   )
   public static float field2339;
   @OriginalMember(
      owner = "client!ib",
      name = "k",
      descriptor = "I"
   )
   public static int field2326;
   @OriginalMember(
      owner = "client!ib",
      name = "d",
      descriptor = "I"
   )
   public int field2327;
   @OriginalMember(
      owner = "client!ib",
      name = "j",
      descriptor = "I"
   )
   public static int field2328;
   @OriginalMember(
      owner = "client!ib",
      name = "c",
      descriptor = "I"
   )
   public int field2330;
   @OriginalMember(
      owner = "client!ib",
      name = "f",
      descriptor = "I"
   )
   public static int field2332;
   @OriginalMember(
      owner = "client!ib",
      name = "i",
      descriptor = "I"
   )
   public int field2333;
   @OriginalMember(
      owner = "client!ib",
      name = "h",
      descriptor = "I"
   )
   public int field2334;
   @OriginalMember(
      owner = "client!ib",
      name = "e",
      descriptor = "I"
   )
   public static int field2335;
   @OriginalMember(
      owner = "client!ib",
      name = "m",
      descriptor = "Lbg;"
   )
   public static class492 field2338;

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(IZZ)V",
      line = 7
   )
   public static final void method1365(int arg0, boolean arg1, boolean arg2) {
      try {
         if (arg2) {
            --class778.field11399;
            if (~class778.field11399 == -1) {
               class130.field1665 = null;
            }
         }

         if (arg0 <= -120) {
            ++field2335;
            if (arg1) {
               --class754.field11171;
               if (~class754.field11171 == -1) {
                  class546.field7829 = null;
                  return;
               }
            }

         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field2340[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(IZ)I",
      line = 46
   )
   public static final int method1366(int arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field2332;
         if (class707.field10328 == null) {
            return 0;
         } else if (!arg1 && class379.field5462 != null) {
            return class707.field10328.length * 2;
         } else {
            int var3 = arg0;
            int var4 = 0;
            int var5;
            if (var2) {
               var5 = class707.field10328[var4];
               if (class161.field2300.method2051(var5, (byte)60)) {
                  var3 = arg0 + 1;
               }

               if (class49.field638.method2051(var5, (byte)60)) {
                  ++var3;
               }

               ++var4;
            }

            while(true) {
               int var10000;
               if (~var4 <= ~class707.field10328.length) {
                  var10000 = var3;
                  if (!var2) {
                     return var3;
                  }
               } else {
                  var10000 = class707.field10328[var4];
               }

               var5 = var10000;
               if (class161.field2300.method2051(var5, (byte)60)) {
                  ++var3;
               }

               if (class49.field638.method2051(var5, (byte)60)) {
                  ++var3;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field2340[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(B)V",
      line = 82
   )
   public static void method1367(byte arg0) {
      try {
         field2331 = null;
         if (arg0 < 92) {
            field2339 = 1.0034779F;
         }

         field2338 = null;
         field2336 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2340[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "a",
      descriptor = "(IIIIBII)V",
      line = 95
   )
   public static final void method1368(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         if (arg4 != 1) {
            field2337 = 125;
         }

         if (class300.field4107.field6439.method4286(arg4 + 82) != 0 && ~arg0 != -1 && ~class673.field9755 > -51 && ~arg1 != 0) {
            class534.field7614[class673.field9755++] = new class245((byte)1, arg1, arg0, arg2, arg6, arg3, arg5, (class731)null);
         }

         ++field2326;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field2340[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1369(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ib",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1370(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
