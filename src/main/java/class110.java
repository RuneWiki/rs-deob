import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class110 extends class170 {

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "I")
    private int field1513 = 0;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Loq;")
    private class120 field1508 = new class120();

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 10)
    private final void method766(int arg0) {
        ++field1517;
        int var2 = super.field2246;
        if (arg0 < -125) {
            ++super.field2246;
            if (~super.field2246 <= -5001) {
                super.field2246 = 0;
            }
            this.field1513 = super.field2238[var2];
            Object var3 = super.field2249[var2];
            super.field2249[var2] = null;
            if (this.field1513 == 21) {
                class358.method2348(this.field1508, (class10) var3);
            } else if (~this.field1513 != -21) {
                if (this.field1513 >= 30 && ~this.field1513 >= -34) {
                    class310.field4442.method2107(3000.0F, super.field2242[var2] * 1.5F);
                    ((class337) var3).method790(class308.field4398, class383.field5729, class27.field480, class337.field4974, ~(this.field1513 + -30) == -1);
                } else if (this.field1513 >= 40 && ~this.field1513 >= -44) {
                    class310.field4442.method2107(3000.0F, super.field2242[var2] * 1.5F);
                    ((class337) var3).method790(class308.field4398, class383.field5729, class27.field480, class19.field325, this.field1513 + -40 == 0);
                } else if (~this.field1513 == -23) {
                    class310.field4442.method2114(-1, 1583160, 40);
                } else {
                    if (this.field1513 != 23) {
                        if (~this.field1513 == -25) {
                            class310.field4442.method2151(0, (class403[]) null);
                            return;
                        }
                    } else {
                        class310.field4442.method2054();
                    }
                }
            } else {
                class10 var4 = (class10) var3;
                if (var4.field117 != null) {
                    var4.field117.method161(class310.field4442, 0);
                }
                if (var4.field120 != null) {
                    var4.field120.method161(class310.field4442, 0);
                }
                if (var4.field123 != null) {
                    var4.field123.method161(class310.field4442, 0);
                }
                if (var4.field102 != null) {
                    var4.field102.method161(class310.field4442, 0);
                }
                if (var4.field124 != null) {
                    var4.field124.method161(class310.field4442, 0);
                }
                for (class39 var5 = var4.field109; var5 != null; var5 = var5.field627) {
                    var5.field621.method161(class310.field4442, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lgm;FZIB)V", line = 101)
    public final void method269(class337 arg0, float arg1, boolean arg2, int arg3, byte arg4) {
        int var6 = 73 / ((9 - arg4) / 57);
        super.field2238[super.field2240] = (byte) (!arg2 ? arg3 + 30 : arg3 + 40);
        ++field1521;
        super.field2249[super.field2240] = arg0;
        super.field2242[super.field2240] = arg1;
        ++super.field2240;
        if (super.field2240 >= 5000) {
            super.field2240 = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILpm;)V", line = 120)
    public final void method270(int arg0, class10 arg1) {
        --super.field2246;
        ++field1512;
        if (super.field2246 < 0) {
            super.field2246 = 4999;
        }
        super.field2238[super.field2246] = 21;
        if (arg0 != 5000) {
            field1519 = -80;
        }
        super.field2249[super.field2246] = arg1;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IB)V", line = 138)
    public final void method273(int arg0, byte arg1) {
        if (arg1 > -126) {
            this.method766(-31);
        }
        super.field2238[super.field2240] = (byte) arg0;
        ++field1522;
        ++super.field2240;
        if (~super.field2240 <= -5001) {
            super.field2240 = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V", line = 159)
    public final void method268(int arg0) {
        if (arg0 != 15226) {
            field1518 = -20;
        }
        ++field1506;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lpm;B)V", line = 170)
    public final void method265(class10 arg0, byte arg1) {
        ++field1514;
        super.field2238[super.field2240] = 20;
        int var3 = 48 % ((-6 - arg1) / 55);
        super.field2249[super.field2240] = arg0;
        ++super.field2240;
        if (~super.field2240 <= -5001) {
            super.field2240 = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V", line = 186)
    public final void method271(int arg0) {
        ++field1516;
        int var2 = 114 / ((48 - arg0) / 59);
        while (super.field2246 != super.field2240) {
            this.method766(-126);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BLpm;)V", line = 198)
    public final void method264(byte arg0, class10 arg1) {
        super.field2238[super.field2240] = 21;
        ++field1510;
        super.field2249[super.field2240] = arg1;
        ++super.field2240;
        if (arg0 != 121) {
            this.field1508 = null;
        }
        if (~super.field2240 <= -5001) {
            super.field2240 = 0;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V", line = 215)
    public static final void method767(int arg0, int arg1, int arg2, int arg3) {
        ++field1520;
        String var4 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 63) + "," + (arg3 & arg1);
        System.out.println(var4);
        class197.method1233(66, true, var4);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZ)V", line = 233)
    public static final void method768(int arg0, boolean arg1) {
        if (arg0 >= -67) {
            field1518 = -88;
        }
        class227.method1411(class345.field5120, class274.field4034, arg1, class404.field6020, (byte) 125);
        ++field1511;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(IB)V", line = 252)
    public final void method274(int arg0, byte arg1) {
        ++field1507;
        if (arg1 != 126) {
            method768(-124, true);
        }
    }
}
