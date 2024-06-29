import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class590 {

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "Z")
    public static boolean field8486 = false;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "Z")
    public static boolean field8488 = false;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field8484;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V")
    public static final void method3365(byte arg0) {
        if (arg0 == -14) {
            class459.field6558 = -1;
            class51.field1189 = -1;
            field8485++;
            class694.field9774 = 0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static final void method3366(int arg0) {
        field8487++;
        if (arg0 != 1) {
            method3368(null, -26, -91, -28, 3, null, 61, -113, 99);
        }
        class140.field2463.method143(((float) class527.field7429.field2647 * 0.1F + 0.7F) * class161.field2718);
        class140.field2463.method95(class433.field6271, class507.field7189, class42.field1084, (float) (class568.field8278 << 2), (float) (class229.field3423 << 2), (float) (class136.field2417 << 2));
        class140.field2463.method165(class310.field4625);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
    public static final int method3367(int arg0, int arg1) {
        if (arg1 <= 74) {
            field8486 = true;
        }
        field8484++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([BIIII[BIII)V")
    public static final void method3368(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field8483++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        if (arg7 != 20481) {
            method3368(null, 57, -57, 100, -56, null, -78, -68, -51);
        }
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg6++;
                arg0[var10001] = (byte) (arg0[var10001] - arg5[arg8++]);
                int var14 = arg6++;
                arg0[var14] = (byte) (arg0[var14] - arg5[arg8++]);
                int var15 = arg6++;
                arg0[var15] = (byte) (arg0[var15] - arg5[arg8++]);
                int var16 = arg6++;
                arg0[var16] = (byte) (arg0[var16] - arg5[arg8++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg6++;
                arg0[var10001] = (byte) (arg0[var10001] - arg5[arg8++]);
            }
            arg6 += arg3;
            arg8 += arg2;
        }
    }
}
