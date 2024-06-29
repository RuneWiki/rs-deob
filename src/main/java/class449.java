import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class449 extends class143 {

    @OriginalMember(owner = "client!ep", name = "J", descriptor = "[I")
    public static int[] field6481 = new int[1];

    @OriginalMember(owner = "client!ep", name = "A", descriptor = "I")
    public int field6472;

    @OriginalMember(owner = "client!ep", name = "C", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!ep", name = "D", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!ep", name = "E", descriptor = "I")
    public static int field6476;

    @OriginalMember(owner = "client!ep", name = "F", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!ep", name = "H", descriptor = "I")
    public int field6479;

    @OriginalMember(owner = "client!ep", name = "I", descriptor = "I")
    public int field6480;

    @OriginalMember(owner = "client!ep", name = "B", descriptor = "Ljava/lang/String;")
    public String field6473;

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(B)V")
    public static void method2613(byte arg0) {
        field6481 = null;
        if (arg0 >= -107) {
            field6481 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public final void method2614(int arg0) {
        super.field2469 = Long.MIN_VALUE & super.field2469 | 500L + class254.method1619(true);
        ++field6474;
        class693.field9846.method2107(true, this);
        if (arg0 <= 29) {
            this.field6472 = 77;
        }
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(B)V")
    public final void method2615(byte arg0) {
        ++field6478;
        if (arg0 < -56) {
            super.field2469 |= Long.MIN_VALUE;
            if (this.method2617(0) == 0L) {
                class223.field3337.method2107(true, this);
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)I")
    public final int method2616(int arg0) {
        if (arg0 >= -25) {
            this.field6473 = null;
        }
        ++field6476;
        return (int) (super.field6265 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ep", name = "d", descriptor = "(I)J")
    public final long method2617(int arg0) {
        ++field6475;
        if (arg0 != 0) {
            this.field6473 = null;
        }
        return Long.MAX_VALUE & super.field2469;
    }

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "(I)I")
    public final int method2618(int arg0) {
        ++field6477;
        if (arg0 != 6065) {
            this.method2615((byte) 117);
        }
        return (int) super.field6265;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(II)V")
    public class449(int arg0, int arg1) {
        super.field6265 = (long) arg1 | (long) arg0 << 32;
    }
}
