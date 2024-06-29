import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class602 {
   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8872 = new String[]{method4474(method4473("a{og5'")), method4474(method4473("t0 g\t")), method4474(method4473("a{og6'")), method4474(method4473("akb%"))};
   @OriginalMember(
      owner = "client!nea",
      name = "e",
      descriptor = "Laka;"
   )
   public static class418 field8868 = new class418(9, -2);
   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "I"
   )
   public static int field8871 = -1;
   @OriginalMember(
      owner = "client!nea",
      name = "d",
      descriptor = "I"
   )
   public static int field8867;
   @OriginalMember(
      owner = "client!nea",
      name = "c",
      descriptor = "I"
   )
   public static int field8869;
   @OriginalMember(
      owner = "client!nea",
      name = "b",
      descriptor = "[Lfga;"
   )
   public static class379[] field8870;

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(BI[II[I)V"
   )
   public static final void method4471(byte param0, int param1, int[] param2, int param3, int[] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4472(int arg0) {
      try {
         field8870 = null;
         field8868 = null;
         if (arg0 != -21025) {
            field8869 = 35;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8872[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4473(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4474(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 14;
            break;
         case 3:
            var10005 = 73;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
