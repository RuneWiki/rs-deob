import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class449 extends class554 {

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "F")
    private float field6343 = 0.0F;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "Lpv;")
    private class64 field6349;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "Lim;")
    public static class353 field6345 = new class353(18, -2);

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "Lrn;")
    public static class307 field6353;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "Lgf;")
    public static class482 field6352;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        if (!arg0) {
            field6353 = null;
        }
        ++field6346;
        super.field7743.method3344(29639, arg2);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        super.field7743.method3339((byte) 90, 1);
        ++field6344;
        super.field7743.method3316(class505.field7041, -116, class509.field7093);
        super.field7743.method1210(class93.field1233, false, true, true, 0);
        super.field7743.method3307(class17.field173, 0, 16711680);
        super.field7743.method1204(0, 0);
        super.field7743.method3339((byte) 90, 0);
        super.field7743.method3334(8, -16777216);
        super.field7743.method3307(class320.field4434, 0, 16711680);
        if (arg0 == 61) {
            this.method2170(true);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        super.field7743.method3316(class443.field6123, -125, class509.field7093);
        ++field6350;
        if (arg1 < 74) {
            this.field6343 = 0.5888641F;
        }
    }

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
    public static void method2617(int arg0) {
        if (arg0 != 0) {
            field6345 = null;
        }
        field6352 = null;
        field6353 = null;
        field6345 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
    public final void method2170(boolean arg0) {
        if (arg0) {
            ++field6351;
            if (super.field7743.method3361(1000) == 0) {
                class186 var2 = super.field7743.method3285(79);
                super.field7743.method3339((byte) 90, 1);
                class186 var3 = super.field7743.method3299(-8435);
                var3.method362(var2);
                var3.method1133(false, 0.125F, 1.0F, 0.125F);
                var3.method1146(0.0F, 0.0F, this.field6343, 0);
                super.field7743.method3321((byte) -127, class272.field3458);
                super.field7743.method3339((byte) 90, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lre;Lpv;)V")
    public class449(class582 arg0, class64 arg1) {
        super(arg0);
        this.field6349 = arg1;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        ++field6348;
        super.field7743.method3339((byte) 90, 1);
        if ((128 & arg2) == 0) {
            if (~(1 & arg0) != -2) {
                if (!this.field6349.field869) {
                    super.field7743.method3344(29639, this.field6349.field864[0]);
                } else {
                    super.field7743.method3344(29639, this.field6349.field867);
                }
            } else if (this.field6349.field869) {
                this.field6343 = (float) (super.field7743.field8378 % 4000) / 4000.0F;
                super.field7743.method3344(29639, this.field6349.field867);
            } else {
                int var4 = super.field7743.field8378 % 4000 * 16 / 4000;
                super.field7743.method3344(29639, this.field6349.field864[var4]);
            }
        } else {
            super.field7743.method3344(29639, (class11) null);
        }
        if (arg1) {
            super.field7743.method3339((byte) 90, 0);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        if (arg0 == 4096) {
            super.field7743.method3339((byte) 90, 1);
            ++field6342;
            super.field7743.method3316(class443.field6123, 109, class443.field6123);
            super.field7743.method3300(true, 0, class93.field1233);
            super.field7743.method3307(class93.field1233, 0, 16711680);
            super.field7743.method1204(1, 0);
            super.field7743.method3344(29639, (class11) null);
            super.field7743.method3339((byte) 90, 0);
            super.field7743.method3307(class93.field1233, 0, 16711680);
        }
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        ++field6347;
        if (arg0 != 4096) {
            this.field6349 = null;
        }
        return this.field6349.method370((byte) -25);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
    public static final int method2618(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field6354;
        if (~var4 == -1) {
            return arg3;
        } else if (~var4 == -2) {
            return arg2;
        } else {
            if (arg0 > -60) {
                field6345 = null;
            }
            return ~var4 == -3 ? 7 - arg3 : 7 - arg2;
        }
    }
}
