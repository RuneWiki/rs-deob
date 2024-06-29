import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public class class244 extends class297 {

    @OriginalMember(owner = "client!vaa", name = "A", descriptor = "[I")
    private int[] field3536 = new int[this.field4261];

    @OriginalMember(owner = "client!vaa", name = "q", descriptor = "I")
    public static int field3526 = 1401;

    @OriginalMember(owner = "client!vaa", name = "z", descriptor = "J")
    public static long field3535 = 0L;

    @OriginalMember(owner = "client!vaa", name = "n", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!vaa", name = "o", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!vaa", name = "r", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!vaa", name = "s", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!vaa", name = "t", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!vaa", name = "u", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!vaa", name = "v", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!vaa", name = "w", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!vaa", name = "x", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!vaa", name = "y", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!vaa", name = "p", descriptor = "[B")
    private byte[] field3525;

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BIZ)V", line = 5)
    public void method1548(byte arg0, int arg1, boolean arg2) {
        this.field3525[this.field3534++] = (byte) ((class424.method2540(arg0, 255) >> 1) + 127);
        if (arg2) {
            ++field3529;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(III)Z", line = 16)
    public static final boolean method1549(int arg0, int arg1, int arg2) {
        ++field3530;
        if (arg2 != -24048) {
            return false;
        } else {
            return (arg0 & 32768) != 0;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(III)V", line = 27)
    public final void method706(int arg0, int arg1, int arg2) {
        ++field3532;
        this.field3531 += this.field3536[arg1] * arg0 >> 12;
        if (arg2 <= 7) {
            this.method707(96);
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(IIII)V", line = 38)
    public static final void method1550(int arg0, int arg1, int arg2, int arg3) {
        ++field3523;
        class127.field2088.method1702(arg1, false);
        if (arg2 != 0) {
            field3526 = 22;
        }
        class127.field2088.method1718(-3, arg0);
        class127.field2088.method1699(true, arg3);
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)V", line = 65)
    public final void method707(int arg0) {
        ++field3533;
        this.field3531 = Math.abs(this.field3531);
        if (~this.field3531 <= -4097) {
            this.field3531 = 4095;
        }
        this.method1548((byte) (this.field3531 >> 4), this.field3534++, true);
        this.field3531 = arg0;
    }

    @OriginalMember(owner = "client!vaa", name = "c", descriptor = "(I)V", line = 79)
    public static final void method1551(int arg0) {
        ++field3527;
        if (arg0 == 3) {
            if (~class234.field3439 == -2 || class234.field3439 == 3 || ~class37.field510 != ~class234.field3439 && (class234.field3439 == 0 || ~class37.field510 == -1)) {
                class313.field4570 = 0;
                class128.field2098 = 0;
                class432.field6368.method739(2048);
            }
            class37.field510 = class234.field3439;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "b", descriptor = "(I)V", line = 97)
    public final void method703(int arg0) {
        if (arg0 == 4095) {
            this.field3534 = 0;
            ++field3524;
            this.field3531 = 0;
        }
    }

    @OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(IIIIIF)V", line = 111)
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field4261; ++var7) {
            this.field3536[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!vaa", name = "a", descriptor = "(BLjava/lang/String;Ljava/io/File;)V", line = 135)
    public static final void method1552(byte arg0, String arg1, File arg2) {
        if (arg0 == 18) {
            class401.field6000.put(arg1, arg2);
            ++field3528;
        }
    }
}
