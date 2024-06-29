import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ija")
public class class366 extends class500 {
   @OriginalMember(
      owner = "client!ija",
      name = "q",
      descriptor = "J"
   )
   public long field5159;
   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5170 = new String[]{method2833(method2832("?B|0")), method2833(method2832("*\u0019>r\u007f")), method2833(method2832("8]qr@y")), method2833(method2832("8]qrCy")), method2833(method2832("8]qr>8Yy(<y"))};
   @OriginalMember(
      owner = "client!ija",
      name = "j",
      descriptor = "[S"
   )
   private static short[] field5160 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!ija",
      name = "r",
      descriptor = "[S"
   )
   private static short[] field5161 = new short[]{-1, -1, -1, -1, -1};
   @OriginalMember(
      owner = "client!ija",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field5163 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   @OriginalMember(
      owner = "client!ija",
      name = "n",
      descriptor = "I"
   )
   public static int field5158 = 0;
   @OriginalMember(
      owner = "client!ija",
      name = "s",
      descriptor = "I"
   )
   public static int field5166 = 2;
   @OriginalMember(
      owner = "client!ija",
      name = "o",
      descriptor = "[Lmk;"
   )
   public static class61[] field5162 = new class61[14];
   @OriginalMember(
      owner = "client!ija",
      name = "t",
      descriptor = "I"
   )
   public static volatile int field5168 = -1;
   @OriginalMember(
      owner = "client!ija",
      name = "u",
      descriptor = "[S"
   )
   private static short[] field5169 = new short[]{6798, 8741, 25238, 4626, 4550};
   @OriginalMember(
      owner = "client!ija",
      name = "m",
      descriptor = "[[S"
   )
   public static short[][] field5167 = new short[][]{field5169, field5161, field5160};
   @OriginalMember(
      owner = "client!ija",
      name = "l",
      descriptor = "I"
   )
   public static int field5164;
   @OriginalMember(
      owner = "client!ija",
      name = "p",
      descriptor = "I"
   )
   public static int field5165;

   @OriginalMember(
      owner = "client!ija",
      name = "<init>",
      descriptor = "()V"
   )
   public class366() {
   }

   @OriginalMember(
      owner = "client!ija",
      name = "<init>",
      descriptor = "(J)V"
   )
   public class366(long arg0) {
      try {
         this.field5159 = arg0;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5170[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2830(int arg0) {
      try {
         field5167 = null;
         field5163 = null;
         field5169 = null;
         if (arg0 != -24934) {
            method2830(-7);
         }

         field5161 = null;
         field5160 = null;
         field5162 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5170[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "a",
      descriptor = "(Lqh;ILqh;I)V"
   )
   public static final void method2831(class74 arg0, int arg1, class74 arg2, int arg3) {
      try {
         class476.field6586 = arg2;
         class631.field8833 = arg0;
         if (arg3 < -91) {
            ++field5165;
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field5170[2] + (arg0 != null ? field5170[1] : field5170[0]) + ',' + arg1 + ',' + (arg2 != null ? field5170[1] : field5170[0]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2832(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 2);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ija",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2833(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 16;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 2;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
