import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class237 {
   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3002 = new String[]{method1772(method1771("a?BG\u0012")), method1772(method1771("a?BD\u0012"))};
   @OriginalMember(
      owner = "client!rt",
      name = "c",
      descriptor = "I"
   )
   public static int field2999 = -1;
   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field3000 = new int[1];
   @OriginalMember(
      owner = "client!rt",
      name = "b",
      descriptor = "I"
   )
   public static int field3001;

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(IJ)V",
      line = 5
   )
   public static final void method1769(int arg0, long arg1) {
      try {
         ++field3001;
         class447.field6795.setTime(new Date(arg1));
         if (arg0 != -1) {
            method1770(-31);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3002[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "a",
      descriptor = "(I)V",
      line = 22
   )
   public static void method1770(int arg0) {
      try {
         field3000 = null;
         if (arg0 >= -75) {
            method1770(115);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3002[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1771(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1772(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 19;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 108;
            break;
         case 3:
            var10005 = 5;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
