import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class201 extends class335 {

    @OriginalMember(owner = "client!cea", name = "Fb", descriptor = "[I")
    public static int[] field2923 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cea", name = "Rb", descriptor = "[I")
    public static int[] field2935 = null;

    @OriginalMember(owner = "client!cea", name = "Xb", descriptor = "I")
    public static int field2941 = -1;

    @OriginalMember(owner = "client!cea", name = "Ib", descriptor = "Lrt;")
    public static class212 field2926 = new class212();

    @OriginalMember(owner = "client!cea", name = "Gb", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!cea", name = "Hb", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!cea", name = "Jb", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!cea", name = "Kb", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!cea", name = "Lb", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!cea", name = "Mb", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!cea", name = "Nb", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!cea", name = "Ob", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!cea", name = "Pb", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!cea", name = "Qb", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!cea", name = "Sb", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!cea", name = "Tb", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!cea", name = "Ub", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!cea", name = "Vb", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!cea", name = "Wb", descriptor = "I")
    private int field2940;

    @OriginalMember(owner = "client!cea", name = "Yb", descriptor = "Ltb;")
    private class371 field2942;

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(I)V", line = 3)
    public class201(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cea", name = "u", descriptor = "(I)V", line = 9)
    public final void method1308(int arg0) {
        ++field2925;
        super.field4619 = (this.field2940 - -7) / arg0;
    }

    @OriginalMember(owner = "client!cea", name = "r", descriptor = "(B)Z", line = 30)
    public final boolean method1309(byte arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field2929;
            int var2 = 255 & super.field4600[super.field4619] + -this.field2942.method2186(2);
            return var2 >= 128;
        }
    }

    @OriginalMember(owner = "client!cea", name = "o", descriptor = "(II)V", line = 50)
    public final void method1310(int arg0, int arg1) {
        if (arg0 <= 101) {
            this.method1316((byte) -100, 16, (byte[]) null, 120);
        }
        super.field4600[super.field4619++] = (byte) (arg1 + this.field2942.method2180((byte) -60));
        ++field2931;
    }

    @OriginalMember(owner = "client!cea", name = "v", descriptor = "(I)V", line = 61)
    public final void method1311(int arg0) {
        if (arg0 == 958520326) {
            this.field2940 = super.field4619 * 8;
            ++field2930;
        }
    }

    @OriginalMember(owner = "client!cea", name = "s", descriptor = "(B)V", line = 75)
    public static final void method1312(byte arg0) {
        ++field2934;
        if (class418.field5721 == null || class166.field2582 == null) {
            class166.field2582 = new int[256];
            class418.field5721 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class418.field5721[var1] = (int) (Math.sin(var2) * 4096.0D);
                class166.field2582[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 100) {
            method1312((byte) -16);
        }
    }

    @OriginalMember(owner = "client!cea", name = "t", descriptor = "(B)V", line = 106)
    public static void method1313(byte arg0) {
        field2935 = null;
        field2923 = null;
        field2926 = null;
        if (arg0 < 74) {
            method1317((byte) 5, (String) null);
        }
    }

    @OriginalMember(owner = "client!cea", name = "w", descriptor = "(I)I", line = 118)
    public final int method1314(int arg0) {
        if (arg0 > -79) {
            return 73;
        } else {
            ++field2924;
            int var2 = 255 & super.field4600[super.field4619++] - this.field2942.method2180((byte) -48);
            return var2 < 128 ? var2 : (var2 + -128 << 8) - -(super.field4600[super.field4619++] + -this.field2942.method2180((byte) -51) & 255);
        }
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(IB)I", line = 137)
    public final int method1315(int arg0, byte arg1) {
        if (arg1 < 15) {
            this.method1310(-122, 33);
        }
        ++field2933;
        return arg0 * 8 + -this.field2940;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(BI[BI)V", line = 151)
    public final void method1316(byte arg0, int arg1, byte[] arg2, int arg3) {
        ++field2927;
        int var5 = 0;
        if (arg0 < -114) {
            while (var5 < arg1) {
                arg2[arg3 + var5] = (byte) (super.field4600[super.field4619++] + -this.field2942.method2180((byte) -113));
                ++var5;
            }
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(BLjava/lang/String;)V", line = 169)
    public static final void method1317(byte arg0, String arg1) {
        ++field2932;
        System.out.println("Error: " + class608.method3339("%0a", arg1, "\n", (byte) -56));
        if (arg0 != -118) {
            field2935 = null;
        }
    }

    @OriginalMember(owner = "client!cea", name = "p", descriptor = "(II)I", line = 186)
    public final int method1318(int arg0, int arg1) {
        ++field2939;
        int var3 = this.field2940 >> 3;
        int var4 = -(7 & this.field2940) + 8;
        int var5 = 0;
        int var6 = -114 / ((arg0 - 51) / 46);
        this.field2940 += arg1;
        while (arg1 > var4) {
            var5 += (class228.field3202[var4] & super.field4600[var3++]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var7;
        if (arg1 == var4) {
            var7 = (class228.field3202[var4] & super.field4600[var3]) + var5;
        } else {
            var7 = (super.field4600[var3] >> var4 - arg1 & class228.field3202[arg1]) + var5;
        }
        return var7;
    }

    @OriginalMember(owner = "client!cea", name = "x", descriptor = "(I)V", line = 215)
    public static final void method1319(int arg0) {
        ++field2938;
        if (class394.field5189 != null) {
            class394.field5189.method1460(0);
        }
        if (class107.field1579 != null) {
            class107.field1579.method1460(0);
        }
        if (arg0 != -1378671193) {
            method1313((byte) 3);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(Ltb;Z)V", line = 232)
    public final void method1320(class371 arg0, boolean arg1) {
        this.field2942 = arg0;
        ++field2928;
        if (!arg1) {
            this.method1320((class371) null, true);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[I)V", line = 251)
    public final void method1321(int arg0, int[] arg1) {
        this.field2942 = new class371(arg1);
        ++field2937;
        if (arg0 >= -50) {
            field2926 = null;
        }
    }
}
