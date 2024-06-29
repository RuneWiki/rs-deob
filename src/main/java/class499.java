import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class499 extends class392 implements class170 {

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    private int field7280;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field7277;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field7279;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field7281;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field7283;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field7284;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field7285;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "[I")
    public static int[] field7282;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I")
    public final int method164(int arg0) {
        ++field7279;
        if (arg0 != 19781) {
            field7284 = -49;
        }
        return this.field7280;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lur;I[BIZ)V")
    public class499(class377 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7280 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lur;ILjaggl/memory/NativeBuffer;IZ)V")
    public class499(class377 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field7280 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BII)V")
    public final void method167(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method2367(-128, arg3, arg1);
        ++field7283;
        this.field7280 = arg2;
        if (arg0 != -2115) {
            this.method164(93);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method2998(byte arg0) {
        if (arg0 != 38) {
            method2998((byte) -61);
        }
        field7282 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I")
    public final int method166(boolean arg0) {
        if (arg0) {
            field7282 = null;
        }
        ++field7285;
        return super.field5659;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)J")
    public final long method163(int arg0) {
        ++field7278;
        if (arg0 != -242) {
            this.method164(63);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V")
    public final void method1907(int arg0) {
        super.field5657.method2259(this, -9632);
        ++field7277;
        int var2 = -102 % ((arg0 - -33) / 39);
    }
}
