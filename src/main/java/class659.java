import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class659 {
   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field9301 = method4795(method4794("&S7[8"));
   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "I"
   )
   public static int field9300 = 0;
   @OriginalMember(
      owner = "client!fc",
      name = "b",
      descriptor = "I"
   )
   public static int field9299;

   @OriginalMember(
      owner = "client!fc",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method4793(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4794(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4795(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 48;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
