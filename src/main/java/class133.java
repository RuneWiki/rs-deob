import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class133 {
   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1893 = new String[]{method1236(method1235(".\u0005\u001a6\u0012")), method1236(method1235(".\u0005\u001a5\u0012")), method1236(method1235(".\u0005\u001a\u0000U\u0017\u001dF\u001dT#A"))};
   @OriginalMember(
      owner = "client!jl",
      name = "d",
      descriptor = "J"
   )
   public static long field1890 = 0L;
   @OriginalMember(
      owner = "client!jl",
      name = "c",
      descriptor = "Lnaa;"
   )
   public static class113 field1888 = new class113(86, 11);
   @OriginalMember(
      owner = "client!jl",
      name = "b",
      descriptor = "Lbda;"
   )
   public static class783 field1892 = new class783(9, 2);
   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "I"
   )
   public static int field1889;
   @OriginalMember(
      owner = "client!jl",
      name = "e",
      descriptor = "I"
   )
   public static int field1891;

   @OriginalMember(
      owner = "client!jl",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 7
   )
   public final String toString() {
      try {
         ++field1889;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1893[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(III)Z",
      line = 17
   )
   public static final boolean method1233(int arg0, int arg1, int arg2) {
      try {
         ++field1891;
         boolean var3 = (55 & arg0) != arg2 ? class232.method1995(arg1, (byte)102, arg0) : class233.method2003(arg1, (byte)115, arg0);
         return var3 | class187.method1679(arg0, arg1, 127) | (65536 & arg1) != 0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field1893[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "a",
      descriptor = "(B)V",
      line = 28
   )
   public static void method1234(byte arg0) {
      try {
         field1888 = null;
         if (arg0 > -24) {
            method1234((byte)91);
         }

         field1892 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field1893[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1235(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 58);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1236(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 52;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 58;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
