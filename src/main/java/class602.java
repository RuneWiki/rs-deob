import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class602 {
   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8850 = new String[]{method4382(method4381("CU/3Z\r")), method4382(method4381("CU/3Y\r"))};
   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "Leg;"
   )
   public static class118 field8846 = new class118(85, 3);
   @OriginalMember(
      owner = "client!fia",
      name = "e",
      descriptor = "Lbl;"
   )
   public static class678 field8848 = null;
   @OriginalMember(
      owner = "client!fia",
      name = "d",
      descriptor = "I"
   )
   public static int field8845;
   @OriginalMember(
      owner = "client!fia",
      name = "b",
      descriptor = "I"
   )
   public static int field8847;
   @OriginalMember(
      owner = "client!fia",
      name = "c",
      descriptor = "J"
   )
   public static long field8849;

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(BI)Lbl;"
   )
   public static final class678 method4379(byte arg0, int arg1) {
      try {
         ++field8845;
         int var2 = arg1 >> 16;
         int var3 = 65535 & arg1;
         if (arg0 > -120) {
            field8847 = 56;
         }

         if (class547.field7851[var2] == null || class547.field7851[var2][var3] == null) {
            boolean var4 = class635.method4596(var2, 28505);
            if (!var4) {
               return null;
            }
         }

         return class547.field7851[var2][var3];
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field8850[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4380(int arg0) {
      try {
         if (arg0 == 65535) {
            field8846 = null;
            field8848 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8850[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4381(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4382(char[] arg0) {
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
            var10005 = 60;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
