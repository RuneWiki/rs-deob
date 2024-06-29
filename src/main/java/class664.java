import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class664 extends class347 {
   @OriginalMember(
      owner = "client!wda",
      name = "j",
      descriptor = "Loc;"
   )
   public class213 field9657;
   @OriginalMember(
      owner = "client!wda",
      name = "q",
      descriptor = "I"
   )
   public int field9656;
   @OriginalMember(
      owner = "client!wda",
      name = "o",
      descriptor = "Z"
   )
   public boolean field9658;
   @OriginalMember(
      owner = "client!wda",
      name = "k",
      descriptor = "I"
   )
   public int field9654;
   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9662 = new String[]{method4763(method4762("\u001feA\nY")), method4763(method4762("\u0013/\u000e\n\u0018\r%\u0006P\u001aL")), method4763(method4762("\n>\u0003H")), method4763(method4762("\u0013/\u000e\neL"))};
   @OriginalMember(
      owner = "client!wda",
      name = "l",
      descriptor = "Lsda;"
   )
   public static class269 field9655 = new class269(74, -1);
   @OriginalMember(
      owner = "client!wda",
      name = "m",
      descriptor = "Z"
   )
   public boolean field9653;
   @OriginalMember(
      owner = "client!wda",
      name = "n",
      descriptor = "Z"
   )
   public boolean field9659;
   @OriginalMember(
      owner = "client!wda",
      name = "p",
      descriptor = "Z"
   )
   public boolean field9660;
   @OriginalMember(
      owner = "client!wda",
      name = "i",
      descriptor = "[[[I"
   )
   public static int[][][] field9661;

   @OriginalMember(
      owner = "client!wda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4761(int arg0) {
      try {
         if (arg0 != 24070) {
            method4761(-8);
         }

         field9655 = null;
         field9661 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9662[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "<init>",
      descriptor = "(ILoc;IZ)V"
   )
   public class664(int arg0, class213 arg1, int arg2, boolean arg3) {
      try {
         this.field9657 = arg1;
         this.field9656 = arg2;
         this.field9658 = arg3;
         this.field9654 = arg0;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field9662[1] + arg0 + ',' + (arg1 != null ? field9662[0] : field9662[2]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4762(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4763(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 111;
            break;
         case 3:
            var10005 = 36;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
