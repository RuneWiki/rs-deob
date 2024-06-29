import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class222 extends class214 {

    @OriginalMember(owner = "client!ki", name = "E", descriptor = "I")
    private int field3606 = 20;

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    private int field3607 = 0;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    private int field3610 = 1365;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    private int field3611 = 0;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "[I")
    public static int[] field3615 = new int[4];

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "Laia;")
    public static class257 field3608 = new class257("WTWIP", "office", "_wip", 3);

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!ki", name = "D", descriptor = "[Ljg;")
    public static class243[] field3605;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
    public static final void method1574(boolean arg0) {
        ++field3614;
        if (!arg0) {
            field3605 = null;
        }
        class325.field4803.method3517(-85);
        class448.field6531.method3517(-120);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V")
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 > 92) {
            if (arg2 != 0) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 == 3) {
                            this.field3607 = arg1.method1989((byte) -96);
                        }
                    } else {
                        this.field3611 = arg1.method1989((byte) -60);
                    }
                } else {
                    this.field3606 = arg1.method1989((byte) -127);
                }
            } else {
                this.field3610 = arg1.method1989((byte) -39);
            }
            ++field3612;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(B)V")
    public static void method1575(byte arg0) {
        field3608 = null;
        field3615 = null;
        field3605 = null;
        int var1 = -9 / ((24 - arg0) / 35);
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V")
    public static final void method1576(int arg0) {
        class645.method3638();
        ++field3613;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class247.field3958[var1].method1650((byte) 103);
        }
        class175.method1375(false);
        int var2 = 56 % ((arg0 - -34) / 45);
        class127.method975((byte) -105);
        class642.method3624((byte) -83);
        System.gc();
        class364.field5573.method1287();
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field3609;
        int[] var3 = super.field3544.method3869(arg0, arg1 ^ -122);
        if (arg1 != 5) {
            method1575((byte) -70);
        }
        if (super.field3544.field9836) {
            for (int var4 = 0; var4 < class626.field8787; ++var4) {
                int var5 = (class592.field8328[var4] << 12) / this.field3610 + this.field3611;
                int var6 = (class131.field2138[arg0] << 12) / this.field3610 - -this.field3607;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~var13 > ~this.field3606) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var12 + var7 + var11;
                    var11 = var9 * var9 >> 12;
                    ++var13;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field3606 + -1 <= var13 ? 0 : (var13 << 12) / this.field3606;
            }
        }
        return var3;
    }
}
