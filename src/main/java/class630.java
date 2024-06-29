import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class630 extends class228 {
   @OriginalMember(
      owner = "client!ffa",
      name = "p",
      descriptor = "I"
   )
   public int field9302;
   @OriginalMember(
      owner = "client!ffa",
      name = "o",
      descriptor = "I"
   )
   public int field9300;
   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9304 = new String[]{method4657(method4656("=/KjU")), method4657(method4656("7s")), method4657(method4656("(t\t(")), method4657(method4656(" g\u0004jin")), method4657(method4656(" g\u0004jkn")), method4657(method4656(" g\u0004jjn")), method4657(method4656(" g\u0004j\u0014/o\f0\u0016n"))};
   @OriginalMember(
      owner = "client!ffa",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field9301 = new int[32];
   @OriginalMember(
      owner = "client!ffa",
      name = "n",
      descriptor = "I"
   )
   public static int field9303 = 0;
   @OriginalMember(
      owner = "client!ffa",
      name = "r",
      descriptor = "I"
   )
   public static int field9298;
   @OriginalMember(
      owner = "client!ffa",
      name = "q",
      descriptor = "I"
   )
   public static int field9299;

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(BLjava/lang/String;I)Lhba;"
   )
   public static final class723 method4654(byte arg0, String arg1, int arg2) {
      try {
         ++field9299;

         class723 var3;
         try {
            var3 = (class723)Class.forName(field9304[1]).newInstance();
         } catch (Throwable var5) {
            var3 = new class501();
         }

         var3.field10574 = arg2;
         var3.field10569 = arg1;
         return arg0 < 21 ? null : var3;
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field9304[3] + arg0 + ',' + (arg1 != null ? field9304[0] : field9304[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         int var2 = -127 % ((4 - arg0) / 37);
         ++field9298;
         return class569.field8363;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field9304[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4655(int arg0) {
      try {
         field9301 = null;
         if (arg0 != 0) {
            method4654((byte)-76, (String)null, 102);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field9304[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "<init>",
      descriptor = "(Liba;Lbu;IIIIIIIIII)V"
   )
   public class630(class237 arg0, class596 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);

      try {
         this.field9302 = arg11;
         this.field9300 = arg10;
      } catch (RuntimeException var14) {
         throw class93.method866(var14, field9304[6] + (arg0 != null ? field9304[0] : field9304[2]) + ',' + (arg1 != null ? field9304[0] : field9304[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 40);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4657(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 68;
            break;
         default:
            var10005 = 40;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
