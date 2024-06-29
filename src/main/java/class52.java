import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class52 extends class198 {

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Ljava/lang/String;")
    public static String field699 = "Mechscape is loading - please wait...";

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lma;")
    public static class202 field703 = new class202(new byte[5000]);

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Z")
    public static boolean field709 = false;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "[I")
    public static int[] field710 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field708 = 0;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZII)I")
    public static final int method311(boolean arg0, int arg1, int arg2) {
        ++field701;
        if (!arg0) {
            field708 = -29;
        }
        if (~arg1 == 1) {
            return 12345678;
        } else if (~arg1 == 0) {
            if (~arg2 <= -3) {
                if (~arg2 < -127) {
                    arg2 = 126;
                }
            } else {
                arg2 = 2;
            }
            return arg2;
        } else {
            int var3 = (127 & arg1) * arg2 >> 7;
            if (~var3 <= -3) {
                if (var3 > 126) {
                    var3 = 126;
                }
            } else {
                var3 = 2;
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lma;I)Ljava/lang/String;")
    public static final String method312(class202 arg0, int arg1) {
        ++field706;
        return arg1 != 1 ? null : class11.method59(arg0, 32767, (byte) -61);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field705;
            int[] var3 = super.field3134.method36(arg1, 30672);
            if (super.field3134.field69) {
                int var4 = class42.field591[arg1];
                for (int var5 = 0; ~class42.field590 < ~var5; ++var5) {
                    var3[var5] = this.method313(false, var4, class152.field2367[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZII)I")
    private final int method313(boolean arg0, int arg1, int arg2) {
        ++field707;
        if (arg0) {
            return 80;
        } else {
            int var4 = arg1 * 57 + arg2;
            int var5 = var4 ^ var4 << 1;
            return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V")
    public static final void method314(int arg0) {
        ++field700;
        if (arg0 >= -60) {
            field699 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public static void method315(byte arg0) {
        field703 = null;
        int var1 = -89 % ((arg0 - -36) / 36);
        field710 = null;
        field699 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIILjk;IJ)Z")
    public static final boolean method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class276 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class227.method1576(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }
}
