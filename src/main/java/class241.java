import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class241 extends class92 {

    @OriginalMember(owner = "client!jd", name = "Ub", descriptor = "Z")
    public static volatile boolean field4111 = true;

    @OriginalMember(owner = "client!jd", name = "Nb", descriptor = "Lmh;")
    private static class62 field4104 = class201.method1405(true, "Drop");

    @OriginalMember(owner = "client!jd", name = "Vb", descriptor = "Lmh;")
    public static class62 field4112 = field4104;

    @OriginalMember(owner = "client!jd", name = "Wb", descriptor = "Lud;")
    public static class52 field4113 = new class52();

    @OriginalMember(owner = "client!jd", name = "cc", descriptor = "Lmh;")
    public static class62 field4119 = class201.method1405(true, "::fullscreen");

    @OriginalMember(owner = "client!jd", name = "ac", descriptor = "B")
    public static byte field4117;

    @OriginalMember(owner = "client!jd", name = "Lb", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!jd", name = "Mb", descriptor = "I")
    private int field4103;

    @OriginalMember(owner = "client!jd", name = "Ob", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!jd", name = "Pb", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!jd", name = "Rb", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!jd", name = "Sb", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!jd", name = "Tb", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!jd", name = "Yb", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!jd", name = "Zb", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!jd", name = "bc", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!jd", name = "dc", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!jd", name = "Qb", descriptor = "Lwi;")
    public static class242 field4107;

    @OriginalMember(owner = "client!jd", name = "Xb", descriptor = "Lwh;")
    private class247 field4114;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "(B)V", line = 4)
    public final void method1686(byte arg0) {
        this.field1476 = (this.field4103 + 7) / 8;
        field4106++;
        if (arg0 != -17) {
            this.field4103 = -117;
        }
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(IB)I", line = 15)
    public final int method1687(int arg0, byte arg1) {
        field4108++;
        int var3 = this.field4103 >> 3;
        if (arg1 != 26) {
            this.field4114 = (class247) null;
        }
        int var4 = 8 - (this.field4103 & 0x7);
        this.field4103 += arg0;
        int var5 = 0;
        while (var4 < arg0) {
            var5 += (class39.field604[var4] & this.field1495[var3++]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (arg0 == var4) {
            var6 = (class39.field604[var4] & this.field1495[var3]) + var5;
        } else {
            var6 = (this.field1495[var3] >> var4 - arg0 & class39.field604[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B[I)V", line = 51)
    public final void method1688(byte arg0, int[] arg1) {
        field4109++;
        this.field4114 = new class247(arg1);
        if (arg0 >= -38) {
            this.method1690(22);
        }
    }

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "(I)V", line = 62)
    public static void method1689(int arg0) {
        if (arg0 != 8) {
            return;
        }
        field4113 = null;
        field4104 = null;
        field4107 = null;
        field4119 = null;
        field4112 = null;
    }

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "(I)I", line = 89)
    public final int method1690(int arg0) {
        field4110++;
        return arg0 == 11598 ? this.field1495[this.field1476++] - this.field4114.method1724(6292) & 0xFF : 35;
    }

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "(B)V", line = 100)
    public static final void method1691(byte arg0) {
        class52.method340();
        for (int var1 = 0; var1 < 4; var1++) {
            class250.field4244[var1].method1560(-6);
        }
        field4120++;
        if (arg0 <= -41) {
            System.gc();
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(ZI)I", line = 120)
    public final int method1692(boolean arg0, int arg1) {
        field4102++;
        return arg0 ? -123 : arg1 * 8 - this.field4103;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IZ)V", line = 131)
    public final void method1693(int arg0, boolean arg1) {
        if (!arg1) {
            field4118++;
            this.field1495[this.field1476++] = (byte) (this.field4114.method1724(6292) + arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V", line = 146)
    public class241(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II[BI)V", line = 151)
    public final void method1694(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 > 14) {
            for (int var5 = 0; var5 < arg1; var5++) {
                arg2[arg3 + var5] = (byte) (this.field1495[this.field1476++] - this.field4114.method1724(6292));
            }
            field4115++;
        }
    }

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "(B)V", line = 173)
    public final void method1695(byte arg0) {
        field4105++;
        if (arg0 <= 92) {
            this.method1695((byte) 70);
        }
        this.field4103 = this.field1476 * 8;
    }
}
