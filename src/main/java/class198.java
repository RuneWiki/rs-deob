import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class198 extends class135 {

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    private int field3509 = 1;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    private int field3513 = 1;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    private int field3508 = 204;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Lqj;")
    public static class196 field3506 = class80.method502("Verbindung abgebrochen)3", -48);

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lqj;")
    public static class196 field3510 = class80.method502("Gegenstand f-Ur Mitglieder", -48);

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "[Lqj;")
    public static class196[] field3511 = new class196[100];

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lah;")
    public static class22 field3515 = new class22(50);

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "Lrj;")
    public static class247 field3517 = new class247(0, 0);

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field3519 = 0;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "Lea;")
    public static class243 field3518 = new class243();

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "[[S")
    public static short[][] field3520 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "[Lp;")
    public static class56[] field3522 = new class56[2048];

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "Lbk;")
    public static class136 field3521;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lnb;")
    public static class95 field3512;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        ++field3516;
        int[] var3 = super.field1954.method110(arg0, 49);
        if (arg1) {
            return null;
        } else {
            if (super.field1954.field244) {
                for (int var4 = 0; ~class131.field1862 < ~var4; ++var4) {
                    int var5 = class82.field1189[var4];
                    int var6 = this.field3513 * var5 >> 12;
                    int var7 = class123.field1756[arg0];
                    int var8 = var7 % (4096 / this.field3509) * this.field3509;
                    int var9 = this.field3509 * var7 >> 12;
                    int var10 = var5 % (4096 / this.field3513) * this.field3513;
                    if (~var8 > ~this.field3508) {
                        for (var6 -= var9; var6 < 0; var6 += 4) {
                        }
                        while (~var6 < -4) {
                            var6 -= 4;
                        }
                        if (~var6 != -2) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (var10 < this.field3508) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (var10 < this.field3508) {
                        int var11;
                        for (var11 = var6 - var9; ~var11 > -1; var11 += 4) {
                        }
                        while (~var11 < -4) {
                            var11 -= 4;
                        }
                        if (~var11 < -1) {
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

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class198() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V")
    public static void method1342(byte arg0) {
        field3515 = null;
        field3517 = null;
        field3512 = null;
        field3518 = null;
        field3511 = null;
        field3522 = null;
        field3520 = null;
        field3521 = null;
        field3510 = null;
        field3506 = null;
        if (arg0 != -91) {
            method1342((byte) -103);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lp;II)V")
    public final void method97(class56 arg0, int arg1, int arg2) {
        if (arg2 == -16231) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field3508 = arg0.method318(true);
                    }
                } else {
                    this.field3509 = arg0.method367(1);
                }
            } else {
                this.field3513 = arg0.method367(1);
            }
            ++field3514;
        }
    }
}
