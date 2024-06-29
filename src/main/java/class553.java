import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class553 extends class428 {
   @OriginalMember(
      owner = "client!um",
      name = "n",
      descriptor = "I"
   )
   public int field7927;
   @OriginalMember(
      owner = "client!um",
      name = "q",
      descriptor = "I"
   )
   public int field7929;
   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7931 = new String[]{method3971(method3970("\u0019[h5i")), method3971(method3970("\u0002C*\u0018")), method3971(method3970("\u0017\u0018hZ<")), method3971(method3970("\u0019[hH(\u0002_2Ji"))};
   @OriginalMember(
      owner = "client!um",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field7925 = false;
   @OriginalMember(
      owner = "client!um",
      name = "m",
      descriptor = "F"
   )
   public static float field7928;
   @OriginalMember(
      owner = "client!um",
      name = "o",
      descriptor = "I"
   )
   public static int field7926;
   @OriginalMember(
      owner = "client!um",
      name = "r",
      descriptor = "I"
   )
   public static int field7930;

   @OriginalMember(
      owner = "client!um",
      name = "a",
      descriptor = "(ZLha;II)Lda;",
      line = 9
   )
   public static final class67 method3969(boolean arg0, class66 arg1, int arg2, int arg3) {
      try {
         if (arg3 < 40) {
            field7925 = false;
         }

         ++field7930;
         class281 var4 = class731.method5325(arg0, -94, arg1, arg2);
         return var4 == null ? null : var4.field3906;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7931[0] + arg0 + ',' + (arg1 != null ? field7931[2] : field7931[1]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "<init>",
      descriptor = "(II)V",
      line = 30
   )
   public class553(int arg0, int arg1) {
      try {
         this.field7927 = arg0;
         this.field7929 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7931[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3970(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!um",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3971(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
