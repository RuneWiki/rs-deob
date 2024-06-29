import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class598 extends class773 {
   @OriginalMember(
      owner = "client!ip",
      name = "E",
      descriptor = "I"
   )
   public int field8833;
   @OriginalMember(
      owner = "client!ip",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8839 = new String[]{method4452(method4451("2\u0012\"}c")), method4452(method4451(" L\"\u00176")), method4452(method4451("5\u0017`U")), method4452(method4451("2\u0012\"xc")), method4452(method4451("2\u0012\"zc")), method4452(method4451("2\u0012\"{c")), method4452(method4451("2\u0012\"\u0005\"5\u000bx\u0007c"))};
   @OriginalMember(
      owner = "client!ip",
      name = "J",
      descriptor = "Z"
   )
   public static boolean field8829 = false;
   @OriginalMember(
      owner = "client!ip",
      name = "G",
      descriptor = "Lse;"
   )
   public static class6 field8834 = new class6(72, 7);
   @OriginalMember(
      owner = "client!ip",
      name = "B",
      descriptor = "Laka;"
   )
   public static class418 field8838 = new class418(90, 3);
   @OriginalMember(
      owner = "client!ip",
      name = "I",
      descriptor = "D"
   )
   public static double field8837;
   @OriginalMember(
      owner = "client!ip",
      name = "y",
      descriptor = "I"
   )
   public static int field8831;
   @OriginalMember(
      owner = "client!ip",
      name = "H",
      descriptor = "I"
   )
   public static int field8832;
   @OriginalMember(
      owner = "client!ip",
      name = "z",
      descriptor = "I"
   )
   public static int field8835;
   @OriginalMember(
      owner = "client!ip",
      name = "D",
      descriptor = "Ljava/lang/String;"
   )
   public static String field8830;
   @OriginalMember(
      owner = "client!ip",
      name = "C",
      descriptor = "[Luj;"
   )
   public static class619[] field8836;

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(B)Ldp;"
   )
   public final class499 method842(byte arg0) {
      try {
         int var2 = 10 % ((4 - arg0) / 37);
         ++field8832;
         return class21.field327;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field8839[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method4448(byte arg0) {
      try {
         field8836 = null;
         if (arg0 <= 37) {
            method4448((byte)90);
         }

         field8830 = null;
         field8834 = null;
         field8838 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8839[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "<init>",
      descriptor = "(Liba;Lbu;IIIIIIIIIIIIII)V"
   )
   public class598(class237 arg0, class596 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
      super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);

      try {
         this.field8833 = arg15;
      } catch (RuntimeException var18) {
         throw class93.method866(var18, field8839[6] + (arg0 != null ? field8839[1] : field8839[2]) + ',' + (arg1 != null ? field8839[1] : field8839[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "a",
      descriptor = "(IIZLiu;III[B)Lik;"
   )
   public static final class124 method4449(int arg0, int arg1, boolean arg2, class530 arg3, int arg4, int arg5, int arg6, byte[] arg7) {
      try {
         if (arg4 != 3553) {
            field8829 = true;
         }

         ++field8835;
         if (!arg3.field7760 && (!class181.method1525((byte)-92, arg6) || !class181.method1525((byte)-75, arg0))) {
            return !arg3.field7695 ? new class124(arg3, arg5, arg6, arg0, class109.method978(-1, arg6), class109.method978(arg4 ^ -3554, arg0), arg7, arg1) : new class124(arg3, 34037, arg5, arg6, arg0, arg2, arg7, arg1);
         } else {
            return new class124(arg3, 3553, arg5, arg6, arg0, arg2, arg7, arg1);
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field8839[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8839[1] : field8839[2]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8839[1] : field8839[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method4450(boolean arg0) {
      try {
         ++field8831;
         class513.field7158 = -1;
         if (!arg0) {
            method4450(false);
         }

         class749.field10942 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8839[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ip",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 75);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ip",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 91;
            break;
         case 1:
            var10005 = 98;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 75;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
