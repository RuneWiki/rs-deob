import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class106 extends class226 {

    @OriginalMember(owner = "client!gh", name = "Zb", descriptor = "I")
    public static int field2001 = 0;

    @OriginalMember(owner = "client!gh", name = "Qb", descriptor = "Lub;")
    public static class227 field1992 = class257.method1749("gr-Un:", 17263);

    @OriginalMember(owner = "client!gh", name = "Vb", descriptor = "I")
    public static int field1997 = 2301979;

    @OriginalMember(owner = "client!gh", name = "Pb", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!gh", name = "Rb", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!gh", name = "Tb", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!gh", name = "Ub", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!gh", name = "Wb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!gh", name = "Xb", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!gh", name = "Yb", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!gh", name = "ac", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!gh", name = "bc", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!gh", name = "cc", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!gh", name = "dc", descriptor = "I")
    private int field2005;

    @OriginalMember(owner = "client!gh", name = "ec", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!gh", name = "Sb", descriptor = "Lqh;")
    private class144 field1994;

    @OriginalMember(owner = "client!gh", name = "Ob", descriptor = "[I")
    public static int[] field1990;

    @OriginalMember(owner = "client!gh", name = "w", descriptor = "(I)V")
    public static final void method655(int arg0) {
        if (arg0 == 2301979) {
            if (class61.field1121 != null) {
                class251 var1 = class61.field1121;
                synchronized (class61.field1121) {
                    class61.field1121 = null;
                }
            }
            ++field2000;
        }
    }

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "(II)V")
    public static final void method656(int arg0, int arg1) {
        ++field2006;
        if (class195.method1234(arg0, (byte) -23)) {
            class28.method141(-1, 201, class102.field1792[arg0]);
            int var2 = 86 % ((arg1 - -88) / 34);
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(I)V")
    public class106(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B[I)V")
    public final void method657(byte arg0, int[] arg1) {
        if (arg0 != 4) {
            field1997 = 96;
        }
        ++field1995;
        this.field1994 = new class144(arg1);
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(BI)I")
    public static final int method658(byte arg0, int arg1) {
        if (arg0 < 34) {
            field1990 = null;
        }
        ++field1999;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "(B)V")
    public static void method659(byte arg0) {
        field1990 = null;
        field1992 = null;
        if (arg0 != 123) {
            method655(-20);
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "(IZ)I")
    public final int method660(int arg0, boolean arg1) {
        int var3 = this.field2005 >> 3;
        ++field1991;
        int var4 = 0;
        int var5 = 8 - (7 & this.field2005);
        if (!arg1) {
            return 60;
        } else {
            this.field2005 += arg0;
            while (arg0 > var5) {
                var4 += (class186.field3164[var5] & super.field3901[var3++]) << arg0 - var5;
                arg0 -= var5;
                var5 = 8;
            }
            int var6;
            if (arg0 == var5) {
                var6 = (super.field3901[var3] & class186.field3164[var5]) + var4;
            } else {
                var6 = (super.field3901[var3] >> -arg0 + var5 & class186.field3164[arg0]) + var4;
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I[BII)V")
    public final void method661(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field2004;
        for (int var5 = arg0; var5 < arg2; ++var5) {
            arg1[arg3 + var5] = (byte) (super.field3901[super.field3879++] + -this.field1994.method906((byte) 62));
        }
    }

    @OriginalMember(owner = "client!gh", name = "x", descriptor = "(I)V")
    public final void method662(int arg0) {
        super.field3879 = (this.field2005 + 7) / 8;
        if (arg0 >= -38) {
            field1990 = null;
        }
        ++field1996;
    }

    @OriginalMember(owner = "client!gh", name = "y", descriptor = "(I)I")
    public final int method663(int arg0) {
        int var2 = 69 / ((arg0 - -9) / 35);
        ++field1998;
        return 255 & super.field3901[super.field3879++] + -this.field1994.method906((byte) 62);
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(BI)V")
    public final void method664(byte arg0, int arg1) {
        int var3 = -84 / ((arg0 - -44) / 54);
        ++field2002;
        super.field3901[super.field3879++] = (byte) (arg1 + this.field1994.method906((byte) 62));
    }

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "(II)I")
    public final int method665(int arg0, int arg1) {
        ++field2003;
        if (arg1 != 7) {
            field1990 = null;
        }
        return arg0 * 8 + -this.field2005;
    }

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "(B)V")
    public final void method666(byte arg0) {
        if (arg0 != 54) {
            field2001 = -55;
        }
        this.field2005 = super.field3879 * 8;
        ++field1993;
    }
}
