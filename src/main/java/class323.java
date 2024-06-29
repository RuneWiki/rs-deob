import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dja")
public class class323 extends class305 {
   @OriginalMember(
      owner = "client!dja",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4662 = new String[]{method2519(method2518("\u0016\u007fJ?zZ")), method2519(method2518("\u0016\u007fJ?yZ"))};
   @OriginalMember(
      owner = "client!dja",
      name = "v",
      descriptor = "Lkea;"
   )
   public static class248 field4650 = new class248("", 17);
   @OriginalMember(
      owner = "client!dja",
      name = "H",
      descriptor = "Z"
   )
   public static boolean field4654 = false;
   @OriginalMember(
      owner = "client!dja",
      name = "w",
      descriptor = "I"
   )
   public int field4644;
   @OriginalMember(
      owner = "client!dja",
      name = "D",
      descriptor = "I"
   )
   public int field4645;
   @OriginalMember(
      owner = "client!dja",
      name = "K",
      descriptor = "I"
   )
   public int field4646;
   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "I"
   )
   public int field4648;
   @OriginalMember(
      owner = "client!dja",
      name = "L",
      descriptor = "I"
   )
   public static int field4651;
   @OriginalMember(
      owner = "client!dja",
      name = "P",
      descriptor = "I"
   )
   public int field4652;
   @OriginalMember(
      owner = "client!dja",
      name = "C",
      descriptor = "I"
   )
   public int field4653;
   @OriginalMember(
      owner = "client!dja",
      name = "J",
      descriptor = "I"
   )
   public static int field4655;
   @OriginalMember(
      owner = "client!dja",
      name = "G",
      descriptor = "Lkea;"
   )
   public class248 field4660;
   @OriginalMember(
      owner = "client!dja",
      name = "N",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field4658;
   @OriginalMember(
      owner = "client!dja",
      name = "M",
      descriptor = "Ljava/lang/String;"
   )
   public String field4656;
   @OriginalMember(
      owner = "client!dja",
      name = "A",
      descriptor = "[I"
   )
   public int[] field4643;
   @OriginalMember(
      owner = "client!dja",
      name = "B",
      descriptor = "[I"
   )
   public int[] field4657;
   @OriginalMember(
      owner = "client!dja",
      name = "I",
      descriptor = "[J"
   )
   public long[] field4659;
   @OriginalMember(
      owner = "client!dja",
      name = "E",
      descriptor = "[Lld;"
   )
   public class178[] field4649;
   @OriginalMember(
      owner = "client!dja",
      name = "y",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field4647;
   @OriginalMember(
      owner = "client!dja",
      name = "x",
      descriptor = "[S"
   )
   public static short[] field4661;

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(I)V",
      line = 15
   )
   public static final void method2516(int arg0) {
      try {
         class625.field9095.method371(class361.field5399, class119.field1937, class597.field8617);
         ++field4651;
         if (arg0 >= -21) {
            method2516(61);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4662[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "a",
      descriptor = "(B)V",
      line = 27
   )
   public static void method2517(byte arg0) {
      try {
         field4661 = null;
         field4650 = null;
         field4658 = null;
         if (arg0 != 20) {
            field4661 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4662[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2518(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 59);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2519(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 114;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 17;
            break;
         default:
            var10005 = 59;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
