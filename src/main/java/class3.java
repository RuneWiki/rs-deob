import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 extends class454 {
   @OriginalMember(
      owner = "client!el",
      name = "i",
      descriptor = "Z"
   )
   public boolean field42 = false;
   @OriginalMember(
      owner = "client!el",
      name = "q",
      descriptor = "Z"
   )
   private boolean field31 = true;
   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field45 = new String[]{method30(method29("T2SPE")), method30(method29("Ai\u0011\u0012")), method30(method29("JpS:\u0010")), method30(method29("JpS=\u0010")), method30(method29("JpS0\u0010")), method30(method29("JpS9\u0010")), method30(method29("JpS<\u0010")), method30(method29("E}\u001a\u001a@")), method30(method29("JpS6\u0010")), method30(method29("JpS8\u0010")), method30(method29("JpS?\u0010")), method30(method29("JpS;\u0010")), method30(method29("JpS1\u0010"))};
   @OriginalMember(
      owner = "client!el",
      name = "p",
      descriptor = "Laka;"
   )
   public static class418 field29 = new class418(74, 20);
   @OriginalMember(
      owner = "client!el",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field35 = false;
   @OriginalMember(
      owner = "client!el",
      name = "r",
      descriptor = "[I"
   )
   public static int[] field39 = new int[]{0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4};
   @OriginalMember(
      owner = "client!el",
      name = "t",
      descriptor = "I"
   )
   public static int field30;
   @OriginalMember(
      owner = "client!el",
      name = "m",
      descriptor = "I"
   )
   public static int field32;
   @OriginalMember(
      owner = "client!el",
      name = "j",
      descriptor = "I"
   )
   public static int field33;
   @OriginalMember(
      owner = "client!el",
      name = "s",
      descriptor = "I"
   )
   public static int field34;
   @OriginalMember(
      owner = "client!el",
      name = "w",
      descriptor = "I"
   )
   public static int field36;
   @OriginalMember(
      owner = "client!el",
      name = "v",
      descriptor = "I"
   )
   public static int field37;
   @OriginalMember(
      owner = "client!el",
      name = "x",
      descriptor = "I"
   )
   public static int field38;
   @OriginalMember(
      owner = "client!el",
      name = "o",
      descriptor = "I"
   )
   public static int field40;
   @OriginalMember(
      owner = "client!el",
      name = "u",
      descriptor = "I"
   )
   public static int field41;
   @OriginalMember(
      owner = "client!el",
      name = "k",
      descriptor = "I"
   )
   public static int field43;
   @OriginalMember(
      owner = "client!el",
      name = "n",
      descriptor = "Lte;"
   )
   public static class276 field44;

   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method19(boolean arg0) {
      try {
         ++field40;
         if (!super.field6259.method5445(true).method2418((byte)-82)) {
            return false;
         } else {
            return arg0 ? true : true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field45[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field33;
         super.field6263 = arg1;
         this.field42 = false;
         if (arg0 >= -46) {
            field35 = false;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field45[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(B[[BLhe;)V"
   )
   public static final void method21(byte param0, byte[][] param1, class621 param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!el",
      name = "c",
      descriptor = "(B)Z"
   )
   public final boolean method22(byte arg0) {
      try {
         if (arg0 < 82) {
            this.method27(103);
         }

         ++field34;
         return this.field31;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field45[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field41;
         if (arg0 != 1) {
            this.method19(true);
         }

         this.field42 = true;
         return !super.field6259.method5445(true).method2418((byte)-82) ? 0 : 2;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field45[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field44 = null;
         }

         ++field30;
         if (!super.field6259.method5445(true).method2418((byte)-82)) {
            return 3;
         } else {
            return ~arg0 == -4 && !class59.method538(field45[7], -95) ? 3 : 2;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field45[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method25(byte arg0) {
      try {
         field39 = null;
         field44 = null;
         int var1 = 92 % ((-20 - arg0) / 33);
         field29 = null;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field45[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method26(byte arg0, boolean arg1) {
      try {
         this.field31 = arg1;
         if (arg0 != -96) {
            this.method24(41, false);
         }

         ++field36;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field45[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class3(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!el",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method27(int arg0) {
      try {
         if (arg0 != -18033) {
            this.method20((byte)3, -77);
         }

         ++field37;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field45[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class3(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!el",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (!arg0) {
            this.method27(40);
         }

         if (!super.field6259.method5445(arg0).method2418((byte)-82)) {
            super.field6263 = 0;
         }

         ++field43;
         if (~super.field6263 > -1 || ~super.field6263 < -6) {
            super.field6263 = this.method23(1);
         }

      } catch (RuntimeException var3) {
         throw class93.method866(var3, field45[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method29(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!el",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method30(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
