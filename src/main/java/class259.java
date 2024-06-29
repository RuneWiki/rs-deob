import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class259 extends class237 {

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field3491;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    private int field3492;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    private int field3501;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
    private int field3489;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field3502 = 0;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    private int field3494;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    private int field3496;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    private int field3499;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    private int field3503;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Lee;")
    public static class441 field3493;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "[B")
    private byte[] field3498;

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIFFF)V", line = 14)
    public class259(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3491 = (int) (arg6 * 4096.0F);
        this.field3492 = (int) (arg7 * 4096.0F);
        this.field3489 = this.field3501 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V", line = 28)
    public final void method1583(byte arg0) {
        this.field3494 = 0;
        this.field3499 = 0;
        if (arg0 != 67) {
            this.method1583((byte) 67);
        }
        field3500++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)V", line = 41)
    public final void method1580(int arg0, byte arg1, int arg2) {
        if (arg0 == 0) {
            this.field3503 = this.field3491 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3496 = 4096;
            this.field3503 = this.field3503 * this.field3503 >> 12;
            this.field3494 = this.field3503;
        } else {
            this.field3496 = this.field3503 * this.field3492 >> 12;
            if (this.field3496 < 0) {
                this.field3496 = 0;
            } else if (this.field3496 > 4096) {
                this.field3496 = 4096;
            }
            this.field3503 = this.field3491 - (arg2 >= 0 ? arg2 : -arg2);
            this.field3503 = this.field3503 * this.field3503 >> 12;
            this.field3503 = this.field3503 * this.field3496 >> 12;
            this.field3494 += this.field3503 * this.field3489 >> 12;
            this.field3489 = this.field3501 * this.field3489 >> 12;
        }
        field3490++;
        if (arg1 != 57) {
            this.method1577((byte) 76);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V", line = 77)
    public void method1101(int arg0, byte arg1) {
        this.field3498[arg0] = arg1;
        field3495++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V", line = 85)
    public final void method1577(byte arg0) {
        if (arg0 != 94) {
            method1677(24);
        }
        this.field3489 = this.field3501;
        field3497++;
        this.field3494 >>= 0x4;
        if (this.field3494 < 0) {
            this.field3494 = 0;
        } else if (this.field3494 > 255) {
            this.field3494 = 255;
        }
        this.method1101(this.field3499++, (byte) this.field3494);
        this.field3494 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V", line = 112)
    public static void method1677(int arg0) {
        field3493 = null;
        int var1 = -123 / ((-arg0 - 6) / 35);
    }
}
