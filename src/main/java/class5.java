import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class145 {

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    private int field55;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "I")
    public static int field52 = 0;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[I")
    public final int[] method27(boolean arg0, int arg1) {
        ++field53;
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (arg0) {
            this.method28(32, -75, (class194) null);
        }
        if (super.field1779.field4602) {
            class210.method1331(var3, 0, class647.field9368, this.field55);
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class5() {
        this(4096);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(I)V")
    public class5(int arg0) {
        super(0, true);
        this.field55 = 4096;
        this.field55 = arg0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILrt;)V")
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 <= -67) {
            ++field54;
            if (arg0 == 0) {
                this.field55 = (arg2.method1177(255) << 12) / 255;
            }
        }
    }
}
