import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class490 {
   @OriginalMember(
      owner = "client!eka",
      name = "c",
      descriptor = "Z"
   )
   public boolean field7238;
   @OriginalMember(
      owner = "client!eka",
      name = "j",
      descriptor = "I"
   )
   public int field7239;
   @OriginalMember(
      owner = "client!eka",
      name = "g",
      descriptor = "S"
   )
   public short field7243;
   @OriginalMember(
      owner = "client!eka",
      name = "b",
      descriptor = "S"
   )
   public short field7247;
   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "I"
   )
   public int field7249;
   @OriginalMember(
      owner = "client!eka",
      name = "e",
      descriptor = "I"
   )
   public int field7242;
   @OriginalMember(
      owner = "client!eka",
      name = "m",
      descriptor = "I"
   )
   public int field7246;
   @OriginalMember(
      owner = "client!eka",
      name = "f",
      descriptor = "S"
   )
   public short field7244;
   @OriginalMember(
      owner = "client!eka",
      name = "d",
      descriptor = "B"
   )
   public byte field7250;
   @OriginalMember(
      owner = "client!eka",
      name = "l",
      descriptor = "I"
   )
   public int field7248;
   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7251 = new String[]{method3633(method3632("%jVM&)o^\u0017$h")), method3633(method3632("%jVM[h"))};
   @OriginalMember(
      owner = "client!eka",
      name = "h",
      descriptor = "[[Ljava/lang/String;"
   )
   public static String[][] field7241 = new String[][]{{method3633(method3632("\r0")), method3633(method3632("\r3")), method3633(method3632("\u00130")), "F"}, {method3633(method3632("\r0")), method3633(method3632("\r3")), method3633(method3632("\r2")), method3633(method3632("\u00130")), method3633(method3632("\u00133")), "F"}, {method3633(method3632("\r0")), method3633(method3632("\r3")), method3633(method3632("\r2")), method3633(method3632("\r5")), method3633(method3632("\u00130")), method3633(method3632("\u00133")), method3633(method3632("\u00132")), "F"}};
   @OriginalMember(
      owner = "client!eka",
      name = "k",
      descriptor = "Lha;"
   )
   public static class66 field7240;
   @OriginalMember(
      owner = "client!eka",
      name = "i",
      descriptor = "[Lvs;"
   )
   public static class616[] field7245;

   @OriginalMember(
      owner = "client!eka",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3631(int arg0) {
      try {
         field7240 = null;
         field7245 = null;
         if (arg0 >= 55) {
            field7241 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7251[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field7238 = arg10;
         this.field7239 = arg2;
         this.field7243 = (short)arg6;
         this.field7247 = (short)arg4;
         this.field7249 = arg11;
         this.field7242 = arg1;
         this.field7246 = arg0;
         this.field7244 = (short)arg5;
         this.field7250 = (byte)arg8;
         this.field7248 = arg3;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field7251[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3632(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 26);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eka",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3633(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 1;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 99;
            break;
         default:
            var10005 = 26;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
