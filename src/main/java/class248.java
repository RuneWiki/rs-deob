import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class248 extends class96 {
   @OriginalMember(
      owner = "client!ffa",
      name = "J",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3805 = method2148(method2147("aOH6D/"));
   @OriginalMember(
      owner = "client!ffa",
      name = "u",
      descriptor = "[F"
   )
   public static float[] field3796 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "Lhha;"
   )
   public static class724 field3793 = new class724(134, 5);
   @OriginalMember(
      owner = "client!ffa",
      name = "F",
      descriptor = "Z"
   )
   public static boolean field3804 = true;
   @OriginalMember(
      owner = "client!ffa",
      name = "I",
      descriptor = "Lhha;"
   )
   public static class724 field3803 = new class724(125, -1);
   @OriginalMember(
      owner = "client!ffa",
      name = "B",
      descriptor = "I"
   )
   public int field3787;
   @OriginalMember(
      owner = "client!ffa",
      name = "C",
      descriptor = "I"
   )
   public int field3790;
   @OriginalMember(
      owner = "client!ffa",
      name = "E",
      descriptor = "I"
   )
   public static int field3791;
   @OriginalMember(
      owner = "client!ffa",
      name = "s",
      descriptor = "I"
   )
   public int field3792;
   @OriginalMember(
      owner = "client!ffa",
      name = "A",
      descriptor = "I"
   )
   public int field3795;
   @OriginalMember(
      owner = "client!ffa",
      name = "y",
      descriptor = "I"
   )
   public int field3800;
   @OriginalMember(
      owner = "client!ffa",
      name = "t",
      descriptor = "I"
   )
   public int field3801;
   @OriginalMember(
      owner = "client!ffa",
      name = "v",
      descriptor = "I"
   )
   public static int field3802;
   @OriginalMember(
      owner = "client!ffa",
      name = "q",
      descriptor = "Lhf;"
   )
   public class198 field3797;
   @OriginalMember(
      owner = "client!ffa",
      name = "r",
      descriptor = "Ljava/lang/String;"
   )
   public String field3798;
   @OriginalMember(
      owner = "client!ffa",
      name = "G",
      descriptor = "[I"
   )
   public int[] field3786;
   @OriginalMember(
      owner = "client!ffa",
      name = "w",
      descriptor = "[I"
   )
   public int[] field3794;
   @OriginalMember(
      owner = "client!ffa",
      name = "D",
      descriptor = "[J"
   )
   public long[] field3799;
   @OriginalMember(
      owner = "client!ffa",
      name = "x",
      descriptor = "[Lbga;"
   )
   public class398[] field3789;
   @OriginalMember(
      owner = "client!ffa",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   public String[] field3788;

   @OriginalMember(
      owner = "client!ffa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2146(int arg0) {
      try {
         field3796 = null;
         field3803 = null;
         field3793 = null;
         if (arg0 != -19492) {
            method2146(115);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field3805 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2147(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ffa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2148(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 7;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 41;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
