import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class609 extends class601 {

    @OriginalMember(owner = "client!hg", name = "I", descriptor = "I")
    private int field7702;

    @OriginalMember(owner = "client!hg", name = "L", descriptor = "[I")
    public static int[] field7705 = new int[4096];

    @OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!hg", name = "G", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!hg", name = "H", descriptor = "[I")
    public static int[] field7701;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "(B)I")
    public static final int method3264(byte arg0) {
        ++field7703;
        if (arg0 != -101) {
            field7701 = null;
        }
        return class298.field3765;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field7702 = (arg0.method1509(true) << 12) / 255;
        }
        int var5 = 114 % ((arg2 - 40) / 52);
        ++field7704;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class609() {
        this(4096);
    }

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V")
    public static void method3265(byte arg0) {
        field7705 = null;
        field7701 = null;
        int var1 = 112 % ((arg0 - 62) / 47);
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(I)V")
    public class609(int arg0) {
        super(0, true);
        this.field7702 = 4096;
        this.field7702 = arg0;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field7699;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 >= -76) {
            field7705 = null;
        }
        if (super.field7643.field4364) {
            class642.method3478(var3, 0, class418.field5518, this.field7702);
        }
        return var3;
    }
}
