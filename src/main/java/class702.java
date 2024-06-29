import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class702 {
   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10461 = new String[]{method5170(method5169("RX$Et\u0014")), method5170(method5169("RX$Ew\u0014")), method5170(method5169("RX$Ev\u0014"))};
   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "I"
   )
   public static int field10456;
   @OriginalMember(
      owner = "client!nda",
      name = "d",
      descriptor = "I"
   )
   public static int field10457;
   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "I"
   )
   public static int field10459;
   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "I"
   )
   public static int field10460;
   @OriginalMember(
      owner = "client!nda",
      name = "e",
      descriptor = "Lrr;"
   )
   public static class678 field10458;

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5166(int arg0) {
      try {
         field10458 = null;
         if (arg0 != -2) {
            field10458 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10461[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "(I)Lmq;"
   )
   public static final class577 method5167(int arg0) {
      try {
         if (arg0 < 29) {
            return null;
         } else {
            ++field10460;
            return class211.field3199 == 0 ? new class577() : class210.field3192[--class211.field3199];
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10461[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(ZIIBZ)V"
   )
   public static final void method5168(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
      try {
         class145.method1311(arg1, arg2, arg4, 0, arg0, class529.field8026.length + -1, arg3 + -98);
         if (arg3 == 100) {
            ++field10457;
            class589.field8690 = 0;
            class444.field6811 = null;
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10461[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5169(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5170(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 60;
            break;
         case 1:
            var10005 = 60;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
