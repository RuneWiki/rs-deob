import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class125 {
   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1519 = new String[]{method1029(method1028("\\z^X\u0019\u0005")), method1029(method1028("\\z^X\u001a\u0005"))};
   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "Lsd;"
   )
   public static class101 field1518 = new class101(74, 8);
   @OriginalMember(
      owner = "client!qca",
      name = "b",
      descriptor = "I"
   )
   public static int field1517;

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(I)V",
      line = 8
   )
   public static void method1026(int arg0) {
      try {
         field1518 = null;
         int var1 = 49 / ((56 - arg0) / 40);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1519[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(B)V",
      line = 20
   )
   public static final void method1027(byte arg0) {
      try {
         int var1 = -99 % ((-10 - arg0) / 57);
         ++field1517;
         if (class643.field9369 == 1 || ~class643.field9369 == -4 || class643.field9369 != class256.field3459 && (class643.field9369 == 0 || class256.field3459 == 0)) {
            class132.field1657 = 0;
            class159.field2021 = 0;
            class259.field3509.method5680(true);
         }

         class256.field3459 = class643.field9369;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1519[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1028(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1029(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
