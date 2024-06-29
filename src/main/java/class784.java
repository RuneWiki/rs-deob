import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class784 extends class454 {
   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11464 = new String[]{method5665(method5664("^4\u0016_1")), method5665(method5664("^4\u0016[1")), method5665(method5664("^4\u0016X1")), method5665(method5664("^4\u0016R1")), method5665(method5664("^4\u0016^1")), method5665(method5664("^4\u0016Y1")), method5665(method5664("^4\u0016]1")), method5665(method5664("^4\u0016\\1"))};
   @OriginalMember(
      owner = "client!jf",
      name = "i",
      descriptor = "Lfea;"
   )
   public static class681 field11460 = new class681(14, 0, 4, 1);
   @OriginalMember(
      owner = "client!jf",
      name = "p",
      descriptor = "F"
   )
   public static float field11461 = 0.0F;
   @OriginalMember(
      owner = "client!jf",
      name = "q",
      descriptor = "I"
   )
   public static int field11453;
   @OriginalMember(
      owner = "client!jf",
      name = "n",
      descriptor = "I"
   )
   public static int field11454;
   @OriginalMember(
      owner = "client!jf",
      name = "o",
      descriptor = "I"
   )
   public static int field11455;
   @OriginalMember(
      owner = "client!jf",
      name = "r",
      descriptor = "I"
   )
   public static int field11456;
   @OriginalMember(
      owner = "client!jf",
      name = "j",
      descriptor = "I"
   )
   public static int field11457;
   @OriginalMember(
      owner = "client!jf",
      name = "k",
      descriptor = "I"
   )
   public static int field11458;
   @OriginalMember(
      owner = "client!jf",
      name = "s",
      descriptor = "I"
   )
   public static int field11459;
   @OriginalMember(
      owner = "client!jf",
      name = "m",
      descriptor = "I"
   )
   public static int field11463;
   @OriginalMember(
      owner = "client!jf",
      name = "l",
      descriptor = "Laaa;"
   )
   public static class254 field11462;

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method5660(boolean arg0) {
      try {
         ++field11463;
         if (arg0) {
            return true;
         } else if (super.field6259.method5434((byte)-119)) {
            return false;
         } else {
            return ~super.field6259.field10973.method5420(-18033) != -1;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11464[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5661(int arg0) {
      try {
         field11462 = null;
         field11460 = null;
         if (arg0 != -1788) {
            method5663(77, 28);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field11464[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5662(int arg0) {
      try {
         if (arg0 != -18033) {
            return 23;
         } else {
            ++field11458;
            return super.field6263;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11464[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "b",
      descriptor = "(II)I"
   )
   public static final int method5663(int arg0, int arg1) {
      try {
         if (arg1 != -495577497) {
            field11460 = null;
         }

         ++field11456;
         return arg0 >>> 7;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11464[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class784(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 >= -46) {
            field11460 = null;
         }

         super.field6263 = arg1;
         ++field11455;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11464[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (super.field6259.method5434((byte)-117)) {
            super.field6263 = 0;
         }

         ++field11457;
         if (super.field6259.field10973.method5420(-18033) == 0) {
            super.field6263 = 0;
         }

         if (~super.field6263 > -1 || ~super.field6263 < -3) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            this.method23(-73);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11464[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         ++field11453;
         if (super.field6259.method5434((byte)-126)) {
            return 3;
         } else if (super.field6259.field10973.method5420(-18033) == 0) {
            return 3;
         } else {
            if (arg1) {
               field11460 = null;
            }

            return 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field11464[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         if (arg0 != 1) {
            return 80;
         } else {
            ++field11459;
            return 2;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field11464[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jf",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class784(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5664(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5665(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 52;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 56;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
