import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class616 {
   @OriginalMember(
      owner = "client!fn",
      name = "b",
      descriptor = "Lrr;"
   )
   private class678 field8934;
   @OriginalMember(
      owner = "client!fn",
      name = "a",
      descriptor = "I"
   )
   public int field8935;
   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8936 = new String[]{method4532(method4531("^)o\u0012{")), method4532(method4531("Cio\u0000oKn5\u0002.")), method4532(method4531("Kr-P"))};

   @OriginalMember(
      owner = "client!fn",
      name = "<init>",
      descriptor = "(Ltv;ILrr;)V",
      line = 19
   )
   public class616(class311 arg0, int arg1, class678 arg2) {
      new class304(64);

      try {
         this.field8934 = arg2;
         this.field8935 = this.field8934.method4998((byte)-82, 15);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8936[1] + (arg0 != null ? field8936[0] : field8936[2]) + ',' + arg1 + ',' + (arg2 != null ? field8936[0] : field8936[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4531(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4532(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
