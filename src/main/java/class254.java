import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class254 {

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public int field4048;

    @OriginalMember(owner = "client!v", name = "t", descriptor = "[Ljava/lang/String;")
    public String[] field4057;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    public int[] field4045;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "[B")
    public byte[] field4060;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "[I")
    public int[] field4042;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "[I")
    public static int[] field4046 = new int[32];

    @OriginalMember(owner = "client!v", name = "d", descriptor = "[Z")
    public static boolean[] field4041 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!v", name = "l", descriptor = "[[B")
    public static byte[][] field4049 = new byte[250][];

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field4055 = 0;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field4039 = 0;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "I")
    public static int field4056;

    @OriginalMember(owner = "client!v", name = "u", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field4059;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lvf;")
    public static class30 field4047;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILig;B)V")
    public static final void method1691(int arg0, class136 arg1, byte arg2) {
        if (arg2 != 71) {
            method1696(95);
        }
        field4058++;
        if (class249.field3969 == null) {
            return;
        }
        try {
            class249.field3969.method1437(79, 0L);
            class249.field3969.method1444(24, false, arg1.field2263, arg0);
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)I")
    public static final int method1692(int arg0, byte arg1) {
        if (arg1 >= -61) {
            method1702(90, (class213) null);
        }
        field4044++;
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Z")
    public final boolean method1693(int arg0, boolean arg1) {
        if (arg1) {
            field4051++;
            return (this.field4060[arg0] & 0x8) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method1694(int arg0) {
        if (arg0 != -7843) {
            field4055 = -63;
        }
        field4047 = null;
        field4041 = null;
        field4046 = null;
        field4049 = null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Z")
    public final boolean method1695(int arg0, int arg1) {
        field4043++;
        if (arg0 != -3797) {
            this.method1693(-2, false);
        }
        return (this.field4060[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public static final void method1696(int arg0) {
        field4050++;
        if (class223.field3558 != -1) {
            class211.method1403((byte) 79, class223.field3558);
        }
        for (int var1 = arg0; var1 < class258.field4114; var1++) {
            if (class118.field1991[var1]) {
                class229.field3659[var1] = true;
            }
            class245.field3862[var1] = class118.field1991[var1];
            class118.field1991[var1] = false;
        }
        class206.field3309 = null;
        class268.field4292 = class207.field3336;
        class279.field4430 = -1;
        class216.field3464 = -1;
        if (class223.field3558 != -1) {
            class258.field4114 = 0;
            class247.method1639(false);
        }
        class63.method480();
        class232.field3681 = 0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZI)I")
    public final int method1697(boolean arg0, int arg1) {
        if (arg0) {
            method1703(-75, -110, (byte) 50);
        }
        field4056++;
        return this.field4060[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BI)V")
    public static final void method1698(byte arg0, int arg1) {
        field4040++;
        if (arg0 <= 6) {
            method1696(29);
        }
        class23 var2 = class91.method694(arg1, 7, 123);
        var2.method183(-101);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IJ)V")
    public static final void method1699(int arg0, long arg1) {
        class87.field1405.field2231 = 0;
        field4053++;
        class87.field1405.method966((byte) 120, 21);
        class87.field1405.method967((byte) -8, arg1);
        class97.field1504 = 0;
        if (arg0 < -73) {
            class130.field2157 = 0;
            class69.field1167 = 1;
            class285.field4532 = -3;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ZI)Z")
    public final boolean method1700(boolean arg0, int arg1) {
        if (!arg0) {
            field4049 = null;
        }
        field4054++;
        return (this.field4060[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static final void method1701(int arg0) {
        field4059++;
        class36.field618.method1157(760);
        if (arg0 != -18331) {
            method1698((byte) 32, 12);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILmk;)I")
    public static final int method1702(int arg0, class213 arg1) {
        field4038++;
        int var2 = arg1.field3413;
        if (arg0 != 7) {
            field4055 = -90;
        }
        class38 var3 = arg1.method1224(arg0 ^ 0xFFFFFFF8);
        if (arg1.field2901 == var3.field651) {
            var2 = arg1.field3442;
        } else if (arg1.field2901 == var3.field665 || arg1.field2901 == var3.field672 || arg1.field2901 == var3.field670 || arg1.field2901 == var3.field658) {
            var2 = arg1.field3404;
        } else if (arg1.field2901 == var3.field638 || arg1.field2901 == var3.field660 || arg1.field2901 == var3.field668 || arg1.field2901 == var3.field635) {
            var2 = arg1.field3432;
        }
        return var2;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
    public class254(int arg0) {
        this.field4048 = arg0;
        this.field4057 = new String[this.field4048];
        this.field4045 = new int[this.field4048];
        this.field4060 = new byte[this.field4048];
        this.field4042 = new int[this.field4048];
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
    public static final void method1703(int arg0, int arg1, byte arg2) {
        field4052++;
        class23 var3 = class91.method694(arg0, 12, -108);
        var3.method190(0);
        if (arg2 > 35) {
            var3.field361 = arg1;
        }
    }
}
