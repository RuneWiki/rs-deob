import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class315 extends class227 {

    @OriginalMember(owner = "client!ji", name = "Nb", descriptor = "I")
    public static volatile int field5021 = 0;

    @OriginalMember(owner = "client!ji", name = "Tb", descriptor = "I")
    public static int field5027 = 0;

    @OriginalMember(owner = "client!ji", name = "Ib", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!ji", name = "Jb", descriptor = "I")
    private int field5017;

    @OriginalMember(owner = "client!ji", name = "Lb", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!ji", name = "Mb", descriptor = "I")
    public static int field5020;

    @OriginalMember(owner = "client!ji", name = "Ob", descriptor = "I")
    public static int field5022;

    @OriginalMember(owner = "client!ji", name = "Pb", descriptor = "I")
    public static int field5023;

    @OriginalMember(owner = "client!ji", name = "Qb", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!ji", name = "Rb", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!ji", name = "Sb", descriptor = "I")
    public static int field5026;

    @OriginalMember(owner = "client!ji", name = "Ub", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!ji", name = "Vb", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!ji", name = "Wb", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!ji", name = "Kb", descriptor = "Lwh;")
    private class355 field5018;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "(II)I", line = 7)
    public final int method2227(int arg0, int arg1) {
        if (arg0 != -27542) {
            return 33;
        }
        int var3 = 8 - (this.field5017 & 0x7);
        int var4 = this.field5017 >> 3;
        int var5 = 0;
        field5029++;
        this.field5017 += arg1;
        while (arg1 > var3) {
            var5 += (class189.field3037[var3] & this.field3793[var4++]) << arg1 - var3;
            arg1 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg1 == var3) {
            var6 = (class189.field3037[var3] & this.field3793[var4]) + var5;
        } else {
            var6 = (this.field3793[var4] >> var3 - arg1 & class189.field3037[arg1]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "(II)V", line = 37)
    public final void method2228(int arg0, int arg1) {
        this.field3793[this.field3760++] = (byte) (this.field5018.method2509(-76) + arg0);
        if (arg1 != 16547) {
            this.method2232(90);
        }
        field5020++;
    }

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "(II)I", line = 53)
    public final int method2229(int arg0, int arg1) {
        field5030++;
        return arg1 == 21256 ? arg0 * 8 - this.field5017 : -20;
    }

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "(I)V", line = 64)
    public static final void method2230(int arg0) {
        if (arg0 != 0) {
            method2233(59, (byte) 81, (class57) null, -106);
        }
        class317.field5061.method2326(arg0 - 4);
        class221.field3587.method2326(-4);
        class323.field5150.method2326(-4);
        field5023++;
    }

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "(I)V", line = 81)
    public final void method2231(int arg0) {
        int var2 = 68 / ((arg0 + 33) / 50);
        this.field5017 = this.field3760 * 8;
        field5019++;
    }

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "(I)V", line = 91)
    public final void method2232(int arg0) {
        if (arg0 != 0) {
            this.field5017 = -122;
        }
        this.field3760 = (this.field5017 + 7) / 8;
        field5022++;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(I)V", line = 101)
    public class315(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBLth;I)Z", line = 112)
    public static final boolean method2233(int arg0, byte arg1, class57 arg2, int arg3) {
        if (arg1 != 111) {
            method2230(-23);
        }
        field5016++;
        byte[] var4 = arg2.method472(arg0, 95, arg3);
        if (var4 == null) {
            return false;
        } else {
            class20.method117(var4, (byte) -65);
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "([II)V", line = 131)
    public final void method2234(int[] arg0, int arg1) {
        field5025++;
        this.field5018 = new class355(arg0);
        int var3 = -97 / ((arg1 - 38) / 56);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)I", line = 143)
    public static final int method2235(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 < 110) {
            return 44;
        } else {
            field5028++;
            return arg1 < arg2 ? arg2 : (arg0 >= arg1 ? arg1 : arg0);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B[BII)V", line = 154)
    public final void method2236(byte arg0, byte[] arg1, int arg2, int arg3) {
        field5024++;
        int var5 = -21 / ((arg0 + 56) / 32);
        for (int var6 = 0; var6 < arg2; var6++) {
            arg1[arg3 + var6] = (byte) (this.field3793[this.field3760++] - this.field5018.method2509(-77));
        }
    }

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "(I)I", line = 177)
    public final int method2237(int arg0) {
        field5026++;
        if (arg0 != 255) {
            this.method2236((byte) 104, (byte[]) null, 26, -128);
        }
        return this.field3793[this.field3760++] - this.field5018.method2509(-107) & 0xFF;
    }
}
