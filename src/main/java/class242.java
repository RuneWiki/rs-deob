import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class242 extends class280 {

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "[Laa;")
    public static class13[] field3421 = new class13[14];

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public int field3424;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "Lpc;")
    public static class141 field3428;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "Lbg;")
    public static class317 field3432;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Z")
    public boolean field3427;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1512(int arg0) {
        if (arg0 != 0) {
            method1517(73);
        }
        if (class338.field4636 != null) {
            class123.field1703.method2819((byte) 4);
            class11.method107();
            class15.method152(114);
            class137.method840((byte) -60);
            class312.method1884(0);
            class110.method687(99);
            if (class444.field6124 != null) {
                class444.field6124.method847(-11);
            }
            class406.method2385((byte) -60);
            class441.method2559(true);
            class136.method833((byte) 110);
            class432.method2527(arg0 ^ 0x5149, false);
            class82.method564((byte) -103);
            for (int var1 = 0; var1 < 2048; var1++) {
                class23 var5 = class310.field4235[var1];
                if (var5 != null) {
                    var5.field1145 = null;
                    for (int var6 = 0; var6 < var5.field1143.length; var6++) {
                        var5.field1143[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class256.field3581.length; var2++) {
                class196 var3 = class256.field3581[var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1143.length; var4++) {
                        var3.field1143[var4] = null;
                    }
                }
            }
            class338.field4636.method2867(-8615);
            class338.field4636 = null;
        }
        field3430++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lvd;III)V", line = 80)
    public static final void method1513(class216 arg0, int arg1, int arg2, int arg3) {
        long var4 = class355.field4951[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3067 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 0xFFFFL);
            if (var8 <= 0) {
                break;
            }
            arg0.field3059[arg0.field3067++] = class488.field6890[var8 - 1];
            var6 += 16L;
        }
        for (int var9 = arg0.field3067; var9 < 4; var9++) {
            arg0.field3059[var9] = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIII)V", line = 112)
    public static final void method1514(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3429++;
        float var5 = (float) class379.field5384 / (float) class379.field5389;
        int var6 = arg2;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg2 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        if (arg3 != 0) {
            field3432 = null;
        }
        int var8 = arg1 - (arg2 - var6) / 2;
        int var9 = arg4 - (arg0 - var7) / 2;
        class417.field5743 = class379.field5384 - (class379.field5384 * var9 / var7);
        class266.field3706 = -1;
        class192.field2753 = class379.field5389 * var8 / var6;
        class84.field1265 = -1;
        class330.method1970(arg3 + 8142);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZIZ)V", line = 143)
    public static final void method1515(int arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        if (arg3 != 24110) {
            field3432 = null;
        }
        field3425++;
        if (!arg4 && class182.field2643 == arg0 && class275.field3810 == arg1 && class76.field1161 == class480.field6794 || class410.method2404(arg3 ^ 0xFFFFA1D1)) {
            return;
        }
        class275.field3810 = arg1;
        class182.field2643 = arg0;
        class480.field6794 = class76.field1161;
        if (class410.method2404(arg3 - 24111)) {
            class480.field6794 = 0;
        }
        if (arg2) {
            class8.method94(28, arg3 ^ 0xFFFFA1B4);
        } else {
            class8.method94(25, -75);
        }
        class442.method2568(class262.field3662, 0, class480.field6789.method695(-122, class487.field6867), true);
        int var5 = class153.field2204;
        int var6 = class325.field4472;
        class153.field2204 = (class182.field2643 - (class200.field2875 >> 4)) * 8;
        class325.field4472 = (class275.field3810 - (class422.field5811 >> 4)) * 8;
        class325.field4468 = class379.method2261(class182.field2643 * 8, class275.field3810 * 8);
        class387.field5456 = null;
        int var7 = class153.field2204 - var5;
        int var8 = class325.field4472 - var6;
        if (arg2) {
            class32.field520 = 0;
            int var9 = class200.field2875 * 128 - 128;
            int var10 = (class422.field5811 - 1) * 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class196 var12 = class256.field3581[var11];
                if (var12 != null) {
                    var12.field6765 -= var7 * 128;
                    var12.field6746 -= var8 * 128;
                    if (var12.field6765 >= 0 && var9 >= var12.field6765 && var12.field6746 >= 0 && var12.field6746 <= var10) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field1144[var14] -= var7;
                            var12.field1140[var14] -= var8;
                            if (var12.field1144[var14] < 0 || var12.field1144[var14] >= class200.field2875 || var12.field1140[var14] < 0 || class422.field5811 <= var12.field1140[var14]) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class42.field718[class32.field520++] = var11;
                        } else {
                            class256.field3581[var11].method1248((class127) null, -2);
                            class256.field3581[var11] = null;
                        }
                    } else {
                        class256.field3581[var11].method1248((class127) null, -2);
                        class256.field3581[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class196 var20 = class256.field3581[var15];
                if (var20 != null) {
                    for (int var21 = 0; var21 < 10; var21++) {
                        var20.field1144[var21] -= var7;
                        var20.field1140[var21] -= var8;
                    }
                    var20.field6746 -= var8 * 128;
                    var20.field6765 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class23 var18 = class310.field4235[var16];
            if (var18 != null) {
                for (int var19 = 0; var19 < 10; var19++) {
                    var18.field1144[var19] -= var7;
                    var18.field1140[var19] -= var8;
                }
                var18.field6765 -= var7 * 128;
                var18.field6746 -= var8 * 128;
            }
        }
        class261.method1616(var8, var7, false);
        for (class103 var17 = (class103) class230.field3244.method1544(-103); var17 != null; var17 = (class103) class230.field3244.method1546((byte) -42)) {
            var17.field1470 -= var8;
            var17.field1465 -= var7;
            if (var17.field1465 < 0 || var17.field1470 < 0 || var17.field1465 >= class200.field2875 || var17.field1470 >= class422.field5811) {
                var17.method1182(arg3 + 4708);
            }
        }
        class345.field4718 = 0;
        if (class372.field5266 != 0) {
            class35.field588 -= var8;
            class372.field5266 -= var7;
        }
        if (arg2) {
            class436.field5982 -= var7 * 128;
            class106.field1525 -= var8 * 128;
            class175.field2569 -= var7;
            class444.field6128 -= var8;
            class51.field857 -= var7;
            class294.field4057 -= var8;
            if (Math.abs(var7) > class200.field2875 || Math.abs(var8) > class422.field5811) {
                class130.method788(arg3 - 24236);
            }
        } else if (class375.field5312 == 4) {
            class146.field2068 -= var7 * 128;
            class299.field4120 -= var7 * 128;
            class222.field3133 -= var8 * 128;
            class293.field4021 -= var8 * 128;
        } else {
            class375.field5312 = 1;
        }
        class58.method433(86);
        class15.method152(106);
        class346.field4724.method1552((byte) 117);
        class68.field1005.method1552((byte) 117);
        class261.field3644.method2819((byte) 4);
        class36.method303(0);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 354)
    public final void method202(byte arg0) {
        if (arg0 > 42) {
            field3431++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V", line = 369)
    public static final void method1516(int arg0, int arg1, int arg2) {
        field3426++;
        class265 var3 = class440.method2554(arg2, 2, 15);
        var3.method1675(false);
        var3.field3689 = arg0;
        var3.field3698 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)Z", line = 382)
    public final boolean method195(int arg0) {
        if (arg0 < 91) {
            method1516(-107, 28, -77);
        }
        field3422++;
        return false;
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V", line = 394)
    public static void method1517(int arg0) {
        field3432 = null;
        field3421 = null;
        int var1 = 40 / ((24 - arg0) / 57);
        field3428 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 411)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        field3418++;
        if (arg6 != 59) {
            field3432 = null;
        }
        throw new IllegalStateException();
    }
}
