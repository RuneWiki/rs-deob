import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class30 extends class101 {

    @OriginalMember(owner = "client!vf", name = "Hb", descriptor = "Lrc;")
    public static class9 field442 = new class9(2);

    @OriginalMember(owner = "client!vf", name = "Ob", descriptor = "Z")
    public static boolean field449 = false;

    @OriginalMember(owner = "client!vf", name = "Sb", descriptor = "Ljava/lang/String;")
    public static String field453 = "Starting 3d Library";

    @OriginalMember(owner = "client!vf", name = "Eb", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!vf", name = "Fb", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!vf", name = "Gb", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!vf", name = "Ib", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!vf", name = "Jb", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!vf", name = "Lb", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!vf", name = "Nb", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!vf", name = "Pb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!vf", name = "Qb", descriptor = "I")
    private int field451;

    @OriginalMember(owner = "client!vf", name = "Kb", descriptor = "Lni;")
    private class291 field445;

    @OriginalMember(owner = "client!vf", name = "Rb", descriptor = "[[S")
    public static short[][] field452;

    @OriginalMember(owner = "client!vf", name = "Mb", descriptor = "[[[I")
    public static int[][][] field447;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(I)V")
    public class30(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI[B)V")
    public final void method196(int arg0, byte arg1, int arg2, byte[] arg3) {
        for (int var5 = 0; ~arg0 < ~var5; ++var5) {
            arg3[arg2 + var5] = (byte) (super.field1730[super.field1762++] + -this.field445.method1962((byte) 98));
        }
        if (arg1 < 16) {
            field442 = null;
        }
        ++field448;
    }

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "(B)V")
    public final void method197(byte arg0) {
        super.field1762 = (this.field451 + 7) / 8;
        if (arg0 >= -42) {
            this.field445 = null;
        }
        ++field439;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(IB)I")
    public final int method198(int arg0, byte arg1) {
        ++field440;
        int var3 = -(this.field451 & 7) + 8;
        int var4 = this.field451 >> 3;
        if (arg1 != 0) {
            this.method199(25, -31);
        }
        int var5 = 0;
        this.field451 += arg0;
        while (arg0 > var3) {
            var5 += (super.field1730[var4++] & class212.field3582[var3]) << -var3 + arg0;
            arg0 -= var3;
            var3 = 8;
        }
        int var6;
        if (arg0 == var3) {
            var6 = (class212.field3582[var3] & super.field1730[var4]) + var5;
        } else {
            var6 = (super.field1730[var4] >> -arg0 + var3 & class212.field3582[arg0]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "(II)V")
    public final void method199(int arg0, int arg1) {
        super.field1730[super.field1762++] = (byte) (this.field445.method1962((byte) 98) + arg0);
        int var3 = 12 / ((arg1 - 70) / 44);
        ++field450;
    }

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "(B)V")
    public final void method200(byte arg0) {
        if (arg0 < 50) {
            field442 = null;
        }
        ++field441;
        this.field451 = super.field1762 * 8;
    }

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "(II)I")
    public final int method201(int arg0, int arg1) {
        ++field446;
        if (arg1 != -22966) {
            field453 = null;
        }
        return arg0 * 8 + -this.field451;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I[I)V")
    public final void method202(int arg0, int[] arg1) {
        this.field445 = new class291(arg1);
        ++field444;
        if (arg0 != 7) {
            field453 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "(I)V")
    public static void method203(int arg0) {
        field453 = null;
        if (arg0 != -15754) {
            field453 = null;
        }
        field447 = null;
        field452 = null;
        field442 = null;
    }

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "(I)I")
    public final int method204(int arg0) {
        if (arg0 != 8) {
            this.field451 = -97;
        }
        ++field443;
        return super.field1730[super.field1762++] - this.field445.method1962((byte) 98) & 255;
    }
}
