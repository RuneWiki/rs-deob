import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class679 extends class744 {
   @OriginalMember(
      owner = "client!fk",
      name = "D",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10211 = new String[]{method4956(method4955("\u001b1\nQ\u0006")), method4956(method4955("\u001b1\nW\u0006"))};
   @OriginalMember(
      owner = "client!fk",
      name = "C",
      descriptor = "I"
   )
   public static int field10209;
   @OriginalMember(
      owner = "client!fk",
      name = "A",
      descriptor = "I"
   )
   public static int field10210;

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(FB)V"
   )
   public final void method1398(float arg0, byte arg1) {
      try {
         int var3 = 113 / ((43 - arg1) / 51);
         super.field11028 = arg0;
         ++field10209;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10211[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "<init>",
      descriptor = "(IIIIIF)V"
   )
   public class679(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      super(arg0, arg1, arg2, arg3, arg4, arg5);
   }

   @OriginalMember(
      owner = "client!fk",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method1397(int arg0, int arg1, int arg2, int arg3) {
      try {
         super.field11038 = arg1;
         if (arg0 != 2969) {
            this.method1398(-0.93983746F, (byte)52);
         }

         ++field10210;
         super.field11027 = arg2;
         super.field11031 = arg3;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10211[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4955(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4956(char[] arg0) {
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
            var10005 = 90;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
