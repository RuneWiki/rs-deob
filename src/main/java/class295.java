import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class295 {
   @OriginalMember(
      owner = "client!s",
      name = "d",
      descriptor = "I"
   )
   public int field4071;
   @OriginalMember(
      owner = "client!s",
      name = "c",
      descriptor = "I"
   )
   public int field4064;
   @OriginalMember(
      owner = "client!s",
      name = "b",
      descriptor = "I"
   )
   public int field4062;
   @OriginalMember(
      owner = "client!s",
      name = "k",
      descriptor = "[[I"
   )
   public int[][] field4066;
   @OriginalMember(
      owner = "client!s",
      name = "j",
      descriptor = "I"
   )
   public int field4065;
   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4074 = new String[]{method2223(method2222("tm,)")), method2223(method2222("|mO/7")), method2223(method2222("i6\rm")), method2223(method2222("tm]h$n7_)")), method2223(method2222("tm-)")), method2223(method2222("tm/)"))};
   @OriginalMember(
      owner = "client!s",
      name = "g",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4068 = new String[100];
   @OriginalMember(
      owner = "client!s",
      name = "h",
      descriptor = "I"
   )
   public static int field4072 = 0;
   @OriginalMember(
      owner = "client!s",
      name = "f",
      descriptor = "I"
   )
   public static int field4073 = 0;
   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "Loi;"
   )
   public static class80 field4069 = new class80(64);
   @OriginalMember(
      owner = "client!s",
      name = "l",
      descriptor = "I"
   )
   public static int field4063;
   @OriginalMember(
      owner = "client!s",
      name = "e",
      descriptor = "I"
   )
   public static int field4067;
   @OriginalMember(
      owner = "client!s",
      name = "i",
      descriptor = "Lep;"
   )
   public static class446 field4070;

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II)V"
   )
   public abstract void method1617(int arg0, int arg1);

   @OriginalMember(
      owner = "client!s",
      name = "fa",
      descriptor = "(IILr;)Lr;"
   )
   public abstract class196 method1621(int arg0, int arg1, class196 arg2);

   @OriginalMember(
      owner = "client!s",
      name = "ka",
      descriptor = "(III)V"
   )
   public abstract void method1613(int arg0, int arg1, int arg2);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lmn;[I)V"
   )
   public abstract void method1619(class389 arg0, int[] arg1);

   @OriginalMember(
      owner = "client!s",
      name = "U",
      descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method1620(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

   @OriginalMember(
      owner = "client!s",
      name = "YA",
      descriptor = "()V"
   )
   public abstract void method1622();

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(ZII)I"
   )
   public final int method2219(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            return 47;
         } else {
            ++field4067;
            return this.field4066[arg1][arg2];
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field4074[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(IIIIIII[[Z)V"
   )
   public abstract void method1616(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V"
   )
   public abstract void method1618(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZII)V"
   )
   public abstract void method1626(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

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
      descriptor = "(III)I"
   )
   public final int method2220(int arg0, int arg1, int arg2) {
      try {
         ++field4063;
         int var4 = arg1 >> this.field4065;
         int var5 = arg0 >> this.field4065;
         if (var4 >= 0 && ~var5 <= -1 && ~var4 >= ~(this.field4071 - 1) && var5 <= this.field4064 + -1) {
            int var6 = 56 / ((arg2 - 34) / 32);
            int var7 = this.field4062 + -1 & arg1;
            int var8 = arg0 & this.field4062 + -1;
            int var9 = (-var7 + this.field4062) * this.field4066[var4][var5] + this.field4066[var4 + 1][var5] * var7 >> this.field4065;
            int var10 = (-var7 + this.field4062) * this.field4066[var4][var5 + 1] - -(this.field4066[var4 + 1][var5 + 1] * var7) >> this.field4065;
            return (this.field4062 - var8) * var9 - -(var8 * var10) >> this.field4065;
         } else {
            return 0;
         }
      } catch (RuntimeException var12) {
         throw class237.method1823(var12, field4074[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "CA",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method1623(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "wa",
      descriptor = "(Lr;IIIIZ)V"
   )
   public abstract void method1615(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Lr;IIIIZ)Z"
   )
   public abstract boolean method1625(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2221(boolean arg0) {
      try {
         field4070 = null;
         field4069 = null;
         if (!arg0) {
            field4068 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4074[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!s",
      name = "a",
      descriptor = "(III[[ZZI)V"
   )
   public abstract void method1624(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

   @OriginalMember(
      owner = "client!s",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2222(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
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
            var10005 = 7;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 97;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
