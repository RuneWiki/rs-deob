import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class156 extends class64 {

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "I")
    private int field2987 = 32768;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "Lsg;")
    public static class169 field2989 = class165.method1060("<col=ffffff>", 1536);

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "[I")
    public static int[] field2995 = new int[] { 0, 12, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 5, -2, 5, 0, 0, 0, 0, -2, 14, 0, 0, 0, 4, 0, 0, 7, 0, 0, 0, -2, 0, 0, 0, 8, 0, 0, 0, 0, 11, 2, 0, 0, 4, 0, 0, 5, 7, 0, 0, 0, 0, 0, 1, 0, 0, -2, 0, 0, 1, 1, -2, 0, 0, 0, 0, 0, 4, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 6, 0, 0, 6, 0, 0, -1, 0, -1, 6, 4, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 7, 0, 11, 15, 0, 0, 0, 0, 0, -2, 0, 0, 3, 2, 3, 0, 20, 6, 0, 0, 0, 2, 0, 0, 0, 24, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -2, 3, -2, 0, 6, 0, -2, 6, 0, 0, 4, 4, 0, 0, 6, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 2, 0, 6, 10, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, 0, 0, 5, 6, 0, 2, 0, 5, -2, 0, 0, -2, 0, 2, 0 };

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "Lsg;")
    private static class169 field2996 = class165.method1060("Login limit exceeded)3", 1536);

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "Lsg;")
    public static class169 field3001 = field2996;

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lsg;")
    private static class169 field3002 = class165.method1060("Please enter your password)3", 1536);

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "Lsg;")
    public static class169 field3000 = class165.method1060("Untersuchen", 1536);

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "Lsg;")
    public static class169 field3003 = class165.method1060("Art", 1536);

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "Lsg;")
    public static class169 field2999 = field3002;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method59(byte arg0, int arg1) {
        ++field2997;
        if (arg0 != -40) {
            field3002 = null;
        }
        int[][] var3 = super.field1195.method177(1193, arg1);
        if (super.field1195.field532) {
            int[] var4 = this.method394(20331, 1, arg1);
            int[] var5 = this.method394(20331, 2, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~var9 > ~class147.field2715; ++var9) {
                int var10 = (var4[var9] * 255 & 1047165) >> 12;
                int var11 = var5[var9] * this.field2987 >> 12;
                int var12 = class125.field2292[var10] * var11 >> 12;
                int var13 = class148.field2719[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class8.field217;
                int var15 = class89.field1616 & (var13 >> 12) + arg1;
                int[][] var16 = this.method402(false, var15, 0);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1183 = arg1.method819((byte) 22) == 1;
            }
        } else {
            this.field2987 = arg1.method785(true) << 4;
        }
        ++field2990;
        int var5 = 62 % ((-60 - arg0) / 36);
    }

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field2999 = null;
        field3002 = null;
        field3001 = null;
        field3000 = null;
        if (arg0 <= 70) {
            method1013(19);
        }
        field2995 = null;
        field3003 = null;
        field2996 = null;
        field2989 = null;
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (arg0) {
            field2995 = null;
        }
        ++field2991;
        class145.method956((byte) -10);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        ++field2994;
        if (arg1 != 19) {
            return null;
        } else {
            int[] var3 = super.field1192.method19((byte) 126, arg0);
            if (super.field1192.field75) {
                int[] var4 = this.method394(20331, 1, arg0);
                int[] var5 = this.method394(20331, 2, arg0);
                for (int var6 = 0; var6 < class147.field2715; ++var6) {
                    int var7 = (var4[var6] & 4094) >> 4;
                    int var8 = var5[var6] * this.field2987 >> 12;
                    int var9 = class125.field2292[var7] * var8 >> 12;
                    int var10 = class148.field2719[var7] * var8 >> 12;
                    int var11 = class8.field217 & (var9 >> 12) + var6;
                    int var12 = arg0 - -(var10 >> 12) & class89.field1616;
                    int[] var13 = this.method394(20331, 0, var12);
                    var3[var6] = var13[var11];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lke;I)V")
    public static final void method1014(class95 arg0, int arg1) {
        if (arg1 == 7) {
            ++field2998;
            class115.field2105 = arg0;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class156() {
        super(3, false);
    }
}
