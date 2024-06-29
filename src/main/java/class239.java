import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class239 extends class686 {
   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3691 = new String[]{method2103(method2102("%V\u000f\"\u0003b")), method2103(method2102("%V\u000f\"\u0000b"))};
   @OriginalMember(
      owner = "client!oaa",
      name = "s",
      descriptor = "I"
   )
   public static int field3683 = 0;
   @OriginalMember(
      owner = "client!oaa",
      name = "p",
      descriptor = "I"
   )
   public static int field3681;
   @OriginalMember(
      owner = "client!oaa",
      name = "m",
      descriptor = "I"
   )
   public int field3682;
   @OriginalMember(
      owner = "client!oaa",
      name = "t",
      descriptor = "I"
   )
   public int field3684;
   @OriginalMember(
      owner = "client!oaa",
      name = "u",
      descriptor = "I"
   )
   public int field3685;
   @OriginalMember(
      owner = "client!oaa",
      name = "o",
      descriptor = "I"
   )
   public int field3686;
   @OriginalMember(
      owner = "client!oaa",
      name = "v",
      descriptor = "I"
   )
   public static int field3687;
   @OriginalMember(
      owner = "client!oaa",
      name = "n",
      descriptor = "I"
   )
   public int field3688;
   @OriginalMember(
      owner = "client!oaa",
      name = "r",
      descriptor = "I"
   )
   public static int field3689;
   @OriginalMember(
      owner = "client!oaa",
      name = "q",
      descriptor = "I"
   )
   public int field3690;
   @OriginalMember(
      owner = "client!oaa",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field3680;

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(IZ)Z"
   )
   public static final boolean method2100(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            method2101((byte)118);
         }

         ++field3681;
         return ~arg0 == -8 || ~arg0 == -9 || ~arg0 == -10 || ~arg0 == -11;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field3691[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method2101(byte arg0) {
      try {
         class513.field7285.method197((0.7F + (float)class476.field6870.field9143.method2615(-83) * 0.1F) * 1.1523438F);
         ++field3689;
         class513.field7285.method154(class72.field1170, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
         if (arg0 <= -36) {
            class513.field7285.method227(class521.field7330, -1, 0);
            class513.field7285.method166(class701.field10096);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3691[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2102(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2103(char[] arg0) {
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
            var10005 = 55;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
