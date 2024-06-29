import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class293 {
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public int field4077;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public int field4080;
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "I"
   )
   public int field4083;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "[[I"
   )
   public int[][] field4078;
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "I"
   )
   public int field4081;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4086 = new String[]{method2294(method2293("5:\u001f]O")), method2294(method2293(" a]\u001f")), method2294(method2293("=:\r\u001a\\'`\u000f[")), method2294(method2293("=:a[")), method2294(method2293("=:c[")), method2294(method2293("=:`["))};
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "I"
   )
   public static int field4079 = 0;
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public static int field4082;
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "I"
   )
   public static int field4084;
   @OriginalMember(
      owner = "client!s",
      name = "i",
      descriptor = "I"
   )
   public static int field4085;

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[Ljfa;)V",
      line = 4
   )
   public static final void method2278(int param0, int param1, class303[] param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III)I",
      line = 90
   )
   public final int method2287(int arg0, int arg1, int arg2) {
      try {
         ++field4082;
         int var4 = arg2 >> this.field4081;
         int var5 = arg1 >> this.field4081;
         if (var4 >= 0 && var5 >= 0 && ~var4 >= ~(this.field4080 + -1) && this.field4077 + -1 >= var5) {
            int var6 = arg2 & this.field4083 + -1;
            int var7 = -87 / ((arg0 - -21) / 38);
            int var8 = arg1 & this.field4083 + -1;
            int var9 = (-var6 + this.field4083) * this.field4078[var4][var5] - -(this.field4078[var4 + 1][var5] * var6) >> this.field4081;
            int var10 = (-var6 + this.field4083) * this.field4078[var4][var5 + 1] + this.field4078[var4 + 1][var5 + 1] * var6 >> this.field4081;
            return (-var8 + this.field4083) * var9 + var8 * var10 >> this.field4081;
         } else {
            return 0;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field4086[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIB)I",
      line = 122
   )
   public final int method2289(int arg0, int arg1, byte arg2) {
      try {
         if (arg2 <= 107) {
            this.method2288((class192)null, -82, -121, -76, 70, false);
         }

         ++field4084;
         return this.field4078[arg0][arg1];
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field4086[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "<init>",
      descriptor = "(III[[I)V",
      line = 135
   )
   public class293(int param1, int param2, int param3, int[][] param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method2277(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method2279(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method2280(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method2281();

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method2282(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lke;[I)V"
   )
   public abstract void method2283(class622 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method2284(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method2285(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class192 method2286(int arg0, int arg1, class192 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method2288(class192 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method2290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method2291(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method2292(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2293(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2294(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 20;
            break;
         case 2:
            var10005 = 49;
            break;
         case 3:
            var10005 = 115;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
