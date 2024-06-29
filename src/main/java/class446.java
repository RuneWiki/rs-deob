import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class446 {
   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "I"
   )
   public int field6345;
   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6350 = new String[]{method3278(method3277("w^\"n\nAZ~s\u000bu\u0006")), method3278(method3277("w^\"[M")), method3278(method3277("w^\"&\f|Gx$M")), method3278(method3277("w^\"YM"))};
   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "Lic;"
   )
   public static class729 field6343 = new class729(method3278(method3277("Eg\\")), 2);
   @OriginalMember(
      owner = "client!ep",
      name = "g",
      descriptor = "I"
   )
   public static int field6348 = 16777215;
   @OriginalMember(
      owner = "client!ep",
      name = "e",
      descriptor = "I"
   )
   public static int field6349 = -60;
   @OriginalMember(
      owner = "client!ep",
      name = "d",
      descriptor = "I"
   )
   public static int field6344;
   @OriginalMember(
      owner = "client!ep",
      name = "c",
      descriptor = "I"
   )
   public static int field6346;
   @OriginalMember(
      owner = "client!ep",
      name = "f",
      descriptor = "Lkf;"
   )
   public static class266 field6347;

   @OriginalMember(
      owner = "client!ep",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static void method3274(int arg0) {
      try {
         field6347 = null;
         field6343 = null;
         if (arg0 <= 16) {
            method3274(-63);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6350[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(III)V",
      line = 20
   )
   public static final void method3275(int arg0, int arg1, int arg2) {
      class517 var3 = class663.field9659[arg0][arg1][arg2];
      if (var3 != null) {
         class32.method286(var3.field7476);
         class32.method286(var3.field7469);
         if (var3.field7476 != null) {
            var3.field7476 = null;
         }

         if (var3.field7469 != null) {
            var3.field7469 = null;
         }
      }

   }

   @OriginalMember(
      owner = "client!ep",
      name = "a",
      descriptor = "(I)Lfs;",
      line = 35
   )
   public static final class582 method3276(int arg0) {
      try {
         ++field6344;
         if (arg0 != 16777215) {
            method3275(61, -74, 95);
         }

         return class270.field3737;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6350[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 47
   )
   public final String toString() {
      try {
         ++field6346;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6350[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "<init>",
      descriptor = "(I)V",
      line = 57
   )
   public class446(int arg0) {
      try {
         this.field6345 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field6350[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3277(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ep",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3278(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
