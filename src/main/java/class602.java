import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class602 extends class557 {
   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8586 = new String[]{method4438(method4437("-6'/L")), method4438(method4437("-6'*L")), method4438(method4437("-6',L")), method4438(method4437("-6'(L")), method4438(method4437("-6')L")), method4438(method4437("-6'#L")), method4438(method4437("-6'-L")), method4438(method4437("-6'!L"))};
   @OriginalMember(
      owner = "client!oh",
      name = "p",
      descriptor = "[I"
   )
   public static int[] field8584 = new int[32];
   @OriginalMember(
      owner = "client!oh",
      name = "o",
      descriptor = "I"
   )
   public static int field8583 = 0;
   @OriginalMember(
      owner = "client!oh",
      name = "m",
      descriptor = "I"
   )
   public static int field8577;
   @OriginalMember(
      owner = "client!oh",
      name = "k",
      descriptor = "I"
   )
   public static int field8578;
   @OriginalMember(
      owner = "client!oh",
      name = "i",
      descriptor = "I"
   )
   public static int field8579;
   @OriginalMember(
      owner = "client!oh",
      name = "j",
      descriptor = "I"
   )
   public static int field8580;
   @OriginalMember(
      owner = "client!oh",
      name = "n",
      descriptor = "I"
   )
   public static int field8581;
   @OriginalMember(
      owner = "client!oh",
      name = "l",
      descriptor = "I"
   )
   public static int field8582;
   @OriginalMember(
      owner = "client!oh",
      name = "h",
      descriptor = "I"
   )
   public static int field8585;

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field8579;
         if (!class137.method1385(4175, super.field7906.field9109.method4676(-73))) {
            return 3;
         } else {
            if (arg0 != 1) {
               field8584 = null;
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8586[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(Z)Lpea;"
   )
   public static final class455 method4433(boolean arg0) {
      try {
         ++field8578;
         if (!arg0) {
            field8584 = null;
         }

         return class224.method1925(-119, 1);
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8586[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class602(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!oh",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class602(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!oh",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4434(int arg0) {
      try {
         field8584 = null;
         if (arg0 != 3) {
            field8583 = 102;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8586[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method4435(byte arg0) {
      try {
         ++field8581;
         if (arg0 != 108) {
            field8584 = null;
         }

         return class137.method1385(4175, super.field7906.field9109.method4676(-118));
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8586[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (arg0 == -22) {
            if (super.field7905 < 0 || ~super.field7905 < -2) {
               super.field7905 = this.method97(0);
            }

            ++field8580;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8586[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method4436(int arg0) {
      try {
         if (arg0 > -52) {
            return -99;
         } else {
            ++field8585;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8586[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            method4433(true);
         }

         ++field8582;
         return 1;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8586[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         super.field7905 = arg0;
         if (arg1) {
            ++field8577;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8586[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4437(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4438(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 94;
            break;
         case 2:
            var10005 = 9;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
