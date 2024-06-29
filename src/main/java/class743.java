import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public abstract class class743 extends class546 {
   @OriginalMember(
      owner = "client!lga",
      name = "u",
      descriptor = "Z"
   )
   public volatile boolean field10819 = true;
   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10822 = new String[]{method5378(method5377("J8Uj\u0005\u000e")), method5378(method5377("J8Uj\u0006\u000e"))};
   @OriginalMember(
      owner = "client!lga",
      name = "w",
      descriptor = "Lnw;"
   )
   public static class616 field10820 = new class616(84, 7);
   @OriginalMember(
      owner = "client!lga",
      name = "v",
      descriptor = "Z"
   )
   public boolean field10818;
   @OriginalMember(
      owner = "client!lga",
      name = "t",
      descriptor = "Z"
   )
   public boolean field10821;

   @OriginalMember(
      owner = "client!lga",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method971(int arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "b",
      descriptor = "(II)I"
   )
   public static int method5375(int arg0, int arg1) {
      try {
         return arg0 & arg1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10822[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "e",
      descriptor = "(I)[B"
   )
   public abstract byte[] method969(int arg0);

   @OriginalMember(
      owner = "client!lga",
      name = "c",
      descriptor = "(Z)V"
   )
   public static void method5376(boolean arg0) {
      try {
         if (!arg0) {
            method5376(false);
         }

         field10820 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10822[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5377(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5378(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 95;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
