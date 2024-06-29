import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class162 extends class5 {

    @OriginalMember(owner = "client!gb", name = "ub", descriptor = "I")
    public static int field2689 = 0;

    @OriginalMember(owner = "client!gb", name = "wb", descriptor = "I")
    public static int field2691 = 0;

    @OriginalMember(owner = "client!gb", name = "yb", descriptor = "[Loc;")
    public static class137[] field2693 = new class137[50];

    @OriginalMember(owner = "client!gb", name = "xb", descriptor = "I")
    public static int field2692 = 3;

    @OriginalMember(owner = "client!gb", name = "Cb", descriptor = "Lqd;")
    public static class40 field2697 = class147.method1106("tbrefresh", (byte) -58);

    @OriginalMember(owner = "client!gb", name = "tb", descriptor = "Lqd;")
    public static class40 field2688 = class147.method1106("Okay", (byte) -84);

    @OriginalMember(owner = "client!gb", name = "Fb", descriptor = "[I")
    public static int[] field2700 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!gb", name = "vb", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!gb", name = "zb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!gb", name = "Ab", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!gb", name = "Db", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!gb", name = "Bb", descriptor = "Lce;")
    public static class239 field2696;

    @OriginalMember(owner = "client!gb", name = "Eb", descriptor = "Lce;")
    public static class239 field2699;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V", line = 15)
    public static void method1234(int arg0) {
        field2693 = null;
        field2697 = null;
        field2700 = null;
        field2688 = null;
        field2696 = null;
        field2699 = null;
        if (arg0 != 2) {
            method1235(true, (class213) null, 91, true, 112);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZLrb;IZI)V", line = 53)
    public static final void method1235(boolean arg0, class213 arg1, int arg2, boolean arg3, int arg4) {
        field2694++;
        int var5 = arg1.field3502;
        if (arg1.field3528 == 0) {
            arg1.field3502 = arg1.field3540;
        } else if (arg1.field3528 == 1) {
            arg1.field3502 = arg4 - arg1.field3540;
        } else if (arg1.field3528 == 2) {
            arg1.field3502 = arg1.field3540 * arg4 >> 14;
        } else if (arg1.field3528 == 3) {
            if (arg1.field3525 == 2) {
                arg1.field3502 = (arg1.field3540 - 1) * arg1.field3419 + arg1.field3540 * 32;
            } else if (arg1.field3525 == 7) {
                arg1.field3502 = (arg1.field3540 - 1) * arg1.field3419 + arg1.field3540 * 115;
            }
        }
        if (arg3) {
            method1235(true, (class213) null, -84, false, -19);
        }
        int var6 = arg1.field3565;
        if (arg1.field3424 == 0) {
            arg1.field3565 = arg1.field3439;
        } else if (arg1.field3424 == 1) {
            arg1.field3565 = arg2 - arg1.field3439;
        } else if (arg1.field3424 == 2) {
            arg1.field3565 = arg1.field3439 * arg2 >> 14;
        } else if (arg1.field3424 == 3) {
            if (arg1.field3525 == 2) {
                arg1.field3565 = arg1.field3439 * 32 + ((arg1.field3439 - 1) * arg1.field3455);
            } else if (arg1.field3525 == 7) {
                arg1.field3565 = (arg1.field3439 - 1) * arg1.field3455 + arg1.field3439 * 12;
            }
        }
        if (arg1.field3528 == 4) {
            arg1.field3502 = arg1.field3565 * arg1.field3484 / arg1.field3496;
        }
        if (arg1.field3424 == 4) {
            arg1.field3565 = arg1.field3502 * arg1.field3496 / arg1.field3484;
        }
        if (class126.field2176 && (client.method1720(arg1) != 0 || arg1.field3525 == 0)) {
            if (arg1.field3565 < 5 && arg1.field3502 < 5) {
                arg1.field3565 = 5;
                arg1.field3502 = 5;
            } else {
                if (arg1.field3565 <= 0) {
                    arg1.field3565 = 5;
                }
                if (arg1.field3502 <= 0) {
                    arg1.field3502 = 5;
                }
            }
        }
        if (arg1.field3510 == 1337) {
            class221.field3671 = arg1;
        }
        if (arg0 && arg1.field3504 != null && (arg1.field3502 != var5 || arg1.field3565 != var6)) {
            class109 var7 = new class109();
            var7.field1908 = arg1.field3504;
            var7.field1910 = arg1;
            class58.field1117.method1972(var7, 2);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)[[I", line = 172)
    public final int[][] method17(int arg0, int arg1) {
        field2690++;
        if (arg0 < 30) {
            field2699 = (class239) null;
        }
        int[][] var3 = this.field417.method1251(arg1, 122);
        if (this.field417.field2751 && this.method26(false)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg1 % this.field72 * this.field72;
            for (int var8 = 0; var8 < class52.field1007; var8++) {
                int var9 = this.field76[var7 + (var8 % this.field63)];
                var6[var8] = class276.method1923(4080, var9 << 4);
                var4[var8] = class276.method1923(var9 >> 4, 4080);
                var5[var8] = class276.method1923(var9 >> 12, 4080);
            }
        }
        return var3;
    }
}
