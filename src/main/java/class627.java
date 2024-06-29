import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class627 extends class1 {

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    private int field8747;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    private int field8749;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    private int field8750;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    private int field8739;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    private int field8746;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    private int field8741;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    private int field8743;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    private int field8757;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field8754 = 0;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "F")
    public static float field8744;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field8742;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field8748;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field8751;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field8752;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field8753;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field8755;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field8756;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "Lka;")
    public static class434 field8745;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "Ljava/lang/Object;")
    public static Object field8740;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([BIZ)V", line = 14)
    public static final void method3486(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 >= 16) {
            ++field8742;
            if (class363.field5174 == null) {
                class363.field5174 = new class96(20000);
            }
            class363.field5174.method724(arg0.length, -16054, arg0, 0);
            if (arg2) {
                class153.method1067(false, class363.field5174.field1316);
                class182.field2690 = new class233[class455.field6351];
                int var3 = 0;
                for (int var4 = class535.field7286; ~var4 >= ~class271.field3830; ++var4) {
                    class233 var5 = class145.method1016((byte) -118, var4);
                    if (var5 != null) {
                        class182.field2690[var3++] = var5;
                    }
                }
                class37.field501 = false;
                class166.field2514 = class680.method3756(-30);
                class363.field5174 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIZ)V", line = 55)
    public final void method8(int arg0, int arg1, boolean arg2) {
        ++field8748;
        int var4 = this.field8743 * arg1 >> 12;
        int var5 = this.field8749 * arg0 >> 12;
        int var6 = this.field8746 * arg1 >> 12;
        int var7 = this.field8757 * arg0 >> 12;
        if (arg2) {
            method3486((byte[]) null, -39, true);
        }
        int var8 = this.field8741 * arg1 >> 12;
        int var9 = this.field8750 * arg0 >> 12;
        int var10 = this.field8739 * arg1 >> 12;
        int var11 = this.field8747 * arg0 >> 12;
        class654.method3636(var11, var8, var10, var5, var9, var6, 0, var7, super.field4, var4);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V", line = 83)
    public static void method3487(int arg0) {
        if (arg0 != 0) {
            field8754 = -3;
        }
        field8740 = null;
        field8745 = null;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 94)
    public class627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field8747 = arg7;
        this.field8749 = arg1;
        this.field8750 = arg5;
        this.field8739 = arg6;
        this.field8746 = arg2;
        this.field8741 = arg4;
        this.field8743 = arg0;
        this.field8757 = arg3;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)V", line = 109)
    public final void method2(int arg0, boolean arg1, int arg2) {
        ++field8755;
        if (!arg1) {
            this.method6(122, 14, 27);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V", line = 123)
    public final void method6(int arg0, int arg1, int arg2) {
        if (arg0 >= -96) {
            this.field8757 = -119;
        }
        ++field8752;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)Z", line = 136)
    public static final boolean method3488(int arg0, int arg1, byte arg2) {
        int var3 = -53 / ((arg2 - -29) / 50);
        ++field8751;
        return ~(256 & arg1) != -1;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z[Ljava/lang/String;II[S)V", line = 146)
    public static final void method3489(boolean arg0, String[] arg1, int arg2, int arg3, short[] arg4) {
        if (!arg0) {
            field8754 = 64;
        }
        if (~arg3 < ~arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            String var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg2; ~arg3 < ~var9; ++var9) {
                if (var7 == null || arg1[var9] != null && (1 & var9) > arg1[var9].compareTo(var7)) {
                    String var10 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method3489(true, arg1, arg2, var6 + -1, arg4);
            method3489(true, arg1, var6 + 1, arg3, arg4);
        }
        ++field8756;
    }
}
