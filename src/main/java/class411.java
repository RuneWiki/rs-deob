import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public abstract class class411 implements class209 {

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "Lni;")
    public class522 field5787;

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Lni;")
    private class522 field5793;

    @OriginalMember(owner = "client!wl", name = "m", descriptor = "Lfq;")
    public class203 field5796;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field5794 = class185.method1043(1600, (byte) 31);

    @OriginalMember(owner = "client!wl", name = "o", descriptor = "[I")
    public static int[] field5798 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    private int field5784;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field5785;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "I")
    public static int field5786;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "I")
    public static int field5788;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
    public static int field5789;

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "I")
    public static int field5792;

    @OriginalMember(owner = "client!wl", name = "l", descriptor = "I")
    public static int field5795;

    @OriginalMember(owner = "client!wl", name = "n", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "J")
    private long field5791;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "Lda;")
    private class61 field5790;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)Z")
    public boolean method183(int arg0) {
        field5789++;
        if (arg0 != 14017) {
            return false;
        }
        boolean var2 = true;
        if (!this.field5787.method2882(arg0 - 14068, this.field5796.field2405)) {
            var2 = false;
        }
        if (!this.field5793.method2882(-112, this.field5796.field2405)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIBZ)V")
    public abstract void method907(int arg0, int arg1, byte arg2, boolean arg3);

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)V")
    public static void method2364(int arg0) {
        field5798 = null;
        if (arg0 != -3771) {
            field5798 = null;
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
    public static final void method2365(byte arg0) {
        field5786++;
        if (arg0 != 0) {
            field5798 = null;
        }
        class238.field3114.method1563(125);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(ZB)V")
    public final void method182(boolean arg0, byte arg1) {
        field5788++;
        int var3 = this.field5796.field2408.method3841(class751.field10419, this.field5796.field2415, (byte) 124) + this.field5796.field2403;
        int var4 = this.field5796.field2412.method606(this.field5796.field2402, class396.field5620, (byte) -56) + this.field5796.field2406;
        this.method907(var4, var3, (byte) -36, arg0);
        if (arg1 >= -81) {
            this.method907(8, 30, (byte) -95, true);
        }
        this.method910(2, var4, var3, arg0);
        String var5 = class633.field8786.method1162((byte) -46);
        if (class538.method2963(-47) - this.field5791 > 10000L) {
            var5 = var5 + " (" + class633.field8786.method1161((byte) 54).method2261((byte) -10) + ")";
        }
        this.field5790.method479(this.field5796.field2414, var5, this.field5796.field2415 / 2 + var3, -1, (byte) -98, var4 + (this.field5796.field2402 / 2) + this.field5796.field2407 + 4);
    }

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "(I)I")
    public final int method2366(int arg0) {
        field5795++;
        int var2 = class633.field8786.method1159(-125);
        int var3 = arg0 * var2;
        if (this.field5784 == var2 && var2 != 0) {
            int var4 = class633.field8786.method1166(6119);
            if (var4 > var2) {
                long var5 = this.field5791 - class633.field8786.method1164((byte) -5);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class538.method2963(arg0 - 147) - this.field5791) * 10000L;
                    if (var9 < var7) {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + ((long) (var2 * 100)));
                    } else {
                        var3 = var4 * 100;
                    }
                }
            }
        } else {
            this.field5784 = var2;
            this.field5791 = class538.method2963(arg0 ^ 0xFFFFFFB5);
        }
        return var3;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
    public void method184(byte arg0) {
        if (arg0 != -43) {
            this.method907(-19, 49, (byte) 123, false);
        }
        field5792++;
        class377 var2 = class389.method2270(this.field5793, true, this.field5796.field2405);
        this.field5790 = class21.field142.method425(var2, class204.method1128(this.field5787, this.field5796.field2405), true);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Lbi;I)V")
    public static final void method2367(class481 arg0, int arg1) {
        field5785++;
        arg0.method2701(0);
        int var2 = class247.field3207;
        class83 var3 = class653.field9086 = class361.field4793[var2] = new class83();
        var3.field817 = var2;
        int var4 = arg0.method2702((byte) -108, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFF6B1) >> 14;
        var3.field898[0] = var6 - class99.field1313;
        int var7 = var4 & 0x3FFF;
        var3.field2170 = (var3.field898[0] << 9) + (var3.method543(arg1 ^ arg1) << 8);
        var3.field899[0] = var7 - class133.field1704;
        var3.field2165 = (var3.field899[0] << 9) + (var3.method543(0) << 8);
        class61.field677 = var3.field2175 = var3.field2167 = var5;
        if (class669.method3767(var3.field899[0], (byte) -117, var3.field898[0])) {
            var3.field2167++;
        }
        if (class420.field5891[var2] != null) {
            var3.method614(class420.field5891[var2], (byte) 73);
        }
        class427.field6032 = 0;
        class619.field8682[class427.field6032++] = var2;
        class391.field5547[var2] = 0;
        class147.field1898 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method2702((byte) -20, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFE4) >> 8;
                int var12 = var9 & 0xFF;
                class169 var13 = class635.field8830[var8] = new class169();
                var13.field2112 = (var10 << 28) - (-(var11 << 14) - var12);
                var13.field2111 = false;
                var13.field2113 = -1;
                var13.field2108 = 0;
                class430.field6059[class147.field1898++] = var8;
                class391.field5547[var8] = 0;
            }
        }
        arg0.method2699((byte) 120);
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIZ)V")
    public abstract void method910(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lni;Lni;Lfq;)V")
    public class411(class522 arg0, class522 arg1, class203 arg2) {
        this.field5787 = arg0;
        this.field5793 = arg1;
        this.field5796 = arg2;
    }
}
