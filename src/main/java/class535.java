import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class535 extends class335 {
   @OriginalMember(
      owner = "client!qj",
      name = "l",
      descriptor = "I"
   )
   private int field7804;
   @OriginalMember(
      owner = "client!qj",
      name = "o",
      descriptor = "I"
   )
   private int field7809;
   @OriginalMember(
      owner = "client!qj",
      name = "q",
      descriptor = "I"
   )
   private int field7806;
   @OriginalMember(
      owner = "client!qj",
      name = "p",
      descriptor = "I"
   )
   private int field7805;
   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7814 = new String[]{method3966(method3965("}a1\u0004)bbk\u0006h")), method3966(method3965("}a1}h")), method3966(method3965("}a1{h")), method3966(method3965("}a1yh")), method3966(method3965("}a1zh"))};
   @OriginalMember(
      owner = "client!qj",
      name = "s",
      descriptor = "I"
   )
   public static int field7802 = class788.method5654(29990, 1600);
   @OriginalMember(
      owner = "client!qj",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field7813 = new int[1];
   @OriginalMember(
      owner = "client!qj",
      name = "j",
      descriptor = "I"
   )
   public static int field7807;
   @OriginalMember(
      owner = "client!qj",
      name = "i",
      descriptor = "I"
   )
   public static int field7808;
   @OriginalMember(
      owner = "client!qj",
      name = "t",
      descriptor = "I"
   )
   public static int field7810;
   @OriginalMember(
      owner = "client!qj",
      name = "n",
      descriptor = "I"
   )
   public static int field7811;
   @OriginalMember(
      owner = "client!qj",
      name = "k",
      descriptor = "[Lmca;"
   )
   public static class33[] field7812;
   @OriginalMember(
      owner = "client!qj",
      name = "r",
      descriptor = "[Lvs;"
   )
   public static class616[] field7803;

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3963(byte arg0) {
      try {
         field7812 = null;
         field7813 = null;
         if (arg0 == -102) {
            field7803 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7814[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method2537(int arg0, byte arg1, int arg2) {
      try {
         ++field7811;
         if (arg1 <= 84) {
            method3963((byte)-41);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7814[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "<init>",
      descriptor = "(IIIIII)V"
   )
   public class535(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      super(-1, arg4, arg5);

      try {
         this.field7804 = arg1;
         this.field7809 = arg3;
         this.field7806 = arg2;
         this.field7805 = arg0;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field7814[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method2541(int arg0, int arg1, int arg2) {
      try {
         ++field7808;
         if (arg1 != 0) {
            this.method2537(117, (byte)37, -6);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field7814[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "()V"
   )
   public static final void method3964() {
      class499.field7394 = class499.field7386;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(BII)V"
   )
   public final void method2540(byte arg0, int arg1, int arg2) {
      try {
         ++field7807;
         int var4 = this.field7805 * arg2 >> 12;
         int var5 = this.field7806 * arg2 >> 12;
         int var6 = this.field7804 * arg1 >> 12;
         if (arg0 < 71) {
            this.method2537(124, (byte)-33, 76);
         }

         int var7 = this.field7809 * arg1 >> 12;
         class353.method2756(var6, var5, super.field4791, 4095, var4, var7);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field7814[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3965(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3966(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 12;
            break;
         case 1:
            var10005 = 11;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 56;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
