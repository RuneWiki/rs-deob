import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class448 extends class30 {

    @OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
    private int field6538;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    public static int field6536 = 0;

    @OriginalMember(owner = "client!lr", name = "O", descriptor = "I")
    public static int field6539 = 500;

    @OriginalMember(owner = "client!lr", name = "P", descriptor = "I")
    public static int field6540 = 0;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "(I)V")
    public static final void method2793(int arg0) {
        class249.field4072.method1366(-233);
        ++field6535;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            class29.field328[var1] = 0L;
        }
        for (int var2 = 0; ~var2 > -33; ++var2) {
            class19.field252[var2] = 0L;
        }
        class257.field4170 = 0;
        if (arg0 > -92) {
            field6536 = 46;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)[I")
    public final int[] method116(int arg0, byte arg1) {
        ++field6537;
        int[] var3 = super.field371.method2367((byte) -72, arg0);
        if (arg1 <= 49) {
            field6536 = -84;
        }
        if (super.field371.field5586) {
            class408.method2558(var3, 0, class369.field5610, this.field6538);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
    public class448() {
        this(4096);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljg;II)V")
    public final void method115(class186 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field6538 = (arg0.method1322(false) << 12) / 255;
        }
        if (arg1 != 6456) {
            this.method116(-12, (byte) -95);
        }
        ++field6534;
    }

    @OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(I)V")
    public class448(int arg0) {
        super(0, true);
        this.field6538 = 4096;
        this.field6538 = arg0;
    }
}
