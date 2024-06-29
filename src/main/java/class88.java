import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class88 extends class64 {

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field1603 = 0;

    @OriginalMember(owner = "client!jg", name = "kb", descriptor = "Lsg;")
    public static class169 field1611 = class165.method1060("W-=hlen Sie eine Option", 1536);

    @OriginalMember(owner = "client!jg", name = "hb", descriptor = "Lsg;")
    public static class169 field1608 = class165.method1060("scrollbar", 1536);

    @OriginalMember(owner = "client!jg", name = "lb", descriptor = "Lsg;")
    public static class169 field1612 = class165.method1060("oberen Rand der Webseite ausw-=hlen)3", 1536);

    @OriginalMember(owner = "client!jg", name = "fb", descriptor = "[I")
    public static int[] field1606 = new int[] { 4, 58, 46, 28, 34, 45, 49, 42 };

    @OriginalMember(owner = "client!jg", name = "gb", descriptor = "Lsg;")
    public static class169 field1607 = class165.method1060("Ladevorgang )2 bitte warten Sie)3", 1536);

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!jg", name = "ib", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!jg", name = "mb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jg", name = "nb", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!jg", name = "ob", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!jg", name = "jb", descriptor = "Lke;")
    public static class95 field1610;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIII)I")
    public static final int method519(int arg0, int arg1, int arg2, int arg3) {
        ++field1604;
        if (~(8 & class159.field3040[arg0][arg3][arg2]) != -1) {
            return 0;
        } else if (~arg0 < -1 && (2 & class159.field3040[1][arg3][arg2]) != 0) {
            return arg0 - 1;
        } else {
            if (arg1 <= 90) {
                field1612 = null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(IB)I")
    public static final int method520(int arg0, byte arg1) {
        ++field1614;
        int var2 = arg0 * 6 + -61440;
        int var3 = (arg0 * arg0 >> 12) * arg0 >> 12;
        if (arg1 != -69) {
            method522((byte) 33);
        }
        int var4 = (arg0 * var2 >> 12) + 40960;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (arg2 == 0) {
            super.field1183 = arg1.method819((byte) 22) == 1;
        }
        ++field1609;
        int var4 = 41 / ((arg0 - -60) / 36);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field1615;
        if (arg0 != -40) {
            field1612 = null;
        }
        int[][] var3 = super.field1195.method177(1193, arg1);
        int[] var4 = var3[2];
        int[] var5 = var3[0];
        int[] var6 = var3[1];
        if (super.field1195.field532) {
            for (int var7 = 0; ~var7 > ~class147.field2715; ++var7) {
                this.method521(arg1, var7, true);
                int[][] var8 = this.method402(false, class13.field311, 0);
                var5[var7] = var8[0][class134.field2518];
                var6[var7] = var8[1][class134.field2518];
                var4[var7] = var8[2][class134.field2518];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIZ)V")
    private final void method521(int arg0, int arg1, boolean arg2) {
        ++field1602;
        int var4 = class185.field3607[arg1];
        int var5 = class189.field3699[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class134.field2518 = arg1;
            class13.field311 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class134.field2518 = arg0;
            class13.field311 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class13.field311 = arg1;
            class134.field2518 = class147.field2715 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class134.field2518 = arg1;
            class13.field311 = -arg0 + class103.field1895;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class13.field311 = -arg0 + class103.field1895;
            class134.field2518 = -arg1 + class147.field2715;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class13.field311 = -arg1 + class103.field1895;
            class134.field2518 = class147.field2715 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class13.field311 = -arg1 + class103.field1895;
            class134.field2518 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class13.field311 = arg0;
            class134.field2518 = -arg1 + class147.field2715;
        }
        class134.field2518 &= class8.field217;
        class13.field311 &= class89.field1616;
        if (!arg2) {
            field1610 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class88() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field1613;
        if (arg1 != 19) {
            this.method521(108, 87, true);
        }
        int[] var3 = super.field1192.method19((byte) 124, arg0);
        if (super.field1192.field75) {
            for (int var4 = 0; var4 < class147.field2715; ++var4) {
                this.method521(arg0, var4, true);
                int[] var5 = this.method394(arg1 + 20312, 0, class13.field311);
                var3[var4] = var5[class134.field2518];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        field1610 = null;
        field1612 = null;
        field1607 = null;
        field1611 = null;
        field1606 = null;
        if (arg0 == -58) {
            field1608 = null;
        }
    }
}
