import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class107 extends class488 {

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "[I")
    private int[] field1335 = new int[this.field7388];

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "I")
    private int field1338;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    private int field1339;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "[B")
    private byte[] field1337;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V", line = 4)
    public final void method205(byte arg0) {
        if (arg0 == 2) {
            ++field1342;
            this.field1338 = 0;
            this.field1339 = 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIF)V", line = 18)
    public class107(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field7388 > var7; ++var7) {
            this.field1335[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V", line = 35)
    public final void method202(int arg0) {
        this.field1338 = Math.abs(this.field1338);
        ++field1341;
        if (arg0 >= 10) {
            if (~this.field1338 <= -4097) {
                this.field1338 = 4095;
            }
            this.method630((byte) (this.field1338 >> 4), true, this.field1339++);
            this.field1338 = 0;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 53)
    public final void method203(int arg0, int arg1, int arg2) {
        int var4 = -28 / ((arg1 - -46) / 57);
        this.field1338 += this.field1335[arg0] * arg2 >> 12;
        ++field1336;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BZI)V", line = 66)
    public void method630(byte arg0, boolean arg1, int arg2) {
        ++field1340;
        if (!arg1) {
            this.field1337 = null;
        }
        this.field1337[this.field1339++] = (byte) (127 + class637.method3693(127, arg0 >> 1));
    }
}
