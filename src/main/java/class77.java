import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 extends class14 {

    @OriginalMember(owner = "client!la", name = "ic", descriptor = "Lrd;")
    private static class117 field2099 = class95.method812("as it was used to break our rules)3", (byte) 8);

    @OriginalMember(owner = "client!la", name = "ec", descriptor = "I")
    public static int field2095 = 0;

    @OriginalMember(owner = "client!la", name = "dc", descriptor = "I")
    public static int field2094 = 0;

    @OriginalMember(owner = "client!la", name = "mc", descriptor = "[I")
    public static int[] field2103 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!la", name = "kc", descriptor = "Lrd;")
    public static class117 field2101 = class95.method812("W-=hlen Sie eine Option", (byte) 8);

    @OriginalMember(owner = "client!la", name = "pc", descriptor = "Lrd;")
    public static class117 field2106 = field2099;

    @OriginalMember(owner = "client!la", name = "Xb", descriptor = "[I")
    public static int[] field2088 = new int[50];

    @OriginalMember(owner = "client!la", name = "tc", descriptor = "[Laf;")
    public static class7[] field2110 = new class7[256];

    @OriginalMember(owner = "client!la", name = "ac", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!la", name = "bc", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!la", name = "cc", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!la", name = "fc", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!la", name = "gc", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!la", name = "hc", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!la", name = "lc", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!la", name = "nc", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!la", name = "oc", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!la", name = "qc", descriptor = "I")
    private int field2107;

    @OriginalMember(owner = "client!la", name = "rc", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!la", name = "sc", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!la", name = "Yb", descriptor = "Lef;")
    private class35 field2089;

    @OriginalMember(owner = "client!la", name = "jc", descriptor = "Lge;")
    public static class47 field2100;

    @OriginalMember(owner = "client!la", name = "Zb", descriptor = "[[Lwa;")
    public static class144[][] field2090;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "(B)I")
    public final int method732(byte arg0) {
        ++field2091;
        return arg0 != 45 ? -2 : 255 & super.field326[super.field314++] - this.field2089.method438(arg0 ^ 126);
    }

    @OriginalMember(owner = "client!la", name = "k", descriptor = "(B)V")
    public final void method733(byte arg0) {
        ++field2104;
        if (arg0 != -61) {
            field2110 = null;
        }
        super.field314 = (this.field2107 + 7) / 8;
    }

    @OriginalMember(owner = "client!la", name = "s", descriptor = "(I)V")
    public static final void method734(int arg0) {
        ++field2105;
        class101.field2501.method817(false);
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class35.field1049[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; ++var2) {
            class132.field3171[var2] = 0L;
        }
        class80.field2131 = arg0;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "([II)V")
    public final void method735(int[] arg0, int arg1) {
        ++field2093;
        int var3 = -80 % ((arg1 - -23) / 60);
        this.field2089 = new class35(arg0);
    }

    @OriginalMember(owner = "client!la", name = "l", descriptor = "(B)V")
    public final void method736(byte arg0) {
        this.field2107 = super.field314 * 8;
        if (arg0 < 118) {
            field2088 = null;
        }
        ++field2092;
    }

    @OriginalMember(owner = "client!la", name = "m", descriptor = "(II)Lfd;")
    public static final class40 method737(int arg0, int arg1) {
        if (arg0 != 14) {
            method737(90, 32);
        }
        class40 var2 = (class40) class128.field3057.method774((long) arg1, 329);
        ++field2097;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = field2100.method526((byte) 116, 14, arg1);
            class40 var4 = new class40();
            if (var3 != null) {
                var4.method461(new class14(var3), -10038);
            }
            class128.field3057.method773((long) arg1, (byte) -17, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
    public class77(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!la", name = "m", descriptor = "(B)V")
    public static void method738(byte arg0) {
        field2106 = null;
        field2090 = null;
        int var1 = 2 / ((46 - arg0) / 41);
        field2110 = null;
        field2088 = null;
        field2100 = null;
        field2103 = null;
        field2099 = null;
        field2101 = null;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        if (!arg0) {
            ++field2098;
            super.field326[super.field314++] = (byte) (arg1 + this.field2089.method438(82));
        }
    }

    @OriginalMember(owner = "client!la", name = "n", descriptor = "(II)I")
    public final int method740(int arg0, int arg1) {
        if (arg0 < 27) {
            return 81;
        } else {
            ++field2102;
            return arg1 * 8 + -this.field2107;
        }
    }

    @OriginalMember(owner = "client!la", name = "o", descriptor = "(II)I")
    public final int method741(int arg0, int arg1) {
        ++field2109;
        int var3 = this.field2107 >> 3;
        int var4 = 57 / ((arg1 - 82) / 36);
        int var5 = 0;
        int var6 = 8 - (this.field2107 & 7);
        this.field2107 += arg0;
        while (arg0 > var6) {
            var5 += (super.field326[var3++] & class41.field1184[var6]) << -var6 + arg0;
            arg0 -= var6;
            var6 = 8;
        }
        int var7;
        if (arg0 == var6) {
            var7 = (class41.field1184[var6] & super.field326[var3]) + var5;
        } else {
            var7 = (super.field326[var3] >> -arg0 + var6 & class41.field1184[arg0]) + var5;
        }
        return var7;
    }
}
