import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class353 {
   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5366 = new String[]{method2833(method2832("q~q@\u0015")), method2833(method2832("d%3\u0002")), method2833(method2832("f'q-@")), method2833(method2832("f'q/@")), method2833(method2832("f'q*@"))};
   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "I"
   )
   public static int field5363 = 0;
   @OriginalMember(
      owner = "client!lw",
      name = "d",
      descriptor = "I"
   )
   public static int field5361;
   @OriginalMember(
      owner = "client!lw",
      name = "e",
      descriptor = "I"
   )
   public static int field5364;
   @OriginalMember(
      owner = "client!lw",
      name = "b",
      descriptor = "I"
   )
   public static int field5365;
   @OriginalMember(
      owner = "client!lw",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field5362;

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(FFIFI)F"
   )
   public static final float method2828(float arg0, float arg1, int arg2, float arg3, int arg4) {
      try {
         ++field5364;
         if (arg4 != -4264) {
            method2829((class119)null, -60, 114);
         }

         float[] var5 = class571.field8453[arg2];
         return var5[2] * arg1 + var5[0] * arg0 + var5[1] * arg3;
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field5366[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(Luaa;II)V"
   )
   public static final void method2829(class119 arg0, int arg1, int arg2) {
      try {
         if (arg0.field1603 != null) {
            int var3 = arg0.field1603[arg1 + 1];
            if (~var3 != ~arg0.field1657.method2995((byte)104)) {
               arg0.field1657.method2979((byte)-125, var3, arg0.field1657.method2994(-1));
               arg0.field1690 = arg0.field1688;
            }
         }

         ++field5361;
         if (arg2 != 14478) {
            method2830((byte)7, (String)null, true, 21, -83);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field5366[2] + (arg0 != null ? field5366[0] : field5366[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(BLjava/lang/String;ZII)V"
   )
   public static final void method2830(byte arg0, String arg1, boolean arg2, int arg3, int arg4) {
      try {
         ++field5365;
         if (arg0 != 46) {
            method2830((byte)50, (String)null, false, -25, 42);
         }

         class234.method2011(arg2, arg0 ^ 47, arg3, arg1, (String)null, false, arg4);
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field5366[3] + arg0 + ',' + (arg1 != null ? field5366[0] : field5366[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lw",
      name = "a",
      descriptor = "(III)Lbm;"
   )
   public static final class484 method2831(int arg0, int arg1, int arg2) {
      class190 var3 = class711.field10694[arg0][arg1][arg2];
      return var3 == null ? null : var3.field2953;
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2832(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2833(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 110;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
