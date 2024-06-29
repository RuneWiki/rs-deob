import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class444 extends class502 {
   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field6015;
   @OriginalMember(
      owner = "client!jm",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6021 = new String[]{method3413(method3412("\u0017_\u0017/]")), method3413(method3412("\u0017_\u0017,]")), method3413(method3412("\u0017_\u0017.]")), method3413(method3412("\u0006\u001c\u0017C\b")), method3413(method3412("\u0017_\u0017Q\u001c\u0013[MS]")), method3413(method3412("\u0013GU\u0001"))};
   @OriginalMember(
      owner = "client!jm",
      name = "G",
      descriptor = "[I"
   )
   public static int[] field6018 = new int[]{2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0};
   @OriginalMember(
      owner = "client!jm",
      name = "y",
      descriptor = "Z"
   )
   public static boolean field6020 = true;
   @OriginalMember(
      owner = "client!jm",
      name = "E",
      descriptor = "Lse;"
   )
   public static class6 field6019 = new class6(9, 7);
   @OriginalMember(
      owner = "client!jm",
      name = "A",
      descriptor = "I"
   )
   public static int field6016;
   @OriginalMember(
      owner = "client!jm",
      name = "C",
      descriptor = "I"
   )
   public static int field6017;

   @OriginalMember(
      owner = "client!jm",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V"
   )
   public class444(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field6015 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6021[4] + (arg0 != null ? field6021[3] : field6021[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method3411(boolean arg0) {
      try {
         field6019 = null;
         field6018 = null;
         if (arg0) {
            field6020 = true;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6021[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method1583(byte arg0) {
      try {
         ++field6017;
         if (arg0 != 43) {
            field6019 = null;
         }

         return false;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6021[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "a",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public final Object method1582(byte arg0) {
      try {
         ++field6016;
         int var2 = -9 % ((61 - arg0) / 57);
         return this.field6015;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6021[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3412(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3413(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 50;
            break;
         case 2:
            var10005 = 57;
            break;
         case 3:
            var10005 = 109;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
