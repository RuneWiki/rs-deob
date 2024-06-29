import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class417 extends class33 {
   @OriginalMember(
      owner = "client!io",
      name = "K",
      descriptor = "Ljava/lang/Object;"
   )
   private Object field6448;
   @OriginalMember(
      owner = "client!io",
      name = "I",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6457 = new String[]{method3328(method3327("D\u0012LFg")), method3328(method3327("D\u0012LJg")), method3328(method3327("C\b\u000eb")), method3328(method3327("VSL 2")), method3328(method3327("D\u0012L2&C\u0014\u00160g")), method3328(method3327("D\u0012LIg")), method3328(method3327("D\u0012LMg"))};
   @OriginalMember(
      owner = "client!io",
      name = "G",
      descriptor = "[B"
   )
   public static byte[] field6452 = new byte[2048];
   @OriginalMember(
      owner = "client!io",
      name = "D",
      descriptor = "Ldha;"
   )
   public static class642 field6450 = new class642("", 19);
   @OriginalMember(
      owner = "client!io",
      name = "J",
      descriptor = "Ljw;"
   )
   public static class779 field6454 = new class779(8, 0, 4, 1);
   @OriginalMember(
      owner = "client!io",
      name = "C",
      descriptor = "Z"
   )
   public static boolean field6455 = true;
   @OriginalMember(
      owner = "client!io",
      name = "F",
      descriptor = "F"
   )
   public static float field6456 = 0.0F;
   @OriginalMember(
      owner = "client!io",
      name = "B",
      descriptor = "I"
   )
   public static int field6449;
   @OriginalMember(
      owner = "client!io",
      name = "E",
      descriptor = "I"
   )
   public static int field6451;
   @OriginalMember(
      owner = "client!io",
      name = "H",
      descriptor = "I"
   )
   public static int field6453;

   @OriginalMember(
      owner = "client!io",
      name = "<init>",
      descriptor = "(Ljava/lang/Object;I)V",
      line = 3
   )
   public class417(Object arg0, int arg1) {
      super(arg1);

      try {
         this.field6448 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6457[4] + (arg0 != null ? field6457[3] : field6457[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "a",
      descriptor = "(BI)V",
      line = 13
   )
   public static final void method3325(byte arg0, int arg1) {
      try {
         ++field6453;
         class566 var2 = class146.method1321((long)arg1, 16, -1428737160);
         var2.method4268(4);
         if (arg0 != 55) {
            field6452 = null;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field6457[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "e",
      descriptor = "(B)V",
      line = 28
   )
   public static void method3326(byte arg0) {
      try {
         field6450 = null;
         field6454 = null;
         if (arg0 < 115) {
            field6455 = true;
         }

         field6452 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6457[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "c",
      descriptor = "(I)Z",
      line = 42
   )
   public final boolean method245(int arg0) {
      try {
         if (arg0 >= -32) {
            method3325((byte)-19, 27);
         }

         ++field6451;
         return false;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6457[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "g",
      descriptor = "(I)Ljava/lang/Object;",
      line = 53
   )
   public final Object method244(int arg0) {
      try {
         ++field6449;
         return arg0 != -1 ? null : this.field6448;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field6457[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3327(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 79);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!io",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3328(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 125;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 79;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
