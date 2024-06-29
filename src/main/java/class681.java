import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class681 {
   @OriginalMember(
      owner = "client!fea",
      name = "g",
      descriptor = "I"
   )
   public int field10027;
   @OriginalMember(
      owner = "client!fea",
      name = "h",
      descriptor = "I"
   )
   public int field10023;
   @OriginalMember(
      owner = "client!fea",
      name = "b",
      descriptor = "I"
   )
   public int field10025;
   @OriginalMember(
      owner = "client!fea",
      name = "i",
      descriptor = "I"
   )
   public int field10028;
   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10033 = new String[]{method4965(method4964("\u000e;?\u0017x@")), method4965(method4964("\u000e;?\u0017M\u0007\r*KP\u00069v")), method4965(method4964("\u000e;?\u0017\u0005\u000107M\u0007@"))};
   @OriginalMember(
      owner = "client!fea",
      name = "c",
      descriptor = "Lse;"
   )
   public static class6 field10026 = new class6(51, 3);
   @OriginalMember(
      owner = "client!fea",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field10030 = false;
   @OriginalMember(
      owner = "client!fea",
      name = "j",
      descriptor = "I"
   )
   public static int field10031 = -2;
   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field10029 = new String[100];
   @OriginalMember(
      owner = "client!fea",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field10032 = false;
   @OriginalMember(
      owner = "client!fea",
      name = "f",
      descriptor = "I"
   )
   public static int field10024;

   @OriginalMember(
      owner = "client!fea",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field10024;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10033[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4963(int arg0) {
      try {
         field10026 = null;
         field10029 = null;
         if (arg0 < 106) {
            field10030 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10033[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "<init>",
      descriptor = "(IIII)V"
   )
   public class681(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field10027 = arg2;
         this.field10023 = arg1;
         this.field10025 = arg0;
         this.field10028 = arg3;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field10033[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4964(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4965(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
