import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class275 extends class428 {
   @OriginalMember(
      owner = "client!mb",
      name = "o",
      descriptor = "S"
   )
   public short field3766;
   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3770 = new String[]{method2099(method2098("j\u00172\u0001\u001c")), method2099(method2098("i\u0000p/")), method2099(method2098("|[2mI")), method2099(method2098("j\u00172\u007f]i\u001ch}\u001c")), method2099(method2098("j\u00172\u0002\u001c"))};
   @OriginalMember(
      owner = "client!mb",
      name = "m",
      descriptor = "Lek;"
   )
   public static class536 field3767 = new class536(87, 2);
   @OriginalMember(
      owner = "client!mb",
      name = "n",
      descriptor = "I"
   )
   public static int field3768;
   @OriginalMember(
      owner = "client!mb",
      name = "p",
      descriptor = "Leda;"
   )
   public static class110 field3769;

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(B)V",
      line = 4
   )
   public static void method2096(byte arg0) {
      try {
         field3767 = null;
         int var1 = -90 % ((-70 - arg0) / 32);
         field3769 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3770[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "a",
      descriptor = "(BLee;)V",
      line = 21
   )
   public static final void method2097(byte arg0, class706 arg1) {
      try {
         ++field3768;
         if (arg0 == 75) {
            arg1.field10316 = null;
            if (~class387.field5604 > -21) {
               class792.field11608.method5530(arg0 ^ 49, arg1);
               ++class387.field5604;
            }
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3770[0] + arg0 + ',' + (arg1 != null ? field3770[2] : field3770[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "()V",
      line = 38
   )
   public class275() {
   }

   @OriginalMember(
      owner = "client!mb",
      name = "<init>",
      descriptor = "(S)V",
      line = 40
   )
   public class275(short arg0) {
      try {
         this.field3766 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3770[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2098(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mb",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2099(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
