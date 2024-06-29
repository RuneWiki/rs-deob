import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class42 {

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "I")
    private int field586 = -1;

    @OriginalMember(owner = "client!bq", name = "j", descriptor = "Z")
    public boolean field594 = false;

    @OriginalMember(owner = "client!bq", name = "l", descriptor = "B")
    public byte field596 = 0;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "I")
    public int field585 = -1;

    @OriginalMember(owner = "client!bq", name = "u", descriptor = "I")
    private int field605 = 128;

    @OriginalMember(owner = "client!bq", name = "k", descriptor = "I")
    private int field595 = 0;

    @OriginalMember(owner = "client!bq", name = "B", descriptor = "I")
    private int field612 = 0;

    @OriginalMember(owner = "client!bq", name = "y", descriptor = "I")
    private int field609 = 128;

    @OriginalMember(owner = "client!bq", name = "z", descriptor = "I")
    private int field610 = 0;

    @OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
    public static int field593 = -1;

    @OriginalMember(owner = "client!bq", name = "g", descriptor = "[Z")
    public static boolean[] field591 = new boolean[8];

    @OriginalMember(owner = "client!bq", name = "m", descriptor = "[I")
    public static int[] field597 = new int[4096];

    @OriginalMember(owner = "client!bq", name = "w", descriptor = "I")
    public static int field607 = -1;

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!bq", name = "n", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!bq", name = "o", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!bq", name = "r", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!bq", name = "t", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client!bq", name = "v", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!bq", name = "x", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!bq", name = "h", descriptor = "Lio;")
    public class708 field592;

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "[S")
    private short[] field588;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "[S")
    private short[] field589;

    @OriginalMember(owner = "client!bq", name = "s", descriptor = "[S")
    private short[] field603;

    @OriginalMember(owner = "client!bq", name = "A", descriptor = "[S")
    private short[] field611;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(ILjn;ZLha;IIIILs;IILs;I)Lka;", line = 6)
    public final class283 method286(int arg0, class322 arg1, boolean arg2, class545 arg3, int arg4, int arg5, int arg6, int arg7, class339 arg8, int arg9, int arg10, class339 arg11, int arg12) {
        field608++;
        int var14 = -110 % ((arg4 - 28) / 36);
        return this.method292(arg1, arg3, arg12, arg0, arg11, (byte) 2, arg7, arg8, arg2, 128, arg9, arg10, arg5, arg6);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(B)V", line = 34)
    public static void method287(byte arg0) {
        field591 = null;
        field597 = null;
        if (arg0 != -10) {
            field591 = null;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lhg;B)V", line = 58)
    public static final void method288(class584 arg0, byte arg1) {
        int var2 = -68 / ((arg1 - 28) / 61);
        field600++;
        int var3 = arg0.field8388 - class245.field3409;
        int var4 = arg0.field8360 * 512 + arg0.method3470(-1) * 256;
        int var5 = arg0.field8356 * 512 + arg0.method3470(-1) * 256;
        arg0.field9490 += (var4 - arg0.field9490) / var3;
        arg0.field8422 = 0;
        arg0.field9489 += (var5 - arg0.field9489) / var3;
        if (arg0.field8333 == 0) {
            arg0.method3475(-16384, 8192);
        }
        if (arg0.field8333 == 1) {
            arg0.method3475(-16384, 12288);
        }
        if (arg0.field8333 == 2) {
            arg0.method3475(-16384, 0);
        }
        if (arg0.field8333 == 3) {
            arg0.method3475(-16384, 4096);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lvj;IB)V", line = 98)
    private final void method289(class26 arg0, int arg1, byte arg2) {
        field598++;
        if (arg1 == 1) {
            this.field604 = arg0.method193(2);
        } else if (arg1 == 2) {
            this.field585 = arg0.method193(arg2 ^ 0x69);
        } else if (arg1 == 4) {
            this.field605 = arg0.method193(2);
        } else if (arg1 == 5) {
            this.field609 = arg0.method193(arg2 - 105);
        } else if (arg1 == 6) {
            this.field612 = arg0.method193(2);
        } else if (arg1 == 7) {
            this.field610 = arg0.method194((byte) 119);
        } else if (arg1 == 8) {
            this.field595 = arg0.method194((byte) 119);
        } else if (arg1 == 9) {
            this.field596 = 3;
            this.field586 = 8224;
        } else if (arg1 == 10) {
            this.field594 = true;
        } else if (arg1 == 11) {
            this.field596 = 1;
        } else if (arg1 == 12) {
            this.field596 = 4;
        } else if (arg1 == 13) {
            this.field596 = 5;
        } else if (arg1 == 14) {
            this.field596 = 2;
            this.field586 = arg0.method194((byte) 119) * 256;
        } else if (arg1 == 15) {
            this.field596 = 3;
            this.field586 = arg0.method193(2);
        } else if (arg1 == 16) {
            this.field596 = 3;
            this.field586 = arg0.method189(255);
        } else if (arg1 == 40) {
            int var4 = arg0.method194((byte) 119);
            this.field603 = new short[var4];
            this.field611 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field611[var5] = (short) arg0.method193(2);
                this.field603[var5] = (short) arg0.method193(2);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method194((byte) 119);
            this.field589 = new short[var6];
            this.field588 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field589[var7] = (short) arg0.method193(2);
                this.field588[var7] = (short) arg0.method193(arg2 - 105);
            }
        }
        if (arg2 != 107) {
            this.field612 = 47;
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lha;ILjn;IIII)Lka;", line = 231)
    public final class283 method290(class545 arg0, int arg1, class322 arg2, int arg3, int arg4, int arg5, int arg6) {
        field601++;
        return arg3 == -25569 ? this.method292(arg2, arg0, 0, arg1, null, (byte) 2, 0, null, false, 128, arg5, arg6, arg4, 0) : null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lvj;I)V", line = 248)
    public final void method291(class26 arg0, int arg1) {
        if (arg1 < 122) {
            this.field588 = null;
        }
        field602++;
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                return;
            }
            this.method289(arg0, var3, (byte) 107);
        }
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Ljn;Lha;IILs;BILs;ZIIIII)Lka;", line = 272)
    private final class283 method292(class322 arg0, class545 arg1, int arg2, int arg3, class339 arg4, byte arg5, int arg6, class339 arg7, boolean arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        field599++;
        int var15 = arg12;
        class103 var16 = this.field585 == -1 || arg3 == -1 ? null : arg0.method1881((byte) -80, this.field585);
        boolean var17 = arg8 & this.field596 != 0;
        if (var16 != null) {
            var15 = arg12 | var16.method696(false, arg10, -16365, arg3);
        }
        if (var17) {
            var15 |= this.field596 == 3 ? 7 : 2;
        }
        if (this.field609 != 128) {
            var15 |= 0x2;
        }
        if (this.field605 != arg9 || this.field612 != 0) {
            var15 |= 0x5;
        }
        class538 var18 = this.field592.field9900;
        class283 var19;
        synchronized (this.field592.field9900) {
            var19 = (class283) this.field592.field9900.method3200((long) (this.field587 |= arg1.field7688 << 29), arg9 - 20111);
        }
        if (var19 == null || arg1.method2105(var19.method1135(), var15) != 0) {
            if (var19 != null) {
                var15 = arg1.method2101(var15, var19.method1135());
            }
            int var20 = var15;
            if (this.field611 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field589 != null) {
                var20 |= 0x8000;
            }
            class64 var21 = class86.method524(this.field592.field9896, this.field604, arg9 - 194, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field873 < 13) {
                var21.method412(114, 2);
            }
            var19 = arg1.method2222(var21, var20, this.field592.field9901, this.field610 + 64, this.field595 + 850);
            if (this.field611 != null) {
                for (int var22 = 0; var22 < this.field611.length; var22++) {
                    var19.method1134(this.field611[var22], this.field603[var22]);
                }
            }
            if (this.field589 != null) {
                for (int var23 = 0; var23 < this.field589.length; var23++) {
                    var19.method1148(this.field589[var23], this.field588[var23]);
                }
            }
            var19.method1118(var15);
            class538 var24 = this.field592.field9900;
            synchronized (this.field592.field9900) {
                this.field592.field9900.method3199((byte) 78, var19, (long) (this.field587 |= arg1.field7688 << 29));
            }
        }
        class283 var25 = var16 == null ? var19.method1147(arg5, var15, true) : var16.method695(0, var15, arg3, arg11, arg5, arg10, var19, 28);
        if (this.field605 != 128 || this.field609 != 128) {
            var25.method1161(this.field605, this.field609, this.field605);
        }
        if (this.field612 != 0) {
            if (this.field612 == 90) {
                var25.method1133(4096);
            }
            if (this.field612 == 180) {
                var25.method1133(8192);
            }
            if (this.field612 == 270) {
                var25.method1133(12288);
            }
        }
        if (var17) {
            var25.method1154(this.field596, this.field586, arg4, arg7, arg13, arg2, arg6);
        }
        var25.method1118(arg12);
        return var25;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(Lha;IIBILjn;I)Lka;", line = 397)
    public final class283 method293(class545 arg0, int arg1, int arg2, byte arg3, int arg4, class322 arg5, int arg6) {
        field606++;
        if (arg3 != 49) {
            this.method286(82, null, true, null, 95, -127, -128, 57, null, 28, -98, null, 59);
        }
        return this.method292(arg5, arg0, 0, arg1, null, (byte) 5, 0, null, false, arg3 ^ 0xB1, arg6, arg2, arg4, 0);
    }
}
