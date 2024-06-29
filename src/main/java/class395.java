import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class395 extends class347 {
   @OriginalMember(
      owner = "client!ku",
      name = "m",
      descriptor = "Z"
   )
   public boolean field6002 = true;
   @OriginalMember(
      owner = "client!ku",
      name = "l",
      descriptor = "Z"
   )
   public boolean field6013 = false;
   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6014 = new String[]{method3027(method3026("\u0006C18o")), method3027(method3026("\u0006C1;o"))};
   @OriginalMember(
      owner = "client!ku",
      name = "v",
      descriptor = "I"
   )
   public static int field5999;
   @OriginalMember(
      owner = "client!ku",
      name = "o",
      descriptor = "I"
   )
   public int field6000;
   @OriginalMember(
      owner = "client!ku",
      name = "p",
      descriptor = "I"
   )
   public int field6001;
   @OriginalMember(
      owner = "client!ku",
      name = "w",
      descriptor = "I"
   )
   public int field6003;
   @OriginalMember(
      owner = "client!ku",
      name = "q",
      descriptor = "I"
   )
   public static int field6004;
   @OriginalMember(
      owner = "client!ku",
      name = "n",
      descriptor = "I"
   )
   public int field6005;
   @OriginalMember(
      owner = "client!ku",
      name = "k",
      descriptor = "I"
   )
   public int field6006;
   @OriginalMember(
      owner = "client!ku",
      name = "s",
      descriptor = "I"
   )
   public int field6007;
   @OriginalMember(
      owner = "client!ku",
      name = "t",
      descriptor = "I"
   )
   public int field6008;
   @OriginalMember(
      owner = "client!ku",
      name = "j",
      descriptor = "I"
   )
   public int field6009;
   @OriginalMember(
      owner = "client!ku",
      name = "i",
      descriptor = "I"
   )
   public int field6010;
   @OriginalMember(
      owner = "client!ku",
      name = "u",
      descriptor = "I"
   )
   public int field6011;
   @OriginalMember(
      owner = "client!ku",
      name = "r",
      descriptor = "Lsp;"
   )
   public class661 field6012;

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(BI)Z",
      line = 15
   )
   public static final boolean method3024(byte arg0, int arg1) {
      try {
         ++field5999;
         int var2 = 255 & arg0;
         if (~var2 == -1) {
            return false;
         } else if (arg1 != 32053) {
            return true;
         } else {
            return ~var2 > -129 || var2 >= 160 || ~class777.field11352[var2 + -128] != -1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field6014[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "a",
      descriptor = "(B)V",
      line = 52
   )
   public static final void method3025(byte arg0) {
      try {
         class605.field8888 = null;
         class75.field966 = null;
         ++field6004;
         class552.field8191 = null;
         class786.field11440 = null;
         if (arg0 >= 0) {
            class179.field2206 = null;
            class450.field6841 = null;
            class432.field6604 = null;
            class611.field8961 = null;
            class417.field6387 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6014[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3026(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ku",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3027(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 109;
            break;
         case 1:
            var10005 = 54;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
