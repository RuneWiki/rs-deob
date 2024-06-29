import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uja")
public class class689 extends class454 {
   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10139 = new String[]{method5037(method5036("aS \u001f\t<")), method5037(method5036("aS \u001f\u000e<")), method5037(method5036("aS \u001f\r<")), method5037(method5036("aS \u001f\b<")), method5037(method5036("aS \u001f\u000f<")), method5037(method5036("aS \u001f\u000b<")), method5037(method5036("aS \u001f\f<"))};
   @OriginalMember(
      owner = "client!uja",
      name = "o",
      descriptor = "[B"
   )
   public static byte[] field10135 = new byte[520];
   @OriginalMember(
      owner = "client!uja",
      name = "k",
      descriptor = "I"
   )
   public static int field10129;
   @OriginalMember(
      owner = "client!uja",
      name = "n",
      descriptor = "I"
   )
   public static int field10130;
   @OriginalMember(
      owner = "client!uja",
      name = "l",
      descriptor = "I"
   )
   public static int field10131;
   @OriginalMember(
      owner = "client!uja",
      name = "r",
      descriptor = "I"
   )
   public static int field10133;
   @OriginalMember(
      owner = "client!uja",
      name = "q",
      descriptor = "I"
   )
   public static int field10136;
   @OriginalMember(
      owner = "client!uja",
      name = "m",
      descriptor = "I"
   )
   public static int field10137;
   @OriginalMember(
      owner = "client!uja",
      name = "j",
      descriptor = "I"
   )
   public static int field10138;
   @OriginalMember(
      owner = "client!uja",
      name = "i",
      descriptor = "Lkv;"
   )
   public static class19 field10134;
   @OriginalMember(
      owner = "client!uja",
      name = "p",
      descriptor = "[Lma;"
   )
   public static class670[] field10132;

   @OriginalMember(
      owner = "client!uja",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class689(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!uja",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class689(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         super.field6263 = arg1;
         ++field10131;
         if (arg0 >= -46) {
            field10135 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10139[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field10129;
         if (super.field6263 != 1 && ~super.field6263 != -1) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            method5033(18);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10139[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            return -20;
         } else {
            ++field10133;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field10139[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field10137;
         if (arg0 != 1) {
            this.method5034(104);
         }

         return 0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10139[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5033(int arg0) {
      try {
         if (arg0 != -1) {
            method5033(-76);
         }

         field10135 = null;
         field10134 = null;
         field10132 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10139[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "c",
      descriptor = "(I)I"
   )
   public final int method5034(int arg0) {
      try {
         if (arg0 != -18033) {
            field10135 = null;
         }

         ++field10130;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10139[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "b",
      descriptor = "(II)Z"
   )
   public static final boolean method5035(int arg0, int arg1) {
      try {
         ++field10138;
         if (arg0 != -7) {
            field10135 = null;
         }

         return arg1 == 3 || ~arg1 == -6 || ~arg1 == -7;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10139[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5036(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5037(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 20;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 49;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
