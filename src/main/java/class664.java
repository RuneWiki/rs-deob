import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class664 extends class297 {
   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "[[S"
   )
   public short[][] field9942;
   @OriginalMember(
      owner = "client!pq",
      name = "u",
      descriptor = "D"
   )
   public double field9943;
   @OriginalMember(
      owner = "client!pq",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9947 = new String[]{method4911(method4910(":u{h\u001f")), method4911(method4910(":u{j\u001f")), method4911(method4910(":u{i\u001f")), method4911(method4910("1*{\u0005J")), method4911(method4910(":u{\u0017^$m!\u0015\u001f")), method4911(method4910("$q9G"))};
   @OriginalMember(
      owner = "client!pq",
      name = "y",
      descriptor = "Llea;"
   )
   public static class625 field9944 = new class625();
   @OriginalMember(
      owner = "client!pq",
      name = "x",
      descriptor = "F"
   )
   public static float field9946;
   @OriginalMember(
      owner = "client!pq",
      name = "w",
      descriptor = "I"
   )
   public static int field9941;
   @OriginalMember(
      owner = "client!pq",
      name = "v",
      descriptor = "I"
   )
   public static int field9945;

   @OriginalMember(
      owner = "client!pq",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method4907(int arg0) {
      try {
         if (arg0 != 12050) {
            method4907(-36);
         }

         field9944 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9947[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method4908(int arg0) {
      try {
         ++field9945;
         class475.field7226.method2551(true);
         if (arg0 < 80) {
            field9946 = 0.07438989F;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9947[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "a",
      descriptor = "(B)J"
   )
   public final long method4909(byte arg0) {
      try {
         if (arg0 != -77) {
            field9944 = null;
         }

         ++field9941;
         return (long)(this.field9942[0].length | this.field9942.length << 0);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9947[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "<init>",
      descriptor = "([[SD)V"
   )
   public class664(short[][] arg0, double arg1) {
      try {
         this.field9942 = arg0;
         this.field9943 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9947[4] + (arg0 != null ? field9947[3] : field9947[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4910(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 55);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4911(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 74;
            break;
         case 1:
            var10005 = 4;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 43;
            break;
         default:
            var10005 = 55;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
