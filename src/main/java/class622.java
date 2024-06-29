import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class622 extends class482 {

    @OriginalMember(owner = "client!wca", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field8661;

    @OriginalMember(owner = "client!wca", name = "A", descriptor = "Z")
    public static boolean field8657 = false;

    @OriginalMember(owner = "client!wca", name = "F", descriptor = "Lfc;")
    public static class235 field8662 = new class235(75, 8);

    @OriginalMember(owner = "client!wca", name = "H", descriptor = "F")
    public static float field8664;

    @OriginalMember(owner = "client!wca", name = "z", descriptor = "I")
    public static int field8656;

    @OriginalMember(owner = "client!wca", name = "B", descriptor = "I")
    public static int field8658;

    @OriginalMember(owner = "client!wca", name = "D", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!wca", name = "G", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!wca", name = "C", descriptor = "Lfu;")
    public static class356 field8659;

    @OriginalMember(owner = "client!wca", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method2245(byte arg0) {
        if (arg0 != -28) {
            method3464(46);
        }
        field8656++;
        return false;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V", line = 15)
    public static final void method3463(int arg0) {
        if (arg0 != 16) {
            method3464(22);
        }
        field8658++;
        if (class635.field8929 == null) {
            class575 var1 = new class575();
            byte[] var2 = var1.method3159(128, 128, (byte) -118, 16);
            class635.field8929 = class534.method2952(false, var2, 107);
        }
        if (class186.field2752 == null) {
            class545 var3 = new class545();
            byte[] var4 = var3.method3001((byte) -53, 128, 16, 128);
            class186.field2752 = class534.method2952(false, var4, arg0 + 75);
        }
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(B)Ljava/lang/Object;", line = 43)
    public final Object method2244(byte arg0) {
        field8660++;
        return arg0 <= 75 ? null : this.field8661;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 61)
    public class622(Object arg0, int arg1) {
        super(arg1);
        this.field8661 = arg0;
    }

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "(I)V", line = 69)
    public static void method3464(int arg0) {
        if (arg0 != 128) {
            field8664 = -0.51268816F;
        }
        field8659 = null;
        field8662 = null;
    }
}
