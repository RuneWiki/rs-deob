import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class320 {

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Lqe;")
    public static class469 field4521 = new class469(25, 8);

    @OriginalMember(owner = "client!en", name = "f", descriptor = "[I")
    public static int[] field4526 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method2023(boolean arg0) {
        if (arg0) {
            class80.field1136 = class277.field3946;
            class582.field8287 = class46.field568;
        } else {
            class80.field1136 = class375.field5686;
            class582.field8287 = class531.field7566;
        }
        class409.field6165 = class80.field1136.length;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZIII)Lmba;", line = 28)
    public static final class421 method2024(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4523++;
        class421 var5 = new class421();
        var5.field6285 = arg0;
        var5.field6282 = arg4;
        class291.field4168.method2278((byte) -20, (long) arg3, var5);
        if (arg2 != 0) {
            method2026(83, -87, 120, 30, null);
        }
        class516.method3048(arg4, -100);
        class46 var6 = class405.method2580(arg3, arg2 ^ 0x3F);
        if (var6 != null) {
            class673.method3850(var6, (byte) 105);
        }
        if (class625.field8742 != null) {
            class673.method3850(class625.field8742, (byte) 88);
            class625.field8742 = null;
        }
        class693.method3938(35);
        if (var6 != null) {
            class256.method1679(var6, 0, !arg1);
        }
        if (!arg1) {
            class709.method4037(arg4);
        }
        if (!arg1 && class87.field1249 != -1) {
            class127.method894(class87.field1249, 1, 8558);
        }
        return var5;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 72)
    public static void method2025(byte arg0) {
        field4521 = null;
        if (arg0 == -14) {
            field4526 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIILma;)Z", line = 86)
    public static final boolean method2026(int arg0, int arg1, int arg2, int arg3, class12 arg4) {
        field4525++;
        if (!class24.field247 || !class587.field8325) {
            return false;
        } else if (class357.field5193 < 100) {
            return false;
        } else if (class361.method2249(arg3, 30, arg2, arg1)) {
            int var5 = arg2 << class459.field6769;
            int var6 = arg3 << class459.field6769;
            int var7 = class582.field8287[arg1].method1787(arg2, 19646, arg3) - 1;
            int var8 = arg4.method315((byte) 106) + var7;
            if (arg4.field168 == 1) {
                if (!class167.method1224(var5, var6, var8, var5, (byte) 102, var5, var8, var7, class504.field7164 + var6, var6)) {
                    return false;
                } else if (class167.method1224(var5, class504.field7164 + var6, var8, var5, (byte) -40, var5, var7, var7, var6 + class504.field7164, var6)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field168 == 2) {
                if (!class167.method1224(var5 + class504.field7164, class504.field7164 + var6, var8, var5, (byte) 103, var5, var8, var7, class504.field7164 + var6, class504.field7164 + var6)) {
                    return false;
                } else if (class167.method1224(class504.field7164 + var5, class504.field7164 + var6, var7, var5, (byte) -58, var5 + class504.field7164, var8, var7, class504.field7164 + var6, class504.field7164 + var6)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field168 == 4) {
                if (!class167.method1224(var5 + class504.field7164, var6, var8, class504.field7164 + var5, (byte) 106, var5 + class504.field7164, var8, var7, class504.field7164 + var6, var6)) {
                    return false;
                } else if (class167.method1224(class504.field7164 + var5, class504.field7164 + var6, var8, class504.field7164 + var5, (byte) 109, var5 + class504.field7164, var7, var7, class504.field7164 + var6, var6)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field168 == 8) {
                if (!class167.method1224(var5 + class504.field7164, var6, var8, var5, (byte) 104, var5, var8, var7, var6, var6)) {
                    return false;
                } else if (class167.method1224(class504.field7164 + var5, var6, var7, var5, (byte) -15, class504.field7164 + var5, var8, var7, var6, var6)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field168 == 16) {
                if (class81.method653((byte) 127, class631.field8819 + var6, var8, class631.field8819, var5, class631.field8819, var7)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field168 == 32) {
                if (class81.method653((byte) 126, class631.field8819 + var6, var8, class631.field8819, class631.field8819 + var5, class631.field8819, var7)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (arg4.field168 != 64) {
                if (arg0 < 38) {
                    field4526 = null;
                }
                if (arg4.field168 != 128) {
                    return true;
                } else if (class81.method653((byte) 126, var6, var8, class631.field8819, var5, class631.field8819, var7)) {
                    class406.field6142++;
                    return true;
                } else {
                    return false;
                }
            } else if (class81.method653((byte) 126, var6, var8, class631.field8819, class631.field8819 + var5, class631.field8819, var7)) {
                class406.field6142++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIB)I", line = 211)
    public static final int method2027(int arg0, int arg1, byte arg2) {
        field4524++;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        double var5 = Math.log((double) arg1) / Math.log(2.0D);
        if (arg2 != -9) {
            field4521 = null;
        }
        double var7 = var5 + (var3 - var5) * Math.random();
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }
}
