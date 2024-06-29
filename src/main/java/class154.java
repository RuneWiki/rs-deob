import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class154 extends class145 {

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public int field3515 = 0;

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Z")
    public boolean field3516 = true;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "I")
    public int field3521 = -1;

    @OriginalMember(owner = "client!wd", name = "sb", descriptor = "I")
    public int field3534 = -1;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "I")
    public static volatile int field3520 = 0;

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "I")
    public static int field3522 = 0;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "[Lbe;")
    public static class13[] field3518 = new class13[2048];

    @OriginalMember(owner = "client!wd", name = "nb", descriptor = "Z")
    public static boolean field3529 = false;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "[Z")
    public static boolean[] field3511 = new boolean[100];

    @OriginalMember(owner = "client!wd", name = "ob", descriptor = "I")
    public static int field3530 = 0;

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "Ltd;")
    public static class136 field3527 = class145.method1172("blinken2:", 45);

    @OriginalMember(owner = "client!wd", name = "mb", descriptor = "Ltd;")
    private static class136 field3528 = class145.method1172("Username: ", 45);

    @OriginalMember(owner = "client!wd", name = "tb", descriptor = "[I")
    public static int[] field3535 = new int[100];

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Ltd;")
    public static class136 field3512 = field3528;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "I")
    public int field3524;

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "I")
    public int field3526;

    @OriginalMember(owner = "client!wd", name = "pb", descriptor = "I")
    public int field3531;

    @OriginalMember(owner = "client!wd", name = "qb", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!wd", name = "rb", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "[Lnb;")
    public static class92[] field3514;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
    private final void method1203(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        field3533++;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = var5;
        double var9 = 0.0D;
        if (var3 < var5) {
            var7 = var3;
        }
        double var11 = 0.0D;
        double var13 = (double) (arg1 & 0xFF) / 256.0D;
        double var15 = var5;
        if (var13 < var7) {
            var7 = var13;
        }
        if (var5 < var3) {
            var15 = var3;
        }
        if (var13 > var15) {
            var15 = var13;
        }
        double var17 = (var7 + var15) / 2.0D;
        this.field3510 = (int) (var17 * 256.0D);
        if (arg0 < ~this.field3510) {
            this.field3510 = 0;
        } else if (this.field3510 > 255) {
            this.field3510 = 255;
        }
        if (var7 != var15) {
            if (var5 == var15) {
                var9 = (var3 - var13) / (var15 - var7);
            } else if (var3 == var15) {
                var9 = (var13 - var5) / (-var7 + var15) + 2.0D;
            } else if (var13 == var15) {
                var9 = (var5 - var3) / (-var7 + var15) + 4.0D;
            }
            if (var17 < 0.5D) {
                var11 = (var15 - var7) / (var7 + var15);
            }
            if (var17 >= 0.5D) {
                var11 = (var15 - var7) / (2.0D - var15 - var7);
            }
        }
        double var19 = var9 / 6.0D;
        this.field3526 = (int) (var11 * 256.0D);
        this.field3531 = (int) (var19 * 256.0D);
        if (this.field3526 < 0) {
            this.field3526 = 0;
        } else if (this.field3526 > 255) {
            this.field3526 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
    public final void method1204(byte arg0) {
        field3532++;
        if (this.field3521 != -1) {
            this.method1203(-1, this.field3521);
            this.field3517 = this.field3510;
            this.field3524 = this.field3526;
            this.field3513 = this.field3531;
        }
        this.method1203(-1, this.field3515);
        int var2 = 125 % ((56 - arg0) / 56);
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method1205(int arg0) {
        field3512 = null;
        if (arg0 < 19) {
            method1205(-21);
        }
        field3514 = null;
        field3528 = null;
        field3511 = null;
        field3527 = null;
        field3535 = null;
        field3518 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lsb;III)V")
    private final void method1206(class127 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field3515 = arg0.method1022(-122);
        } else if (arg2 == 2) {
            this.field3534 = arg0.method1011(76);
        } else if (arg2 == 5) {
            this.field3516 = false;
        } else if (arg2 == 7) {
            this.field3521 = arg0.method1022(18);
        }
        field3519++;
        if (arg3 != 0) {
            this.method1204((byte) -36);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)I")
    public static int method1207(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lsb;IB)V")
    public final void method1208(class127 arg0, int arg1, byte arg2) {
        while (true) {
            int var4 = arg0.method1011(17);
            if (var4 == 0) {
                if (arg2 != -50) {
                    this.method1208(null, 125, (byte) 10);
                }
                field3525++;
                return;
            }
            this.method1206(arg0, arg1, var4, 0);
        }
    }
}
