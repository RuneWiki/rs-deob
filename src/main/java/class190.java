import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class190 implements class334 {

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Ljha;")
    private class101 field2494;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[Lbq;")
    private class698[] field2487;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lut;")
    public static class664 field2493 = new class664(128);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "Lha;")
    private class454 field2500;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lraa;")
    public static class487 field2501;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Lqr;")
    public static class713 field2488;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Z")
    private boolean field2492;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static void method1201(int arg0) {
        field2488 = null;
        field2501 = null;
        if (arg0 == -1) {
            field2493 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public final void method241(int arg0) {
        if (class458.field6407 != this.field2500) {
            this.field2500 = class458.field6407;
            this.field2492 = true;
        }
        field2495++;
        this.field2500.method166(0);
        int var2 = -125 / ((arg0 + 60) / 40);
        class698[] var3 = this.field2487;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class698 var5 = var3[var4];
            if (var5 != null) {
                var5.method621(27799);
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lkha;Lkha;Lkha;ILkha;)V")
    public static final void method1202(class687 arg0, class687 arg1, class687 arg2, int arg3, class687 arg4) {
        field2497++;
        class754.field10515 = arg2;
        class456.field6390 = arg0;
        class65.field867 = arg1;
        class323.field4125 = new class460[class456.field6390.method3816(-128)][];
        class499.field7058 = new boolean[class456.field6390.method3816(-127)];
        if (arg3 != 5501) {
            field2501 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public final void method242(int arg0) {
        if (arg0 == -29379) {
            field2491++;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
    public final void method232(int arg0, boolean arg1) {
        boolean var3 = true;
        field2489++;
        class698[] var4 = this.field2487;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class698 var6 = var4[var5];
            if (var6 != null) {
                var6.method620(var3 || this.field2492, 111);
            }
        }
        if (arg0 < 54) {
            this.field2494 = null;
        }
        this.field2492 = false;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
    public final int method238(boolean arg0) {
        field2490++;
        return arg0 ? -53 : this.field2494.field1241;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
    public final int method235(int arg0) {
        field2496++;
        int var2 = 0;
        if (arg0 != 9642) {
            this.field2494 = null;
        }
        class698[] var3 = this.field2487;
        for (int var4 = 0; var4 < var3.length; var4++) {
            class698 var5 = var3[var4];
            if (var5 == null || var5.method616((byte) 30)) {
                var2++;
            }
        }
        return var2 * 100 / this.field2487.length;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IJ)Z")
    public final boolean method240(int arg0, long arg1) {
        if (arg0 != -2865) {
            method1203(null, -7, -120, -15, 5, 106, -56, 59);
        }
        field2499++;
        return ((long) this.field2494.field1237 + arg1) <= class97.method654((byte) 106);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lha;IIIIIII)V")
    public static final void method1203(class454 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        arg0.method2668(arg6, false, arg1, arg2, arg3, arg4);
        if (arg5 > -116) {
            method1202(null, null, null, 124, null);
        }
        field2486++;
        arg0.method2668(arg6 + 1, false, arg1 - 2, 16, arg3 + 1, arg7);
        arg0.method2659(arg1 - 2, arg3 - -1, arg2 - 19, 0, arg7, arg6 + 18);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([[BBLtha;)V")
    public static final void method1204(byte[][] arg0, byte arg1, class486 arg2) {
        for (int var3 = 0; var3 < arg2.field1743; var3++) {
            class384.method2308(-115);
            for (int var5 = 0; var5 < (class613.field8591 >> 3); var5++) {
                for (int var6 = 0; var6 < class1.field3 >> 3; var6++) {
                    int var7 = class269.field3399[var3][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x3D08A66) >> 24;
                        if (!arg2.field1740 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFCAEE) >> 14;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class248.field3162.length; var13++) {
                                if (class248.field3162[var13] == var12 && arg0[var13] != null) {
                                    arg2.method2842((var11 & 0x7) * 8, class458.field6407, -1, arg0[var13], var9, var5 * 8, var8, class410.field5786, var3, (var10 & 0x7) * 8, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int var4 = -87 / ((arg1 - 29) / 59);
        field2498++;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Ljha;Lnm;)V")
    public class190(class101 arg0, class416 arg1) {
        this.field2494 = arg0;
        this.field2487 = new class698[this.field2494.field1239.length];
        for (int var3 = 0; var3 < this.field2487.length; var3++) {
            this.field2487[var3] = arg1.method2474(this.field2494.field1239[var3], 70);
        }
    }
}
