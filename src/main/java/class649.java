import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class649 extends class479 implements class223 {
   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9480 = new String[]{method4687(method4686("L&QMY")), method4687(method4686("Gi\u001eM\u0018^f\u0016\u0017\u001a\u001f")), method4687(method4686("Y}\u0013\u000f"))};

   @OriginalMember(
      owner = "client!paa",
      name = "<init>",
      descriptor = "(Leh;IZ[[I)V"
   )
   public class649(class379 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4686(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!paa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4687(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 55;
            break;
         case 1:
            var10005 = 8;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
