import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class357 extends class438 {
   @OriginalMember(
      owner = "client!rd",
      name = "n",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field5082;
   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5084 = new String[]{method2800(method2799("\u0002J=\\%\u001eGg^d")), method2800(method2799("\u0002J=$d"))};
   @OriginalMember(
      owner = "client!rd",
      name = "m",
      descriptor = "I"
   )
   public static int field5083;

   @OriginalMember(
      owner = "client!rd",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method2798(boolean arg0) {
      try {
         if (!arg0) {
            this.method2798(true);
         }

         ++field5083;
         this.field5082.method5100();
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5084[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class357(int arg0) {
      try {
         this.field5082 = new NativeHeap(arg0);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5084[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2799(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 76);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2800(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 112;
            break;
         case 1:
            var10005 = 46;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 76;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
