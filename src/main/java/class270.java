import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class270 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "[[I")
    public int[][] field3523;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field3531 = 0;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[[Z")
    public static boolean[][] field3529 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1608(boolean arg0) {
        class91.field1111 = 0;
        field3521++;
        class685.field9689 = new int[class171.field2428][class329.field4421 + 1][class641.field8846 + 1];
        class64.field805 = new class152[1000];
        class688.field9712 = new class152[2000];
        class82.field945 = false;
        class174.field2469 = 0;
        class113.field1433 = 0;
        class505.field6967 = class458.field6012;
        class50.field584 = new class152[500];
        if (!arg0) {
            method1610((byte) -7);
        }
        class408.field5370 = 0;
        class642.field8877 = new class152[500];
        class695.field9812 = class458.field6012;
        if ((class377.field4985 instanceof class168)) {
            class611.field8479 = false;
        } else {
            class611.field8479 = true;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(III)I", line = 44)
    public final int method1609(int arg0, int arg1, int arg2) {
        field3528++;
        int var4 = arg0 >> this.field3530;
        int var5 = arg1 >> this.field3530;
        if (var4 < 0 || var5 < 0 || (this.field3524 - 1) < var4 || (this.field3525 - 1) < var5) {
            return 0;
        }
        int var6 = arg0 & this.field3527 - 1;
        int var7 = arg1 & this.field3527 - 1;
        int var8 = (this.field3527 - var6) * this.field3523[var4][var5] + this.field3523[var4 + 1][var5] * var6 >> this.field3530;
        int var9 = 19 % ((-arg2 - 62) / 61);
        int var10 = (this.field3527 - var6) * this.field3523[var4][var5 + 1] + this.field3523[var4 + 1][var5 + 1] * var6 >> this.field3530;
        return (this.field3527 - var7) * var8 + var7 * var10 >> this.field3530;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 70)
    public static void method1610(byte arg0) {
        field3529 = null;
        if (arg0 > -116) {
            field3531 = -27;
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(III[[I)V", line = 85)
    public class270(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field3524 = arg0;
        this.field3525 = arg1;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field3527 = 0x1 << var5;
        this.field3530 = var5;
        this.field3523 = arg3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZI)I", line = 105)
    public final int method1611(int arg0, boolean arg1, int arg2) {
        field3522++;
        if (!arg1) {
            this.field3530 = -125;
        }
        return this.field3523[arg0][arg2];
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 125)
    public static final void method1612(byte arg0) {
        field3526++;
        int var1 = class174.field2462 * 512 + 256;
        int var2 = class252.field3316 * 512 + 256;
        int var3 = class180.method1211(class298.field3942, true, var1, var2) - class495.field6821;
        if (class452.field5970 >= 100) {
            class147.field1980 = class252.field3316 * 512 + 256;
            class82.field946 = class174.field2462 * 512 + 256;
            class148.field1986 = class180.method1211(class298.field3942, true, class82.field946, class147.field1980) - class495.field6821;
        } else {
            if (class82.field946 < var1) {
                class82.field946 += (var1 - class82.field946) * class452.field5970 / 1000 + class482.field6720;
                if (var1 < class82.field946) {
                    class82.field946 = var1;
                }
            }
            if (var3 > class148.field1986) {
                class148.field1986 += class482.field6720 + ((var3 - class148.field1986) * class452.field5970 / 1000);
                if (class148.field1986 > var3) {
                    class148.field1986 = var3;
                }
            }
            if (var1 < class82.field946) {
                class82.field946 -= (class82.field946 - var1) * class452.field5970 / 1000 + class482.field6720;
                if (var1 > class82.field946) {
                    class82.field946 = var1;
                }
            }
            if (var3 < class148.field1986) {
                class148.field1986 -= (class148.field1986 - var3) * class452.field5970 / 1000 + class482.field6720;
                if (var3 > class148.field1986) {
                    class148.field1986 = var3;
                }
            }
            if (class147.field1980 < var2) {
                class147.field1980 += (var2 - class147.field1980) * class452.field5970 / 1000 + class482.field6720;
                if (var2 < class147.field1980) {
                    class147.field1980 = var2;
                }
            }
            if (var2 < class147.field1980) {
                class147.field1980 -= class482.field6720 + ((class147.field1980 - var2) * class452.field5970 / 1000);
                if (class147.field1980 < var2) {
                    class147.field1980 = var2;
                }
            }
        }
        int var4 = class420.field5514 * 512 + 256;
        int var5 = class155.field2184 * 512 + 256;
        int var6 = class180.method1211(class298.field3942, true, var5, var4) - class152.field2090;
        int var7 = var5 - class82.field946;
        int var8 = 35 % ((-arg0 - 18) / 35);
        int var9 = var6 - class148.field1986;
        int var10 = var4 - class147.field1980;
        int var11 = (int) Math.sqrt((double) (var7 * var7 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        int var13 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var10)) & 0x3FFF;
        if (var12 < 1024) {
            var12 = 1024;
        }
        if (var12 > 3072) {
            var12 = 3072;
        }
        if (class558.field7615 < var12) {
            class558.field7615 += class108.field1281 + ((var12 - class558.field7615 >> 3) * class170.field2427 / 1000) << 3;
            if (var12 < class558.field7615) {
                class558.field7615 = var12;
            }
        }
        if (var12 < class558.field7615) {
            class558.field7615 -= class108.field1281 + ((class558.field7615 - var12 >> 3) * class170.field2427 / 1000) << 3;
            if (class558.field7615 < var12) {
                class558.field7615 = var12;
            }
        }
        int var14 = var13 - class604.field8440;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (var14 < -8192) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (var15 > 0) {
            class604.field8440 += class108.field1281 + (class170.field2427 * var15 / 1000) << 3;
            class604.field8440 &= 0x3FFF;
        }
        if (var15 < 0) {
            class604.field8440 -= -var15 * class170.field2427 / 1000 + class108.field1281 << 3;
            class604.field8440 &= 0x3FFF;
        }
        int var16 = var13 - class604.field8440;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        class660.field9416 = 0;
        if (var16 < 0 && var15 > 0 || var16 > 0 && var15 < 0) {
            class604.field8440 = var13;
        }
    }

    @OriginalMember(owner = "client!i", name = "O", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1353(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1350(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lqea;[I)V")
    public abstract void method1351(class392 arg0, int[] arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1362(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!i", name = "E", descriptor = "(Lha;IIIIZ)V")
    public abstract void method1352(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "BA", descriptor = "()V")
    public abstract void method1349();

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1363(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V")
    public abstract void method1364(int arg0, int arg1);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!i", name = "DA", descriptor = "(Lha;IIIIZ)V")
    public abstract void method1357(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lha;IIIIZ)Z")
    public abstract boolean method1355(class117 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)V")
    public abstract void method1358(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "(IILha;)Lha;")
    public abstract class117 method1361(int arg0, int arg1, class117 arg2);
}
