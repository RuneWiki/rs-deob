import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class605 {
   @OriginalMember(
      owner = "client!iu",
      name = "d",
      descriptor = "Z"
   )
   public boolean field8884;
   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8886 = new String[]{method4406(method4405("CB\bi\u0012D^RkS")), method4406(method4405("CB\b\u0017S")), method4406(method4405("CB\b\u0014S")), method4406(method4405("CB\b\u0011S"))};
   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "I"
   )
   public static int field8880 = -1;
   @OriginalMember(
      owner = "client!iu",
      name = "h",
      descriptor = "I"
   )
   public static int field8881;
   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "I"
   )
   public static int field8882;
   @OriginalMember(
      owner = "client!iu",
      name = "f",
      descriptor = "Lwf;"
   )
   public static class147 field8885;
   @OriginalMember(
      owner = "client!iu",
      name = "c",
      descriptor = "Llba;"
   )
   public class576 field8878;
   @OriginalMember(
      owner = "client!iu",
      name = "e",
      descriptor = "Llba;"
   )
   public class576 field8883;
   @OriginalMember(
      owner = "client!iu",
      name = "g",
      descriptor = "Z"
   )
   public boolean field8879;

   @OriginalMember(
      owner = "client!iu",
      name = "b",
      descriptor = "(B)V",
      line = 4
   )
   public final void method4401(byte arg0) {
      try {
         if (this.field8878 != null) {
            this.field8878.method1412(81);
         }

         ++field8881;
         this.field8879 = false;
         if (arg0 <= 11) {
            this.field8878 = null;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8886[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(B)Z",
      line = 19
   )
   public final boolean method4402(byte arg0) {
      try {
         ++field8882;
         if (arg0 <= 56) {
            this.field8878 = null;
         }

         return this.field8879 && !this.field8884;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8886[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(Z)V",
      line = 34
   )
   public static void method4403(boolean arg0) {
      try {
         if (!arg0) {
            field8885 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field8886[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "a",
      descriptor = "(ILs;)V",
      line = 48
   )
   public static final void method4404(int arg0, class295 arg1) {
      class731.field10698[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "<init>",
      descriptor = "(Z)V",
      line = 50
   )
   public class605(boolean arg0) {
      try {
         this.field8884 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field8886[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4405(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4406(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
