import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class222 {

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "I")
    private int field3530 = 0;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    private int field3535 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    private int field3531 = 0;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    private int field3538 = 128;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Z")
    public boolean field3529 = false;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    private int field3528 = 128;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public int field3545 = -1;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field3544 = -1;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "[Lue;")
    public static class223[] field3548 = new class223[4];

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lok;")
    public static class41 field3547 = class137.method956("p11_full", 45);

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lak;")
    public static class20 field3540 = new class20(100);

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field3551 = 1;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    private int field3537;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "Lmh;")
    public static class65 field3553;

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[S")
    private short[] field3539;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[S")
    private short[] field3543;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "[S")
    private short[] field3546;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[S")
    private short[] field3549;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLlb;)Li;", line = 14)
    public static final class120 method1587(byte arg0, class112 arg1) {
        if (arg0 > -88) {
            method1587((byte) -23, (class112) null);
        }
        arg1.method792(2);
        field3536++;
        int var2 = arg1.method792(2);
        class120 var3 = class118.method843(var2, false);
        var3.field1771 = arg1.method792(2);
        int var4 = arg1.method792(2);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method792(2);
            var3.method30(arg1, -1, var6);
        }
        var3.method31(-31851);
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z)V", line = 49)
    public static void method1588(boolean arg0) {
        if (arg0) {
            field3548 = null;
            field3553 = null;
            field3547 = null;
            field3540 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Ljc;", line = 62)
    public final class287 method1589(int arg0, int arg1) {
        field3532++;
        if (arg0 > -76) {
            return (class287) null;
        }
        class287 var3 = (class287) class112.field1597.method136((long) this.field3533, true);
        if (var3 == null) {
            class233 var4 = class233.method1661(class288.field4681, this.field3537, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field3543 != null) {
                for (int var5 = 0; var5 < this.field3543.length; var5++) {
                    var4.method1680(this.field3543[var5], this.field3546[var5]);
                }
            }
            if (this.field3549 != null) {
                for (int var6 = 0; var6 < this.field3549.length; var6++) {
                    var4.method1662(this.field3549[var6], this.field3539[var6]);
                }
            }
            var3 = var4.method1664(this.field3530 + 64, this.field3531 + 850, -30, -50, -30);
            class112.field1597.method132((long) this.field3533, var3, -1);
        }
        class287 var7;
        if (this.field3545 == -1 || arg1 == -1) {
            var7 = var3.method113(true, true);
        } else {
            var7 = class285.method2000(this.field3545, 4442).method1449(var3, arg1, 3);
        }
        if (this.field3528 != 128 || this.field3538 != 128) {
            var7.method112(this.field3528, this.field3538, this.field3528);
        }
        if (this.field3535 != 0) {
            if (this.field3535 == 90) {
                var7.method104();
            }
            if (this.field3535 == 180) {
                var7.method95();
            }
            if (this.field3535 == 270) {
                var7.method115();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Llb;IB)V", line = 146)
    private final void method1590(class112 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field3537 = arg0.method759((byte) -112);
        } else if (arg1 == 2) {
            this.field3545 = arg0.method759((byte) -34);
        } else if (arg1 == 4) {
            this.field3528 = arg0.method759((byte) -47);
        } else if (arg1 == 5) {
            this.field3538 = arg0.method759((byte) -85);
        } else if (arg1 == 6) {
            this.field3535 = arg0.method759((byte) -45);
        } else if (arg1 == 7) {
            this.field3530 = arg0.method792(2);
        } else if (arg1 == 8) {
            this.field3531 = arg0.method792(2);
        } else if (arg1 == 9) {
            this.field3529 = true;
        } else if (arg1 == 40) {
            int var4 = arg0.method792(2);
            this.field3543 = new short[var4];
            this.field3546 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3543[var5] = (short) arg0.method759((byte) -97);
                this.field3546[var5] = (short) arg0.method759((byte) -105);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method792(2);
            this.field3549 = new short[var6];
            this.field3539 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3549[var7] = (short) arg0.method759((byte) -59);
                this.field3539[var7] = (short) arg0.method759((byte) -97);
            }
        }
        field3534++;
        int var8 = -97 / ((arg2 - 9) / 46);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IB)Z", line = 253)
    public static final boolean method1591(int arg0, byte arg1) {
        if (arg1 >= -83) {
            field3553 = (class65) null;
        }
        field3541++;
        return (arg0 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(BLlb;)V", line = 295)
    public final void method1592(byte arg0, class112 arg1) {
        field3542++;
        if (arg0 != -18) {
            method1587((byte) -8, (class112) null);
        }
        while (true) {
            int var3 = arg1.method792(2);
            if (var3 == 0) {
                return;
            }
            this.method1590(arg1, var3, (byte) 57);
        }
    }
}
