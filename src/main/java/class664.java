import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class664 extends IOException {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field9423 = 999999;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Lkf;")
    public static class235 field9422 = new class235();

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Ldb;")
    public static class298 field9425 = new class298(6, -2);

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Z")
    public static boolean field9427 = false;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field9426 = 0;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field9421;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "Lkga;")
    public static class511 field9424;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method3728(boolean arg0) {
        field9422 = null;
        field9424 = null;
        if (arg0) {
            field9423 = -87;
        }
        field9425 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([BIIII[BIII)V")
    public static final void method3729(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field9421++;
        if (arg7 != -2) {
            return;
        }
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg1++]);
                int var14 = arg8++;
                arg5[var14] = (byte) (arg5[var14] - arg0[arg1++]);
                int var15 = arg8++;
                arg5[var15] = (byte) (arg5[var15] - arg0[arg1++]);
                int var16 = arg8++;
                arg5[var16] = (byte) (arg5[var16] - arg0[arg1++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg5[var10001] = (byte) (arg5[var10001] - arg0[arg1++]);
            }
            arg1 += arg6;
            arg8 += arg2;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3730(String arg0, int arg1) {
        if (arg1 < 114) {
            field9426 = 35;
        }
        field9420++;
        return class88.method706(arg0, true, 10, false);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class664(String arg0) {
        super(arg0);
    }
}
