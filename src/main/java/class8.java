import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class8 extends class34 {

    @OriginalMember(owner = "client!b", name = "Gb", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    private int field113;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "I")
    private int field122;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
    private int field120;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
    private int field119;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
    private int field116;

    @OriginalMember(owner = "client!b", name = "Cb", descriptor = "I")
    private int field126;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "Lnf;")
    private class96 field121;

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
    private int field123;

    @OriginalMember(owner = "client!b", name = "Ib", descriptor = "I")
    private int field132;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    public static int field112 = 0;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "Lqf;")
    public static class117 field115 = class72.method514(100, "::qa_op_test");

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "[I")
    public static int[] field124 = new int[99];

    @OriginalMember(owner = "client!b", name = "Bb", descriptor = "Lqf;")
    public static class117 field125 = class72.method514(110, "Fallen lassen");

    @OriginalMember(owner = "client!b", name = "Db", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!b", name = "Eb", descriptor = "J")
    public static long field128;

    @OriginalMember(owner = "client!b", name = "Hb", descriptor = "Lhd;")
    public static class53 field131;

    @OriginalMember(owner = "client!b", name = "Lb", descriptor = "Lqf;")
    public static class117 field135;

    @OriginalMember(owner = "client!b", name = "Kb", descriptor = "Lqf;")
    private static class117 field134;

    @OriginalMember(owner = "client!b", name = "Jb", descriptor = "Lqf;")
    public static class117 field133;

    @OriginalMember(owner = "client!b", name = "Mb", descriptor = "Lqf;")
    public static class117 field136;

    @OriginalMember(owner = "client!b", name = "Nb", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!b", name = "Fb", descriptor = "Lvc;")
    public static class146 field129;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)V")
    public static final void method39(byte arg0) {
        if (arg0 != -23) {
            method41(-109);
        }
        field117++;
        while (class96.field2338.method957(8, class71.field1502) >= 11) {
            int var1 = class96.field2338.method963(-79, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class149.field3709[var1] == null) {
                class149.field3709[var1] = new class21();
                var2 = true;
                if (class3.field43[var1] != null) {
                    class149.field3709[var1].method159(class3.field43[var1], arg0);
                }
            }
            class20.field326[class66.field1387++] = var1;
            class21 var3 = class149.field3709[var1];
            var3.field2008 = class43.field856;
            int var4 = class96.field2338.method963(-47, 1);
            if (var4 == 1) {
                class56.field1151[class91.field2225++] = var1;
            }
            int var5 = class96.field2338.method963(-104, 1);
            int var6 = class31.field655[class96.field2338.method963(-100, 3)];
            if (var2) {
                var3.field1999 = var6;
            }
            int var7 = class96.field2338.method963(-100, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class96.field2338.method963(-40, 5);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method685((byte) 18, var5 == 1, class141.field3395.field1970[0] + var8, class141.field3395.field2004[0] - -var7);
        }
        class96.field2338.method956(13656);
    }

    @OriginalMember(owner = "client!b", name = "j", descriptor = "(I)Lea;")
    public final class30 method7(int arg0) {
        field118++;
        if (this.field121 != null) {
            int var2 = class43.field856 - this.field123;
            if (var2 > 100 && this.field121.field2331 > 0) {
                var2 = 100;
            }
            label42: {
                do {
                    do {
                        if (var2 <= this.field121.field2334[this.field132]) {
                            break label42;
                        }
                        var2 -= this.field121.field2334[this.field132];
                        this.field132++;
                    } while (this.field121.field2312.length > this.field132);
                    this.field132 -= this.field121.field2331;
                } while (this.field132 >= 0 && this.field121.field2312.length > this.field132);
                this.field121 = null;
            }
            this.field123 = class43.field856 - var2;
        }
        class148 var3 = class23.method181((byte) -126, this.field119);
        if (var3.field3653 != null) {
            var3 = var3.method1181(-16431);
        }
        if (arg0 != -6941) {
            this.method7(63);
        }
        return var3 == null ? null : var3.method1190(this.field121, this.field116, this.field120, this.field126, this.field130, this.field122, this.field113, (byte) 9, this.field132);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static void method40(byte arg0) {
        field124 = null;
        field115 = null;
        field131 = null;
        field135 = null;
        field129 = null;
        field125 = null;
        field136 = null;
        field133 = null;
        if (arg0 != -12) {
            method40((byte) -111);
        }
        field134 = null;
    }

    @OriginalMember(owner = "client!b", name = "k", descriptor = "(I)V")
    public static final void method41(int arg0) {
        field114++;
        class53 var1 = field131;
        synchronized (field131) {
            class152.field3752 = class20.field328;
            class143.field3504 = class152.field3744;
            class18.field274 = class124.field2916;
            int var2 = -113 / ((arg0 - 56) / 40);
            class133.field3142 = class70.field1485;
            class153.field3788 = class124.field2931;
            class102.field2462 = class110.field2604;
            class34.field705 = class73.field1598;
            class70.field1485 = 0;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(IIIIIIIIZLee;)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, class34 arg9) {
        this.field130 = arg6;
        this.field113 = arg1;
        this.field122 = arg3;
        this.field120 = arg4;
        this.field119 = arg0;
        this.field116 = arg5;
        this.field126 = arg2;
        if (arg7 != -1) {
            this.field121 = class130.method1013(arg7, -119);
            this.field123 = class43.field856 - 1;
            this.field132 = 0;
            if (this.field121.field2319 == 0 && arg9 != null && arg9 instanceof class8) {
                class8 var11 = (class8) arg9;
                if (this.field121 == var11.field121) {
                    this.field123 = var11.field123;
                    this.field132 = var11.field132;
                    return;
                }
            }
            if (arg8 && this.field121.field2331 != -1) {
                this.field132 = (int) ((double) this.field121.field2312.length * Math.random());
                this.field123 -= (int) ((double) this.field121.field2334[this.field132] * Math.random());
                return;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field124[var1] = var0 / 4;
        }
        field127 = 0;
        field128 = 0L;
        field131 = new class53();
        field135 = class72.method514(126, "");
        field134 = class72.method514(104, "as it was used to break our rules)3");
        field133 = field134;
        field136 = class72.method514(105, "Spieler kann nicht gefunden werden: ");
        field137 = 0;
    }
}
