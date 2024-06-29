import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class189 {

    @OriginalMember(owner = "client!bb", name = "lb", descriptor = "I")
    private int field302 = 4096;

    @OriginalMember(owner = "client!bb", name = "nb", descriptor = "I")
    private int field304 = 4096;

    @OriginalMember(owner = "client!bb", name = "wb", descriptor = "I")
    private int field313 = 4096;

    @OriginalMember(owner = "client!bb", name = "kb", descriptor = "Lgg;")
    public static class63 field301 = class116.method911(43, "(U2");

    @OriginalMember(owner = "client!bb", name = "ib", descriptor = "I")
    public static int field299 = 0;

    @OriginalMember(owner = "client!bb", name = "rb", descriptor = "Lgg;")
    public static class63 field308 = class116.method911(43, "hel");

    @OriginalMember(owner = "client!bb", name = "gb", descriptor = "[S")
    public static short[] field297 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bb", name = "pb", descriptor = "Lgg;")
    public static class63 field306 = class116.method911(43, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!bb", name = "xb", descriptor = "I")
    public static volatile int field314 = -1;

    @OriginalMember(owner = "client!bb", name = "tb", descriptor = "I")
    public static int field310 = 7759444;

    @OriginalMember(owner = "client!bb", name = "sb", descriptor = "Lgg;")
    private static class63 field309 = class116.method911(43, "Existing User");

    @OriginalMember(owner = "client!bb", name = "mb", descriptor = "Lgg;")
    public static class63 field303 = field309;

    @OriginalMember(owner = "client!bb", name = "hb", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!bb", name = "ob", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bb", name = "ub", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bb", name = "vb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bb", name = "yb", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bb", name = "Ab", descriptor = "Lfd;")
    public static class52 field317;

    @OriginalMember(owner = "client!bb", name = "qb", descriptor = "Lff;")
    public static class54 field307;

    @OriginalMember(owner = "client!bb", name = "zb", descriptor = "[[Z")
    public static boolean[][] field316;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)V")
    public static void method153(int arg0) {
        field308 = null;
        field307 = null;
        field297 = null;
        field317 = null;
        field309 = null;
        field303 = null;
        field306 = null;
        if (arg0 != 0) {
            field317 = null;
        }
        field301 = null;
        field316 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field315;
        if (arg1 >= 32) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (~arg0 == -3) {
                        this.field313 = arg2.method46((byte) 65);
                    }
                } else {
                    this.field302 = arg2.method46((byte) 65);
                }
            } else {
                this.field304 = arg2.method46((byte) 65);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static final void method154(byte arg0) {
        ++field300;
        if (~class78.field1888 < -1) {
            class14.method164((byte) 0);
        } else {
            class121.method931(40, 1);
            field317 = class171.field3553;
            class171.field3553 = null;
            if (arg0 > -38) {
                method154((byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[S[Lgg;B)V")
    public static final void method155(int arg0, int arg1, short[] arg2, class63[] arg3, byte arg4) {
        if (arg0 > arg1) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            class63 var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            for (int var9 = arg1; arg0 > var9; ++var9) {
                if (var7 == null || arg3[var9] != null && ~(var9 & 1) < ~arg3[var9].method605(-11, var7)) {
                    class63 var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method155(var6 + -1, arg1, arg2, arg3, (byte) 103);
            method155(arg0, var6 + 1, arg2, arg3, (byte) 102);
        }
        ++field305;
        int var12 = -48 / ((-24 - arg4) / 44);
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        int[][] var3 = super.field3808.method237(-1, arg0);
        if (super.field3808.field561) {
            int[][] var4 = this.method1244((byte) 20, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; class54.field1430 > var11; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (~var12 == ~var14 && ~var13 == ~var14) {
                    var8[var11] = this.field304 * var12 >> 12;
                    var10[var11] = this.field302 * var14 >> 12;
                    var9[var11] = this.field313 * var13 >> 12;
                } else {
                    var8[var11] = this.field304;
                    var10[var11] = this.field302;
                    var9[var11] = this.field313;
                }
            }
        }
        ++field312;
        return arg1 < 34 ? null : var3;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class13() {
        super(1, false);
    }
}
