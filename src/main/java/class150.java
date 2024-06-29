import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class150 extends class673 {
   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1878 = new String[]{method1209(method1208("\u001bw!4o")), method1209(method1208("\u0003ac\u001c")), method1209(method1208("\u0016:!^:")), method1209(method1208("\u001bw!1o")), method1209(method1208("\u001bw!2o")), method1209(method1208("\u001bw!3o"))};
   @OriginalMember(
      owner = "client!vc",
      name = "t",
      descriptor = "Laka;"
   )
   public static class418 field1864 = new class418(83, -2);
   @OriginalMember(
      owner = "client!vc",
      name = "u",
      descriptor = "Laka;"
   )
   public static class418 field1877 = new class418(3, 1);
   @OriginalMember(
      owner = "client!vc",
      name = "o",
      descriptor = "I"
   )
   public static int field1865;
   @OriginalMember(
      owner = "client!vc",
      name = "v",
      descriptor = "I"
   )
   public static int field1866;
   @OriginalMember(
      owner = "client!vc",
      name = "l",
      descriptor = "I"
   )
   public static int field1867;
   @OriginalMember(
      owner = "client!vc",
      name = "q",
      descriptor = "I"
   )
   public int field1870;
   @OriginalMember(
      owner = "client!vc",
      name = "r",
      descriptor = "I"
   )
   public int field1875;
   @OriginalMember(
      owner = "client!vc",
      name = "n",
      descriptor = "[I"
   )
   public int[] field1869;
   @OriginalMember(
      owner = "client!vc",
      name = "m",
      descriptor = "[I"
   )
   public int[] field1871;
   @OriginalMember(
      owner = "client!vc",
      name = "x",
      descriptor = "[I"
   )
   public int[] field1873;
   @OriginalMember(
      owner = "client!vc",
      name = "y",
      descriptor = "[J"
   )
   public static long[] field1874;
   @OriginalMember(
      owner = "client!vc",
      name = "s",
      descriptor = "[Lit;"
   )
   public class769[] field1868;
   @OriginalMember(
      owner = "client!vc",
      name = "w",
      descriptor = "[Lit;"
   )
   public class769[] field1876;
   @OriginalMember(
      owner = "client!vc",
      name = "p",
      descriptor = "[[[B"
   )
   public byte[][][] field1872;

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1204(int arg0) {
      try {
         field1874 = null;
         if (arg0 >= -110) {
            field1864 = null;
         }

         field1864 = null;
         field1877 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1878[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(ILjava/net/Socket;I)Lnw;"
   )
   public static final class698 method1205(int arg0, Socket arg1, int arg2) throws IOException {
      try {
         if (arg2 != -20653) {
            return null;
         } else {
            ++field1867;
            return new class119(arg1, arg0);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field1878[3] + arg0 + ',' + (arg1 != null ? field1878[2] : field1878[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1206(int arg0, int arg1) {
      try {
         ++field1865;
         class487 var2 = class2.method12((long)arg1, 6, (byte)43);
         var2.method3696(-11118);
         int var3 = 55 / ((-23 - arg0) / 48);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1878[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method1207(int arg0, int arg1, int arg2) {
      try {
         ++field1866;
         if (arg2 != -1191298817) {
            field1877 = null;
         }

         int var3 = arg1 >>> 31;
         return (arg1 + var3) / arg0 - var3;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field1878[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1208(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1209(char[] arg0) {
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
            var10005 = 20;
            break;
         case 2:
            var10005 = 15;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
