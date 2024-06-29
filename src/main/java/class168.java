import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class168 extends class500 {
   @OriginalMember(
      owner = "client!hq",
      name = "l",
      descriptor = "Z"
   )
   public boolean field2119 = false;
   @OriginalMember(
      owner = "client!hq",
      name = "j",
      descriptor = "I"
   )
   public int field2123 = -1;
   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2125 = new String[]{method1324(method1323("#\u0001\u0002:.")), method1324(method1323("#\u0001\u0002Do%\u0019XF.")), method1324(method1323("#\u0001\u00029.")), method1324(method1323("#\u0001\u0002;."))};
   @OriginalMember(
      owner = "client!hq",
      name = "o",
      descriptor = "[[B"
   )
   public static byte[][] field2114 = new byte[50][];
   @OriginalMember(
      owner = "client!hq",
      name = "q",
      descriptor = "Lgka;"
   )
   public static class394 field2117 = new class394("", 13);
   @OriginalMember(
      owner = "client!hq",
      name = "t",
      descriptor = "I"
   )
   public static int field2116;
   @OriginalMember(
      owner = "client!hq",
      name = "r",
      descriptor = "I"
   )
   public int field2118;
   @OriginalMember(
      owner = "client!hq",
      name = "s",
      descriptor = "I"
   )
   public int field2120;
   @OriginalMember(
      owner = "client!hq",
      name = "n",
      descriptor = "I"
   )
   public int field2121;
   @OriginalMember(
      owner = "client!hq",
      name = "k",
      descriptor = "I"
   )
   public int field2122;
   @OriginalMember(
      owner = "client!hq",
      name = "m",
      descriptor = "I"
   )
   public int field2124;
   @OriginalMember(
      owner = "client!hq",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field2115;

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1320(int arg0) {
      try {
         field2115 = null;
         int var1 = -103 % ((-51 - arg0) / 51);
         field2117 = null;
         field2114 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2125[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(II)I"
   )
   public static int method1321(int arg0, int arg1) {
      try {
         return arg0 ^ arg1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2125[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "a",
      descriptor = "(JI)V"
   )
   public static final void method1322(long arg0, int arg1) {
      try {
         ++field2116;
         class624.field8715.setTime(new Date(arg0));
         if (arg1 < 116) {
            method1322(123L, -86);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2125[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class168(int arg0) {
      try {
         this.field2123 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field2125[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1323(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 6);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1324(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 120;
            break;
         default:
            var10005 = 6;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
