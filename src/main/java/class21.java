import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class21 extends class606 {
   @OriginalMember(
      owner = "client!od",
      name = "J",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field323 = new String[]{method298(method297("2j\u001c(!")), method298(method297("2j\u001c*!")), method298(method297("2j\u001c%!")), method298(method297("2j\u001c.!"))};
   @OriginalMember(
      owner = "client!od",
      name = "E",
      descriptor = "Ldb;"
   )
   public static class685 field319 = new class685(0, -1);
   @OriginalMember(
      owner = "client!od",
      name = "H",
      descriptor = "I"
   )
   public static int field317;
   @OriginalMember(
      owner = "client!od",
      name = "G",
      descriptor = "I"
   )
   public static int field318;
   @OriginalMember(
      owner = "client!od",
      name = "I",
      descriptor = "I"
   )
   public static int field320;
   @OriginalMember(
      owner = "client!od",
      name = "F",
      descriptor = "I"
   )
   public static int field321;
   @OriginalMember(
      owner = "client!od",
      name = "D",
      descriptor = "I"
   )
   public static int field322;

   @OriginalMember(
      owner = "client!od",
      name = "<init>",
      descriptor = "()V"
   )
   public class21() {
      super(0, true);
   }

   @OriginalMember(
      owner = "client!od",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method294(int arg0) {
      try {
         if (arg0 < -101) {
            field319 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field323[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method295(int arg0, byte arg1) {
      try {
         ++field318;
         return arg1 != -123 ? 2 : 127 & arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field323[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "f",
      descriptor = "(I)Ljava/lang/String;"
   )
   public static final String method296(int arg0) {
      try {
         if (arg0 != 0) {
            field319 = null;
         }

         ++field321;
         return !class678.field9669 && class143.field2272 != null ? class143.field2272.field4162 : "";
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field323[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "a",
      descriptor = "(II)[I"
   )
   public final int[] method9(int arg0, int arg1) {
      try {
         if (arg0 != 0) {
            field320 = -27;
         }

         ++field322;
         return class387.field5650;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field323[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method297(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!od",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method298(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 50;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
