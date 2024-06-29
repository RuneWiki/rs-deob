import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class55 {
   @OriginalMember(
      owner = "client!aea",
      name = "m",
      descriptor = "B"
   )
   public byte field600;
   @OriginalMember(
      owner = "client!aea",
      name = "j",
      descriptor = "S"
   )
   public short field590;
   @OriginalMember(
      owner = "client!aea",
      name = "g",
      descriptor = "S"
   )
   public short field591;
   @OriginalMember(
      owner = "client!aea",
      name = "e",
      descriptor = "S"
   )
   public short field595;
   @OriginalMember(
      owner = "client!aea",
      name = "b",
      descriptor = "I"
   )
   public int field592;
   @OriginalMember(
      owner = "client!aea",
      name = "c",
      descriptor = "I"
   )
   public int field596;
   @OriginalMember(
      owner = "client!aea",
      name = "n",
      descriptor = "I"
   )
   public int field589;
   @OriginalMember(
      owner = "client!aea",
      name = "d",
      descriptor = "I"
   )
   public int field601;
   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "I"
   )
   public int field593;
   @OriginalMember(
      owner = "client!aea",
      name = "i",
      descriptor = "Z"
   )
   public boolean field597;
   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field602 = new String[]{method429(method428("-\u001eE\u00132%\u0015MI0d")), method429(method428("-\u001eE\u0013Od"))};
   @OriginalMember(
      owner = "client!aea",
      name = "f",
      descriptor = "J"
   )
   public static long field594 = 0L;
   @OriginalMember(
      owner = "client!aea",
      name = "l",
      descriptor = "I"
   )
   public static int field599 = 0;
   @OriginalMember(
      owner = "client!aea",
      name = "h",
      descriptor = "[C"
   )
   private static char[] field598 = new char[64];
   @OriginalMember(
      owner = "client!aea",
      name = "k",
      descriptor = "I"
   )
   public static int field588;

   @OriginalMember(
      owner = "client!aea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method427(int arg0) {
      try {
         if (arg0 < 110) {
            method427(-112);
         }

         field598 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field602[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aea",
      name = "<init>",
      descriptor = "(IIIIIIIIIZZI)V"
   )
   public class55(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
      try {
         this.field600 = (byte)arg8;
         this.field590 = (short)arg5;
         this.field591 = (short)arg6;
         this.field595 = (short)arg4;
         this.field592 = arg11;
         this.field596 = arg3;
         this.field589 = arg1;
         this.field601 = arg2;
         this.field593 = arg0;
         this.field597 = arg10;
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field602[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -27; ++var0) {
         field598[var0] = (char)(var0 + 65);
      }

      for(int var1 = 26; var1 < 52; ++var1) {
         field598[var1] = (char)(var1 + 97 + -26);
      }

      for(int var2 = 52; var2 < 62; ++var2) {
         field598[var2] = (char)(var2 + 48 + -52);
      }

      field598[63] = '-';
      field598[62] = '*';
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method428(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method429(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 123;
            break;
         case 2:
            var10005 = 36;
            break;
         case 3:
            var10005 = 61;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
