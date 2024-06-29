import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class156 {
   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2330 = new String[]{method1409(method1408(".\u0017N$\u0003o")), method1409(method1408(".\u0017N$\u0002o")), method1409(method1408(".\u0017N$\u0000o"))};
   @OriginalMember(
      owner = "client!ida",
      name = "c",
      descriptor = "F"
   )
   public static float field2327 = 0.0F;
   @OriginalMember(
      owner = "client!ida",
      name = "e",
      descriptor = "[B"
   )
   public static byte[] field2329 = new byte[2048];
   @OriginalMember(
      owner = "client!ida",
      name = "f",
      descriptor = "I"
   )
   public static int field2325;
   @OriginalMember(
      owner = "client!ida",
      name = "b",
      descriptor = "I"
   )
   public static int field2326;
   @OriginalMember(
      owner = "client!ida",
      name = "d",
      descriptor = "I"
   )
   public static int field2328;
   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "Lda;"
   )
   public static class288 field2324;

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(B)Lica;"
   )
   public static final class354 method1405(byte arg0) {
      try {
         ++field2326;
         class354 var1 = class413.method3309(4);
         int var2 = 122 / ((arg0 - -72) / 34);
         var1.method2892(-50, 0L);
         var1.method2862(class455.field6963, true);
         var1.method2892(-32, class656.field9800);
         var1.method2892(-69, class80.field1083);
         var1.method2878((byte)126, class361.field5587, class371.field5755);
         return var1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2330[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(IIIII)V"
   )
   public static final void method1406(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         class185.field2900 = arg2;
         ++field2328;
         class144.field2047 = arg3;
         if (arg4 != 0) {
            method1405((byte)-67);
         }

         class25.field312 = arg1;
         class324.field4937 = arg0;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2330[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1407(int arg0) {
      try {
         if (arg0 > -14) {
            method1405((byte)63);
         }

         field2324 = null;
         field2329 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2330[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1408(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ida",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1409(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 115;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
