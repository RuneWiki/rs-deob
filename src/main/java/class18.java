import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class18 {
   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field239 = method141(method140("VGw\u000b4"));
   @OriginalMember(
      owner = "client!de",
      name = "c",
      descriptor = "I"
   )
   public static int field238 = 0;
   @OriginalMember(
      owner = "client!de",
      name = "b",
      descriptor = "I"
   )
   public static int field236;
   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "I"
   )
   public static int field237;

   @OriginalMember(
      owner = "client!de",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method139(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method140(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 28);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!de",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method141(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 34;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 28;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
