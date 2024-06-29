import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class458 extends class557 {
   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6690 = new String[]{method3547(method3546("ptnBD")), method3547(method3546("ptn@D")), method3547(method3546("ptnCD")), method3547(method3546("ptnGD")), method3547(method3546("ptnFD")), method3547(method3546("ptnED")), method3547(method3546("ptnND"))};
   @OriginalMember(
      owner = "client!mr",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field6685 = new int[2];
   @OriginalMember(
      owner = "client!mr",
      name = "m",
      descriptor = "B"
   )
   public static byte field6683;
   @OriginalMember(
      owner = "client!mr",
      name = "h",
      descriptor = "I"
   )
   public static int field6681;
   @OriginalMember(
      owner = "client!mr",
      name = "n",
      descriptor = "I"
   )
   public static int field6682;
   @OriginalMember(
      owner = "client!mr",
      name = "j",
      descriptor = "I"
   )
   public static int field6684;
   @OriginalMember(
      owner = "client!mr",
      name = "o",
      descriptor = "I"
   )
   public static int field6686;
   @OriginalMember(
      owner = "client!mr",
      name = "i",
      descriptor = "I"
   )
   public static int field6688;
   @OriginalMember(
      owner = "client!mr",
      name = "p",
      descriptor = "I"
   )
   public static int field6689;
   @OriginalMember(
      owner = "client!mr",
      name = "k",
      descriptor = "[I"
   )
   public static int[] field6687;

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         ++field6688;
         if (!arg1) {
            field6683 = -128;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6690[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class458(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field6686;
         if (arg0 != 1) {
            field6685 = null;
         }

         return 1;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6690[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class458(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!mr",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method3543(int arg0) {
      try {
         if (arg0 != 24204) {
            field6683 = -36;
         }

         field6685 = null;
         field6687 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6690[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method3544(int arg0) {
      try {
         ++field6684;
         if (arg0 > -52) {
            field6685 = null;
         }

         return super.field7905;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6690[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         ++field6682;
         if (arg0 != -22) {
            field6683 = -31;
         }

         if (~super.field7905 > -1 && ~super.field7905 < -5) {
            super.field7905 = this.method97(0);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6690[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3545(int arg0, int arg1, int arg2) {
      try {
         ++field6689;
         if (~arg2 <= -1001 && arg1 < 1000) {
            return true;
         } else if (arg0 != 2259) {
            return false;
         } else if (arg2 < 1000 && ~arg1 > -1001) {
            if (class226.method1988((byte)-70, arg1)) {
               return true;
            } else {
               return !class226.method1988((byte)-122, arg2);
            }
         } else {
            return ~arg2 <= -1001 && arg1 >= 1000;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6690[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            return -11;
         } else {
            ++field6681;
            return super.field7906.method4714((byte)-40).method5256((byte)-110) > 1 ? 4 : 2;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field6690[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3546(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3547(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 29;
            break;
         case 1:
            var10005 = 6;
            break;
         case 2:
            var10005 = 64;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
