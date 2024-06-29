import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class648 {
   @OriginalMember(
      owner = "client!paa",
      name = "c",
      descriptor = "Lbba;"
   )
   private class124 field9408;
   @OriginalMember(
      owner = "client!paa",
      name = "a",
      descriptor = "J"
   )
   public long field9410;
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9411 = new String[]{method4757(method4756("a4v/c")), method4757(method4756("to4m")), method4757(method4756("j{9/\"st1u 2")), method4757(method4756("j{9/xst9mw`\u007fp"))};
   @OriginalMember(
      owner = "client!paa",
      name = "b",
      descriptor = "I"
   )
   public static int field9409;

   @OriginalMember(
      owner = "client!paa",
      name = "finalize",
      descriptor = "()V",
      line = 4
   )
   protected final void finalize() throws Throwable {
      try {
         this.field9408.method1196(34192, this.field9410);
         ++field9409;
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9411[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(Lbba;JI)V",
      line = 18
   )
   public class648(class124 arg0, long arg1, int arg2) {
      try {
         this.field9408 = arg0;
         this.field9410 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field9411[2] + (arg0 != null ? field9411[0] : field9411[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4756(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4757(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 26;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
