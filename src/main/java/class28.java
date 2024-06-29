import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 extends class74 {

    @OriginalMember(owner = "client!be", name = "Ib", descriptor = "Lid;")
    public static class149 field415 = class60.method382("hint_mapedge", (byte) 82);

    @OriginalMember(owner = "client!be", name = "Cb", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!be", name = "Db", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!be", name = "Eb", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!be", name = "Fb", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!be", name = "Gb", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!be", name = "Hb", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!be", name = "Kb", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!be", name = "Lb", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!be", name = "Mb", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!be", name = "Nb", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!be", name = "Ob", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!be", name = "Jb", descriptor = "Lij;")
    private class195 field416;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(BI)I")
    public final int method154(byte arg0, int arg1) {
        ++field412;
        int var3 = this.field410 >> 3;
        int var4 = -(7 & this.field410) + 8;
        this.field410 += arg1;
        int var5 = 0;
        while (arg1 > var4) {
            var5 += (super.field1321[var3++] & class183.field3307[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        if (arg0 != 9) {
            this.field416 = null;
        }
        int var6;
        if (arg1 != var4) {
            var6 = (super.field1321[var3] >> -arg1 + var4 & class183.field3307[arg1]) + var5;
        } else {
            var6 = (super.field1321[var3] & class183.field3307[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!be", name = "m", descriptor = "(I)V")
    public final void method155(int arg0) {
        int var2 = 93 % ((-15 - arg0) / 63);
        ++field421;
        this.field410 = super.field1340 * 8;
    }

    @OriginalMember(owner = "client!be", name = "n", descriptor = "(I)I")
    public final int method156(int arg0) {
        if (arg0 != -23542) {
            this.field410 = -8;
        }
        ++field413;
        return 255 & super.field1321[super.field1340++] + -this.field416.method1330((byte) 124);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([BIII)V")
    public final void method157(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field409;
        if (arg1 != -1476) {
            this.method154((byte) 38, 36);
        }
        for (int var5 = 0; var5 < arg3; ++var5) {
            arg0[arg2 + var5] = (byte) (super.field1321[super.field1340++] + -this.field416.method1330((byte) 111));
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([II)V")
    public final void method158(int[] arg0, int arg1) {
        ++field411;
        if (arg1 > 0) {
            this.method157((byte[]) null, -83, 105, 11);
        }
        this.field416 = new class195(arg0);
    }

    @OriginalMember(owner = "client!be", name = "o", descriptor = "(I)V")
    public final void method159(int arg0) {
        super.field1340 = (this.field410 + 7) / 8;
        ++field418;
        if (arg0 != 0) {
            method161((byte) -88);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public static final void method160(int arg0, int arg1, int arg2) {
        if (arg0 != 10) {
            field415 = null;
        }
        class61.field1095[arg1] = arg2;
        ++field420;
        class227 var3 = (class227) class17.field250.method639((byte) -92, (long) arg1);
        if (var3 != null) {
            if (var3.field3984 != 4611686018427387905L) {
                var3.field3984 = 500L + class81.method608(19644) | 4611686018427387904L;
                return;
            }
        } else {
            class227 var4 = new class227(4611686018427387905L);
            class17.field250.method638((byte) -89, var4, (long) arg1);
        }
    }

    @OriginalMember(owner = "client!be", name = "u", descriptor = "(B)V")
    public static void method161(byte arg0) {
        if (arg0 <= -99) {
            field415 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "k", descriptor = "(II)V")
    public final void method162(int arg0, int arg1) {
        if (arg0 != 2) {
            field415 = null;
        }
        super.field1321[super.field1340++] = (byte) (this.field416.method1330((byte) 107) + arg1);
        ++field414;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(I)V")
    public class28(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBI)I")
    public static final int method163(int arg0, byte arg1, int arg2) {
        if (arg1 != -29) {
            method160(-60, 55, -15);
        }
        ++field419;
        int var3 = -128 + class227.method1526(4, arg0 + 45365, true, arg2 + 91923) + (class227.method1526(2, arg0 - -10294, true, arg2 - -37821) - 128 >> 1) + (-128 + class227.method1526(1, arg0, true, arg2) >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 >= 10) {
            if (~var4 < -61) {
                var4 = 60;
            }
        } else {
            var4 = 10;
        }
        return var4;
    }

    @OriginalMember(owner = "client!be", name = "l", descriptor = "(II)I")
    public final int method164(int arg0, int arg1) {
        ++field417;
        return arg1 < 66 ? 105 : arg0 * 8 - this.field410;
    }
}
