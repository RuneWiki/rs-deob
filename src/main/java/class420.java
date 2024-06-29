import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public abstract class class420 {
   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field5742 = method3272(method3271("\u00116\u00124\u0006J"));
   @OriginalMember(
      owner = "client!sea",
      name = "c",
      descriptor = "I"
   )
   public static int field5739 = 0;
   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "I"
   )
   public static int field5741 = 0;
   @OriginalMember(
      owner = "client!sea",
      name = "b",
      descriptor = "I"
   )
   public static int field5738;
   @OriginalMember(
      owner = "client!sea",
      name = "d",
      descriptor = "I"
   )
   public static int field5740;

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(Z)J"
   )
   public abstract long method3269(boolean arg0);

   @OriginalMember(
      owner = "client!sea",
      name = "a",
      descriptor = "(ZI)V"
   )
   public static final void method3270(boolean arg0, int arg1) {
      try {
         ++field5738;
         class191 var2 = (class191)class705.field10295.method1818(-1, (long)arg1);
         if (var2 != null) {
            var2.field2426 = !var2.field2426;
            var2.field2423.method2774((byte)126, var2.field2426);
         }

         if (arg0) {
            field5741 = 78;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5742 + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3271(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3272(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 83;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
