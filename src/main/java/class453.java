import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class453 extends class323 {

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "[I")
    private int[] field6515 = new int[this.field4489];

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "I")
    public static int field6522 = 0;

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    private int field6516;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    private int field6519;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!vq", name = "E", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "Lpn;")
    public static class295 field6518;

    @OriginalMember(owner = "client!vq", name = "D", descriptor = "[B")
    private byte[] field6526;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "[[S")
    public static short[][] field6524;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lufa;I)V", line = 3)
    public static final void method2634(class141 arg0, int arg1) {
        ++field6521;
        if (arg1 != 494) {
            field6525 = 103;
        }
        if (arg0 instanceof class88) {
            class88 var2 = (class88) arg0;
            if (var2.field1309 != null) {
                class21.method212(class103.field1708.field3158 != var2.field3158, var2, -63);
                return;
            }
        } else {
            if (!(arg0 instanceof class270)) {
                return;
            }
            class270 var3 = (class270) arg0;
            class392.method2381(var3, -64, ~class103.field1708.field3158 != ~var3.field3158);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIB)V", line = 31)
    public final void method1930(int arg0, int arg1, byte arg2) {
        ++field6523;
        this.field6516 += this.field6515[arg1] * arg0 >> 12;
        if (arg2 != -43) {
            field6524 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(Z)V", line = 43)
    public static void method2635(boolean arg0) {
        field6524 = null;
        if (arg0) {
            field6525 = -79;
        }
        field6518 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBI)V", line = 55)
    public void method1674(int arg0, byte arg1, int arg2) {
        if (arg0 == 21395) {
            this.field6526[this.field6519++] = (byte) (class248.method1593(127, arg1 >> 1) + 127);
            ++field6513;
        }
    }

    @OriginalMember(owner = "client!vq", name = "<init>", descriptor = "(IIIIIF)V", line = 66)
    public class453(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field4489 < ~var7; ++var7) {
            this.field6515[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 85)
    public final void method1931(int arg0) {
        this.field6516 = Math.abs(this.field6516);
        ++field6520;
        if (~this.field6516 <= -4097) {
            this.field6516 = 4095;
        }
        this.method1674(21395, (byte) (this.field6516 >> 4), this.field6519++);
        this.field6516 = 0;
        if (arg0 < 80) {
            field6522 = -24;
        }
    }

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)V", line = 117)
    public final void method1937(int arg0) {
        ++field6514;
        this.field6516 = 0;
        int var2 = -77 % ((-33 - arg0) / 43);
        this.field6519 = 0;
    }
}
