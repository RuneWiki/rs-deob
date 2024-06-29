import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class242 {
   @OriginalMember(
      owner = "client!sl",
      name = "b",
      descriptor = "I"
   )
   public int field3676;
   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3681 = new String[]{method2066(method2065("J\u0005rtxW\u0000(v9")), method2066(method2065("J\u0005r<~j\u001d.!\u007f^A")), method2066(method2065("W\u001c0$")), method2066(method2065("J\u0005r\t9")), method2066(method2065("BGrfl"))};
   @OriginalMember(
      owner = "client!sl",
      name = "g",
      descriptor = "J"
   )
   public static volatile long field3680 = 0L;
   @OriginalMember(
      owner = "client!sl",
      name = "d",
      descriptor = "I"
   )
   public static int field3674;
   @OriginalMember(
      owner = "client!sl",
      name = "c",
      descriptor = "I"
   )
   public static int field3675;
   @OriginalMember(
      owner = "client!sl",
      name = "e",
      descriptor = "I"
   )
   public static int field3677;
   @OriginalMember(
      owner = "client!sl",
      name = "f",
      descriptor = "I"
   )
   public static int field3678;
   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "I"
   )
   public static int field3679;

   @OriginalMember(
      owner = "client!sl",
      name = "a",
      descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V",
      line = 10
   )
   public static final void method2064(String arg0, int arg1, String arg2, String arg3, int arg4, String arg5, int arg6) {
      try {
         ++field3677;
         class508.method3954(arg2, arg4, (String)null, arg3, arg0, arg6, false, arg1, arg5);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field3681[3] + (arg0 != null ? field3681[4] : field3681[2]) + ',' + arg1 + ',' + (arg2 != null ? field3681[4] : field3681[2]) + ',' + (arg3 != null ? field3681[4] : field3681[2]) + ',' + arg4 + ',' + (arg5 != null ? field3681[4] : field3681[2]) + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "<init>",
      descriptor = "(I)V",
      line = 20
   )
   public class242(int arg0) {
      try {
         this.field3676 = arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field3681[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 28
   )
   public final String toString() {
      try {
         ++field3675;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field3681[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2065(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2066(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 57;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 72;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
