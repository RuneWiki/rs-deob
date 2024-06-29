import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class537 extends class157 {

    @OriginalMember(owner = "client!jd", name = "Ob", descriptor = "Llg;")
    public static class32 field7369 = new class32(15, 0, 1, 0);

    @OriginalMember(owner = "client!jd", name = "Ab", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!jd", name = "Bb", descriptor = "I")
    private int field7356;

    @OriginalMember(owner = "client!jd", name = "Cb", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!jd", name = "Db", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!jd", name = "Eb", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!jd", name = "Gb", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!jd", name = "Hb", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!jd", name = "Ib", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!jd", name = "Jb", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!jd", name = "Kb", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!jd", name = "Lb", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!jd", name = "Mb", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!jd", name = "Nb", descriptor = "I")
    public static int field7368;

    @OriginalMember(owner = "client!jd", name = "Pb", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!jd", name = "Qb", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!jd", name = "Rb", descriptor = "Lga;")
    public static class332 field7372;

    @OriginalMember(owner = "client!jd", name = "Fb", descriptor = "Ljh;")
    private class603 field7360;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIII)Z")
    public static final boolean method3007(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg1 != 14969) {
            field7372 = null;
        }
        ++field7367;
        if (~(arg0 + arg6) < ~arg5 && ~arg0 > ~(arg5 - -arg4)) {
            return arg3 + arg8 > arg2 && ~arg3 > ~(arg2 + arg7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZI)I")
    public final int method3008(boolean arg0, int arg1) {
        ++field7363;
        int var3 = this.field7356 >> 3;
        int var4 = 8 - (this.field7356 & 7);
        int var5 = 0;
        this.field7356 += arg1;
        if (arg0) {
            field7369 = null;
        }
        while (arg1 > var4) {
            var5 += (class53.field679[var4] & super.field2199[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field2199[var3] & class53.field679[var4]) + var5;
        } else {
            var6 = (super.field2199[var3] >> -arg1 + var4 & class53.field679[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jd", name = "z", descriptor = "(I)Z")
    public final boolean method3009(int arg0) {
        ++field7368;
        int var2 = 255 & super.field2199[super.field2219] - this.field7360.method3361(arg0);
        return var2 >= 128;
    }

    @OriginalMember(owner = "client!jd", name = "A", descriptor = "(I)V")
    public static final void method3010(int arg0) {
        ++field7355;
        if (class164.field2349 != arg0) {
            int var1 = class409.field5387.method1890(16777215);
            int var2 = class409.field5387.method1893((byte) 93);
            class294 var3 = (class294) class58.field743.method2506(68);
            if (var3 != null) {
                var1 = var3.method454(-3);
                var2 = var3.method451((byte) -116);
            }
            class140.method786(0, 0, class399.field5301, var2, class164.field2349, 0, var1, 33, 0, class60.field750);
            if (class418.field5502 != null) {
                class466.method2594(var1, var2, (byte) -87);
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(I)V")
    public class537(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "B", descriptor = "(I)V")
    public final void method3011(int arg0) {
        if (arg0 != -1) {
            this.field7356 = -44;
        }
        this.field7356 = super.field2219 * 8;
        ++field7366;
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "(B)I")
    public final int method3012(byte arg0) {
        ++field7358;
        int var2 = 255 & super.field2199[super.field2219++] + -this.field7360.method3360(256);
        if (~var2 > -129) {
            return var2;
        } else {
            if (arg0 != -82) {
                this.method3014(125, 39, -92, (byte[]) null);
            }
            return (var2 - 128 << 8) + (255 & super.field2199[super.field2219++] - this.field7360.method3360(arg0 ^ -338));
        }
    }

    @OriginalMember(owner = "client!jd", name = "C", descriptor = "(I)V")
    public static void method3013(int arg0) {
        field7369 = null;
        if (arg0 == -1) {
            field7372 = null;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III[B)V")
    public final void method3014(int arg0, int arg1, int arg2, byte[] arg3) {
        if (arg1 != -257629242) {
            field7364 = 114;
        }
        for (int var5 = 0; var5 < arg2; ++var5) {
            arg3[var5 - -arg0] = (byte) (super.field2199[super.field2219++] + -this.field7360.method3360(256));
        }
        ++field7362;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BLjh;)V")
    public final void method3015(byte arg0, class603 arg1) {
        ++field7357;
        if (arg0 < -48) {
            this.field7360 = arg1;
        }
    }

    @OriginalMember(owner = "client!jd", name = "D", descriptor = "(I)V")
    public final void method3016(int arg0) {
        super.field2219 = (this.field7356 + 7) / 8;
        ++field7359;
        if (arg0 < 57) {
            this.method3009(-81);
        }
    }

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "(II)I")
    public final int method3017(int arg0, int arg1) {
        ++field7361;
        if (arg0 > -12) {
            field7369 = null;
        }
        return arg1 * 8 - this.field7356;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IB)V")
    public final void method3018(int arg0, byte arg1) {
        super.field2199[super.field2219++] = (byte) (arg0 + this.field7360.method3360(256));
        if (arg1 == 63) {
            ++field7370;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([II)V")
    public final void method3019(int[] arg0, int arg1) {
        this.field7360 = new class603(arg0);
        if (arg1 != -1853026621) {
            this.method3017(-16, -77);
        }
        ++field7371;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
    public static final boolean method3020(int arg0, int arg1, int arg2) {
        if (arg0 != 52) {
            field7372 = null;
        }
        ++field7365;
        return ~(arg2 & 52) != -1;
    }
}
