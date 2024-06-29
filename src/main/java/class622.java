import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class622 extends class551 {

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lmq;")
    public static class78 field8696 = new class78(32, 20);

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public int field8694;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field8699;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Lwea;")
    public class98 field8693;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[B")
    public byte[] field8697;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)[B", line = 5)
    public final byte[] method3138(int arg0) {
        ++field8699;
        if (arg0 != 1) {
            this.method3140((byte) 82);
        }
        if (super.field7751) {
            throw new RuntimeException();
        } else {
            return this.field8697;
        }
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(B)V", line = 24)
    public static void method3406(byte arg0) {
        if (arg0 != -122) {
            field8696 = null;
        }
        field8696 = null;
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(B)I", line = 38)
    public final int method3140(byte arg0) {
        ++field8695;
        if (super.field7751) {
            return 0;
        } else {
            if (arg0 != -92) {
                this.field8694 = -50;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I", line = 54)
    public static final int method3407(int arg0, int arg1, int arg2) {
        ++field8698;
        if (arg1 <= 14) {
            return -119;
        } else {
            int var3 = 1;
            while (arg2 > 1) {
                if (~(arg2 & 1) != -1) {
                    var3 = arg0 * var3;
                }
                arg2 >>= 1;
                arg0 *= arg0;
            }
            if (arg2 == 1) {
                return arg0 * var3;
            } else {
                return var3;
            }
        }
    }
}
