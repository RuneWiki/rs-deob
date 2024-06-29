import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class278 extends class673 {
   @OriginalMember(
      owner = "client!ke",
      name = "p",
      descriptor = "I"
   )
   public int field3546;
   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3552 = new String[]{method2198(method2197("NoSE")), method2198(method2197("K\u007f\u0011k5")), method2198(method2197("[4\u0011\u0007`")), method2198(method2197("K\u007f\u0011\u0015tNsK\u00175")), method2198(method2197("K\u007f\u0011h5")), method2198(method2197("K\u007f\u0011j5"))};
   @OriginalMember(
      owner = "client!ke",
      name = "l",
      descriptor = "Lse;"
   )
   public static class6 field3551 = new class6(60, 3);
   @OriginalMember(
      owner = "client!ke",
      name = "n",
      descriptor = "I"
   )
   public static int field3547;
   @OriginalMember(
      owner = "client!ke",
      name = "q",
      descriptor = "I"
   )
   public static int field3548;
   @OriginalMember(
      owner = "client!ke",
      name = "m",
      descriptor = "I"
   )
   public static int field3550;
   @OriginalMember(
      owner = "client!ke",
      name = "o",
      descriptor = "[I"
   )
   public static int[] field3549;

   @OriginalMember(
      owner = "client!ke",
      name = "<init>",
      descriptor = "()V"
   )
   public class278() {
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2194(byte arg0) {
      try {
         field3549 = null;
         field3551 = null;
         if (arg0 != 1) {
            method2196(true, 81, 45, -8, (class731[][][])null, (byte)-77);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3552[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method2195(int arg0, int arg1, int arg2) {
      try {
         class328.method2606((byte)-41, arg0, arg2);
         ++field3548;
         if (arg1 != 1882) {
            field3549 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field3552[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class278(int arg0) {
      try {
         this.field3546 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3552[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ke",
      name = "a",
      descriptor = "(ZIII[[[Lbq;B)Z"
   )
   public static final boolean method2196(boolean param0, int param1, int param2, int param3, class731[][][] param4, byte param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2197(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ke",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2198(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 41;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
