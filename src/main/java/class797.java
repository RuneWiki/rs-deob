import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class797 {
   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11602 = new String[]{method5749(method5748("zu8 m")), method5749(method5748("g<8M8")), method5749(method5748("zu8\"m")), method5749(method5748("rgz\u000f")), method5749(method5748("zu8!m"))};
   @OriginalMember(
      owner = "client!fg",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field11600 = new int[1];
   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field11597 = new class498(14, 0);
   @OriginalMember(
      owner = "client!fg",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field11601 = false;
   @OriginalMember(
      owner = "client!fg",
      name = "e",
      descriptor = "I"
   )
   public static int field11598;
   @OriginalMember(
      owner = "client!fg",
      name = "d",
      descriptor = "I"
   )
   public static int field11599;

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method5745(int arg0, byte arg1) {
      try {
         if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
         }

         ++field11598;
         if (arg1 != -10) {
            field11601 = true;
         }

         class539.field8133 = arg0;
         class33.field413 = new class743[class799.field11623[class539.field8133] + 1];
         class393.field6164 = 0;
         class683.field10167 = 0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field11602[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5746(int arg0) {
      try {
         field11597 = null;
         field11600 = null;
         if (arg0 != 1) {
            method5745(97, (byte)108);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11602[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "a",
      descriptor = "(Lica;I)Lpg;"
   )
   public static final class725 method5747(class354 arg0, int arg1) {
      try {
         if (arg1 != -20910) {
            return null;
         } else {
            ++field11599;
            class603 var2 = class429.method3392(72, arg0);
            int var3 = arg0.method2894(119);
            int var4 = arg0.method2894(108);
            return new class725(var2.field8810, var2.field8815, var2.field8819, var2.field8823, var2.field8820, var2.field8811, var2.field8818, var2.field8822, var2.field8814, var3, var4);
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11602[2] + (arg0 != null ? field11602[1] : field11602[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5748(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 69);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5749(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 18;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 69;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
