import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class179 extends class56 {

    @OriginalMember(owner = "client!ug", name = "Ub", descriptor = "Lqj;")
    private static class196 field3169 = class80.method502("Select", -48);

    @OriginalMember(owner = "client!ug", name = "Lb", descriptor = "Lqj;")
    public static class196 field3160 = field3169;

    @OriginalMember(owner = "client!ug", name = "Sb", descriptor = "I")
    public static int field3167 = -1;

    @OriginalMember(owner = "client!ug", name = "Hb", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ug", name = "Ib", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ug", name = "Jb", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ug", name = "Kb", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ug", name = "Mb", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ug", name = "Nb", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ug", name = "Ob", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ug", name = "Pb", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!ug", name = "Qb", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!ug", name = "Tb", descriptor = "I")
    private int field3168;

    @OriginalMember(owner = "client!ug", name = "Vb", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!ug", name = "Wb", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!ug", name = "Xb", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ug", name = "Rb", descriptor = "Lji;")
    private class195 field3166;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
    public static final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= class188.field3296 && class95.field1388 >= arg2 && ~arg5 <= ~class93.field1361 && ~arg4 >= ~class23.field291) {
            class202.method1372(arg0, arg2, arg5, arg1, arg4, (byte) 106);
        } else {
            class174.method1137(arg0, arg2, 16, arg5, arg4, arg1);
        }
        if (arg3 < 15) {
            field3160 = null;
        }
        ++field3172;
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(Z)V")
    public final void method1167(boolean arg0) {
        ++field3159;
        if (arg0) {
            field3160 = null;
        }
        this.field3168 = super.field699 * 8;
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(II)Ljd;")
    public static final class108 method1168(int arg0, int arg1) {
        if (arg1 < 77) {
            field3167 = -18;
        }
        ++field3163;
        class108 var2 = (class108) class151.field2438.method575(0, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class87.field1281.method842(26, (byte) -93, arg0);
            class108 var4 = new class108();
            if (var3 != null) {
                var4.method651(new class56(var3), (byte) -98);
            }
            class151.field2438.method574((long) arg0, false, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(IZ)V")
    public static final void method1169(int arg0, boolean arg1) {
        ++field3157;
        class172 var2 = class14.method62(-1204912992, 2, arg0);
        var2.method1126(2);
        if (arg1) {
            method1166(-105, -63, -51, 125, -27, -68);
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(IB)I")
    public final int method1170(int arg0, byte arg1) {
        int var3 = this.field3168 >> 3;
        int var4 = -(7 & this.field3168) + 8;
        ++field3170;
        int var5 = 67 / ((arg1 - 26) / 61);
        this.field3168 += arg0;
        int var6 = 0;
        while (var4 < arg0) {
            var6 += (class165.field2695[var4] & super.field693[var3++]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg0 != var4) {
            var7 = (super.field693[var3] >> -arg0 + var4 & class165.field2695[arg0]) + var6;
        } else {
            var7 = (super.field693[var3] & class165.field2695[var4]) + var6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[I)V")
    public final void method1171(int arg0, int[] arg1) {
        this.field3166 = new class195(arg1);
        ++field3164;
        if (arg0 != 0) {
            this.method1174(false);
        }
    }

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "(B)V")
    public final void method1172(byte arg0) {
        if (arg0 < -7) {
            super.field699 = (this.field3168 + 7) / 8;
            ++field3156;
        }
    }

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "(II)V")
    public final void method1173(int arg0, int arg1) {
        super.field693[super.field699++] = (byte) (arg0 + this.field3166.method1280(-71));
        ++field3165;
        if (arg1 != 14592) {
            field3167 = 38;
        }
    }

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "(Z)I")
    public final int method1174(boolean arg0) {
        if (arg0) {
            this.method1174(true);
        }
        ++field3161;
        return 255 & super.field693[super.field699++] + -this.field3166.method1280(96);
    }

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "(II)I")
    public final int method1175(int arg0, int arg1) {
        ++field3158;
        if (arg0 != 8) {
            field3169 = null;
        }
        return arg1 * 8 + -this.field3168;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(I)V")
    public class179(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III[B)V")
    public final void method1176(int arg0, int arg1, int arg2, byte[] arg3) {
        for (int var5 = arg1; var5 < arg0; ++var5) {
            arg3[arg2 + var5] = (byte) (super.field693[super.field699++] + -this.field3166.method1280(-113));
        }
        ++field3162;
    }

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "(B)V")
    public static void method1177(byte arg0) {
        field3169 = null;
        if (arg0 >= 22) {
            field3160 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lnb;Lra;II)V")
    public static final void method1178(class95 arg0, class69 arg1, int arg2, int arg3) {
        ++field3171;
        class57 var4 = new class57();
        var4.field761 = arg3;
        var4.field1850 = (long) arg2;
        var4.field760 = arg0;
        var4.field774 = arg1;
        class243 var5 = class243.field4323;
        synchronized (class243.field4323) {
            class243.field4323.method1652(26532, var4);
        }
        class253.method1711((byte) 83);
    }
}
