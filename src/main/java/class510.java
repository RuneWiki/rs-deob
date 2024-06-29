import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class class510 {
   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7457 = new String[]{method3866(method3865("\u0004\u0000-\"E")), method3866(method3865("\u0004\u0000-!E"))};
   @OriginalMember(
      owner = "client!aa",
      name = "d",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field7452 = new String[200];
   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field7456 = false;
   @OriginalMember(
      owner = "client!aa",
      name = "e",
      descriptor = "F"
   )
   public static float field7453;
   @OriginalMember(
      owner = "client!aa",
      name = "c",
      descriptor = "I"
   )
   public static int field7455;
   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "Lob;"
   )
   public static class768 field7454;

   @OriginalMember(
      owner = "client!aa",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method3863(int arg0) {
      try {
         field7452 = null;
         field7454 = null;
         if (arg0 != 200) {
            field7456 = true;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7457[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "b",
      descriptor = "(I)V",
      line = 23
   )
   public static final void method3864(int arg0) {
      try {
         if (arg0 != -14219) {
            field7456 = false;
         }

         ++field7455;
         class616.field8954.method1589((byte)113);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field7457[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3865(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3866(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 97;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
