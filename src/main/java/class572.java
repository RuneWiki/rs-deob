import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class572 {
   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8103 = new String[]{method4238(method4237("{\u0017oq#")), method4238(method4237("d\u000f-\\")), method4238(method4237("qTo\u001ev")), method4238(method4237("{\u0017or#"))};
   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "F"
   )
   public static float field8102;
   @OriginalMember(
      owner = "client!qm",
      name = "c",
      descriptor = "I"
   )
   public static int field8098;
   @OriginalMember(
      owner = "client!qm",
      name = "d",
      descriptor = "I"
   )
   public static int field8099;
   @OriginalMember(
      owner = "client!qm",
      name = "b",
      descriptor = "I"
   )
   public static int field8101;
   @OriginalMember(
      owner = "client!qm",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field8100;

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method4235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         if (arg2 != -28884) {
            method4236(6, (class678)null);
         }

         ++field8099;
         if (class729.field10384 <= arg3 && ~arg4 >= ~class604.field8618 && class587.field8239 <= arg5 && ~arg0 >= ~class767.field11011) {
            class398.method3097(arg3, arg2 + 28770, arg5, arg4, arg0, arg1);
         } else {
            class661.method4798(-26743, arg0, arg3, arg5, arg4, arg1);
         }
      } catch (RuntimeException var7) {
         throw class612.method4503(var7, field8103[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "a",
      descriptor = "(ILaea;)V"
   )
   public static final void method4236(int arg0, class678 arg1) {
      try {
         ++field8101;
         if (arg0 == 9731) {
            if (class266.field4060 == null) {
               class480 var2 = new class480();
               byte[] var3 = var2.method3672(16, 128, (byte)85, 128);
               class266.field4060 = class393.method3047(1, false, var3);
            }

            if (class224.field3177 == null) {
               class421 var4 = new class421();
               byte[] var5 = var4.method3282(128, 128, 16, (byte)88);
               class224.field3177 = class393.method3047(1, false, var5);
            }

            class561 var6 = arg1.field9684;
            if (var6.method4178(false) && class17.field238 == null) {
               byte[] var7 = class207.method1784(4.0F, 128, 16.0F, 4.0F, new class679(419684), 8, 0.6F, -31506, 0.5F, 16, 128);
               class17.field238 = class393.method3047(1, false, var7);
            }
         }
      } catch (RuntimeException var9) {
         throw class612.method4503(var9, field8103[3] + arg0 + ',' + (arg1 != null ? field8103[2] : field8103[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4237(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4238(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 10;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
