import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class327 {
   @OriginalMember(
      owner = "client!wt",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4657 = new String[]{method2468(method2467("rb\u0010\u0003#")), method2468(method2467("rb\u0010\u0000#"))};
   @OriginalMember(
      owner = "client!wt",
      name = "h",
      descriptor = "F"
   )
   public static float field4647 = 1.0F;
   @OriginalMember(
      owner = "client!wt",
      name = "l",
      descriptor = "I"
   )
   public static int field4652 = 0;
   @OriginalMember(
      owner = "client!wt",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field4653 = false;
   @OriginalMember(
      owner = "client!wt",
      name = "u",
      descriptor = "B"
   )
   public byte field4632;
   @OriginalMember(
      owner = "client!wt",
      name = "o",
      descriptor = "B"
   )
   public byte field4634;
   @OriginalMember(
      owner = "client!wt",
      name = "y",
      descriptor = "B"
   )
   public byte field4641;
   @OriginalMember(
      owner = "client!wt",
      name = "f",
      descriptor = "B"
   )
   public byte field4642;
   @OriginalMember(
      owner = "client!wt",
      name = "s",
      descriptor = "B"
   )
   public byte field4654;
   @OriginalMember(
      owner = "client!wt",
      name = "p",
      descriptor = "B"
   )
   public byte field4655;
   @OriginalMember(
      owner = "client!wt",
      name = "w",
      descriptor = "B"
   )
   public byte field4656;
   @OriginalMember(
      owner = "client!wt",
      name = "k",
      descriptor = "I"
   )
   public int field4636;
   @OriginalMember(
      owner = "client!wt",
      name = "d",
      descriptor = "I"
   )
   public static int field4638;
   @OriginalMember(
      owner = "client!wt",
      name = "b",
      descriptor = "I"
   )
   public int field4644;
   @OriginalMember(
      owner = "client!wt",
      name = "r",
      descriptor = "I"
   )
   public int field4645;
   @OriginalMember(
      owner = "client!wt",
      name = "i",
      descriptor = "S"
   )
   public short field4650;
   @OriginalMember(
      owner = "client!wt",
      name = "v",
      descriptor = "Z"
   )
   public boolean field4631;
   @OriginalMember(
      owner = "client!wt",
      name = "n",
      descriptor = "Z"
   )
   public boolean field4633;
   @OriginalMember(
      owner = "client!wt",
      name = "t",
      descriptor = "Z"
   )
   public boolean field4639;
   @OriginalMember(
      owner = "client!wt",
      name = "g",
      descriptor = "Z"
   )
   public boolean field4640;
   @OriginalMember(
      owner = "client!wt",
      name = "j",
      descriptor = "Z"
   )
   public boolean field4643;
   @OriginalMember(
      owner = "client!wt",
      name = "x",
      descriptor = "Z"
   )
   public boolean field4646;
   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "Z"
   )
   public boolean field4648;
   @OriginalMember(
      owner = "client!wt",
      name = "e",
      descriptor = "Z"
   )
   public boolean field4649;
   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field4635;
   @OriginalMember(
      owner = "client!wt",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field4637;
   @OriginalMember(
      owner = "client!wt",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field4651;

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(IIC)I",
      line = 8
   )
   public static final int method2465(int arg0, int arg1, char arg2) {
      try {
         ++field4638;
         int var3 = arg2 << 4;
         if (arg1 > -35) {
            field4647 = 0.4483216F;
         }

         if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            char var6 = Character.toLowerCase(arg2);
            var3 = (var6 << 4) + 1;
         }

         return var3;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field4657[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "a",
      descriptor = "(I)V",
      line = 40
   )
   public static void method2466(int arg0) {
      try {
         field4637 = null;
         field4651 = null;
         if (arg0 != 1206427460) {
            field4637 = null;
         }

         field4635 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4657[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2467(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2468(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 22;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
