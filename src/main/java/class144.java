import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class144 extends class500 {
   @OriginalMember(
      owner = "client!mc",
      name = "k",
      descriptor = "I"
   )
   public int field1905;
   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1907 = new String[]{method1219(method1218(")\u007f9\u0000@")), method1219(method1218("?29o\u0015")), method1219(method1218("<${B")), method1219(method1218("?29m\u0015")), method1219(method1218("?29l\u0015")), method1219(method1218("?29\u0012T<8c\u0010\u0015"))};
   @OriginalMember(
      owner = "client!mc",
      name = "n",
      descriptor = "I"
   )
   public static int field1902;
   @OriginalMember(
      owner = "client!mc",
      name = "l",
      descriptor = "I"
   )
   public static int field1903;
   @OriginalMember(
      owner = "client!mc",
      name = "j",
      descriptor = "I"
   )
   public static int field1904;
   @OriginalMember(
      owner = "client!mc",
      name = "m",
      descriptor = "[Ls;"
   )
   public static class295[] field1906;

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1215(int arg0) {
      try {
         if (arg0 != 268435455) {
            field1906 = null;
         }

         field1906 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1907[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(IIIIIIII)V"
   )
   public static final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      boolean var8 = client.field4273;

      try {
         ++field1902;
         class158 var9 = null;
         class158 var10 = (class158)class719.field10527.method3855(-102);
         if (var8 || var10 != null) {
            do {
               if (~var10.field2027 == ~arg3 && ~var10.field2038 == ~arg6 && ~var10.field2039 == ~arg7 && ~var10.field2035 == ~arg4) {
                  var9 = var10;
                  break;
               }

               var10 = (class158)class719.field10527.method3866((byte)125);
            } while(var10 != null);
         }

         while(var8) {
         }

         if (var9 == null) {
            var9 = new class158();
            var9.field2035 = arg4;
            var9.field2027 = arg3;
            var9.field2039 = arg7;
            var9.field2038 = arg6;
            if (~arg6 <= -1 && ~arg7 <= -1 && class507.field7030 > arg6 && ~class215.field2667 < ~arg7) {
               class9.method80(-120, var9);
            }

            class719.field10527.method3859(2, var9);
         }

         var9.field2026 = arg1;
         var9.field2030 = false;
         if (arg2 == -1) {
            var9.field2037 = true;
            var9.field2034 = arg5;
            var9.field2028 = arg0;
         }
      } catch (RuntimeException var12) {
         throw class534.method3846(var12, field1907[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "a",
      descriptor = "(ILvi;)V"
   )
   public static final void method1217(int param0, class569 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "()V"
   )
   public class144() {
   }

   @OriginalMember(
      owner = "client!mc",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class144(int arg0) {
      try {
         this.field1905 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1907[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1218(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1219(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 81;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 46;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
