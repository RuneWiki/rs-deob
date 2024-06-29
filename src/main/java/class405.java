import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class405 {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public int field5569 = 2048;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public int field5572 = 0;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field5574 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field5573 = 2048;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lcu;")
    public static class145 field5570 = new class145(5, 4);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lcu;")
    public static class145 field5576 = new class145(47, 6);

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field5578 = 1400;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2356(int arg0) {
        if (arg0 == 5) {
            field5576 = null;
            field5570 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILmd;I)V", line = 21)
    private final void method2357(int arg0, class379 arg1, int arg2) {
        if (arg0 == 1) {
            this.field5572 = arg1.method2238(arg2 + 15892);
        } else if (arg0 == 2) {
            this.field5573 = arg1.method2212((byte) 83);
        } else if (arg0 == 3) {
            this.field5569 = arg1.method2212((byte) 83);
        } else if (arg0 == 4) {
            this.field5574 = arg1.method2202(-26372);
        }
        field5571++;
        if (arg2 != -15637) {
            method2356(40);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lmd;I)V", line = 61)
    public final void method2358(class379 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2238(arg1 ^ 0x7E37);
            if (var3 == 0) {
                field5575++;
                if (arg1 != 32456) {
                    this.method2357(95, null, -123);
                    return;
                }
                return;
            }
            this.method2357(var3, arg0, -15637);
        }
    }
}
