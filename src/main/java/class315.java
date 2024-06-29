import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class315 extends class376 {

    @OriginalMember(owner = "client!gaa", name = "Rb", descriptor = "Ljw;")
    public static class581 field4535 = new class581(14, 4);

    @OriginalMember(owner = "client!gaa", name = "Wb", descriptor = "[Ljava/lang/String;")
    public static String[] field4540 = new String[8];

    @OriginalMember(owner = "client!gaa", name = "Ib", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!gaa", name = "Jb", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!gaa", name = "Kb", descriptor = "I")
    private int field4528;

    @OriginalMember(owner = "client!gaa", name = "Lb", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!gaa", name = "Mb", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!gaa", name = "Nb", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!gaa", name = "Ob", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!gaa", name = "Qb", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!gaa", name = "Sb", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!gaa", name = "Tb", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!gaa", name = "Ub", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!gaa", name = "Vb", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!gaa", name = "Xb", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!gaa", name = "Pb", descriptor = "Lw;")
    private class317 field4533;

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lor;I)V", line = 3)
    public static final void method1981(class668 arg0, int arg1) {
        if (arg1 != 298724582) {
            field4541 = -75;
        }
        ++field4537;
        if (~arg0.field9353 == -6 && ~arg0.field9283 != 0) {
            class418.method2576(class379.field5542, arg0, false);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B[I)V", line = 17)
    public final void method1982(byte arg0, int[] arg1) {
        this.field4533 = new class317(arg1);
        if (arg0 <= 112) {
            this.method1985(-111);
        }
        ++field4531;
    }

    @OriginalMember(owner = "client!gaa", name = "m", descriptor = "(II)V", line = 28)
    public final void method1983(int arg0, int arg1) {
        super.field5518[super.field5459++] = (byte) (this.field4533.method1996(-112) + arg1);
        ++field4534;
        int var3 = 4 % ((arg0 - 4) / 63);
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(I)V", line = 40)
    public class315(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gaa", name = "v", descriptor = "(I)V", line = 43)
    public final void method1984(int arg0) {
        ++field4530;
        if (arg0 <= -57) {
            super.field5459 = (this.field4528 + 7) / 8;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "w", descriptor = "(I)Z", line = 54)
    public final boolean method1985(int arg0) {
        ++field4538;
        int var2 = super.field5518[super.field5459] - this.field4533.method1994(86) & 255;
        if (arg0 < 35) {
            field4535 = null;
        }
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!gaa", name = "n", descriptor = "(II)I", line = 76)
    public final int method1986(int arg0, int arg1) {
        if (arg1 <= 67) {
            field4535 = null;
        }
        ++field4527;
        return arg0 * 8 + -this.field4528;
    }

    @OriginalMember(owner = "client!gaa", name = "x", descriptor = "(I)I", line = 87)
    public final int method1987(int arg0) {
        ++field4526;
        if (arg0 < 92) {
            this.method1982((byte) 120, (int[]) null);
        }
        int var2 = super.field5518[super.field5459++] + -this.field4533.method1996(-76) & 255;
        return ~var2 > -129 ? var2 : (var2 + -128 << 8) + (super.field5518[super.field5459++] + -this.field4533.method1996(-50) & 255);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Lw;I)V", line = 103)
    public final void method1988(class317 arg0, int arg1) {
        ++field4536;
        this.field4533 = arg0;
        if (arg1 != -7860) {
            this.method1990(false);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "()V", line = 122)
    public static final void method1989() {
        for (int var0 = 0; var0 < class186.field2480; ++var0) {
            class319 var1 = class200.field2657[var0];
            class3.method10(var1, true);
            class200.field2657[var0] = null;
        }
        class186.field2480 = 0;
    }

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "(Z)V", line = 135)
    public final void method1990(boolean arg0) {
        if (!arg0) {
            this.field4528 = super.field5459 * 8;
            ++field4532;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IIB[B)V", line = 153)
    public final void method1991(int arg0, int arg1, byte arg2, byte[] arg3) {
        int var5 = -51 % ((arg2 - 70) / 37);
        for (int var6 = 0; var6 < arg0; ++var6) {
            arg3[arg1 + var6] = (byte) (super.field5518[super.field5459++] + -this.field4533.method1996(-122));
        }
        ++field4529;
    }

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "(B)V", line = 170)
    public static void method1992(byte arg0) {
        field4535 = null;
        field4540 = null;
        if (arg0 < 50) {
            method1981((class668) null, -96);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "o", descriptor = "(II)I", line = 194)
    public final int method1993(int arg0, int arg1) {
        ++field4539;
        int var3 = this.field4528 >> 3;
        int var4 = -(this.field4528 & 7) + 8;
        int var5 = 0;
        if (arg0 != -1) {
            this.field4528 = -117;
        }
        this.field4528 += arg1;
        while (arg1 > var4) {
            var5 += (super.field5518[var3++] & class355.field5209[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 == ~var4) {
            var6 = (super.field5518[var3] & class355.field5209[var4]) + var5;
        } else {
            var6 = (super.field5518[var3] >> -arg1 + var4 & class355.field5209[arg1]) + var5;
        }
        return var6;
    }
}
