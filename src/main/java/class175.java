import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class175 extends class294 {
   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2753 = new String[]{method1608(method1607("`K\u000ex\u0002")), method1608(method1607("u\u0010L:")), method1608(method1607("q\u0002Ax>3")), method1608(method1607("q\u0002Ax=3"))};
   @OriginalMember(
      owner = "client!jga",
      name = "r",
      descriptor = "Lpi;"
   )
   public static class427 field2747 = new class427();
   @OriginalMember(
      owner = "client!jga",
      name = "t",
      descriptor = "I"
   )
   public static int field2742;
   @OriginalMember(
      owner = "client!jga",
      name = "q",
      descriptor = "I"
   )
   public int field2744;
   @OriginalMember(
      owner = "client!jga",
      name = "n",
      descriptor = "I"
   )
   public int field2745;
   @OriginalMember(
      owner = "client!jga",
      name = "p",
      descriptor = "I"
   )
   public static int field2750;
   @OriginalMember(
      owner = "client!jga",
      name = "u",
      descriptor = "Liba;"
   )
   public static class343 field2752;
   @OriginalMember(
      owner = "client!jga",
      name = "v",
      descriptor = "[I"
   )
   public int[] field2743;
   @OriginalMember(
      owner = "client!jga",
      name = "x",
      descriptor = "[I"
   )
   public int[] field2746;
   @OriginalMember(
      owner = "client!jga",
      name = "m",
      descriptor = "[I"
   )
   public int[] field2751;
   @OriginalMember(
      owner = "client!jga",
      name = "s",
      descriptor = "[Lbja;"
   )
   public class275[] field2741;
   @OriginalMember(
      owner = "client!jga",
      name = "w",
      descriptor = "[Lbja;"
   )
   public class275[] field2748;
   @OriginalMember(
      owner = "client!jga",
      name = "o",
      descriptor = "[[[B"
   )
   public byte[][][] field2749;

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1605(int arg0) {
      try {
         field2752 = null;
         int var1 = 8 / ((arg0 - 80) / 44);
         field2747 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2753[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "a",
      descriptor = "(IIIZI[[[BIIIIILha;I)V"
   )
   public static final void method1606(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte[][][] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class610 arg11, int arg12) {
      try {
         if (arg3) {
            ++field2742;
            if (~arg4 != -1 && arg10 != 0) {
               if (arg4 == 9) {
                  arg4 = 1;
                  arg9 = 3 & arg9 + 1;
               }

               if (~arg4 == -11) {
                  arg4 = 1;
                  arg9 = arg9 - -3 & 3;
               }

               if (~arg4 == -12) {
                  arg4 = 8;
                  arg9 = arg9 + 3 & 3;
               }

               arg11.method707(arg0, arg8, arg12, arg6, arg2, arg7, arg5[arg4 + -1][arg9], arg10, arg1);
            }
         }
      } catch (RuntimeException var14) {
         throw class482.method3757(var14, field2753[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2753[0] : field2753[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + (arg11 != null ? field2753[0] : field2753[1]) + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1607(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 127);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1608(char[] arg0) {
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
            var10005 = 101;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 127;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
