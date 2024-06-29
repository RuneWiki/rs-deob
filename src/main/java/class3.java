import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class class3 extends class159 {

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "Z")
    public boolean field34;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "[Lie;")
    public class3[] field35;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "I")
    public static volatile int field24 = 0;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Lfo;")
    public static class239 field36 = null;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "F")
    public static float field18;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Lwj;")
    public class180 field21;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lhb;")
    public class346 field20;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lfh;IZ)V", line = 7)
    public void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method23(122, 51, 43);
        }
        field31++;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(I)I", line = 17)
    public int method15(int arg0) {
        field33++;
        if (arg0 < 115) {
            this.field22 = -4;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)[[I", line = 29)
    public final int[][] method16(int arg0, int arg1, byte arg2) {
        field28++;
        int var4 = 8 % ((arg2 - 38) / 42);
        if (this.field35[arg1].field34) {
            int[] var5 = this.field35[arg1].method25((byte) 127, arg0);
            return new int[][] { var5, var5, var5 };
        } else {
            return this.field35[arg1].method22(-21194, arg0);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I", line = 61)
    public int method17(byte arg0) {
        int var2 = 52 % ((62 - arg0) / 33);
        field32++;
        return -1;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 75)
    public void method18(byte arg0) {
        field19++;
        if (this.field34) {
            this.field21.method1261(104);
            this.field21 = null;
        } else {
            this.field20.method2438(19880);
            this.field20 = null;
        }
        if (arg0 > -115) {
            method21(65, -42, -17, 71, 27);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 102)
    public static void method19(byte arg0) {
        int var1 = 97 / ((arg0 - 61) / 37);
        field36 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 121)
    public void method20(byte arg0) {
        field26++;
        int var2 = 39 / ((arg0 + 20) / 58);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIII)I", line = 134)
    public static final int method21(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg4 & 0xF;
        field30++;
        if (arg1 != 1) {
            field18 = 1.5747283F;
        }
        int var6 = var5 < 8 ? arg0 : arg3;
        int var7 = var5 >= 4 ? (var5 == 12 || var5 == 14 ? arg0 : arg2) : arg3;
        return ((var5 & 0x2) == 0 ? var7 : -var7) + ((var5 & 0x1) == 0 ? var6 : -var6);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[[I", line = 150)
    public int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            this.method25((byte) -37, -127);
        }
        field29++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(III)V", line = 165)
    public final void method23(int arg0, int arg1, int arg2) {
        field25++;
        int var4 = -80 / ((arg0 + 28) / 60);
        int var5 = this.field22 == 255 ? arg2 : this.field22;
        if (this.field34) {
            this.field21 = new class180(var5, arg2, arg1);
        } else {
            this.field20 = new class346(var5, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(III)[I", line = 190)
    public final int[] method24(int arg0, int arg1, int arg2) {
        field17++;
        if (arg1 != 1) {
            this.field21 = (class180) null;
        }
        return this.field35[arg2].field34 ? this.field35[arg2].method25((byte) 91, arg0) : this.field35[arg2].method22(-21194, arg0)[0];
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)[I", line = 213)
    public int[] method25(byte arg0, int arg1) {
        field23++;
        if (arg0 <= 57) {
            field18 = 0.6425653F;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IZ)V", line = 231)
    public class3(int arg0, boolean arg1) {
        this.field34 = arg1;
        this.field35 = new class3[arg0];
    }
}
