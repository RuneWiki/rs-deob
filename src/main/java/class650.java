import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class650 extends class207 {
   @OriginalMember(
      owner = "client!lha",
      name = "p",
      descriptor = "I"
   )
   private int field9485 = -1;
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9487 = new String[]{method4690(method4689(" 8*\u0011Td")), method4690(method4689(" 8*\u0011Vd")), method4690(method4689("\"%'S")), method4690(method4689("7~e\u0011j")), method4690(method4689(" 8*\u0011Ud"))};
   @OriginalMember(
      owner = "client!lha",
      name = "s",
      descriptor = "I"
   )
   public static int field9486 = 0;
   @OriginalMember(
      owner = "client!lha",
      name = "o",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field9482 = new BigInteger(method4690(method4689("}`{\u000f&")), 16);
   @OriginalMember(
      owner = "client!lha",
      name = "r",
      descriptor = "I"
   )
   public static int field9481;
   @OriginalMember(
      owner = "client!lha",
      name = "n",
      descriptor = "I"
   )
   public static int field9483;
   @OriginalMember(
      owner = "client!lha",
      name = "q",
      descriptor = "[Ls;"
   )
   public static class293[] field9484;

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static void method4688(int arg0) {
      try {
         field9484 = null;
         field9482 = null;
         if (arg0 != 16) {
            method4688(7);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field9487[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(Lfa;Z)V",
      line = 20
   )
   public final void method791(class244 arg0, boolean arg1) {
      try {
         if (!arg1) {
            field9486 = -19;
         }

         ++field9481;
         arg0.method1815(this.field9485, 0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9487[4] + (arg0 != null ? field9487[3] : field9487[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(Ljj;Z)V",
      line = 36
   )
   public final void method793(class128 arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.field9485 = -3;
         }

         this.field9485 = arg0.method1038((byte)-105);
         ++field9483;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field9487[1] + (arg0 != null ? field9487[3] : field9487[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4689(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4690(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
