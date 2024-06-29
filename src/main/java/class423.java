import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class423 {
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "I"
   )
   public int field5769;
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public int field5767;
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "I"
   )
   public int field5764;
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "I"
   )
   public int field5773;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "[[I"
   )
   public int[][] field5770;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5775 = new String[]{method3291(method3290("oE\u0013\u0011")), method3291(method3290("gEq\u0017y")), method3291(method3290("oEcPju\u001fa\u0011")), method3291(method3290("r\u001e3U")), method3291(method3290("oE\u0012\u0011")), method3291(method3290("oE\u001a\u0011")), method3291(method3290("oE\u0014\u0011")), method3291(method3290("oE\u0017\u0011")), method3291(method3290("oE\u001c\u0011"))};
   @OriginalMember(
      owner = "client!s",
      name = "i",
      descriptor = "Laka;"
   )
   public static class418 field5771 = new class418(23, 4);
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "S"
   )
   public static short field5774 = 32767;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public static int field5763;
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public static int field5765;
   @OriginalMember(
      owner = "client!s",
      name = "j",
      descriptor = "I"
   )
   public static int field5766;
   @OriginalMember(
      owner = "client!s",
      name = "k",
      descriptor = "I"
   )
   public static int field5768;
   @OriginalMember(
      owner = "client!s",
      name = "l",
      descriptor = "I"
   )
   public static int field5772;

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method947(class114 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lue;[I)V"
   )
   public abstract void method955(class243 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method3284(int arg0, int arg1, int arg2) {
      try {
         ++field5763;
         return arg0 != -1 ? -128 : this.field5770[arg1][arg2];
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field5775[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method954(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method958(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method950(class114 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(ILgea;)Lsf;"
   )
   public static final class449 method3285(int arg0, class66 arg1) {
      try {
         int var2 = 50 / ((arg0 - -47) / 53);
         ++field5766;
         return new class449(arg1.method652((byte)-116), arg1.method652((byte)2), arg1.method652((byte)-107), arg1.method652((byte)-125), arg1.method645((byte)-26), arg1.method645((byte)-26), arg1.method640(255));
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5775[8] + arg0 + ',' + (arg1 != null ? field5775[1] : field5775[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method3286(int arg0, int arg1, int arg2) {
      try {
         ++field5772;
         return arg0 != 1 ? false : class778.method5621(arg1, -6117, arg2) & class69.method682(false, arg2, arg1);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field5775[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method941(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method943(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method956(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method944(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3287(int arg0) {
      try {
         field5771 = null;
         if (arg0 != 1) {
            field5774 = -85;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field5775[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IBI)I"
   )
   public final int method3288(int arg0, byte arg1, int arg2) {
      try {
         ++field5768;
         int var4 = arg0 >> this.field5773;
         int var5 = arg2 >> this.field5773;
         if (~var4 <= -1 && ~var5 <= -1 && ~(this.field5769 - 1) <= ~var4 && this.field5767 + -1 >= var5) {
            int var6 = this.field5764 + -1 & arg0;
            int var7 = arg2 & this.field5764 - 1;
            int var8 = (-var6 + this.field5764) * this.field5770[var4][var5] + this.field5770[var4 + 1][var5] * var6 >> this.field5773;
            int var9 = (-var6 + this.field5764) * this.field5770[var4][var5 + 1] + this.field5770[var4 + 1][var5 - -1] * var6 >> this.field5773;
            if (arg1 != 121) {
               this.method952((class114)null, -103, 99, 80, -42, true);
            }

            return (-var7 + this.field5764) * var8 + var7 * var9 >> this.field5773;
         } else {
            return 0;
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field5775[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class114 method945(int arg0, int arg1, class114 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method946();

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method957(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method952(class114 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIII)V"
   )
   public static final void method3289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field5765;
         if (arg3 > 104) {
            if (~class415.field5689 >= ~arg2 && ~arg5 >= ~class282.field3921 && ~class577.field8561 >= ~arg1 && arg0 <= class586.field8647) {
               class753.method5454(arg4, arg0, arg1, 15513, arg5, arg2);
            } else {
               class175.method1499(arg1, arg4, arg5, arg0, -92, arg2);
            }
         }
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field5775[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "<init>",
      descriptor = "(III[[I)V"
   )
   public class423(int param1, int param2, int param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3290(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3291(char[] arg0) {
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
            var10005 = 107;
            break;
         case 2:
            var10005 = 95;
            break;
         case 3:
            var10005 = 57;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
