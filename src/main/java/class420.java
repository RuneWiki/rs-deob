import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class420 {
   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6125 = new String[]{method3197(method3196(":jQz8")), method3197(method3196("&%Q\u0015m")), method3197(method3196("3~\u0013W"))};
   @OriginalMember(
      owner = "client!ga",
      name = "b",
      descriptor = "I"
   )
   public static int field6124 = 0;
   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "I"
   )
   public static int field6123;

   @OriginalMember(
      owner = "client!ga",
      name = "a",
      descriptor = "(Lhw;ILha;)V"
   )
   public static final void method3195(class141 param0, int param1, class65 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3196(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3197(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
