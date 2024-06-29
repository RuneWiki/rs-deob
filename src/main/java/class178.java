import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class178 {
   @OriginalMember(
      owner = "client!wq",
      name = "f",
      descriptor = "Lei;"
   )
   public class189 field2212;
   @OriginalMember(
      owner = "client!wq",
      name = "c",
      descriptor = "S"
   )
   public short field2209;
   @OriginalMember(
      owner = "client!wq",
      name = "e",
      descriptor = "B"
   )
   public byte field2207;
   @OriginalMember(
      owner = "client!wq",
      name = "h",
      descriptor = "B"
   )
   public byte field2211;
   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2217 = new String[]{method1379(method1378("cDXOX")), method1379(method1378("z@\u001ab")), method1379(method1378("cDX2\u0019z\\\u00020X")), method1379(method1378("o\u001bX \r")), method1379(method1378("cDXLX"))};
   @OriginalMember(
      owner = "client!wq",
      name = "j",
      descriptor = "I"
   )
   public static int field2205 = 1;
   @OriginalMember(
      owner = "client!wq",
      name = "l",
      descriptor = "Lafa;"
   )
   public static class365 field2206 = new class365(1, 2);
   @OriginalMember(
      owner = "client!wq",
      name = "d",
      descriptor = "Ll;"
   )
   public static class20 field2214 = new class20(16);
   @OriginalMember(
      owner = "client!wq",
      name = "g",
      descriptor = "I"
   )
   public static int field2215 = 0;
   @OriginalMember(
      owner = "client!wq",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field2216 = new int[13];
   @OriginalMember(
      owner = "client!wq",
      name = "i",
      descriptor = "I"
   )
   public static int field2208;
   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "Ldha;"
   )
   public static class84 field2210;
   @OriginalMember(
      owner = "client!wq",
      name = "k",
      descriptor = "[[I"
   )
   public static int[][] field2213;

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method1376(int arg0, int arg1) {
      try {
         if (arg0 != 433) {
            method1376(-77, 31);
         }

         ++field2208;
         class446 var2 = class635.method4607(118, (long)arg1, 1);
         var2.method3312(arg0 + -554);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field2217[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1377(int arg0) {
      try {
         field2214 = null;
         field2213 = null;
         field2206 = null;
         field2216 = null;
         field2210 = null;
         if (arg0 != 1) {
            field2210 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field2217[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "<init>",
      descriptor = "(Lei;III)V"
   )
   public class178(class189 arg0, int arg1, int arg2, int arg3) {
      try {
         this.field2212 = arg0;
         this.field2209 = (short)arg1;
         this.field2207 = (byte)arg2;
         this.field2211 = (byte)arg3;
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field2217[2] + (arg0 != null ? field2217[3] : field2217[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1378(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 112);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1379(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 53;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 112;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
