import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public class class535 extends InputStream {
   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7522 = new String[]{method3993(method3992("'w\u0001m\u000fa")), method3993(method3992("'w\u0001m<,r\u0004k"))};
   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "I"
   )
   public static int field7519;
   @OriginalMember(
      owner = "client!nda",
      name = "c",
      descriptor = "I"
   )
   public static int field7520;
   @OriginalMember(
      owner = "client!nda",
      name = "b",
      descriptor = "I"
   )
   public static int field7521;

   @OriginalMember(
      owner = "client!nda",
      name = "read",
      descriptor = "()I"
   )
   public final int read() {
      try {
         ++field7520;
         class97.method968(32353, 30000L);
         return -1;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7522[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method3991(byte arg0, int arg1) {
      try {
         ++field7519;
         class111 var2 = class796.method5734(10, (long)arg1, (byte)-108);
         if (arg0 != -67) {
            field7521 = -61;
         }

         var2.method1083(arg0 ^ 86);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field7522[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3992(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 78);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3993(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 73;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 78;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
