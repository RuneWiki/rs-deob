import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class503 extends class751 {

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "I")
    private int field7198;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public static int field7192 = -1;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public static int field7196 = 1405;

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "D")
    public static double field7194;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public static int field7193;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
    public static int field7195;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public static int field7197;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "I")
    public static int field7199;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        if (arg1 != 4095) {
            this.field7198 = -41;
        }
        ++field7199;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            class42.method293(var3, 0, class673.field9452, this.field7198);
        }
        return var3;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        int var4 = 64 % ((arg0 - 25) / 63);
        ++field7195;
        if (~arg2 == -1) {
            this.field7198 = (arg1.method842(2384) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(IB)[I")
    public static final int[] method2934(int arg0, byte arg1) {
        ++field7193;
        class527.method3060(arg1 + -12601, class99.method693((byte) 111, arg0));
        return arg1 != 124 ? null : new int[] { class241.field3461.get(5), class241.field3461.get(2), class241.field3461.get(1) };
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(I)V")
    public class503(int arg0) {
        super(0, true);
        this.field7198 = 4096;
        this.field7198 = arg0;
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)I")
    public static final int method2935(int arg0, int arg1) {
        ++field7197;
        if (arg1 > -126) {
            method2934(-56, (byte) -6);
        }
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "()V")
    public class503() {
        this(4096);
    }
}
