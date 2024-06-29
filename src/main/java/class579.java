import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class579 {
   @OriginalMember(
      owner = "client!ii",
      name = "c",
      descriptor = "I"
   )
   public int field8583;
   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8586 = new String[]{method4272(method4271("\u0007n\bCg\u0000nRA&")), method4272(method4271("\u0007n\b>&")), method4272(method4271("\u0007n\b\u000ba=sT\u0016`\t/"))};
   @OriginalMember(
      owner = "client!ii",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field8584 = new int[4096];
   @OriginalMember(
      owner = "client!ii",
      name = "d",
      descriptor = "Ljava/util/zip/CRC32;"
   )
   public static CRC32 field8582 = new CRC32();
   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "I"
   )
   public static int field8585;

   @OriginalMember(
      owner = "client!ii",
      name = "a",
      descriptor = "(I)V",
      line = 7
   )
   public static void method4270(int arg0) {
      try {
         if (arg0 <= 100) {
            method4270(-112);
         }

         field8584 = null;
         field8582 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8586[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "<init>",
      descriptor = "(I)V",
      line = 19
   )
   public class579(int arg0) {
      try {
         this.field8583 = arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field8586[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 28
   )
   public final String toString() {
      try {
         ++field8585;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field8586[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4271(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ii",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4272(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 110;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 38;
            break;
         case 3:
            var10005 = 127;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
