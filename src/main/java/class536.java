import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class536 {
   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "I"
   )
   public int field7669;
   @OriginalMember(
      owner = "client!ek",
      name = "g",
      descriptor = "I"
   )
   private int field7668;
   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7674 = new String[]{method3876(method3875("Gz\u0010[L")), method3876(method3875("Gz\u0010&\rLxJ$L")), method3876(method3875("Gz\u0010n\u000bqeLs\nE9")), method3876(method3875("Gz\u0010XL"))};
   @OriginalMember(
      owner = "client!ek",
      name = "c",
      descriptor = "Leg;"
   )
   public static class118 field7670 = new class118(49, 6);
   @OriginalMember(
      owner = "client!ek",
      name = "f",
      descriptor = "I"
   )
   public static int field7667;
   @OriginalMember(
      owner = "client!ek",
      name = "e",
      descriptor = "I"
   )
   public static int field7673;
   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "Lkf;"
   )
   public static class266 field7672;
   @OriginalMember(
      owner = "client!ek",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field7671;

   @OriginalMember(
      owner = "client!ek",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3873(int arg0) {
      try {
         ++field7667;
         int var2 = -117 % ((arg0 - -7) / 42);
         return this.field7668;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7674[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field7673;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7674[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3874(int arg0) {
      try {
         int var1 = -88 / ((arg0 - -8) / 56);
         field7672 = null;
         field7670 = null;
         field7671 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7674[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class536(int arg0, int arg1) {
      try {
         this.field7669 = arg1;
         this.field7668 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7674[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3875(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ek",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3876(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
