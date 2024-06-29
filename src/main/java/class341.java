import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class341 implements class298 {

    @OriginalMember(owner = "client!wu", name = "l", descriptor = "Lab;")
    private class621 field5529;

    @OriginalMember(owner = "client!wu", name = "n", descriptor = "[Lat;")
    private class346[] field5531;

    @OriginalMember(owner = "client!wu", name = "g", descriptor = "Lqs;")
    public static class560 field5524 = new class560();

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "I")
    public static int field5521;

    @OriginalMember(owner = "client!wu", name = "e", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!wu", name = "h", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!wu", name = "i", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!wu", name = "j", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!wu", name = "k", descriptor = "I")
    public static int field5528;

    @OriginalMember(owner = "client!wu", name = "m", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!wu", name = "o", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "Lr;")
    private class167 field5520;

    @OriginalMember(owner = "client!wu", name = "f", descriptor = "Z")
    private boolean field5523;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "[Lvv;")
    public static class298[] field5519;

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V", line = 5)
    public final void method2068(int arg0) {
        if (arg0 != 8553) {
            this.method2068(23);
        }
        field5526++;
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V", line = 16)
    public final void method2066(int arg0) {
        if (class627.field8857 != this.field5520) {
            this.field5523 = true;
            this.field5520 = class627.field8857;
        }
        field5521++;
        this.field5520.method121(0);
        if (arg0 != 25766) {
            this.method2066(84);
        }
        class346[] var2 = this.field5531;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class346 var4 = var2[var3];
            if (var4 != null) {
                var4.method587(arg0 ^ 0x3368);
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V", line = 48)
    public static void method2330(byte arg0) {
        field5519 = null;
        if (arg0 == -112) {
            field5524 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)V", line = 61)
    public static final void method2331(byte arg0) {
        class271.field4379 = null;
        class175.field2882 = null;
        class357.field5692 = null;
        class2.field14 = null;
        field5528++;
        class246.field3927 = false;
        if (arg0 <= -6) {
            class636.field8945 = null;
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIILvb;Lvb;)V", line = 79)
    public static final void method2332(int arg0, int arg1, int arg2, class180 arg3, class180 arg4) {
        class252 var5 = class115.method1040(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field4028 = arg3;
        var5.field4023 = arg4;
        int var6 = class587.field8346 == class493.field7208 ? 1 : 0;
        if (!arg3.method414(0)) {
            class245.field3903[var6][class95.field1483[var6]++] = arg3;
        } else if (arg3.method402(623404585)) {
            class321.field5016[var6][class124.field2052[var6]++] = arg3;
        } else {
            class20.field329[var6][class203.field3310[var6]++] = arg3;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method414(0)) {
            if (arg4.method402(623404585)) {
                class321.field5016[var6][class124.field2052[var6]++] = arg4;
                return;
            }
            class20.field329[var6][class203.field3310[var6]++] = arg4;
            return;
        }
        class245.field3903[var6][class95.field1483[var6]++] = arg4;
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(I)I", line = 116)
    public final int method2067(int arg0) {
        field5527++;
        return arg0 == 3185 ? this.field5529.field8769 : -37;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)I", line = 129)
    public final int method2064(int arg0) {
        field5518++;
        int var2 = 0;
        int var3 = -30 / ((arg0 + 30) / 51);
        class346[] var4 = this.field5531;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class346 var6 = var4[var5];
            if (var6 == null || var6.method585((byte) 123)) {
                var2++;
            }
        }
        return var2 * 100 / this.field5531.length;
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IJ)Z", line = 157)
    public final boolean method2065(int arg0, long arg1) {
        if (arg0 != 26711) {
            field5530 = -40;
        }
        field5532++;
        return class112.method1033(arg0 - 38463) >= arg1 + ((long) this.field5529.field8773);
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lab;Lida;)V", line = 175)
    public class341(class621 arg0, class216 arg1) {
        this.field5529 = arg0;
        this.field5531 = new class346[this.field5529.field8774.length];
        for (int var3 = 0; var3 < this.field5531.length; var3++) {
            this.field5531[var3] = arg1.method1620(-4517, this.field5529.field8774[var3]);
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ZZ)V", line = 196)
    public final void method2069(boolean arg0, boolean arg1) {
        field5525++;
        boolean var3 = arg0;
        class346[] var4 = this.field5531;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class346 var6 = var4[var5];
            if (var6 != null) {
                var6.method1066(var3 || this.field5523, -5506);
            }
        }
        this.field5523 = false;
    }
}
