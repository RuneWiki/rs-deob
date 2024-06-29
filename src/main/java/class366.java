import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class366 {
   @OriginalMember(
      owner = "client!tu",
      name = "c",
      descriptor = "Lrk;"
   )
   private class35 field5444;
   @OriginalMember(
      owner = "client!tu",
      name = "f",
      descriptor = "J"
   )
   public long field5445;
   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5448 = new String[]{method2863(method2862("^\u000bIK!D\u0017\u0013I`")), method2863(method2862("D\u000b\u000b\u001b")), method2863(method2862("QPIY5")), method2863(method2862("^\u000bI5`")), method2863(method2862("^\u000bI6`")), method2863(method2862("^\u000bI\u0011!D\u001f\u000b\u001e2OV"))};
   @OriginalMember(
      owner = "client!tu",
      name = "b",
      descriptor = "Lca;"
   )
   public static class320 field5446 = new class320(method2863(method2862("M\u001f\n\u0012|")), method2863(method2862("m\u001f\n\u0012h\u001e")), 3);
   @OriginalMember(
      owner = "client!tu",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field5447 = new int[]{0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4};
   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "F"
   )
   public static float field5442;
   @OriginalMember(
      owner = "client!tu",
      name = "d",
      descriptor = "I"
   )
   public static int field5441;
   @OriginalMember(
      owner = "client!tu",
      name = "e",
      descriptor = "I"
   )
   public static int field5443;

   @OriginalMember(
      owner = "client!tu",
      name = "finalize",
      descriptor = "()V",
      line = 13
   )
   protected final void finalize() throws Throwable {
      try {
         ++field5441;
         this.field5444.method324(this.field5445, false);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5448[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(IILrk;II)Lpe;",
      line = 26
   )
   public static final class633 method2860(int arg0, int arg1, class35 arg2, int arg3, int arg4) {
      try {
         if (arg3 != 34037) {
            return null;
         } else {
            ++field5443;
            if (arg2.field831 || class756.method5476((byte)-63, arg4) && class756.method5476((byte)-63, arg1)) {
               return new class633(arg2, 3553, arg0, arg4, arg1);
            } else {
               return arg2.field802 ? new class633(arg2, 34037, arg0, arg4, arg1) : new class633(arg2, arg0, arg4, arg1, class71.method752(arg4, true), class71.method752(arg1, true));
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5448[3] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5448[2] : field5448[1]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "<init>",
      descriptor = "(Lrk;JI)V",
      line = 44
   )
   public class366(class35 arg0, long arg1, int arg2) {
      try {
         this.field5444 = arg0;
         this.field5445 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field5448[0] + (arg0 != null ? field5448[2] : field5448[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "a",
      descriptor = "(Z)V",
      line = 55
   )
   public static void method2861(boolean arg0) {
      try {
         field5446 = null;
         field5447 = null;
         if (arg0) {
            field5446 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field5448[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2862(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2863(char[] arg0) {
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
            var10005 = 126;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
