import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class168 extends class195 {

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    private final int field2553;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
    private final int field2562;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    private final int field2559;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "Lma;")
    public static class5 field2561 = class12.method119("<col=ffff00>", (byte) 79);

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "Lma;")
    public static class5 field2560 = class12.method119("Verbindung mit Update)2Server)3)3)3", (byte) 96);

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "Z")
    public static boolean field2571 = false;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "[J")
    public static long[] field2565 = new long[200];

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "F")
    public static float field2557;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    private int field2566;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
    private int field2572;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    private int field2574;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "Lje;")
    public static class158 field2558;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "Lni;")
    public static class202 field2563;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "[B")
    private byte[] field2569;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(B)V", line = 17)
    public final void method933(byte arg0) {
        this.field2572 = 0;
        if (arg0 >= -126) {
            method1115((byte) 124);
        }
        field2556++;
        this.field2574 = 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(III)V", line = 30)
    public final void method931(int arg0, int arg1, int arg2) {
        field2575++;
        if (~arg1 == arg0) {
            this.field2566 = 4096;
            this.field2573 = this.field2553 - (arg2 < 0 ? -arg2 : arg2);
            this.field2573 = this.field2573 * this.field2573 >> 12;
            this.field2574 = this.field2573;
            return;
        }
        this.field2566 = this.field2573 * this.field2562 >> 12;
        if (this.field2566 < 0) {
            this.field2566 = 0;
        } else if (this.field2566 > 4096) {
            this.field2566 = 4096;
        }
        this.field2573 = this.field2553 - (arg2 >= 0 ? arg2 : -arg2);
        this.field2573 = this.field2573 * this.field2573 >> 12;
        this.field2573 = this.field2573 * this.field2566 >> 12;
        this.field2574 += this.field2573 * this.field2555 >> 12;
        this.field2555 = this.field2559 * this.field2555 >> 12;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)V", line = 68)
    public void method612(int arg0, byte arg1) {
        field2564++;
        this.field2569[arg0] = arg1;
    }

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(IIIIIFFF)V", line = 100)
    public class168(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2553 = (int) (arg6 * 4096.0F);
        this.field2562 = (int) (arg7 * 4096.0F);
        this.field2555 = this.field2559 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V", line = 119)
    public static void method1115(byte arg0) {
        field2560 = null;
        field2563 = null;
        if (arg0 == 94) {
            field2561 = null;
            field2558 = null;
            field2565 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)I", line = 153)
    public static final int method1116(int arg0, int arg1) {
        field2567++;
        if (!(arg0 < 65 || arg0 > 90) || !(arg0 < 192 || arg0 > 222 || arg0 == 215)) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            if (arg1 != 0) {
                field2560 = (class5) null;
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)V", line = 178)
    public final void method934(byte arg0) {
        this.field2555 = this.field2559;
        this.field2574 >>= 0x4;
        field2552++;
        if (arg0 >= -48) {
            this.method933((byte) 42);
        }
        if (this.field2574 < 0) {
            this.field2574 = 0;
        } else if (this.field2574 > 255) {
            this.field2574 = 255;
        }
        this.method612(this.field2572++, (byte) this.field2574);
        this.field2574 = 0;
    }
}
