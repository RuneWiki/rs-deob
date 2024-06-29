import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class762 {
   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "I"
   )
   public int field11042;
   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11045 = new String[]{method5508(method5507("=\u0002\tKO")), method5508(method5507("#\u0010Kf")), method5508(method5507("=\u0002\t6\u000e#\fS4O")), method5508(method5507("6K\t$\u001a")), method5508(method5507("=\u0002\t~\b\u001e\u0011Uc\t*M"))};
   @OriginalMember(
      owner = "client!pg",
      name = "c",
      descriptor = "Lld;"
   )
   public static class178 field11043 = new class178(512);
   @OriginalMember(
      owner = "client!pg",
      name = "b",
      descriptor = "I"
   )
   public static int field11044;

   @OriginalMember(
      owner = "client!pg",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 8
   )
   public final String toString() {
      try {
         ++field11044;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11045[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "a",
      descriptor = "(I)V",
      line = 19
   )
   public static void method5506(int arg0) {
      try {
         if (arg0 != 512) {
            method5506(-23);
         }

         field11043 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field11045[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V",
      line = 34
   )
   public class762(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field11042 = arg3;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field11045[2] + (arg0 != null ? field11045[3] : field11045[1]) + ',' + (arg1 != null ? field11045[3] : field11045[1]) + ',' + (arg2 != null ? field11045[3] : field11045[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5507(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 103);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5508(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 39;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 103;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
