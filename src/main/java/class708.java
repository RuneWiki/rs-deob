import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class708 {

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public int field9678 = 0;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public int field9679 = 0;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "Z")
    private boolean field9686 = false;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "[S")
    private static short[] field9674 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "[S")
    private static short[] field9672 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[S")
    private static short[] field9685 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "[S")
    private static short[] field9692 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "[[S")
    public static short[][] field9675 = new short[][] { field9685, field9692, field9672, field9674 };

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public int field9677;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public int field9680;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
    public int field9681;

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public int field9682;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "I")
    public int field9683;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
    public int field9684;

    @OriginalMember(owner = "client!qf", name = "r", descriptor = "I")
    public int field9687;

    @OriginalMember(owner = "client!qf", name = "s", descriptor = "I")
    public int field9688;

    @OriginalMember(owner = "client!qf", name = "t", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "I")
    public int field9690;

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    private int field9693;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "J")
    public long field9673;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "[I")
    public static int[] field9676;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V", line = 4)
    public static void method3932(int arg0) {
        field9672 = null;
        field9675 = null;
        field9676 = null;
        field9685 = null;
        if (arg0 != 11209) {
            method3932(74);
        }
        field9692 = null;
        field9674 = null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ldt;B)V", line = 19)
    public final void method3933(class254 arg0, byte arg1) {
        if (arg1 != -43) {
            return;
        }
        field9689++;
        while (true) {
            int var3 = arg0.method1731((byte) 64);
            if (var3 == 0) {
                return;
            }
            this.method3934(arg0, (byte) 116, var3);
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ldt;BI)V", line = 74)
    private final void method3934(class254 arg0, byte arg1, int arg2) {
        field9671++;
        if (arg1 < 40) {
            field9676 = null;
        }
        if (arg2 == 1) {
            this.field9693 = arg0.method1728((byte) 40);
        } else if (arg2 == 2) {
            arg0.method1731((byte) 64);
        } else if (arg2 == 3) {
            this.field9682 = arg0.method1672(-16516);
            this.field9680 = arg0.method1672(-16516);
            this.field9684 = arg0.method1672(-16516);
        } else if (arg2 == 4) {
            this.field9681 = arg0.method1731((byte) 64);
            this.field9677 = arg0.method1672(-16516);
        } else if (arg2 == 6) {
            this.field9688 = arg0.method1731((byte) 64);
        } else if (arg2 == 8) {
            this.field9678 = 1;
        } else if (arg2 == 9) {
            this.field9679 = 1;
        } else if (arg2 == 10) {
            this.field9686 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 138)
    public final void method3935(int arg0) {
        field9691++;
        this.field9687 = class110.field1523[this.field9693 << 3];
        long var2 = (long) this.field9682;
        if (arg0 != 27032) {
            this.field9681 = 94;
        }
        long var4 = (long) this.field9680;
        long var6 = (long) this.field9684;
        this.field9690 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
        if (this.field9677 == 0) {
            this.field9677 = 1;
        }
        if (this.field9681 == 0) {
            this.field9673 = 2147483647L;
        } else if (this.field9681 == 1) {
            this.field9673 = (this.field9690 * 8 / this.field9677);
            this.field9673 *= this.field9673;
        } else if (this.field9681 == 2) {
            this.field9673 = (this.field9690 * 8 / this.field9677);
        }
        if (this.field9686) {
            this.field9690 *= -1;
        }
    }
}
