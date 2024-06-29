import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class243 extends class428 {
   @OriginalMember(
      owner = "client!jd",
      name = "o",
      descriptor = "I"
   )
   public int field3358;
   @OriginalMember(
      owner = "client!jd",
      name = "s",
      descriptor = "I"
   )
   public int field3363;
   @OriginalMember(
      owner = "client!jd",
      name = "p",
      descriptor = "I"
   )
   public int field3361;
   @OriginalMember(
      owner = "client!jd",
      name = "n",
      descriptor = "I"
   )
   public int field3357;
   @OriginalMember(
      owner = "client!jd",
      name = "m",
      descriptor = "Z"
   )
   public boolean field3360;
   @OriginalMember(
      owner = "client!jd",
      name = "q",
      descriptor = "I"
   )
   public int field3359;
   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3364 = method1856(method1855("q8\u0007`Ju5]b\u000b"));
   @OriginalMember(
      owner = "client!jd",
      name = "r",
      descriptor = "S"
   )
   public static short field3362 = 256;

   @OriginalMember(
      owner = "client!jd",
      name = "<init>",
      descriptor = "(IIIIIZ)V",
      line = 13
   )
   public class243(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         this.field3358 = arg0;
         this.field3363 = arg3;
         this.field3361 = arg4;
         this.field3357 = arg2;
         this.field3360 = arg5;
         this.field3359 = arg1;
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field3364 + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1855(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1856(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 92;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
