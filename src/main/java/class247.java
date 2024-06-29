import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class247 extends class137 {

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "I")
    public int field4344 = 0;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "Lqh;")
    public static class69 field4345 = null;

    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Lhh;")
    public static class163 field4367 = class137.method1065(" x ", 17);

    @OriginalMember(owner = "client!ii", name = "M", descriptor = "Lhh;")
    private static class163 field4369 = class137.method1065("Loaded input handler", 17);

    @OriginalMember(owner = "client!ii", name = "O", descriptor = "I")
    public static volatile int field4371 = 0;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[S")
    public static short[] field4349 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ii", name = "P", descriptor = "Lhh;")
    public static class163 field4372 = field4369;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "I")
    public static int field4348;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public int field4352;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!ii", name = "L", descriptor = "I")
    public int field4368;

    @OriginalMember(owner = "client!ii", name = "N", descriptor = "I")
    public int field4370;

    @OriginalMember(owner = "client!ii", name = "Q", descriptor = "I")
    public int field4373;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "Lgj;")
    public class126 field4350;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "Lie;")
    public static class221 field4346;

    @OriginalMember(owner = "client!ii", name = "R", descriptor = "Lnk;")
    public class2 field4374;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "Lri;")
    public class34 field4353;

    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Lri;")
    public class34 field4366;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Ldb;")
    public class35 field4363;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "Z")
    public boolean field4354;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "[I")
    public int[] field4359;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BI)I")
    public static final int method1697(byte arg0, int arg1) {
        field4365++;
        if (arg0 >= -105) {
            method1701(true);
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IJ)V")
    public static final void method1698(int arg0, long arg1) {
        field4351++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != 22248) {
            field4367 = null;
        }
        if (class29.field465 >= 100) {
            class56.method396(class135.field2615, 104, class170.field3120, 0);
            return;
        }
        class163 var3 = class12.method76(arg1, (byte) 104).method1190((byte) 73);
        for (int var4 = 0; var4 < class29.field465; var4++) {
            if (class116.field2207[var4] == arg1) {
                class56.method396(class145.method1101(0, new class163[] { var3, class35.field599 }), 95, class170.field3120, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class155.field2889; var5++) {
            if (class48.field798[var5] == arg1) {
                class56.method396(class145.method1101(arg0 ^ 0x56E8, new class163[] { class177.field3234, var3, class245.field4330 }), arg0 - 22145, class170.field3120, 0);
                return;
            }
        }
        if (var3.method1208(class235.field4203.field2424, (byte) -104)) {
            class56.method396(class109.field2066, 105, class170.field3120, 0);
            return;
        }
        class74.field1394++;
        class116.field2207[class29.field465] = arg1;
        class11.field171[class29.field465++] = class12.method76(arg1, (byte) 24);
        class208.field3780 = class24.field384;
        class191.field3499.method75(196, 120);
        class191.field3499.method651(-645765520, arg1);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lgj;IIII)V")
    public static final void method1699(class126 arg0, int arg1, int arg2, int arg3, int arg4) {
        field4360++;
        if (class235.field4203 == arg0 || class202.field3647 >= 400) {
            return;
        }
        class163 var5;
        if (arg0.field2427 == 0) {
            var5 = class145.method1101(0, new class163[] { arg0.method997(arg1 ^ 0x8A), class1.method15(arg0.field2437, class235.field4203.field2437, (byte) -96), class38.field642, class36.field610, class136.method1061(arg0.field2437, (byte) 113), class213.field3888 });
        } else {
            var5 = class145.method1101(0, new class163[] { arg0.method997(10), class38.field642, class143.field2713, class136.method1061(arg0.field2427, (byte) 121), class213.field3888 });
        }
        if (class56.field928 == 1) {
            class122.method955(class145.method1101(0, new class163[] { class187.field3420, class28.field429, var5 }), arg2, (long) arg4, arg1 - 130, class210.field3811, (short) 48, arg3);
            class238.field4234++;
        } else if (!class187.field3426) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class97.field1825[var6] != null) {
                    short var7 = 0;
                    if (class137.field2651 == 0 && class97.field1825[var6].method1228(class196.field3531, -21)) {
                        if (class235.field4203.field2437 < arg0.field2437) {
                            var7 = 2000;
                        }
                        if (class235.field4203.field2425 != 0 && arg0.field2425 != 0) {
                            if (class235.field4203.field2425 == arg0.field2425) {
                                var7 = 2000;
                            } else {
                                var7 = 0;
                            }
                        }
                    } else if (class209.field3788[var6]) {
                        var7 = 2000;
                    }
                    class202.field3644++;
                    boolean var8 = false;
                    short var9 = class94.field1787[var6];
                    short var10 = (short) (var7 + var9);
                    class122.method955(class145.method1101(0, new class163[] { class28.field433, var5 }), arg2, (long) arg4, -2, class97.field1825[var6], var10, arg3);
                }
            }
        } else if ((class59.field968 & 0x8) == 8) {
            class122.method955(class145.method1101(0, new class163[] { class223.field4060, class28.field429, var5 }), arg2, (long) arg4, -2, class9.field151, (short) 13, arg3);
            class244.field4310++;
        }
        for (int var11 = 0; var11 < class202.field3647; var11++) {
            if (class4.field76[var11] == 45) {
                class60.field993[var11] = class145.method1101(class46.method340(arg1, 128), new class163[] { class28.field433, var5 });
                break;
            }
        }
        if (arg1 != 128) {
            method1698(-38, -72L);
        }
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(B)V")
    public static void method1700(byte arg0) {
        field4367 = null;
        field4345 = null;
        field4369 = null;
        field4372 = null;
        field4346 = null;
        field4349 = null;
        if (arg0 != -58) {
            field4372 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static final void method1701(boolean arg0) {
        field4348++;
        while (class33.field502.method79(false, class125.field2415) >= 11) {
            int var1 = class33.field502.method74((byte) -105, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class106.field2029[var1] == null) {
                class106.field2029[var1] = new class126();
                var2 = true;
                if (class228.field4116[var1] != null) {
                    class106.field2029[var1].method1000(class228.field4116[var1], arg0);
                }
            }
            class246.field4340[class95.field1791++] = var1;
            class126 var3 = class106.field2029[var1];
            var3.field3628 = class227.field4092;
            int var4 = class128.field2495[class33.field502.method74((byte) -120, 3)];
            if (var2) {
                var3.field3654 = var3.field3667 = var4;
            }
            int var5 = class33.field502.method74((byte) 105, 1);
            int var6 = class33.field502.method74((byte) -96, 5);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class33.field502.method74((byte) 116, 1);
            if (var7 == 1) {
                class124.field2392[class222.field4040++] = var1;
            }
            int var8 = class33.field502.method74((byte) -113, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method1444(class235.field4203.field3614[0] + var6, 125, class235.field4203.field3629[0] + var8, var5 == 1);
        }
        if (!arg0) {
            field4367 = null;
        }
        class33.field502.method81(7);
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(I)V")
    public final void method1702(int arg0) {
        field4362++;
        int var2 = this.field4370;
        if (this.field4363 != null) {
            class35 var3 = this.field4363.method252(110);
            if (var3 == null) {
                this.field4370 = -1;
                this.field4359 = null;
                this.field4357 = 0;
                this.field4347 = 0;
                this.field4358 = 0;
            } else {
                this.field4359 = var3.field604;
                this.field4357 = var3.field572;
                this.field4347 = var3.field533;
                this.field4370 = var3.field597;
                this.field4358 = var3.field541 * 128;
            }
        } else if (this.field4374 != null) {
            int var4 = class116.method926(this.field4374, 10);
            if (var2 != var4) {
                class181 var5 = this.field4374.field41;
                this.field4370 = var4;
                if (var5.field3329 != null) {
                    var5 = var5.method1330(-1);
                }
                if (var5 == null) {
                    this.field4358 = 0;
                } else {
                    this.field4358 = var5.field3307 * 128;
                }
            }
        } else if (this.field4350 != null) {
            this.field4370 = class223.method1574(arg0 ^ 0xFFFF9E99, this.field4350);
            this.field4358 = this.field4350.field2440 * 128;
        }
        if (arg0 != -19613) {
            method1699((class126) null, -53, -17, -97, -82);
        }
        if (this.field4370 != var2 && this.field4366 != null) {
            class225.field4085.method594(this.field4366);
            this.field4366 = null;
        }
    }
}
