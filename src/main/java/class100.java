import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class100 {
   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1411 = new String[]{method977(method976("Nct*;")), method977(method976("[86h")), method977(method976("D>tGn")), method977(method976("D>tEn")), method977(method976("D>tFn")), method977(method976("D>t@n"))};
   @OriginalMember(
      owner = "client!qs",
      name = "h",
      descriptor = "I"
   )
   public int field1395;
   @OriginalMember(
      owner = "client!qs",
      name = "c",
      descriptor = "I"
   )
   public int field1396;
   @OriginalMember(
      owner = "client!qs",
      name = "p",
      descriptor = "I"
   )
   public int field1397;
   @OriginalMember(
      owner = "client!qs",
      name = "k",
      descriptor = "I"
   )
   public int field1398;
   @OriginalMember(
      owner = "client!qs",
      name = "e",
      descriptor = "I"
   )
   public int field1399;
   @OriginalMember(
      owner = "client!qs",
      name = "d",
      descriptor = "I"
   )
   public int field1400;
   @OriginalMember(
      owner = "client!qs",
      name = "j",
      descriptor = "I"
   )
   public int field1401;
   @OriginalMember(
      owner = "client!qs",
      name = "m",
      descriptor = "I"
   )
   public static int field1402;
   @OriginalMember(
      owner = "client!qs",
      name = "n",
      descriptor = "I"
   )
   public int field1403;
   @OriginalMember(
      owner = "client!qs",
      name = "i",
      descriptor = "I"
   )
   public static int field1404;
   @OriginalMember(
      owner = "client!qs",
      name = "o",
      descriptor = "I"
   )
   public int field1405;
   @OriginalMember(
      owner = "client!qs",
      name = "f",
      descriptor = "I"
   )
   public static int field1406;
   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "I"
   )
   public int field1407;
   @OriginalMember(
      owner = "client!qs",
      name = "l",
      descriptor = "I"
   )
   public static int field1408;
   @OriginalMember(
      owner = "client!qs",
      name = "g",
      descriptor = "I"
   )
   public int field1409;
   @OriginalMember(
      owner = "client!qs",
      name = "b",
      descriptor = "I"
   )
   public int field1410;

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(III)Z",
      line = 9
   )
   public static final boolean method972(int arg0, int arg1, int arg2) {
      try {
         ++field1408;
         int var3 = 58 / ((arg0 - 69) / 55);
         return class564.method4256(arg1, -19410, arg2) | (262144 & arg1) != 0 || class246.method2092((byte)-40, arg2, arg1);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1411[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(I[FB)[F",
      line = 22
   )
   public static final float[] method973(int arg0, float[] arg1, byte arg2) {
      try {
         ++field1404;
         float[] var3 = new float[arg0];
         if (arg2 <= 78) {
            return null;
         } else {
            class107.method1023(arg1, 0, var3, 0, arg0);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1411[2] + arg0 + ',' + (arg1 != null ? field1411[0] : field1411[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(ILqs;)Z",
      line = 38
   )
   public final boolean method974(int arg0, class100 arg1) {
      try {
         ++field1402;
         if (~this.field1401 == ~arg1.field1401 && ~this.field1410 == ~arg1.field1410 && this.field1409 == arg1.field1409) {
            return true;
         } else {
            if (arg0 != 26563) {
               this.field1405 = 58;
            }

            return false;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field1411[4] + arg0 + ',' + (arg1 != null ? field1411[0] : field1411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(IZLjava/lang/Object;)[B",
      line = 57
   )
   public static final byte[] method975(int arg0, boolean arg1, Object arg2) {
      try {
         ++field1406;
         if (arg0 < 86) {
            return null;
         } else if (arg2 == null) {
            return null;
         } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[])arg2;
            return arg1 ? class571.method4297(-48, var3) : var3;
         } else if (arg2 instanceof class306) {
            class306 var4 = (class306)arg2;
            return var4.method2567(20661);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field1411[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1411[0] : field1411[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method976(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method977(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
