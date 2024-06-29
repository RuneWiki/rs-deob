import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class300 {
   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "Lda;"
   )
   public class66 field4196 = null;
   @OriginalMember(
      owner = "client!uu",
      name = "b",
      descriptor = "Lika;"
   )
   public class445 field4198 = null;
   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4200 = new String[]{method2342(method2341("_;1b\f")), method2342(method2341("D;sO")), method2342(method2341("Q`1\rY")), method2342(method2341("_;1\u001fMD'k\u001d\f"))};
   @OriginalMember(
      owner = "client!uu",
      name = "c",
      descriptor = "Luda;"
   )
   public static class473 field4197 = new class473(1350);
   @OriginalMember(
      owner = "client!uu",
      name = "d",
      descriptor = "Ltp;"
   )
   public static class557 field4199;

   @OriginalMember(
      owner = "client!uu",
      name = "a",
      descriptor = "(I)V",
      line = 4
   )
   public static void method2340(int arg0) {
      try {
         field4197 = null;
         int var1 = 2 % ((-55 - arg0) / 37);
         field4199 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4200[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "<init>",
      descriptor = "(Lda;)V",
      line = 26
   )
   public class300(class66 arg0) {
      try {
         this.field4196 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field4200[3] + (arg0 != null ? field4200[2] : field4200[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "<init>",
      descriptor = "(Lda;Lika;)V",
      line = 33
   )
   public class300(class66 arg0, class445 arg1) {
      try {
         this.field4196 = arg0;
         this.field4198 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field4200[3] + (arg0 != null ? field4200[2] : field4200[1]) + ',' + (arg1 != null ? field4200[2] : field4200[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2341(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uu",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2342(char[] arg0) {
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
            var10005 = 78;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
