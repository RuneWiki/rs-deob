import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class524 {
   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7996 = new String[]{method4049(method4048("$MzI4")), method4049(method4048("$MzJ4")), method4049(method4048("$MzK4"))};
   @OriginalMember(
      owner = "client!em",
      name = "d",
      descriptor = "F"
   )
   public static float field7992 = 0.25F;
   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field7994 = new int[4096];
   @OriginalMember(
      owner = "client!em",
      name = "c",
      descriptor = "[S"
   )
   public static short[] field7995 = new short[256];
   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "I"
   )
   public static int field7991;
   @OriginalMember(
      owner = "client!em",
      name = "e",
      descriptor = "I"
   )
   public static int field7993;

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(III)V",
      line = 8
   )
   public static final void method4045(int arg0, int arg1, int arg2) {
      try {
         ++field7991;
         if (class225.method1954(-116)) {
            class444.field6812 = arg1;
            if (class727.field10854 != arg2) {
               class654.field9782 = "";
            }

            class727.field10854 = arg2;
            class69.method532(1, arg0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7996[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "a",
      descriptor = "(I)V",
      line = 35
   )
   public static void method4046(int arg0) {
      try {
         field7994 = null;
         if (arg0 == 6) {
            field7995 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7996[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "b",
      descriptor = "(I)J",
      line = 46
   )
   public static final long method4047(int arg0) {
      try {
         if (arg0 != 6) {
            return -65L;
         } else {
            ++field7993;
            return class255.field3856.method2300(-127);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7996[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4048(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!em",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4049(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 65;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 84;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
