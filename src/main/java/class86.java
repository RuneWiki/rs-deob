import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class86 extends class51 {

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    private int field1677 = 4096;

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    private int field1675 = 4096;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "I")
    private int field1680 = 409;

    @OriginalMember(owner = "client!jd", name = "jb", descriptor = "[I")
    private int[] field1683 = new int[3];

    @OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
    private int field1684 = 4096;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Lbf;")
    public static class17 field1674 = new class17(512);

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "Ltd;")
    public static class176 field1678 = new class176(50);

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "Led;")
    public static class43 field1681 = class191.method1219("mn", false);

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!jd", name = "ib", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!jd", name = "lb", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(IBI)I")
    public static final int method518(int arg0, byte arg1, int arg2) {
        if (arg1 >= -67) {
            field1681 = null;
        }
        ++field1685;
        long var3 = (long) ((arg0 << 16) - -arg2);
        return class69.field1377 != null && ~class69.field1377.field1353 == ~var3 ? class68.field1359.field1727 * 99 / (class68.field1359.field1769.length + -class69.field1377.field2953) + 1 : 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method99(int arg0, byte arg1) {
        int[][] var3 = super.field1027.method1087(arg0, -2);
        if (super.field1027.field3428) {
            int[][] var4 = this.method306(arg1 + 94, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~class122.field2442 < ~var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var12 - this.field1683[0];
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field1680) {
                    var8[var11] = var12;
                    var10[var11] = var5[var11];
                    var9[var11] = var7[var11];
                } else {
                    int var14 = var5[var11];
                    int var15 = -this.field1683[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~this.field1680 > ~var15) {
                        var8[var11] = var12;
                        var10[var11] = var14;
                        var9[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field1683[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field1680) {
                            var8[var11] = var12;
                            var10[var11] = var14;
                            var9[var11] = var16;
                        } else {
                            var8[var11] = this.field1675 * var12 >> 12;
                            var10[var11] = this.field1684 * var14 >> 12;
                            var9[var11] = this.field1677 * var16 >> 12;
                        }
                    }
                }
            }
        }
        ++field1673;
        return arg1 != -94 ? null : var3;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public static final void method519(int arg0) {
        class136.field2825.method51(106);
        if (arg0 != 8223) {
            method519(-89);
        }
        for (int var1 = 0; var1 < 32; ++var1) {
            class137.field2840[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class59.field1224[var2] = 0L;
        }
        class98.field1900 = 0;
        ++field1676;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method565(3);
                            this.field1683[1] = class7.method38(65280, var5) >> 4;
                            this.field1683[2] = class7.method38(var5, 255) >> 12;
                            this.field1683[0] = class7.method38(267386880, var5 << 4);
                        }
                    } else {
                        this.field1675 = arg0.method555(-1113627096);
                    }
                } else {
                    this.field1684 = arg0.method555(-1113627096);
                }
            } else {
                this.field1677 = arg0.method555(-1113627096);
            }
        } else {
            this.field1680 = arg0.method555(-1113627096);
        }
        if (arg1 != 0) {
            this.field1683 = null;
        }
        ++field1682;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public static void method520(int arg0) {
        field1681 = null;
        field1674 = null;
        if (arg0 != 0) {
            method520(-22);
        }
        field1678 = null;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class86() {
        super(1, false);
    }
}
