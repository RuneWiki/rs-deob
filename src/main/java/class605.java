import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class605 extends class750 {

    @OriginalMember(owner = "client!iu", name = "o", descriptor = "[I")
    private int[] field8446 = new int[this.field10348];

    @OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
    public static int field8447 = -1;

    @OriginalMember(owner = "client!iu", name = "m", descriptor = "I")
    public static int field8444;

    @OriginalMember(owner = "client!iu", name = "n", descriptor = "I")
    public static int field8445;

    @OriginalMember(owner = "client!iu", name = "q", descriptor = "I")
    public static int field8448;

    @OriginalMember(owner = "client!iu", name = "s", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
    private int field8451;

    @OriginalMember(owner = "client!iu", name = "u", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!iu", name = "v", descriptor = "I")
    private int field8453;

    @OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
    public static int field8454;

    @OriginalMember(owner = "client!iu", name = "r", descriptor = "[B")
    private byte[] field8449;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "(B)I", line = 12)
    public static final int method3435(byte arg0) {
        ++field8450;
        if (class278.field3847 == 1) {
            return class361.field4925;
        } else {
            if (arg0 != -98) {
                method3435((byte) 55);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IIIIIF)V", line = 27)
    public class605(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~super.field10348 < ~var7; ++var7) {
            this.field8446[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V", line = 44)
    public final void method3436(boolean arg0) {
        if (!arg0) {
            this.method3437(-26, 118, (byte) 19);
        }
        this.field8453 = 0;
        ++field8445;
        this.field8451 = 0;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIB)V", line = 60)
    public final void method3437(int arg0, int arg1, byte arg2) {
        if (arg2 == 58) {
            ++field8454;
            this.field8451 += this.field8446[arg0] * arg1 >> 12;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BIB)V", line = 76)
    public void method152(byte arg0, int arg1, byte arg2) {
        if (arg0 == 69) {
            this.field8449[this.field8453++] = (byte) (127 + (class204.method1456(255, arg2) >> 1));
            ++field8444;
        }
    }

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "(Z)V", line = 88)
    public final void method3438(boolean arg0) {
        this.field8451 = Math.abs(this.field8451);
        ++field8448;
        if (~this.field8451 <= -4097) {
            this.field8451 = 4095;
        }
        this.method152((byte) 69, this.field8453++, (byte) (this.field8451 >> 4));
        this.field8451 = 0;
        if (!arg0) {
            field8447 = 18;
        }
    }
}
