import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class691 extends class557 {
   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9953 = new String[]{method5016(method5015("8f\u007f*Oz")), method5016(method5015("8f\u007f*Az")), method5016(method5015("8f\u007f*Bz")), method5016(method5015("8f\u007f*Dz")), method5016(method5015("8f\u007f*Fz")), method5016(method5015("8f\u007f*Mz")), method5016(method5015("8f\u007f*Cz"))};
   @OriginalMember(
      owner = "client!jja",
      name = "m",
      descriptor = "Z"
   )
   public static boolean field9946 = false;
   @OriginalMember(
      owner = "client!jja",
      name = "i",
      descriptor = "I"
   )
   public static int field9944;
   @OriginalMember(
      owner = "client!jja",
      name = "n",
      descriptor = "I"
   )
   public static int field9945;
   @OriginalMember(
      owner = "client!jja",
      name = "o",
      descriptor = "I"
   )
   public static int field9947;
   @OriginalMember(
      owner = "client!jja",
      name = "j",
      descriptor = "I"
   )
   public static int field9948;
   @OriginalMember(
      owner = "client!jja",
      name = "k",
      descriptor = "I"
   )
   public static int field9949;
   @OriginalMember(
      owner = "client!jja",
      name = "p",
      descriptor = "I"
   )
   public static int field9951;
   @OriginalMember(
      owner = "client!jja",
      name = "h",
      descriptor = "I"
   )
   public static int field9952;
   @OriginalMember(
      owner = "client!jja",
      name = "l",
      descriptor = "Lqaa;"
   )
   public static class119 field9950;

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method98(byte arg0) {
      try {
         if (super.field7906.method4710(-123)) {
            super.field7905 = 0;
         }

         ++field9949;
         if (super.field7905 < 0 && ~super.field7905 < -3) {
            super.field7905 = this.method97(arg0 ^ -22);
         }

         if (arg0 != -22) {
            this.method98((byte)-125);
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9953[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method5012(int arg0) {
      try {
         if (arg0 != 7762) {
            method5012(-120);
         }

         field9950 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field9953[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method99(int arg0, boolean arg1) {
      try {
         ++field9947;
         if (!arg1) {
            this.method5014(15);
         }

         super.field7905 = arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9953[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method5013(byte arg0) {
      try {
         if (arg0 != 108) {
            field9945 = 105;
         }

         ++field9952;
         return !super.field7906.method4710(arg0 ^ -17);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9953[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "<init>",
      descriptor = "(Loea;)V"
   )
   public class691(class647 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jja",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5014(int arg0) {
      try {
         if (arg0 >= -52) {
            return -57;
         } else {
            ++field9944;
            return super.field7905;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9953[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method97(int arg0) {
      try {
         if (arg0 != 0) {
            return -105;
         } else {
            ++field9951;
            return 1;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field9953[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method92(int arg0, int arg1) {
      try {
         ++field9948;
         if (super.field7906.method4710(-128)) {
            return 3;
         } else {
            if (arg0 != 1) {
               this.method92(22, 103);
            }

            return ~arg1 != -1 && super.field7906.field9119.method5500(-101) != 1 ? 2 : 1;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field9953[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jja",
      name = "<init>",
      descriptor = "(ILoea;)V"
   )
   public class691(int arg0, class647 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5015(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5016(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 82;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 30;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
