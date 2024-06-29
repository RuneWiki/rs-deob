import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class720 extends class454 {
   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10557 = new String[]{method5237(method5236(" \u001dPw|")), method5237(method5236(" \u001dPv|")), method5237(method5236(" \u001dPs|")), method5237(method5236(" \u001dPt|")), method5237(method5236(" \u001dPp|")), method5237(method5236(" \u001dPr|")), method5237(method5236(" \u001dP}|"))};
   @OriginalMember(
      owner = "client!fw",
      name = "l",
      descriptor = "Laka;"
   )
   public static class418 field10553 = new class418(75, -1);
   @OriginalMember(
      owner = "client!fw",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10556 = null;
   @OriginalMember(
      owner = "client!fw",
      name = "i",
      descriptor = "I"
   )
   public static int field10547;
   @OriginalMember(
      owner = "client!fw",
      name = "q",
      descriptor = "I"
   )
   public static int field10548;
   @OriginalMember(
      owner = "client!fw",
      name = "m",
      descriptor = "I"
   )
   public static int field10549;
   @OriginalMember(
      owner = "client!fw",
      name = "r",
      descriptor = "I"
   )
   public static int field10550;
   @OriginalMember(
      owner = "client!fw",
      name = "j",
      descriptor = "I"
   )
   public static int field10551;
   @OriginalMember(
      owner = "client!fw",
      name = "k",
      descriptor = "I"
   )
   public static int field10552;
   @OriginalMember(
      owner = "client!fw",
      name = "n",
      descriptor = "I"
   )
   public static int field10554;
   @OriginalMember(
      owner = "client!fw",
      name = "o",
      descriptor = "Len;"
   )
   public static class412 field10555;

   @OriginalMember(
      owner = "client!fw",
      name = "c",
      descriptor = "(Z)Z"
   )
   public final boolean method5233(boolean arg0) {
      try {
         ++field10554;
         if (!class485.method3683((byte)-95, super.field6259.field11012.method27(-18033))) {
            return false;
         } else {
            if (arg0) {
               field10547 = 13;
            }

            return true;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10557[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            return 96;
         } else {
            ++field10550;
            return !class485.method3683((byte)-108, super.field6259.field11012.method27(-18033)) ? 3 : 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10557[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field10552;
         if (arg0 != 1) {
            field10553 = null;
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10557[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(Z)V"
   )
   public static void method5234(boolean arg0) {
      try {
         field10556 = null;
         if (!arg0) {
            field10553 = null;
            field10555 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10557[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method5235(int arg0) {
      try {
         ++field10548;
         if (arg0 != -18033) {
            field10555 = null;
         }

         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10557[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         ++field10549;
         if (arg0 >= -46) {
            this.method20((byte)86, -42);
         }

         super.field6263 = arg1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10557[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class720(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         if (arg0) {
            if (super.field6259.field11012.method22((byte)108) && !class485.method3683((byte)-76, super.field6259.field11012.method27(-18033))) {
               super.field6263 = 0;
            }

            ++field10551;
            if (~super.field6263 > -1 || super.field6263 > 2) {
               super.field6263 = this.method23(1);
            }

         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10557[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fw",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class720(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5236(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5237(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 106;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
