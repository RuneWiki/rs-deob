import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class441 extends class384 {

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field6187 = 1401;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "Lsga;")
    public static class583 field6194 = new class583(8);

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "Lwu;")
    public static class161 field6191;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lbm;)V", line = 7)
    public class441(class684 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 12)
    public final void method1018(int arg0, boolean arg1) {
        ++field6196;
        if (arg0 != 4) {
            field6191 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 23)
    public static final int method2598(int arg0, int arg1) {
        ++field6195;
        byte var2;
        if (~arg1 >= -12001) {
            if (~arg1 >= -5001) {
                if (arg1 > 2000) {
                    class368.method2259(arg0 ^ -2573);
                    var2 = 2;
                } else {
                    class585.method3260(true, (byte) -103);
                    var2 = 1;
                }
            } else {
                var2 = 3;
                class511.method2941(true);
            }
        } else {
            class58.method459((byte) 123);
            var2 = 4;
        }
        if (arg0 != -2679) {
            return 50;
        } else {
            if (class223.field2944.field633.method4191((byte) -128) != 2) {
                class223.field2944.method346(class223.field2944.field601, 2, false);
                class462.method2730(1, false, 2);
            }
            class252.method1530((byte) 108);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)V", line = 70)
    public final void method1025(int arg0, byte arg1, int arg2) {
        ++field6186;
        if (arg1 != 102) {
            field6194 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIB)Z", line = 81)
    public static final boolean method2599(int arg0, int arg1, byte arg2) {
        ++field6188;
        int var3 = 106 / ((34 - arg2) / 46);
        return ~(arg1 & 52) != -1;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V", line = 91)
    public final void method1019(byte arg0) {
        ++field6189;
        super.field5337.method3789(0, false);
        if (arg0 != -60) {
            this.method1021((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "(B)V", line = 102)
    public static final void method2600(byte arg0) {
        ++class98.field1215;
        ++field6193;
        class650 var1 = class314.method1837(class173.field2263, true, class625.field8727);
        if (arg0 > -11) {
            field6194 = null;
        }
        var1.field8928.method1157(class214.field2716, (byte) 127);
        class108.method745(var1, -49);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)Z", line = 121)
    public static final boolean method2601(int arg0, int arg1) {
        ++field6184;
        if (arg0 != 4) {
            return false;
        } else {
            return ~arg1 == -2 || ~arg1 == -4 || arg1 == 5;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lbia;BI)V", line = 133)
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        ++field6192;
        super.field5337.method3711(false, arg0);
        if (arg1 != 80) {
            this.method1020(true, (byte) -99);
        }
        super.field5337.method3781(-3, arg2);
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V", line = 147)
    public static void method2602(int arg0) {
        field6191 = null;
        field6194 = null;
        if (arg0 != -1) {
            method2598(-120, 46);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "([BI)V", line = 161)
    public static final void method2603(byte[] arg0, int arg1) {
        int var2 = -7 % ((arg1 - 2) / 34);
        ++field6183;
        class179 var3 = new class179(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method1094(255);
                if (var4 == 0) {
                    return;
                }
                if (~var4 == -2) {
                    int[] var5 = class756.field10529 = new int[6];
                    var5[0] = var3.method1107(false);
                    var5[1] = var3.method1107(false);
                    var5[2] = var3.method1107(false);
                    var5[3] = var3.method1107(false);
                    var5[4] = var3.method1107(false);
                    var5[5] = var3.method1107(false);
                } else if (var4 == 4) {
                    int var6 = var3.method1094(255);
                    class286.field3634 = new int[var6];
                    for (int var7 = 0; var7 < var6; ++var7) {
                        class286.field3634[var7] = var3.method1107(false);
                        if (~class286.field3634[var7] == -65536) {
                            class286.field3634[var7] = -1;
                        }
                    }
                } else if (~var4 == -6) {
                    int var8 = var3.method1094(255);
                    class610.field8445 = new int[var8];
                    for (int var9 = 0; var8 > var9; ++var9) {
                        class610.field8445[var9] = var3.method1107(false);
                        if (~class610.field8445[var9] == -65536) {
                            class610.field8445[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V", line = 235)
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 > 23) {
            ++field6185;
            super.field5337.method3789(0, true);
        }
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(B)Z", line = 247)
    public final boolean method1021(byte arg0) {
        if (arg0 <= 78) {
            method2598(-48, 76);
        }
        ++field6190;
        return true;
    }
}
