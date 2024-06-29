import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class167 extends class470 implements class408 {

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "I")
    private int field2635;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "Luh;")
    public static class176 field2631 = new class176(10, 2, 2, 0);

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "Z")
    public static boolean field2636 = false;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2638 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IB[BI)V", line = 5)
    public final void method1240(int arg0, byte arg1, byte[] arg2, int arg3) {
        this.method2797(arg3, arg2, (byte) -127);
        ++field2632;
        this.field2635 = arg0;
        if (arg1 != 76) {
            this.method1246(23);
        }
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V", line = 17)
    public static void method1241(int arg0) {
        field2638 = null;
        if (arg0 == 2) {
            field2631 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)J", line = 28)
    public final long method1242(int arg0) {
        int var2 = 33 / ((arg0 - -42) / 62);
        ++field2639;
        return 0L;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lqfa;I[BIZ)V", line = 39)
    public class167(class106 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2635 = arg1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([BII)I", line = 53)
    public static final int method1243(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field2631 = null;
        }
        ++field2637;
        return class772.method4255(arg2, 0, (byte) 93, arg0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BI)V", line = 69)
    public static final void method1244(byte arg0, int arg1) {
        ++field2629;
        if (class401.method2473((byte) -87)) {
            if (class449.field6142 != arg1) {
                class459.field6419 = "";
            }
            int var2 = -90 % ((arg0 - 66) / 44);
            class449.field6142 = arg1;
            if (class527.field7529 != null) {
                class527.field7529.method612((byte) -1);
                class527.field7529 = null;
            }
            class225.method1539(false, 5);
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)I", line = 97)
    public final int method1245(int arg0) {
        ++field2634;
        if (arg0 != -7597) {
            method1241(98);
        }
        return super.field6594;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I", line = 112)
    public final int method1246(int arg0) {
        ++field2633;
        return arg0 != -13768 ? -84 : this.field2635;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V", line = 123)
    public final void method1247(int arg0) {
        ++field2630;
        if (arg0 == -21795) {
            super.field6595.method817(this, -24211);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(JJ)J", line = 134)
    public static long method1248(long arg0, long arg1) {
        return arg0 & arg1;
    }
}
