import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class679 extends class364 implements class531 {
   @OriginalMember(
      owner = "client!rn",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10008 = new String[]{method4957(method4956("\u000bM\u000f,\u001e")), method4957(method4956("\u000bM\u000f!\u001e")), method4957(method4956("\u0011T\u0012\u0007")), method4957(method4956("\u0013BB\u000f_\u001b")), method4957(method4956("\u0002\r\u000fMK")), method4957(method4956("\u000bM\u000f__\u0017JU]\u001e")), method4957(method4956("\u0017VM\u000f")), method4957(method4956("\u000bM\u000f3\u001e"))};
   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field10006 = new int[6];
   @OriginalMember(
      owner = "client!rn",
      name = "x",
      descriptor = "I"
   )
   public static int field10007 = 0;
   @OriginalMember(
      owner = "client!rn",
      name = "y",
      descriptor = "I"
   )
   public static int field10004;
   @OriginalMember(
      owner = "client!rn",
      name = "w",
      descriptor = "I"
   )
   public static int field10005;

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(IZIIBII)V"
   )
   public static final void method4953(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         ++field10005;
         if ((arg1 ? class757.field11093.field11008.method3351(-18033) : class757.field11093.field10993.method3351(-18033)) != 0 && arg0 != 0 && class128.field1640 < 50 && ~arg6 != 0) {
            client.field1479[class128.field1640++] = new class142((byte)(!arg1 ? 2 : 3), arg6, arg0, arg5, arg2, 0, arg3, (class713)null);
         }

         if (arg4 == 23) {
            ;
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field10008[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4954(int arg0) {
      try {
         field10006 = null;
         int var1 = -58 % ((arg0 - 4) / 62);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10008[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "<init>",
      descriptor = "(Llea;IZ[[I)V"
   )
   public class679(class574 param1, int param2, boolean param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rn",
      name = "a",
      descriptor = "(I)Z"
   )
   public static final boolean method4955(int arg0) {
      try {
         if (arg0 != 34069) {
            method4954(-18);
         }

         ++field10004;
         return !class52.method385(field10008[3], arg0 + -33978) ? false : class52.method385(field10008[2], 108);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10008[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4956(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4957(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 121;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
