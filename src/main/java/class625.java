import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class625 {
   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9070 = new String[]{method4589(method4588("Ct\u0012\rj\u0007")), method4589(method4588("Ct\u0012\ro\u0007")), method4589(method4588("T?]\rV")), method4589(method4588("Ad\u001fO")), method4589(method4588("Ct\u0012\ri\u0007")), method4589(method4588("Ct\u0012\rh\u0007")), method4589(method4588("Ct\u0012\r_@B\u0007QBAv["))};
   @OriginalMember(
      owner = "client!lea",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field9063 = new class498(89, -2);
   @OriginalMember(
      owner = "client!lea",
      name = "d",
      descriptor = "[B"
   )
   public static byte[] field9068 = null;
   @OriginalMember(
      owner = "client!lea",
      name = "f",
      descriptor = "Luk;"
   )
   public static class498 field9069 = new class498(107, 6);
   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "I"
   )
   public static int field9064;
   @OriginalMember(
      owner = "client!lea",
      name = "e",
      descriptor = "I"
   )
   public static int field9065;
   @OriginalMember(
      owner = "client!lea",
      name = "g",
      descriptor = "I"
   )
   public static int field9066;
   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "I"
   )
   public static int field9067;

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(I)V",
      line = 13
   )
   public static void method4584(int arg0) {
      try {
         field9068 = null;
         field9063 = null;
         field9069 = null;
         if (arg0 != 107) {
            method4584(-9);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9070[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "toString",
      descriptor = "()Ljava/lang/String;",
      line = 26
   )
   public final String toString() {
      try {
         ++field9065;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9070[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(II)V",
      line = 41
   )
   public static final void method4585(int arg0, int arg1) {
      try {
         ++field9067;
         class566 var2 = class146.method1321((long)arg1, 5, -1428737160);
         int var3 = -25 % ((21 - arg0) / 50);
         var2.method4268(4);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field9070[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "b",
      descriptor = "(II)V",
      line = 53
   )
   public static final void method4586(int arg0, int arg1) {
      try {
         if (arg1 <= 24) {
            method4585(-96, -4);
         }

         ++field9066;
         class566 var2 = class146.method1321((long)arg0, 9, -1428737160);
         var2.method4268(4);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field9070[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lea",
      name = "a",
      descriptor = "(B[[BLoo;)V",
      line = 66
   )
   public static final void method4587(byte param0, byte[][] param1, class508 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4588(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 43);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4589(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 115;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 43;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
