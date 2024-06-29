import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class475 {

    @OriginalMember(owner = "client!us", name = "g", descriptor = "C")
    public char field6180;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "I")
    public int field6174;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public int field6176;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public int field6179;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILmc;)V", line = 3)
    private final void method2676(int arg0, int arg1, class234 arg2) {
        if (arg1 < 107) {
            this.field6176 = -112;
        }
        if (arg0 == 1) {
            this.field6180 = class752.method4080(arg2.method1554(27806), (byte) 63);
        } else if (arg0 == 2) {
            this.field6176 = arg2.method1553((byte) 67);
            this.field6174 = arg2.method1509(true);
            this.field6179 = arg2.method1509(true);
        }
        field6177++;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 33)
    public static final void method2677(int arg0) {
        field6175++;
        if (arg0 != 0) {
            method2677(-107);
        }
        class58.method351(true);
        class204.method1385(78);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lmc;I)V", line = 45)
    public final void method2678(class234 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                if (arg1 != -5514) {
                    return;
                }
                field6178++;
                return;
            }
            this.method2676(var3, 111, arg0);
        }
    }
}
