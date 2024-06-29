import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class458 extends class454 {
   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6308 = new String[]{method3501(method3500("A\u001d6\t\u001e\r")), method3501(method3500("A\u001d6\t\u0018\r")), method3501(method3500("A\u001d6\t\u001f\r")), method3501(method3500("A\u001d6\t\u001c\r")), method3501(method3500("A\u001d6\t\u001a\r")), method3501(method3500("A\u001d6\t\u0015\r")), method3501(method3500("A\u001d6\t\u001b\r"))};
   @OriginalMember(
      owner = "client!daa",
      name = "n",
      descriptor = "[Laca;"
   )
   public static class608[] field6304 = new class608[100];
   @OriginalMember(
      owner = "client!daa",
      name = "l",
      descriptor = "Ljava/math/BigInteger;"
   )
   public static BigInteger field6305 = new BigInteger(method3501(method3500("\u0014Lg\u0017l")), 16);
   @OriginalMember(
      owner = "client!daa",
      name = "r",
      descriptor = "J"
   )
   public static long field6306 = 0L;
   @OriginalMember(
      owner = "client!daa",
      name = "i",
      descriptor = "F"
   )
   public static float field6307;
   @OriginalMember(
      owner = "client!daa",
      name = "j",
      descriptor = "I"
   )
   public static int field6298;
   @OriginalMember(
      owner = "client!daa",
      name = "q",
      descriptor = "I"
   )
   public static int field6299;
   @OriginalMember(
      owner = "client!daa",
      name = "m",
      descriptor = "I"
   )
   public static int field6300;
   @OriginalMember(
      owner = "client!daa",
      name = "p",
      descriptor = "I"
   )
   public static int field6301;
   @OriginalMember(
      owner = "client!daa",
      name = "o",
      descriptor = "I"
   )
   public static int field6302;
   @OriginalMember(
      owner = "client!daa",
      name = "k",
      descriptor = "I"
   )
   public static int field6303;

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3497(int arg0) {
      try {
         if (arg0 != -18033) {
            return 43;
         } else {
            ++field6300;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6308[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class458(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field6301;
         int var3 = super.field6259.method5445(true).method2419(-1);
         if (var3 < 96) {
            return 3;
         } else if (~arg0 < -2 && ~var3 > -129) {
            return 3;
         } else {
            if (arg1) {
               this.method20((byte)-126, 91);
            }

            return ~arg0 < -4 && ~var3 > -193 ? 3 : 1;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6308[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field6303;
         int var2 = super.field6259.method5445(arg0).method2419(-1);
         if (~var2 > -97) {
            super.field6263 = 0;
         }

         if (~super.field6263 < -2 && ~var2 > -129) {
            super.field6263 = 1;
         }

         if (~super.field6263 < -3 && ~var2 > -193) {
            super.field6263 = 2;
         }

         if (super.field6263 < 0 || super.field6263 > 3) {
            super.field6263 = this.method23(1);
         }

      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6308[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method3498(boolean arg0) {
      try {
         ++field6302;
         int var2 = super.field6259.method5445(true).method2419(-1);
         if (arg0) {
            return true;
         } else {
            return ~var2 <= -97;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6308[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field6298;
         return arg0 != 1 ? 78 : 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6308[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3499(int arg0) {
      try {
         if (arg0 != 3) {
            method3499(-1);
         }

         field6305 = null;
         field6304 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6308[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class458(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!daa",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field6299;
         super.field6263 = arg1;
         if (arg0 >= -46) {
            this.method3497(-82);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6308[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!daa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 37;
            break;
         case 1:
            var10005 = 124;
            break;
         case 2:
            var10005 = 87;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
