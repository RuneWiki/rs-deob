import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class709 {
   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10416 = method5183(method5182("\u001a.>\u0019WU"));
   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "I"
   )
   public static int field10415;

   @OriginalMember(
      owner = "client!gca",
      name = "a",
      descriptor = "(Z)V"
   )
   public static final void method5181(boolean param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5182(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5183(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 125;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
