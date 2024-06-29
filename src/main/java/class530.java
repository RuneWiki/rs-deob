import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class530 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public int field7339 = -1;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public int field7347 = -1;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public int field7346 = -1;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "F")
    public static float field7350;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public int field7341;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public int field7342;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    public static int field7344;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public int field7348;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public int field7349;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public int field7351;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIBLuu;IZLaea;)V", line = 7)
    public static final void method3147(int arg0, int arg1, byte arg2, class237 arg3, int arg4, boolean arg5, class261 arg6) {
        field7340++;
        class720.method4033(false, arg0, arg4, arg3, arg1, arg5);
        int var7 = 85 / ((-arg2 - 74) / 46);
        class123.field1689 = arg6;
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lni;)V", line = 70)
    public class530(class515 arg0) {
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)V", line = 28)
    public static final void method3148(byte arg0) {
        if (class92.field1285 != -1) {
            class429.method2662(class92.field1285, -1, false, -1, -45);
            class92.field1285 = -1;
        }
        field7344++;
        if (arg0 >= -39) {
            field7350 = 1.2623526F;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IB[BI)[B", line = 47)
    public static final byte[] method3149(int arg0, byte arg1, byte[] arg2, int arg3) {
        field7343++;
        byte[] var4 = new byte[arg3];
        if (arg1 > -45) {
            method3147(-45, 126, (byte) 74, null, 33, false, null);
        }
        class245.method1646(arg2, arg0, var4, 0, arg3);
        return var4;
    }
}
