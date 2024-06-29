import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class668 extends class294 {
   @OriginalMember(
      owner = "client!og",
      name = "n",
      descriptor = "I"
   )
   public int field9986;
   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9988 = new String[]{method4928(method4927("jxd>ekv><$")), method4928(method4927("jxdC$"))};
   @OriginalMember(
      owner = "client!og",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field9987 = new class498(45, 10);

   @OriginalMember(
      owner = "client!og",
      name = "<init>",
      descriptor = "()V"
   )
   public class668() {
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method4926(byte arg0) {
      try {
         if (arg0 != 48) {
            field9987 = null;
         }

         field9987 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9988[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class668(int arg0) {
      try {
         this.field9986 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9988[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4927(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 12);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4928(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 31;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 12;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
