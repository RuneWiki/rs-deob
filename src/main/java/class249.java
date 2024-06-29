import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class249 extends class305 {
   @OriginalMember(
      owner = "client!tea",
      name = "w",
      descriptor = "Lcba;"
   )
   public class574 field3578;
   @OriginalMember(
      owner = "client!tea",
      name = "x",
      descriptor = "I"
   )
   public int field3580;
   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3581 = new String[]{method2025(method2024("\r_\u0018z")), method2025(method2024("\u0017O\u00158\u0002\nD\u001db\u0000K")), method2025(method2024("\u0018\u0004Z8C"))};
   @OriginalMember(
      owner = "client!tea",
      name = "v",
      descriptor = "I"
   )
   public static int field3579;

   @OriginalMember(
      owner = "client!tea",
      name = "<init>",
      descriptor = "(Lcba;I)V",
      line = 7
   )
   public class249(class574 arg0, int arg1) {
      try {
         this.field3578 = arg0;
         this.field3580 = arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3581[1] + (arg0 != null ? field3581[2] : field3581[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(B)Z"
   )
   public abstract boolean method2022(byte arg0);

   @OriginalMember(
      owner = "client!tea",
      name = "b",
      descriptor = "(B)Ljava/lang/Object;"
   )
   public abstract Object method2023(byte arg0);

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2024(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 62);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2025(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 62;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
