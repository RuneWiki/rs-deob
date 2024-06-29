import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class650 {
   @OriginalMember(
      owner = "client!pc",
      name = "d",
      descriptor = "I"
   )
   public int field9366;
   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9379 = new String[]{method4721(method4720("\"XY;\r<R\u00039L")), method4721(method4720("\"XYFL")), method4721(method4720("\"XYs\u000b\u0001O\u0005n\n5\u0013"))};
   @OriginalMember(
      owner = "client!pc",
      name = "g",
      descriptor = "Lpc;"
   )
   public static class650 field9368 = new class650(1);
   @OriginalMember(
      owner = "client!pc",
      name = "l",
      descriptor = "Lpc;"
   )
   public static class650 field9369 = new class650(2);
   @OriginalMember(
      owner = "client!pc",
      name = "k",
      descriptor = "Lpc;"
   )
   public static class650 field9370 = new class650(4);
   @OriginalMember(
      owner = "client!pc",
      name = "j",
      descriptor = "Lpc;"
   )
   public static class650 field9371 = new class650(1);
   @OriginalMember(
      owner = "client!pc",
      name = "m",
      descriptor = "Lpc;"
   )
   public static class650 field9372 = new class650(2);
   @OriginalMember(
      owner = "client!pc",
      name = "i",
      descriptor = "Lpc;"
   )
   public static class650 field9373 = new class650(4);
   @OriginalMember(
      owner = "client!pc",
      name = "c",
      descriptor = "Lpc;"
   )
   public static class650 field9374 = new class650(2);
   @OriginalMember(
      owner = "client!pc",
      name = "h",
      descriptor = "Lpc;"
   )
   public static class650 field9375 = new class650(4);
   @OriginalMember(
      owner = "client!pc",
      name = "e",
      descriptor = "I"
   )
   public static int field9378 = -1;
   @OriginalMember(
      owner = "client!pc",
      name = "f",
      descriptor = "Lbda;"
   )
   public static class783 field9377 = new class783(7, 2);
   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "I"
   )
   public static int field9367;
   @OriginalMember(
      owner = "client!pc",
      name = "b",
      descriptor = "I"
   )
   public static int field9376;

   @OriginalMember(
      owner = "client!pc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4719(int arg0) {
      try {
         field9370 = null;
         field9371 = null;
         field9377 = null;
         field9372 = null;
         field9373 = null;
         field9368 = null;
         if (arg0 != 4) {
            field9370 = null;
         }

         field9369 = null;
         field9374 = null;
         field9375 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9379[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "<init>",
      descriptor = "(I)V"
   )
   private class650(int arg0) {
      try {
         this.field9366 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9379[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9367;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9379[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4720(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4721(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
