import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class111 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public int field1730 = -1;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "[I")
    private int[] field1748 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "Z")
    public boolean field1744 = false;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "[[I")
    public static int[][] field1733 = new int[5][5000];

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "Z")
    public static boolean field1746 = false;

    @OriginalMember(owner = "client!kg", name = "v", descriptor = "Z")
    public static volatile boolean field1751 = true;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "I")
    public static int field1734;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field1735;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!kg", name = "w", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[I")
    private int[] field1732;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "[S")
    private short[] field1731;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "[S")
    private short[] field1737;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "[S")
    private short[] field1741;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "[S")
    private short[] field1750;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z", line = 14)
    public final boolean method725(byte arg0) {
        field1740++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -101) {
            this.method726(10);
        }
        while (var3 < 5) {
            if (this.field1748[var3] != -1 && !class142.field2570.method2175(this.field1748[var3], 120, 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)Lkm;", line = 38)
    public final class146 method726(int arg0) {
        field1739++;
        if (this.field1732 == null) {
            return null;
        }
        class146[] var2 = new class146[this.field1732.length];
        for (int var3 = arg0; var3 < this.field1732.length; var3++) {
            var2[var3] = class146.method1078(class142.field2570, this.field1732[var3], 0);
        }
        class146 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class146(var2, var2.length);
        }
        if (this.field1737 != null) {
            for (int var5 = 0; var5 < this.field1737.length; var5++) {
                var4.method1086(this.field1737[var5], this.field1741[var5]);
            }
        }
        if (this.field1731 != null) {
            for (int var6 = 0; var6 < this.field1731.length; var6++) {
                var4.method1060(this.field1731[var6], this.field1750[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z", line = 97)
    public final boolean method727(int arg0) {
        field1742++;
        int var2 = 65 / ((arg0 + 42) / 54);
        if (this.field1732 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1732.length; var4++) {
            if (!class142.field2570.method2175(this.field1732[var4], -19, 0)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)I", line = 123)
    public static final int method728(boolean arg0, int arg1) {
        field1749++;
        return arg0 ? arg1 >>> 8 : -41;
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)V", line = 139)
    public static void method729(int arg0) {
        field1733 = (int[][]) null;
        if (arg0 != 0) {
            method736(123);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILcj;)V", line = 154)
    public static final void method730(int arg0, class301 arg1) {
        if (arg0 != 5000) {
            return;
        }
        class314 var2 = (class314) class199.field3389.method1631(false, arg1.field5019.method845((byte) -127));
        if (var2 == null) {
            class53.method336(arg0 ^ 0x1308, 0, (class89) null, (class265) null, arg1.field2460[0], arg1, class131.field2250, arg1.field2471[0]);
        } else {
            var2.method2194((byte) -101);
        }
        field1747++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lbb;I)V", line = 174)
    public final void method731(class134 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method948(-127);
            if (var3 == 0) {
                field1743++;
                if (arg1 != 0) {
                    this.field1741 = (short[]) null;
                }
                return;
            }
            this.method737(arg0, 89, var3);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I", line = 196)
    public static final int method732(int arg0, int arg1) {
        if (arg1 <= 54) {
            field1733 = (int[][]) ((int[][]) null);
        }
        field1735++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Lkm;", line = 212)
    public final class146 method733(byte arg0) {
        if (arg0 != -3) {
            return (class146) null;
        }
        field1752++;
        class146[] var2 = new class146[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1748[var4] != -1) {
                var2[var3++] = class146.method1078(class142.field2570, this.field1748[var4], 0);
            }
        }
        class146 var5 = new class146(var2, var3);
        if (this.field1737 != null) {
            for (int var6 = 0; var6 < this.field1737.length; var6++) {
                var5.method1086(this.field1737[var6], this.field1741[var6]);
            }
        }
        if (this.field1731 != null) {
            for (int var7 = 0; var7 < this.field1731.length; var7++) {
                var5.method1060(this.field1731[var7], this.field1750[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZ)Lec;", line = 277)
    public static final class94 method734(int arg0, boolean arg1) {
        field1745++;
        class94 var2 = (class94) class265.field4493.method1173(-19839, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class97.field1562.method2173(4, arg0, (byte) -31);
        if (arg1) {
            method728(false, 26);
        }
        class94 var4 = new class94();
        if (var3 != null) {
            var4.method646(14, new class134(var3), arg0);
        }
        class265.field4493.method1179(var4, (long) arg0, (byte) -72);
        return var4;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZIII)V", line = 300)
    public static final void method735(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field1734++;
        if (arg1) {
            field1751 = true;
        }
        if (class197.field3372 <= arg3 && arg3 <= class194.field3302) {
            int var5 = class94.method645(class321.field5489, 0, arg4, class52.field795);
            int var6 = class94.method645(class321.field5489, 0, arg0, class52.field795);
            class85.method593(arg2, (byte) 17, var5, var6, arg3);
        }
    }

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V", line = 319)
    public static final void method736(int arg0) {
        field1738++;
        int var1 = class200.field3414.method2154(class166.field2961);
        for (int var2 = 0; var2 < class173.field3067; var2++) {
            int var3 = class200.field3414.method2154(class202.method1426(22247, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class128.field2198;
        int var5 = class173.field3067 * arg0 + 21;
        if (class1.field6 < var4 + var5) {
            var4 = class1.field6 - var5;
        }
        int var6 = class322.field5496 - (var1 / 2);
        if (var1 + var6 > class7.field87) {
            var6 = class7.field87 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (class182.field3181 == 1) {
            if (class322.field5496 == class177.field3120 && class128.field2198 == class116.field1946) {
                class105.field1657 = var6;
                class182.field3181 = 0;
                class17.field236 = (class202.field3453 ? 26 : 22) + class173.field3067 * 15;
                class51.field783 = true;
                class301.field5009 = var1;
                class228.field3850 = var4;
            }
        } else if (class53.field804 == class322.field5496 && class152.field2782 == class128.field2198) {
            class51.field783 = true;
            class105.field1657 = var6;
            class182.field3181 = 0;
            class228.field3850 = var4;
            class17.field236 = class173.field3067 * 15 + (class202.field3453 ? 26 : 22);
            class301.field5009 = var1;
        } else {
            class116.field1946 = class152.field2782;
            class182.field3181 = 1;
            class177.field3120 = class53.field804;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lbb;II)V", line = 407)
    private final void method737(class134 arg0, int arg1, int arg2) {
        if (arg1 <= 88) {
            method728(false, -12);
        }
        if (arg2 == 1) {
            this.field1730 = arg0.method948(-122);
        } else if (arg2 == 2) {
            int var8 = arg0.method948(-128);
            this.field1732 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1732[var9] = arg0.method942(true);
            }
        } else if (arg2 == 3) {
            this.field1744 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method948(-122);
            this.field1737 = new short[var6];
            this.field1741 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1737[var7] = (short) arg0.method942(true);
                this.field1741[var7] = (short) arg0.method942(true);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method948(-124);
            this.field1731 = new short[var4];
            this.field1750 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1731[var5] = (short) arg0.method942(true);
                this.field1750[var5] = (short) arg0.method942(true);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1748[arg2 - 60] = arg0.method942(true);
        }
        field1736++;
    }
}
