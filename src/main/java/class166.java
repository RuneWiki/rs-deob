import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class166 extends class445 {
   @OriginalMember(
      owner = "client!ce",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2508 = new String[]{method1564(method1563("nM\u001ck}")), method1564(method1563("nM\u001cj}")), method1564(method1563("nM\u001cf}"))};
   @OriginalMember(
      owner = "client!ce",
      name = "y",
      descriptor = "Lhha;"
   )
   public static class724 field2503 = new class724(111, 4);
   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "B"
   )
   public byte field2505;
   @OriginalMember(
      owner = "client!ce",
      name = "A",
      descriptor = "I"
   )
   public int field2502;
   @OriginalMember(
      owner = "client!ce",
      name = "B",
      descriptor = "I"
   )
   public static int field2506;
   @OriginalMember(
      owner = "client!ce",
      name = "x",
      descriptor = "I"
   )
   public static int field2507;
   @OriginalMember(
      owner = "client!ce",
      name = "C",
      descriptor = "Lcu;"
   )
   public class65 field2504;

   @OriginalMember(
      owner = "client!ce",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method1561(boolean arg0) {
      try {
         field2503 = null;
         if (!arg0) {
            method1562(9);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2508[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "g",
      descriptor = "(I)V"
   )
   public static final void method1562(int arg0) {
      class33.field470 = arg0;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "e",
      descriptor = "(I)I"
   )
   public final int method550(int arg0) {
      try {
         if (arg0 != -25183) {
            this.field2504 = null;
         }

         ++field2506;
         return this.field2504 == null ? 0 : this.field2504.field945 * 100 / (this.field2504.field942.length + -this.field2505);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2508[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "a",
      descriptor = "(I)[B"
   )
   public final byte[] method552(int arg0) {
      try {
         ++field2507;
         if (arg0 != 0) {
            this.method550(-80);
         }

         if (!super.field6490 && ~this.field2504.field945 <= ~(this.field2504.field942.length + -this.field2505)) {
            return this.field2504.field942;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field2508[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1563(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ce",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1564(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 13;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
