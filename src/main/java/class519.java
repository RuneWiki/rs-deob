import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class519 extends class634 {

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    private int field7379;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field7377 = 0;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public static int field7378 = 0;

    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Lof;")
    public static class620 field7380 = new class620(10);

    @OriginalMember(owner = "client!cb", name = "J", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!cb", name = "K", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!cb", name = "L", descriptor = "Loh;")
    public static class404 field7383;

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class519() {
        this(4096);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(I)V")
    public class519(int arg0) {
        super(0, true);
        this.field7379 = 4096;
        this.field7379 = arg0;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILig;Z)V")
    public final void method3(int arg0, class244 arg1, boolean arg2) {
        ++field7381;
        if (~arg0 == -1) {
            this.field7379 = (arg1.method1423(-51) << 12) / 255;
        }
        if (arg2) {
            this.method13((byte) 58, 81);
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(I)V")
    public static void method3048(int arg0) {
        field7383 = null;
        field7380 = null;
        if (arg0 != 12905) {
            method3048(-75);
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)[I")
    public final int[] method13(byte arg0, int arg1) {
        ++field7382;
        int[] var3 = super.field9114.method1858(100, arg1);
        if (arg0 > -55) {
            return null;
        } else {
            if (super.field9114.field3897) {
                class143.method896(var3, 0, class635.field9139, this.field7379);
            }
            return var3;
        }
    }
}
