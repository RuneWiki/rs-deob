import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class290 {

    @OriginalMember(owner = "client!vja", name = "w", descriptor = "B")
    public byte field4151;

    @OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
    private int field4143;

    @OriginalMember(owner = "client!vja", name = "q", descriptor = "I")
    public int field4145;

    @OriginalMember(owner = "client!vja", name = "e", descriptor = "I")
    public int field4133;

    @OriginalMember(owner = "client!vja", name = "n", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!vja", name = "p", descriptor = "[I")
    public static int[] field4144 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!vja", name = "v", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!vja", name = "c", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!vja", name = "d", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!vja", name = "f", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!vja", name = "g", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!vja", name = "h", descriptor = "I")
    public int field4136;

    @OriginalMember(owner = "client!vja", name = "i", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!vja", name = "j", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!vja", name = "k", descriptor = "I")
    public int field4139;

    @OriginalMember(owner = "client!vja", name = "l", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!vja", name = "m", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!vja", name = "r", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!vja", name = "s", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!vja", name = "t", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!vja", name = "u", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "Lvja;")
    public class290 field4130;

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII)Lvja;")
    public final class290 method1859(int arg0, int arg1, int arg2, int arg3) {
        field4138++;
        if (arg3 != 0) {
            method1860((byte) -105);
        }
        return new class290(this.field4143, arg1, arg2, arg0, this.field4151);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(B)[Ldaa;")
    public static final class12[] method1860(byte arg0) {
        if (arg0 < 27) {
            field4140 = -81;
        }
        field4134++;
        return new class12[] { class638.field8598, class141.field1894, class103.field1470 };
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(B)V")
    public static void method1861(byte arg0) {
        if (arg0 < 93) {
            field4144 = null;
        }
        field4144 = null;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)Lrfa;")
    public final class212 method1862(int arg0) {
        int var2 = 107 % ((2 - arg0) / 42);
        field4137++;
        return class774.method4260((byte) -67, this.field4143);
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method1863(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class717.field9767 = true;
        class181.field2375 = class34.field372.method489() > 0;
        class148.field1989 = arg15;
        class130.field1787 = arg1 >> class478.field6717;
        class468.field6610 = arg3 >> class478.field6717;
        class194.field2524 = arg1;
        class511.field7121 = arg3;
        class49.field497 = arg2;
        class226.field2923 = class130.field1787 - class278.field4025;
        if (class226.field2923 < 0) {
            class473.field6656 = -class226.field2923;
            class226.field2923 = 0;
        } else {
            class473.field6656 = 0;
        }
        class177.field2342 = class468.field6610 - class278.field4025;
        if (class177.field2342 < 0) {
            class377.field5491 = -class177.field2342;
            class177.field2342 = 0;
        } else {
            class377.field5491 = 0;
        }
        class308.field4376 = class278.field4025 + class130.field1787;
        if (class308.field4376 > class196.field2540) {
            class308.field4376 = class196.field2540;
        }
        class684.field9133 = class468.field6610 + class278.field4025;
        if (class684.field9133 > class247.field3229) {
            class684.field9133 = class247.field3229;
        }
        boolean[][] var19 = class408.field5778;
        boolean[][] var20 = class368.field5311;
        if (class148.field1989) {
            for (int var21 = 0; var21 < class278.field4025 + class278.field4025 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class278.field4025 + class278.field4025 + 2; var24++) {
                    if (var24 > 1) {
                        class41.field434[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class130.field1787 + var21 - class278.field4025;
                    int var26 = class468.field6610 + var24 - class278.field4025;
                    if (var25 >= 0 && var26 >= 0 && var25 < class196.field2540 && var26 < class247.field3229) {
                        int var27 = var25 << class478.field6717;
                        int var28 = var26 << class478.field6717;
                        int var29 = class648.field8748[class648.field8748.length - 1].method1898(var26, var25, (byte) -25) - (0x3E8 << class478.field6717 - 7);
                        int var30 = class737.field10008 == null ? class648.field8748[0].method1898(var26, var25, (byte) -94) + class30.field299 : class737.field10008[0].method1898(var26, var25, (byte) -36) + class30.field299;
                        var23 = arg16 >= 0 ? class34.field372.method545(var27, var29, var28, var27, var30, var28, arg16) : class34.field372.method443(var27, var29, var28, var27, var30, var28);
                        class368.field5311[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class368.field5311[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class41.field434[var24 - 1] & class41.field434[var24] & var22 & var23;
                        class408.field5778[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class41.field434[class278.field4025 + class278.field4025] = var22;
                class41.field434[class278.field4025 + class278.field4025 + 1] = var23;
            }
            if (arg16 >= 0) {
                class717.field9767 = false;
            } else {
                class75.field1020 = arg5;
                class708.field9676 = arg6;
                class29.field284 = arg7;
                class483.field6764 = arg8;
                class217.field2837 = arg9;
                class763.method4203(arg10, (byte) 96, class34.field372);
            }
        } else {
            if (class8.field67 == null) {
                class8.field67 = new boolean[class196.field2540 + class196.field2540 + 1][class247.field3229 + class196.field2540 + 1];
            }
            for (int var32 = 0; var32 < class8.field67.length; var32++) {
                for (int var42 = 0; var42 < class8.field67[0].length; var42++) {
                    class8.field67[var32][var42] = true;
                }
            }
            class368.field5311 = class8.field67;
            class408.field5778 = class8.field67;
            class226.field2923 = 0;
            class177.field2342 = 0;
            class308.field4376 = class196.field2540;
            class684.field9133 = class247.field3229;
            class717.field9767 = false;
        }
        class217.method1396(class34.field372, (byte) -80);
        if (!class627.field8492.field6775) {
            class345 var33 = class627.field8492.field6769;
            for (class104 var34 = (class104) var33.method2189((byte) 95); var34 != null; var34 = (class104) var33.method2192(0)) {
                var34.method3310(30305);
                class207.method1354(var34, (byte) -33);
            }
        }
        if (class181.field2375) {
            for (int var35 = 0; var35 < class563.field7717; var35++) {
                class82.field1135[var35].method2661(false, arg0, arg14);
            }
        }
        if (class522.field7253) {
            class456.field6531 = class34.field372.method532();
            class34.field372.method467(class759.field10405);
            int var36 = (class759.field10405[2] - class759.field10405[0]) / class496.field6975;
            for (int var37 = 0; var37 < class496.field6975 - 1; var37++) {
                class641.field8642[var37] = (var37 + 1) * var36 + class533.field7398[var37];
            }
            for (int var38 = 0; var38 < class97.field1384.length; var38++) {
                class97.field1384[var38].method583();
            }
        }
        if (class187.field2445 != null) {
            if (class522.field7253) {
                class525.method3046(0);
            }
            class416.method2507(true);
            class34.field372.method550(-1, 1583160, 40, 127);
            class206.method1352(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class522.field7253) {
                class674.method3723();
            }
            class34.field372.method500();
            class416.method2507(false);
        }
        class206.method1352(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class522.field7253) {
            for (int var39 = 0; var39 < class504.field7090; var39++) {
                class281.field4064[var39] = class767.field10529[var39];
            }
            class525.method3046(0);
            for (int var40 = 0; var40 < class97.field1384.length; var40++) {
                class97.field1384[var40].method583();
            }
        }
        if (class522.field7253) {
            class674.method3723();
            for (int var41 = 0; var41 < class504.field7090; var41++) {
                class767.field10529[var41] = class281.field4064[var41];
            }
            if (class419.field6025 == 2) {
                int var10002;
                if (class597.field8134[0] < class597.field8134[1]) {
                    if (class641.field8642[0] + class533.field7398[0] > class759.field10405[0]) {
                        var10002 = class533.field7398[0]++;
                    }
                } else if (class597.field8134[0] > class597.field8134[1] && class641.field8642[0] + class533.field7398[0] < class759.field10405[2]) {
                    var10002 = class533.field7398[0]--;
                }
            }
        }
        if (!class148.field1989) {
            class408.field5778 = var19;
            class368.field5311 = var20;
        }
        class652.method3629();
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(IIIIB)V")
    public class290(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field4151 = arg4;
        this.field4143 = arg0;
        this.field4145 = arg2;
        this.field4133 = arg3;
        this.field4142 = arg1;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I[SI)[S")
    public static final short[] method1864(int arg0, short[] arg1, int arg2) {
        field4148++;
        short[] var3 = new short[arg0];
        class421.method2535(arg1, arg2, var3, 0, arg0);
        return var3;
    }
}
