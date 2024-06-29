import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public abstract class class467 extends class347 {
   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7004 = new String[]{method3497(method3496("`z\u0015/q")), method3497(method3496("`z\u0015,q"))};
   @OriginalMember(
      owner = "client!bn",
      name = "k",
      descriptor = "I"
   )
   public static int field7001 = 2;
   @OriginalMember(
      owner = "client!bn",
      name = "i",
      descriptor = "I"
   )
   public static int field7000 = -1;
   @OriginalMember(
      owner = "client!bn",
      name = "l",
      descriptor = "I"
   )
   public static int field6999;
   @OriginalMember(
      owner = "client!bn",
      name = "m",
      descriptor = "I"
   )
   public static int field7003;
   @OriginalMember(
      owner = "client!bn",
      name = "j",
      descriptor = "[[B"
   )
   public static byte[][] field7002;

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(B)I"
   )
   public abstract int method3489(byte arg0);

   @OriginalMember(
      owner = "client!bn",
      name = "e",
      descriptor = "(I)I"
   )
   public abstract int method3490(int arg0);

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(I)I"
   )
   public abstract int method3491(int arg0);

   @OriginalMember(
      owner = "client!bn",
      name = "a",
      descriptor = "(IZ)V"
   )
   public static final void method3492(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field7001 = 77;
         }

         ++field6999;
         class664 var2 = (class664)class204.field2628.method5681((long)arg0, -1);
         if (var2 != null) {
            var2.field9659 = !var2.field9659;
            var2.field9657.method4105(!arg1, var2.field9659);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field7004[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "c",
      descriptor = "(B)I"
   )
   public abstract int method3493(byte arg0);

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "(I)J"
   )
   public abstract long method3494(int arg0);

   @OriginalMember(
      owner = "client!bn",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method3495(byte arg0) {
      try {
         if (arg0 != -89) {
            method3495((byte)-21);
         }

         field7002 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7004[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3496(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3497(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 59;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
