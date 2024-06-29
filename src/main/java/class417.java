import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class417 extends class573 {

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "I")
    private int field6025;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "Lqfa;")
    public static class85 field6024 = new class85(28, 8);

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "F")
    public static float field6026;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class417() {
        this(4096);
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
    public static void method2536(byte arg0) {
        if (arg0 <= 52) {
            field6026 = 0.2682498F;
        }
        field6024 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILr;)V")
    public static final void method2537(int arg0, class167 arg1) {
        ++field6027;
        class645.field9299 = new class505[class636.field9175.length];
        int var2 = 0;
        if (arg0 != -19695) {
            field6024 = null;
        }
        while (~var2 > ~class636.field9175.length) {
            int var3 = class636.field9175[var2];
            class11 var4 = class492.method2951(var3, class292.field4390, (byte) -128);
            class421 var5 = arg1.method160(var4, class279.method1840(class217.field3305, var3), true);
            class645.field9299[var2] = new class505(var5, var4);
            ++var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
    public final int[] method619(int arg0, int arg1) {
        ++field6023;
        int[] var3 = super.field8321.method3164(arg0, -114);
        if (super.field8321.field7825) {
            class692.method3878(var3, 0, class540.field7555, this.field6025);
        }
        return arg1 != 1 ? null : var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lqh;II)V")
    public final void method443(class61 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            method2537(-45, (class167) null);
        }
        if (arg1 == 0) {
            this.field6025 = (arg0.method732(-559537960) << 12) / 255;
        }
        ++field6022;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(I)V")
    public class417(int arg0) {
        super(0, true);
        this.field6025 = 4096;
        this.field6025 = arg0;
    }
}
