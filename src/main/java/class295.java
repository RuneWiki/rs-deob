import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class295 {
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "I"
   )
   public int field3871;
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public int field3873;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "I"
   )
   public int field3869;
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public int field3874;
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "[[I"
   )
   public int[][] field3872;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3875 = new String[]{method2223(method2222("\u007f/~\u0015")), method2223(method2222("jt<W-")), method2223(method2222("bt.\u0010>x.,Q")), method2223(method2222("btBQ")), method2223(method2222("btCQ"))};
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "I"
   )
   public static int field3870 = 0;
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "I"
   )
   public static int field3867;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public static int field3868;

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class194 method1678(int arg0, int arg1, class194 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method1684(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method1674(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III)I"
   )
   public final int method2220(int arg0, int arg1, int arg2) {
      try {
         ++field3868;
         if (arg0 <= 116) {
            this.method2221(true, -67, -83);
         }

         int var4 = arg1 >> this.field3874;
         int var5 = arg2 >> this.field3874;
         if (var4 >= 0 && ~var5 <= -1 && ~(this.field3873 + -1) <= ~var4 && ~(this.field3871 + -1) <= ~var5) {
            int var6 = this.field3869 + -1 & arg1;
            int var7 = this.field3869 + -1 & arg2;
            int var8 = (-var6 + this.field3869) * this.field3872[var4][var5] + this.field3872[var4 - -1][var5] * var6 >> this.field3874;
            int var9 = (-var6 + this.field3869) * this.field3872[var4][var5 + 1] + this.field3872[var4 - -1][var5 + 1] * var6 >> this.field3874;
            return (this.field3869 - var7) * var8 + var7 * var9 >> this.field3874;
         } else {
            return 0;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field3875[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Loda;[I)V"
   )
   public abstract void method1676(class127 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method1669(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method1668(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method1681();

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method1677(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method1680(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method1682(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method1683(class194 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "<init>",
      descriptor = "(III[[I)V"
   )
   public class295(int param1, int param2, int param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(ZII)I"
   )
   public final int method2221(boolean arg0, int arg1, int arg2) {
      try {
         if (arg0) {
            this.method1680(-46, 110, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, (int[])null, -68, 67, -70, false);
         }

         ++field3867;
         return this.field3872[arg2][arg1];
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3875[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method1671(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 80);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2223(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 17;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 18;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 80;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
