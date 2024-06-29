import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class489 extends class323 {

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    private int field6823;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    private int field6833;

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    private int field6825;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    private int field6832;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "J")
    public static long field6827 = 0L;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    private int field6822;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "I")
    private int field6826;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    private int field6830;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    private int field6834;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "Ldn;")
    public static class438 field6828;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "[B")
    private byte[] field6835;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
    public final void method1485(byte arg0) {
        field6836++;
        if (arg0 <= 51) {
            method2831(33);
        }
        this.field6826 >>= 0x4;
        this.field6832 = this.field6825;
        if (this.field6826 < 0) {
            this.field6826 = 0;
        } else if (this.field6826 > 255) {
            this.field6826 = 255;
        }
        this.method2725((byte) this.field6826, (byte) 119, this.field6834++);
        this.field6826 = 0;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public final void method1488(byte arg0) {
        if (arg0 != 25) {
            this.field6822 = 68;
        }
        this.field6834 = 0;
        this.field6826 = 0;
        field6831++;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BBI)V")
    public void method2725(byte arg0, byte arg1, int arg2) {
        if (arg1 <= 115) {
            field6828 = null;
        }
        field6824++;
        this.field6835[arg2] = arg0;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
    public final void method1487(byte arg0, int arg1, int arg2) {
        field6829++;
        if (arg2 == 0) {
            this.field6830 = this.field6823 - (arg1 < 0 ? -arg1 : arg1);
            this.field6830 = this.field6830 * this.field6830 >> 12;
            this.field6822 = 4096;
            this.field6826 = this.field6830;
        } else {
            this.field6822 = this.field6833 * this.field6830 >> 12;
            this.field6830 = this.field6823 - (arg1 >= 0 ? arg1 : -arg1);
            if (this.field6822 < 0) {
                this.field6822 = 0;
            } else if (this.field6822 > 4096) {
                this.field6822 = 4096;
            }
            this.field6830 = this.field6830 * this.field6830 >> 12;
            this.field6830 = this.field6830 * this.field6822 >> 12;
            this.field6826 += this.field6832 * this.field6830 >> 12;
            this.field6832 = this.field6832 * this.field6825 >> 12;
        }
        if (arg0 <= 7) {
            this.method2725((byte) -118, (byte) 76, 121);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)I")
    public static final int method2830(int arg0, int arg1, int arg2) {
        int var3 = 112 / ((arg1 + 20) / 57);
        field6837++;
        int var4 = (arg0 & 0x7F) * arg2 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 126) {
            var4 = 126;
        }
        return (arg0 & 0xFF80) + var4;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class489(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6823 = (int) (arg6 * 4096.0F);
        this.field6833 = (int) (arg7 * 4096.0F);
        this.field6832 = this.field6825 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
    public static void method2831(int arg0) {
        if (arg0 != 4096) {
            field6827 = 117L;
        }
        field6828 = null;
    }
}
