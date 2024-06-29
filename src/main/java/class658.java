import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class658 {
   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9553 = new String[]{method4735(method4734("kf\u0004\u0017_")), method4735(method4734("kf\u0004\u0014_")), method4735(method4734("d~F:")), method4735(method4734("q%\u0004x\n")), method4735(method4734("kf\u0004\u0015_")), method4735(method4734("kf\u0004\"\u0018Y\u007fX?\u0019m#"))};
   @OriginalMember(
      owner = "client!am",
      name = "j",
      descriptor = "Lam;"
   )
   public static class658 field9544 = new class658();
   @OriginalMember(
      owner = "client!am",
      name = "i",
      descriptor = "Lam;"
   )
   public static class658 field9547 = new class658();
   @OriginalMember(
      owner = "client!am",
      name = "e",
      descriptor = "Lam;"
   )
   public static class658 field9548 = new class658();
   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "Lam;"
   )
   public static class658 field9549 = new class658();
   @OriginalMember(
      owner = "client!am",
      name = "g",
      descriptor = "Lsd;"
   )
   public static class101 field9550 = new class101(110, 1);
   @OriginalMember(
      owner = "client!am",
      name = "c",
      descriptor = "I"
   )
   public static int field9551 = 0;
   @OriginalMember(
      owner = "client!am",
      name = "d",
      descriptor = "I"
   )
   public static int field9552 = 0;
   @OriginalMember(
      owner = "client!am",
      name = "f",
      descriptor = "I"
   )
   public static int field9543;
   @OriginalMember(
      owner = "client!am",
      name = "b",
      descriptor = "I"
   )
   public static int field9545;
   @OriginalMember(
      owner = "client!am",
      name = "h",
      descriptor = "I"
   )
   public static int field9546;

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4731(int arg0) {
      try {
         field9550 = null;
         field9544 = null;
         field9549 = null;
         field9548 = null;
         if (arg0 != 0) {
            field9547 = null;
         }

         field9547 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9553[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9543;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9553[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(II)Ljava/lang/String;"
   )
   public static final String method4732(int arg0, int arg1) {
      try {
         ++field9546;
         if (arg1 != 8891) {
            method4733(-121, -32, 3L, 26, (byte)-70, true, (class526)null);
         }

         class664 var2 = (class664)class204.field2628.method5681((long)arg0, -1);
         if (var2 != null) {
            class189 var3 = var2.field9657.method4104(557);
            if (var3 != null) {
               double var4 = var2.field9657.method4115(arg1 + 10009);
               if (var4 >= (double)var3.method1472(arg1 + -8891) && var4 <= (double)var3.method1471(arg1 ^ 8910)) {
                  return var3.method1469((byte)-39);
               }
            }
         }

         return null;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field9553[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "a",
      descriptor = "(IIJIBZLeaa;)V"
   )
   public static final void method4733(int arg0, int arg1, long arg2, int arg3, byte arg4, boolean arg5, class526 arg6) {
      try {
         ++field9545;
         if (arg4 != 61) {
            field9549 = null;
         }

         class689.method5017(0, arg0, arg3, arg5, arg1, (byte)-115, arg2, arg6);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9553[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9553[3] : field9553[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4734(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!am",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4735(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 42;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
