import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class559 extends class245 {

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    private int field8309;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    private int field8305;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    private int field8302;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    private int field8301;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Z")
    public static boolean field8304 = false;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "Llu;")
    public static class610 field8307 = new class610(0, 3);

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Lha;")
    public static class53 field8303;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 4)
    public static void method3366(int arg0) {
        if (arg0 > 12) {
            field8307 = null;
            field8303 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "(IIIIII)V", line = 18)
    public class559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field8309 = arg3;
        this.field8305 = arg2;
        this.field8302 = arg1;
        this.field8301 = arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBI)V", line = 29)
    public final void method1350(int arg0, byte arg1, int arg2) {
        ++field8308;
        int var4 = -16 / ((arg1 - -23) / 57);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(III)V", line = 43)
    public final void method1351(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method1352((byte) -64, 96, -119);
        }
        ++field8306;
        int var4 = this.field8301 * arg2 >> 12;
        int var5 = this.field8305 * arg2 >> 12;
        int var6 = this.field8302 * arg0 >> 12;
        int var7 = this.field8309 * arg0 >> 12;
        class490.method2936(var4, var6, var5, var7, (byte) 95, super.field3529);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BII)V", line = 65)
    public final void method1352(byte arg0, int arg1, int arg2) {
        ++field8310;
        int var4 = -83 / ((arg0 - 43) / 54);
    }
}
