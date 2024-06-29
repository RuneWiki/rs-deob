import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class436 {
   @OriginalMember(
      owner = "client!dg",
      name = "b",
      descriptor = "I"
   )
   public int field6058;
   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6060 = new String[]{method3250(method3249("C)\"I^")), method3250(method3249("\\`\"[JVnxY\u000b")), method3250(method3249("Vr`\u000b")), method3250(method3249("\\`\"&\u000b")), method3250(method3249("\\`\"\u0013Lks~\u000eM_/"))};
   @OriginalMember(
      owner = "client!dg",
      name = "d",
      descriptor = "J"
   )
   public static long field6059 = 0L;
   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class378 field6057 = new class378(59, -2);
   @OriginalMember(
      owner = "client!dg",
      name = "c",
      descriptor = "I"
   )
   public static int field6056;

   @OriginalMember(
      owner = "client!dg",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6056;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6060[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3248(byte arg0) {
      try {
         field6057 = null;
         if (arg0 != -45) {
            method3248((byte)-60);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6060[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "<init>",
      descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V"
   )
   public class436(String arg0, String arg1, String arg2, int arg3) {
      try {
         this.field6058 = arg3;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field6060[1] + (arg0 != null ? field6060[0] : field6060[2]) + ',' + (arg1 != null ? field6060[0] : field6060[2]) + ',' + (arg2 != null ? field6060[0] : field6060[2]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3249(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3250(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 56;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 103;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
