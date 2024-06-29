import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class520 extends class233 implements class74 {

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    private int field7655;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public static int field7661 = 0;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field7652;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field7653;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field7654;

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "I")
    public static int field7656;

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "I")
    public static int field7657;

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "I")
    public static int field7662;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V")
    public final void method1360(int arg0) {
        ++field7660;
        super.field3227.method2385(34962, this);
        if (arg0 != -4335) {
            method3059(false);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B[BII)V")
    public final void method554(byte arg0, byte[] arg1, int arg2, int arg3) {
        this.method1358(-4, arg1, arg3);
        ++field7654;
        this.field7655 = arg2;
        int var5 = -6 % ((arg0 - -84) / 42);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
    public final int method552(byte arg0) {
        if (arg0 < 74) {
            field7661 = 51;
        }
        ++field7659;
        return this.field7655;
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lht;I[BIZ)V")
    public class520(class410 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7655 = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)I")
    public final int method553(byte arg0) {
        if (arg0 != -43) {
            return -108;
        } else {
            ++field7656;
            return super.field3223;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lht;ILjaggl/memory/NativeBuffer;IZ)V")
    public class520(class410 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7655 = arg1;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)V")
    public static final void method3058(int arg0, int arg1) {
        ++field7657;
        class275.field3736.method61((byte) -67, arg1);
        class61.field810.method61((byte) -67, arg1);
        class214.field3047.method61((byte) -67, arg1);
        class483.field7080.method61((byte) -67, arg1);
        class227.field3184.method61((byte) -67, arg1);
        if (arg0 >= -43) {
            field7661 = 73;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static final void method3059(boolean arg0) {
        ++field7658;
        class519.field7647.method992(-15728);
        if (arg0) {
            field7653 = -9;
        }
        class292.field3907.method992(-15728);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)J")
    public final long method551(byte arg0) {
        if (arg0 > -15) {
            this.field7655 = 104;
        }
        ++field7652;
        return 0L;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)V")
    public static final void method3060(int arg0, int arg1, int arg2) {
        ++field7662;
        int var3 = 97 / ((-2 - arg2) / 34);
        if (class507.field7456 != arg1) {
            class192.field2736 = new int[arg1];
            for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                class192.field2736[var4] = (var4 << 12) / arg1;
            }
            class507.field7456 = arg1;
            class412.field6045 = arg1 - 1;
            class51.field687 = arg1 * 32;
        }
        if (class307.field4211 != arg0) {
            if (~class507.field7456 == ~arg0) {
                class454.field6637 = class192.field2736;
            } else {
                class454.field6637 = new int[arg0];
                for (int var5 = 0; var5 < arg0; ++var5) {
                    class454.field6637[var5] = (var5 << 12) / arg0;
                }
            }
            class40.field549 = arg0 + -1;
            class307.field4211 = arg0;
        }
    }
}
