import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class266 extends class323 {

    @OriginalMember(owner = "client!fda", name = "w", descriptor = "[I")
    private int[] field3459 = new int[this.field4099];

    @OriginalMember(owner = "client!fda", name = "B", descriptor = "[I")
    public static int[] field3464 = new int[6];

    @OriginalMember(owner = "client!fda", name = "r", descriptor = "F")
    public static float field3454;

    @OriginalMember(owner = "client!fda", name = "s", descriptor = "I")
    private int field3455;

    @OriginalMember(owner = "client!fda", name = "t", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!fda", name = "u", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!fda", name = "v", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!fda", name = "x", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!fda", name = "z", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!fda", name = "A", descriptor = "I")
    private int field3463;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "[B")
    private byte[] field3453;

    @OriginalMember(owner = "client!fda", name = "y", descriptor = "[Lha;")
    public static class52[] field3461;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(B)V", line = 5)
    public final void method1485(byte arg0) {
        this.field3455 = Math.abs(this.field3455);
        ++field3462;
        if (arg0 <= 51) {
            field3454 = -1.4116436F;
        }
        if (~this.field3455 <= -4097) {
            this.field3455 = 4095;
        }
        this.method1077((byte) (this.field3455 >> 4), (byte) 123, this.field3463++);
        this.field3455 = 0;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Z)V", line = 23)
    public static void method1486(boolean arg0) {
        field3461 = null;
        field3464 = null;
        if (arg0) {
            method1486(true);
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BII)V", line = 38)
    public final void method1487(byte arg0, int arg1, int arg2) {
        ++field3456;
        this.field3455 += this.field3459[arg2] * arg1 >> 12;
        if (arg0 <= 7) {
            this.field3459 = null;
        }
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIIIF)V", line = 52)
    public class266(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field4099; ++var7) {
            this.field3459[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(BBI)V", line = 69)
    public void method1077(byte arg0, byte arg1, int arg2) {
        this.field3453[this.field3463++] = (byte) (127 + class288.method1624(arg0 >> 1, 127));
        ++field3458;
        if (arg1 <= 118) {
            this.method1487((byte) -39, -78, 104);
        }
    }

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "(B)V", line = 80)
    public final void method1488(byte arg0) {
        if (arg0 != 25) {
            this.field3455 = 10;
        }
        ++field3457;
        this.field3463 = 0;
        this.field3455 = 0;
    }
}
