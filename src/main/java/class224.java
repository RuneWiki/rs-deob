import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class224 {
   @OriginalMember(
      owner = "client!lba",
      name = "m",
      descriptor = "I"
   )
   public int field2805;
   @OriginalMember(
      owner = "client!lba",
      name = "i",
      descriptor = "I"
   )
   public int field2808;
   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2812 = new String[]{method1794(method1793("I\u000b\u007fz\t\r")), method1794(method1793("I\u000b\u007fzvL\u0007w t\r")), method1794(method1793("I\u000b\u007fz\u000b\r")), method1794(method1793("I\u000b\u007fz\b\r"))};
   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "I"
   )
   public static int field2809 = 0;
   @OriginalMember(
      owner = "client!lba",
      name = "k",
      descriptor = "Laka;"
   )
   public static class418 field2804 = new class418(33, -1);
   @OriginalMember(
      owner = "client!lba",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field2811 = new int[32];
   @OriginalMember(
      owner = "client!lba",
      name = "f",
      descriptor = "I"
   )
   public int field2799;
   @OriginalMember(
      owner = "client!lba",
      name = "e",
      descriptor = "I"
   )
   public int field2800;
   @OriginalMember(
      owner = "client!lba",
      name = "c",
      descriptor = "I"
   )
   public int field2802;
   @OriginalMember(
      owner = "client!lba",
      name = "j",
      descriptor = "I"
   )
   public static int field2803;
   @OriginalMember(
      owner = "client!lba",
      name = "l",
      descriptor = "I"
   )
   public static int field2806;
   @OriginalMember(
      owner = "client!lba",
      name = "g",
      descriptor = "Llba;"
   )
   public class224 field2801;
   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "Lww;"
   )
   public static class339 field2810;
   @OriginalMember(
      owner = "client!lba",
      name = "h",
      descriptor = "Lkia;"
   )
   public class93 field2807;

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(I)Lfha;"
   )
   public final class289 method1790(int arg0) {
      try {
         if (arg0 <= 86) {
            method1792(-127);
         }

         ++field2803;
         return class588.method4380((byte)118, this.field2805);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2812[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "a",
      descriptor = "(II)Llba;"
   )
   public final class224 method1791(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            this.method1790(70);
         }

         ++field2806;
         return new class224(this.field2805, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2812[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method1792(int arg0) {
      try {
         int var1 = -44 % ((19 - arg0) / 50);
         field2810 = null;
         field2811 = null;
         field2804 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2812[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class224(int arg0, int arg1) {
      try {
         this.field2805 = arg0;
         this.field2808 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2812[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1793(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1794(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 84;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
