import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class265 {

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "I")
    public static int field3639 = 0;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "Z")
    public static boolean field3642 = false;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "[Lie;")
    public static class6[] field3643 = new class6[100];

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "Lun;")
    public static class389 field3641;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)V", line = 3)
    public static void method1606(int arg0) {
        field3641 = null;
        if (arg0 == -1) {
            field3643 = null;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BII[BIIIII)V", line = 27)
    public static final void method1607(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg2 != 100) {
            method1607(null, -112, 90, null, -3, -62, -57, -66, 43);
        }
        field3640++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg4; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg3[var10001] += arg0[arg6++];
                int var14 = arg1++;
                arg3[var14] += arg0[arg6++];
                int var15 = arg1++;
                arg3[var15] += arg0[arg6++];
                int var16 = arg1++;
                arg3[var16] += arg0[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg3[var10001] += arg0[arg6++];
            }
            arg1 += arg7;
            arg6 += arg8;
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)I", line = 74)
    public static final int method1608(boolean arg0) {
        if (!arg0) {
            field3642 = false;
        }
        field3644++;
        return class561.field8107;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V", line = 87)
    public static final void method1609(byte arg0) {
        if (arg0 > -41) {
            return;
        }
        if (class276.field3778 == null || class197.field2400 == null) {
            class197.field2400 = new int[256];
            class276.field3778 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class276.field3778[var1] = (int) (Math.sin(var2) * 4096.0D);
                class197.field2400[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        field3638++;
    }
}
