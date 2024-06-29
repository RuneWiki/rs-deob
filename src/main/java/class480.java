import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class480 {
   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6994 = new String[]{method3635(method3634("L]g\u0000\u0005")), method3635(method3634("UZ%-")), method3635(method3634("@\u0001goP"))};
   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "I"
   )
   public static int field6993;

   @OriginalMember(
      owner = "client!wr",
      name = "a",
      descriptor = "(Z[B)V",
      line = 11
   )
   public static final void method3633(boolean param0, byte[] param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3634(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3635(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 59;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
