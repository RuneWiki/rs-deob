import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class687 extends class247 {
   @OriginalMember(
      owner = "client!mba",
      name = "k",
      descriptor = "S"
   )
   public short field9908;
   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9912 = new String[]{method5000(method4999("b\u0017u5W'")), method5000(method4999("b\u0017u5T'")), method5000(method4999("b\u0017u5*f\u001b}o('"))};
   @OriginalMember(
      owner = "client!mba",
      name = "j",
      descriptor = "I"
   )
   public static int field9909 = 0;
   @OriginalMember(
      owner = "client!mba",
      name = "l",
      descriptor = "Lmb;"
   )
   public static class359 field9911 = new class359();
   @OriginalMember(
      owner = "client!mba",
      name = "m",
      descriptor = "I"
   )
   public static int field9910;
   @OriginalMember(
      owner = "client!mba",
      name = "n",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field9907;

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(ZIZ)V"
   )
   public static final void method4997(boolean arg0, int arg1, boolean arg2) {
      try {
         ++field9910;
         class380 var3 = class231.method2056(arg1, arg2, Integer.MIN_VALUE);
         if (var3 != null) {
            if (arg0) {
               method4998(-90);
            }

            var3.method2140((byte)110);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field9912[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "<init>",
      descriptor = "()V"
   )
   public class687() {
   }

   @OriginalMember(
      owner = "client!mba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4998(int arg0) {
      try {
         if (arg0 >= 5) {
            field9911 = null;
            field9907 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9912[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "<init>",
      descriptor = "(S)V"
   )
   public class687(short arg0) {
      try {
         this.field9908 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9912[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4999(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5000(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 27;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
