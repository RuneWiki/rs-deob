import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class751 {
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "I"
   )
   public int field10665;
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "I"
   )
   public int field10666;
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public int field10672;
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "[[I"
   )
   public int[][] field10669;
   @OriginalMember(
      owner = "client!s",
      name = "i",
      descriptor = "I"
   )
   public int field10671;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10673 = new String[]{method5403(method5402("\u0007?%*")), method5403(method5402("\u0007?'*")), method5403(method5402("\u001ad\u0018n")), method5403(method5402("\u0007?HkB\u001deJ*")), method5403(method5402("\u000f?Z,Q")), method5403(method5402("\u0007?&*")), method5403(method5402("\u0007?$*"))};
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public static int field10664;
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "I"
   )
   public static int field10667;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public static int field10668;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "I"
   )
   public static int field10670;

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIBI)V"
   )
   public static final void method5398(int param0, int param1, int param2, int param3, byte param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method45(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method50(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III)Ljga;"
   )
   public static final class91 method5399(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != 1) {
            method5398(-38, -26, -8, 91, (byte)35, 66);
         }

         ++field10668;
         class91 var3 = class460.method3554(-86, arg0);
         if (~arg2 == 0) {
            return var3;
         } else {
            return var3 != null && var3.field1463 != null && ~var3.field1463.length < ~arg2 ? var3.field1463[arg2] : null;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10673[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method53(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method52(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class412 method43(int arg0, int arg1, class412 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method48(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method49(class412 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method54();

   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "(III)I"
   )
   public final int method5400(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -1) {
            this.field10669 = null;
         }

         ++field10670;
         return this.field10669[arg2][arg1];
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field10673[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method57(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lpha;[I)V"
   )
   public abstract void method46(class757 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method44(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method47(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IZI)I"
   )
   public final int method5401(int arg0, boolean arg1, int arg2) {
      try {
         ++field10667;
         int var4 = arg0 >> this.field10671;
         int var5 = arg2 >> this.field10671;
         if (~var4 <= -1 && ~var5 <= -1 && ~(this.field10665 + -1) <= ~var4 && this.field10666 - 1 >= var5) {
            int var6 = arg0 & this.field10672 - 1;
            int var7 = this.field10672 - 1 & arg2;
            int var8 = (-var6 + this.field10672) * this.field10669[var4][var5] + this.field10669[var4 + 1][var5] * var6 >> this.field10671;
            if (!arg1) {
               this.field10672 = 12;
            }

            int var9 = (-var6 + this.field10672) * this.field10669[var4][var5 + 1] + this.field10669[var4 + 1][var5 + 1] * var6 >> this.field10671;
            return (-var7 + this.field10672) * var8 + var7 * var9 >> this.field10671;
         } else {
            return 0;
         }
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10673[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "<init>",
      descriptor = "(III[[I)V"
   )
   public class751(int param1, int param2, int param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5402(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 44);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5403(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 116;
            break;
         case 1:
            var10005 = 17;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 2;
            break;
         default:
            var10005 = 44;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
