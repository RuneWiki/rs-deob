import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class130 extends class210 {

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!ne", name = "s", descriptor = "Ljd;")
    private static class92 field2607 = class202.method1325((byte) 90, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ");

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Ljd;")
    private static class92 field2612 = class202.method1325((byte) 90, "Please contact customer support)3");

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "[I")
    public static int[] field2615 = new int[5];

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Ljd;")
    public static class92 field2609 = class202.method1325((byte) 90, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Ljd;")
    public static class92 field2610 = field2612;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "Ljd;")
    public static class92 field2613 = class202.method1325((byte) 90, "settings");

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field2619 = 0;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Ljd;")
    public static class92 field2618 = field2607;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!ne", name = "r", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([BZ)V")
    public static final void method856(byte[] arg0, boolean arg1) {
        field2604++;
        class70 var2 = new class70(arg0);
        var2.field1472 = arg0.length - 2;
        class30.field661 = var2.method442(-21351);
        class119.field2419 = new int[class30.field661];
        class14.field401 = new byte[class30.field661][];
        class39.field876 = new int[class30.field661];
        class153.field3039 = new int[class30.field661];
        class61.field1275 = new int[class30.field661];
        var2.field1472 = arg0.length - class30.field661 * 8 - 7;
        class153.field3029 = var2.method442(-21351);
        class147.field2917 = var2.method442(-21351);
        int var3 = (var2.method443(255) & 0xFF) + 1;
        for (int var4 = 0; var4 < class30.field661; var4++) {
            class153.field3039[var4] = var2.method442(-21351);
        }
        for (int var5 = 0; var5 < class30.field661; var5++) {
            class61.field1275[var5] = var2.method442(-21351);
        }
        for (int var6 = 0; var6 < class30.field661; var6++) {
            class119.field2419[var6] = var2.method442(-21351);
        }
        for (int var7 = 0; var7 < class30.field661; var7++) {
            class39.field876[var7] = var2.method442(-21351);
        }
        var2.field1472 = arg0.length + 3 - var3 * 3 - class30.field661 * 8 - 7;
        class123.field2503 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class123.field2503[var8] = var2.method415(-114);
            if (class123.field2503[var8] == 0) {
                class123.field2503[var8] = 1;
            }
        }
        var2.field1472 = 0;
        for (int var9 = 0; var9 < class30.field661; var9++) {
            int var10 = class119.field2419[var9];
            int var11 = class39.field876[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class14.field401[var9] = var13;
            int var14 = var2.method443(255);
            if (var14 == 0) {
                for (int var15 = 0; var15 < var12; var15++) {
                    var13[var15] = var2.method431(-12469);
                }
            } else if (var14 == 1) {
                for (int var16 = 0; var16 < var10; var16++) {
                    for (int var17 = 0; var17 < var11; var17++) {
                        var13[var10 * var17 + var16] = var2.method431(-12469);
                    }
                }
            }
        }
        if (!arg1) {
            method860((byte) 85, -31);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)I")
    public static final int method857(byte arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 <= 56) {
            method861(null, -80);
        }
        field2616++;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V")
    public static final void method858(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field2620++;
        for (int var5 = 0; var5 < class66.field1346; var5++) {
            if (class74.field1564[var5] + class135.field2703[var5] > arg4 && class135.field2703[var5] < arg2 + arg4 && arg1 < class206.field3963[var5] + class190.field3653[var5] && class190.field3653[var5] < arg0 + arg1) {
                class42.field942[var5] = true;
            }
        }
        if (arg3) {
            field2615 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static void method859(int arg0) {
        field2615 = null;
        field2609 = null;
        field2612 = null;
        field2613 = null;
        if (arg0 == -16379) {
            field2607 = null;
            field2610 = null;
            field2618 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(BI)I")
    public static final int method860(byte arg0, int arg1) {
        field2606++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        int var3 = -1 / ((34 - arg0) / 53);
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class130() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
    public class130(int arg0) {
        this.field2608 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(La;I)V")
    public static final void method861(class1 arg0, int arg1) {
        if (arg1 != 5) {
            method861(null, 119);
        }
        field2617++;
        int var2 = arg0.field120;
        if (var2 == 324) {
            if (class193.field3778 == -1) {
                class72.field1526 = arg0.field93;
                class193.field3778 = arg0.field110;
            }
            if (class118.field2381.field1713) {
                arg0.field110 = class193.field3778;
            } else {
                arg0.field110 = class72.field1526;
            }
        } else if (var2 == 325) {
            if (class193.field3778 == -1) {
                class72.field1526 = arg0.field93;
                class193.field3778 = arg0.field110;
            }
            if (class118.field2381.field1713) {
                arg0.field110 = class72.field1526;
            } else {
                arg0.field110 = class193.field3778;
            }
        } else if (var2 == 327) {
            arg0.field56 = 150;
            arg0.field106 = (int) (Math.sin((double) class158.field3150 / 40.0D) * 256.0D) & 0x7FF;
            arg0.field131 = -1;
            arg0.field50 = 5;
        } else if (var2 == 328) {
            if (class15.field423.field1805 == null) {
                arg0.field131 = 0;
            } else {
                arg0.field56 = 150;
                arg0.field106 = (int) (Math.sin((double) class158.field3150 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field50 = 5;
                arg0.field131 = ((int) class15.field423.field1805.method609(10354) << 11) + 2047;
                arg0.field130 = class15.field423.field221;
                arg0.field27 = class15.field423.field216;
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIILa;I)V")
    public static final void method862(int arg0, int arg1, int arg2, int arg3, int arg4, class1 arg5, int arg6) {
        if (arg0 != 256) {
            field2609 = null;
        }
        field2614++;
        int var7 = Math.min(arg5.field96 / 2, arg5.field28 / 2);
        int var8 = arg6 * arg6 + arg3 * arg3;
        if (var8 <= var7 * var7 || var8 >= 90000) {
            class124.method830(arg5, class108.field2235[arg2], arg6, arg4, arg0 + 17655, arg3, arg1);
            return;
        }
        int var9 = class9.field327 + class172.field3338 & 0x7FF;
        int var10 = class194.field3787[var9];
        var7 -= 10;
        int var11 = var10 * 256 / (class127.field2565 + 256);
        int var12 = class194.field3803[var9];
        int var13 = var12 * 256 / (class127.field2565 + 256);
        int var14 = arg3 * var13 - arg6 * var11 >> 16;
        int var15 = arg3 * var11 + arg6 * var13 >> 16;
        double var16 = Math.atan2((double) var15, (double) var14);
        int var18 = (int) (Math.sin(var16) * (double) var7);
        int var19 = (int) ((double) var7 * Math.cos(var16));
        class45.field996[arg2].method1104(arg5.field96 / 2 + var18 + arg1 - 10, arg4 - -(arg5.field28 / 2) - 10 + -var19, 20, 20, 15, 15, var16, 256);
    }
}
