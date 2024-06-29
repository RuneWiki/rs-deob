import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class304 extends class303 {

    @OriginalMember(owner = "client!s", name = "Ob", descriptor = "[Lbo;")
    public static class234[] field4745 = new class234[50];

    @OriginalMember(owner = "client!s", name = "bc", descriptor = "I")
    public static int field4758 = 0;

    @OriginalMember(owner = "client!s", name = "Ub", descriptor = "Ljava/lang/String;")
    public static String field4751 = "Loading defaults - ";

    @OriginalMember(owner = "client!s", name = "Pb", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!s", name = "Qb", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!s", name = "Rb", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!s", name = "Tb", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!s", name = "Vb", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!s", name = "Wb", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!s", name = "Yb", descriptor = "I")
    private int field4755;

    @OriginalMember(owner = "client!s", name = "Zb", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!s", name = "ac", descriptor = "I")
    public static int field4757;

    @OriginalMember(owner = "client!s", name = "cc", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!s", name = "dc", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!s", name = "ec", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!s", name = "Sb", descriptor = "Lwf;")
    public static class306 field4749;

    @OriginalMember(owner = "client!s", name = "Xb", descriptor = "Lij;")
    private class34 field4754;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "(I)V", line = 6)
    public final void method2062(int arg0) {
        this.field4679 = (this.field4755 + 7) / arg0;
        field4757++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI[BI)V", line = 16)
    public final void method2063(boolean arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = 0; var5 < arg1; var5++) {
            arg2[var5 + arg3] = (byte) (this.field4716[this.field4679++] - this.field4754.method253(-14));
        }
        if (!arg0) {
            field4745 = (class234[]) null;
        }
        field4753++;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(I)V", line = 33)
    public class304(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!s", name = "n", descriptor = "(II)V", line = 43)
    public final void method2064(int arg0, int arg1) {
        this.field4716[this.field4679++] = (byte) (arg1 + this.field4754.method253(-114));
        if (arg0 == 255) {
            field4756++;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "([II)V", line = 54)
    public final void method2065(int[] arg0, int arg1) {
        this.field4754 = new class34(arg0);
        field4759++;
        if (arg1 >= -78) {
            field4751 = (String) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lwf;Lcl;Lwf;Lwf;I)Z", line = 65)
    public static final boolean method2066(class306 arg0, class63 arg1, class306 arg2, class306 arg3, int arg4) {
        class89.field1362 = arg1;
        field4760++;
        class166.field2550 = arg3;
        if (arg4 == -1432991773) {
            class14.field149 = arg2;
            class150.field2370 = arg0;
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!s", name = "t", descriptor = "(I)V", line = 82)
    public static void method2067(int arg0) {
        field4745 = null;
        if (arg0 == -1432991773) {
            field4751 = null;
            field4749 = null;
        }
    }

    @OriginalMember(owner = "client!s", name = "l", descriptor = "(B)V", line = 99)
    public final void method2068(byte arg0) {
        this.field4755 = this.field4679 * 8;
        field4761++;
        if (arg0 != 107) {
            field4749 = (class306) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BII)V", line = 127)
    public static final void method2069(byte arg0, int arg1, int arg2) {
        int var3 = 96 / ((-arg0 - 24) / 44);
        class75 var4 = class204.method1371(7, 7, arg2);
        field4748++;
        var4.method524((byte) 57);
        var4.field1122 = arg1;
    }

    @OriginalMember(owner = "client!s", name = "f", descriptor = "(BI)I", line = 141)
    public final int method2070(byte arg0, int arg1) {
        if (arg0 <= 36) {
            return 53;
        } else {
            field4746++;
            return arg1 * 8 - this.field4755;
        }
    }

    @OriginalMember(owner = "client!s", name = "u", descriptor = "(I)I", line = 153)
    public final int method2071(int arg0) {
        field4750++;
        return arg0 == 818003299 ? this.field4716[this.field4679++] - this.field4754.method253(-119) & 0xFF : -105;
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(IZ)I", line = 171)
    public final int method2072(int arg0, boolean arg1) {
        field4747++;
        int var3 = this.field4755 >> 3;
        if (arg1) {
            field4758 = -54;
        }
        int var4 = 0;
        int var5 = 8 - (this.field4755 & 0x7);
        this.field4755 += arg0;
        while (var5 < arg0) {
            var4 += (class26.field335[var5] & this.field4716[var3++]) << arg0 - var5;
            arg0 -= var5;
            var5 = 8;
        }
        int var6;
        if (arg0 == var5) {
            var6 = (this.field4716[var3] & class26.field335[var5]) + var4;
        } else {
            var6 = (this.field4716[var3] >> var5 - arg0 & class26.field335[arg0]) + var4;
        }
        return var6;
    }
}
