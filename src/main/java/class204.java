import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class204 extends class64 {

    @OriginalMember(owner = "client!wf", name = "fb", descriptor = "I")
    private int field3987 = 1365;

    @OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
    private int field3990 = 20;

    @OriginalMember(owner = "client!wf", name = "eb", descriptor = "I")
    private int field3986 = 0;

    @OriginalMember(owner = "client!wf", name = "ob", descriptor = "I")
    private int field3996 = 0;

    @OriginalMember(owner = "client!wf", name = "db", descriptor = "Loa;")
    public static class127 field3985 = new class127(new byte[5000]);

    @OriginalMember(owner = "client!wf", name = "lb", descriptor = "Lsg;")
    private static class169 field3993 = class165.method1060("Unable to find ", 1536);

    @OriginalMember(owner = "client!wf", name = "qb", descriptor = "Lsg;")
    public static class169 field3998 = field3993;

    @OriginalMember(owner = "client!wf", name = "pb", descriptor = "I")
    public static int field3997 = 0;

    @OriginalMember(owner = "client!wf", name = "rb", descriptor = "Lsg;")
    public static class169 field3999 = class165.method1060("null", 1536);

    @OriginalMember(owner = "client!wf", name = "jb", descriptor = "I")
    public static int field3991 = 50;

    @OriginalMember(owner = "client!wf", name = "tb", descriptor = "Lua;")
    public static class181 field4001 = new class181(64);

    @OriginalMember(owner = "client!wf", name = "vb", descriptor = "Lsa;")
    public static class163 field4003 = new class163(512);

    @OriginalMember(owner = "client!wf", name = "bb", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wf", name = "cb", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wf", name = "gb", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!wf", name = "hb", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!wf", name = "mb", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!wf", name = "nb", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!wf", name = "sb", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!wf", name = "ub", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wf", name = "kb", descriptor = "Lpg;")
    public static class142 field3992;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(IB)V")
    public static final void method1323(int arg0, byte arg1) {
        ++field3994;
        class87 var2 = (class87) class3.field59.method1045((long) arg0, (byte) -77);
        if (arg1 > 66) {
            if (var2 != null) {
                for (int var3 = 0; var2.field1597.length > var3; ++var3) {
                    var2.field1597[var3] = -1;
                    var2.field1599[var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lsg;ILke;Lsg;)Lgd;")
    public static final class59 method1324(class169 arg0, int arg1, class95 arg2, class169 arg3) {
        int var4 = arg2.method553(-101, arg0);
        ++field4000;
        int var5 = arg2.method562(var4, arg3, 25284);
        return arg1 < 103 ? null : class137.method922(arg2, var4, 100, var5);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = 14 / ((-60 - arg0) / 36);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 == 3) {
                        this.field3996 = arg1.method785(true);
                    }
                } else {
                    this.field3986 = arg1.method785(true);
                }
            } else {
                this.field3990 = arg1.method785(true);
            }
        } else {
            this.field3987 = arg1.method785(true);
        }
        ++field3983;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lsg;")
    public static final class169 method1325(int arg0, int arg1) {
        if (arg1 < 60) {
            method1325(9, -8);
        }
        ++field3989;
        return class165.method1058(0, new class169[] { class2.method18((byte) -62, 255 & arg0 >> 24), class94.field1753, class2.method18((byte) -62, (arg0 & 16754379) >> 16), class94.field1753, class2.method18((byte) -62, arg0 >> 8 & 255), class94.field1753, class2.method18((byte) -62, 255 & arg0) });
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V")
    public class204() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field3988;
        int[] var3 = super.field1192.method19((byte) 124, arg0);
        if (super.field1192.field75) {
            for (int var4 = 0; ~class147.field2715 < ~var4; ++var4) {
                int var5 = (class185.field3607[var4] << 12) / this.field3987 + this.field3986;
                int var6 = (class189.field3699[arg0] << 12) / this.field3987 + this.field3996;
                int var7 = var6;
                int var8 = var5;
                int var9 = var5;
                int var10 = var5 * var5 >> 12;
                int var11 = var6;
                int var12 = 0;
                for (int var13 = var6 * var6 >> 12; var10 + var13 < 16384 && ~this.field3990 < ~var12; var13 = var11 * var11 >> 12) {
                    var11 = (var9 * var11 >> 12) * 2 - -var7;
                    ++var12;
                    var9 = -var13 + var10 + var8;
                    var10 = var9 * var9 >> 12;
                }
                var3[var4] = ~(this.field3990 + -1) >= ~var12 ? 0 : (var12 << 12) / this.field3990;
            }
        }
        return arg1 != 19 ? null : var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIII)I")
    public static final int method1326(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -arg3 + 256;
        ++field3995;
        int var5 = -82 / ((arg2 - 36) / 52);
        return (16711680 & (65280 & arg0) * arg3 + (65280 & arg1) * var4) + ((arg0 & 16711935) * arg3 + (arg1 & 16711935) * var4 & -16711936) >> 8;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(Z)V")
    public static void method1327(boolean arg0) {
        field4001 = null;
        if (!arg0) {
            field3985 = null;
            field3998 = null;
            field3992 = null;
            field3999 = null;
            field3993 = null;
            field4003 = null;
        }
    }
}
