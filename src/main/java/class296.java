import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class296 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "[[I")
    public int[][] field3526;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I")
    public static final int method1727(int arg0) {
        field3531++;
        if (arg0 != -1) {
            method1732(62, true, -96L, 93);
        }
        return class581.field7924;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1394(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1392(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBI)I")
    public final int method1728(int arg0, byte arg1, int arg2) {
        field3527++;
        if (arg1 > -22) {
            this.method1390(-72, 42, -106, null, false, -41, 32);
        }
        return this.field3526[arg2][arg0];
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lkp;[I)V")
    public abstract void method1400(class515 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZIZLjava/lang/String;)V")
    public static final void method1729(int arg0, boolean arg1, int arg2, boolean arg3, String arg4) {
        field3529++;
        class551.method3228(arg1, arg2, (byte) 84, arg3, arg4, null, arg0);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I")
    public final int method1730(int arg0, int arg1, int arg2) {
        field3528++;
        int var4 = arg0 >> this.field3530;
        int var5 = arg1 >> this.field3530;
        if (var4 < 0 || var5 < 0 || (this.field3533 - 1) < var4 || (this.field3524 - 1) < var5) {
            return 0;
        }
        int var6 = arg0 & this.field3525 - 1;
        int var7 = arg1 & this.field3525 - 1;
        int var8 = (this.field3525 - var6) * this.field3526[var4][var5] + this.field3526[var4 + 1][var5] * var6 >> this.field3530;
        int var9 = (this.field3525 - var6) * this.field3526[var4][var5 - arg2] + this.field3526[var4 + 1][var5 + 1] * var6 >> this.field3530;
        return (this.field3525 - var7) * var8 + (var7 * var9) >> this.field3530;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1402(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1388(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1406(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class196 method1399(int arg0, int arg1, class196 arg2);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1405(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1397(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1390(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I[III[IIII[FBI[FI)V")
    public static final void method1731(int arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, float[] arg8, byte arg9, int arg10, float[] arg11, int arg12) {
        field3532++;
        int var13 = arg2 * arg12 + arg7;
        int var14 = arg3 * arg10 + arg0;
        int var15 = arg2 - arg5;
        int var16 = arg10 - arg5;
        if (arg4 == null) {
            for (int var17 = 0; var17 < arg6; var17++) {
                int var18 = arg5 + var13;
                while (var18 > var13) {
                    arg8[var14++] = arg11[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else if (arg11 == null) {
            for (int var21 = 0; var21 < arg6; var21++) {
                int var23 = arg5 + var13;
                while (var23 > var13) {
                    arg1[var14++] = arg4[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        } else {
            for (int var19 = 0; var19 < arg6; var19++) {
                int var20 = arg5 + var13;
                while (var13 < var20) {
                    arg1[var14] = arg4[var13];
                    arg8[var14++] = arg11[var13++];
                }
                var13 += var15;
                var14 += var16;
            }
        }
        int var22 = 13 % ((arg9 - 54) / 60);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IZJI)V")
    public static final void method1732(int arg0, boolean arg1, long arg2, int arg3) {
        field3523++;
        int var5 = (int) arg2 >> 14 & 0x1F;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (!arg1) {
            method1732(34, true, 39L, -77);
        }
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class96.method834(true, var5, (byte) -83, arg0, var6, 0, 0, arg3, 0);
            return;
        }
        class174 var8 = class379.field4811.method4192(27324, var7);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var9 = var8.field2125;
            var10 = var8.field2147;
        } else {
            var9 = var8.field2147;
            var10 = var8.field2125;
        }
        int var11 = var8.field2155;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class96.method834(true, 0, (byte) 103, arg0, 0, var10, var11, arg3, var9);
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(II)I")
    public static int method1733(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1389();

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)Ljava/lang/String;")
    public static final String method1734(int arg0) {
        field3534++;
        String var1 = "www";
        if (class737.field10285 == class454.field6402) {
            var1 = "www-wtrc";
        } else if (class737.field10285 == class553.field7698) {
            var1 = "www-wtqa";
        } else if (class737.field10285 == class18.field342) {
            var1 = "www-wtwip";
        }
        if (arg0 < 101) {
            return null;
        }
        String var2 = "";
        if (class28.field429 != null) {
            var2 = "/p=" + class28.field429;
        }
        return "http://" + var1 + "." + class672.field9229.field5924 + ".com/l=" + class770.field10592 + "/a=" + class176.field2187 + var2 + "/";
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1403(class196 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V")
    public class296(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3524 = arg1;
        this.field3533 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3525 = 0x1 << var5;
        this.field3526 = arg3;
        this.field3530 = var5;
    }
}
