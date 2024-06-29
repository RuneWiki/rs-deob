import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class669 {
   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9745 = new String[]{method4890(method4889("(O\u0001)jT?\u00028\u001d)\u001eo")), method4890(method4889("\u0004\u0001Z`#")), method4890(method4889("\u0018\u0003N=\u0007\\")), method4890(method4889("T\u0013Jp)\u001a\u0004\\=hZ")), method4890(method4889("$\u0001Z`/\u001a\u0007\u000fu)\u0006@")), method4890(method4889("\u0018\u0003N=\u0004\\"))};
   @OriginalMember(
      owner = "client!lca",
      name = "c",
      descriptor = "Lld;"
   )
   public static class178 field9742 = new class178(64);
   @OriginalMember(
      owner = "client!lca",
      name = "d",
      descriptor = "Ltv;"
   )
   public static class584 field9743 = new class584(1);
   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "I"
   )
   public static int field9744 = -1;
   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "I"
   )
   public static int field9741;

   @OriginalMember(
      owner = "client!lca",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method4887(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4888(int arg0) {
      try {
         if (arg0 != 5) {
            field9744 = 109;
         }

         field9742 = null;
         field9743 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9745[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4889(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4890(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
