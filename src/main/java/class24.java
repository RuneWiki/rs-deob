import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class24 extends class305 {
   @OriginalMember(
      owner = "client!qo",
      name = "w",
      descriptor = "D"
   )
   public double field366;
   @OriginalMember(
      owner = "client!qo",
      name = "v",
      descriptor = "[[S"
   )
   public short[][] field367;
   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field368 = new String[]{method170(method169("n4IUL")), method170(method169("q.\u000bx")), method170(method169("n4I(\rq2\u0013*L")), method170(method169("duI:\u0019"))};
   @OriginalMember(
      owner = "client!qo",
      name = "x",
      descriptor = "I"
   )
   public static int field365;

   @OriginalMember(
      owner = "client!qo",
      name = "a",
      descriptor = "(I)J"
   )
   public final long method168(int arg0) {
      try {
         ++field365;
         if (arg0 != -1038131104) {
            this.field367 = null;
         }

         return (long)(this.field367[0].length | this.field367.length << 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field368[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class24(short[][] arg0, double arg1) {
      try {
         this.field366 = arg1;
         this.field367 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field368[2] + (arg0 != null ? field368[3] : field368[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method169(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method170(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 31;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
