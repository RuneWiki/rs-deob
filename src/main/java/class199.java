import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class199 {
   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2537 = new String[]{method1653(method1652("J?\u0003\u0016\u0013\u0011")), method1653(method1652("W,\u000eT")), method1653(method1652("J?\u0003\u0016\u0010\u0011")), method1653(method1652("BwL\u0016/"))};
   @OriginalMember(
      owner = "client!sfa",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field2531 = new int[]{8, 11, 4, 6, 9, 7, 10, 0};
   @OriginalMember(
      owner = "client!sfa",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2534 = new int[1];
   @OriginalMember(
      owner = "client!sfa",
      name = "f",
      descriptor = "I"
   )
   public static int field2532;
   @OriginalMember(
      owner = "client!sfa",
      name = "d",
      descriptor = "Lpd;"
   )
   public static class648 field2535;
   @OriginalMember(
      owner = "client!sfa",
      name = "c",
      descriptor = "Lkc;"
   )
   public static class72 field2536;
   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "Ljava/io/FileOutputStream;"
   )
   public static FileOutputStream field2533;

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1650(int arg0) {
      try {
         field2535 = null;
         field2531 = null;
         field2536 = null;
         field2534 = null;
         if (arg0 != 0) {
            field2531 = null;
         }

         field2533 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2537[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "a",
      descriptor = "(ILkka;)Z"
   )
   public static final boolean method1651(int arg0, class519 arg1) {
      try {
         ++field2532;
         if (arg1 == null) {
            return false;
         } else if (!arg1.field7292) {
            return false;
         } else if (!arg1.method3901((byte)72, class326.field4472)) {
            return false;
         } else if (class436.field5944.method1818(-1, (long)arg1.field7270) != null) {
            return false;
         } else if (class746.field10878.method1818(-1, (long)arg1.field7280) != null) {
            return false;
         } else {
            if (arg0 != 11) {
               method1651(-8, (class519)null);
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2537[2] + arg0 + ',' + (arg1 != null ? field2537[3] : field2537[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1652(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1653(char[] arg0) {
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
            var10005 = 89;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
