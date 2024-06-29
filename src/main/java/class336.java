import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class336 {

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "Lgo;")
    private class304 field4671 = new class304();

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    private int field4674;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "I")
    private int field4672;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lwk;")
    private class155 field4660;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "Lrc;")
    public static class108 field4664 = new class108(92, 8);

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "[S")
    public static short[] field4668 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field4667 = 0;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field4656;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field4658;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field4669;

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "Ljs;")
    public static class178 field4670;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "[S")
    public static short[] field4675;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)I", line = 5)
    public final int method2107(int arg0) {
        field4673++;
        if (arg0 <= 73) {
            this.method2114(-118);
        }
        return this.field4672;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lrg;I)V", line = 16)
    private final void method2108(class365 arg0, int arg1) {
        if (arg1 <= 13) {
            field4664 = null;
        }
        field4656++;
        if (arg0 != null) {
            arg0.method2714(-122);
            arg0.method479((byte) -8);
            this.field4674 += arg0.field5017;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V", line = 35)
    public final void method2109(int arg0) {
        field4666++;
        this.field4671.method1960(-257);
        if (arg0 != -1) {
            this.field4671 = null;
        }
        this.field4660.method1101((byte) 97);
        this.field4674 = this.field4672;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJLjava/lang/Object;I)V", line = 49)
    private final void method2110(int arg0, long arg1, Object arg2, int arg3) {
        field4661++;
        if (this.field4672 < arg3) {
            throw new IllegalStateException("s>cs");
        }
        this.method2112(22461, arg1);
        this.field4674 -= arg3;
        while (this.field4674 < 0) {
            class365 var7 = (class365) this.field4671.method1961((byte) 49);
            this.method2108(var7, 56);
        }
        class7 var6 = new class7(arg2, arg3);
        if (arg0 < 46) {
            this.method2113(-30, -74L);
        }
        this.field4660.method1100(var6, -116, arg1);
        this.field4671.method1962((byte) -67, var6);
        var6.field713 = 0L;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lap;I)V", line = 79)
    public static final void method2111(class310 arg0, int arg1) {
        class311.field4403.method713((byte) -29, arg0.method1982((byte) 26));
        field4658++;
        if (arg1 < 87) {
            method2115(104);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IJ)V", line = 90)
    private final void method2112(int arg0, long arg1) {
        field4665++;
        class365 var4 = (class365) this.field4660.method1104(arg0 ^ 0xFFFFA83C, arg1);
        this.method2108(var4, arg0 ^ 0x57A8);
        if (arg0 != 22461) {
            this.method2114(-60);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IJ)Ljava/lang/Object;", line = 103)
    public final Object method2113(int arg0, long arg1) {
        field4677++;
        class365 var4 = (class365) this.field4660.method1104(-127, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method42(5);
        if (var5 == null) {
            var4.method2714(56);
            var4.method479((byte) -8);
            this.field4674 += var4.field5017;
            return null;
        }
        if (arg0 != 0) {
            this.method2108((class365) null, -2);
        }
        if (var4.method39(arg0 ^ 0x77F8)) {
            class7 var6 = new class7(var5, var4.field5017);
            this.field4660.method1100(var6, -44, var4.field6382);
            this.field4671.method1962((byte) -67, var6);
            var6.field713 = 0L;
            var4.method2714(-101);
            var4.method479((byte) -8);
        } else {
            this.field4671.method1962((byte) -67, var4);
            var4.field713 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I", line = 147)
    public final int method2114(int arg0) {
        if (arg0 == -4160) {
            field4669++;
            return this.field4674;
        } else {
            return 122;
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V", line = 158)
    public static void method2115(int arg0) {
        field4675 = null;
        if (arg0 != 1) {
            method2111((class310) null, 74);
        }
        field4664 = null;
        field4668 = null;
        field4670 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(JBLjava/lang/Object;)V", line = 173)
    public final void method2116(long arg0, byte arg1, Object arg2) {
        if (arg1 <= -19) {
            this.method2110(107, arg0, arg2, 1);
            field4662++;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)I", line = 185)
    public final int method2117(byte arg0) {
        field4659++;
        int var2 = 0;
        class365 var3 = (class365) this.field4671.method1955(0);
        if (arg0 != 35) {
            this.method2119(-88);
        }
        while (var3 != null) {
            if (!var3.method39(30712)) {
                var2++;
            }
            var3 = (class365) this.field4671.method1954(false);
        }
        return var2;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)Ljava/lang/Object;", line = 216)
    public final Object method2118(boolean arg0) {
        field4655++;
        class365 var2 = (class365) this.field4660.method1097(64);
        while (var2 != null) {
            Object var3 = var2.method42(5);
            if (var3 != null) {
                return var3;
            }
            class365 var4 = var2;
            var2 = (class365) this.field4660.method1105(false);
            var4.method2714(77);
            var4.method479((byte) -8);
            this.field4674 += var2.field5017;
        }
        if (!arg0) {
            this.field4671 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)V", line = 247)
    public final void method2119(int arg0) {
        field4676++;
        for (class365 var2 = (class365) this.field4671.method1955(arg0); var2 != null; var2 = (class365) this.field4671.method1954(false)) {
            if (var2.method39(arg0 + 30712)) {
                var2.method2714(arg0 ^ 0xFFFFFFCB);
                var2.method479((byte) -8);
                this.field4674 += var2.field5017;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)V", line = 273)
    public final void method2120(byte arg0, int arg1) {
        if (class218.field3158 != null) {
            for (class365 var3 = (class365) this.field4671.method1955(0); var3 != null; var3 = (class365) this.field4671.method1954(false)) {
                if (var3.method39(30712)) {
                    if (var3.method42(5) == null) {
                        var3.method2714(86);
                        var3.method479((byte) -8);
                        this.field4674++;
                    }
                } else if (++var3.field713 > (long) arg1) {
                    class365 var4 = class218.field3158.method1706(var3, 29);
                    this.field4660.method1100(var4, 11, var3.field6382);
                    class151.method1079(var3, (byte) 52, var4);
                    var3.method2714(-55);
                    var3.method479((byte) -8);
                }
            }
        }
        field4657++;
        int var5 = 105 / ((-arg0 - 15) / 48);
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 325)
    public final Object method2121(int arg0) {
        field4663++;
        if (arg0 != -1) {
            return null;
        }
        class365 var2 = (class365) this.field4660.method1105(false);
        while (var2 != null) {
            Object var3 = var2.method42(5);
            if (var3 != null) {
                return var3;
            }
            class365 var4 = var2;
            var2 = (class365) this.field4660.method1105(false);
            var4.method2714(arg0 ^ 0x7F);
            var4.method479((byte) -8);
            this.field4674 += var2.field5017;
        }
        return null;
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(I)V", line = 367)
    public class336(int arg0) {
        this.field4674 = arg0;
        this.field4672 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field4660 = new class155(var2);
    }
}
