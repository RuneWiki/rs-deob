import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class567 {
   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8054 = new String[]{method4212(method4211("K!$c]")), method4212(method4211("_h$\f\b")), method4212(method4211("^zf!")), method4212(method4211("_h$\u000f\b"))};
   @OriginalMember(
      owner = "client!og",
      name = "b",
      descriptor = "I"
   )
   public static int field8052;
   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "Lup;"
   )
   public static class533 field8053;

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4209(int arg0) {
      try {
         field8053 = null;
         if (arg0 != -24672) {
            field8053 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8054[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "a",
      descriptor = "(Ljga;Ljga;B)V"
   )
   public static final void method4210(class91 arg0, class91 arg1, byte arg2) {
      try {
         ++class265.field4049;
         ++field8052;
         class381 var3 = class801.method5775(class390.field5673, 0, class745.field10605.field3718);
         var3.field5570.method653(arg0.field1428, -116);
         if (arg2 == -34) {
            var3.field5570.method674(arg2 ^ 6, arg0.field1356);
            var3.field5570.method636(false, arg1.field1428);
            var3.field5570.method650(false, arg1.field1356);
            var3.field5570.method675(-32331, arg1.field1362);
            var3.field5570.method643(arg0.field1362, true);
            class745.field10605.method2111(14024, var3);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8054[1] + (arg0 != null ? field8054[0] : field8054[2]) + ',' + (arg1 != null ? field8054[0] : field8054[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4211(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 32);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!og",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4212(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 48;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 10;
            break;
         case 3:
            var10005 = 77;
            break;
         default:
            var10005 = 32;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
