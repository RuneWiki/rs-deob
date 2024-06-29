import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class110 extends class743 {
   @OriginalMember(
      owner = "client!hk",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1399 = new String[]{method973(method972("6r~\u0017\u0007")), method973(method972("6r~\u0015\u0007")), method973(method972("6r~\u0014\u0007"))};
   @OriginalMember(
      owner = "client!hk",
      name = "I",
      descriptor = "I"
   )
   public static int field1389 = -1;
   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "I"
   )
   public static int field1390 = 0;
   @OriginalMember(
      owner = "client!hk",
      name = "B",
      descriptor = "[[B"
   )
   public static byte[][] field1391 = new byte[250][];
   @OriginalMember(
      owner = "client!hk",
      name = "y",
      descriptor = "B"
   )
   public byte field1393;
   @OriginalMember(
      owner = "client!hk",
      name = "D",
      descriptor = "I"
   )
   public static int field1392;
   @OriginalMember(
      owner = "client!hk",
      name = "E",
      descriptor = "I"
   )
   public static int field1394;
   @OriginalMember(
      owner = "client!hk",
      name = "F",
      descriptor = "I"
   )
   public int field1397;
   @OriginalMember(
      owner = "client!hk",
      name = "J",
      descriptor = "I"
   )
   public static int field1398;
   @OriginalMember(
      owner = "client!hk",
      name = "x",
      descriptor = "Lwm;"
   )
   public class594 field1396;
   @OriginalMember(
      owner = "client!hk",
      name = "C",
      descriptor = "[[B"
   )
   public static byte[][] field1388;
   @OriginalMember(
      owner = "client!hk",
      name = "H",
      descriptor = "[[[Lcea;"
   )
   public static class225[][][] field1395;

   @OriginalMember(
      owner = "client!hk",
      name = "e",
      descriptor = "(I)[B"
   )
   public final byte[] method969(int arg0) {
      try {
         ++field1394;
         if (!super.field10819 && ~(this.field1396.field8227.length + -this.field1393) >= ~this.field1396.field8243) {
            int var2 = -77 / ((25 - arg0) / 57);
            return this.field1396.field8227;
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1399[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method970(byte arg0) {
      try {
         field1388 = null;
         field1391 = null;
         field1395 = null;
         int var1 = 91 % ((-6 - arg0) / 61);
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1399[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method971(int arg0) {
      try {
         ++field1392;
         if (this.field1396 == null) {
            return 0;
         } else {
            int var2 = -4 / ((arg0 - 37) / 49);
            return this.field1396.field8243 * 100 / (this.field1396.field8227.length + -this.field1393);
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field1399[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method972(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method973(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
