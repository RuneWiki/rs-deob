import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class536 {
   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7851 = method4073(method4072("ZM\"aK"));
   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "I"
   )
   public static int field7850;

   @OriginalMember(
      owner = "client!ct",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4071(int arg0, int arg1) {
      try {
         class768.field11204 = 3;
         class495.field6905 = 100;
         int var2 = -27 % ((arg1 - -52) / 35);
         ++field7850;
         class16.field282 = arg0;
         class204.field2600 = -1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field7851 + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4072(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 99);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ct",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4073(char[] arg0) {
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
            var10005 = 57;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 99;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
