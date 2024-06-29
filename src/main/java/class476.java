import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class476 extends class454 {
   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6644 = new String[]{method3628(method3627("5\bdJp")), method3628(method3627("5\bdNp")), method3628(method3627("5\bdOp")), method3628(method3627("5\bdMp")), method3628(method3627("5\bdIp")), method3628(method3627("5\bdKp"))};
   @OriginalMember(
      owner = "client!rq",
      name = "l",
      descriptor = "Z"
   )
   public static boolean field6634 = false;
   @OriginalMember(
      owner = "client!rq",
      name = "o",
      descriptor = "I"
   )
   public static int field6635;
   @OriginalMember(
      owner = "client!rq",
      name = "n",
      descriptor = "I"
   )
   public static int field6636;
   @OriginalMember(
      owner = "client!rq",
      name = "q",
      descriptor = "I"
   )
   public static int field6637;
   @OriginalMember(
      owner = "client!rq",
      name = "k",
      descriptor = "I"
   )
   public static int field6639;
   @OriginalMember(
      owner = "client!rq",
      name = "m",
      descriptor = "I"
   )
   public static int field6640;
   @OriginalMember(
      owner = "client!rq",
      name = "j",
      descriptor = "I"
   )
   public static int field6641;
   @OriginalMember(
      owner = "client!rq",
      name = "p",
      descriptor = "I"
   )
   public static int field6642;
   @OriginalMember(
      owner = "client!rq",
      name = "i",
      descriptor = "Loea;"
   )
   public static class615 field6638;
   @OriginalMember(
      owner = "client!rq",
      name = "r",
      descriptor = "[Lpd;"
   )
   public static class648[] field6643;

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(BI)V"
   )
   public final void method20(byte arg0, int arg1) {
      try {
         if (arg0 >= -46) {
            field6643 = null;
         }

         super.field6263 = arg1;
         ++field6636;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6644[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(IZ)I"
   )
   public final int method24(int arg0, boolean arg1) {
      try {
         if (arg1) {
            field6642 = 62;
         }

         ++field6641;
         return 1;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6644[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "<init>",
      descriptor = "(Lme;)V"
   )
   public class476(class752 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(I)I"
   )
   public final int method23(int arg0) {
      try {
         ++field6640;
         return arg0 < super.field6259.method5445(true).method2421((byte)120) ? 4 : 2;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6644[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method3625(int arg0) {
      try {
         field6643 = null;
         field6638 = null;
         if (arg0 < 74) {
            field6637 = 85;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6644[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method28(boolean arg0) {
      try {
         ++field6639;
         if (~super.field6263 > -1 && super.field6263 > 4) {
            super.field6263 = this.method23(1);
         }

         if (!arg0) {
            field6638 = null;
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6644[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method3626(int arg0) {
      try {
         if (arg0 != -18033) {
            this.method28(true);
         }

         ++field6635;
         return super.field6263;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6644[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rq",
      name = "<init>",
      descriptor = "(ILme;)V"
   )
   public class476(int arg0, class752 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3627(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3628(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 121;
            break;
         case 2:
            var10005 = 74;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
