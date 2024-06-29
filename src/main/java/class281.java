import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class281 extends class101 {

    @OriginalMember(owner = "client!tia", name = "o", descriptor = "F")
    public static float field4142 = 0.0F;

    @OriginalMember(owner = "client!tia", name = "q", descriptor = "[Z")
    public static boolean[] field4144 = new boolean[200];

    @OriginalMember(owner = "client!tia", name = "p", descriptor = "Lmga;")
    public static class739 field4143 = new class739(13, 8);

    @OriginalMember(owner = "client!tia", name = "t", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!tia", name = "u", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!tia", name = "v", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!tia", name = "n", descriptor = "J")
    public long field4141;

    @OriginalMember(owner = "client!tia", name = "r", descriptor = "Ltia;")
    public class281 field4145;

    @OriginalMember(owner = "client!tia", name = "s", descriptor = "Ltia;")
    public class281 field4146;

    @OriginalMember(owner = "client!tia", name = "w", descriptor = "Laj;")
    public static class333 field4150;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(B)V")
    public static void method1810(byte arg0) {
        if (arg0 != -84) {
            method1813(91, false, null, -55, -30, -82, null, -6, 123);
        }
        field4144 = null;
        field4150 = null;
        field4143 = null;
    }

    @OriginalMember(owner = "client!tia", name = "b", descriptor = "(I)V")
    public final void method1811(int arg0) {
        field4147++;
        if (this.field4145 == null) {
            return;
        }
        if (arg0 != 28064) {
            this.field4141 = 110L;
        }
        this.field4145.field4146 = this.field4146;
        this.field4146.field4145 = this.field4145;
        this.field4146 = null;
        this.field4145 = null;
    }

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "(I)Z")
    public final boolean method1812(int arg0) {
        field4149++;
        if (arg0 != 3) {
            field4150 = null;
        }
        return this.field4145 != null;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IZ[BIII[BII)V")
    public static final void method1813(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field4148++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        if (!arg1) {
            field4143 = null;
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg4++;
                arg2[var10001] += arg6[arg5++];
                int var14 = arg4++;
                arg2[var14] += arg6[arg5++];
                int var15 = arg4++;
                arg2[var15] += arg6[arg5++];
                int var16 = arg4++;
                arg2[var16] += arg6[arg5++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg4++;
                arg2[var10001] += arg6[arg5++];
            }
            arg4 += arg8;
            arg5 += arg7;
        }
    }
}
