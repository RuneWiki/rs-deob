import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class631 {
   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9183 = new String[]{method4548(method4547("C}e\u0015")), method4548(method4547("V&'W5")), method4548(method4547("Dy'8`")), method4548(method4547("Dy';`"))};
   @OriginalMember(
      owner = "client!iq",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field9178 = false;
   @OriginalMember(
      owner = "client!iq",
      name = "i",
      descriptor = "I"
   )
   public int field9168;
   @OriginalMember(
      owner = "client!iq",
      name = "d",
      descriptor = "I"
   )
   public int field9169;
   @OriginalMember(
      owner = "client!iq",
      name = "l",
      descriptor = "I"
   )
   public int field9170;
   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "I"
   )
   public int field9171;
   @OriginalMember(
      owner = "client!iq",
      name = "o",
      descriptor = "I"
   )
   public int field9172;
   @OriginalMember(
      owner = "client!iq",
      name = "k",
      descriptor = "I"
   )
   public int field9173;
   @OriginalMember(
      owner = "client!iq",
      name = "m",
      descriptor = "I"
   )
   public int field9174;
   @OriginalMember(
      owner = "client!iq",
      name = "j",
      descriptor = "I"
   )
   public int field9175;
   @OriginalMember(
      owner = "client!iq",
      name = "f",
      descriptor = "I"
   )
   public int field9176;
   @OriginalMember(
      owner = "client!iq",
      name = "c",
      descriptor = "I"
   )
   public static int field9177;
   @OriginalMember(
      owner = "client!iq",
      name = "g",
      descriptor = "I"
   )
   public int field9179;
   @OriginalMember(
      owner = "client!iq",
      name = "h",
      descriptor = "I"
   )
   public int field9180;
   @OriginalMember(
      owner = "client!iq",
      name = "b",
      descriptor = "I"
   )
   public static int field9181;
   @OriginalMember(
      owner = "client!iq",
      name = "n",
      descriptor = "I"
   )
   public int field9182;

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(IIIIZIIIII)V"
   )
   public static final void method4545(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      int var10 = client.field4530;

      try {
         if (arg4) {
            field9178 = false;
         }

         ++field9181;
         if (arg8 == arg9 && arg0 == arg7 && arg3 == arg6 && ~arg1 == ~arg5) {
            class592.method4353(arg7, arg1, 46, arg2, arg3, arg8);
         } else {
            int var11 = arg8;
            int var12 = arg7;
            int var13 = arg8 * 3;
            int var14 = arg7 * 3;
            int var15 = arg9 * 3;
            int var16 = arg0 * 3;
            int var17 = arg6 * 3;
            int var18 = arg5 * 3;
            int var19 = arg3 - arg8 + -var17 + var15;
            int var20 = -var18 + var16 + arg1 + -arg7;
            int var21 = var17 - (var15 - var13 + var15);
            int var22 = var14 + var18 - (var16 + var16);
            int var23 = var15 - var13;
            int var24 = -var14 + var16;
            int var25 = 128;
            if (var10 != 0 || ~var25 >= -4097) {
               do {
                  int var26 = var25 * var25 >> 12;
                  int var27 = var25 * var26 >> 12;
                  int var28 = var19 * var27;
                  int var29 = var20 * var27;
                  int var30 = var21 * var26;
                  int var31 = var22 * var26;
                  int var32 = var23 * var25;
                  int var33 = var24 * var25;
                  int var34 = arg8 - -(var28 + var30 + var32 >> 12);
                  int var35 = (var29 + var31 + var33 >> 12) + arg7;
                  class592.method4353(var12, var35, 55, arg2, var34, var11);
                  var12 = var35;
                  var11 = var34;
                  var25 += 128;
               } while(~var25 >= -4097);

            }
         }
      } catch (RuntimeException var37) {
         throw class670.method4877(var37, field9183[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "a",
      descriptor = "(ILiq;)Z"
   )
   public final boolean method4546(int arg0, class631 arg1) {
      try {
         ++field9177;
         if (~this.field9176 == ~arg1.field9176 && ~this.field9169 == ~arg1.field9169 && ~this.field9175 == ~arg1.field9175) {
            return true;
         } else {
            return arg0 >= 0;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9183[2] + arg0 + ',' + (arg1 != null ? field9183[1] : field9183[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4547(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 72);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4548(char[] arg0) {
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
            var10005 = 8;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 72;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
