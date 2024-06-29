import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class231 {
   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3598 = new String[]{method2060(method2059("Y\r8#\u000b")), method2060(method2059("\\\rz\r")), method2060(method2059("Y\r8\"\u000b")), method2060(method2059("IV8O^")), method2060(method2059("Y\r8%\u000b")), method2060(method2059("Y\r8 \u000b"))};
   @OriginalMember(
      owner = "client!ku",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field3590 = new int[6];
   @OriginalMember(
      owner = "client!ku",
      name = "l",
      descriptor = "Lfm;"
   )
   public static class164 field3586 = new class164(70, -1);
   @OriginalMember(
      owner = "client!ku",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field3592 = new short[]{962, 20423, -21582, 11214, -10295};
   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "[S"
   )
   private static short[] field3591 = new short[]{952, 20413, -21592, 11204, -10305};
   @OriginalMember(
      owner = "client!ku",
      name = "h",
      descriptor = "[S"
   )
   private static short[] field3596 = new short[]{957, 20418, -21587, 11209, -10300};
   @OriginalMember(
      owner = "client!ku",
      name = "d",
      descriptor = "[S"
   )
   private static short[] field3593 = new short[]{967, 20428, -21577, 11219, -10290};
   @OriginalMember(
      owner = "client!ku",
      name = "i",
      descriptor = "[[S"
   )
   public static short[][] field3594 = new short[][]{field3593, field3592, field3596, field3591};
   @OriginalMember(
      owner = "client!ku",
      name = "k",
      descriptor = "Lae;"
   )
   public static class506 field3595 = new class506();
   @OriginalMember(
      owner = "client!ku",
      name = "f",
      descriptor = "I"
   )
   public static int field3587;
   @OriginalMember(
      owner = "client!ku",
      name = "e",
      descriptor = "I"
   )
   public static int field3588;
   @OriginalMember(
      owner = "client!ku",
      name = "c",
      descriptor = "I"
   )
   public static int field3589;
   @OriginalMember(
      owner = "client!ku",
      name = "g",
      descriptor = "I"
   )
   public static int field3597;

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2055(int arg0) {
      try {
         if (arg0 != -13461) {
            field3592 = null;
         }

         field3596 = null;
         field3592 = null;
         field3593 = null;
         field3591 = null;
         field3590 = null;
         field3586 = null;
         field3594 = null;
         field3595 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3598[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(IZI)Lpka;"
   )
   public static final class380 method2056(int arg0, boolean arg1, int arg2) {
      try {
         ++field3589;
         if (arg2 != Integer.MIN_VALUE) {
            return null;
         } else {
            long var3 = (long)((arg1 ? Integer.MIN_VALUE : 0) | arg0);
            return (class380)class656.field9285.method3101(-1, var3);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field3598[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(IBIILbha;)V"
   )
   public static final void method2057(int param0, byte param1, int param2, int param3, class544 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(IIIZII)V"
   )
   public static final void method2058(int param0, int param1, int param2, boolean param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2059(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2060(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 97;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
