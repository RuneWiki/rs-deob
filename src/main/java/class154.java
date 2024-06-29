import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class154 {
   @OriginalMember(
      owner = "client!qm",
      name = "i",
      descriptor = "I"
   )
   public int field2457 = -1;
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2458 = new String[]{method1428(method1427("IF\u001fx")), method1428(method1427("\\\u001d]:d")), method1428(method1427("V^]U1")), method1428(method1427("V^]V1"))};
   @OriginalMember(
      owner = "client!qm",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public static String field2452 = "";
   @OriginalMember(
      owner = "client!qm",
      name = "f",
      descriptor = "I"
   )
   public static int field2449;
   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "I"
   )
   public static int field2450;
   @OriginalMember(
      owner = "client!qm",
      name = "h",
      descriptor = "I"
   )
   public static int field2454;
   @OriginalMember(
      owner = "client!qm",
      name = "e",
      descriptor = "Ldja;"
   )
   public class323 field2456;
   @OriginalMember(
      owner = "client!qm",
      name = "g",
      descriptor = "[I"
   )
   public int[] field2455;
   @OriginalMember(
      owner = "client!qm",
      name = "b",
      descriptor = "[J"
   )
   public long[] field2451;
   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field2453;

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(B)V",
      line = 13
   )
   public static void method1425(byte arg0) {
      try {
         if (arg0 != -41) {
            method1425((byte)87);
         }

         field2452 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2458[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "([SI[Ljava/lang/String;)V",
      line = 24
   )
   public static final void method1426(short[] arg0, int arg1, String[] arg2) {
      try {
         ++field2454;
         if (arg1 <= -102) {
            class80.method812(0, arg0, arg2.length - 1, 2, arg2);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2458[2] + (arg0 != null ? field2458[1] : field2458[0]) + ',' + arg1 + ',' + (arg2 != null ? field2458[1] : field2458[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1427(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1428(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
