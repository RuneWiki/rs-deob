import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class577 extends class294 {
   @OriginalMember(
      owner = "client!mq",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8542 = new String[]{method4329(method4328("\u0016F4\u001e\u0017")), method4329(method4328("\u0000\u00194rB")), method4329(method4328("\u0015Bv0")), method4329(method4328("\u0016F4\u0018\u0017")), method4329(method4328("\u0016F4\u001d\u0017")), method4329(method4328("\u0016F4\u001f\u0017"))};
   @OriginalMember(
      owner = "client!mq",
      name = "m",
      descriptor = "I"
   )
   public static int field8530 = 1406;
   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "Llea;"
   )
   public static class625 field8536 = new class625();
   @OriginalMember(
      owner = "client!mq",
      name = "x",
      descriptor = "[S"
   )
   private static short[] field8540 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!mq",
      name = "v",
      descriptor = "[S"
   )
   private static short[] field8541 = new short[]{-10304, 9104, 25485, 4620, 4540};
   @OriginalMember(
      owner = "client!mq",
      name = "w",
      descriptor = "[S"
   )
   private static short[] field8537 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!mq",
      name = "p",
      descriptor = "[[S"
   )
   public static short[][] field8539 = new short[][]{field8537, field8541, field8540};
   @OriginalMember(
      owner = "client!mq",
      name = "u",
      descriptor = "I"
   )
   public static int field8528;
   @OriginalMember(
      owner = "client!mq",
      name = "o",
      descriptor = "I"
   )
   public static int field8529;
   @OriginalMember(
      owner = "client!mq",
      name = "r",
      descriptor = "I"
   )
   public int field8532;
   @OriginalMember(
      owner = "client!mq",
      name = "n",
      descriptor = "I"
   )
   public int field8533;
   @OriginalMember(
      owner = "client!mq",
      name = "y",
      descriptor = "I"
   )
   public static int field8534;
   @OriginalMember(
      owner = "client!mq",
      name = "t",
      descriptor = "Lpfa;"
   )
   public class102 field8531;
   @OriginalMember(
      owner = "client!mq",
      name = "s",
      descriptor = "Lnaa;"
   )
   public class113 field8535;
   @OriginalMember(
      owner = "client!mq",
      name = "q",
      descriptor = "Lda;"
   )
   public static class288 field8538;

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(BLrr;)I",
      line = 6
   )
   public static final int method4324(byte arg0, class678 arg1) {
      try {
         ++field8529;
         int var2 = 0;
         if (arg1.method5002(class760.field11235, (byte)85)) {
            ++var2;
         }

         if (arg1.method5002(class450.field6887, (byte)95)) {
            ++var2;
         }

         if (arg0 != -83) {
            method4324((byte)82, (class678)null);
         }

         if (arg1.method5002(class485.field7381, (byte)84)) {
            ++var2;
         }

         if (arg1.method5002(class680.field10147, (byte)83)) {
            ++var2;
         }

         if (arg1.method5002(class213.field3241, (byte)98)) {
            ++var2;
         }

         if (arg1.method5002(class670.field9995, (byte)91)) {
            ++var2;
         }

         if (arg1.method5002(class120.field1702, (byte)113)) {
            ++var2;
         }

         if (arg1.method5002(class233.field3575, (byte)90)) {
            ++var2;
         }

         if (arg1.method5002(class234.field3580, (byte)115)) {
            ++var2;
         }

         if (arg1.method5002(class41.field544, (byte)99)) {
            ++var2;
         }

         if (arg1.method5002(class695.field10324, (byte)91)) {
            ++var2;
         }

         if (arg1.method5002(class91.field1307, (byte)126)) {
            ++var2;
         }

         if (arg1.method5002(class11.field140, (byte)124)) {
            ++var2;
         }

         if (arg1.method5002(class376.field5982, (byte)98)) {
            ++var2;
         }

         if (arg1.method5002(class395.field6186, (byte)104)) {
            ++var2;
         }

         if (arg1.method5002(class427.field6589, (byte)100)) {
            ++var2;
         }

         return var2;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8542[0] + arg0 + ',' + (arg1 != null ? field8542[1] : field8542[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(Z)V",
      line = 76
   )
   public final void method4325(boolean arg0) {
      try {
         ++field8534;
         if (class210.field3192.length > class211.field3199) {
            if (!arg0) {
               class210.field3192[class211.field3199++] = this;
            }
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8542[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(IBI)Z",
      line = 95
   )
   public static final boolean method4326(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != 77) {
            method4326(94, (byte)64, -105);
         }

         ++field8528;
         if (~arg0 <= -1 && ~arg2 <= -1 && ~arg0 > ~class757.field11211[1].length && arg2 < class757.field11211[1][arg0].length) {
            return (2 & class757.field11211[1][arg0][arg2]) != 0;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8542[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "a",
      descriptor = "(B)V",
      line = 117
   )
   public static void method4327(byte arg0) {
      try {
         field8540 = null;
         field8536 = null;
         field8541 = null;
         if (arg0 >= -107) {
            field8538 = null;
         }

         field8538 = null;
         field8539 = null;
         field8537 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8542[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4328(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4329(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
