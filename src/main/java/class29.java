import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class29 extends class694 {

    @OriginalMember(owner = "client!mca", name = "F", descriptor = "I")
    private int field351 = 1;

    @OriginalMember(owner = "client!mca", name = "M", descriptor = "I")
    private int field356 = 1;

    @OriginalMember(owner = "client!mca", name = "N", descriptor = "I")
    private int field357 = 204;

    @OriginalMember(owner = "client!mca", name = "O", descriptor = "Lfc;")
    public static class235 field358 = new class235(8, -2);

    @OriginalMember(owner = "client!mca", name = "Q", descriptor = "[I")
    public static int[] field360 = new int[4096];

    @OriginalMember(owner = "client!mca", name = "H", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!mca", name = "J", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!mca", name = "K", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!mca", name = "L", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!mca", name = "P", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)V")
    public static void method132(byte arg0) {
        field358 = null;
        field360 = null;
        if (arg0 >= -72) {
            method132((byte) -99);
        }
    }

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "(III)Z")
    public static final boolean method133(int arg0, int arg1, int arg2) {
        ++field352;
        int var3 = -54 / ((arg2 - -42) / 34);
        boolean var4 = ~(55 & arg0) != -1 ? class183.method1233(arg1, 8192, arg0) : class564.method3121(-1, arg0, arg1);
        return ~(65536 & arg1) != -1 | class138.method977(arg0, 544, arg1) | var4;
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        int var4 = -81 % ((arg2 - 58) / 63);
        ++field353;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field357 = arg1.method743((byte) -89);
                }
            } else {
                this.field351 = arg1.method718(-83);
            }
        } else {
            this.field356 = arg1.method718(-111);
        }
    }

    @OriginalMember(owner = "client!mca", name = "<init>", descriptor = "()V")
    public class29() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        if (arg0 < 112) {
            return null;
        } else {
            ++field354;
            int[] var3 = super.field9751.method2712(arg1, (byte) 118);
            if (super.field9751.field6674) {
                for (int var4 = 0; class465.field6544 > var4; ++var4) {
                    int var5 = class346.field4994[var4];
                    int var6 = class105.field1409[arg1];
                    int var7 = this.field356 * var5 >> 12;
                    int var8 = this.field351 * var6 >> 12;
                    int var9 = var5 % (4096 / this.field356) * this.field356;
                    int var10 = var6 % (4096 / this.field351) * this.field351;
                    if (var10 < this.field357) {
                        for (var7 -= var8; ~var7 > -1; var7 += 4) {
                        }
                        while (var7 > 3) {
                            var7 -= 4;
                        }
                        if (var7 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var9 > ~this.field357) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~var9 > ~this.field357) {
                        int var11;
                        for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIIIII)I")
    public static final int method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((1 & arg0) == 1) {
            int var7 = arg5;
            arg5 = arg1;
            arg1 = var7;
        }
        int var8 = arg3 & 3;
        ++field355;
        if (~var8 == -1) {
            return arg6;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return -arg5 - -1 + -arg6 + 7;
        } else {
            return arg2 <= 48 ? 116 : -arg1 + 1 + -arg4 + 7;
        }
    }
}
