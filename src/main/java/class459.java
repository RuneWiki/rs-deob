import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class459 extends class557 {
   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6700 = new String[]{method3552(method3551("}nx:m4")), method3552(method3551("}nx:i4")), method3552(method3551("}nx:l4")), method3552(method3551("}nx:k4")), method3552(method3551("}nx:b4")), method3552(method3551("}nx:n4")), method3552(method3551("}nx:`4"))};
   @OriginalMember(
      owner = "client!aha",
      name = "h",
      descriptor = "Lnfa;"
   )
   public static class537 field6692 = new class537(8);
   @OriginalMember(
      owner = "client!aha",
      name = "o",
      descriptor = "Z"
   )
   public static boolean field6699 = false;
   @OriginalMember(
      owner = "client!aha",
      name = "l",
      descriptor = "I"
   )
   public static int field6691;
   @OriginalMember(
      owner = "client!aha",
      name = "k",
      descriptor = "I"
   )
   public static int field6693;
   @OriginalMember(
      owner = "client!aha",
      name = "m",
      descriptor = "I"
   )
   public static int field6694;
   @OriginalMember(
      owner = "client!aha",
      name = "n",
      descriptor = "I"
   )
   public static int field6695;
   @OriginalMember(
      owner = "client!aha",
      name = "p",
      descriptor = "I"
   )
   public static int field6696;
   @OriginalMember(
      owner = "client!aha",
      name = "j",
      descriptor = "I"
   )
   public static int field6697;
   @OriginalMember(
      owner = "client!aha",
      name = "i",
      descriptor = "I"
   )
   public static int field6698;

   @OriginalMember(
      owner = "client!aha",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method3548(byte arg0) {
      try {
         if (arg0 != 108) {
            field6692 = null;
         }

         ++field6698;
         return !super.field7906.method4710(-124);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6700[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            field6692 = null;
         }

         ++field6691;
         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6700[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         ++field6697;
         if (arg0 != 0) {
            field6699 = false;
         }

         if (!super.field7906.method4710(-127)) {
            return super.field7906.field9109.method4679(true) && class392.method3043(super.field7906.field9109.method4676(-65), 0) ? 1 : 0;
         } else {
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6700[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class459(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field6695;
         if (arg0 != 1) {
            this.method3550(96);
         }

         return super.field7906.method4710(-121) ? 3 : 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6700[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3549(int arg0) {
      try {
         int var1 = -52 % ((61 - arg0) / 47);
         field6692 = null;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6700[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class459(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!aha",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 != -22) {
            this.method3550(62);
         }

         if (super.field7906.method4710(-120)) {
            super.field7905 = 2;
         }

         ++field6696;
         if (~super.field7905 > -1 || super.field7905 > 2) {
            super.field7905 = this.method97(0);
         }

      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6700[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3550(int arg0) {
      try {
         if (arg0 >= -52) {
            return -15;
         } else {
            ++field6694;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6700[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3551(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 42);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3552(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 25;
            break;
         case 3:
            var10005 = 20;
            break;
         default:
            var10005 = 42;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
